package Java.SymbolTable;

import Java.Main;
import org.omg.CORBA.WStringSeqHelper;
import org.omg.CORBA.WStringSeqHolder;
import org.omg.CosNaming._BindingIteratorImplBase;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.MalformedInputException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class Scope {
    public static File errorFile = new File("samples//errorFile.txt");
    public static FileWriter myWriter;

    static {
        try {
            myWriter = new FileWriter("samples//error1File.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private  int id;
    private String Scope_name;
    private Scope parent;
//    private int son_num;
  //  private ArrayList<Scope> children = new ArrayList<>();
    private Map<String, Symbol> symbolMap = new LinkedHashMap<String, Symbol>();

    public void generate_id()
    {
        int e;
    //  e = getParent().getId()+1;
        e= Main.symbolTable.get_last_Scope()+1;
     //   System.out.println("scope id =  "+ e);
        this.setId(e);

    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Boolean serach_in_perant1(String anyname)
    {
        if(!this.getSymbolMap().containsKey(anyname))
        {
            this.getParent().serach_in_perant1(anyname);
            System.out.println();
            System.out.println("errrrrrrrrrrrrrrrror : ");
            System.out.println("this varible : "+ anyname + "   is undeclared varible");

        }
        else {
            return true;
        }

        return false;
    }


    public boolean serach_in_perant(String anyname){
        int  i=this.getParent().getId();

        if(!this.getSymbolMap().containsKey(anyname) )
        {
         //   System.out.println("if 1 : "+i);
            while(i>0)
            {
                // System.out.println("1  : "+ i);
                i=this.getParent().getId();
                if(this.getParent().getSymbolMap().containsKey(anyname) ) {
                    if (this.getParent().getSymbolMap().get(anyname).getType().getName()==null)
                    {
                        System.out.println("useing unassigned varialbe   :  "+ this.getParent().getSymbolMap().get(anyname).getName() );
                        try {
                            myWriter.write("Error  :  \n");
                            myWriter.write("useing unassigned varialbe  :  "+ anyname);
                           myWriter.write("\n");
                            myWriter.write("   ");
                            myWriter.write("___________________________________________________________________\n");
                            //  myWriter.close();
                            myWriter.flush();
                            //    System.out.println("Successfully wrote to the file.");
                        } catch (IOException e) {
                            System.out.println("An error occurred.");
                            e.printStackTrace();
                        }
                    }
                        return true;
                }
            //    System.out.println("3");
                i-=1;
            }

            System.out.println();
            System.out.println("errrrrrrrrrrrrrrrror : ");
            //System.out.println("this varible : "+ anyname + "   is undeclared varible");
            try {
                myWriter.write("Error  :  \n");
                myWriter.write("this varible : "+ anyname + "   is undeclared varible  \n");
                myWriter.write("\n");
                myWriter.write("   ");
                myWriter.write("___________________________________________________________________\n");
                //  myWriter.close();
                myWriter.flush();
                //    System.out.println("Successfully wrote to the file.");
            } catch (IOException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }

        }
        else{
            return true;
        }
        return false;

        // Main.symbolTable.serch_type();

    }

    public boolean have_type(String name){
       if(this.getSymbolMap().containsKey(name))
       {
           if(this.getSymbolMap().get(name).getType().getName() != null)
           {
              // System.out.println("33"+this.getSymbolMap().get(name).getType().getName());
               return true;
           }
           else
               return false;
       }
        return false;


    }

    public boolean search_in_perant_symbol(String anyname)
    {
        if(this.getId()==0)
        {
//            System.out.println("id = 0");
            return false;
        }
       else if(this.getParent().have_type(anyname))
        {
          //  System.out.println("true  ,,,");

            return true;
        }
       else {
            this.getParent().search_in_perant_symbol(anyname);
           // System.out.println("zzzzzzzzz");
            return false;
        }
    }

    public boolean search_is_symbol(String s, String v) {
        Symbol symbol = new Symbol();
        // System.out.println("s  = "+s);
        // System.out.println("v  = "+v);
       /*
        if(this.getSymbolMap().containsKey(s))
        {
            // symbol = this.getSymbolMap().get(s);
             return  true;
        }
        return  false;
        */

        //  int i = this.getParent().getId();
        if (this.getId() == 0) {
            System.out.println("id= 0 ");
            return false;
        } else if (this.getSymbolMap().containsKey(s)) {
            this.getSymbolMap().get(s).getType().setName(v);
            //symbol.getType().setName(v);
            System.out.println("add type  gggg");
            return true;
        } else {
            System.out.println("fupppp");
            this.getParent().search_is_symbol(s, v);
            // System.out.println("not add type fu");
            return false;
        }
    }

    public boolean same_type(String var,String type){
        if(this.getSymbolMap().get(var).getType().getName().equals(type))
        {
            System.out.println("same type");
            return true;
        }
        return false;
    }

    public boolean search_in_perant_symbol_if_same_type(String var , String type)
    {
        if(this.getId()==0)
        {
            //System.out.println("id = 000");
            return false;
        }
        else if(this.getParent().same_type(var , type))
        {
          //  System.out.println("true  ppp");
            return true;
        }
        else {
            this.getParent().same_type(var , type );
          //  System.out.println("cccccccfalse");
            return false;
        }
    }


    public Scope perant_(int i)
    {
        return this.getParent();
    }


          // return false;
      /*
        else
        {


            //   System.out.println("if 1 : "+i);
            while(i>0)
            {
                // System.out.println("1  : "+ i);
               // i=this.getParent().getId();
                if(this.getParent().getSymbolMap().containsKey(s) )
                {
                    //      System.out.println("2 : "+ i);
                    symbol = this.getSymbolMap().get(s);
                    symbol.getType().setName(v);
                    return true;
                }
                //    System.out.println("3");
                i-=1;
            }
           // System.out.println();
              System.out.println("add type to  : "+ s);
            System.out.println("this varible : "+ s + "   ");

        }*/
      //  return false;




    public void setScope_name(String scope_name) {
        Scope_name = scope_name;
    }

    public String getScope_name() {
        return Scope_name;
    }

    public Scope getParent() {
        return parent;
    }

    public void setParent(Scope parent) {
        this.parent = parent;
    }

    public Map<String, Symbol> getSymbolMap() {
        return symbolMap;
    }

//    public void setChildren(ArrayList<Scope> childerns) {
//        this.children = childerns;
//    }
//
//    public ArrayList<Scope> getChildren() {
//        return children;
//    }

    public void setSymbolMap(Map<String, Symbol> symbolMap) {
        this.symbolMap = symbolMap;
    }
    public void addSymbol(String name, Symbol symbol) {
        this.symbolMap.put(name,symbol);
    }





}
