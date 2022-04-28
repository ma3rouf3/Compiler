package Java.AST.QueryStmt;

import java.util.ArrayList;
import java.util.List;

public class AlterStmt extends  Statement{

    String name;
    Database_Name database_name;
    Table_Constraint table_constraint= new Table_Constraint();

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setDatabase_name(Database_Name database_name) {
        this.database_name = database_name;
    }

    public Database_Name getDatabase_name() {
        return database_name;
    }

    public void setTable_constraint(Table_Constraint table_constraint) {
        this.table_constraint = table_constraint;
    }

    public Table_Constraint getTable_constraint() {
        return table_constraint;
    }

}
