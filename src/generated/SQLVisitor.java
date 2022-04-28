// Generated from C:/Users/Ma3roof/IdeaProjects/myAST/src\SQL.g4 by ANTLR 4.7.2
package generated;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SQLParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SQLVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SQLParser#parse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParse(SQLParser.ParseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#error}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitError(SQLParser.ErrorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#sql_stmt_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSql_stmt_list(SQLParser.Sql_stmt_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#sql_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSql_stmt(SQLParser.Sql_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#create_aggerationt_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_aggerationt_function(SQLParser.Create_aggerationt_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#params_agg_fun}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParams_agg_fun(SQLParser.Params_agg_funContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#jar_path}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJar_path(SQLParser.Jar_pathContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#class_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_name(SQLParser.Class_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#method_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod_name(SQLParser.Method_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#return_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_type(SQLParser.Return_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParams(SQLParser.ParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#create_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_type(SQLParser.Create_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#create_type_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_type_value(SQLParser.Create_type_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#create_type_value1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_type_value1(SQLParser.Create_type_value1Context ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#number_k}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber_k(SQLParser.Number_kContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#string_k}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString_k(SQLParser.String_kContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#boolean_k}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolean_k(SQLParser.Boolean_kContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#print_grammer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint_grammer(SQLParser.Print_grammerContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#printG}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintG(SQLParser.PrintGContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#java_function_declaration_List}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava_function_declaration_List(SQLParser.Java_function_declaration_ListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#java_function_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava_function_declaration(SQLParser.Java_function_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#java_function_header}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava_function_header(SQLParser.Java_function_headerContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#java_function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava_function_call(SQLParser.Java_function_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#java_function_call_for_var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava_function_call_for_var(SQLParser.Java_function_call_for_varContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#java_function_call_for_var1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava_function_call_for_var1(SQLParser.Java_function_call_for_var1Context ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#java_function_call_for_loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava_function_call_for_loop(SQLParser.Java_function_call_for_loopContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#java_function_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava_function_body(SQLParser.Java_function_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#loops_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoops_body(SQLParser.Loops_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#list_loopStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_loopStatement(SQLParser.List_loopStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#loopStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoopStatement(SQLParser.LoopStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#higher_order_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHigher_order_function(SQLParser.Higher_order_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#return_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_body(SQLParser.Return_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#array_Intill_grammer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_Intill_grammer(SQLParser.Array_Intill_grammerContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#parameters_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameters_list(SQLParser.Parameters_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#arguments_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArguments_list(SQLParser.Arguments_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#arguments_list_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArguments_list_body(SQLParser.Arguments_list_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#parms}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParms(SQLParser.ParmsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#prams_with_ingth}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrams_with_ingth(SQLParser.Prams_with_ingthContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#while_grammer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_grammer(SQLParser.While_grammerContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#while_body_graammer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_body_graammer(SQLParser.While_body_graammerContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#do_while_grammer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDo_while_grammer(SQLParser.Do_while_grammerContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#while_header_grammer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_header_grammer(SQLParser.While_header_grammerContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#while_header_grammer1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_header_grammer1(SQLParser.While_header_grammer1Context ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#ll1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLl1(SQLParser.Ll1Context ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#if_oneline_grammer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_oneline_grammer(SQLParser.If_oneline_grammerContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#if_oneline_signl_grammer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_oneline_signl_grammer(SQLParser.If_oneline_signl_grammerContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#true_or_false}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrue_or_false(SQLParser.True_or_falseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#if_grammer1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_grammer1(SQLParser.If_grammer1Context ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#if_else_grammer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_else_grammer(SQLParser.If_else_grammerContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#if_grammer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_grammer(SQLParser.If_grammerContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#if_header_grammer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_header_grammer(SQLParser.If_header_grammerContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#foreach_grammer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForeach_grammer(SQLParser.Foreach_grammerContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#foreach_header_grammer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForeach_header_grammer(SQLParser.Foreach_header_grammerContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#for_grammer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_grammer(SQLParser.For_grammerContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#for_header}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_header(SQLParser.For_headerContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#switch_grammer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitch_grammer(SQLParser.Switch_grammerContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#switch_header_grammer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitch_header_grammer(SQLParser.Switch_header_grammerContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#case_grammer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase_grammer(SQLParser.Case_grammerContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#default_grammer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefault_grammer(SQLParser.Default_grammerContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#var_grammer0}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_grammer0(SQLParser.Var_grammer0Context ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#var_grammer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_grammer(SQLParser.Var_grammerContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#var_grammer2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_grammer2(SQLParser.Var_grammer2Context ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#var_3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_3(SQLParser.Var_3Context ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#var_4}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_4(SQLParser.Var_4Context ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#x1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitX1(SQLParser.X1Context ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#true_grammer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrue_grammer(SQLParser.True_grammerContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#false_grammer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFalse_grammer(SQLParser.False_grammerContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#one_loop_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOne_loop_body(SQLParser.One_loop_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#array_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_name(SQLParser.Array_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#array_name_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_name_call(SQLParser.Array_name_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#array_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_value(SQLParser.Array_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#increase_and_decrease}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncrease_and_decrease(SQLParser.Increase_and_decreaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#any_name_without_keyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAny_name_without_keyword(SQLParser.Any_name_without_keywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#return_grammer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_grammer(SQLParser.Return_grammerContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#json_grammer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJson_grammer(SQLParser.Json_grammerContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#open_par}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpen_par(SQLParser.Open_parContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#close_par}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClose_par(SQLParser.Close_parContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(SQLParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#array_of_json_grammer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_of_json_grammer(SQLParser.Array_of_json_grammerContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#for_signs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_signs(SQLParser.For_signsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#while_comper}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_comper(SQLParser.While_comperContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#while_signs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_signs(SQLParser.While_signsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#alter_table_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_table_stmt(SQLParser.Alter_table_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#alter_table_add_constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_table_add_constraint(SQLParser.Alter_table_add_constraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#alter_table_add}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_table_add(SQLParser.Alter_table_addContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#create_table_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_stmt(SQLParser.Create_table_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#csv_s}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCsv_s(SQLParser.Csv_sContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#json_s}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJson_s(SQLParser.Json_sContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#create_table_stmt1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_stmt1(SQLParser.Create_table_stmt1Context ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#create_tayp_stmt1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_tayp_stmt1(SQLParser.Create_tayp_stmt1Context ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#delete_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelete_stmt(SQLParser.Delete_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#drop_table_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_table_stmt(SQLParser.Drop_table_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#insert_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsert_stmt(SQLParser.Insert_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#factored_select_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactored_select_stmt(SQLParser.Factored_select_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#select_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_stmt(SQLParser.Select_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#select_or_values}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_or_values(SQLParser.Select_or_valuesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#update_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdate_stmt(SQLParser.Update_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#column_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_def(SQLParser.Column_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#type_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_name(SQLParser.Type_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#column_constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_constraint(SQLParser.Column_constraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#column_constraint_primary_key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_constraint_primary_key(SQLParser.Column_constraint_primary_keyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#column_constraint_foreign_key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_constraint_foreign_key(SQLParser.Column_constraint_foreign_keyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#column_constraint_not_null}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_constraint_not_null(SQLParser.Column_constraint_not_nullContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#column_constraint_null}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_constraint_null(SQLParser.Column_constraint_nullContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#column_default}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_default(SQLParser.Column_defaultContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#column_default_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_default_value(SQLParser.Column_default_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#exprwhere}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprwhere(SQLParser.ExprwhereContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(SQLParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#expr_for_var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_for_var(SQLParser.Expr_for_varContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#expr_without_comper}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_without_comper(SQLParser.Expr_without_comperContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#opeeration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpeeration(SQLParser.OpeerationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#var1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar1(SQLParser.Var1Context ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#function_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_expr(SQLParser.Function_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#expr1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr1(SQLParser.Expr1Context ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#foreign_key_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForeign_key_clause(SQLParser.Foreign_key_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#fk_target_column_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFk_target_column_name(SQLParser.Fk_target_column_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#indexed_column}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexed_column(SQLParser.Indexed_columnContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#table_constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_constraint(SQLParser.Table_constraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#table_constraint_primary_key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_constraint_primary_key(SQLParser.Table_constraint_primary_keyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#table_constraint_foreign_key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_constraint_foreign_key(SQLParser.Table_constraint_foreign_keyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#table_constraint_unique}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_constraint_unique(SQLParser.Table_constraint_uniqueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#table_constraint_key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_constraint_key(SQLParser.Table_constraint_keyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#fk_origin_column_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFk_origin_column_name(SQLParser.Fk_origin_column_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#qualified_table_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualified_table_name(SQLParser.Qualified_table_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#ordering_term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrdering_term(SQLParser.Ordering_termContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#pragma_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPragma_value(SQLParser.Pragma_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#common_table_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommon_table_expression(SQLParser.Common_table_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#result_column}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResult_column(SQLParser.Result_columnContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#table_or_subquery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_or_subquery(SQLParser.Table_or_subqueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#join_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoin_clause(SQLParser.Join_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#join_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoin_operator(SQLParser.Join_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#join_constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoin_constraint(SQLParser.Join_constraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#select_core}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_core(SQLParser.Select_coreContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#cte_table_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCte_table_name(SQLParser.Cte_table_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#signed_number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSigned_number(SQLParser.Signed_numberContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#literal_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral_value(SQLParser.Literal_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#unary_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary_operator(SQLParser.Unary_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#error_message}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitError_message(SQLParser.Error_messageContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#module_argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModule_argument(SQLParser.Module_argumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#column_alias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_alias(SQLParser.Column_aliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#keyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyword(SQLParser.KeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#unknown}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnknown(SQLParser.UnknownContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(SQLParser.NameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#function_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_name(SQLParser.Function_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#database_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatabase_name(SQLParser.Database_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#source_table_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSource_table_name(SQLParser.Source_table_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#table_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_name(SQLParser.Table_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#table_or_index_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_or_index_name(SQLParser.Table_or_index_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#new_table_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNew_table_name(SQLParser.New_table_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#column_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_name(SQLParser.Column_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#collation_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollation_name(SQLParser.Collation_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#foreign_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForeign_table(SQLParser.Foreign_tableContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#index_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex_name(SQLParser.Index_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#trigger_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrigger_name(SQLParser.Trigger_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#view_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitView_name(SQLParser.View_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#module_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModule_name(SQLParser.Module_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#pragma_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPragma_name(SQLParser.Pragma_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#savepoint_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSavepoint_name(SQLParser.Savepoint_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#table_alias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_alias(SQLParser.Table_aliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#transaction_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransaction_name(SQLParser.Transaction_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#any_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAny_name(SQLParser.Any_nameContext ctx);
}