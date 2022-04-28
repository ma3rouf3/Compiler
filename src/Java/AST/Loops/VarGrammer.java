package Java.AST.Loops;

import Java.AST.Expr.Expr;
import Java.AST.Node;
import Java.AST.QueryStmt.Statement;
import Java.SymbolTable.Symbol;
import Java.SymbolTable.Type;
import org.antlr.v4.codegen.model.Loop;

import java.util.ArrayList;
import java.util.List;

public class VarGrammer extends LoopStatement {
        VarInilt varInilt;
      /*  LoopStatement loopStatement= new LoopStatement();
        Statement statement =new Statement();
        List<Expr> exprs =new ArrayList<>();
        IFoneline iFoneline;
        Symbol symbol;
        Type type;*/


    public void setVarInilt(VarInilt varInilt) {
        this.varInilt = varInilt;
    }

    public VarInilt getVarInilt() {
        return varInilt;
    }
/*
    public void setType(Type type) {
        this.type = type;
    }

    public Type getType() {
        return type;
    }

    public void setSymbol(Symbol symbol) {
        this.symbol = symbol;
    }

    public Symbol getSymbol() {
        return symbol;
    }

    public void setLoopStatement(LoopStatement loopStatement) {
        this.loopStatement = loopStatement;
    }

    public void setStatement(Statement statement) {
        this.statement = statement;
    }

    public void setiFoneline(IFoneline iFoneline) {
        this.iFoneline = iFoneline;
    }

    public void setExprs(List<Expr> exprs) {
        this.exprs = exprs;
    }
    */
}

