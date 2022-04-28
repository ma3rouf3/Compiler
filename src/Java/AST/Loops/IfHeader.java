package Java.AST.Loops;

import Java.AST.Expr.Expr;
import Java.AST.Node;

import java.util.ArrayList;
import java.util.List;

public class IfHeader extends Node {

    private List<Expr> expr= new ArrayList<Expr>();

    public void setExpr(List<Expr> expr) {
        this.expr = expr;
    }


}
