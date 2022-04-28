package Java.SymbolTable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Type {

    private String name;
    private Map<String, Type> columns = new HashMap<String, Type>();
    public List<String> colunms_name = new ArrayList<>();

    public final static String NUMBER_CONST = "number";
    public final static String STRING_CONST = "string";
    public final static String BOOLEAN_CONST = "boolean";


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<String, Type> getColumns() {
        return columns;
    }

    public void setColumns(Map<String, Type> columns) {
        this.columns = columns;
    }

    public void add_Colunms(String name,Type type){
        this.columns.put(name,type);
    }
    public void pr()
    {
        System.out.println("type  ttttttttttttt:  "+ this.name);
    }

    public  Boolean is_equel(Type t){

        if(this.getName().equals(t.getName()))
        {
            return true;
        }
        return false;
    }
    public void equle(Type r)
    {
        this.setName(r.getName());
        this.setColumns(r.getColumns());
    }

}
