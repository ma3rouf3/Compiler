package Java.AST.Loops;

import Java.SymbolTable.Scope;
import sun.rmi.log.LogInputStream;

import java.util.ArrayList;
import java.util.List;

public class IF_ElseGrammer extends LoopStatement {

            private List<IfGrammer> ifelse = new ArrayList<IfGrammer>();
            private List<LoopStatement> statements= new ArrayList<LoopStatement>();
            private LoopStatement statement;
             private Scope scope;


    public void setScope(Scope scope) {
        this.scope = scope;
    }

    public Scope getScope() {
        return scope;
    }


    public void setIfelse(List<IfGrammer> ifelse) {
        this.ifelse = ifelse;
    }

    public void setStatements(List<LoopStatement> statements) {
        this.statements = statements;
    }

    public void setStatement(LoopStatement statement) {
        this.statement = statement;
    }
}
