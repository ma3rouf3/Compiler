package Java.AST.Expr;

import java.util.List;

public class LeftExpr extends Expr {


    private int value;
    private  String variable;
    private Var var;

    public void setVariable(String variable) {
        this.variable = variable;
    }

    @Override
    public void setVar(Var var) {
        super.setVar(var);
    }

    public void setValue(int value) {
        this.value = value;
    }
}
