package Java.AST.Loops;

import Java.AST.Expr.Expr;
import Java.AST.QueryStmt.Statement;
import Java.SymbolTable.Scope;
import generated.SQLParser;

import java.util.ArrayList;
import java.util.List;

public class ForGarmmer extends LoopStatement {

    private List<LoopStatement> loopStatementList=new ArrayList<LoopStatement>();
    private List<Statement> statements;
    private LoopStatement statement;
    private String variable_name ;
    private Expr condition;
    private Expr Update;
    private Scope scope;


    public void setScope(Scope scope) {
        this.scope = scope;
    }

    public Scope getScope() {
        return scope;
    }


    public void setExpr(Expr expr) { this.Update = expr;}

    public  Expr  getExpr(){return this.Update;}

    public void setLoopStatementList(List<LoopStatement> loopStatementList) {
        this.loopStatementList = loopStatementList;
    }

    public void setStatement(LoopStatement statement) {
        this.statement = statement;
    }
}
