package Java.AST.Expr;

import Java.AST.Node;

import java.util.ArrayList;
import java.util.List;

public  class Expr extends Node {


        private Var var = new Var();
        private List<LeftExpr> leftExpr = new ArrayList<LeftExpr>();
        private List<RightExpr> rightExpr= new ArrayList<RightExpr>();
        private String operator;
        private Expr expr;
        String type;
        String coumn_name;

    public void setCoumn_name(String coumn_name) {
        this.coumn_name = coumn_name;
    }


    public String getCoumn_name() {
        return coumn_name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setLeftExpr(List<LeftExpr> leftExpr) {
        this.leftExpr = leftExpr;
    }

    public void setRightExpr(List<RightExpr> rightExpr) {
        this.rightExpr = rightExpr;
    }

    public void setVar(Var var) {
        this.var = var;
    }

    public Var getVar() {
        return var;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    // public void addVar(Var v){  this.var.add(v); }

    public void addLeftExpr(LeftExpr leftExpr){ this.leftExpr.add(leftExpr); }

    public void addRigthExpr(RightExpr rightExpr){ this.rightExpr.add(rightExpr); }

    public List<LeftExpr> getLeftExpr() {
        return leftExpr;
    }

    public List<RightExpr> getRightExpr() {
        return rightExpr;
    }


   // public List<Var> getVar() {
     //   return var;
    //}
}
