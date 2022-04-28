package Java.AST.QueryStmt;

import Java.AST.Expr.Expr;
import Java.AST.Visitor.ASTVisitor;

public class Ordering_Terms extends Statement {
    Expr  expr;
    String Collation_name;

    public void setExpr(Expr expr) {
        this.expr = expr;
    }

    public Expr getExpr() {
        return expr;
    }

    public void setCollation_name(String collation_name) {
        Collation_name = collation_name;
    }

    public String getCollation_name() {
        return Collation_name;
    }

    @Override
    public void accept(ASTVisitor astVisitor){

        astVisitor.visit(this);
        if(this.expr!=null)
            this.expr.accept(astVisitor);
    }
}
