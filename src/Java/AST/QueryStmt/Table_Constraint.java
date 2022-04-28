package Java.AST.QueryStmt;

public class Table_Constraint extends Statement {
    String PrimaryKey;
    String ForgainKey;
    String Unique;
    String name;


    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }


    public void setForgainKey(String forgainKey) {
        ForgainKey = forgainKey;
    }

    public void setPrimaryKey(String primaryKey) {
        PrimaryKey = primaryKey;
    }

    public void setUnique(String unique) {
        Unique = unique;
    }

    public String getUnique() {
        return Unique;
    }

    public String getPrimaryKey() {
        return PrimaryKey;
    }

    public String getForgainKey() {
        return ForgainKey;
    }

}
