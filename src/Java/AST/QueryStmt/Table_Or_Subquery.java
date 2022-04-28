package Java.AST.QueryStmt;

import Java.AST.Visitor.ASTVisitor;

import java.util.List;

public class Table_Or_Subquery extends Statement {
    private Database_Name database_name;
    private Table_Name table_name;
    private Table_Alias table_alias;
    private Index_Name index_name;
    private List<Table_Or_Subquery>table_or_subquery;
    private Join_Clause join_clause;
    private SelectStmt selectStmt;



    public void setDatabase_name(Database_Name database_name) {
        this.database_name = database_name;
    }

    public Database_Name getDatabase_name() {
        return database_name;
    }

    public void setTable_name(Table_Name table_name) {
        this.table_name = table_name;
    }

    public Table_Name getTable_name() {
        return table_name;
    }

    public void setTable_alias(Table_Alias table_alias) {
        this.table_alias = table_alias;
    }

    public Table_Alias getTable_alias() {
        return table_alias;
    }

    public void setIndex_name(Index_Name index_name) {
        this.index_name = index_name;
    }

    public Index_Name getIndex_name() {
        return index_name;
    }

    public void setTable_or_subquery(List<Table_Or_Subquery> table_or_subquery) {
        this.table_or_subquery = table_or_subquery;
    }

    public List<Table_Or_Subquery> getTable_or_subquery() {
        return table_or_subquery;
    }

    public void setSelectStmt(SelectStmt selectStmt) {
        this.selectStmt = selectStmt;
    }

    public SelectStmt getSelectStmt() {
        return selectStmt;
    }

    public void setJoin_clause(Join_Clause join_clause) {
        this.join_clause = join_clause;
    }

    public Join_Clause getJoin_clause() {
        return join_clause;
    }

    @Override
    public void accept(ASTVisitor astVisitor){

        astVisitor.visit(this);
        if(this.database_name!=null)
            this.database_name.accept(astVisitor);

        if(this.table_name!=null)
            this.table_name.accept(astVisitor);

        if(this.table_alias!=null)
            this.table_alias.accept(astVisitor);

        if(this.index_name!=null)
            this.index_name.accept(astVisitor);

        if(this.table_or_subquery!=null)
            this.table_or_subquery.forEach(table_or_subquery1 -> table_or_subquery1.accept(astVisitor));

        if(this.selectStmt!=null)
            this.selectStmt.accept(astVisitor);

        if(this.join_clause!=null)
            this.join_clause.accept(astVisitor);
    }
}
