package Java.AST.Loops;

import Java.AST.Expr.Expr;
import Java.AST.Node;
import Java.AST.QueryStmt.Statement;
import Java.SymbolTable.Symbol;

import java.util.List;

public class PrintGrammer extends LoopStatement {

            private Expr expr;
            private Increase_and_decrease incre_and_decr;
            private Symbol symbol;

    public void setSymbol(Symbol symbol) {
        this.symbol = symbol;
    }

    public Symbol getSymbol() {
        return symbol;
    }

    public void setExpr(Expr expr) {
        this.expr = expr;
    }

    public void setIncre_and_decr(Increase_and_decrease incre_and_decr) {
        this.incre_and_decr = incre_and_decr;
    }
}
