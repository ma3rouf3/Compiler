package Java.AST.QueryStmt;

import Java.AST.Visitor.ASTVisitor;


import java.util.ArrayList;
import java.util.List;

public class Join_Clause extends Statement {
        private List<Table_Or_Subquery>table_or_subquery = new ArrayList<>();
        private List<Join_Operator> join_operator = new ArrayList<>();
        private List<Join_Constraints> join_constraints = new ArrayList<>();
        public String first_table;
        public String sec_table;
        public String join_oper;

    public void setJoin_oper(String join_oper) {
        this.join_oper = join_oper;
    }

    public String getJoin_oper() {
        return join_oper;
    }

    public void setFirst_table(String first_table) {
        this.first_table = first_table;
    }

    public void setSec_table(String sec_table) {
        this.sec_table = sec_table;
    }

    public String getFirst_table() {
        return first_table;
    }

    public String getSec_table() {
        return sec_table;
    }


    public void setTable_or_subquery(List<Table_Or_Subquery> table_or_subquery) {
        this.table_or_subquery = table_or_subquery;
    }

    public List<Table_Or_Subquery> getTable_or_subquery() {
        return table_or_subquery;
    }

    public void setJoin_operator(List<Join_Operator> join_operator) {
        this.join_operator = join_operator;
    }

    public List<Join_Operator> getJoin_operator() {
        return join_operator;
    }


    public void setJoin_constraints(List<Join_Constraints> join_constraints) {
        this.join_constraints = join_constraints;
    }

    public List<Join_Constraints> getJoin_constraints() {
        return join_constraints;
    }

    @Override
    public void accept(ASTVisitor astVisitor){
        astVisitor.visit(this);

        if(this.table_or_subquery!=null)
            this.table_or_subquery.forEach(table_or_subquery1 -> table_or_subquery1.accept(astVisitor));
        if(this.join_operator!=null)
            this.join_operator.forEach(join_operator1 -> join_operator1.accept(astVisitor));
        if(join_constraints!=null)
            this.join_constraints.forEach(join_constraints1 -> join_constraints1.accept(astVisitor));
    }
}
