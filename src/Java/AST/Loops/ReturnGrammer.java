package Java.AST.Loops;

import Java.AST.Expr.Expr;
import Java.AST.Node;
import generated.SQLParser;

public class ReturnGrammer extends LoopStatement {

            private IFoneline iFoneline;
            private Expr expr;
            private Increase_and_decrease inrcAndDeces;


    public void setiFoneline(IFoneline iFoneline) {
        this.iFoneline = iFoneline;
    }

    public void setExpr(Expr expr) {
        this.expr = expr;
    }

    public void setInrcAndDeces(Increase_and_decrease inrcAndDeces) {
        this.inrcAndDeces = inrcAndDeces;
    }
}
