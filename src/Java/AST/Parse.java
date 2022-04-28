package Java.AST;

import Java.AST.QueryStmt.Statement;
import Java.AST.Visitor.ASTVisitor;

import javax.swing.text.html.StyleSheet;
import java.util.ArrayList;
import java.util.List;

public class Parse extends Node{
    private List<Statement> sqlStmts = new ArrayList<Statement>();
    private List<FunctionDeclaration> functions = new ArrayList<FunctionDeclaration>();
    private Error error;
    public void addQuery(Statement query){
        this.sqlStmts.add(query);
    }

    public void setSqlStmts(List<Statement> sqlStmts) {
        this.sqlStmts = sqlStmts;
    }

    public void addFunction (FunctionDeclaration function){ this.functions.add(function); }

    public void setFunctions(List<FunctionDeclaration> functions) {
        this.functions = functions;
    }

    public void setError(Error error) {
        this.error = error;
    }

    public List<Statement> getSqlStmts() {
        return sqlStmts;
    }

    public List<FunctionDeclaration> getFunctions() {
        return functions;
    }

    @Override
    public String toString(){
        for (int i=0 ; i<sqlStmts.size(); i++)
        {
            System.out.println("sql stmts = "+ getSqlStmts().get(i).getName());
            //  System.out.println("  size : "+sqlStmts.size());
        }

            return "";
     //   return "sql stmts = "+ getSqlStmts().get(0).getName();
    }

    public String toStringfun(){
      //  for (int i=0 ; i<functions.size();i++)
        //{
          //  System.out.println("functions = "+ getFunctions().get(i).getName());
       // }
        return "functions = "+ getFunctions().get(0).getName();
    //return "";
    }

    @Override
    public void accept(ASTVisitor astVisitor){
        astVisitor.visit(this);
//        this.sqlStmts.forEach( stmt -> stmt.accept(astVisitor));
        if(sqlStmts!=null)
        for(int i = 0 ; i < this.sqlStmts.size() ; i++){
            this.sqlStmts.get(i).accept(astVisitor);
        }
        for (int j=0 ; j<this.functions.size(); j++)
        {
            this.accept(astVisitor);
        }
    }



}
