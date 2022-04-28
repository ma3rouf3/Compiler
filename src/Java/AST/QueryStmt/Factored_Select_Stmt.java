package Java.AST.QueryStmt;

import Java.AST.Expr.Expr;
import Java.AST.Visitor.ASTVisitor;
import Java.SymbolTable.Type;


import java.util.ArrayList;
import java.util.List;

public class Factored_Select_Stmt extends Statement{

    private String fromtable;
    private Select_Or_Value select_or_value;
    private List<Ordering_Terms>ordering_terms;
    private List<Expr> expr= new ArrayList<>();
    Type type;

    public void setType(Type type) {
        this.type = type;
    }

    public Type getType() {
        return type;
    }

    public void setSelect_or_value(Select_Or_Value select_or_value) {
        this.select_or_value = select_or_value;
    }

    public Select_Or_Value getSelect_or_value() {
        return select_or_value;
    }

    public void setOrdering_terms(List<Ordering_Terms> ordering_terms) {
        this.ordering_terms = ordering_terms;
    }

    public List<Ordering_Terms> getOrdering_terms() {
        return ordering_terms;
    }

    public void setExpr(List<Expr> expr) {
        this.expr = expr;
    }

    public List<Expr> getExpr() {
        return expr;
    }

    @Override
    public void accept(ASTVisitor astVisitor){

        astVisitor.visit(this);

        if(select_or_value!=null)
            this.select_or_value.accept(astVisitor);

        if(this.ordering_terms != null)
            this.ordering_terms.forEach(ordering_terms1 -> ordering_terms1.accept(astVisitor));

        //if(this.expr !=null)
           //this.expr.accept(astVisitor);
    }
}
