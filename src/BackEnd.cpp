#include <assert.h>

#include "BackEnd.h"

BackEnd::BackEnd() : loc_(mlir::UnknownLoc::get(&context_)) {
    // Load Dialects.
    context_.loadDialect<mlir::LLVM::LLVMDialect>();
    context_.loadDialect<mlir::arith::ArithDialect>();
    context_.loadDialect<mlir::scf::SCFDialect>();
    context_.loadDialect<mlir::cf::ControlFlowDialect>();
    context_.loadDialect<mlir::memref::MemRefDialect>(); 

    // Initialize the MLIR context 
    builder_ = std::make_shared<mlir::OpBuilder>(&context_);
    moduleOp_ = mlir::ModuleOp::create(builder_->getUnknownLoc());
    builder_->setInsertionPointToStart(moduleOp_.getBody());

    // Some intial setup to get off the ground 
    setupPrintf();
    createGlobalString("%c\0", "charFormat");
    createGlobalString("%d\0", "intFormat");
}

int BackEnd::emitModuleOp() {

    // Create a main function 
    mlir::Type intType = mlir::IntegerType::get(&context_, 32);
    auto mainType = mlir::LLVM::LLVMFunctionType::get(intType, {}, false);
    mlir::LLVM::LLVMFuncOp mainFunc = builder_->create<mlir::LLVM::LLVMFuncOp>(loc_, "main", mainType);
    mlir::Block *entry = mainFunc.addEntryBlock();
    builder_->setInsertionPointToStart(entry);



    // Get the integer format string we already created.   
    mlir::LLVM::GlobalOp formatString;
    if (!(formatString = moduleOp_.lookupSymbol<mlir::LLVM::GlobalOp>("intFormat"))) {
        llvm::errs() << "missing format string!\n";
        return 1;
    }

    // mlir::Region

    // Get the format string and print 415
    mlir::Value formatStringPtr = builder_->create<mlir::LLVM::AddressOfOp>(loc_, formatString); 
    mlir::Value intToPrint = builder_->create<mlir::LLVM::ConstantOp>(loc_, intType, 415); 
    mlir::ValueRange args = {formatStringPtr, intToPrint}; 
    mlir::LLVM::LLVMFuncOp printfFunc = moduleOp_.lookupSymbol<mlir::LLVM::LLVMFuncOp>("printf"); 
    builder_->create<mlir::LLVM::CallOp>(loc_, printfFunc, args);

    // Return 0
    mlir::Value zero = builder_->create<mlir::LLVM::ConstantOp>(loc_, intType, builder_->getIntegerAttr(intType, 0));
    builder_->create<mlir::LLVM::ReturnOp>(builder_->getUnknownLoc(), zero);    
    
    moduleOp_->dump();

    if (mlir::failed(mlir::verify(moduleOp_))) {
        moduleOp_.emitError("moduleOp failed to verify");
        return 1;
    }
    return 0;
}

int BackEnd::lowerDialects() {
    // Set up the MLIR pass manager to iteratively lower all the Ops
    mlir::PassManager pm(&context_);

    // Lower SCF to CF (ControlFlow)
    pm.addPass(mlir::createConvertSCFToCFPass());

    // Lower Arith to LLVM
    pm.addPass(mlir::createArithToLLVMConversionPass());

    // Lower MemRef to LLVM
    pm.addPass(mlir::createFinalizeMemRefToLLVMConversionPass());

    // Lower CF to LLVM
    pm.addPass(mlir::createConvertControlFlowToLLVMPass());

    // Finalize the conversion to LLVM dialect
    pm.addPass(mlir::createReconcileUnrealizedCastsPass());

    // Run the passes
    if (mlir::failed(pm.run(moduleOp_))) {
        llvm::errs() << "Pass pipeline failed\n";
        return 1;
    }
    return 0;
}

void BackEnd::dumpLLVM(std::ostream &os) {  
    // The only remaining dialects in our moduleOp after the passes are builtin
    // and LLVM. Setup translation patterns to get them to LLVM IR.
    mlir::registerBuiltinDialectTranslation(context_);
    mlir::registerLLVMDialectTranslation(context_);
    llvm_module_ = mlir::translateModuleToLLVMIR(moduleOp_, llvm_context_);

    // Create llvm ostream and dump into the output file
    llvm::raw_os_ostream output(os);
    output << *llvm_module_;
}

void BackEnd::setupPrintf() {
    // Create a function declaration for printf, the signature is:
    //   * `i32 (ptr, ...)`
    mlir::Type intType = mlir::IntegerType::get(&context_, 32);
    auto ptrTy = mlir::LLVM::LLVMPointerType::get(&context_);
    auto llvmFnType = mlir::LLVM::LLVMFunctionType::get(intType, ptrTy,
                                                        /*isVarArg=*/true);

    // Insert the printf function into the body of the parent moduleOp.
    builder_->create<mlir::LLVM::LLVMFuncOp>(loc_, "printf", llvmFnType);
}

void BackEnd::createGlobalString(const char *str, const char *stringName) {

    mlir::Type charType = mlir::IntegerType::get(&context_, 8);

    // create string and string type
    auto mlirString = mlir::StringRef(str, strlen(str) + 1);
    auto mlirStringType = mlir::LLVM::LLVMArrayType::get(charType, mlirString.size());

    builder_->create<mlir::LLVM::GlobalOp>(loc_, mlirStringType, /*isConstant=*/true,
                            mlir::LLVM::Linkage::Internal, stringName,
                            builder_->getStringAttr(mlirString), /*alignment=*/0);
    return;
}