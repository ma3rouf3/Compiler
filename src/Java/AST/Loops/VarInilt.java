package Java.AST.Loops;

import Java.AST.Expr.Expr;
import Java.AST.QueryStmt.Statement;
import Java.SymbolTable.Type;

import java.util.ArrayList;
import java.util.List;

public class VarInilt extends LoopStatement {
    String name;
    String  value;
    String type;
    IFoneline iFoneline;
    Statement statement =new Statement();
    List<Expr> exprs =new ArrayList<>();
    Type type_select;



    public void setType_select(Type type_select) {
        this.type_select = type_select;
    }

    public Type getType_select() {
        return type_select;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setValue(String  value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setiFoneline(IFoneline iFoneline) {
        this.iFoneline = iFoneline;
    }

    public IFoneline getiFoneline() {
        return iFoneline;
    }

    public void setStatement(Statement statement) {
        this.statement = statement;
    }

    public void setExprs(List<Expr> exprs) {
        this.exprs = exprs;
    }



}
