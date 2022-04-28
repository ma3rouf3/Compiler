package Java.AST;

import Java.AST.function.JavaFunctionBody;
import Java.AST.function.JavaFunctionHeader;
import com.sun.org.apache.bcel.internal.generic.ANEWARRAY;

import java.util.ArrayList;
import java.util.List;

public class FunctionDeclarationList extends Node {

  //  private JavaFunctionHeader header ;
//    private JavaFunctionBody body;
      private List<FunctionDeclaration> function = new ArrayList<>();
    private String Name;
    private String listName;

    public void setListName(String listName) {
        this.listName = listName;
    }

    public void setName(String name){
        this.Name=name;
    }
    /*
    public void SetHeader(JavaFunctionHeader headerF){ this.header= headerF; }

    public void SetBody(JavaFunctionBody bodyF){ this.body= bodyF;}

    public JavaFunctionHeader getHeader(){ return this.header;}

    public JavaFunctionBody getBody(){ return this.body; }
*/
}