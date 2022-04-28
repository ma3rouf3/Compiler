package Java.AST.Loops;

import Java.AST.QueryStmt.Statement;
import Java.SymbolTable.Scope;

import java.util.ArrayList;
import java.util.List;

public class Foreach extends LoopStatement {

        List<LoopStatement> statements= new ArrayList<>();
        LoopStatement statement;
        ForeachHeader header;
        Scope scope;


    @Override
    public void setScope(Scope scope) {
        this.scope = scope;
    }

    @Override
    public Scope getScope() {
        return scope;
    }

    public void setStatements(List<LoopStatement> statements) {
        this.statements = statements;
    }

    public void setStatement(LoopStatement statement) {
        this.statement = statement;
    }

    public void setHeader(ForeachHeader header) {
        this.header = header;
    }


    public List<LoopStatement> getStatements() {
        return statements;
    }

    public ForeachHeader getHeader() {
        return header;
    }
}
