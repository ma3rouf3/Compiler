package Java.AST.QueryStmt;

import Java.AST.Expr.Expr;
import Java.AST.Visitor.ASTVisitor;
import Java.SymbolTable.Type;

import java.util.ArrayList;
import java.util.List;

public class Result_Columns extends Statement {
    Table_Name table_name;
//    Column_Alias column_alias;
    Expr expr;
    Type type;
    List<String> func_name= new ArrayList<>();
    String STAR;
    String column_aliae;


    public void setColumn_aliae(String column_aliae) {
        this.column_aliae = column_aliae;
    }

    public String getColumn_aliae() {
        return column_aliae;
    }

    public void setSTAR(String STAR) {
        this.STAR = STAR;
    }

    public String getSTAR() {
        return STAR;
    }

    public void setFunc_name(List<String> func_name) {
        this.func_name = func_name;
    }

    public List<String> getFunc_name() {
        return func_name;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Type getType() {
        return type;
    }

    public void setTable_name(Table_Name table_name) {
        this.table_name = table_name;
    }

    public Table_Name getTable_name() {
        return table_name;
    }

//    public void setColumn_alias(Column_Alias column_alias) {
//        this.column_alias = column_alias;
//    }
//
//    public Column_Alias getColumn_alias() {
//        return column_alias;
//    }

    public void setExpr(Expr expr) {
        this.expr = expr;
    }

    public Expr getExpr() {
        return expr;
    }

    @Override
    public void accept(ASTVisitor astVisitor){

        astVisitor.visit(this);
        if(this.table_name!=null)
            this.table_name.accept(astVisitor);
//        if(this.column_alias!=null)
//            this.column_alias.accept(astVisitor);
        if(this.expr!=null)
            this.expr.accept(astVisitor);
    }
}
