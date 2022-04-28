package Java.AST.QueryStmt;

import Java.AST.Expr.Expr;
import Java.AST.Visitor.ASTVisitor;
import java.util.List;

public class Select_Core extends Statement {
    private List<Result_Columns> result_columns;
    private List<Table_Or_Subquery> table_or_subquery;
    private List<Expr> expr;
    private Join_Clause join_clause;

    public void setResult_columns(List<Result_Columns> result_columns) {
        this.result_columns = result_columns;
    }

    public List<Result_Columns> getResult_columns() {
        return result_columns;
    }

    public void setTable_or_subquery(List<Table_Or_Subquery> table_or_subquery) {
        this.table_or_subquery = table_or_subquery;
    }

    public List<Table_Or_Subquery> getTable_or_subquery() {
        return table_or_subquery;
    }

    public void setExpr(List<Expr> expr) {
        this.expr = expr;
    }

    public List<Expr> getExpr() {
        return expr;
    }

    public void setJoin_clause(Join_Clause join_clause) {
        this.join_clause = join_clause;
    }

    public Join_Clause getJoin_clause() {
        return join_clause;
    }

    @Override
    public void accept(ASTVisitor astVisitor){

       astVisitor.visit(this);

       if(result_columns!=null)
           this.result_columns.forEach(result_columns1 -> result_columns1.accept(astVisitor));

       if(this.table_or_subquery!=null)
           this.table_or_subquery.forEach((table_or_subquery1 -> table_or_subquery1.accept(astVisitor)));

       if(this.expr!=null)
           this.expr.forEach(expr1 -> expr1.accept(astVisitor));
       if(this.join_clause!=null)
           this.join_clause.accept(astVisitor);

    }
    }

