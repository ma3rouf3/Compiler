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
import Java.AST.function.JavaFunctionBody;
import Java.AST.function.JavaFunctionHeader;

import java.beans.Expression;

public class BaseASTVisitor implements ASTVisitor {
    @Override
    public void visit(Parse p) {
        System.out.println("ast parse ");
    }

    @Override
    public void visit(FunctionDeclaration funcDec) {
        System.out.println("ast FunctionDeclaration ");

    }

    @Override
    public void visit(Statement stmt) {
        System.out.println("ast Statement ");

    }

    @Override
    public void visit(SelectStmt selectStmt) {
        System.out.println("ast selectStmt ");

    }

    @Override
    public void visit(FunctionDeclarationList functionDeclarationList)
    {
        System.out.println("ast FunctionDeclarlaration List");
    }
    @Override
    public void visit(JavaFunctionHeader javaFunctionHeader)
    {
        System.out.println("Ast JavaFunctionHeader");


    }
    @Override
    public void visit(JavaFunctionBody javaFunctionBody)
    {
        System.out.println("ast Java FunctionBody");
    }
    @Override
    public void visit(LoopStatement loopStatement)
    {
        System.out.println("ast LoopStatement");
    }
    @Override
    public void visit(WhileGrammer whileGrammer)
    {
        System.out.println("ast whileGrammer");
    }
    @Override
    public void visit(WhileHeader whileHeader)
    {
        System.out.println("ast whileHeader");
    }
    @Override
    public void visit(WhileBody whileBody)
    {
        System.out.println("ast WhileBody");
    }
    @Override
    public void visit(DoWhileGrammer dogWhileGrammer)
    {
        System.out.println("ast DoWhileGrmmer");
    }
    @Override
    public void visit(SwitchGrammer switchGrammer)
    {
        System.out.println("ast SwitchGrammer");
    }
    @Override
    public void visit(SwitchHeader switchHeader)
    {
        System.out.println("ast SwitchHeader");
    }
    @Override
    public void visit(CaseGrammer caseGrammer)
    {
        System.out.println("ast CaseGramer");
    }
    @Override
    public void visit(DefaultGrammer defaultGrammer)
    {
        System.out.println("ast DefauleGrammer");
    }
    @Override
    public void visit(VarGrammer varGrammer)
    {
        System.out.println("ast VarGramemr");
    }
    @Override
    public void visit(IFoneline iFoneline)
    {
        System.out.println("ast IfOneLineGrammer");
    }
    @Override
    public void visit(Expr expr)
    {
        System.out.println("ast Expr");
    }
    @Override
    public void visit(Var var)
    {
        System.out.println("ast var");
    }
    @Override
    public void visit(Join join)
    {
        System.out.println("ast Join Grammer");
    }

}
