package Java.AST.Loops;

import Java.SymbolTable.Scope;

public class DoWhileGrammer extends LoopStatement {

      private WhileHeader header;
      private WhileBody body;
     // private String Name;
     private Scope scope;


    public void setScope(Scope scope) {
        this.scope = scope;
    }

    public Scope getScope() {
        return scope;
    }


    public void setHeader(WhileHeader header) {
        this.header = header;
    }

    public void setBody(WhileBody body) {
        this.body = body;
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }
}
