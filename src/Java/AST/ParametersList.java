package Java.AST;


import java.util.ArrayList;
import java.util.List;

public class ParametersList extends Node {

    private List<Parms> parms= new ArrayList<Parms>();
    private List<prams_with_ingth > prams_with_ingths = new ArrayList<>();
   // private List<Expr> Expr = new ArrayList<Expr>();
  //  private Parms parms= new Parms();
   // private Expr Exp = new Expr();


    public void add(Parms p){
        this.parms.add(p);
    }

    public void addd(prams_with_ingth p){
        this.prams_with_ingths.add(p);
    }

    public void setPrams_with_ingths(List<prams_with_ingth> prams_with_ingths) {
        this.prams_with_ingths = prams_with_ingths;
    }

    public void setParms(List<Parms> parms) {
        this.parms=parms;
    }


   // public void setExpr(List<Expr> expr) {
     //   this.Expr = expr;
   // }



    public List<Parms> getParms() {
        return parms;
    }

    public List<prams_with_ingth> getPrams_with_ingths() {
        return prams_with_ingths;
    }
}
