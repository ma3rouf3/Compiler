package Java.AST.Loops;

import Java.AST.Expr.Expr;
import Java.AST.Node;

import java.util.ArrayList;
import java.util.List;

public class ArrayValue extends LoopStatement{


    private List<Expr> exprs = new ArrayList<Expr>();
    private IFoneline ifoneline= new IFoneline();

    public void setExprs(List<Expr> exprs) {
        this.exprs = exprs;
    }
}
