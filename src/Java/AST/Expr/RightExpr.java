package Java.AST.Expr;

import java.util.List;

public class RightExpr extends Expr {

    private int value;
    private  String variable;
    private Var var;


    @Override
    public void setVar(Var var) {
        super.setVar(var);
    }

    public void setVariable(String variable) {
        this.variable = variable;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
