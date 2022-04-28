package Java.AST.QueryStmt;

import Java.AST.Visitor.ASTVisitor;

public class Table_Name extends Statement {
    String any_name ;

    public void setAny_name(String any_name) {
        this.any_name = any_name;
    }

    public String getAny_name() {
        return any_name;
    }

    @Override
    public void accept(ASTVisitor astVisitor){
        astVisitor.visit(this);
    }
}
