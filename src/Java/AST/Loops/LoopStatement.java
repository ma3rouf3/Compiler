package Java.AST.Loops;

import Java.AST.Node;
import Java.AST.QueryStmt.Statement;
import Java.SymbolTable.Scope;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

public class LoopStatement extends Node {

    private String Name;

    List<LoopStatement> loopStatementlist= new ArrayList<LoopStatement>();
    List<Statement> statement = new ArrayList<Statement>();
    Scope scope= new Scope();



    public void setLoopStatementlist(List<LoopStatement> loopStatementlist) {
        this.loopStatementlist = loopStatementlist;
    }

    public void setStatement(List<Statement> statement) {
       this.statement = statement;
    }


    public void add(Statement statement){ this.statement.add(statement); }

    public void setName(String name) {
        Name = name;
    }

    public List<Statement> getStatement(){
        return this.statement;
    }

    public String getName(){  return this.Name; }

    public void setScope(Scope scope) {
        this.scope = scope;
    }

    public Scope getScope() {
        return scope;
    }
}
