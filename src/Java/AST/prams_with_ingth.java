package Java.AST;

import Java.AST.Expr.Expr;
import Java.AST.Node;
import Java.AST.Parms;

public class prams_with_ingth extends Node {

    private char oparter = '=';
    private int value;
    private Expr expr;

    public void setValue(int value){ this.value=value;}
    public int getValue(){ return this.value=value; }

    public void setExpr(Expr expr) {
        this.expr = expr;
    }
}
