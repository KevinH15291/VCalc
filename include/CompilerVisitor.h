#pragma once

#include "Type.h"
#include "VCalcBaseVisitor.h"

namespace vcalc {
class CompilerVisitor : public VCalcBaseVisitor {
   public:
    std::any visitFile(VCalcParser::FileContext* ctx) final;
    std::any visitStatement(VCalcParser::StatementContext* ctx) final;
    std::any visitRange_e(VCalcParser::Range_eContext* ctx) final;
    std::any visitEquality_e(VCalcParser::Equality_eContext* ctx) final;
    std::any visitComp_e(VCalcParser::Comp_eContext* ctx) final;
    std::any visitID_e(VCalcParser::ID_eContext* ctx) final;
    std::any visitIndex_e(VCalcParser::Index_eContext* ctx) final;
    std::any visitDomain_e(VCalcParser::Domain_eContext* ctx) final;
    std::any visitParens_e(VCalcParser::Parens_eContext* ctx) final;
    std::any visitInt_e(VCalcParser::Int_eContext* ctx) final;
    std::any visitAddSub_e(VCalcParser::AddSub_eContext* ctx) final;
    std::any visitMulDivMod_e(VCalcParser::MulDivMod_eContext* ctx) final;
    std::any visitDomain(VCalcParser::DomainContext* ctx) final;
    std::any visitGenerator(VCalcParser::GeneratorContext* ctx) final;
    std::any visitFilter(VCalcParser::FilterContext* ctx) final;
    std::any visitIf(VCalcParser::IfContext* ctx) final;
    std::any visitLoop(VCalcParser::LoopContext* ctx) final;
    std::any visitDecl(VCalcParser::DeclContext* ctx) final;
    std::any visitAssign(VCalcParser::AssignContext* ctx) final;
    std::any visitPrint(VCalcParser::PrintContext* ctx) final;

   private:
    std::map<std::string, Type> ids_;
};

}  // namespace vcalc