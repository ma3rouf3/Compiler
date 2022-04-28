package Java;



import Java.AST.Parse;
import Java.Base.BaseVisitor;
import Java.SymbolTable.SymbolTable;
import Java.codeGeneration.*;
import generated.SQLLexer;
import generated.SQLParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;

import static org.antlr.v4.runtime.CharStreams.fromFileName;

public class Main {


    public static SymbolTable symbolTable = new SymbolTable();


    public static void main(String[] args) {
        try {
            String source = "samples//samples.txt";
            CharStream cs = fromFileName(source);
            SQLLexer lexer = new SQLLexer(cs);
            CommonTokenStream token  = new CommonTokenStream(lexer);
            SQLParser parser = new SQLParser(token);
            ParseTree tree = parser.parse();

            Parse p = (Parse) new BaseVisitor().visit(tree);
          //  Parse Psymbol = (Parse) new BaseVisitor() ;


            //    System.out.println(p.toString());
            if(p.getFunctions().size()>0)
            {
              //  for (int i=0 ;i<p.getFunctions().size(); i++)
                System.out.println(p.toStringfun());
            }

            if(p.getSqlStmts().size()>0)
            {
                System.out.println(p.toString());
            }

            WriteClass write = new WriteClass();
//            System.out.println("in main  : "+symbolTable.getType());
//            System.out.println("in main  : "+symbolTable.getPath());
           write.write(symbolTable.getType() ,symbolTable.getPath());
//            write.print_faculty();
//            write.print_json_abd();
//          write.load_json("C:\\Users\\Ma3roof\\Desktop\\json\\Data\\Colors.json");

//            write.loader("d");
//                write.print_test();
//            Faculties faculties=new Faculties();
//            Java.codeGeneration.var_cl var_cl= new var_cl();
//            var_cl.print();

//          var_c var_c= new var_c();
//          var_c.print();
                var_x var_x= new var_x();
//                var_x.print();
//            System.out.println("cond in main =  "+symbolTable.getCondition());

        }
        catch (IOException e){ //| ParseException e) {
            e.printStackTrace();
        }
    }
}
