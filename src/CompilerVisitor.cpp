#include "CompilerVisitor.h"

namespace vcalc {

std::any CompilerVisitor::visitFile(VCalcParser::FileContext *ctx) {
    return visitChildren(ctx);
}

std::any CompilerVisitor::visitStatement(VCalcParser::StatementContext *ctx) {
    return visitChildren(ctx);
}

std::any CompilerVisitor::visitRange_e(VCalcParser::Range_eContext *ctx) {
    return visitChildren(ctx);
}

std::any CompilerVisitor::visitEquality_e(VCalcParser::Equality_eContext *ctx) {
    return visitChildren(ctx);
}

std::any CompilerVisitor::visitComp_e(VCalcParser::Comp_eContext *ctx) {
    return visitChildren(ctx);
}

std::any CompilerVisitor::visitID_e(VCalcParser::ID_eContext *ctx) {
    return visitChildren(ctx);
}

std::any CompilerVisitor::visitIndex_e(VCalcParser::Index_eContext *ctx) {
    auto lhs = std::any_cast<Type>(visit(ctx->expr(0)));
    if (lhs.kind_ != Type::Kind::VECTOR) throw std::runtime_error("Left hand side of index expression must be a vector");
    auto rhs = std::any_cast<Type>(visit(ctx->expr(1)));
    if (rhs.kind_ != Type::Kind::INT) throw std::runtime_error("Right hand side of index expression must be an integer");
    // should change to not return type and instead store metadata 
    return Type { .kind_ = Type::Kind::INT }; 
}

std::any CompilerVisitor::visitDomain_e(VCalcParser::Domain_eContext *ctx) {
    return visitChildren(ctx);
}

std::any CompilerVisitor::visitParens_e(VCalcParser::Parens_eContext *ctx) {
    return visitChildren(ctx);
}

std::any CompilerVisitor::visitInt_e(VCalcParser::Int_eContext *ctx) {
    return visitChildren(ctx);
}

std::any CompilerVisitor::visitAddSub_e(VCalcParser::AddSub_eContext *ctx) {
    return visitChildren(ctx);
}

std::any CompilerVisitor::visitMulDivMod_e(VCalcParser::MulDivMod_eContext *ctx) {
    return visitChildren(ctx);
}

std::any CompilerVisitor::visitDomain(VCalcParser::DomainContext *ctx) {
    return visitChildren(ctx);
}

std::any CompilerVisitor::visitGenerator(VCalcParser::GeneratorContext *ctx) {
    return visitChildren(ctx);
}

std::any CompilerVisitor::visitFilter(VCalcParser::FilterContext *ctx) {
    return visitChildren(ctx);
}

std::any CompilerVisitor::visitIf(VCalcParser::IfContext *ctx) {
    return visitChildren(ctx);
}

std::any CompilerVisitor::visitLoop(VCalcParser::LoopContext *ctx) {
    return visitChildren(ctx);
}

std::any CompilerVisitor::visitDecl(VCalcParser::DeclContext *ctx) {
    return visitChildren(ctx);
}

std::any CompilerVisitor::visitAssign(VCalcParser::AssignContext *ctx) {
    return visitChildren(ctx);
}

std::any CompilerVisitor::visitPrint(VCalcParser::PrintContext *ctx) {
    return visitChildren(ctx);
}

}  // namespace vcalc