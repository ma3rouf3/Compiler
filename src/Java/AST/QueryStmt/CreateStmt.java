package Java.AST.QueryStmt;

import java.util.ArrayList;
import java.util.List;

public class CreateStmt extends Statement{

    Statement statement;
    String name;
    Database_Name database_name;
    Table_Name table_name;
    List<Column_Def> column_def;
    Table_Constraint table_constraint;
    List<Table_Constraint> table_constraints= new ArrayList<>();


    public void setTable_constraints(List<Table_Constraint> table_constraints) {
        this.table_constraints = table_constraints;
    }

    public List<Table_Constraint> getTable_constraints() {
        return table_constraints;
    }

    public void setTable_constraint(Table_Constraint table_constraint) {
        this.table_constraint = table_constraint;
    }

    public Table_Constraint getTable_constraint() {
        return table_constraint;
    }

    public void setColumn_def(List<Column_Def> column_def) {
        this.column_def = column_def;
    }

//    public void setColumn_def(Column_Def column_def) {
//        this.column_def = column_def;
//    }

    public List<Column_Def> getColumn_def() {
        return column_def;
    }

    public void setTable_name(Table_Name table_name) {
        this.table_name = table_name;
    }

    public Table_Name getTable_name() {
        return table_name;
    }

    public void setDatabase_name(Database_Name database_name) {
        this.database_name = database_name;
    }

    public Database_Name getDatabase_name() {
        return database_name;
    }

    public void setStatement(Statement statement) {
        this.statement = statement;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public Statement getStatement() {
        return statement;
    }

    @Override
    public String getName() {
        return name;
    }
}
