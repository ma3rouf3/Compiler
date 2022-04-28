package Java.AST.function;

import Java.AST.FunctionDeclaration;
import Java.AST.Loops.LoopStatement;
import Java.AST.Node;
import Java.AST.QueryStmt.Statement;

import java.util.ArrayList;
import java.util.List;

public class JavaFunctionBody extends Node {

  //  private  FunctionBody Body;
    private List<LoopStatement> statementList = new ArrayList<LoopStatement>();
 //   private List<Statement> statements =new ArrayList<Statement>();

 //   private char Open='{';
  //  private char Close = '}';

    public void setStatement(List<LoopStatement> statement) {
        this.statementList = statement;
    }

    public void add(LoopStatement statement){ this.add(statement); }

   /* public void setStatements(List<Statement> statements) {
        this.statements = statements;
    }
*/
   // public void setBody(FunctionBody body) {
   //     Body = body;
    //}

}
