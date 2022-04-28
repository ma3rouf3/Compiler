package Java.AST.QueryStmt;

import Java.AST.Expr.Expr;

public class DeleteStmt extends Statement {

        private String K_from,K_where;
        private Expr expr;

    public void setK_from(String k_from) {
        K_from = k_from;
    }

    public void setK_where(String k_where) {
        K_where = k_where;
    }
}
