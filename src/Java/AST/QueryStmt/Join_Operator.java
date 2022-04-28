package Java.AST.QueryStmt;

import Java.AST.Visitor.ASTVisitor;

public class Join_Operator extends Statement {
    private String K_LEFT;
   private String K_OUTER;
    private String K_INNER;
    private String K_JOIN;

    public void setK_LEFT(String k_LEFT) {
        K_LEFT = k_LEFT;
    }

    public String getK_LEFT() {
        return K_LEFT;
    }

    public void setK_INNER(String k_INNER) {
        K_INNER = k_INNER;
    }

    public String getK_INNER() {
        return K_INNER;
    }

    public void setK_JOIN(String k_JOIN) {
        K_JOIN = k_JOIN;
    }

    public String getK_JOIN() {
        return K_JOIN;
    }

    public void setK_OUTER(String k_OUTER) {
        K_OUTER = k_OUTER;
    }

    public String getK_OUTER() {
        return K_OUTER;
    }

    @Override
    public void accept(ASTVisitor astVisitor){
        astVisitor.visit(this);
    }
}
