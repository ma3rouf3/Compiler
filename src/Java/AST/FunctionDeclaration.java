package Java.AST;

import Java.AST.Visitor.ASTVisitor;
import Java.AST.function.JavaFunctionBody;
import Java.AST.function.JavaFunctionHeader;
import Java.SymbolTable.Scope;

public class FunctionDeclaration extends Node {

    private JavaFunctionHeader header ;
    private JavaFunctionBody body;
      private String Name;
    private Scope scope;


    public void setScope(Scope scope) {
        this.scope = scope;
    }

    public Scope getScope() {
        return scope;
    }

    public void setName(String name){
          this.Name=name;
      }

   public void SetHeader(JavaFunctionHeader headerF){ this.header= headerF; }

    public void SetBody(JavaFunctionBody bodyF){ this.body= bodyF;}

    public JavaFunctionHeader getHeader(){ return this.header;}

    public JavaFunctionBody getBody(){ return this.body; }

    public String getName() {
        return Name;
    }

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        if (header!=null)    {
            header.accept(astVisitor);
        }
        if(body!=null)
        {
            body.accept(astVisitor);
        }


        //super.accept(astVisitor);
    }
}