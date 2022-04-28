package Java.SymbolTable;


import Java.Main;

import java.util.*;

public class Symbol {

    private String name;
    private Type type;
    private Scope scope;
    private boolean isParam;


  public Symbol(){
      this.type = new Type();
  }

    public String getName() {
        return name;
    }

    public Type getType() {
        return type;
    }

    public Scope getScope() {
        return scope;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public void setScope(Scope scope) {
        this.scope = scope;
    }

    public boolean getIsParam() {
        return isParam;
    }

    public void setIsParam(boolean param) {
        isParam = param;
    }

    public Map<String, Type> flat(Type type)
    {
        Map<String, Type> beforeflat= type.getColumns();
        Map<String, Type> afterflat= new HashMap<>();
        Map<String, Type> current= new HashMap<>();
        String nameType;
        ArrayList<String> s= new ArrayList<String>();
        Set keys = beforeflat.keySet();
        Iterator i = keys.iterator();
        while (i.hasNext()) {
            for (int j = 0; j < beforeflat.size(); j++) {
                s.add(i.next().toString());
//                System.out.println("index =  "+j+ "value   =  "+s.get(j));
            }
//            System.out.println(s);
          //  System.out.println("********************");

        }
//        Type test = new Type();
//        test=type.getColumns().get("Address");
       // System.out.println("colunm n   : "+test.getName());

        //  for(int j=0;j<Main.symbolTable.getDeclaredTypes().size();j++)

        //  for(int j=0;j<Main.symbolTable.getDeclaredTypes().size();j++)
        //  {
        //    System.out.println("declar  :  "+Main.symbolTable.getDeclaredTypes().get(j).getName());
        for(int k=0;k<beforeflat.size();k++)
        {
//            System.out.println("column  in for :  "+type.getColumns().get(s.get(k)).getName());
//            System.out.println("s  in for :  "+s.get(k));
            if(type.getColumns().get(s.get(k)).getName().equals("Number"))
            //if(Main.symbolTable.getDeclaredTypes().get(j).getColumns().get(s.get(k)).getName().equals("Number"))
            {
//                System.out.println();

//                System.out.println("s[k]  : "+" k==  "+k +"  "+ s.get(k));
//                System.out.println( "number");
                current.put(s.get(k), type.getColumns().get(s.get(k))) ;
//                System.out.println("key N  : "+current.keySet() + " type N  "+current.get(s.get(k)).getName());


            }
            if(type.getColumns().get(s.get(k)).getName().equals("String"))
            //  if(Main.symbolTable.getDeclaredTypes().get(j).getColumns().get(s.get(k)).getName().equals("String"))
            {
//                System.out.println("s[k]  : "+" k==  "+k +"  "+ s.get(k));
//                System.out.println( "string");
                current.put(s.get(k), type.getColumns().get(s.get(k))) ;
//                System.out.println("key S  : "+current.keySet() + " type S  "+current.get(s.get(k)).getName());

            }
            if(type.getColumns().get(s.get(k)).getName().equals("Boolean"))
//                        if(Main.symbolTable.getDeclaredTypes().get(j).getColumns().get(s.get(k)).getName().equals("Boolean"))
            {
//                System.out.println("s[k]  : "+" k==  "+k +"  "+ s.get(k));
//                System.out.println( "boolean");
                current.put(s.get(k), type.getColumns().get(s.get(k))) ;
            }
            if( !type.getColumns().get(s.get(k)).getName().equals("Number")  && !type.getColumns().get(s.get(k)).getName().equals("String")  && !type.getColumns().get(s.get(k)).getName().equals("Boolean"))
            // if(!Main.symbolTable.getDeclaredTypes().get(j).getColumns().get(s.get(k)).getName().equals("Boolean") && !Main.symbolTable.getDeclaredTypes().get(j).getColumns().get(s.get(k)).getName().equals("String")  && !Main.symbolTable.getDeclaredTypes().get(j).getColumns().get(s.get(k)).getName().equals("Number") )
            {


//                System.out.println("name :  "+afterflat.get("id"));
                nameType = type.getColumns().get(s.get(k)).getName();
                Main.symbolTable.getFlat().add(nameType);
                Main.symbolTable.getFlat().add(s.get(k));

//                System.out.println("s[k]  : "+" k==  "+k +"  "+ s.get(k));
//                System.out.println( "none  = "+nameType);

                for(int j = 0; j< Main.symbolTable.getDeclaredTypes().size(); j++)
                    if(Main.symbolTable.getDeclaredTypes().get(j).getName().equals(nameType))
                    {
//                        System.out.println("helloo");
                        afterflat= Main.symbolTable.getDeclaredTypes().get(j).getColumns();
//                                        type.getColumns().get(s.get((k))).getColumns();


                    }
            }


        }
//        System.out.println("curren flat func =   "+current);
//        System.out.println("after flat func  =  "+afterflat);

        Map<String , Type> final_falt = new HashMap<>();
        final_falt.putAll( afterflat);
        final_falt.putAll(current);
//        System.out.println("final falt  func  =  "+final_falt);

        return final_falt;
    }















}
