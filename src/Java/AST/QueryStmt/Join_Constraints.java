package Java.AST.QueryStmt;

import Java.AST.Expr.Expr;
import Java.AST.Visitor.ASTVisitor;

public class Join_Constraints extends Statement {
    Expr expr;

    public void setExpr(Expr expr) {
        this.expr = expr;
    }

    public Expr getExpr() {
        return expr;
    }

    @Override
    public void accept(ASTVisitor astVisitor){

        astVisitor.visit(this);
        if(this.expr!=null)
            this.expr.accept(astVisitor);
    }
}
