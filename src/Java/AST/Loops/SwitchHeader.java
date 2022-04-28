package Java.AST.Loops;

import Java.AST.Expr.Expr;
import Java.AST.Node;

public class SwitchHeader extends Node {


           private Expr expr;
           private String condition;


    public void setCondition(String condition) {
        this.condition = condition;
    }
}
