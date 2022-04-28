package Java.Base;
import Java.AST.Expr.Expr;
import Java.AST.Expr.Var;
import Java.AST.*;
import Java.AST.Loops.*;
import Java.AST.QueryStmt.*;
import Java.AST.function.JavaFunctionBody;
import Java.AST.function.JavaFunctionHeader;
import Java.Main;
import Java.SymbolTable.Aggregationfunctionjar;
import Java.SymbolTable.Scope;
import Java.SymbolTable.Symbol;
import Java.SymbolTable.Type;
import generated.SQLBaseVisitor;
import generated.SQLParser;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.Error;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Stack;


public class BaseVisitor extends SQLBaseVisitor {

    public Stack<Scope> stack_scope = new Stack<>();


    public static File errorFile = new File("samples//errorFile.txt");
    public static FileWriter myWriter;

    static {
        try {
            myWriter = new FileWriter("samples//errorFile.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



    @Override public  Parse visitParse(SQLParser.ParseContext ctx) {
        System.out.println("visitParse");
        Parse p = new Parse();
        List<Statement> sqlStmts; //= visitSql_stmt_list(ctx.sql_stmt_list(0));
        List<FunctionDeclaration> function ;//= visitJava_function_declaration_List(ctx.java_function_declaration_List(0));
        Error error= new Error();
        Scope scope_p = new Scope();

        scope_p.setId(0);
        scope_p.setScope_name("Parse Scope");

        scope_p.setParent(null);

        stack_scope.push(scope_p);

        Main.symbolTable.addScope(scope_p);

        if(!ctx.sql_stmt_list().isEmpty())
        {
            for (int i=0 ;i<ctx.sql_stmt_list().size();i++)
            {
                sqlStmts = visitSql_stmt_list(ctx.sql_stmt_list(i));
                p.setLine(ctx.getStart().getLine()); //get line number
                p.setCol(ctx.getStart().getCharPositionInLine()); // get col number
                p.setSqlStmts(sqlStmts);
            }
        }

        if(!ctx.java_function_declaration_List().isEmpty())
        {
            for (int i=0; i<ctx.java_function_declaration_List().size();i++ )
            {
                function = visitJava_function_declaration_List(ctx.java_function_declaration_List(i));
                p.setLine((ctx.getStart().getLine()));
                p.setCol(ctx.getStart().getCharPositionInLine());
                p.setFunctions(function);

            }
        }

        if(ctx.error()!=null)
        {
            p.setError(visitError(ctx.error(0)));

        }


        stack_scope.pop();
        //   return (Parse) visitChildren(ctx);
        return p;
    }

    @Override public List<FunctionDeclaration> visitJava_function_declaration_List (SQLParser.Java_function_declaration_ListContext ctx)
    {
        System.out.println("visitFunctionDeclartionList");

        List<FunctionDeclaration> function=new ArrayList<FunctionDeclaration>();
        //  if(!ctx.java_function_declaration().isEmpty())


        if(!ctx.java_function_declaration().isEmpty())
            for (int i=0 ;i< ctx.java_function_declaration().size();i++)
            {
                function.add(visitJava_function_declaration(ctx.java_function_declaration(i)));
            }

        return function;
    }



    @Override public FunctionDeclaration visitJava_function_declaration(SQLParser.Java_function_declarationContext ctx) {

        System.out.println("visitFunctionDeclartion");
        FunctionDeclaration function= new FunctionDeclaration();
        //    JavaFunctionHeader header= new JavaFunctionHeader();
        //   JavaFunctionBody body=new JavaFunctionBody();
        Symbol symbol_func = new Symbol();


        Scope scope_Func = new Scope();
        //Symbol symbol= new Symbol();

        scope_Func.generate_id();
        scope_Func.setScope_name("Function Scope");

      //  scope_Func.setParent(null);
        scope_Func.setParent(stack_scope.pop());
        function.setScope(scope_Func);
        symbol_func.setScope(scope_Func);
        symbol_func.setIsParam(false);


        stack_scope.push(scope_Func.getParent());
        stack_scope.push(scope_Func);

        Main.symbolTable.addScope(scope_Func);



        if(ctx.java_function_header()!=null ) {
            // if(ctx.java_function_header()!=null)
            function.SetHeader(visitJava_function_header(ctx.java_function_header()));
        }        // header = visitJava_function_header(ctx.java_function_header());
        if(ctx.java_function_body()!=null)
        {
            function.SetBody(visitJava_function_body(ctx.java_function_body()));

        }
        // body =  visitJava_function_body(ctx.java_function_body());

            function.setName(ctx.java_function_header().any_name_without_keyword().IDENTIFIER().getSymbol().getText());


        symbol_func.setName(function.getHeader().getName());
        Main.symbolTable.get_last_Scope_is_open().addSymbol(symbol_func.getName(),symbol_func);

        stack_scope.pop();


        return function;

        // return super.visitJava_function_declaration(ctx);
    }
    @Override public JavaFunctionHeader visitJava_function_header(SQLParser.Java_function_headerContext ctx) {

        System.out.println("vistFunctionHeader");
        JavaFunctionHeader header =new JavaFunctionHeader();
        System.out.println(ctx.any_name_without_keyword().getText());

        if(ctx.any_name_without_keyword()!=null)
        {
            header.setName(ctx.any_name_without_keyword().getText());
         //   header.setParmeterList(visitParameters_list(ctx.parameters_list()));
           }
        if(ctx.parameters_list()!=null)
        {
            header.setParmeterList(visitParameters_list(ctx.parameters_list()));
        }

        return header;
        //return super.visitJava_function_header(ctx);
    }

    @Override public JavaFunctionBody visitJava_function_body (SQLParser.Java_function_bodyContext ctx)
    {
        System.out.println("vistFunctionBody");
        JavaFunctionBody body= new JavaFunctionBody();

        List<LoopStatement> loopStatements1 = new ArrayList<LoopStatement>();
        //    List<Statement> statements = new ArrayList<Statement>();


        if(ctx.list_loopStatement()!=null) {
            //   for (int i = 0; i < ctx.list_loopStatement().loopStatement().size(); i++) {
            loopStatements1= visitList_loopStatement(ctx.list_loopStatement());


            //  }
        }
        else {
            System.out.println("no list stmt");
            return null;

        }
        body.setStatement(loopStatements1);
        return body;
    }




    @Override
    public List<LoopStatement> visitList_loopStatement(SQLParser.List_loopStatementContext ctx) {
        System.out.println("visitSatementBody");

        LoopStatement loopStatement= new LoopStatement();

        List<LoopStatement> statements= new ArrayList<LoopStatement>();

        if(!ctx.loopStatement().isEmpty())
        {
            for (int i=0 ; i< ctx.loopStatement().size();i++)
            {
                // System.out.println("hello");
                //   statements= visitLoopStatement(ctx.loopStatement(i));
                statements.add(visitLoopStatement(ctx.loopStatement(i)));
            }
        }
        else
        {
            System.out.println("no Statement ");
            return null;
        }
        loopStatement.setLoopStatementlist(statements);
        return statements;


        //return super.visitList_loopStatement(ctx);
    }



    @Override
    public LoopStatement visitLoopStatement(SQLParser.LoopStatementContext ctx){

        // System.out.println("visitSatement");
        LoopStatement statements= new LoopStatement();
        Statement sql =new Statement();
     //  if(ctx.sql_stmt_list()!=null || ctx.if_else_grammer()!=null || ctx.for_grammer()!=null ||ctx.increase_and_decrease()!=null
       //   || ctx.do_while_grammer()!=null || ctx.var_grammer()!=null ||  ctx.while_grammer()!=null ||ctx.switch_grammer() !=null  )
     //  {
           if (ctx.sql_stmt_list() != null) {

               statements = (LoopStatement) visitSql_stmt_list(ctx.sql_stmt_list());
           }
           if (ctx.if_else_grammer() != null) {

               statements = visitIf_else_grammer(ctx.if_else_grammer());
           }

            if (ctx.for_grammer() != null) {

               statements = visitFor_grammer(ctx.for_grammer());
           }
            if (ctx.do_while_grammer() != null) {
               // System.out.println("Do");

               statements = visitDo_while_grammer(ctx.do_while_grammer());
           }
            if (ctx.var_grammer() != null) {

               statements = visitVar_grammer(ctx.var_grammer());
           }
            if (ctx.while_grammer() != null) {
               // System.out.println("while");

               statements = visitWhile_grammer(ctx.while_grammer());
           }
            if (ctx.switch_grammer() != null) {
               //  System.out.println("swh");

               statements = visitSwitch_grammer(ctx.switch_grammer());
           }
            if (ctx.increase_and_decrease() != null) {
               System.out.println("visit increase and decrease Grammer");

               statements = visitIncrease_and_decrease(ctx.increase_and_decrease());
           }
            if(ctx.array_value()!=null)
           {
               statements = visitArray_value(ctx.array_value());
           }
            if(ctx.array_Intill_grammer()!=null)
            {
               statements= visitArray_Intill_grammer(ctx.array_Intill_grammer());
             // System.out.println(" "+ctx.getText());//////////////////////////////////////////////////////////////
            }

            if(ctx.print_grammer()!=null)
           {   // System.out.println("visist print Grammer");
               statements= visitPrint_grammer(ctx.print_grammer());
           }
            if(ctx.foreach_grammer()!=null)
           {
               statements= visitForeach_grammer(ctx.foreach_grammer());
           }
            if(ctx.return_grammer()!=null)
            {
                statements = visitReturn_grammer(ctx.return_grammer());
            }

      // }
            else if(ctx==null)
        {
            System.out.println("no Statement in bodyloop");
           // return null;
        }


        return statements;

    }



    @Override
    public LoopStatement visitOne_loop_body(SQLParser.One_loop_bodyContext ctx) {
        System.out.println("visit One Loopstatement");
        LoopStatement loopStatement=new LoopStatement();

        if (ctx.sql_stmt_list() != null) {
            loopStatement = (LoopStatement) visitSql_stmt_list(ctx.sql_stmt_list());
        }
        if (ctx.if_else_grammer() != null) {

            loopStatement = visitIf_else_grammer(ctx.if_else_grammer());
        }
        if (ctx.increase_and_decrease() != null)
        {
            System.out.println("visit increase and decrease Grammer");
            loopStatement = visitIncrease_and_decrease(ctx.increase_and_decrease());
        }
        if(ctx.while_grammer()!=null)
        {
            loopStatement=visitWhile_grammer(ctx.while_grammer());
        }
        if(ctx.do_while_grammer()!=null)
        {
            loopStatement= visitDo_while_grammer(ctx.do_while_grammer());
        }
        if(ctx.var_grammer()!=null)
        {
            loopStatement= visitVar_grammer(ctx.var_grammer());
        }
        if(ctx.for_grammer()!=null)
        {
            loopStatement= visitFor_grammer(ctx.for_grammer());
        }
        if(ctx.print_grammer()!=null)
        {
            loopStatement = visitPrint_grammer(ctx.print_grammer());
        }
         if (ctx.switch_grammer() != null) {
            //  System.out.println("swh");
           loopStatement = visitSwitch_grammer(ctx.switch_grammer());
        }

        if(ctx.print_grammer()!=null)
        {   // System.out.println("visist print Grammer");
            loopStatement = visitPrint_grammer(ctx.print_grammer());
        }
        if(ctx.array_value()!=null)
        {
            loopStatement = visitArray_value(ctx.array_value());
        }
        if(ctx.array_Intill_grammer()!=null)
        {
           // loopStatement= visitArray_Intill_grammer(ctx.array_Intill_grammer());
            System.out.println(ctx.getText());//////////////////////////////////////////////////////////////
        }

        if(ctx.return_grammer()!=null)
        {
            loopStatement = visitReturn_grammer(ctx.return_grammer());
        }

        return loopStatement;
        //   return super.visitOne_loop_body(ctx);
    }

    @Override
    public ArrayValue visitArray_value(SQLParser.Array_valueContext ctx) {

            System.out.println("visit ArrayValue");
            ArrayValue array= new ArrayValue();
            List<Expr> expr=new ArrayList<Expr>();
            IFoneline iFoneline = new IFoneline();

            if(ctx.array_name(0)!=null)
            {
                visitArray_name(ctx.array_name(0));
            }
            if(ctx.ASSIGN(0)!=null)
            {
                System.out.println("signal : "+ctx.ASSIGN(0));
            }
            if(ctx.NUMERIC_LITERAL(0)!=null)
            {
                System.out.println(ctx.NUMERIC_LITERAL(0).getSymbol().getText());
            }
            if(ctx.any_name_without_keyword(0)!=null)
            {
                visitAny_name_without_keyword(ctx.any_name_without_keyword(0));
            }
            if(ctx.if_oneline_grammer()!=null)
            {
               iFoneline= visitIf_oneline_grammer(ctx.if_oneline_grammer());
            }
            if(ctx.java_function_call_for_loop()!=null)
            {
                visitJava_function_call_for_loop(ctx.java_function_call_for_loop());
            }
            if(ctx.expr(0)!=null){

                expr.add(visitExpr(ctx.expr(0)));
                array.setExprs(expr);
            }
            if(ctx.IDENTIFIER()!=null)
            {
                System.out.println(ctx.IDENTIFIER().getSymbol().getText());
            }
            if(ctx.true_or_false(0)!=null)
            {
                System.out.println(ctx.true_or_false(0));
            }
            if(ctx.array_name(1)!=null)
             {
                 visitArray_name(ctx.array_name(1));
             }
            if(ctx.while_signs(0)!=null){
                System.out.println("signal : "+ctx.while_signs(0));
            }
            if(ctx.expr(1)!=null){
            expr.add(visitExpr(ctx.expr(1)));
            array.setExprs(expr);
            }



        if(ctx.ASSIGN(1)!=null)
        {
            System.out.println("signal : "+ctx.ASSIGN(1));
        }
        if(!ctx.array_name().isEmpty())
        {
            for (int i=0 ; i<ctx.array_name().size() ; i++)
            {
                visitArray_name(ctx.array_name(i));
            }
        }
        if(ctx.NUMERIC_LITERAL(1)!=null)
        {
            System.out.println(ctx.NUMERIC_LITERAL(1).getSymbol().getText());
        }
        if(ctx.any_name_without_keyword(1)!=null)
        {
            visitAny_name_without_keyword(ctx.any_name_without_keyword(1));
        }
        if(ctx.expr(2)!=null){
            expr.add(visitExpr(ctx.expr(2)));
            array.setExprs(expr);
        }
        if(ctx.true_or_false(1)!=null)
        {
            System.out.println(ctx.true_or_false(1));
        }
        if(ctx.array_name(1)!=null)
        {
            visitArray_name(ctx.array_name(1));
        }
        if(ctx.while_signs(0)!=null){
            System.out.println("signal : "+ctx.while_signs(0));
        }
        if(ctx.expr(1)!=null){
            expr.add(visitExpr(ctx.expr(1)));
            array.setExprs(expr);
        }


        return array;
        //return super.visitArray_value(ctx);
    }


    @Override
    public Object visitArray_name(SQLParser.Array_nameContext ctx) {
            //System.out.println("visit array nanme");

            if(ctx.any_name_without_keyword(0)!=null)
            {
                System.out.print(ctx.any_name_without_keyword(0).IDENTIFIER().getSymbol().getText());
            }

        if(ctx.any_name_without_keyword(1)!=null) {
            System.out.println("["+ctx.any_name_without_keyword(1).IDENTIFIER().getSymbol().getText()+"]");
        }
        if(ctx.NUMERIC_LITERAL(0)!=null)
        {
            System.out.print("["+ctx.NUMERIC_LITERAL(0).getSymbol().getText()+"]");

        }

        if(ctx.any_name_without_keyword(2)!=null) {
            System.out.println("["+ctx.any_name_without_keyword(2).IDENTIFIER().getSymbol().getText()+"]");
        }
        if(ctx.NUMERIC_LITERAL(1)!=null)
        {
            System.out.println("["+ctx.NUMERIC_LITERAL(1).getSymbol().getText()+"]");

        }
        if(ctx.any_name_without_keyword(3)!=null)
        {
            System.out.print("["+ctx.any_name_without_keyword(3).IDENTIFIER().getSymbol().getText()+"]");
        }
        if(ctx.NUMERIC_LITERAL(2)!=null)
        {
            System.out.print("["+ctx.NUMERIC_LITERAL(2).getSymbol().getText()+"]");

        }
        // return super.visitArray_name(ctx);
        return null;
    }


    @Override
    public ArrayIntill visitArray_Intill_grammer(SQLParser.Array_Intill_grammerContext ctx) {
        System.out.println("visit arrayIntill Grammer");
                ArrayIntill array= new ArrayIntill();

                array.setName("var");

      if(ctx.IDENTIFIER()!=null)
      {
          System.out.println(ctx.IDENTIFIER().getSymbol().getText());
      }
      for (int i=0 ;i<ctx.any_name_without_keyword().size() ; i++) {

          if (ctx.any_name_without_keyword(i)!=null)
          {
              System.out.println("["+ctx.any_name_without_keyword(i)+"]");
          }
          if(ctx.NUMERIC_LITERAL(i)!=null)
          {
              System.out.println("["+ctx.NUMERIC_LITERAL(i)+"]");

          }
      }
        return array;
     //   return super.visitArray_Intill_grammer(ctx);
    }

    @Override
    public PrintGrammer visitPrint_grammer(SQLParser.Print_grammerContext ctx) {
        System.out.println("visit PrintGrammer");
        PrintGrammer printG = new PrintGrammer();
        String d="";
        Expr expr=new Expr();
        Increase_and_decrease increase_and_decrease=new Increase_and_decrease();
        Symbol symbol_print = new Symbol();

        symbol_print.setName(" print ");
        symbol_print.setScope(Main.symbolTable.get_last_Scope_is_open());
        symbol_print.setType(null);
        symbol_print.setIsParam(false);

        printG.setSymbol(symbol_print);
        if(ctx.K_PRINT()!=null)
        {
            printG.setName("print");
        }

        for (int i=0 ;i<ctx.printG().size();i++ )
        {
            if(ctx.printG(i).any_name()!=null)
            {
                d=ctx.printG(i).any_name().IDENTIFIER().getSymbol().getText();
                System.out.println("variaible : "+ctx.printG(i).any_name().IDENTIFIER().getSymbol().getText());
                Main.symbolTable.get_last_Scope_is_open().serach_in_perant(d);
            }
            if(ctx.printG(i).java_function_call_for_loop()!=null)
            {
                visitJava_function_call_for_loop(ctx.printG(i).java_function_call_for_loop());
            }
            if(ctx.printG(i).increase_and_decrease()!=null)
            {
               increase_and_decrease= visitIncrease_and_decrease(ctx.printG(i).increase_and_decrease());
               printG.setIncre_and_decr(increase_and_decrease);
            }
            if(ctx.printG(i).array_name()!=null)
            {
                visitArray_name(ctx.printG(i).array_name());
            }
            if(ctx.printG(i).expr()!=null)
            {
                expr= visitExpr(ctx.printG(i).expr());
                printG.setExpr(expr);
            }
        }
            return printG;
      //  return super.visitPrint_grammer(ctx);
    }

    @Override
    public IF_ElseGrammer visitIf_else_grammer(SQLParser.If_else_grammerContext ctx) {
        System.out.println("visit If_elseGrmmer ");
            IF_ElseGrammer ifelse= new IF_ElseGrammer();
            List<IfGrammer> ifGrammers= new ArrayList<IfGrammer>();
            List<LoopStatement> statements = new ArrayList<LoopStatement>();
            LoopStatement statement= new LoopStatement();
           // List< IfGrammer> ifGrammer= new ArrayList<>();


            /*
            scope_IF.setScope_name("Scope IF");
            scope_IF.setParent(stack_scope.pop());
            ifelse.setScope(scope_IF);
             scope_IF.getId();

            stack_scope.push(scope_IF.getParent());
            stack_scope.push(scope_IF);
            Main.symbolTable.addScope(scope_IF);
*/
            if(ctx.if_grammer(0)!= null )
            {

                ifGrammers.add(visitIf_grammer(ctx.if_grammer(0)));
            }
        //    for (int j=0 ; j<ctx.K_ELSE().size();j++)////// تعديل



                for (int i=1 ; i<ctx.if_grammer().size(); i++)
                {
                    if(ctx.if_grammer(i)!=null)
                    {
                    System.out.println("visit ElseGrammer");
                    ifGrammers.add(visitIf_grammer(ctx.if_grammer(i)));
               }
            }
                ifelse.setIfelse(ifGrammers);

        if(ctx.K_ELSE(ctx.K_ELSE().size()-1)!=null)
        {
           // System.out.println("sym  : "+Main.symbolTable.get_last_Scope());
            Scope scope_IF = new Scope();

            scope_IF.setScope_name("Scope else ");
            scope_IF.setParent(stack_scope.pop());
            scope_IF.generate_id();
            ifelse.setScope(scope_IF);

            stack_scope.push(scope_IF.getParent());
            stack_scope.push(scope_IF);

            Main.symbolTable.addScope(scope_IF);


        }
            if (ctx.list_loopStatement()!=null)
            {
                System.out.println("visit else Grammer body ");
                statements=visitList_loopStatement(ctx.list_loopStatement());
            }
            if(ctx.one_loop_body()!=null)
            {
                statement= visitOne_loop_body(ctx.one_loop_body());
                ifelse.setStatement(statement);
            }
        if(ctx.K_ELSE(ctx.K_ELSE().size()-1)!=null) {
            stack_scope.pop();
        }

        return ifelse;
        //return super.visitIf_else_grammer(ctx);
    }

    @Override
    public IFoneline visitIf_oneline_grammer(SQLParser.If_oneline_grammerContext ctx) {

        System.out.println("visitIF-OneLine Gramemr : " +ctx.getText());
        IFoneline iFoneline = new IFoneline();

        if(ctx.any_name_without_keyword(0)!=null)
        {
            System.out.println("variable : "+ctx.any_name_without_keyword(0).IDENTIFIER().getSymbol().getText());
        }
        if(ctx.if_oneline_grammer(0)!=null)
        {
            System.out.println("signal : "+ctx.if_oneline_signl_grammer(0).getText());
          // iFoneline= visitIf_oneline_grammer(ctx.if_oneline_grammer(0));
        }
        if( ctx.literal_value()!=null)
        {
            System.out.println("value = "+ctx.literal_value().getText());
        }
        if(ctx.IDENTIFIER()!=null)
        {
            System.out.println("IDENTIFIER : "+ctx.IDENTIFIER().getSymbol().getText());
        }

        System.out.print(ctx.QM().getSymbol().getText()+"");
        if(ctx.if_oneline_grammer(0)!=null)
        {
            //  IFoneline iFoneline1=new IFoneline();
            iFoneline=visitIf_oneline_grammer(ctx.if_oneline_grammer(0));
            //   iFoneline.setiFoneline(iFoneline);
        }
        if(ctx.any_name_without_keyword(1)!=null)
        {
            System.out.println(ctx.any_name_without_keyword(1).IDENTIFIER().getSymbol().getText());
        }
        if(ctx.array_name(0)!=null)
        {
            visitArray_name(ctx.array_name(0));
        }
        if(ctx.ASSIGN(0)!=null)
        {
            System.out.println("=");
        }
        if(ctx.any_name_without_keyword(2)!=null)
        {
            System.out.println(ctx.any_name_without_keyword(2).IDENTIFIER().getSymbol().getText());
        }
        if(ctx.NUMERIC_LITERAL(0)!=null)
        {
            System.out.println(ctx.NUMERIC_LITERAL(0).getSymbol().getText());
        }
        System.out.println(ctx.DD().getSymbol().getText()+"");

        if(ctx.if_oneline_grammer(1)!=null)
        {
            //   IFoneline iFoneline2 = new IFoneline();
            iFoneline=visitIf_oneline_grammer(ctx.if_oneline_grammer(1));
            // iFoneline.setiFoneline(iFoneline);
        }
        if(ctx.any_name_without_keyword(3)!=null)
        {
            System.out.println(ctx.any_name_without_keyword(3).IDENTIFIER().getSymbol().getText());
        }
        if(ctx.array_name(1)!=null)
        {
            visitArray_name(ctx.array_name(1));
        }
        if(ctx.ASSIGN(1)!=null)
        {
            System.out.println("=");
        }
        if(ctx.any_name_without_keyword(4)!=null)
        {
            System.out.println(ctx.any_name_without_keyword(4).IDENTIFIER().getSymbol().getText());
        }
        if(ctx.NUMERIC_LITERAL(1)!=null)
        {
            System.out.println(ctx.NUMERIC_LITERAL(1).getSymbol().getText());
        }

        return iFoneline;
        //    return super.visitIf_oneline_grammer(ctx);
    }



    @Override
    public WhileGrammer visitWhile_grammer(SQLParser.While_grammerContext ctx) {
        System.out.println("visitWhileGrammer");
        WhileGrammer whileGrammer = new WhileGrammer();
        whileGrammer.setName("While");
        Scope scope_While = new Scope();


        scope_While.setScope_name("While Scope");
        scope_While.setParent(stack_scope.pop());
        scope_While.generate_id();
        whileGrammer.setScope(scope_While);


        stack_scope.push(scope_While.getParent());
        stack_scope.push(scope_While);

        Main.symbolTable.addScope(scope_While);

        WhileHeader header= new WhileHeader();
        WhileBody body= new WhileBody();

        if(ctx.while_header_grammer()!=null ){

            header= visitWhile_header_grammer(ctx.while_header_grammer());
            whileGrammer.setHeader(header);

        }
        if( ctx.while_body_graammer()!= null)
        {
            body= visitWhile_body_graammer(ctx.while_body_graammer());
            whileGrammer.setBody(body);
        }

            stack_scope.pop();
        return  whileGrammer;
//        return super.visitWhile_grammer(ctx);
    }

    @Override
    public IfGrammer visitIf_grammer(SQLParser.If_grammerContext ctx) {
            System.out.println("visit if grammer");
            IfGrammer ifGrammer= new IfGrammer();
            IfHeader header =new IfHeader();
            List<LoopStatement> statements =new ArrayList<LoopStatement>();
            LoopStatement statement= new LoopStatement();

            Scope scope_If = new Scope();


            scope_If.setScope_name("IF Scope");
            scope_If.setParent(stack_scope.pop());
            scope_If.generate_id();
            ifGrammer.setScope(scope_If);

            stack_scope.push(scope_If.getParent());
            stack_scope.push(scope_If);

            Main.symbolTable.addScope(scope_If);


                if(ctx.if_header_grammer()!=null)
                {
                    //System.out.println("111");
                    header= visitIf_header_grammer(ctx.if_header_grammer());
                    ifGrammer.setIfHeader(header);
                }

                 if(ctx.list_loopStatement()!=null)
                {
                    //if(ctx.list_loopStatement()!=null)
                   // System.out.println("222");
                    statements =visitList_loopStatement(ctx.list_loopStatement());
                    ifGrammer.setStatements(statements);
                }
                 if(ctx.one_loop_body()!=null)
                {
                    statement = visitOne_loop_body(ctx.one_loop_body());
                    ifGrammer.setStatement(statement);
                }

            stack_scope.pop();
        return ifGrammer;
      //  return super.visitIf_grammer(ctx);
    }

    @Override
    public IfHeader visitIf_header_grammer(SQLParser.If_header_grammerContext ctx) {
        System.out.println("visit If_HeaderGrammer");
        IfHeader header = new IfHeader();
         List <Expr> expr= new ArrayList<Expr>();
         String v;

        System.out.print(" Condition : ");

        if (ctx.java_function_call_for_loop() != null)
        {
            visitJava_function_call_for_loop(ctx.java_function_call_for_loop());
        }

        if(ctx.true_or_false() != null) {   System.out.println(ctx.true_or_false()); }

      //  if(ctx.K_FALSE()!=null) {  System.out.println(ctx.K_FALSE()); }

        if(ctx.expr(0)!=null)
        {
            expr.add(visitExpr(ctx.expr(0)));
            header.setExpr(expr);
            //v=expr.remove(0).getVar().getVariable();
            Main.symbolTable.get_last_Scope_is_open().serach_in_perant(ctx.expr(0).var1().column_name().any_name().IDENTIFIER().getSymbol().getText());
                  header.setLine((ctx.getStart().getLine()));
                   header.setCol(ctx.getStart().getCharPositionInLine());
            System.out.println("in line " + header.getLine());
            System.out.println("in column : " + header.getCol());
            //          {
                //header.setLine(ctx.getRuleIndex());
//                 }



        }
        if(ctx.while_comper()!=null)
        {
            visitWhile_comper(ctx.while_comper());
        }
        if(ctx.expr(1)!=null)
        {
            expr.add(visitExpr(ctx.expr(1)));
            header.setExpr(expr);

        }
        if(ctx.true_or_false() != null) { System.out.println(ctx.true_or_false()); }

      //  if(ctx.K_FALSE()!=null){  System.out.println(ctx.K_FALSE()); }

        if(ctx.IDENTIFIER()!=null) {
            System.out.println(ctx.IDENTIFIER().getSymbol().getText());
            if(!Main.symbolTable.get_last_Scope_is_open().serach_in_perant(ctx.IDENTIFIER().getSymbol().getText())) {
                header.setLine((ctx.getStart().getLine()));
                header.setCol(ctx.getStart().getCharPositionInLine());
                System.out.println("in line " + header.getLine());
                System.out.println("in column : " + header.getCol());
            }

        }



        return header;
        //return super.visitIf_header_grammer(ctx);
    }

    @Override
    public Object visitJava_function_call_for_loop(SQLParser.Java_function_call_for_loopContext ctx) {
            System.out.println("visit JavaFunction for loop");
            if(ctx.any_name_without_keyword()!=null)
            {
                // System.out.println("ffffff");
                System.out.println(ctx.any_name_without_keyword().IDENTIFIER().getSymbol().getText());
            }
            if(ctx.arguments_list()!=null)
            {
               // System.out.println("aaaaaaaaaaaaaa");
              //  System.out.println(ctx.arguments_list().getText());
                visitArguments_list(ctx.arguments_list());
            }


            return 0;
      //  return super.visitJava_function_call_for_loop(ctx);
    }

    @Override
    public WhileHeader visitWhile_header_grammer(SQLParser.While_header_grammerContext ctx) {
        System.out.println("visitWhileHeader");
        WhileHeader header = new WhileHeader();
        Expr  expr,expr1;
        WhileCompaer whileCompaer;
        String value="";
        value=ctx.getText();
        System.out.println("visit condition :"+value);
        String v;

        if(ctx.expr(0)!=null)
        {
            expr=visitExpr(ctx.expr(0));
            header.setExpr(expr);
//            String v= ctx.expr(0).var1().column_name().any_name().IDENTIFIER().getSymbol().getText();
         //   System.out.println("v=  " +v);
            v=expr.getVar().getVariable();
            Main.symbolTable.get_last_Scope_is_open().serach_in_perant(v);
            header.setLine((ctx.getStart().getLine()));
            header.setCol(ctx.getStart().getCharPositionInLine());
            System.out.println("in line " + header.getLine());
            System.out.println("in column : " + header.getCol());

        }
        whileCompaer= visitWhile_comper(ctx.while_comper());

        if(ctx.expr(1)!=null)
        {
            expr1=visitExpr(ctx.expr(1));
            header.setExpr(expr1);
            v=expr1.getVar().getVariable();
         //   Main.symbolTable.get_last_Scope_is_open().serach_in_perant(v);

        }

        return header;
    }

    @Override
    public WhileBody visitWhile_body_graammer(SQLParser.While_body_graammerContext ctx) {

        System.out.println("Visit While Body");
        WhileBody body= new WhileBody();
        List<LoopStatement> bodyloopstmt= new ArrayList<LoopStatement>();
        LoopStatement statement= new LoopStatement();


            for (int i=0;i<ctx.list_loopStatement().size(); i++) {
              //  System.out.println("for  :  " + i);
                if (ctx.list_loopStatement(i) != null) {
                //    System.out.println(" if   :  " + i );
                    bodyloopstmt = visitList_loopStatement(ctx.list_loopStatement(i));

                }
                if(ctx.K_CONTINUE()!=null)
                {
                    body.setK_Conitnue("conitinue");
                    //System.out.println("cccccccccc");
                }

            }
        body.setLoopStatementList(bodyloopstmt);

        //            if(ctx.K_CONTINUE()!=null)
//            {
//                System.out.println("kewword : continue");
//            }
    //    }
        if (ctx.list_loopStatement().isEmpty())
        {
            System.out.println("no statement in body while");

        }
        if(ctx.one_loop_body()!=null)
        {
            statement=  visitOne_loop_body(ctx.one_loop_body());
        }
        body.setLoopStatement(statement);
        return  body;
    }

    @Override
    public Foreach visitForeach_grammer(SQLParser.Foreach_grammerContext ctx) {
            System.out.println("visit Foreash Grammer");
            Foreach foreach= new Foreach();
            ForeachHeader header= new ForeachHeader();
            List<LoopStatement> statements = new ArrayList<>();
            LoopStatement statement = new LoopStatement();

            Scope scope_Foreash = new Scope();

            scope_Foreash.setScope_name("Foreash Scope");
            scope_Foreash.generate_id();
            scope_Foreash.setParent(stack_scope.pop());
            foreach.setScope(scope_Foreash);

            stack_scope.push(scope_Foreash.getParent());
            stack_scope.push(scope_Foreash);

            Main.symbolTable.addScope(scope_Foreash);

            if(ctx.foreach_header_grammer()!=null)
            {
                header= visitForeach_header_grammer(ctx.foreach_header_grammer());
                foreach.setHeader(header);
            }
            if(ctx.list_loopStatement()!=null)
            {
                statements= visitList_loopStatement(ctx.list_loopStatement());
                foreach.setStatements(statements);
            }

            if(ctx.one_loop_body()!=null)
            {
                statement= visitOne_loop_body(ctx.one_loop_body());
                foreach.setStatement(statement);
            }



            stack_scope.pop();
            return foreach;
    //   return super.visitForeach_grammer(ctx);
    }

    @Override
    public ForeachHeader visitForeach_header_grammer(SQLParser.Foreach_header_grammerContext ctx) {
                System.out.println("visit Foreash herder Grammer");
               ForeachHeader header= new ForeachHeader();
               if(ctx.any_name_without_keyword(0)!=null)
               {
                   header.setName(ctx.any_name_without_keyword(0).IDENTIFIER().getSymbol().getText());
                    System.out.println("first varible = "+header.getName());
               }
               if(ctx.any_name_without_keyword(1)!=null)
               {
                   header.setName2(ctx.any_name_without_keyword(1).IDENTIFIER().getSymbol().getText());
                   System.out.println("second varible =  "+ header.getName2());
               }



        return header;
        //return super.visitForeach_header_grammer(ctx);
    }

    @Override
    public ForGarmmer visitFor_grammer(SQLParser.For_grammerContext ctx) {
        System.out.println("visitForGrammer");
        ForGarmmer forGrammer = new ForGarmmer();
        ForHeader header= new ForHeader();
        Scope scope_For = new Scope();


        scope_For.setScope_name("For Scope");
        scope_For.setParent(stack_scope.pop());
        forGrammer.setScope(scope_For);
        scope_For.generate_id();


        stack_scope.push(scope_For.getParent());
        stack_scope.push(scope_For);

        Main.symbolTable.addScope(scope_For);

        Expr expr =new Expr();
       List <LoopStatement> loopStatement = new ArrayList<LoopStatement>();
       LoopStatement statement= new LoopStatement();



        //forGrammer.setExpr();
        //  ForBody body= new ForBody();
        forGrammer.setName("For");
        //tableName = ctx.table_name().any_name().IDENTIFIER().getSymbol().getText();
         if (ctx.for_header()!=null)
        {
            header= visitFor_header(ctx.for_header());
        }

        if(ctx.list_loopStatement()!=null)
        {
            System.out.println("visit for Body");
            loopStatement = visitList_loopStatement(ctx.list_loopStatement());
            forGrammer.setLoopStatementList(loopStatement);
        }
         if (ctx.one_loop_body()!=null)
        {

            statement=visitOne_loop_body(ctx.one_loop_body());
            forGrammer.setStatement(statement);
        }


        //    System.out.println(ctx.NUMERIC_LITERAL());
        //    System.out.println(ctx.increase_and_decrease());

        // System.out.println(forGrammer.getExpr());


        stack_scope.pop();
        return  forGrammer;
//        return super.visitWhile_grammer(ctx);

//        return super.visitWhile_grammer(ctx);

    }

    @Override
    public ForHeader visitFor_header(SQLParser.For_headerContext ctx) {
        System.out.println("visit ForHeader");
        ForHeader header= new ForHeader();
        Increase_and_decrease increase_and_decrease=new Increase_and_decrease();
        String v="";

        System.out.println("("+ctx.getText()+")");
        if(ctx.K_VAR()!=null)
        {
            header.setK_var("var");
            System.out.println(ctx.K_VAR());
        }
        if(ctx.any_name_without_keyword(0)!=null )
        {
            System.out.print("varialbe : "+ctx.any_name_without_keyword(0).IDENTIFIER().getSymbol().getText());
            v=ctx.any_name_without_keyword(0).IDENTIFIER().getSymbol().getText();

            }
        if(ctx.NUMERIC_LITERAL(0)!=null )
        {
            System.out.println("="+ctx.NUMERIC_LITERAL(0).getSymbol().getText());
        }
        Main.symbolTable.get_last_Scope_is_open().serach_in_perant(v);
        header.setLine((ctx.getStart().getLine()));
        header.setCol(ctx.getStart().getCharPositionInLine());
        System.out.println("in line " + header.getLine());
        System.out.println("in column : " + header.getCol());

//        if( ctx.any_name_without_keyword(1)!=null)
//        {
//            System.out.print("="+ ctx.any_name_without_keyword(1).IDENTIFIER().getSymbol().getText());
//            Main.symbolTable.get_last_Scope_is_open().serach_in_perant(v);
//            v=ctx.any_name_without_keyword(1).IDENTIFIER().getSymbol().getText();
//
//        }


        if(ctx.any_name_without_keyword(1)!=null && ctx.any_name_without_keyword(2)!=null)
        {
            System.out.print("conrition  : "+ctx.any_name_without_keyword(1).IDENTIFIER().getSymbol().getText());
            System.out.print(" "+ctx.for_signs().getText());
            System.out.print(""+ctx.any_name_without_keyword(2).IDENTIFIER().getSymbol().getText());

            v=ctx.any_name_without_keyword(1).IDENTIFIER().getSymbol().getText();
            header.setLine((ctx.getStart().getLine()));
            header.setCol(ctx.getStart().getCharPositionInLine());

            if(! Main.symbolTable.get_last_Scope_is_open().serach_in_perant(v))
            {
                System.out.println("in line " + header.getLine());
                System.out.println("in column : " + header.getCol());
            }
            v=ctx.any_name_without_keyword(2).IDENTIFIER().getSymbol().getText();
           if(!Main.symbolTable.get_last_Scope_is_open().serach_in_perant(v)) {
               header.setLine((ctx.getStart().getLine()));
               header.setCol(ctx.getStart().getCharPositionInLine());
               System.out.println("in line " + header.getLine());
               System.out.println("in column : " + header.getCol());
           }
            if( ctx.NUMERIC_LITERAL(1)!=null) {
                System.out.println(" "+ctx.NUMERIC_LITERAL(1).getSymbol().getText());

            }
        }
        if(ctx.increase_and_decrease()!=null)
        {
            increase_and_decrease =  visitIncrease_and_decrease(ctx.increase_and_decrease());
        }
        return header;

        //return super.visitFor_header(ctx);
    }
    @Override
    public Increase_and_decrease visitIncrease_and_decrease(SQLParser.Increase_and_decreaseContext ctx) {
        Increase_and_decrease increase_and_decrease = new Increase_and_decrease();
        // System.out.println(ctx.any_name_without_keyword(0).IDENTIFIER().getSymbol().getText());
       // System.out.println(ctx.getText());


        if(ctx.MINUS(0)!=null && ctx.MINUS(1)!=null)
        {
            System.out.println("--");
            System.out.println(ctx.MINUS(0).getSymbol().getText()+ctx.MINUS(1).getSymbol().getText());
        }
        if(ctx.PLUS(0)!=null && ctx.PLUS(0)!=null)
        {System.out.println("++");
            System.out.println(ctx.PLUS(0).getSymbol().getText()+ctx.PLUS(1).getSymbol().getText());
        }
        if(ctx.PLUS(2)!=null)
        {System.out.println("+");
            System.out.println(ctx.PLUS(2).getSymbol().getText());
        }
        if(ctx.NUMERIC_LITERAL()!=null)
        {   //System.out.println("N");
            System.out.println(ctx.NUMERIC_LITERAL().getSymbol().getText());
        }
        if(ctx.any_name_without_keyword(1)!=null)
        {   //System.out.println("any");
            System.out.println(ctx.any_name_without_keyword(1).IDENTIFIER().getSymbol().getText());
        }
        if(ctx.MINUS(2)!=null)
        {   System.out.println("-");
            System.out.println(ctx.MINUS(2));
        }
        if(ctx.NUMERIC_LITERAL()!=null)
        {  // System.out.println("N");
            System.out.println(ctx.NUMERIC_LITERAL().getSymbol().getText());
        }

        if(ctx.PLUS(3)!=null && ctx.PLUS(4)!=null)
        {  // System.out.println("2++");
            System.out.println(ctx.PLUS(3).getSymbol().getText()+ctx.PLUS(4).getSymbol().getText());
        }

        System.out.println(ctx.getText());
        if(ctx.MINUS(3)!=null && ctx.MINUS(4)!=null )
        {   //System.out.println("2--");
            System.out.println(ctx.NUMERIC_LITERAL().getSymbol().getText());
        }
        if(ctx.PLUS(5)!=null)
        {  // System.out.println("2+");
            System.out.println(ctx.PLUS(5).getSymbol().getText());
        }
        if(ctx.NUMERIC_LITERAL()!=null)
        {  //  System.out.println("2N");
            System.out.println(ctx.NUMERIC_LITERAL().getSymbol().getText());
        }
        if(ctx.any_name_without_keyword(2)!=null)
        {  //  System.out.println("2any");
            System.out.println(ctx.any_name_without_keyword(2).IDENTIFIER().getSymbol().getText());
        }
        if(ctx.MINUS(5) != null && ctx.NUMERIC_LITERAL()!=null)
        {     //  System.out.println("-N");
            System.out.println(ctx.MINUS(5).getSymbol().getText()+ ctx.NUMERIC_LITERAL().getSymbol().getText());
        }
        if(ctx.any_name_without_keyword(3)!=null)
        {  // System.out.println("3any");
            System.out.println(ctx.any_name_without_keyword(3).IDENTIFIER().getSymbol().getText());
        }






        return increase_and_decrease;
        // return super.visitIncrease_and_decrease(ctx);
    }

    @Override
    public VarInilt visitVar_grammer2(SQLParser.Var_grammer2Context ctx) {
        System.out.println("visit var for init  : ");
       VarInilt varInilt= new VarInilt();
        String varilbeName="";

        Type type = new Type();
        Symbol symbol = new Symbol();
        Scope scope = new Scope();
        symbol.setIsParam(false);
       // String Error="";


        if(ctx.any_name_without_keyword()!=null)
        {
            varilbeName = visitAny_name_without_keyword(ctx.any_name_without_keyword());
          //  System.out.println("var x _ :  "+ varilbeName);
            varInilt.setName(varilbeName);
            symbol.setName(varilbeName);
            varInilt.setLine((ctx.getStart().getLine()));
            varInilt.setCol(ctx.getStart().getCharPositionInLine());
            System.out.println("col  "+varInilt.getCol());


        }

        if(ctx.NUMERIC_LITERAL()!=null) {
            // System.out.println("11111NNNNNNNN");
            type.setName("Number");

            System.out.print("value : ");
            System.out.println(ctx.NUMERIC_LITERAL().getSymbol().getText());
            varInilt.setValue(ctx.NUMERIC_LITERAL().getSymbol().getText());
            if ( Main.symbolTable.get_last_Scope_is_open().getSymbolMap().containsKey(varilbeName)  &&
                Main.symbolTable.get_last_Scope_is_open().getSymbolMap().get(varilbeName).getType().is_equel(type)  )
            {
//                if(type.getName().equals(Main.symbolTable.get_last_Scope_is_open().getSymbolMap().get(varilbeName).getType().getName()))
//                {
//                if(Main.symbolTable.get_last_Scope_is_open().getSymbolMap().get(varilbeName).getType().is_equel(type))
//                {
                //System.out.println("number");
                try {
                    myWriter.write("Error  :  \n");
                    myWriter.write("Multiple declarations  : ");
                    myWriter.write(varilbeName+"\n");
                    myWriter.write("in line  : "+varInilt.getCol()+"\n");
                    myWriter.write("in column  :"+varInilt.getCol()+"\n");
                    myWriter.write("tow varialbe with same name and same type \n");
                    myWriter.write("___________________________________________________________________\n");
                    //  myWriter.close();
                    myWriter.flush();
                //    System.out.println("Successfully wrote to the file.");
                } catch (IOException e) {
                    System.out.println("An error occurred.");
                    e.printStackTrace();
                }

                //  }

            }  else {
                symbol.setType(type);
                Main.symbolTable.addType(type);
                System.out.println("the type is : " + type.getName());
                scope= Main.symbolTable.get_last_Scope_is_open();
                scope.addSymbol(varilbeName,symbol);
                symbol.setScope(scope);
            }
        }
        if(ctx.true_or_false()!=null)
        {
            type.setName("boolean");
            System.out.println("value  =  "+ctx.true_or_false().getText());

            if( Main.symbolTable.get_last_Scope_is_open().getSymbolMap().containsKey(varilbeName)  &&
                Main.symbolTable.get_last_Scope_is_open().getSymbolMap().get(varilbeName).getType().is_equel(type) )
            {
               // if(type.getName().equals(Main.symbolTable.get_last_Scope_is_open().getSymbolMap().get(varilbeName).getType().getName())) {
//                 if(Main.symbolTable.get_last_Scope_is_open().getSymbolMap().get(varilbeName).getType().is_equel(type))
//                 {

                //}
                try {
                    myWriter.write("Error  :  \n");
                    myWriter.write("Multiple declarations  : ");
                    myWriter.write(varilbeName+"\n");
                    myWriter.write("tow varialbe with same name and same type \n");
                    myWriter.write("___________________________________________________________________\n");
                    //  myWriter.close();
                    myWriter.flush();
                    //    System.out.println("Successfully wrote to the file.");
                } catch (IOException e) {
                    System.out.println("An error occurred.");
                    e.printStackTrace();
                }

            }else {
                     symbol.setType(type);
                     Main.symbolTable.addType(type);
                     System.out.println("the type is:" + type.getName());
                scope= Main.symbolTable.get_last_Scope_is_open();
                scope.addSymbol(varilbeName,symbol);
                symbol.setScope(scope);
                 }

        }
        if(ctx.IDENTIFIER()!=null)
        {
            System.out.println("String value : "+ctx.IDENTIFIER().getSymbol().getText());
            varInilt.setValue(ctx.IDENTIFIER().getSymbol().getText());
            type.setName("String");
            if(Main.symbolTable.get_last_Scope_is_open().getSymbolMap().containsKey(varilbeName) &&
                    Main.symbolTable.get_last_Scope_is_open().getSymbolMap().get(varilbeName).getType().is_equel(type) )
            {
                //System.out.println("name   ::  "+ varilbeName);
//                if(type.getName().equals(Main.symbolTable.get_last_Scope_is_open().getSymbolMap().get(varilbeName).getType().getName()))
//                {
//                if(type.is_equel(Main.symbolTable.get_last_Scope_is_open().getSymbolMap().get(varilbeName).getType()))
//                {
                //}
                try {
                    myWriter.write("Error  :  \n");
                    myWriter.write("Multiple declarations  : ");
                    myWriter.write(varilbeName+"\n");
                    myWriter.write("tow varialbe with same name and same type \n");
                    myWriter.write("___________________________________________________________________\n");
                    //  myWriter.close();
                    myWriter.flush();
                    //    System.out.println("Successfully wrote to the file.");
                } catch (IOException e) {
                    System.out.println("An error occurred.");
                    e.printStackTrace();
                }

            }else {
                symbol.setType(type);
                Main.symbolTable.addType(type);
                scope= Main.symbolTable.get_last_Scope_is_open();
                scope.addSymbol(varilbeName,symbol);
                symbol.setScope(scope);
            }
        }
            if(ctx.NUMERIC_LITERAL()==null && ctx.IDENTIFIER()==null && ctx.true_or_false()==null)
            {
                symbol.setIsParam(false);
                symbol.setScope(Main.symbolTable.get_last_Scope_is_open());
                Main.symbolTable.get_last_Scope_is_open().addSymbol(varilbeName,symbol);

            }



        return varInilt;
    }

    @Override
    public VarInilt visitVar_3(SQLParser.Var_3Context ctx) {
            System.out.println("visit var for var 3");
            VarInilt varInilt = new VarInilt();
            IFoneline iFoneline = new IFoneline();
        String varilbeName="";
        Statement select = new Statement();

        String name;



        Symbol symbol = new Symbol();

        if(ctx.any_name_without_keyword()!=null)
        {
            varilbeName = visitAny_name_without_keyword(ctx.any_name_without_keyword());
            varInilt.setName(varilbeName);

            symbol.setName(varilbeName);

        }

//        if(ctx.factored_select_stmt()!=null)
//        {
//            select =visitFactored_select_stmt(ctx.factored_select_stmt());
//            varInilt.setStatement(select);
//            varInilt.setType_select(select.getType());
//            select.getType().setName("var_"+varInilt.getName());
//            Main.symbolTable.getDeclaredTypes().add(varInilt.getType_select());
//        }
        if(ctx.factored_select_stmt()!=null) {
            select = visitFactored_select_stmt(ctx.factored_select_stmt());
            varInilt.setStatement(select);
            varInilt.setType_select(select.getType());
            //   select.getType().setName("var_"+varilbeName);
            // symbol.setType(varInilt.getType_select());

//            System.out.println("befor falt type =  "+varInilt.getType_select().getColumns());
            if(varInilt.getType_select()!=null)
            {
                Map<String, Type> flatype = symbol.flat(varInilt.getType_select());
                Type vartype = new Type();
                System.out.println();
                vartype.setColumns(flatype);
                symbol.setType(vartype);
                vartype.setName("var_" + varilbeName);
                varInilt.setType_select(vartype);
                Main.symbolTable.getDeclaredTypes().add(vartype);

            }
//            System.out.println("after flat type  =  "+varInilt.getType_select().getColumns());

//            Map<String, Type> flatype = symbol.flat(varInilt.getType_select());
//            Type vartype = new Type();
//            System.out.println();
//            vartype.setColumns(flatype);
//            symbol.setType(vartype);
//            vartype.setName("var_" + varilbeName);
//            varInilt.setType_select(vartype);

//            Main.symbolTable.getDeclaredTypes().add(varInilt.getType_select());
//            Main.symbolTable.getDeclaredTypes().add(vartype);

        }

            if(ctx.java_function_call_for_var()!=null) {

            name = ctx.java_function_call_for_var().any_name_without_keyword().IDENTIFIER().getSymbol().getText();
            visitJava_function_call_for_var(ctx.java_function_call_for_var());

            if (Main.symbolTable.get_last_Scope_is_open().serach_in_perant(name))
            {

            }
        }
        if(ctx.if_oneline_grammer()!=null)
        {
            iFoneline = visitIf_oneline_grammer(ctx.if_oneline_grammer());
            varInilt.setiFoneline(iFoneline);
        }

        symbol.setType(varInilt.getType_select());
        symbol.setScope(Main.symbolTable.get_last_Scope_is_open());
        symbol.setIsParam(false);
        Main.symbolTable.get_last_Scope_is_open().addSymbol(symbol.getName(),symbol);

        return varInilt;
    }

    @Override
    public VarInilt visitVar_4(SQLParser.Var_4Context ctx) {
        System.out.println("visit Var Grammer for var 4");
        VarInilt varInilt= new VarInilt();
       // IFoneline iFoneline = new IFoneline();
       // List<Expr>exprs =new ArrayList<>();
       // Expr expr= new Expr();
       // Statement statement= new Statement();

        Scope scope = new Scope();
        String anyname="";
        String signal;

        varInilt.setLine((ctx.getStart().getLine()));
        varInilt.setCol(ctx.getStart().getCharPositionInLine());

        if(ctx.any_name_without_keyword()!=null)
        {
           // System.out.println("var 4 anyname ");
             visitAny_name_without_keyword(ctx.any_name_without_keyword());

            anyname=ctx.any_name_without_keyword().IDENTIFIER().getSymbol().getText();
           // scope =
          //  System.out.println(Main.symbolTable.get_last_Scope_is_open().serach_in_perant(anyname));
                    if(!Main.symbolTable.get_last_Scope_is_open().serach_in_perant(anyname)) {
                    //   System.out.println("22222222222222");
                        varInilt.setLine((ctx.getStart().getLine()));
                        varInilt.setCol(ctx.getStart().getCharPositionInLine());
                        System.out.println("in line : " + varInilt.getLine());
                        System.out.println("in column  : " + varInilt.getCol());
                    }
                    // if(Main.symbolTable.get_last_Scope_is_open().serach_in_perant(anyname)==true)
                //    else {
//                        System.out.println("updateeeeeeeeeeeeeeeeeee type");
//                        Main.symbolTable.get_last_Scope_is_open().search_is_symbol(anyname,"number");
                        //Main.symbolTable.get_last_Scope_is_open()


                 //   }
  //              boolean b;
//             scope.serach_in_perant(anyname);
               // stack_scope.push();
        }


        if(ctx.while_signs()!=null)
        {
            signal= ctx.while_signs().getText();
            System.out.println("operator : "+signal);
        }
        if(ctx.array_name()!=null)
        {
            System.out.println("array name ");
            visitArray_name(ctx.array_name());
        }
        if(ctx.java_function_call_for_var()!=null)
        {
            visitJava_function_call_for_var(ctx.java_function_call_for_var());
        }


//        if(!ctx.x1().isEmpty()) {
//            System.out.println("1");
//          //  for (int i=0; i<ctx.x1().size() ; i++) {
//                System.out.println("2");
//                if (ctx.x1(i) != null)
//                {
//                    System.out.println("3");
//                    visitX1(ctx.x1(i));
//                }
//            }
//        }
        //for (int i=0; i<ctx.x1().size() ; i++)
//        int x=0;
//        for (int i=0 ; i<Main.symbolTable.getDeclaredTypes().size() ; i++) {
//            if (Main.symbolTable.get_last_Scope_is_open().serach_in_perant(anyname)) {
//               x++;
//            }
//        }
     //   System.out.println("x =  "+x);
        if(ctx.x1()!=null)
        {
            //        if(!ctx.x1().isEmpty())
          // System.out.println("XXXXXXXXXXXX11111111111");
            for (int i=0; i<ctx.x1().size() ; i++)
           varInilt= visitX1(ctx.x1(i));

            System.out.println("varialbe  error = "+anyname);
                if (Main.symbolTable.get_last_Scope_is_open().serach_in_perant(anyname) ) {
                  // System.out.println("1111111111111111");
                  // System.out.println("1444444"+Main.symbolTable.get_last_Scope_is_open().have_type(anyname));

                    if (!(Main.symbolTable.get_last_Scope_is_open().have_type(anyname)) && !Main.symbolTable.get_last_Scope_is_open().search_in_perant_symbol(anyname))
                        /* fuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuucccccccccccccccccccccccccccccccccccccccccccccck */
                        {
                      //  System.out.println("update type");
                        //  System.out.println("type symb   = "+varInilt.getType());
                          Type type_vari= new Type();
                          type_vari.setName(varInilt.getType());
                          //  System.out.println("mmmm");
                       if (  !Main.symbolTable.get_last_Scope_is_open().search_is_symbol(anyname, varInilt.getType())) {
                          //  System.out.println("5555555555555555   :"+varInilt.getType());
                          //  Main.symbolTable.addType(Main.symbolTable.get_last_Scope_is_open().getSymbolMap().get(anyname).getType());
                            Main.symbolTable.addType(type_vari);
                        }
                    }
                }
//                if(Main.symbolTable.get_last_Scope_is_open().serach_in_perant(anyname)  &&
//                    Main.symbolTable.get_last_Scope_is_open().have_type(anyname) && Main.symbolTable.get_last_Scope_is_open().search_in_perant_symbol(anyname))
                    if(Main.symbolTable.get_last_Scope_is_open().serach_in_perant(anyname))
                    {
                       // System.out.println("21212121212");
                        if ((Main.symbolTable.get_last_Scope_is_open().have_type(anyname)) && !Main.symbolTable.get_last_Scope_is_open().same_type(anyname,varInilt.getType()) )
                        {
                            System.out.println("errrrrrrrrrrrrrro");
                            try {
                                myWriter.write("Error  :  \n");
                                myWriter.write("assigning  another type to declared type : ");
                                myWriter.write(anyname+"\n");
                                myWriter.write(" varialbe with tow type \n");
                                myWriter.write("in line   :  "+varInilt.getLine()+"\n");
                                myWriter.write("in column   :  "+varInilt.getCol()+"\n");
                                myWriter.write("___________________________________________________________________\n");
                                //  myWriter.close();
                                myWriter.flush();
                                //    System.out.println("Successfully wrote to the file.");
                            } catch (IOException e) {
                                System.out.println("An error occurred.");
                                e.printStackTrace();
                            }

                        }
                     //   for(int i=0 ;i<Main.symbolTable.getScopes().size() ;i++)
                       if( Main.symbolTable.get_last_Scope_is_open().search_in_perant_symbol(anyname) && !Main.symbolTable.get_last_Scope_is_open().search_in_perant_symbol_if_same_type(anyname,varInilt.getType()))
                        {
                        System.out.println("tow type");
                            try {
                                myWriter.write("Error  :  \n");
                                myWriter.write("assigning  another type to declared type : ");
                                myWriter.write(anyname+"\n");
                                myWriter.write(" varialbe with tow type \n");
                                myWriter.write("in line   :  "+varInilt.getLine()+"\n");
                                myWriter.write("in column   :  "+varInilt.getCol()+"\n");
                                myWriter.write("___________________________________________________________________\n");
                                //  myWriter.close();
                                myWriter.flush();
                                //    System.out.println("Successfully wrote to the file.");
                            } catch (IOException e) {
                                System.out.println("An error occurred.");
                                e.printStackTrace();
                            }

                        }
                    }

        }
//            else {
//                System.out.println("errrrrrrrrrrrrrrrrrrrrrror  :");
//                System.out.println("assigning another type to declared variable  :(");
//            }
//
//        }


            return varInilt;
    }

    @Override
    public VarInilt visitX1(SQLParser.X1Context ctx) {
       // System.out.println("visit X1 ");
        VarInilt varInilt= new VarInilt();
        IFoneline iFoneline = new IFoneline();
        List<Expr>exprs =new ArrayList<>();
        Expr expr= new Expr();
        Statement statement= new Statement();
        Type type = new Type();

        if(ctx.NUMERIC_LITERAL()!=null)
        {
            System.out.print(" value : ");
            System.out.println(ctx.NUMERIC_LITERAL().getSymbol().getText());
            /*          heeeeeeeeeeeeeeeeeeeeeeeeerrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrreeeeeeeeeeeeeeeeeeeeeeeeeeeee           */
                varInilt.setType("Number");
        }

        if(ctx.java_function_call_for_var()!=null)
        {
            visitJava_function_call_for_var(ctx.java_function_call_for_var());
        }

        if(ctx.if_oneline_grammer()!=null)
        {
            iFoneline = visitIf_oneline_grammer(ctx.if_oneline_grammer());
            varInilt.setiFoneline(iFoneline);
        }

        if(ctx.array_name()!=null) {

            System.out.println("array name ");
            visitArray_name(ctx.array_name());
        }
        //System.out.println("out Expr");
        if(ctx.expr()!=null)
        {
           // System.out.println("in Expr");
            System.out.println("visit expr Grammer" );
            expr= visitExpr(ctx.expr());
            exprs.add(expr);
            varInilt.setType(expr.getType());
           // System.out.println("expr var grammer : "+varInilt.getType());
        }

        if(ctx.sql_stmt()!=null)
        {
            statement =  visitSql_stmt(ctx.sql_stmt());    //  visitFactored_select_stmt(ctx.sql_stmt().factored_select_stmt());
            //  selectStmt= visitSelect_stmt(ctx.select_stmt(0));
        }


        if(ctx.true_or_false() !=null)
        {
//                type.setName("boolean");
//                Main.symbolTable.addType(type);
//
//                System.out.println("the type is:" + type.getName());

            varInilt.setType("Booolean");
        }

        varInilt.setStatement(statement);
        varInilt.setExprs(exprs);

        return varInilt;
    }

    @Override
    public VarGrammer visitVar_grammer(SQLParser.Var_grammerContext ctx) {
        VarGrammer var=new VarGrammer();
        System.out.println("Visit Var Grammer ");
        VarInilt varInilt= new VarInilt();

        String anyname;
        String varibleName="";

        String signal;
        Statement statement=new Statement();
        SelectStmt selectStmt=new SelectStmt();
        Expr expr= new Expr();
        var.setName("Var");
       IFoneline iFoneline=new IFoneline();
        List<Expr>exprs =new ArrayList<>();

        Scope scope_var = new Scope();


        Symbol symbol = new Symbol();
        Type type = new Type();

       // symbol.setScope(Main.symbolTable.get_last_Scope_is_open());
      //  ArrayList<String> symbolsnames = new ArrayList<>();


        if(ctx.var_grammer2()!=null)
        {
           // System.out.println("jjjjj");
           varInilt= visitVar_grammer2(ctx.var_grammer2());
        }

        if(ctx.var_3()!=null)
        {
          varInilt= visitVar_3(ctx.var_3());

        }

        if(ctx.var_4()!=null)
        {
          varInilt = visitVar_4(ctx.var_4());
        }

        var.setVarInilt(varInilt);






       /* if(ctx.false_grammer(0) !=null)
        {
            type.setName("boolean");
            Main.symbolTable.addType(type);

            System.out.println("the type is : " + type.getName());
        }
*/

       /* if(ctx.java_function_call_for_var(1)!=null)
        {
            visitJava_function_call_for_var(ctx.java_function_call_for_var(1));
        }*/




       //  second part ::




//
//        if(ctx.if_oneline_grammer(1)!=null)
//        {
//            iFoneline = visitIf_oneline_grammer(ctx.if_oneline_grammer(1));
//            var.setiFoneline(iFoneline);
//        }
//        if(ctx.sql_stmt(1)!=null)
//        {
//            statement =  visitSql_stmt(ctx.sql_stmt(1));
//            //  selectStmt= visitSelect_stmt(ctx.select_stmt(0));
//        }
//
//        if(ctx.expr(2)!=null)
//        {
//            System.out.println("visit expr Grammer" );
//            expr= visitExpr(ctx.expr(2));
//            exprs.add(expr);
//        }
//
//        if(ctx.true_or_false(1) !=null)
//        {
//            type.setName("boolean");
//            Main.symbolTable.addType(type);
//
//            System.out.println("the type is:" + type.getName());
//        }

       /* if(ctx.true_grammer(1) !=null)
        {
            type.setName("boolean");
          //  Main.symbolTable.addType(type);

            System.out.println("the type is:" + type.getName());
        }
        if(ctx.false_grammer(1) !=null)
        {
            type.setName("boolean");
          //  Main.symbolTable.addType(type);

            System.out.println("the type is:" + type.getName());
        }*/

      //  var.setExprs(exprs);

        // var.setSymbol(symbol);
       // var.setType(type);

       // symbol.setType(type);
       // Main.symbolTable.get_last_Scope_is_open().addSymbol(varibleName,symbol);
      //  Main.symbolTable.print_array_type();

        return var;
        //  return super.visitVar_grammer(ctx);
    }






    @Override
    public Object visitJava_function_call_for_var(SQLParser.Java_function_call_for_varContext ctx) {
            System.out.println("visit JavaFunction ");

            if(ctx.any_name_without_keyword()!=null)
            {
               // System.out.println("ddddd");
                System.out.println(ctx.any_name_without_keyword().IDENTIFIER().getSymbol().getText());

            }
            if(ctx.arguments_list()!=null)
            {
                visitArguments_list(ctx.arguments_list());
            }




        return super.visitJava_function_call_for_var(ctx);
    }

    @Override
    public Object visitArguments_list(SQLParser.Arguments_listContext ctx) {
            System.out.println("visit ArgumentList");



//            for (int i=0 ; i< ctx.arguments_list_body().size() ; i++)
//            {
//                if(ctx.arguments_list_body(i).any_name_without_keyword()!=null)
//                {
//                    System.out.println(ctx.arguments_list_body(i).any_name_without_keyword().IDENTIFIER().getSymbol().getText());
//                }
//                if(ctx.arguments_list_body(i).NUMERIC_LITERAL()!=null)
//                {
//                    System.out.println(ctx.arguments_list_body(i).NUMERIC_LITERAL().getSymbol().getText());
//                }
//                if(ctx.arguments_list_body(i).array_name_call()!=null)
//                {
//                    System.out.println(ctx.arguments_list_body(i).array_name_call().getText());
//                }
//                if(ctx.arguments_list_body(i).java_function_call_for_loop()!=null)
//                {
//                    visitJava_function_call_for_loop(ctx.arguments_list_body(i).java_function_call_for_loop());
//                }
//
//            }
//


            for (int i=0 ; i<ctx.arguments_list_body().size() ; i++)
            {
                if(ctx.arguments_list_body(i).any_name_without_keyword()!=null)
                {
                    System.out.println(ctx.arguments_list_body(i).any_name_without_keyword().IDENTIFIER().getSymbol().getText());
                }
                if(ctx.arguments_list_body(i).NUMERIC_LITERAL()!=null)
                {
                    System.out.println(ctx.arguments_list_body(i).NUMERIC_LITERAL().getSymbol().getText());
                }
                if(ctx.arguments_list_body(i).array_name_call()!=null)
                {
                    System.out.println(ctx.arguments_list_body(i).array_name_call().getText());
                }
                if(ctx.arguments_list_body(i).java_function_call_for_loop()!=null)
                {
                    visitJava_function_call_for_loop(ctx.arguments_list_body(i).java_function_call_for_loop());
                }

            }


            return 0;
      //  return super.visitArguments_list(ctx);
    }

    @Override
    public String  visitAny_name_without_keyword(SQLParser.Any_name_without_keywordContext ctx) {
        String name;

        if(ctx.IDENTIFIER()!=null) {
            name = ctx.IDENTIFIER().getSymbol().getText();
            System.out.println("varialble  : " + name);
            return name;
        }
        return null;
        // return super.visitAny_name_without_keyword(ctx);
    }

    @Override
    public ReturnGrammer visitReturn_grammer(SQLParser.Return_grammerContext ctx) {
        Type type=new Type();

        System.out.println("visit ReturnGrammer");
        ReturnGrammer returnG= new ReturnGrammer();
        returnG.setName("return");
        Increase_and_decrease in= new Increase_and_decrease();
        IFoneline ifoneline= new IFoneline();
        Expr expr= new Expr();
        String name;


        if( ctx.K_RETURN()!=null)
        {
            System.out.print(ctx.K_RETURN()+" ");
        }
        if(ctx.literal_value()!=null)
        {
            System.out.println(ctx.literal_value().getText());

            type.setName("Number");
            type.getName();
        }
        if(ctx.IDENTIFIER()!=null)
        {
            name=ctx.IDENTIFIER().getSymbol().getText();
            System.out.println(ctx.IDENTIFIER().getSymbol().getText());
            if(Main.symbolTable.get_last_Scope_is_open().serach_in_perant(name))
            {

            }
            type.setName("String");
            type.getName();
        }
        if(ctx.java_function_call_for_loop()!=null)
        {
            visitJava_function_call_for_loop(ctx.java_function_call_for_loop());
        }
        if(ctx.true_or_false()!=null)
        {
            System.out.println(ctx.true_or_false().getText());
            type.setName("Boolean");
            type.getName();
        }
        if(ctx.array_name()!=null)
        {
            visitArray_name(ctx.array_name());
        }
        if(ctx.increase_and_decrease()!=null)
        {
            in=visitIncrease_and_decrease(ctx.increase_and_decrease());
            returnG.setInrcAndDeces(in);
            type.setName("Number");
            type.getName();
        }
        if(ctx.expr()!=null)
        {
            expr= visitExpr(ctx.expr());
            returnG.setExpr(expr);
        }
        if(ctx.if_oneline_grammer()!=null)
        {
            ifoneline= visitIf_oneline_grammer(ctx.if_oneline_grammer());
            returnG.setiFoneline(ifoneline);
        }

        return returnG;
        //return super.visitReturn_grammer(ctx);
    }

    @Override
    public DoWhileGrammer visitDo_while_grammer(SQLParser.Do_while_grammerContext ctx) {
        System.out.println("visitDoWhile");
        DoWhileGrammer doWhileGrammer = new DoWhileGrammer();
        doWhileGrammer.setName("DoWhile");
        WhileHeader header= new WhileHeader();
        WhileBody body= new WhileBody();
            Scope scope_Do = new Scope();


            scope_Do.setScope_name("Do_While Scope");
            scope_Do.setParent(stack_scope.pop());
            doWhileGrammer.setScope(scope_Do);
            scope_Do.generate_id();

            stack_scope.push(scope_Do.getParent());
            stack_scope.push(scope_Do);

            Main.symbolTable.addScope(scope_Do);

        if(ctx.while_header_grammer()!=null && ctx.while_body_graammer()!= null){

            header= visitWhile_header_grammer(ctx.while_header_grammer());
            body= visitWhile_body_graammer(ctx.while_body_graammer());
        }

        stack_scope.pop();
        return doWhileGrammer;
        //return super.visitDo_while_grammer(ctx);
    }

    @Override
    public WhileCompaer visitWhile_comper(SQLParser.While_comperContext ctx) {

        WhileCompaer whileCompaer= new WhileCompaer();
        System.out.println("   signl :  "+ctx.getText());

        return whileCompaer;
        //return super.visitWhile_comper(ctx);
    }

    @Override
    public SwitchGrammer visitSwitch_grammer(SQLParser.Switch_grammerContext ctx) {
        System.out.println("visitSwitchGrammer");

        SwitchGrammer switchGrammer= new SwitchGrammer();
        List< LoopStatement>  loopStatements= new ArrayList<LoopStatement>();
        LoopStatement statement =new LoopStatement();

        List<CaseGrammer> caseGrammers= new ArrayList<CaseGrammer>();
        SwitchHeader switchHeader=new SwitchHeader();
        Scope scope_switch = new Scope();


        scope_switch.setScope_name("Switch Scope");
        scope_switch.setParent(stack_scope.pop());
        switchGrammer.setScope(scope_switch);
        scope_switch.generate_id();

        stack_scope.push(scope_switch.getParent());
        stack_scope.push(scope_switch);

        Main.symbolTable.addScope(scope_switch);

        if(ctx.switch_header_grammer()!= null)
        {
            switchHeader=visitSwitch_header_grammer(ctx.switch_header_grammer());
        }
        if(ctx.case_grammer()!=null)
        {
            for (int i=0 ;i<ctx.case_grammer().size(); i++) {

                caseGrammers.add(visitCase_grammer(ctx.case_grammer(i)));
                switchGrammer.setCaseGrammer(caseGrammers);
            }
        }


        if(ctx.list_loopStatement()!=null)
        {
            System.out.println("shitch body stmt");
            //   loopStatements=visitList_loopStatement(ctx.list_loopStatement());
            loopStatements = visitList_loopStatement(ctx.list_loopStatement());
            //   switchGrammer.setLoopStatements(loopStatements);
          //  switchGrammer.setStatement(statement);
       switchGrammer.setLoopStatements(loopStatements);
        }
        else
        {
            System.out.println("no stmt in switch body ");
            //    return null;
        }

        //   if(!ctx.case_grammer().isEmpty()) {
        //    System.out.println("h case");
        // for (int i = 0; i < ctx.case_grammer().size(); i++) {
        // if (ctx.case_grammer(0) != null)
        //{
        //  System.out.println("case m f");

        //}
        //}
        // }
        if(ctx.default_grammer()!=null)
        {
            visitDefault_grammer(ctx.default_grammer());
        }




        //

        switchGrammer.setCaseGrammer(caseGrammers);
        switchGrammer.setLoopStatements(loopStatements);

        stack_scope.pop();
        return  switchGrammer;
    }

    @Override
    public SwitchHeader visitSwitch_header_grammer(SQLParser.Switch_header_grammerContext ctx) {
        SwitchHeader switchHeader= new SwitchHeader();
        Expr expr = new Expr();
        System.out.println("conditions : "+ctx.getText());
        if (ctx.expr() != null) {
            expr=visitExpr(ctx.expr());
            String v;
            v=expr.getVar().getVariable();
            Main.symbolTable.get_last_Scope_is_open().serach_in_perant(v);
            switchHeader.setLine((ctx.getStart().getLine()));
            switchHeader.setCol(ctx.getStart().getCharPositionInLine());
            System.out.println("in line " + switchHeader.getLine());
            System.out.println("in column : " + switchHeader.getCol());
        }
        switchHeader.setCondition(ctx.getText());

        return switchHeader;
        //return super.visitSwitch_header_grammerr(ctx);
    }

    @Override
    public CaseGrammer visitCase_grammer(SQLParser.Case_grammerContext ctx) {
        System.out.println("visiCaseGrammer");

        CaseGrammer caseGrammer = new CaseGrammer();
       List <LoopStatement> statement= new ArrayList<>();
        Expr expr0 = new Expr();
        // System.out.println("case " + ctx.getText());
        Scope scope_case = new Scope();

        scope_case.setScope_name("Scope Case");
        scope_case.setParent(stack_scope.pop());
        caseGrammer.setScope(scope_case);

        stack_scope.push(scope_case.getParent());
        stack_scope.push(scope_case);

        Main.symbolTable.addScope(scope_case);

        if(ctx.expr()!=null)
        {
            expr0=visitExpr(ctx.expr());
            String v=expr0.getVar().getVariable();
            Main.symbolTable.get_last_Scope_is_open().serach_in_perant(v);
            caseGrammer.setLine((ctx.getStart().getLine()));
            caseGrammer.setCol(ctx.getStart().getCharPositionInLine());
            System.out.println("in line " + caseGrammer.getLine());
            System.out.println("in column : " + caseGrammer.getCol());
        }
        caseGrammer.setKCase("case");
        caseGrammer.setKBreak("braek");

        if(ctx.list_loopStatement()!=null)
        {
            statement = visitList_loopStatement(ctx.list_loopStatement());
        }

        stack_scope.pop();
        return caseGrammer;

        //return super.visitCase_grammer(ctx);
    }

    @Override
    public Object visitDefault_grammer(SQLParser.Default_grammerContext ctx) {
        System.out.println("visitDefaultGrammer");

        return super.visitDefault_grammer(ctx);
    }

    @Override
    public Var visitVar1(SQLParser.Var1Context ctx) {
        //  System.out.println("operation ");
        String name;
        String value;
        String fun_name;
        Var var=new Var();

        String operator;
        String expr;
        String rightexpr;

        if(ctx.column_name()!=null)
        {
            expr = ctx.column_name().any_name().IDENTIFIER().getSymbol().getText();
            System.out.println("    variable= " + expr);
            var.setVariable(expr);
            var.setType("String");
         //   System.out.println("expr column name :   "+var.getVariable() );
//            String columnName = var.getVariable();
//            Aggregationfunctionjar agg = new Aggregationfunctionjar();
//            agg.setColumnName(columnName);
            }
        if(ctx.literal_value()!=null)
        {
                if(ctx.literal_value().NUMERIC_LITERAL()!=null) {
                    expr = ctx.literal_value().NUMERIC_LITERAL().getSymbol().getText();
                    System.out.println("   value = " + expr);
                    var.setType("Number");
                  //  System.out.println("expr literal value  N  "+var.getType() );
                }

                if(ctx.literal_value().STRING_LITERAL()!=null) {
                    expr= ctx.literal_value().STRING_LITERAL().getSymbol().getText();
                    System.out.println(expr);
                    var.setType("String");
                  //  System.out.println("expr literal value  S  "+var.getType() );
                }
                if(ctx.literal_value().K_NULL()!=null)
                {
                    System.out.println(ctx.literal_value().K_NULL());
                }

                }
        if(ctx.function_expr()!=null)
        {
            if(ctx.function_expr().function_name().any_name().IDENTIFIER()!=null) {
                fun_name = ctx.function_expr().function_name().any_name().IDENTIFIER().getSymbol().getText();
                var.setFunc_name(fun_name);
             String aggName = var.getFunc_name();
                Aggregationfunctionjar agg = new Aggregationfunctionjar();
//                agg.setName(aggName);
                if(!Aggregationfunctionjar.Name1.contains(aggName))
                Aggregationfunctionjar.Name1.add(aggName);

            }
            if(ctx.function_expr().function_name().any_name().STRING_LITERAL()!=null)
            {
                fun_name = ctx.function_expr().function_name().any_name().STRING_LITERAL().getSymbol().getText();
                var.setFunc_name(fun_name);
            }
            if(ctx.function_expr().expr(0)!=null)
            {

//                Aggregationfunctionjar.ColumnName=ctx.function_expr().expr(0).getText();
                Aggregationfunctionjar.ColumnName1.add(ctx.function_expr().expr(0).getText());
                System.out.println("agg cloumn name =  "+ Aggregationfunctionjar.ColumnName1);

            }

        }


        // rightexpr = ctx.column_name().any_name().IDENTIFIER().getSymbol().getText();
        //   System.out.println("operation = " + rightexpr);


        // for (int i=0 ; i<ctx.expr().size();i+=2)
        //  if(ctx.expr().var1()!=null) {
        // visitAny_name(ctx.column_name().any_name());
        //  operator=ctx.opeeration().getText();
        //  System.out.println("orerator : "+ operator  );

        //  }

        return var;
        // return super.visitVar1(ctx);
    }


    @Override
    public String visitOpeeration(SQLParser.OpeerationContext ctx) {
        String opertor="";
        opertor=ctx.getText();
        System.out.println("    operator : "+opertor);
        return opertor;
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Java.AST.Error visitError(SQLParser.ErrorContext ctx) {

        Java.AST.Error error= new Java.AST.Error();

        return error;

        //  return visitChildren(ctx);
    } /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public List<Statement> visitSql_stmt_list(SQLParser.Sql_stmt_listContext ctx) {

        System.out.println("visitSql_stmt_list");

        List<Statement> sqlStmt = new ArrayList<Statement>();
        for (int i =0; i < ctx.sql_stmt().size() ; i++)
        {
           sqlStmt.add(visitSql_stmt(ctx.sql_stmt(i)));
        }


        return sqlStmt;
        //    return visitChildren(ctx);

    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */


    @Override public Statement visitSql_stmt(SQLParser.Sql_stmtContext ctx) {

        System.out.println("visitSql_stmt   ");
        Statement s = new Statement();


        if(ctx.drop_table_stmt()!=null)
        {
            s=visitDrop_stmt(ctx.drop_table_stmt());
            s.setName("Drop");
        }

        if(ctx.alter_table_stmt()!=null)
        {
            s = visitAlter_table_stmt(ctx.alter_table_stmt());
            s.setName("alter");
        }

        if(ctx.factored_select_stmt() != null){
            s = visitFactored_select_stmt(ctx.factored_select_stmt());
            s.setName("select");
        }
        if(ctx.delete_stmt()!=null)
        {
            s=visitDelete_stmt(ctx.delete_stmt());
            s.setName("Delete");
        }
        if(ctx.create_table_stmt()!=null)
        {
            s=visitCreate_table_stmt(ctx.create_table_stmt());
            s.setName("Create");
        }
        if(ctx.create_type()!=null)
        {
            s=visitCreate_type(ctx.create_type());
            s.setName("Create type");
        }




        return s;
//        return visitChildren(ctx);
    }







    @Override
    public Create_Type visitCreate_type(SQLParser.Create_typeContext ctx) {
        Create_Type create= new Create_Type();
        Database_Name database_name =new Database_Name();
        Table_Name table_name = new Table_Name();
        List<Column_Def> column_def= new ArrayList<>();
        List<Table_Constraint> table_Constraint= new ArrayList<>();
        Symbol symbol_c = new Symbol();
        create.setName("create type");
        System.out.println("visit Create type Stament");
        if(ctx.K_CREATE()!=null)
        {
        }
        if(ctx.K_TYPE()!=null)
        {
        }
        if(ctx.table_name()!=null)
        {
            table_name.setAny_name(ctx.table_name().any_name().IDENTIFIER().getSymbol().getText());
            create.setTable_name(table_name);
            System.out.println("tabel name  :"+ctx.table_name().any_name().IDENTIFIER().getSymbol().getText());
            symbol_c.getType().setName(ctx.table_name().any_name().IDENTIFIER().getSymbol().getText());
        }
        for(int i=0; i<ctx.column_def().size();i++) {
            if (ctx.column_def() != null)
            {
                column_def.add( visitColumn_def(ctx.column_def(i)) );
                create.setColumn_def(column_def);
            }
            if(ctx.create_type_value(i).K_STRING()!=null)
            {
                System.out.println("type of column is : "+ ctx.create_type_value(i).K_STRING().getSymbol().getText());
                Type type_S = new Type();
                type_S.setName("String");
                symbol_c.getType().add_Colunms(ctx.column_def(i).column_name().any_name().IDENTIFIER().getSymbol().getText(),type_S);

            }
            if(ctx.create_type_value(i).K_number()!=null)
            {
                System.out.println("type of column is : "+ ctx.create_type_value(i).K_number().getSymbol().getText());
                Type type_N =new Type();
                type_N.setName("Number");
                symbol_c.getType().add_Colunms(ctx.column_def(i).column_name().any_name().IDENTIFIER().getSymbol().getText(),type_N);

            }
            if(ctx.create_type_value(i).K_BOOLEAN()!=null)
            {
                System.out.println("type of column is : "+ ctx.create_type_value(i).K_BOOLEAN().getSymbol().getText());
                Type type_B = new Type();
                type_B.setName("Boolean");
                symbol_c.getType().add_Colunms(ctx.column_def(i).column_name().any_name().IDENTIFIER().getSymbol().getText(),type_B);
            }
            if(ctx.create_type_value(i).any_name_without_keyword()!=null)
            {
                System.out.println("type of column is : "+ ctx.create_type_value(i).any_name_without_keyword().getText());
                Type type_B = new Type();
                type_B.setName(ctx.create_type_value(i).any_name_without_keyword().getText());
                symbol_c.getType().add_Colunms(ctx.column_def(i).column_name().any_name().IDENTIFIER().getSymbol().getText(),type_B);
            }
        }
        symbol_c.setName("create_"+ctx.table_name().any_name().IDENTIFIER().getSymbol().getText());
        symbol_c.setScope(Main.symbolTable.get_last_Scope_is_open());
        symbol_c.setIsParam(false);
        Main.symbolTable.get_last_Scope_is_open().addSymbol(ctx.table_name().any_name().IDENTIFIER().getSymbol().getText(),symbol_c);
        Main.symbolTable.addType(symbol_c.getType());

        for(int i=0; i<ctx.table_constraint().size();i++) {
            if(ctx.table_constraint(i)!=null)
            {
                table_Constraint.add( visitTable_constraint(ctx.table_constraint(i)));
                create.setTable_constraints(table_Constraint);
            }
        }

        Main.symbolTable.getType().add("null");
        Main.symbolTable.getPath().add("null");
        return create;
    }

    public Drop_Table visitDrop_stmt(SQLParser.Drop_table_stmtContext ctx)
    {
        System.out.println("visit Drop_Table Statement");
        Drop_Table drop =new Drop_Table();
        if(ctx.K_IF() !=null)
        {
            drop.ifExists = true;
        }
        if(ctx.database_name()!= null)
        {
            drop.set_dataBaseName(ctx.database_name().any_name().IDENTIFIER().getSymbol().getText());
            System.out.println("database Name : "+drop.get_dataBaseName());
            drop.set_tableName(ctx.table_name().any_name().IDENTIFIER().getSymbol().getText());
            System.out.println("table Name : "+drop.get_tableName());
        }
        return  drop;
    }

    @Override
    public AlterStmt visitAlter_table_stmt(SQLParser.Alter_table_stmtContext ctx) {
        AlterStmt alterStmt= new AlterStmt();
        Database_Name database_name= new Database_Name();
        Table_Constraint table_constraint= new Table_Constraint();
        System.out.println("visit Alter Statement ");


        if(ctx.database_name()!=null)
        {
            //System.out.println("");
            database_name = visitDatabase_name(ctx.database_name());
            System.out.println("Database Name : " + database_name.getAny_name());
            alterStmt.setDatabase_name(database_name);
        }
        if(ctx.source_table_name()!=null)
        {
            System.out.println(" table Name : "+ctx.source_table_name().any_name().IDENTIFIER().getSymbol().getText());
        }
        if(ctx.new_table_name()!=null){
            System.out.println("visit_new_tableName : "+ ctx.new_table_name().any_name().IDENTIFIER().getSymbol().getText());
        }
        if(ctx.alter_table_add()!=null)
        {
            System.out.println("visit Alter Table add");
            if(ctx.alter_table_add().table_constraint()!=null)
            {
                    table_constraint= visitTable_constraint(ctx.alter_table_add().table_constraint());
                    alterStmt.setTable_constraint(table_constraint);
            }
        }
        if(ctx.alter_table_add_constraint()!=null)
        {
            System.out.println("visit alter table and constraint ");
            if(ctx.alter_table_add_constraint().any_name()!=null)
            {
                System.out.println("any name : "+ctx.alter_table_add_constraint().any_name().IDENTIFIER().getSymbol().getText());
            }
            if(ctx.alter_table_add_constraint().table_constraint()!=null)
            {
              table_constraint = visitTable_constraint(ctx.alter_table_add_constraint().table_constraint());
              alterStmt.setTable_constraint(table_constraint);
            }
        }


        return alterStmt;
    }


    @Override
    public CreateStmt visitCreate_table_stmt(SQLParser.Create_table_stmtContext ctx) {
        CreateStmt create= new CreateStmt();
        Database_Name database_name =new Database_Name();
        Table_Name table_name = new Table_Name();

        List<Column_Def> column_def= new ArrayList<>();
     //   Table_Constraint table_constraint= new Table_Constraint();
        List<Table_Constraint> table_Constraint= new ArrayList<>();

        Symbol symbol_c = new Symbol();


        create.setName("create");
        System.out.println("visit Create Stament");

        if(ctx.K_CREATE()!=null)
        {
           // System.out.print(ctx.K_CREATE()+"  ");
        }
        if(ctx.K_TABLE()!=null)
        {
           // System.out.print(ctx.K_TABLE()+"  ");
        }

   /*     if(ctx.database_name()!=null)
        {
            database_name.setAny_name(ctx.database_name().any_name().IDENTIFIER().getSymbol().getText());
            create.setDatabase_name(database_name);
           System.out.println("database name : "+ctx.database_name().any_name().IDENTIFIER().getSymbol().getText());
        }
        */

        if(ctx.table_name()!=null)
        {
//        if(ctx.column_def(0)!=null) {
//            // column_def.setName(ctx.column_def(0).column_name().any_name().IDENTIFIER().getSymbol().getText());
//            column_def.add(visitColumn_def(ctx.column_def(0)));
//            System.out.println("VisitColumnName :  " + ctx.column_def(0).column_name().any_name().IDENTIFIER().getSymbol().getText());
//
        table_name.setAny_name(ctx.table_name().any_name().IDENTIFIER().getSymbol().getText());
        create.setTable_name(table_name);
        System.out.println("tabel name  :"+ctx.table_name().any_name().IDENTIFIER().getSymbol().getText());
        //  type_create.setName(create.getTable_name().getAny_name());
        symbol_c.getType().setName(ctx.table_name().any_name().IDENTIFIER().getSymbol().getText());

    }

//        }



        for(int i=0; i<ctx.column_def().size();i++) {
            if (ctx.column_def(i) != null ) {
                  column_def.add( visitColumn_def(ctx.column_def(i)) );
                  create.setColumn_def(column_def);
                symbol_c.getType().colunms_name.add(create.getColumn_def().get(i).getName());

                  //  column_def.setName(ctx.column_def(i).column_name().any_name().IDENTIFIER().getSymbol().getText());
//               System.out.println("VisitColumnName :  " + ctx.column_def(i).column_name().any_name().IDENTIFIER().getSymbol().getText());
            }

            if(ctx.create_type_value(i).K_STRING()!=null)
            {
                System.out.println("type of column is : "+ ctx.create_type_value(i).K_STRING().getSymbol().getText());
                Type type_S = new Type();
                type_S.setName("String");
                symbol_c.getType().add_Colunms(ctx.column_def(i).column_name().any_name().IDENTIFIER().getSymbol().getText(),type_S);

            }
            if(ctx.create_type_value(i).K_number()!=null)
            {
                System.out.println("type of column is : "+ ctx.create_type_value(i).K_number().getSymbol().getText());
                Type type_N =new Type();
                type_N.setName("Number");
                symbol_c.getType().add_Colunms(ctx.column_def(i).column_name().any_name().getText(),type_N);

            }
            if(ctx.create_type_value(i).K_BOOLEAN()!=null)
            {
                System.out.println("type of column is : "+ ctx.create_type_value(i).K_BOOLEAN().getSymbol().getText());
                Type type_B = new Type();
                type_B.setName("Boolean");
                symbol_c.getType().add_Colunms(ctx.column_def(i).column_name().any_name().IDENTIFIER().getSymbol().getText(),type_B);
            }


            if(ctx.create_type_value(i).any_name_without_keyword()!=null)
            {
                System.out.println("type of column is : "+ ctx.create_type_value(i).any_name_without_keyword().getText());
                String name_type_table = ctx.create_type_value(i).any_name_without_keyword().getText();
                Type type_B = new Type();
                type_B.setName(ctx.create_type_value(i).any_name_without_keyword().getText());
                for (int j=0 ; j<Main.symbolTable.getDeclaredTypes().size() ; j++)
                {
                    if(name_type_table.equals(Main.symbolTable.getDeclaredTypes().get(j).getName()))
                    {
                        type_B.setColumns(Main.symbolTable.getDeclaredTypes().get(j).getColumns());
                    }
                }

                symbol_c.getType().add_Colunms(ctx.column_def(i).column_name().any_name().IDENTIFIER().getSymbol().getText(),type_B);

            }


        }
        symbol_c.setName("create_"+ctx.table_name().any_name().IDENTIFIER().getSymbol().getText());
        symbol_c.setScope(Main.symbolTable.get_last_Scope_is_open());
        symbol_c.setIsParam(false);
        Main.symbolTable.get_last_Scope_is_open().addSymbol(ctx.table_name().any_name().IDENTIFIER().getSymbol().getText(),symbol_c);

        Main.symbolTable.addType(symbol_c.getType());



        // for (int i=0; i<ctx.create_type_value().size() ; i++)
        {

               // type.setName(visitCreate_type_value1(ctx.create_type_value1(i)));
               // System.out.println("ccccctttt");

        }

        for(int i=0; i<ctx.table_constraint().size();i++) {

//            if (ctx.column_def() != null) {
//                column_def.setName(ctx.column_def(i).column_name().any_name().IDENTIFIER().getSymbol().getText());
//                System.out.println("VisitColumnName :  " + ctx.column_def(i).column_name().any_name().IDENTIFIER().getSymbol().getText());
//
//           }

            if(ctx.table_constraint(i)!=null)
            {
                table_Constraint.add( visitTable_constraint(ctx.table_constraint(i)));
                create.setTable_constraints(table_Constraint);


//                System.out.println("visit table constraint");
//                if(ctx.table_constraint(i).table_constraint_primary_key()!=null)
//                {
//                    table_constraint.setPrimaryKey(ctx.table_constraint(i).table_constraint_primary_key().indexed_column(0).column_name().any_name().IDENTIFIER().getSymbol().getText());
//                    System.out.println("visit primaryKey : "+table_constraint.getPrimaryKey());
////                    for (int j=0; j<ctx.table_constraint(i).table_constraint_primary_key().indexed_column().size(); j++)
////                    {
//                    //    System.out.println("Primary Key : " + ctx.table_constraint(i).table_constraint_primary_key().indexed_column(j));
//
////                    }
//                }
//                if(ctx.table_constraint(i).table_constraint_foreign_key()!=null)
//                {
//                    table_constraint.setForgainKey(ctx.table_constraint(i).table_constraint_foreign_key().getText());
//                    System.out.println("visit foreign Key : "+table_constraint.getForgainKey());
//                }
//                if(ctx.table_constraint(i).table_constraint_unique()!=null)
//                {
//                    table_constraint.setUnique(ctx.table_constraint(i).table_constraint_unique().getText());
//                    System.out.println(table_constraint.getUnique());
//                }
            }
        }

        if(ctx.K_TYPE()!=null)
        {
            if(ctx.csv_s()!=null  && ctx.K_PATH()!=null )
            {
              //  System.out.println("yyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyy");
                String p="";
                String t= ctx.csv_s().getText();
                if(ctx.any_name().IDENTIFIER()!=null) {
                    p = ctx.any_name().IDENTIFIER().getSymbol().getText();
                }
                 if(ctx.any_name().STRING_LITERAL()!=null)
                {
                    p= ctx.any_name().STRING_LITERAL().getSymbol().getText();
                }
                System.out.println(t+"    "+p);
              //  Main.symbolTable.add_type_path(p,t);
                Main.symbolTable.getType().add(t);
                Main.symbolTable.getPath().add(p);
                Main.symbolTable.getAccpet().add(true);
            }
            if(ctx.json_s()!=null && ctx.K_PATH()!=null)
            {
                String j= ctx.json_s().getText();
                String p="";//= ctx.any_name().IDENTIFIER().getSymbol().getText();
                if(ctx.any_name().IDENTIFIER()!=null) {
                    p = ctx.any_name().IDENTIFIER().getSymbol().getText();
                }
                if(ctx.any_name().STRING_LITERAL()!=null)
                {
                    p= ctx.any_name().STRING_LITERAL().getSymbol().getText();
                }

                System.out.println(j+"    "+p);
              //  Main.symbolTable.add_type_path(p,j);
                Main.symbolTable.getType().add(j);
                Main.symbolTable.getPath().add(p);
            }
        }
        else {
            Main.symbolTable.getPath().add("null");
            Main.symbolTable.getType().add("null");
        }



        return create;
        //return super.visitCreate_table_stmt(ctx);
    }
/*
    @Override
    public String visitCreate_type_value(SQLParser.Create_type_value1Context ctx) {
        String type_column;
        type_column=ctx.getText();
        return type_column;
       // return super.visitCreate_type_value1(ctx);
    }*/

//    @Override
//    public String visitCreate_type_value1(SQLParser.Create_type_valueContext ctx) {
//                String type_column="null";
//                if(ctx.K_STRING()!=null){
//                    type_column= ctx.K_STRING().getSymbol().getText();
//                }
//                if(ctx.K_number()!=null)
//                {
//                    type_column= ctx.K_number().getSymbol().getText();
//                }
//                if(ctx.K_BOOLEAN()!=null)
//                {
//                    type_column=ctx.K_BOOLEAN().getSymbol().getText();
//                }

//        type_column=ctx.getText();
//
//        return type_column;
//    }

    @Override
    public Column_Def  visitColumn_def(SQLParser.Column_defContext ctx) {
        Column_Def column_def= new Column_Def();
        column_def.setName(ctx.column_name().any_name().getText());


        if(ctx.column_name().any_name().IDENTIFIER()!=null) {
            System.out.println("visitColumnDefult : " + ctx.column_name().any_name().getText());
        }
//        if(ctx.column_name().any_name().keyword()!=null)
//        {
//            System.out.println("visitColumnDefult :  " + ctx.column_name().any_name().keyword().getText());
//        }if(ctx.column_name().any_name().!=null)
//        {
//            System.out.println("visitColumnDefult :  " + ctx.column_name().any_name().keyword().getText());
//        }


        return column_def;
    }

    @Override
    public Table_Constraint visitTable_constraint(SQLParser.Table_constraintContext ctx) {
        System.out.println("visit Table Constraint");

        Table_Constraint table_constraint= new Table_Constraint();
        if(ctx.table_constraint_primary_key()!=null) {
            System.out.println("visit table_constraint_primary_key");
            for (int i = 0; i < ctx.table_constraint_primary_key().indexed_column().size(); i++) {
                System.out.println(" praimry Key : " + ctx.table_constraint_primary_key().indexed_column(i).column_name().any_name().IDENTIFIER().getSymbol().getText());
                table_constraint.setPrimaryKey(ctx.table_constraint_primary_key().indexed_column(i).column_name().any_name().IDENTIFIER().getSymbol().getText());
            }
        }
        if(ctx.table_constraint_foreign_key()!=null)
        {
            System.out.println("visit table_constraint_foreign_key");
            for (int i =0 ;i<ctx.table_constraint_foreign_key().fk_origin_column_name().size() ; i++ ) {
                System.out.println("foregin key : " + ctx.table_constraint_foreign_key().fk_origin_column_name(i).column_name().any_name().IDENTIFIER().getSymbol().getText());
            table_constraint.setForgainKey(ctx.table_constraint_foreign_key().fk_origin_column_name(i).column_name().any_name().IDENTIFIER().getSymbol().getText());
            }
            }
        if(ctx.table_constraint_unique()!=null) {
            System.out.println("visit table_constraint_unique ");
            for (int i = 0; i < ctx.table_constraint_unique().indexed_column().size(); i++) {
                System.out.println(" uniqe : " + ctx.table_constraint_unique().indexed_column(i).column_name().any_name().IDENTIFIER().getSymbol().getText());
            table_constraint.setUnique(ctx.table_constraint_unique().indexed_column(i).column_name().any_name().IDENTIFIER().getSymbol().getText());
            }
        }


            return table_constraint;
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */




    @Override
    public DeleteStmt visitDelete_stmt(SQLParser.Delete_stmtContext ctx) {
        System.out.println("visit Delelt Statement");
        System.out.println("visit table");

        DeleteStmt delete= new DeleteStmt();
        Expr expr=new Expr();
        //System.out.println(ctx.getText());
        delete.setName("delete");
        //    System.out.print("delete ");
        if(ctx.K_FROM()!=null)
        {
            //     System.out.print(ctx.K_FROM()+" ");
            delete.setK_from("from");
        }
        if(ctx.qualified_table_name()!=null)
        {        if(ctx.qualified_table_name().database_name()!=null)
        {
            System.out.println(ctx.qualified_table_name().database_name().any_name().IDENTIFIER().getSymbol().getText()+".");
        }
            if(ctx.qualified_table_name().table_name()!=null)
            {
                System.out.println(ctx.qualified_table_name().table_name().any_name().IDENTIFIER().getSymbol().getText());
            }
            if(ctx.qualified_table_name().K_INDEXED() !=null && ctx.qualified_table_name().K_BY() !=null && ctx.qualified_table_name().index_name()!=null)
            {
                System.out.print(ctx.qualified_table_name().K_INDEXED().getSymbol().getText());
                System.out.print(ctx.qualified_table_name().K_BY().getSymbol().getText());
                System.out.println(ctx.qualified_table_name().index_name().any_name().IDENTIFIER().getSymbol().getText());
            }
            if(ctx.qualified_table_name().K_NOT() !=null&& ctx.qualified_table_name().K_INDEXED()!=null)
            {
                System.out.println(ctx.qualified_table_name().K_NOT().getSymbol().getText());
                System.out.println(ctx.qualified_table_name().K_INDEXED().getSymbol().getText());
            }
        }
        if(ctx.K_WHERE()!=null && ctx.expr()!=null)
        {

            System.out.println("visit Expr");
            expr=visitExpr(ctx.expr());
        }

        return delete;
        // return super.visitDelete_stmt(ctx);
    }





    @Override public  SelectStmt visitSelect_stmt(SQLParser.Select_stmtContext ctx) {
        System.out.println("visitSelect_stmt");

        SelectStmt selectStmt = new SelectStmt();

        List<Ordering_Terms> ordering_terms = new ArrayList<>();

        selectStmt.setSelect_or_value(visitSelect_or_values(ctx.select_or_values()));

        if(!ctx.ordering_term().isEmpty())
        {
            for(int i=0;i<ctx.ordering_term().size();i++)
            {

                ordering_terms.add(visitOrdering_term(ctx.ordering_term(i)));

            }

            selectStmt.setOrdering_terms(ordering_terms);
        }


        if(ctx.expr() != null){

            for(int i=0 ; i<ctx.expr().size() ; i++) {

                selectStmt.set_Expr(visitExpr(ctx.expr(i)));

            }

        }
        return selectStmt;

    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Statement visitFactored_select_stmt(SQLParser.Factored_select_stmtContext ctx)
    {
        System.out.println("visitFactored_select_stmt");
        Statement statement= new Statement();
        Factored_Select_Stmt factored_select_stmt=new Factored_Select_Stmt();
        Select_Or_Value select_or_value= new Select_Or_Value();
        List<Ordering_Terms> ordering_terms=new ArrayList<>();
        List<Expr> exprs= new ArrayList<>();



        if(ctx.select_or_values()!=null){

            select_or_value = visitSelect_or_values(ctx.select_or_values());
           // factored_select_stmt.setSelect_or_value(visitSelect_or_values(ctx.select_or_values()));
                factored_select_stmt.setSelect_or_value(select_or_value);
                factored_select_stmt.setType(select_or_value.getType());
                statement.setType(select_or_value.getType());
        }

        if(ctx.K_ORDER() != null && ctx.K_BY()!=null)
        {
            //
        }
        if(!ctx.ordering_term().isEmpty())
        {
            for(int i=0; i<ctx.ordering_term().size() ; i++)
            {
                ordering_terms.add(visitOrdering_term(ctx.ordering_term(i)));
            }
            factored_select_stmt.setOrdering_terms(ordering_terms);
        }

        if(ctx.K_LIMIT()!=null)
        {
            //
        }

        if(ctx.expr()!=null)
        {
            for (int i = 0; i < ctx.expr().size(); i++) {
                exprs.add(visitExpr(ctx.expr(i)));
                factored_select_stmt.setExpr(exprs);
            }
        }

        return factored_select_stmt;
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public Join_Operator visitJoin_operator(SQLParser.Join_operatorContext ctx) {
        System.out.println("visitJoin_operator");
        Join_Operator join_operator=new Join_Operator();
        join_operator.setK_LEFT(ctx.K_LEFT().getSymbol().getText());
        if(ctx.K_OUTER()!=null)
        {
            join_operator.setK_OUTER(ctx.K_OUTER().getSymbol().getText());
            if(ctx.K_INNER()!=null)
                join_operator.setK_INNER(ctx.K_INNER().getSymbol().getText());

        }
        join_operator.setK_JOIN(ctx.K_JOIN().getSymbol().getText());

        return join_operator;
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Join_Constraints visitJoin_constraint(SQLParser.Join_constraintContext ctx) {
        System.out.println("visitJoin_constraint");
        Join_Constraints join_constraints=new Join_Constraints();
        if(ctx.expr()!=null)
        {
            join_constraints.setExpr(visitExpr(ctx.expr()));
        }
        return join_constraints;
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */

    @Override
    public Join_Clause visitJoin_clause(SQLParser.Join_clauseContext ctx) {
        System.out.println("visitJoin_clause");

        Join_Clause join_clause=new Join_Clause();
        List<Table_Or_Subquery>table_or_subquery=new ArrayList<>();
        List<Join_Operator>join_operators=new ArrayList<>();
        List<Join_Constraints>join_constraints=new ArrayList<>();


        if(ctx.table_or_subquery(0)!=null)
        {
            table_or_subquery.add(visitTable_or_subquery(ctx.table_or_subquery(0)));
        }

            for(int i=0;i<ctx.join_operator().size();i++)
            {
                //if (!ctx.join_operator().isEmpty()) {
                if(ctx.join_operator(i)!=null)
                {

                //    join_operators.add(visitJoin_operator(ctx.join_operator(i)));
                System.out.println("visit join operator  :  "+ctx.join_constraint(i).getText());

                }
                    //join_clause.setJoin_operator(join_operators);
                if(ctx.table_or_subquery(i+1)!=null)
                {
                    table_or_subquery.add(visitTable_or_subquery(ctx.table_or_subquery(i+1)));
                    join_clause.setTable_or_subquery(table_or_subquery);

                }
                if(ctx.join_constraint(i)!=null)
                {
                    join_constraints.add(visitJoin_constraint(ctx.join_constraint(i)));
                    join_clause.setJoin_constraints(join_constraints);

                }

            }


//        if(!ctx.table_or_subquery().isEmpty()) {
//            for(int i=0;i<ctx.table_or_subquery().size();i++)
//                table_or_subquery.add(visitTable_or_subquery(ctx.table_or_subquery(i)));
//
//        }



//        if(!ctx.join_constraint().isEmpty()) {
//            for(int i=0;i<ctx.join_constraint().size();i++)
//                join_constraints.add(visitJoin_constraint(ctx.join_constraint(i)));
//
//
//        }

        return join_clause;

    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public  Object visitCommon_table_expression(SQLParser.Common_table_expressionContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public  Select_Or_Value visitSelect_or_values(SQLParser.Select_or_valuesContext ctx) {
        System.out.println("visitSelect_or_values");
        Select_Or_Value select_or_value = new Select_Or_Value();
        List<Result_Columns>result_columns=new ArrayList<>();
        List<Table_Or_Subquery>table_or_subquery=new ArrayList<>();
        Join_Clause join_clause= new Join_Clause();
        List<Expr>exprs = new ArrayList<>();
        Expr expr= new Expr();



        List<String> columns_name = new ArrayList<>();
        String table_n="";
        Type type_columns= new Type();
        Type type_old_column = new Type();


        if(!ctx.result_column().isEmpty())
        {
            for(int i=0;i<ctx.result_column().size();i++)
            {
                    result_columns.add(visitResult_column(ctx.result_column(i)));

            //    type_r.setColumns(ctx.result_column(i).expr().column_name().any_name().IDENTIFIER().getSymbol().getText(),);
               // type_r.setName(ctx.result_column(i).expr().column_name().any_name().IDENTIFIER().getSymbol().getText()+"_");
             //   type_r.add_Colunms();
            }
            select_or_value.setResult_columns(result_columns);

        }

        if(ctx.K_FROM()!=null)
        {


        }
        if(!ctx.table_or_subquery().isEmpty())
        {
            for(int i=0;i<ctx.table_or_subquery().size();i++)
            {

                if(ctx.table_or_subquery(i)!=null)
                {
                    table_or_subquery.add(visitTable_or_subquery(ctx.table_or_subquery(i)));
                }
            }
            select_or_value.setTable_or_subquery(table_or_subquery);
        }

        if(ctx.join_clause()!=null)
        {
            join_clause= visitJoin_clause(ctx.join_clause());
            select_or_value.setJoin_clause(join_clause);
            String first_table="", sec_table="" , join="";
//            System.out.println("join L ");
            if(ctx.join_clause().table_or_subquery(0).table_name()!=null)
            {
                first_table=ctx.join_clause().table_or_subquery(0).table_name().getText();
                join_clause.setFirst_table(first_table);
                System.out.println("fir table  = "+ first_table);
            }
            if(ctx.join_clause().table_or_subquery(1).table_name().getText()!=null)
            {
                sec_table = ctx.join_clause().table_or_subquery(1).table_name().getText();
                System.out.println("seco table  =   "+ sec_table);
                join_clause.setSec_table(sec_table);
            }
            if(ctx.join_clause().join_operator(0)!=null){
                join = ctx.join_clause().join_operator(0).getText();
                join_clause.setJoin_oper(join);
                System.out.println("join == "+ join);
            }

        }

    if (ctx.K_WHERE() != null)
            {
                if (ctx.expr(0) != null) {
                    System.out.println("where  :  ");
                    expr = visitExpr(ctx.expr(0));
                    exprs.add(expr);

                    // System.out.println("null =  :  " + expr.getVar().getVariable());
//        System.out.println(" where name  f =  "+ ctx.expr(0).expr(0).getText()); //.var1().column_name().any_name().IDENTIFIER().getSymbol().getText() );
//                    System.out.println(" where name  c =  "+ expr.getVar().getVariable());
//                    System.out.println(" where name  col =  "+ expr.getCoumn_name());

//                    System.out.println("expr(0) =  "+ctx.expr(0).getText());
                    String first_operatre="";
                    String var1="", var2="",var3="" , opre1="";
                    String var_one=" ", var_tow=" ", var_thr=" " ,value_one=" ", value_tow=" " , opre_in_one=" ",opre_in_tow=" " , opre_out=" ";


                    if(ctx.expr(0).opeeration()!=null)
                    {
                    // value tow
                        if(ctx.expr(0).expr(1)!=null)
                        {
                            value_tow= ctx.expr(0).expr(1).getText();
                        }

                        // one var & value
                        if(ctx.expr(0).expr(0)!=null)
                        {
                            var_one = ctx.expr(0).expr(0).getText();
                            if(ctx.expr(0).expr(0).expr(0)!=null)
                            {
                                var_one = ctx.expr(0).expr(0).expr(0).getText();
                                if(ctx.expr(0).expr(0).expr(0).expr(0)!=null)
                                {
                                 var_one = ctx.expr(0).expr(0).expr(0).expr(0).getText();
                                }
                                if(ctx.expr(0).expr(0).expr(0).expr(1)!=null)
                                {
                                 value_one = ctx.expr(0).expr(0).expr(0).expr(1).getText();
                                }

                                // operatre in_one
                             if(ctx.expr(0).expr(0).expr(0).opeeration()!=null)
                             {
                                 opre_in_one=ctx.expr(0).expr(0).expr(0).opeeration().getText();
                                 if(ctx.expr(0).expr(0).expr(0).opeeration().K_AND()!=null)
                                 {
                                     opre_in_one="&&";
                                 }
                                 if(ctx.expr(0).expr(0).expr(0).opeeration().K_OR()!=null)
                                 {
                                     opre_in_one=" || ";
                                 }
                                 if(ctx.expr(0).expr(0).expr(0).opeeration().K_LIKE()!=null)
                                 {
                                     opre_in_one=".contains(\""+value_one.substring(1 ,value_one.length()-1)+"\")";
                                 }
                                 if(ctx.expr(0).expr(0).expr(0).opeeration().K_IN()!=null)
                                 {
                                     opre_in_one=" == ";
                                 }
                                 if(ctx.expr(0).expr(0).expr(0).opeeration().ASSIGN()!=null)
                                {
                                     opre_in_one =" == ";
                                }
                             }

                            }
                    // operatre inner
                        if(ctx.expr(0).expr(0).opeeration()!=null)
                        {
                            if(ctx.expr(0).expr(0).opeeration().K_AND()!=null)
                            {
                                opre_out="&&";
                            }
                            if(ctx.expr(0).expr(0).opeeration().K_OR()!=null)
                            {
                                opre_out=" || ";
                            }
                            if(ctx.expr(0).expr(0).opeeration().K_LIKE()!=null)
                            {
                                opre_out=".contains(\""+value_tow.substring(1,value_tow.length()-1)+"\")";
                            }
                            if(ctx.expr(0).expr(0).opeeration().K_IN()!=null)
                            {
                                opre_out=" == ";
                            }if(ctx.expr(0).expr(0).opeeration().ASSIGN()!=null)
                            {
                                opre_out=" == ";
                            }
                        }
                // var three;
                        if(ctx.expr(0).expr(0).expr(1)!=null)
                        {
                            var_tow=ctx.expr(0).expr(0).expr(1).getText();
                            if(ctx.expr(0).expr(0).expr(1).table_name()!=null)
                            var_thr= ctx.expr(0).expr(0).expr(1).table_name().getText();

                            if(ctx.expr(0).expr(0).expr(1).column_name()!=null)
                            var_tow= ctx.expr(0).expr(0).expr(1).column_name().getText();
                        }

                        }

                // operatre out ;
                        if(ctx.expr(0).opeeration()!=null)
                        {
                            opre_in_tow=ctx.expr(0).opeeration().getText();
                            if(ctx.expr(0).opeeration().K_AND()!=null)
                            {
                                opre_in_tow="&&";
                            }
                            if(ctx.expr(0).opeeration().K_OR()!=null)
                            {
                                opre_in_tow=" || ";
                            }
                            if(ctx.expr(0).opeeration().K_LIKE()!=null)
                            {
                                opre_in_tow=".contains(\""+value_tow.substring(1,value_tow.length()-1)+"\")";
                            }
                            if(ctx.expr(0).opeeration().K_IN()!=null)
                            {
                                opre_in_tow=" == ";
                            }
                            if(ctx.expr(0).opeeration().ASSIGN()!=null)
                            {
                            opre_in_tow=" == ";
                            }

                        }


                System.out.println("v1 =  "+var_one );
                System.out.println("v2 =  "+var_tow);
                System.out.println("v3 =  "+var_thr);
                System.out.println("op_in_one  = "+opre_in_one);
                System.out.println("op_in_tow  = "+opre_in_tow);
                System.out.println("op_out  = "+opre_out);
                System.out.println("val1 =  "+value_one);
                System.out.println("val2  =  "+value_tow);
                System.out.println("--------------");

                String part_one="",part_tow="";
                if(opre_in_one.contains(".contains("))
                {
                    part_one= var_one+opre_in_one;
                }
                else {
                    part_one = var_one + opre_in_one + value_one;
                }
//                if(!var2.equals(""))
                if(opre_in_tow.contains(".contains("))
                {

                    part_tow=var_tow+opre_in_tow;
                }
                else {
                    part_tow= var_tow + opre_in_tow + value_tow;
                }
                if(!var2.equals(" ") )
                {

                        if(opre_in_tow.contains(".contains("))
                    {
                        System.out.println("dfdf");
                        part_tow= ""+var_tow + opre_in_tow ;
                    }

                    if(opre_in_tow.contains(".contains(") && opre_in_one.contains(".contains("))
                    {
                        System.out.println("vvvv");
                        part_tow= ".data.get(i)."+var_tow + opre_in_tow ;

                    }
                    if(!opre_in_tow.contains(".contains(") && !opre_in_tow.contains("<=") ) {
                        System.out.println("m");
                        part_tow = ".data.get(i)." + var_tow + opre_in_tow+value_tow;
                    }

                }
                if(var_thr.equals(" ") && !opre_in_tow.contains(".contains(")  )
                {
                    var_thr=Main.symbolTable.getCondition().get(0);

                }


//                Main.symbolTable.getCondition().add(1,var_one + opre_in_one +value_one+ opre_out+ var_thr+ ".data.get(i)"+ opre_in_tow +value_tow );
                Main.symbolTable.getCondition().add(1,part_one + opre_out+ var_thr+ part_tow );
                System.out.println("cond =  "+Main.symbolTable.getCondition());
                    }
                    // in (d,d)

                    if(ctx.expr(0).K_IN()!=null)
                    {
                        System.out.println("in rr");
                        opre_in_tow="==";
                        opre_out="&&";
                        String part_tow="";

                        if(ctx.expr(0).expr(0)!=null) {
//                            System.out.println("sss");
                            if(ctx.expr(0).expr(0).database_name()!=null)
                            {
                                var_one = ctx.expr(0).expr(0).database_name().getText();
                                part_tow=var_one + ".data.get(i).";
                            }

                            if(ctx.expr(0).expr(0).table_name()!=null)
                            {
                                var_tow  = ctx.expr(0).expr(0).table_name().getText() ;
                                part_tow+=var_tow+".";
                            }

                            if(ctx.expr(0).expr(0).column_name()!=null)
                            {
                                var_thr = ctx.expr(0).expr(0).column_name().getText();
                                part_tow +=var_thr+" ";
                            }

                        }
                        if(ctx.expr(0).expr(1)!=null) {
                            value_one = ctx.expr(0).expr(1).getText();
                            if(value_one.startsWith("'"))
                            {
                                value_one="\""+value_one.substring(1,value_one.length()-1)+"\"";
                            }
                        }
                        if(ctx.expr(0).expr(2)!=null) {
                            value_tow = ctx.expr(0).expr(2).getText();
                            if(value_tow.startsWith("'"))
                            {
                                value_tow="\"" +value_tow.substring(1,value_tow.length()-1)+"\"";
                            }
                        }

                        System.out.println("v1 =  "+var_one );
                        System.out.println("v2 =  "+var_tow);
                        System.out.println("v3 =  "+var_thr);
                        System.out.println("op_in_one  = "+opre_in_one);
                        System.out.println("op_in_tow  = "+opre_in_tow);
                        System.out.println("op_out  = "+opre_out);
                        System.out.println("val1 =  "+value_one);
                        System.out.println("val2  =  "+value_tow);
                        System.out.println("--------------");

                        Main.symbolTable.getCondition().add(1, part_tow +opre_in_tow + value_one + opre_out +part_tow +opre_in_tow + value_tow );

                    }







////////////////
                    if(ctx.expr(0).expr(0)!=null)
                    {
                        Main.symbolTable.search_in_tables(ctx.expr(0).expr(0).getText());
                    }
                    if(expr.getVar().getFunc_name()!=null)
                    {
                        Main.symbolTable.search_in_tables(expr.getVar().getFunc_name());
                    }
                }
            }

        if(!ctx.expr().isEmpty())
        {
            for (int i=1 ; i<ctx.expr().size() ; i++)
            exprs.add(visitExpr(ctx.expr(i)));
        }
        select_or_value.setExpr(exprs);

        /*
        * type select
        *    ||
        *    ||
        *    ||
        *  \    /
        *   \  /
        *    \/
        * */

        if(!ctx.table_or_subquery().isEmpty())
        if(ctx.table_or_subquery(0).table_name().any_name().IDENTIFIER()!=null)
        {
            table_n=ctx.table_or_subquery(0).table_name().any_name().IDENTIFIER().getSymbol().getText();
            // System.out.println("table_n   : "  + table_n);
        }


        if(ctx.result_column(0).STAR()==null)
        {
            Type temp0 = new Type(); temp0.setName("Number");
            Type temp_ = new Type();
            for (int i=0 ;i<ctx.result_column().size() ;i++)
            {
//                System.out.println("coulumn in select =   "+result_columns.get(i).getExpr().getVar().getVariable() );
               if(Main.symbolTable.search_type_of_column(table_n,result_columns.get(i).getExpr().getVar().getVariable()) != null) {
                   columns_name.add(result_columns.get(i).getExpr().getVar().getVariable());
               }
// update for join run   \||/ just last if
//                        \/
            if(ctx.result_column(i).expr().var1()!=null)
                if(ctx.result_column(i).expr().var1().function_expr()!=null)
                {
                    expr=visitExpr(ctx.result_column(i).expr());
//                    System.out.println("column in select fu  =  "+ctx.result_column(i).expr().var1().function_expr()
//                    .function_name().any_name().IDENTIFIER().getSymbol().getText());

                    if(ctx.result_column(i).expr().var1().function_expr().function_name().any_name().IDENTIFIER()!=null)
                    {
//                        System.out.println("function expr ");
                        for(int k=0 ; k<Main.symbolTable.getDeclaredTypes().size() ; k++) {

                            if (Main.symbolTable.getDeclaredTypes().get(k).getName().equals(table_n))
                            {

                                if(ctx.result_column(i).expr().var1().function_expr().STAR()!=null) {
                                    System.out.println("* is here   " );
                                    temp_.setColumns(Main.symbolTable.getDeclaredTypes().get(k).getColumns());
//
//                                    temp_.add_Colunms(ctx.result_column(i).expr().var1().function_expr().function_name().any_name().IDENTIFIER().getSymbol().getText() + "_*", temp0);
//                               Main.symbolTable.getDeclaredTypes().get(k).getColumns().put(ctx.result_column(i).column_alias().IDENTIFIER().getSymbol().getText()+"",temp_);
                                    select_or_value.setType(temp_);
                                }
                                else {
                                    for (int j=0 ; j<ctx.result_column(i).expr().var1().function_expr().expr().size() ; j++)
                                    {
//                                      System.out.println("* is not null x =  "+ctx.result_column(i).expr().var1().function_expr().expr(j).getText());
                                      temp_.add_Colunms(ctx.result_column(i).expr().var1().function_expr().expr(j).getText() , temp0);
                                    }
//                                    for(int p=0 ;p< ctx.result_column(i).expr().var1().function_expr().expr().size() ; p++)
//                                    temp_.add_Colunms(ctx.result_column(i).expr().var1().function_expr().function_name().any_name().IDENTIFIER().getSymbol().getText() + "_" +
//                                            ctx.result_column(i).expr().var1().function_expr().expr(p).getText()+"", temp0);
                                              select_or_value.setType(Main.symbolTable.getDeclaredTypes().get(k));
//                                    System.out.println("temp_  =  " + temp_.getColumns() );
                                    select_or_value.setType(temp_);

                                }
                            }
                        }

//                        ctx.result_column(i).column_alias().IDENTIFIER().getSymbol().getText();
//                      if(ctx.result_column(i).column_alias().IDENTIFIER()!=null)
                      {
//                          columns_name.add(ctx.result_column(i).column_alias().IDENTIFIER().getSymbol().getText()+"");
//                          for(int k=0 ; k<Main.symbolTable.getDeclaredTypes().size() ; k++) {
//
//                              if (Main.symbolTable.getDeclaredTypes().get(k).getName().equals(table_n))
//                              {
//                                  Type temp0 = new Type(); temp0.setName("Number");
//                                  Type temp_ = new Type();
//                                  temp_.add_Colunms(ctx.result_column(i).column_alias().IDENTIFIER().getSymbol().getText()+"", temp0);
////                               Main.symbolTable.getDeclaredTypes().get(k).getColumns().put(ctx.result_column(i).column_alias().IDENTIFIER().getSymbol().getText()+"",temp_);
//                                  select_or_value.setType(temp_);
//                              }
//                          }


                      }
//                      if(ctx.result_column(i).column_alias().STRING_LITERAL()!= null)
                      {
//                          columns_name.add(ctx.result_column(i).column_alias().IDENTIFIER().getSymbol().getText()+"");
//                          for(int k=0 ; k<Main.symbolTable.getDeclaredTypes().size() ; k++) {
//
//                           if (Main.symbolTable.getDeclaredTypes().get(k).getName().equals(table_n))
//                           {
//                               Type temp0 = new Type(); temp0.setName("Number");
//                               Type temp_ = new Type();
//
//                                    temp_.add_Colunms(ctx.result_column(i).column_alias().IDENTIFIER().getSymbol().getText()+"", temp0);
////                               Main.symbolTable.getDeclaredTypes().get(k).getColumns().put(ctx.result_column(i).column_alias().IDENTIFIER().getSymbol().getText()+"",temp_);
//                                select_or_value.setType(temp_);
//                           }
//                          }
                      }

                    }
                }

            }
            // we must save select-columns here !!
//            System.out.println("columns  =  "+columns_name);
        }
        else
            {
//                System.out.println("1");
            for (int i=0 ;i<Main.symbolTable.getDeclaredTypes().size() ; i++)
            {
                // System.out.println("2 : "+Main.symbolTable.getDeclaredTypes().size());
                if( Main.symbolTable.getDeclaredTypes().get(i).getName().equals(table_n))
                {
//                    System.out.println("table = "+Main.symbolTable.getDeclaredTypes().get(i).getName() );
                    type_columns=Main.symbolTable.getDeclaredTypes().get(i);
                   // type_columns.equle(Main.symbolTable.getDeclaredTypes().get(i));
                    // type_columns.setColumns(Main.symbolTable.getDeclaredTypes().get(i).getColumns());
                  //  type_columns.setName("m_s");
                  //  System.out.println("type  : "+type_columns.getName());
                }
            }
                select_or_value.setType(type_columns);
        }
            for (int i=0 ; i<result_columns.size() ; i++) {

                if (ctx.result_column(i).expr() != null ) {
                    if(ctx.result_column(i).expr().table_name()!=null && ctx.result_column(i).expr().column_name()!=null)
                    {
                        columns_name.add(ctx.result_column(i).expr().column_name().getText());
                    }

                }
            }
///.
/*
* agg fun is here
*   ||
*   ||
* \ || /
*  \  /
*   \/
*
* */




        if(!columns_name.isEmpty())
        {
//            System.out.println("colume name not null");
//            System.out.println("colume name size  = "+columns_name.size());
//            System.out.println("colume name   = "+columns_name);
            for (int i=0 ; i<columns_name.size() ; i++) {
//                System.out.println("in for ffff "+i);
                if (Main.symbolTable.search_type_of_column(table_n, columns_name.get(i)) != null) {
//                    System.out.println("colume name is add 1 = "+columns_name.get(i));
                   type_old_column= Main.symbolTable.search_type_of_column(table_n, columns_name.get(i));
                    type_columns.add_Colunms(columns_name.get(i),type_old_column);
                }
//                if  (Main.symbolTable.search_type_of_column(join_clause.getFirst_table(), columns_name.get(0)) != null) {
//                    System.out.println("colume name is add  = "+columns_name.get(i));
//                    type_old_column= Main.symbolTable.search_type_of_column(table_n, columns_name.get(0));
//                    type_columns.add_Colunms(columns_name.get(i),type_old_column);
//                }
            }
            select_or_value.setType(type_columns);
//            System.out.println(" type select.columns 1 ==  "+ select_or_value.getType().getColumns());

        }
        else {
//            System.out.println("elseeeeeeeee");
                for(int i=0 ; i<result_columns.size() ; i++ )
                {
//                    if(result_columns.get(i).getSTAR()==null) {
                        if (!result_columns.get(i).getFunc_name().isEmpty()) {
//                            System.out.println("result columns . funcname b3bbb3b");

//                            for (int k = 0; k < result_columns.get(i).getFunc_name().size(); k++) {
//                                System.out.println("is fucking add " + result_columns.get(i).getFunc_name().get(k));
//                                columns_name.add(result_columns.get(i).getColumn_aliae());
//                            }
                            type_old_column.setName("Number");// = Main.symbolTable.search_type_of_column(join_clause.getFirst_table(), columns_name.get(0));
                            type_old_column.setColumns(null);
                            type_columns.add_Colunms(result_columns.get(i).getColumn_aliae(), type_old_column);


                        }

                        if(ctx.result_column(i).expr()!=null)
                        if(ctx.result_column(i).expr().var1()!=null)
                        if(ctx.result_column(i).expr().var1().function_expr()!=null)
                        if(ctx.result_column(i).expr().var1().function_expr().STAR()!=null)
                        {
//                            System.out.println("star result columns b3b3b3 ");
//
                            type_old_column.setName("Number");// = Main.symbolTable.search_type_of_column(join_clause.getFirst_table(), columns_name.get(0));
                            type_old_column.setColumns(null);
                            type_columns.add_Colunms(result_columns.get(i).getColumn_aliae(), type_old_column);

                        }

                }
            select_or_value.setType(type_columns);
//            System.out.println(" type select.columns 2 ==  "+ select_or_value.getType().getColumns());
        }


        return  select_or_value ;
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public  Ordering_Terms visitOrdering_term(SQLParser.Ordering_termContext ctx) {
        System.out.println("visitOrdering_term");
        Ordering_Terms ordering_terms = new Ordering_Terms();


       if(ctx.expr()!=null)
       {
           ordering_terms.setExpr(visitExpr(ctx.expr()));
       }
        if(ctx.collation_name()!=null)
        {
            if(ctx.K_COLLATE()!=null)
            {
                //
            }
            ordering_terms.setCollation_name(ctx.collation_name().any_name().IDENTIFIER().getSymbol().getText());
            System.out.println("collation name  :  "+ctx.collation_name().any_name().IDENTIFIER().getSymbol().getText());
        }
        return ordering_terms ;
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public  Result_Columns visitResult_column(SQLParser.Result_columnContext ctx) {
        System.out.println("visitResult_column");
        Result_Columns result_columns=new Result_Columns();
        // Type type= new Type();
       // Type type1= new Type();
        if(ctx.table_name()!=null)
        {
//            System.out.println("ta");
            result_columns.setTable_name(visitTable_name(ctx.table_name()));

            Main.symbolTable.get_last_Scope_is_open().serach_in_perant(result_columns.getName());

        }
        if(ctx.STAR()!=null)
        {
           // System.out.println("Stttttttttttttttttttttttttar");
            result_columns.setSTAR("*");
        }
        if(ctx.expr()!=null)
        {
//            System.out.println("res.exp");
            result_columns.setExpr(visitExpr(ctx.expr()));
            Main.symbolTable.search_in_tables(result_columns.getExpr().getVar().getVariable());
            if(ctx.expr().var1()!=null)
            {
                if(ctx.expr().var1().function_expr()!=null) {
//                    System.out.println("1.1");
                    for(int i=0 ; i<ctx.expr().var1().function_expr().expr().size() ; i++) {
//                        System.out.println("1."+i);
                        if (ctx.expr().var1().function_expr().expr(i).var1().column_name() != null) {
                            result_columns.getFunc_name().add(ctx.expr().var1().function_expr().expr(i).var1().column_name().getText());
//                            System.out.println("add expe func -_- "+ctx.expr().var1().function_expr().expr(i).var1().column_name().getText());
                        }
                    }
                }
            }


        }

        if(ctx.column_alias()!=null)
        {
//            result_columns.setColumn_alias(visitColumn_alias(ctx.column_alias()));
            result_columns.setColumn_aliae(ctx.column_alias().getText());
            System.out.println("column alias = "+ result_columns.getColumn_aliae());
        }



        return result_columns;
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Table_Alias visitTable_alias(SQLParser.Table_aliasContext ctx) {
        System.out.println("visitTable_alias");

        Table_Alias table_alias=new Table_Alias();
        if (ctx.any_name() != null) {
            if(ctx.any_name().IDENTIFIER()!=null){
            table_alias.setAny_name(ctx.any_name().IDENTIFIER().getSymbol().getText());
            System.out.println("table alias :  " + table_alias.getAny_name());
        }
            if(ctx.any_name().keyword()!=null)
            {
                table_alias.setAny_name(ctx.any_name().keyword().getText());
                System.out.println(" key word:  " + table_alias.getAny_name());
            }

        }
        return table_alias;
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */

    @Override public Table_Or_Subquery visitTable_or_subquery(SQLParser.Table_or_subqueryContext ctx) {

        System.out.println("visitTable_or_subquery");
        Table_Or_Subquery table_or_subquery=new Table_Or_Subquery();
        List<Table_Or_Subquery> table_or_subqueries =new ArrayList<>();

        if(ctx.database_name()!=null)
        {
            table_or_subquery.setDatabase_name(visitDatabase_name(ctx.database_name()));
        }
        if(ctx.table_name()!=null)
        {
           table_or_subquery.setTable_name(visitTable_name(ctx.table_name()));
          //  table_or_subquery.setTable_alias(visitTable_alias(ctx.table_alias()));
           // System.out.println("tsddddddddddddddddddddddd: "+table_or_subquery.getTable_name().getAny_name());
            Main.symbolTable.search_in_table(table_or_subquery.getTable_name().getAny_name());
            Main.symbolTable.getCondition().add(0,ctx.table_name().getText());

        }

        if(ctx.table_alias()!=null)
        {
            table_or_subquery.setTable_alias(visitTable_alias(ctx.table_alias()));
        }

        if(ctx.index_name()!=null)
        {
            table_or_subquery.setIndex_name(visitIndex_name(ctx.index_name()));
        }

        if(!ctx.table_or_subquery().isEmpty())
        {
            for(int i=0; i<ctx.table_or_subquery().size() ; i++)
            {
                table_or_subqueries.add(visitTable_or_subquery(ctx.table_or_subquery(i)));
            }
            table_or_subquery.setTable_or_subquery(table_or_subqueries);
            }

        if(ctx.join_clause()!=null)
        {
            table_or_subquery.setJoin_clause(visitJoin_clause(ctx.join_clause()));

        }
//        if(ctx..table_alias(1)!=null)
//        {
//            table_or_subquery.setTable_alias(visitTable_alias(ctx.table_alias()));
//        }


        if(ctx.select_stmt()!=null)
        {
            table_or_subquery.setSelectStmt(visitSelect_stmt(ctx.select_stmt()));
        }
//        if(ctx.table_alias()!=null)
//        {
//            table_or_subquery.setTable_alias(visitTable_alias(ctx.table_alias()));
//        }

        return table_or_subquery;
    }


    /**
     * {@inheritDoc}
     *
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public  Column_Alias visitColumn_alias(SQLParser.Column_aliasContext ctx) {
        System.out.println("visitColumn_alias");
        Column_Alias column_alias=new Column_Alias();
        if(ctx.IDENTIFIER()!=null)
        {
            System.out.println("column alias = "+ ctx.IDENTIFIER().getSymbol().getText());
            column_alias.setCollation_name(ctx.IDENTIFIER().getSymbol().getText());
        }
        if(ctx.STRING_LITERAL()!=null)
        {
            System.out.println("column alias  = "+ctx.STRING_LITERAL().getSymbol().getText());
        }
        return column_alias;
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public  Object visitColumn_name(SQLParser.Column_nameContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public  Table_Name visitTable_name(SQLParser.Table_nameContext ctx) {
        System.out.print ("visitTable_name  :  ");
        Table_Name table_name=new Table_Name();
        if(ctx.any_name()!=null)
        {
            table_name.setAny_name(ctx.any_name().IDENTIFIER().getSymbol().getText());
            System.out.println("table name  :  "+table_name.getAny_name());
        }

        return table_name;
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public  Database_Name visitDatabase_name(SQLParser.Database_nameContext ctx) {
        System.out.print("visitDatabase_name   :  ");
        Database_Name database_name = new Database_Name();
       // System.out.println("-----------------------------");
        database_name.setAny_name(ctx.any_name().IDENTIFIER().getSymbol().getText());
        System.out.println(database_name.getAny_name());

        return database_name;
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */


    @Override
    public  Index_Name visitIndex_name(SQLParser.Index_nameContext ctx)
    {
        System.out.println("visitIndexed_name");
        Index_Name index_name=new Index_Name();
        index_name.setAny_name(ctx.any_name().any_name().IDENTIFIER().getSymbol().getText());
        System.out.println(" Indexed Name  =  "+ index_name.getAny_name());
        return index_name;
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public  Object visitCollation_name(SQLParser.Collation_nameContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public  Object visitLiteral_value(SQLParser.Literal_valueContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public  Object visitAny_name(SQLParser.Any_nameContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public  Object visitKeyword(SQLParser.KeywordContext ctx) { return visitChildren(ctx); }




    @Override
    public ParametersList visitParameters_list(SQLParser.Parameters_listContext ctx) {

        System.out.println("visitParametersList");

        ParametersList parametersList= new ParametersList();
        List<Parms> parms= new ArrayList<Parms>();
        List<prams_with_ingth> prams_with_ingths = new ArrayList<prams_with_ingth>();

        for (int i=0;i< ctx.parms().size();i++ )
        {
            // if(!ctx.parms().isEmpty())
            parametersList.add(visitParms(ctx.parms(i)));
            parametersList.setParms(parms);
        }
        for (int j=0;j<ctx.prams_with_ingth().size() ;j++)
        if(ctx.prams_with_ingth(j)!=null)
        {
          prams_with_ingths.add(visitPrams_with_ingth(ctx.prams_with_ingth(j)));
            parametersList.setPrams_with_ingths(prams_with_ingths);
        }
        parametersList.setParms(parms);

        //  if(!parms.isEmpty())
        //{

        //  }

        //    parametersList.add(visitParms(ctx.parms(0)));

        //        parametersList.setLine(ctx.getStart().getLine());
        //      parametersList.setCol(ctx.getStart().getCharPositionInLine());

        return  parametersList;
        //return super.visitParameters_list(ctx);
    }

    @Override
    public Parms visitParms(SQLParser.ParmsContext ctx) {

        System.out.println("visitParms");
        Parms parms= new Parms() ;

        parms.setKeyWord("var ");
        System.out.print("var ");
        System.out.println(ctx.any_name_without_keyword().IDENTIFIER().getSymbol().getText());

        parms.setName(ctx.any_name_without_keyword().IDENTIFIER().getSymbol().getText());
        parms.setValue(ctx.getAltNumber());
            //System.out.println(ctx.getAltNumber());
        return  parms;
        // return super.visitParms(ctx);
    }

    @Override
    public prams_with_ingth visitPrams_with_ingth(SQLParser.Prams_with_ingthContext ctx) {
        Type type=new Type();
        System.out.println();
        prams_with_ingth prams = new prams_with_ingth();
        Expr expr=new Expr();
        if( ctx.K_VAR()!=null)
        {
            System.out.print("var  ");
        }

        if(ctx.any_name_without_keyword()!=null)
        {
            System.out.print(ctx.any_name_without_keyword().IDENTIFIER().getSymbol().getText() +" = ");
        }
        if(ctx.NUMERIC_LITERAL()!=null)
        {
            System.out.println(ctx.NUMERIC_LITERAL().getSymbol().getText());
            type.setName("Number");
            System.out.println("the type is : "+type.getName());
        }
        if(ctx.expr()!=null)
        {
            // System.out.println("prams expr");
            expr= visitExpr(ctx.expr());
            prams.setExpr(expr);
        }


        return prams;
       // return super.visitP rams_with_ingth(ctx);
    }

    @Override
    public Expr visitExpr1(SQLParser.Expr1Context ctx) {
        Expr expr=new Expr();
        List<Expr> listexpr= new ArrayList<Expr>();

        Var var =new Var();
        String operator="";
        String var1;
    /*    if(ctx.OPEN_PAR()!=null)
        {
            System.out.print("(");
        }
        if(ctx.CLOSE_PAR()!=null)
        {
            System.out.print(")");
        }*/
//





        return expr;
        // return visitChildren(ctx);
    }




    @Override
    public Expr visitExpr(SQLParser.ExprContext ctx) {
        //  System.out.println("VisitExpr");
        Expr expr=new Expr();
        List<Expr> listexpr= new ArrayList<Expr>();

        Var var =new Var();
        String operator="";
        String column_name="";

    /*    if(ctx.OPEN_PAR()!=null)
        {
            System.out.print("(");
        }
        if(ctx.CLOSE_PAR()!=null)
        {
            System.out.print(")");
        }*/
        if(ctx.column_name()!=null)
        {

         if(ctx.column_name().any_name().STRING_LITERAL()!=null)
         {
             column_name=ctx.column_name().any_name().STRING_LITERAL().getSymbol().getText();
             System.out.println("visit column name =  "+ column_name);
             expr.setCoumn_name(column_name);
         }
          if(ctx.column_name().any_name().IDENTIFIER()!=null)
          {
              column_name = ctx.column_name().any_name().IDENTIFIER().getSymbol().getText();
              System.out.println("visit column name =  "+column_name);
              expr.setCoumn_name(column_name);
          }
          if(ctx.column_name().any_name().keyword()!=null)
          {
              column_name = ctx.column_name().any_name().keyword().getText();
              System.out.println("visit column name =  "+column_name);
              expr.setCoumn_name(column_name);
          }
        }

        if(ctx.var1()!=null)
        {
            var=visitVar1(ctx.var1());
            // System.out.println(ctx.var1().column_name().any_name().IDENTIFIER().getSymbol().getText());
            expr.setVar(var);
            expr.setType(var.getType());
         //   System.out.println("expr var1  "+var.getType() );
        }
    if(!ctx.expr().isEmpty() )
        {

            //     System.out.println(ctx.expr(0));
            for (int i=0;i< ctx.expr().size(); i+=2)
            {
                listexpr.add(visitExpr(ctx.expr(i)));
                if(ctx.opeeration()!=null)
                {
                    // System.out.println("operator : "+ctx.opeeration().getText());
                    operator = visitOpeeration(ctx.opeeration());
                    // expr.setOperator(operator);
                }
                if(ctx.expr(i+1)!=null)
                listexpr.add(visitExpr(ctx.expr(i+1)));


            }



        }





        return expr;
        // return visitChildren(ctx);
    }

}


