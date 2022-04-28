package Java.AST.Expr;

import Java.AST.Node;

public class Var extends Node {


    private String variable;
    private double value;
    private String operator;
    private String kewword;
   //private String comper;
    String type;

    String func_name;
    public void setFunc_name(String func_name) {
        this.func_name = func_name;
    }

    public String getFunc_name() {
        return func_name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setVariable(String variable) {
        this.variable = variable;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public String getVariable() {
        return variable;
    }

    public double getValue() {
        return value;
    }

}
