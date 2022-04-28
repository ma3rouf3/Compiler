package Java.AST.Loops;

import Java.AST.Node;
import Java.AST.QueryStmt.Statement;
import com.sun.corba.se.spi.monitoring.StatisticMonitoredAttribute;
import generated.SQLParser;

import java.util.ArrayList;
import java.util.List;

public class WhileBody extends Node {

     private List<LoopStatement> loopStatementList =new ArrayList<LoopStatement>();
 //    private List<Statement> statements;
    private  LoopStatement loopStatement =new LoopStatement();
     private String K_Conitnue;


    public void setLoopStatement(LoopStatement loopStatement) {
        this.loopStatement = loopStatement;
    }

    public void setLoopStatementList(List<LoopStatement> loopStatementList) {
          this.loopStatementList = loopStatementList;
     }

    public void setK_Conitnue(String k_Conitnue) {
        K_Conitnue = k_Conitnue;
    }

    public String getK_Conitnue() {
        return K_Conitnue;
    }
}
