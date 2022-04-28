package Java.AST.QueryStmt;

import Java.AST.Visitor.ASTVisitor;

public class Column_Alias extends Statement {
    String IDENTIFIER;

    public void setCollation_name(String IDENTIFIER) {
        IDENTIFIER = IDENTIFIER;
    }

    public String getCollation_name() {
        return IDENTIFIER;
    }

    @Override
    public void accept(ASTVisitor astVisitor){
        astVisitor.visit(this);

    }
}
