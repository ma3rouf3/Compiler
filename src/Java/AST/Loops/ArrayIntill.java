package Java.AST.Loops;

import Java.AST.Expr.Expr;

import java.util.ArrayList;
import java.util.List;

public class ArrayIntill extends  LoopStatement {


        private List<Expr> exprs = new ArrayList<Expr>();


    public void setExprs(List<Expr> exprs) {
        this.exprs = exprs;
    }
}
