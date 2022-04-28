package Java.AST.Loops;

import Java.AST.Node;
import Java.SymbolTable.Scope;

import java.util.ArrayList;
import java.util.List;

public class CaseGrammer extends Node {

       private List<LoopStatement> statements= new ArrayList<LoopStatement>();
       private String KCase;
       private String KBreak;
       private Scope scope;


       public void setScope(Scope scope) {
              this.scope = scope;
       }



       public void setStatements(List<LoopStatement> statements) {
              this.statements = statements;
       }

       public void setKCase(String KCase) {
              this.KCase = KCase;
       }

       public void setKBreak(String KBreak) {
              this.KBreak = KBreak;
       }
}
