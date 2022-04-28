package Java.AST.Loops;

import Java.AST.QueryStmt.Statement;
import Java.SymbolTable.Scope;

import java.util.ArrayList;
import java.util.List;

public class SwitchGrammer extends  LoopStatement {

        private List<LoopStatement> loopStatements= new ArrayList<LoopStatement>();
        private List<CaseGrammer> caseGrammer= new ArrayList<CaseGrammer>();
        private LoopStatement statement= new LoopStatement();
       // private String name;
         private String fromItem;
         private Scope scope;


    public void setScope(Scope scope) {
        this.scope = scope;
    }

    public Scope getScope() {
        return scope;
    }



    public void setLoopStatements(List<LoopStatement> statement) {
        this.loopStatements = statement;
    }

    public void setCaseGrammer(List<CaseGrammer> caseGrammer) {
        this.caseGrammer = caseGrammer;
    }


    public void setStatement(LoopStatement statement) {
        this.statement= statement;
    }

    public void add(LoopStatement statement){ this.loopStatements.add(statement); }

    public void add(CaseGrammer caseGrammer) {
        this.caseGrammer.add(caseGrammer);
    }

    public void setFromItem(String fromItem) {
        this.fromItem = fromItem;
    }

}
