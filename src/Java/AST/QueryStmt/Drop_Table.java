package Java.AST.QueryStmt;

public class Drop_Table  extends Statement{

    public boolean ifExists =false;
    public String dataBaseName;
    public String tableName;


    public void set_dataBaseName(String dataBaseName) {
        this.dataBaseName = dataBaseName;
    }

    public void set_tableName(String tableName) {
        this.tableName = tableName;
    }

    public String get_dataBaseName() {
        return dataBaseName;
    }

    public String get_tableName() {
        return tableName;
    }

}
