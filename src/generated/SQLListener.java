// Generated from C:/Users/Ma3roof/IdeaProjects/myAST/src\SQL.g4 by ANTLR 4.7.2
package generated;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SQLParser}.
 */
public interface SQLListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SQLParser#parse}.
	 * @param ctx the parse tree
	 */
	void enterParse(SQLParser.ParseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#parse}.
	 * @param ctx the parse tree
	 */
	void exitParse(SQLParser.ParseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#error}.
	 * @param ctx the parse tree
	 */
	void enterError(SQLParser.ErrorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#error}.
	 * @param ctx the parse tree
	 */
	void exitError(SQLParser.ErrorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#sql_stmt_list}.
	 * @param ctx the parse tree
	 */
	void enterSql_stmt_list(SQLParser.Sql_stmt_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#sql_stmt_list}.
	 * @param ctx the parse tree
	 */
	void exitSql_stmt_list(SQLParser.Sql_stmt_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#sql_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSql_stmt(SQLParser.Sql_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#sql_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSql_stmt(SQLParser.Sql_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#create_aggerationt_function}.
	 * @param ctx the parse tree
	 */
	void enterCreate_aggerationt_function(SQLParser.Create_aggerationt_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#create_aggerationt_function}.
	 * @param ctx the parse tree
	 */
	void exitCreate_aggerationt_function(SQLParser.Create_aggerationt_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#params_agg_fun}.
	 * @param ctx the parse tree
	 */
	void enterParams_agg_fun(SQLParser.Params_agg_funContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#params_agg_fun}.
	 * @param ctx the parse tree
	 */
	void exitParams_agg_fun(SQLParser.Params_agg_funContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#jar_path}.
	 * @param ctx the parse tree
	 */
	void enterJar_path(SQLParser.Jar_pathContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#jar_path}.
	 * @param ctx the parse tree
	 */
	void exitJar_path(SQLParser.Jar_pathContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#class_name}.
	 * @param ctx the parse tree
	 */
	void enterClass_name(SQLParser.Class_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#class_name}.
	 * @param ctx the parse tree
	 */
	void exitClass_name(SQLParser.Class_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#method_name}.
	 * @param ctx the parse tree
	 */
	void enterMethod_name(SQLParser.Method_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#method_name}.
	 * @param ctx the parse tree
	 */
	void exitMethod_name(SQLParser.Method_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#return_type}.
	 * @param ctx the parse tree
	 */
	void enterReturn_type(SQLParser.Return_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#return_type}.
	 * @param ctx the parse tree
	 */
	void exitReturn_type(SQLParser.Return_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#params}.
	 * @param ctx the parse tree
	 */
	void enterParams(SQLParser.ParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#params}.
	 * @param ctx the parse tree
	 */
	void exitParams(SQLParser.ParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#create_type}.
	 * @param ctx the parse tree
	 */
	void enterCreate_type(SQLParser.Create_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#create_type}.
	 * @param ctx the parse tree
	 */
	void exitCreate_type(SQLParser.Create_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#create_type_value}.
	 * @param ctx the parse tree
	 */
	void enterCreate_type_value(SQLParser.Create_type_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#create_type_value}.
	 * @param ctx the parse tree
	 */
	void exitCreate_type_value(SQLParser.Create_type_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#create_type_value1}.
	 * @param ctx the parse tree
	 */
	void enterCreate_type_value1(SQLParser.Create_type_value1Context ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#create_type_value1}.
	 * @param ctx the parse tree
	 */
	void exitCreate_type_value1(SQLParser.Create_type_value1Context ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#number_k}.
	 * @param ctx the parse tree
	 */
	void enterNumber_k(SQLParser.Number_kContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#number_k}.
	 * @param ctx the parse tree
	 */
	void exitNumber_k(SQLParser.Number_kContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#string_k}.
	 * @param ctx the parse tree
	 */
	void enterString_k(SQLParser.String_kContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#string_k}.
	 * @param ctx the parse tree
	 */
	void exitString_k(SQLParser.String_kContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#boolean_k}.
	 * @param ctx the parse tree
	 */
	void enterBoolean_k(SQLParser.Boolean_kContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#boolean_k}.
	 * @param ctx the parse tree
	 */
	void exitBoolean_k(SQLParser.Boolean_kContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#print_grammer}.
	 * @param ctx the parse tree
	 */
	void enterPrint_grammer(SQLParser.Print_grammerContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#print_grammer}.
	 * @param ctx the parse tree
	 */
	void exitPrint_grammer(SQLParser.Print_grammerContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#printG}.
	 * @param ctx the parse tree
	 */
	void enterPrintG(SQLParser.PrintGContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#printG}.
	 * @param ctx the parse tree
	 */
	void exitPrintG(SQLParser.PrintGContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#java_function_declaration_List}.
	 * @param ctx the parse tree
	 */
	void enterJava_function_declaration_List(SQLParser.Java_function_declaration_ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#java_function_declaration_List}.
	 * @param ctx the parse tree
	 */
	void exitJava_function_declaration_List(SQLParser.Java_function_declaration_ListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#java_function_declaration}.
	 * @param ctx the parse tree
	 */
	void enterJava_function_declaration(SQLParser.Java_function_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#java_function_declaration}.
	 * @param ctx the parse tree
	 */
	void exitJava_function_declaration(SQLParser.Java_function_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#java_function_header}.
	 * @param ctx the parse tree
	 */
	void enterJava_function_header(SQLParser.Java_function_headerContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#java_function_header}.
	 * @param ctx the parse tree
	 */
	void exitJava_function_header(SQLParser.Java_function_headerContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#java_function_call}.
	 * @param ctx the parse tree
	 */
	void enterJava_function_call(SQLParser.Java_function_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#java_function_call}.
	 * @param ctx the parse tree
	 */
	void exitJava_function_call(SQLParser.Java_function_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#java_function_call_for_var}.
	 * @param ctx the parse tree
	 */
	void enterJava_function_call_for_var(SQLParser.Java_function_call_for_varContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#java_function_call_for_var}.
	 * @param ctx the parse tree
	 */
	void exitJava_function_call_for_var(SQLParser.Java_function_call_for_varContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#java_function_call_for_var1}.
	 * @param ctx the parse tree
	 */
	void enterJava_function_call_for_var1(SQLParser.Java_function_call_for_var1Context ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#java_function_call_for_var1}.
	 * @param ctx the parse tree
	 */
	void exitJava_function_call_for_var1(SQLParser.Java_function_call_for_var1Context ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#java_function_call_for_loop}.
	 * @param ctx the parse tree
	 */
	void enterJava_function_call_for_loop(SQLParser.Java_function_call_for_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#java_function_call_for_loop}.
	 * @param ctx the parse tree
	 */
	void exitJava_function_call_for_loop(SQLParser.Java_function_call_for_loopContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#java_function_body}.
	 * @param ctx the parse tree
	 */
	void enterJava_function_body(SQLParser.Java_function_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#java_function_body}.
	 * @param ctx the parse tree
	 */
	void exitJava_function_body(SQLParser.Java_function_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#loops_body}.
	 * @param ctx the parse tree
	 */
	void enterLoops_body(SQLParser.Loops_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#loops_body}.
	 * @param ctx the parse tree
	 */
	void exitLoops_body(SQLParser.Loops_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#list_loopStatement}.
	 * @param ctx the parse tree
	 */
	void enterList_loopStatement(SQLParser.List_loopStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#list_loopStatement}.
	 * @param ctx the parse tree
	 */
	void exitList_loopStatement(SQLParser.List_loopStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#loopStatement}.
	 * @param ctx the parse tree
	 */
	void enterLoopStatement(SQLParser.LoopStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#loopStatement}.
	 * @param ctx the parse tree
	 */
	void exitLoopStatement(SQLParser.LoopStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#higher_order_function}.
	 * @param ctx the parse tree
	 */
	void enterHigher_order_function(SQLParser.Higher_order_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#higher_order_function}.
	 * @param ctx the parse tree
	 */
	void exitHigher_order_function(SQLParser.Higher_order_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#return_body}.
	 * @param ctx the parse tree
	 */
	void enterReturn_body(SQLParser.Return_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#return_body}.
	 * @param ctx the parse tree
	 */
	void exitReturn_body(SQLParser.Return_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#array_Intill_grammer}.
	 * @param ctx the parse tree
	 */
	void enterArray_Intill_grammer(SQLParser.Array_Intill_grammerContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#array_Intill_grammer}.
	 * @param ctx the parse tree
	 */
	void exitArray_Intill_grammer(SQLParser.Array_Intill_grammerContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#parameters_list}.
	 * @param ctx the parse tree
	 */
	void enterParameters_list(SQLParser.Parameters_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#parameters_list}.
	 * @param ctx the parse tree
	 */
	void exitParameters_list(SQLParser.Parameters_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#arguments_list}.
	 * @param ctx the parse tree
	 */
	void enterArguments_list(SQLParser.Arguments_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#arguments_list}.
	 * @param ctx the parse tree
	 */
	void exitArguments_list(SQLParser.Arguments_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#arguments_list_body}.
	 * @param ctx the parse tree
	 */
	void enterArguments_list_body(SQLParser.Arguments_list_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#arguments_list_body}.
	 * @param ctx the parse tree
	 */
	void exitArguments_list_body(SQLParser.Arguments_list_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#parms}.
	 * @param ctx the parse tree
	 */
	void enterParms(SQLParser.ParmsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#parms}.
	 * @param ctx the parse tree
	 */
	void exitParms(SQLParser.ParmsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#prams_with_ingth}.
	 * @param ctx the parse tree
	 */
	void enterPrams_with_ingth(SQLParser.Prams_with_ingthContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#prams_with_ingth}.
	 * @param ctx the parse tree
	 */
	void exitPrams_with_ingth(SQLParser.Prams_with_ingthContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#while_grammer}.
	 * @param ctx the parse tree
	 */
	void enterWhile_grammer(SQLParser.While_grammerContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#while_grammer}.
	 * @param ctx the parse tree
	 */
	void exitWhile_grammer(SQLParser.While_grammerContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#while_body_graammer}.
	 * @param ctx the parse tree
	 */
	void enterWhile_body_graammer(SQLParser.While_body_graammerContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#while_body_graammer}.
	 * @param ctx the parse tree
	 */
	void exitWhile_body_graammer(SQLParser.While_body_graammerContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#do_while_grammer}.
	 * @param ctx the parse tree
	 */
	void enterDo_while_grammer(SQLParser.Do_while_grammerContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#do_while_grammer}.
	 * @param ctx the parse tree
	 */
	void exitDo_while_grammer(SQLParser.Do_while_grammerContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#while_header_grammer}.
	 * @param ctx the parse tree
	 */
	void enterWhile_header_grammer(SQLParser.While_header_grammerContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#while_header_grammer}.
	 * @param ctx the parse tree
	 */
	void exitWhile_header_grammer(SQLParser.While_header_grammerContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#while_header_grammer1}.
	 * @param ctx the parse tree
	 */
	void enterWhile_header_grammer1(SQLParser.While_header_grammer1Context ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#while_header_grammer1}.
	 * @param ctx the parse tree
	 */
	void exitWhile_header_grammer1(SQLParser.While_header_grammer1Context ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#ll1}.
	 * @param ctx the parse tree
	 */
	void enterLl1(SQLParser.Ll1Context ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#ll1}.
	 * @param ctx the parse tree
	 */
	void exitLl1(SQLParser.Ll1Context ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#if_oneline_grammer}.
	 * @param ctx the parse tree
	 */
	void enterIf_oneline_grammer(SQLParser.If_oneline_grammerContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#if_oneline_grammer}.
	 * @param ctx the parse tree
	 */
	void exitIf_oneline_grammer(SQLParser.If_oneline_grammerContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#if_oneline_signl_grammer}.
	 * @param ctx the parse tree
	 */
	void enterIf_oneline_signl_grammer(SQLParser.If_oneline_signl_grammerContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#if_oneline_signl_grammer}.
	 * @param ctx the parse tree
	 */
	void exitIf_oneline_signl_grammer(SQLParser.If_oneline_signl_grammerContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#true_or_false}.
	 * @param ctx the parse tree
	 */
	void enterTrue_or_false(SQLParser.True_or_falseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#true_or_false}.
	 * @param ctx the parse tree
	 */
	void exitTrue_or_false(SQLParser.True_or_falseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#if_grammer1}.
	 * @param ctx the parse tree
	 */
	void enterIf_grammer1(SQLParser.If_grammer1Context ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#if_grammer1}.
	 * @param ctx the parse tree
	 */
	void exitIf_grammer1(SQLParser.If_grammer1Context ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#if_else_grammer}.
	 * @param ctx the parse tree
	 */
	void enterIf_else_grammer(SQLParser.If_else_grammerContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#if_else_grammer}.
	 * @param ctx the parse tree
	 */
	void exitIf_else_grammer(SQLParser.If_else_grammerContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#if_grammer}.
	 * @param ctx the parse tree
	 */
	void enterIf_grammer(SQLParser.If_grammerContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#if_grammer}.
	 * @param ctx the parse tree
	 */
	void exitIf_grammer(SQLParser.If_grammerContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#if_header_grammer}.
	 * @param ctx the parse tree
	 */
	void enterIf_header_grammer(SQLParser.If_header_grammerContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#if_header_grammer}.
	 * @param ctx the parse tree
	 */
	void exitIf_header_grammer(SQLParser.If_header_grammerContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#foreach_grammer}.
	 * @param ctx the parse tree
	 */
	void enterForeach_grammer(SQLParser.Foreach_grammerContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#foreach_grammer}.
	 * @param ctx the parse tree
	 */
	void exitForeach_grammer(SQLParser.Foreach_grammerContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#foreach_header_grammer}.
	 * @param ctx the parse tree
	 */
	void enterForeach_header_grammer(SQLParser.Foreach_header_grammerContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#foreach_header_grammer}.
	 * @param ctx the parse tree
	 */
	void exitForeach_header_grammer(SQLParser.Foreach_header_grammerContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#for_grammer}.
	 * @param ctx the parse tree
	 */
	void enterFor_grammer(SQLParser.For_grammerContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#for_grammer}.
	 * @param ctx the parse tree
	 */
	void exitFor_grammer(SQLParser.For_grammerContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#for_header}.
	 * @param ctx the parse tree
	 */
	void enterFor_header(SQLParser.For_headerContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#for_header}.
	 * @param ctx the parse tree
	 */
	void exitFor_header(SQLParser.For_headerContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#switch_grammer}.
	 * @param ctx the parse tree
	 */
	void enterSwitch_grammer(SQLParser.Switch_grammerContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#switch_grammer}.
	 * @param ctx the parse tree
	 */
	void exitSwitch_grammer(SQLParser.Switch_grammerContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#switch_header_grammer}.
	 * @param ctx the parse tree
	 */
	void enterSwitch_header_grammer(SQLParser.Switch_header_grammerContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#switch_header_grammer}.
	 * @param ctx the parse tree
	 */
	void exitSwitch_header_grammer(SQLParser.Switch_header_grammerContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#case_grammer}.
	 * @param ctx the parse tree
	 */
	void enterCase_grammer(SQLParser.Case_grammerContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#case_grammer}.
	 * @param ctx the parse tree
	 */
	void exitCase_grammer(SQLParser.Case_grammerContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#default_grammer}.
	 * @param ctx the parse tree
	 */
	void enterDefault_grammer(SQLParser.Default_grammerContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#default_grammer}.
	 * @param ctx the parse tree
	 */
	void exitDefault_grammer(SQLParser.Default_grammerContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#var_grammer0}.
	 * @param ctx the parse tree
	 */
	void enterVar_grammer0(SQLParser.Var_grammer0Context ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#var_grammer0}.
	 * @param ctx the parse tree
	 */
	void exitVar_grammer0(SQLParser.Var_grammer0Context ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#var_grammer}.
	 * @param ctx the parse tree
	 */
	void enterVar_grammer(SQLParser.Var_grammerContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#var_grammer}.
	 * @param ctx the parse tree
	 */
	void exitVar_grammer(SQLParser.Var_grammerContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#var_grammer2}.
	 * @param ctx the parse tree
	 */
	void enterVar_grammer2(SQLParser.Var_grammer2Context ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#var_grammer2}.
	 * @param ctx the parse tree
	 */
	void exitVar_grammer2(SQLParser.Var_grammer2Context ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#var_3}.
	 * @param ctx the parse tree
	 */
	void enterVar_3(SQLParser.Var_3Context ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#var_3}.
	 * @param ctx the parse tree
	 */
	void exitVar_3(SQLParser.Var_3Context ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#var_4}.
	 * @param ctx the parse tree
	 */
	void enterVar_4(SQLParser.Var_4Context ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#var_4}.
	 * @param ctx the parse tree
	 */
	void exitVar_4(SQLParser.Var_4Context ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#x1}.
	 * @param ctx the parse tree
	 */
	void enterX1(SQLParser.X1Context ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#x1}.
	 * @param ctx the parse tree
	 */
	void exitX1(SQLParser.X1Context ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#true_grammer}.
	 * @param ctx the parse tree
	 */
	void enterTrue_grammer(SQLParser.True_grammerContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#true_grammer}.
	 * @param ctx the parse tree
	 */
	void exitTrue_grammer(SQLParser.True_grammerContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#false_grammer}.
	 * @param ctx the parse tree
	 */
	void enterFalse_grammer(SQLParser.False_grammerContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#false_grammer}.
	 * @param ctx the parse tree
	 */
	void exitFalse_grammer(SQLParser.False_grammerContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#one_loop_body}.
	 * @param ctx the parse tree
	 */
	void enterOne_loop_body(SQLParser.One_loop_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#one_loop_body}.
	 * @param ctx the parse tree
	 */
	void exitOne_loop_body(SQLParser.One_loop_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#array_name}.
	 * @param ctx the parse tree
	 */
	void enterArray_name(SQLParser.Array_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#array_name}.
	 * @param ctx the parse tree
	 */
	void exitArray_name(SQLParser.Array_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#array_name_call}.
	 * @param ctx the parse tree
	 */
	void enterArray_name_call(SQLParser.Array_name_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#array_name_call}.
	 * @param ctx the parse tree
	 */
	void exitArray_name_call(SQLParser.Array_name_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#array_value}.
	 * @param ctx the parse tree
	 */
	void enterArray_value(SQLParser.Array_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#array_value}.
	 * @param ctx the parse tree
	 */
	void exitArray_value(SQLParser.Array_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#increase_and_decrease}.
	 * @param ctx the parse tree
	 */
	void enterIncrease_and_decrease(SQLParser.Increase_and_decreaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#increase_and_decrease}.
	 * @param ctx the parse tree
	 */
	void exitIncrease_and_decrease(SQLParser.Increase_and_decreaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#any_name_without_keyword}.
	 * @param ctx the parse tree
	 */
	void enterAny_name_without_keyword(SQLParser.Any_name_without_keywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#any_name_without_keyword}.
	 * @param ctx the parse tree
	 */
	void exitAny_name_without_keyword(SQLParser.Any_name_without_keywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#return_grammer}.
	 * @param ctx the parse tree
	 */
	void enterReturn_grammer(SQLParser.Return_grammerContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#return_grammer}.
	 * @param ctx the parse tree
	 */
	void exitReturn_grammer(SQLParser.Return_grammerContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#json_grammer}.
	 * @param ctx the parse tree
	 */
	void enterJson_grammer(SQLParser.Json_grammerContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#json_grammer}.
	 * @param ctx the parse tree
	 */
	void exitJson_grammer(SQLParser.Json_grammerContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#open_par}.
	 * @param ctx the parse tree
	 */
	void enterOpen_par(SQLParser.Open_parContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#open_par}.
	 * @param ctx the parse tree
	 */
	void exitOpen_par(SQLParser.Open_parContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#close_par}.
	 * @param ctx the parse tree
	 */
	void enterClose_par(SQLParser.Close_parContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#close_par}.
	 * @param ctx the parse tree
	 */
	void exitClose_par(SQLParser.Close_parContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(SQLParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(SQLParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#array_of_json_grammer}.
	 * @param ctx the parse tree
	 */
	void enterArray_of_json_grammer(SQLParser.Array_of_json_grammerContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#array_of_json_grammer}.
	 * @param ctx the parse tree
	 */
	void exitArray_of_json_grammer(SQLParser.Array_of_json_grammerContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#for_signs}.
	 * @param ctx the parse tree
	 */
	void enterFor_signs(SQLParser.For_signsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#for_signs}.
	 * @param ctx the parse tree
	 */
	void exitFor_signs(SQLParser.For_signsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#while_comper}.
	 * @param ctx the parse tree
	 */
	void enterWhile_comper(SQLParser.While_comperContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#while_comper}.
	 * @param ctx the parse tree
	 */
	void exitWhile_comper(SQLParser.While_comperContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#while_signs}.
	 * @param ctx the parse tree
	 */
	void enterWhile_signs(SQLParser.While_signsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#while_signs}.
	 * @param ctx the parse tree
	 */
	void exitWhile_signs(SQLParser.While_signsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#alter_table_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAlter_table_stmt(SQLParser.Alter_table_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#alter_table_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAlter_table_stmt(SQLParser.Alter_table_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#alter_table_add_constraint}.
	 * @param ctx the parse tree
	 */
	void enterAlter_table_add_constraint(SQLParser.Alter_table_add_constraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#alter_table_add_constraint}.
	 * @param ctx the parse tree
	 */
	void exitAlter_table_add_constraint(SQLParser.Alter_table_add_constraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#alter_table_add}.
	 * @param ctx the parse tree
	 */
	void enterAlter_table_add(SQLParser.Alter_table_addContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#alter_table_add}.
	 * @param ctx the parse tree
	 */
	void exitAlter_table_add(SQLParser.Alter_table_addContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#create_table_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_stmt(SQLParser.Create_table_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#create_table_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_stmt(SQLParser.Create_table_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#csv_s}.
	 * @param ctx the parse tree
	 */
	void enterCsv_s(SQLParser.Csv_sContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#csv_s}.
	 * @param ctx the parse tree
	 */
	void exitCsv_s(SQLParser.Csv_sContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#json_s}.
	 * @param ctx the parse tree
	 */
	void enterJson_s(SQLParser.Json_sContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#json_s}.
	 * @param ctx the parse tree
	 */
	void exitJson_s(SQLParser.Json_sContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#create_table_stmt1}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_stmt1(SQLParser.Create_table_stmt1Context ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#create_table_stmt1}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_stmt1(SQLParser.Create_table_stmt1Context ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#create_tayp_stmt1}.
	 * @param ctx the parse tree
	 */
	void enterCreate_tayp_stmt1(SQLParser.Create_tayp_stmt1Context ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#create_tayp_stmt1}.
	 * @param ctx the parse tree
	 */
	void exitCreate_tayp_stmt1(SQLParser.Create_tayp_stmt1Context ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#delete_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDelete_stmt(SQLParser.Delete_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#delete_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDelete_stmt(SQLParser.Delete_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#drop_table_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDrop_table_stmt(SQLParser.Drop_table_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#drop_table_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDrop_table_stmt(SQLParser.Drop_table_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#insert_stmt}.
	 * @param ctx the parse tree
	 */
	void enterInsert_stmt(SQLParser.Insert_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#insert_stmt}.
	 * @param ctx the parse tree
	 */
	void exitInsert_stmt(SQLParser.Insert_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#factored_select_stmt}.
	 * @param ctx the parse tree
	 */
	void enterFactored_select_stmt(SQLParser.Factored_select_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#factored_select_stmt}.
	 * @param ctx the parse tree
	 */
	void exitFactored_select_stmt(SQLParser.Factored_select_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#select_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSelect_stmt(SQLParser.Select_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#select_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSelect_stmt(SQLParser.Select_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#select_or_values}.
	 * @param ctx the parse tree
	 */
	void enterSelect_or_values(SQLParser.Select_or_valuesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#select_or_values}.
	 * @param ctx the parse tree
	 */
	void exitSelect_or_values(SQLParser.Select_or_valuesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#update_stmt}.
	 * @param ctx the parse tree
	 */
	void enterUpdate_stmt(SQLParser.Update_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#update_stmt}.
	 * @param ctx the parse tree
	 */
	void exitUpdate_stmt(SQLParser.Update_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#column_def}.
	 * @param ctx the parse tree
	 */
	void enterColumn_def(SQLParser.Column_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#column_def}.
	 * @param ctx the parse tree
	 */
	void exitColumn_def(SQLParser.Column_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#type_name}.
	 * @param ctx the parse tree
	 */
	void enterType_name(SQLParser.Type_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#type_name}.
	 * @param ctx the parse tree
	 */
	void exitType_name(SQLParser.Type_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#column_constraint}.
	 * @param ctx the parse tree
	 */
	void enterColumn_constraint(SQLParser.Column_constraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#column_constraint}.
	 * @param ctx the parse tree
	 */
	void exitColumn_constraint(SQLParser.Column_constraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#column_constraint_primary_key}.
	 * @param ctx the parse tree
	 */
	void enterColumn_constraint_primary_key(SQLParser.Column_constraint_primary_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#column_constraint_primary_key}.
	 * @param ctx the parse tree
	 */
	void exitColumn_constraint_primary_key(SQLParser.Column_constraint_primary_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#column_constraint_foreign_key}.
	 * @param ctx the parse tree
	 */
	void enterColumn_constraint_foreign_key(SQLParser.Column_constraint_foreign_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#column_constraint_foreign_key}.
	 * @param ctx the parse tree
	 */
	void exitColumn_constraint_foreign_key(SQLParser.Column_constraint_foreign_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#column_constraint_not_null}.
	 * @param ctx the parse tree
	 */
	void enterColumn_constraint_not_null(SQLParser.Column_constraint_not_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#column_constraint_not_null}.
	 * @param ctx the parse tree
	 */
	void exitColumn_constraint_not_null(SQLParser.Column_constraint_not_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#column_constraint_null}.
	 * @param ctx the parse tree
	 */
	void enterColumn_constraint_null(SQLParser.Column_constraint_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#column_constraint_null}.
	 * @param ctx the parse tree
	 */
	void exitColumn_constraint_null(SQLParser.Column_constraint_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#column_default}.
	 * @param ctx the parse tree
	 */
	void enterColumn_default(SQLParser.Column_defaultContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#column_default}.
	 * @param ctx the parse tree
	 */
	void exitColumn_default(SQLParser.Column_defaultContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#column_default_value}.
	 * @param ctx the parse tree
	 */
	void enterColumn_default_value(SQLParser.Column_default_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#column_default_value}.
	 * @param ctx the parse tree
	 */
	void exitColumn_default_value(SQLParser.Column_default_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#exprwhere}.
	 * @param ctx the parse tree
	 */
	void enterExprwhere(SQLParser.ExprwhereContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#exprwhere}.
	 * @param ctx the parse tree
	 */
	void exitExprwhere(SQLParser.ExprwhereContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(SQLParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(SQLParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#expr_for_var}.
	 * @param ctx the parse tree
	 */
	void enterExpr_for_var(SQLParser.Expr_for_varContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#expr_for_var}.
	 * @param ctx the parse tree
	 */
	void exitExpr_for_var(SQLParser.Expr_for_varContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#expr_without_comper}.
	 * @param ctx the parse tree
	 */
	void enterExpr_without_comper(SQLParser.Expr_without_comperContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#expr_without_comper}.
	 * @param ctx the parse tree
	 */
	void exitExpr_without_comper(SQLParser.Expr_without_comperContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#opeeration}.
	 * @param ctx the parse tree
	 */
	void enterOpeeration(SQLParser.OpeerationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#opeeration}.
	 * @param ctx the parse tree
	 */
	void exitOpeeration(SQLParser.OpeerationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#var1}.
	 * @param ctx the parse tree
	 */
	void enterVar1(SQLParser.Var1Context ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#var1}.
	 * @param ctx the parse tree
	 */
	void exitVar1(SQLParser.Var1Context ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#function_expr}.
	 * @param ctx the parse tree
	 */
	void enterFunction_expr(SQLParser.Function_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#function_expr}.
	 * @param ctx the parse tree
	 */
	void exitFunction_expr(SQLParser.Function_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#expr1}.
	 * @param ctx the parse tree
	 */
	void enterExpr1(SQLParser.Expr1Context ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#expr1}.
	 * @param ctx the parse tree
	 */
	void exitExpr1(SQLParser.Expr1Context ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#foreign_key_clause}.
	 * @param ctx the parse tree
	 */
	void enterForeign_key_clause(SQLParser.Foreign_key_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#foreign_key_clause}.
	 * @param ctx the parse tree
	 */
	void exitForeign_key_clause(SQLParser.Foreign_key_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#fk_target_column_name}.
	 * @param ctx the parse tree
	 */
	void enterFk_target_column_name(SQLParser.Fk_target_column_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#fk_target_column_name}.
	 * @param ctx the parse tree
	 */
	void exitFk_target_column_name(SQLParser.Fk_target_column_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#indexed_column}.
	 * @param ctx the parse tree
	 */
	void enterIndexed_column(SQLParser.Indexed_columnContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#indexed_column}.
	 * @param ctx the parse tree
	 */
	void exitIndexed_column(SQLParser.Indexed_columnContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#table_constraint}.
	 * @param ctx the parse tree
	 */
	void enterTable_constraint(SQLParser.Table_constraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#table_constraint}.
	 * @param ctx the parse tree
	 */
	void exitTable_constraint(SQLParser.Table_constraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#table_constraint_primary_key}.
	 * @param ctx the parse tree
	 */
	void enterTable_constraint_primary_key(SQLParser.Table_constraint_primary_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#table_constraint_primary_key}.
	 * @param ctx the parse tree
	 */
	void exitTable_constraint_primary_key(SQLParser.Table_constraint_primary_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#table_constraint_foreign_key}.
	 * @param ctx the parse tree
	 */
	void enterTable_constraint_foreign_key(SQLParser.Table_constraint_foreign_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#table_constraint_foreign_key}.
	 * @param ctx the parse tree
	 */
	void exitTable_constraint_foreign_key(SQLParser.Table_constraint_foreign_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#table_constraint_unique}.
	 * @param ctx the parse tree
	 */
	void enterTable_constraint_unique(SQLParser.Table_constraint_uniqueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#table_constraint_unique}.
	 * @param ctx the parse tree
	 */
	void exitTable_constraint_unique(SQLParser.Table_constraint_uniqueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#table_constraint_key}.
	 * @param ctx the parse tree
	 */
	void enterTable_constraint_key(SQLParser.Table_constraint_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#table_constraint_key}.
	 * @param ctx the parse tree
	 */
	void exitTable_constraint_key(SQLParser.Table_constraint_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#fk_origin_column_name}.
	 * @param ctx the parse tree
	 */
	void enterFk_origin_column_name(SQLParser.Fk_origin_column_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#fk_origin_column_name}.
	 * @param ctx the parse tree
	 */
	void exitFk_origin_column_name(SQLParser.Fk_origin_column_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#qualified_table_name}.
	 * @param ctx the parse tree
	 */
	void enterQualified_table_name(SQLParser.Qualified_table_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#qualified_table_name}.
	 * @param ctx the parse tree
	 */
	void exitQualified_table_name(SQLParser.Qualified_table_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#ordering_term}.
	 * @param ctx the parse tree
	 */
	void enterOrdering_term(SQLParser.Ordering_termContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#ordering_term}.
	 * @param ctx the parse tree
	 */
	void exitOrdering_term(SQLParser.Ordering_termContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#pragma_value}.
	 * @param ctx the parse tree
	 */
	void enterPragma_value(SQLParser.Pragma_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#pragma_value}.
	 * @param ctx the parse tree
	 */
	void exitPragma_value(SQLParser.Pragma_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#common_table_expression}.
	 * @param ctx the parse tree
	 */
	void enterCommon_table_expression(SQLParser.Common_table_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#common_table_expression}.
	 * @param ctx the parse tree
	 */
	void exitCommon_table_expression(SQLParser.Common_table_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#result_column}.
	 * @param ctx the parse tree
	 */
	void enterResult_column(SQLParser.Result_columnContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#result_column}.
	 * @param ctx the parse tree
	 */
	void exitResult_column(SQLParser.Result_columnContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#table_or_subquery}.
	 * @param ctx the parse tree
	 */
	void enterTable_or_subquery(SQLParser.Table_or_subqueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#table_or_subquery}.
	 * @param ctx the parse tree
	 */
	void exitTable_or_subquery(SQLParser.Table_or_subqueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#join_clause}.
	 * @param ctx the parse tree
	 */
	void enterJoin_clause(SQLParser.Join_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#join_clause}.
	 * @param ctx the parse tree
	 */
	void exitJoin_clause(SQLParser.Join_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#join_operator}.
	 * @param ctx the parse tree
	 */
	void enterJoin_operator(SQLParser.Join_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#join_operator}.
	 * @param ctx the parse tree
	 */
	void exitJoin_operator(SQLParser.Join_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#join_constraint}.
	 * @param ctx the parse tree
	 */
	void enterJoin_constraint(SQLParser.Join_constraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#join_constraint}.
	 * @param ctx the parse tree
	 */
	void exitJoin_constraint(SQLParser.Join_constraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#select_core}.
	 * @param ctx the parse tree
	 */
	void enterSelect_core(SQLParser.Select_coreContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#select_core}.
	 * @param ctx the parse tree
	 */
	void exitSelect_core(SQLParser.Select_coreContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#cte_table_name}.
	 * @param ctx the parse tree
	 */
	void enterCte_table_name(SQLParser.Cte_table_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#cte_table_name}.
	 * @param ctx the parse tree
	 */
	void exitCte_table_name(SQLParser.Cte_table_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#signed_number}.
	 * @param ctx the parse tree
	 */
	void enterSigned_number(SQLParser.Signed_numberContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#signed_number}.
	 * @param ctx the parse tree
	 */
	void exitSigned_number(SQLParser.Signed_numberContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#literal_value}.
	 * @param ctx the parse tree
	 */
	void enterLiteral_value(SQLParser.Literal_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#literal_value}.
	 * @param ctx the parse tree
	 */
	void exitLiteral_value(SQLParser.Literal_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#unary_operator}.
	 * @param ctx the parse tree
	 */
	void enterUnary_operator(SQLParser.Unary_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#unary_operator}.
	 * @param ctx the parse tree
	 */
	void exitUnary_operator(SQLParser.Unary_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#error_message}.
	 * @param ctx the parse tree
	 */
	void enterError_message(SQLParser.Error_messageContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#error_message}.
	 * @param ctx the parse tree
	 */
	void exitError_message(SQLParser.Error_messageContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#module_argument}.
	 * @param ctx the parse tree
	 */
	void enterModule_argument(SQLParser.Module_argumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#module_argument}.
	 * @param ctx the parse tree
	 */
	void exitModule_argument(SQLParser.Module_argumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#column_alias}.
	 * @param ctx the parse tree
	 */
	void enterColumn_alias(SQLParser.Column_aliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#column_alias}.
	 * @param ctx the parse tree
	 */
	void exitColumn_alias(SQLParser.Column_aliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#keyword}.
	 * @param ctx the parse tree
	 */
	void enterKeyword(SQLParser.KeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#keyword}.
	 * @param ctx the parse tree
	 */
	void exitKeyword(SQLParser.KeywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#unknown}.
	 * @param ctx the parse tree
	 */
	void enterUnknown(SQLParser.UnknownContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#unknown}.
	 * @param ctx the parse tree
	 */
	void exitUnknown(SQLParser.UnknownContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(SQLParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(SQLParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#function_name}.
	 * @param ctx the parse tree
	 */
	void enterFunction_name(SQLParser.Function_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#function_name}.
	 * @param ctx the parse tree
	 */
	void exitFunction_name(SQLParser.Function_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#database_name}.
	 * @param ctx the parse tree
	 */
	void enterDatabase_name(SQLParser.Database_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#database_name}.
	 * @param ctx the parse tree
	 */
	void exitDatabase_name(SQLParser.Database_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#source_table_name}.
	 * @param ctx the parse tree
	 */
	void enterSource_table_name(SQLParser.Source_table_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#source_table_name}.
	 * @param ctx the parse tree
	 */
	void exitSource_table_name(SQLParser.Source_table_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#table_name}.
	 * @param ctx the parse tree
	 */
	void enterTable_name(SQLParser.Table_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#table_name}.
	 * @param ctx the parse tree
	 */
	void exitTable_name(SQLParser.Table_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#table_or_index_name}.
	 * @param ctx the parse tree
	 */
	void enterTable_or_index_name(SQLParser.Table_or_index_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#table_or_index_name}.
	 * @param ctx the parse tree
	 */
	void exitTable_or_index_name(SQLParser.Table_or_index_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#new_table_name}.
	 * @param ctx the parse tree
	 */
	void enterNew_table_name(SQLParser.New_table_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#new_table_name}.
	 * @param ctx the parse tree
	 */
	void exitNew_table_name(SQLParser.New_table_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#column_name}.
	 * @param ctx the parse tree
	 */
	void enterColumn_name(SQLParser.Column_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#column_name}.
	 * @param ctx the parse tree
	 */
	void exitColumn_name(SQLParser.Column_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#collation_name}.
	 * @param ctx the parse tree
	 */
	void enterCollation_name(SQLParser.Collation_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#collation_name}.
	 * @param ctx the parse tree
	 */
	void exitCollation_name(SQLParser.Collation_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#foreign_table}.
	 * @param ctx the parse tree
	 */
	void enterForeign_table(SQLParser.Foreign_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#foreign_table}.
	 * @param ctx the parse tree
	 */
	void exitForeign_table(SQLParser.Foreign_tableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#index_name}.
	 * @param ctx the parse tree
	 */
	void enterIndex_name(SQLParser.Index_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#index_name}.
	 * @param ctx the parse tree
	 */
	void exitIndex_name(SQLParser.Index_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#trigger_name}.
	 * @param ctx the parse tree
	 */
	void enterTrigger_name(SQLParser.Trigger_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#trigger_name}.
	 * @param ctx the parse tree
	 */
	void exitTrigger_name(SQLParser.Trigger_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#view_name}.
	 * @param ctx the parse tree
	 */
	void enterView_name(SQLParser.View_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#view_name}.
	 * @param ctx the parse tree
	 */
	void exitView_name(SQLParser.View_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#module_name}.
	 * @param ctx the parse tree
	 */
	void enterModule_name(SQLParser.Module_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#module_name}.
	 * @param ctx the parse tree
	 */
	void exitModule_name(SQLParser.Module_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#pragma_name}.
	 * @param ctx the parse tree
	 */
	void enterPragma_name(SQLParser.Pragma_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#pragma_name}.
	 * @param ctx the parse tree
	 */
	void exitPragma_name(SQLParser.Pragma_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#savepoint_name}.
	 * @param ctx the parse tree
	 */
	void enterSavepoint_name(SQLParser.Savepoint_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#savepoint_name}.
	 * @param ctx the parse tree
	 */
	void exitSavepoint_name(SQLParser.Savepoint_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#table_alias}.
	 * @param ctx the parse tree
	 */
	void enterTable_alias(SQLParser.Table_aliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#table_alias}.
	 * @param ctx the parse tree
	 */
	void exitTable_alias(SQLParser.Table_aliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#transaction_name}.
	 * @param ctx the parse tree
	 */
	void enterTransaction_name(SQLParser.Transaction_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#transaction_name}.
	 * @param ctx the parse tree
	 */
	void exitTransaction_name(SQLParser.Transaction_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#any_name}.
	 * @param ctx the parse tree
	 */
	void enterAny_name(SQLParser.Any_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#any_name}.
	 * @param ctx the parse tree
	 */
	void exitAny_name(SQLParser.Any_nameContext ctx);
}