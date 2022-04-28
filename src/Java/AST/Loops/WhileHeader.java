package Java.AST.Loops;

import Java.AST.Expr.Expr;
import Java.AST.FunctionDeclaration;
import Java.AST.Node;

import java.util.List;

public class WhileHeader extends Node {


    private Expr leftexpr;
    private Expr rightexpr;
    private WhileCompaer whileCompaer;
    private FunctionDeclaration function;

    private boolean value;


    public void setExpr(Expr expr) {
        this.leftexpr = expr;
    }

    public void setRightexpr(Expr rightexpr) {
        this.rightexpr = rightexpr;
    }

}
