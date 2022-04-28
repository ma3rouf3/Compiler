package Java.SymbolTable;

import java.util.ArrayList;
import java.util.List;


public class SymbolTable {


    private ArrayList<Scope> scopes = new ArrayList<Scope>();

    private ArrayList<Type> declaredTypes = new ArrayList<Type>();
    private ArrayList<AggregationFunction> declaredAggregationFunction = new ArrayList<AggregationFunction>();


//    private HashMap<String ,String>type_path= new HashMap<>();
    private List<String> type =new ArrayList<>();
    private List<String> path =new ArrayList<>();
    private List<Boolean> accpet= new ArrayList<>();

    private List<String> condition = new ArrayList<>();
    private List<String> flat= new ArrayList<>();

    public void setFlat(List<String> flat) {
        this.flat = flat;
    }

    public List<String> getFlat() {
        return flat;
    }

    public void setCondition(List<String> condition) {
        this.condition = condition;
    }

    public List<String> getCondition() {
        return condition;
    }

    public void setAccpet(List<Boolean> accpet) {
        this.accpet = accpet;
    }

    public List<Boolean> getAccpet() {
        return accpet;
    }

    public void setType(List<String> type) {
        this.type = type;
    }

    public void setPath(List<String> path) {
        this.path = path;
    }

    public List<String> getPath() {
        return path;
    }

    public List<String> getType() {
        return type;
    }


//    public void add_type_path(String type , String path  ){
//
//        this.type_path.put(type,path);
//    }

//    public void setType_path(HashMap<String, String> type_path) {
//        this.type_path = type_path;
//    }
//
//    public HashMap<String, String> getType_path() {
//        return type_path;
//    }


    public ArrayList<Scope> getScopes() {
        return scopes;
    }

    public void setScopes(ArrayList<Scope> scopes) {
        this.scopes = scopes;
    }

    public ArrayList<Type> getDeclaredTypes() {
        return declaredTypes;
    }

    public void setDeclaredTypes(ArrayList<Type> declaredTypes) {
        this.declaredTypes = declaredTypes;
    }


    public void addScope(Scope scope){ this.scopes.add(scope); }
    public void addType(Type type){
        this.declaredTypes.add(type);
    }
    public int get_last_Scope()
    {
       //  System.out.println("size =  :"+ this.scopes.size());
        Scope t =  this.scopes.get(this.scopes.size()-1);
       // System.out.println("id scope in symbol tabel  :  " +t.getId());
        return t.getId();
    }
    public Scope get_last_Scope_is_open()
    {
      //  System.out.println(this.scopes.get(this.scopes.size()-1).getId());
        Scope t =  this.scopes.get(this.scopes.size()-1);
   //      System.out.println("id scope in symbol tabel  :  " +t.getId());
      //  System.out.println(this.scopes.get(this.scopes.size()-1).getId());
        return t;
    }

    public Type get_first_type(){

        return this.declaredTypes.remove(0);
    }

    public Type asr_type_x(String x)
    {
        Type t= new Type();
        ArrayList<Type> Types = new ArrayList<Type>();

        for (int i=0 ; i<this.scopes.size()-1 ; i++)
        {
            Type temp = new Type();
            temp = this.get_first_type();
            if(x!=temp.getName())
            {
                Types.add(temp);
            }
            else
                return temp ;

        }
            return null;
    }

    public Type asf_type1(Type type){

        Type t= new Type();
        int x;
        if(this.declaredTypes.contains(type))
        {
            System.out.println("11111111111111");
            type.pr();
            x=this.declaredTypes.indexOf(type);

            // t=this.declaredTypes.get(x);
          //  t.equel(this.declaredTypes.get(x));
            t.pr();
            this.declaredTypes.add(x,t);
            return t;
        }
        return null;
    }





    public boolean search_in_tables(String column_name){

        for (int i=0 ; i<this.getDeclaredTypes().size() ; i++)
        {
            if(this.getDeclaredTypes().get(i).getColumns().containsKey(column_name))
            {
                System.out.println("this column in tabel  :"+ this.getDeclaredTypes().get(i).getName());
                return true;
            }

        }
        System.out.println("errrrrrrrrrrrrrrrror : ");
        System.out.println("this colums don't hava table undeclared column   :"+ column_name );
        return  false;
    }    /*   for search in all table if the column parameter are in any table of this tables     */

    public boolean search_in_table(String table_name){
            for(int i=0 ; i<this.declaredTypes.size() ; i++)
            {
                if(this.getDeclaredTypes().get(i).getName().equals(table_name))
                {
                    //System.out.println("accept table ");
                    return true;
                }
//                System.out.println("name  na:  "+this.declaredTypes.get(i).getName());
//                System.out.println("name  ss:  "+table_name);
            }
            System.out.println("errrrrrrrrrrrrrrrror : ");
            System.out.println("the tabel  :   "+ table_name + "   is undeclared  !! ");
            return false;
    }

    public Type search_type_of_column(String  table_name , String column_name) {
        for (int i = 0; i < this.declaredTypes.size(); i++)
        {
//            System.out.println("type size  = "+this.declaredTypes.size());
//         System.out.println("table paramter   = "+ table_name);
//         System.out.println("column paramter   = "+ column_name);

         if (this.declaredTypes.get(i).getName().equals(table_name))
            {
//                System.out.println(this.declaredTypes.get(i).getName()+"===="+table_name);
               if( this.declaredTypes.get(i).getColumns().containsKey(column_name) )
               {
//                   System.out.println("sssssss");
                 return  this.declaredTypes.get(i).getColumns().get(column_name);
               }
               //  this.declaredTypes.get(table_name).getColumns(table_name,null);
            }
        }
    return null;
    }
    public boolean column_in_table(String table_name ,String column_name)
    {
        for (int i = 0; i < this.declaredTypes.size(); i++)
        {
//            System.out.println("type size  = "+this.declaredTypes.size());
//         System.out.println("table paramter   = "+ table_name);
//         System.out.println("column paramter   = "+ column_name);

            if (this.declaredTypes.get(i).getName().equals(table_name))
            {
//                System.out.println(this.declaredTypes.get(i).getName()+"===="+table_name);
                if( this.declaredTypes.get(i).getColumns().containsKey(column_name) )
                {
//                   System.out.println("sssssss");
                    return  true;
                }
                else
                    return false;
                //  this.declaredTypes.get(table_name).getColumns(table_name,null);
            }
        }
        return false;
    }



}
