package Java.AST;

public class Parms extends Node {

     private String name;
     private String keyWord;
     private char oparter = '=';
     private int value;

     public void setName(String name){
         this.name=name;
     }

    public void setKeyWord(String keyWord){
         this.keyWord="Var";
    }

    public void setValue(int value){ this.value=value;}

    public String getName(){ return this.name; }

    public String getKeyWord(){ return this.keyWord; }

    public int getValue(){ return this.value=value; }
}
