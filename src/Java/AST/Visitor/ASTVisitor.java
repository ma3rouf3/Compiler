package Java.AST.Visitor;

import Java.AST.Expr.Expr;
import Java.AST.Expr.Var;
import Java.AST.FunctionDeclaration;
import Java.AST.FunctionDeclarationList;
import Java.AST.Loops.*;
import Java.AST.Parse;
import Java.AST.QueryStmt.Join;
import Java.AST.QueryStmt.SelectStmt;
import Java.AST.QueryStmt.Statement;
import Java.AST.function.FunctionBody;
import Java.AST.function.JavaFunctionBody;
import Java.AST.function.JavaFunctionHeader;

public interface ASTVisitor {
    public void visit(Parse p);
    public void visit(FunctionDeclaration funcDec);
    public void visit(Statement stmt);
    public void visit(SelectStmt selectStmt);

    public void visit(FunctionDeclarationList functionDeclarationList);
    public void visit(JavaFunctionBody javaFunctionBody);
    public void visit(JavaFunctionHeader javaFunctionHeader);
    public void visit(LoopStatement loopStatement);
    public void visit(WhileGrammer whileGrammer);
    public void visit(WhileHeader whileHeader);
    public void visit(WhileBody whileBody);
    public void visit(SwitchGrammer switchGrammer);
    public void visit(SwitchHeader switchHeader);
    public void visit(CaseGrammer caseGrammer);
    public void visit(DefaultGrammer defaultGrammer);
    public void visit(DoWhileGrammer doWhileGrammer);
    public void visit(VarGrammer varGrammer);
    public void visit(IFoneline iFoneline);
    public void visit(Expr expr);
    public void visit(Var var);
    public void visit(Join join);

}
