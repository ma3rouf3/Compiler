package Java.AST.Loops;

import Java.AST.QueryStmt.Statement;
import Java.SymbolTable.Scope;

public class WhileGrammer extends LoopStatement {

    private WhileHeader header;
    private WhileBody body;
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

    public WhileHeader getHeader(){
        return this.header;
    }

    public WhileBody getBody() {
        return body;
    }

}
