package Java.AST.Loops;

import Java.AST.Expr.Expr;
import Java.AST.QueryStmt.Statement;
import Java.SymbolTable.Scope;

import java.util.ArrayList;
import java.util.List;

public class IfGrammer extends LoopStatement {

    private IfHeader ifHeader;
    private List<LoopStatement> statements= new ArrayList<LoopStatement>();
    private LoopStatement statement;
    private Scope scope;


    public void setScope(Scope scope) {
        this.scope = scope;
    }

    public Scope getScope() {
        return scope;
    }


    public void setIfHeader(IfHeader ifHeader) {
        this.ifHeader = ifHeader;
    }

    public void setStatements(List<LoopStatement> statements) {
        this.statements = statements;
    }

    public void setStatement(LoopStatement statement) {
        this.statement = statement;
    }
}
