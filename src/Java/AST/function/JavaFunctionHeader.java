package Java.AST.function;

import Java.AST.FunctionDeclaration;
import Java.AST.Node;
import Java.AST.ParametersList;

public class JavaFunctionHeader extends Node {

    private String Name;
    private ParametersList ParmeterList;

  //  private char OpenBar='(';
  //  private char CloseBar=')';

   public String getName(){ return this.Name; }

   public  void setName(String name){
       this.Name=name;

   }
    public void setParmeterList(ParametersList parmeterList){this.ParmeterList=parmeterList; }


    public ParametersList getParmeterList(){ return this.ParmeterList; }
/*
    public void setOpenBar(char c){
        this.OpenBar=c;
    }
    public char getOpenBar() {
        return this.OpenBar;
    }
    public void setCloseBar(char c){
        this.OpenBar=c;
    }
    public char getCloseBar() {
        return this.OpenBar;
    }
*/
}
