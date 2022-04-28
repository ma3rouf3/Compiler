// Generated from C:/Users/Ma3roof/IdeaProjects/myAST/src\SQL.g4 by ANTLR 4.7.2
package generated;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SQLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, SCOL=20, DOT=21, OPEN_PAR=22, OPEN_ARRAY=23, CLOSE_ARRAY=24, 
		CLOSE_PAR=25, COMMA=26, ASSIGN=27, STAR=28, PLUS=29, MINUS=30, TILDE=31, 
		PIPE2=32, DIV=33, MOD=34, LT2=35, GT2=36, AMP=37, PIPE=38, LT=39, LT_EQ=40, 
		GT=41, GT_EQ=42, EQ=43, NOT_EQ1=44, NOT_EQ2=45, QM=46, DD=47, K_ABORT=48, 
		K_ACTION=49, K_ADD=50, K_AFTER=51, K_ALL=52, K_ALTER=53, K_ANALYZE=54, 
		K_AND=55, K_AS=56, K_ASC=57, K_ATTACH=58, K_AUTOINCREMENT=59, K_BEFORE=60, 
		K_BEGIN=61, K_BETWEEN=62, K_BY=63, K_CASCADE=64, K_CASE=65, K_CONTINUE=66, 
		K_CAST=67, K_CHECK=68, K_COLLATE=69, K_COLUMN=70, K_COMMIT=71, K_CONFLICT=72, 
		K_CONSTRAINT=73, K_CREATE=74, K_CROSS=75, K_CURRENT_DATE=76, K_CURRENT_TIME=77, 
		K_CURRENT_TIMESTAMP=78, K_DATABASE=79, K_DEFAULT=80, K_DEFERRABLE=81, 
		K_DEFERRED=82, K_DELETE=83, K_DESC=84, K_DETACH=85, K_DISTINCT=86, K_DROP=87, 
		K_EACH=88, K_ELSE=89, K_END=90, K_ENABLE=91, K_ESCAPE=92, K_EXCEPT=93, 
		K_EXCLUSIVE=94, K_EXISTS=95, K_EXPLAIN=96, K_FAIL=97, K_FOR=98, K_FOREIGN=99, 
		K_FROM=100, K_FULL=101, K_GLOB=102, K_GROUP=103, K_HAVING=104, K_IF=105, 
		K_IGNORE=106, K_IMMEDIATE=107, K_IN=108, K_INDEX=109, K_INDEXED=110, K_INITIALLY=111, 
		K_INNER=112, K_INSERT=113, K_INSTEAD=114, K_INTERSECT=115, K_INTO=116, 
		K_IS=117, K_ISNULL=118, K_JOIN=119, K_KEY=120, K_LEFT=121, K_LIKE=122, 
		K_LIMIT=123, K_MATCH=124, K_NATURAL=125, K_NEXTVAL=126, K_NO=127, K_NOT=128, 
		K_NOTNULL=129, K_NULL=130, K_OF=131, K_OFFSET=132, K_ON=133, K_ONLY=134, 
		K_OR=135, K_ORDER=136, K_OUTER=137, K_PLAN=138, K_PRAGMA=139, K_PRIMARY=140, 
		K_QUERY=141, K_RAISE=142, K_RECURSIVE=143, K_REFERENCES=144, K_REGEXP=145, 
		K_REINDEX=146, K_RELEASE=147, K_RENAME=148, K_REPLACE=149, K_RESTRICT=150, 
		K_RIGHT=151, K_ROLLBACK=152, K_ROW=153, K_SAVEPOINT=154, K_SELECT=155, 
		K_SET=156, K_TABLE=157, K_TEMP=158, K_TEMPORARY=159, K_THEN=160, K_TO=161, 
		K_TRANSACTION=162, K_TRIGGER=163, K_UNION=164, K_UNIQUE=165, K_UPDATE=166, 
		K_USING=167, K_VACUUM=168, K_VALUES=169, K_VIEW=170, K_VIRTUAL=171, K_WHEN=172, 
		K_WHERE=173, K_WITH=174, K_WITHOUT=175, K_VAR=176, K_FOREACH=177, K_RETURN=178, 
		K_ARRAY=179, K_WHILE=180, K_SWITCH=181, K_BREAK=182, K_DO=183, K_FUNCTION=184, 
		K_PRINT=185, K_TRUE=186, K_FALSE=187, K_TYPE=188, K_PATH=189, K_STRING=190, 
		K_BOOLEAN=191, K_number=192, K_CSV=193, K_JSON=194, IDENTIFIER=195, IDENTIFIER1=196, 
		NUMERIC_LITERAL=197, BIND_PARAMETER=198, STRING_LITERAL=199, BLOB_LITERAL=200, 
		MULTILINE_COMMENT=201, SPACES=202, UNEXPECTED_CHAR=203, WHILE_SIGNS=204;
	public static final int
		RULE_parse = 0, RULE_error = 1, RULE_sql_stmt_list = 2, RULE_sql_stmt = 3, 
		RULE_create_aggerationt_function = 4, RULE_params_agg_fun = 5, RULE_jar_path = 6, 
		RULE_class_name = 7, RULE_method_name = 8, RULE_return_type = 9, RULE_params = 10, 
		RULE_create_type = 11, RULE_create_type_value = 12, RULE_create_type_value1 = 13, 
		RULE_number_k = 14, RULE_string_k = 15, RULE_boolean_k = 16, RULE_print_grammer = 17, 
		RULE_printG = 18, RULE_java_function_declaration_List = 19, RULE_java_function_declaration = 20, 
		RULE_java_function_header = 21, RULE_java_function_call = 22, RULE_java_function_call_for_var = 23, 
		RULE_java_function_call_for_var1 = 24, RULE_java_function_call_for_loop = 25, 
		RULE_java_function_body = 26, RULE_loops_body = 27, RULE_list_loopStatement = 28, 
		RULE_loopStatement = 29, RULE_higher_order_function = 30, RULE_return_body = 31, 
		RULE_array_Intill_grammer = 32, RULE_parameters_list = 33, RULE_arguments_list = 34, 
		RULE_arguments_list_body = 35, RULE_parms = 36, RULE_prams_with_ingth = 37, 
		RULE_while_grammer = 38, RULE_while_body_graammer = 39, RULE_do_while_grammer = 40, 
		RULE_while_header_grammer = 41, RULE_while_header_grammer1 = 42, RULE_ll1 = 43, 
		RULE_if_oneline_grammer = 44, RULE_if_oneline_signl_grammer = 45, RULE_true_or_false = 46, 
		RULE_if_grammer1 = 47, RULE_if_else_grammer = 48, RULE_if_grammer = 49, 
		RULE_if_header_grammer = 50, RULE_foreach_grammer = 51, RULE_foreach_header_grammer = 52, 
		RULE_for_grammer = 53, RULE_for_header = 54, RULE_switch_grammer = 55, 
		RULE_switch_header_grammer = 56, RULE_case_grammer = 57, RULE_default_grammer = 58, 
		RULE_var_grammer0 = 59, RULE_var_grammer = 60, RULE_var_grammer2 = 61, 
		RULE_var_3 = 62, RULE_var_4 = 63, RULE_x1 = 64, RULE_true_grammer = 65, 
		RULE_false_grammer = 66, RULE_one_loop_body = 67, RULE_array_name = 68, 
		RULE_array_name_call = 69, RULE_array_value = 70, RULE_increase_and_decrease = 71, 
		RULE_any_name_without_keyword = 72, RULE_return_grammer = 73, RULE_json_grammer = 74, 
		RULE_open_par = 75, RULE_close_par = 76, RULE_value = 77, RULE_array_of_json_grammer = 78, 
		RULE_for_signs = 79, RULE_while_comper = 80, RULE_while_signs = 81, RULE_alter_table_stmt = 82, 
		RULE_alter_table_add_constraint = 83, RULE_alter_table_add = 84, RULE_create_table_stmt = 85, 
		RULE_csv_s = 86, RULE_json_s = 87, RULE_create_table_stmt1 = 88, RULE_create_tayp_stmt1 = 89, 
		RULE_delete_stmt = 90, RULE_drop_table_stmt = 91, RULE_insert_stmt = 92, 
		RULE_factored_select_stmt = 93, RULE_select_stmt = 94, RULE_select_or_values = 95, 
		RULE_update_stmt = 96, RULE_column_def = 97, RULE_type_name = 98, RULE_column_constraint = 99, 
		RULE_column_constraint_primary_key = 100, RULE_column_constraint_foreign_key = 101, 
		RULE_column_constraint_not_null = 102, RULE_column_constraint_null = 103, 
		RULE_column_default = 104, RULE_column_default_value = 105, RULE_exprwhere = 106, 
		RULE_expr = 107, RULE_expr_for_var = 108, RULE_expr_without_comper = 109, 
		RULE_opeeration = 110, RULE_var1 = 111, RULE_function_expr = 112, RULE_expr1 = 113, 
		RULE_foreign_key_clause = 114, RULE_fk_target_column_name = 115, RULE_indexed_column = 116, 
		RULE_table_constraint = 117, RULE_table_constraint_primary_key = 118, 
		RULE_table_constraint_foreign_key = 119, RULE_table_constraint_unique = 120, 
		RULE_table_constraint_key = 121, RULE_fk_origin_column_name = 122, RULE_qualified_table_name = 123, 
		RULE_ordering_term = 124, RULE_pragma_value = 125, RULE_common_table_expression = 126, 
		RULE_result_column = 127, RULE_table_or_subquery = 128, RULE_join_clause = 129, 
		RULE_join_operator = 130, RULE_join_constraint = 131, RULE_select_core = 132, 
		RULE_cte_table_name = 133, RULE_signed_number = 134, RULE_literal_value = 135, 
		RULE_unary_operator = 136, RULE_error_message = 137, RULE_module_argument = 138, 
		RULE_column_alias = 139, RULE_keyword = 140, RULE_unknown = 141, RULE_name = 142, 
		RULE_function_name = 143, RULE_database_name = 144, RULE_source_table_name = 145, 
		RULE_table_name = 146, RULE_table_or_index_name = 147, RULE_new_table_name = 148, 
		RULE_column_name = 149, RULE_collation_name = 150, RULE_foreign_table = 151, 
		RULE_index_name = 152, RULE_trigger_name = 153, RULE_view_name = 154, 
		RULE_module_name = 155, RULE_pragma_name = 156, RULE_savepoint_name = 157, 
		RULE_table_alias = 158, RULE_transaction_name = 159, RULE_any_name = 160;
	private static String[] makeRuleNames() {
		return new String[] {
			"parse", "error", "sql_stmt_list", "sql_stmt", "create_aggerationt_function", 
			"params_agg_fun", "jar_path", "class_name", "method_name", "return_type", 
			"params", "create_type", "create_type_value", "create_type_value1", "number_k", 
			"string_k", "boolean_k", "print_grammer", "printG", "java_function_declaration_List", 
			"java_function_declaration", "java_function_header", "java_function_call", 
			"java_function_call_for_var", "java_function_call_for_var1", "java_function_call_for_loop", 
			"java_function_body", "loops_body", "list_loopStatement", "loopStatement", 
			"higher_order_function", "return_body", "array_Intill_grammer", "parameters_list", 
			"arguments_list", "arguments_list_body", "parms", "prams_with_ingth", 
			"while_grammer", "while_body_graammer", "do_while_grammer", "while_header_grammer", 
			"while_header_grammer1", "ll1", "if_oneline_grammer", "if_oneline_signl_grammer", 
			"true_or_false", "if_grammer1", "if_else_grammer", "if_grammer", "if_header_grammer", 
			"foreach_grammer", "foreach_header_grammer", "for_grammer", "for_header", 
			"switch_grammer", "switch_header_grammer", "case_grammer", "default_grammer", 
			"var_grammer0", "var_grammer", "var_grammer2", "var_3", "var_4", "x1", 
			"true_grammer", "false_grammer", "one_loop_body", "array_name", "array_name_call", 
			"array_value", "increase_and_decrease", "any_name_without_keyword", "return_grammer", 
			"json_grammer", "open_par", "close_par", "value", "array_of_json_grammer", 
			"for_signs", "while_comper", "while_signs", "alter_table_stmt", "alter_table_add_constraint", 
			"alter_table_add", "create_table_stmt", "csv_s", "json_s", "create_table_stmt1", 
			"create_tayp_stmt1", "delete_stmt", "drop_table_stmt", "insert_stmt", 
			"factored_select_stmt", "select_stmt", "select_or_values", "update_stmt", 
			"column_def", "type_name", "column_constraint", "column_constraint_primary_key", 
			"column_constraint_foreign_key", "column_constraint_not_null", "column_constraint_null", 
			"column_default", "column_default_value", "exprwhere", "expr", "expr_for_var", 
			"expr_without_comper", "opeeration", "var1", "function_expr", "expr1", 
			"foreign_key_clause", "fk_target_column_name", "indexed_column", "table_constraint", 
			"table_constraint_primary_key", "table_constraint_foreign_key", "table_constraint_unique", 
			"table_constraint_key", "fk_origin_column_name", "qualified_table_name", 
			"ordering_term", "pragma_value", "common_table_expression", "result_column", 
			"table_or_subquery", "join_clause", "join_operator", "join_constraint", 
			"select_core", "cte_table_name", "signed_number", "literal_value", "unary_operator", 
			"error_message", "module_argument", "column_alias", "keyword", "unknown", 
			"name", "function_name", "database_name", "source_table_name", "table_name", 
			"table_or_index_name", "new_table_name", "column_name", "collation_name", 
			"foreign_table", "index_name", "trigger_name", "view_name", "module_name", 
			"pragma_name", "savepoint_name", "table_alias", "transaction_name", "any_name"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'CSV'", "'JSON'", "'{'", "'}'", "'[]'", "'true'", "'false'", "'&&'", 
			"'''", "'\"'", "'[][]'", "'null'", "'--'", "'++'", "'\"csv\"'", "'csv'", 
			"'\"json\"'", "'json'", "'::'", "';'", "'.'", "'('", "'['", "']'", "')'", 
			"','", "'='", "'*'", "'+'", "'-'", "'~'", "'||'", "'/'", "'%'", "'<<'", 
			"'>>'", "'&'", "'|'", "'<'", "'<='", "'>'", "'>='", "'=='", "'!='", "'<>'", 
			"'?'", "':'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, "SCOL", "DOT", "OPEN_PAR", 
			"OPEN_ARRAY", "CLOSE_ARRAY", "CLOSE_PAR", "COMMA", "ASSIGN", "STAR", 
			"PLUS", "MINUS", "TILDE", "PIPE2", "DIV", "MOD", "LT2", "GT2", "AMP", 
			"PIPE", "LT", "LT_EQ", "GT", "GT_EQ", "EQ", "NOT_EQ1", "NOT_EQ2", "QM", 
			"DD", "K_ABORT", "K_ACTION", "K_ADD", "K_AFTER", "K_ALL", "K_ALTER", 
			"K_ANALYZE", "K_AND", "K_AS", "K_ASC", "K_ATTACH", "K_AUTOINCREMENT", 
			"K_BEFORE", "K_BEGIN", "K_BETWEEN", "K_BY", "K_CASCADE", "K_CASE", "K_CONTINUE", 
			"K_CAST", "K_CHECK", "K_COLLATE", "K_COLUMN", "K_COMMIT", "K_CONFLICT", 
			"K_CONSTRAINT", "K_CREATE", "K_CROSS", "K_CURRENT_DATE", "K_CURRENT_TIME", 
			"K_CURRENT_TIMESTAMP", "K_DATABASE", "K_DEFAULT", "K_DEFERRABLE", "K_DEFERRED", 
			"K_DELETE", "K_DESC", "K_DETACH", "K_DISTINCT", "K_DROP", "K_EACH", "K_ELSE", 
			"K_END", "K_ENABLE", "K_ESCAPE", "K_EXCEPT", "K_EXCLUSIVE", "K_EXISTS", 
			"K_EXPLAIN", "K_FAIL", "K_FOR", "K_FOREIGN", "K_FROM", "K_FULL", "K_GLOB", 
			"K_GROUP", "K_HAVING", "K_IF", "K_IGNORE", "K_IMMEDIATE", "K_IN", "K_INDEX", 
			"K_INDEXED", "K_INITIALLY", "K_INNER", "K_INSERT", "K_INSTEAD", "K_INTERSECT", 
			"K_INTO", "K_IS", "K_ISNULL", "K_JOIN", "K_KEY", "K_LEFT", "K_LIKE", 
			"K_LIMIT", "K_MATCH", "K_NATURAL", "K_NEXTVAL", "K_NO", "K_NOT", "K_NOTNULL", 
			"K_NULL", "K_OF", "K_OFFSET", "K_ON", "K_ONLY", "K_OR", "K_ORDER", "K_OUTER", 
			"K_PLAN", "K_PRAGMA", "K_PRIMARY", "K_QUERY", "K_RAISE", "K_RECURSIVE", 
			"K_REFERENCES", "K_REGEXP", "K_REINDEX", "K_RELEASE", "K_RENAME", "K_REPLACE", 
			"K_RESTRICT", "K_RIGHT", "K_ROLLBACK", "K_ROW", "K_SAVEPOINT", "K_SELECT", 
			"K_SET", "K_TABLE", "K_TEMP", "K_TEMPORARY", "K_THEN", "K_TO", "K_TRANSACTION", 
			"K_TRIGGER", "K_UNION", "K_UNIQUE", "K_UPDATE", "K_USING", "K_VACUUM", 
			"K_VALUES", "K_VIEW", "K_VIRTUAL", "K_WHEN", "K_WHERE", "K_WITH", "K_WITHOUT", 
			"K_VAR", "K_FOREACH", "K_RETURN", "K_ARRAY", "K_WHILE", "K_SWITCH", "K_BREAK", 
			"K_DO", "K_FUNCTION", "K_PRINT", "K_TRUE", "K_FALSE", "K_TYPE", "K_PATH", 
			"K_STRING", "K_BOOLEAN", "K_number", "K_CSV", "K_JSON", "IDENTIFIER", 
			"IDENTIFIER1", "NUMERIC_LITERAL", "BIND_PARAMETER", "STRING_LITERAL", 
			"BLOB_LITERAL", "MULTILINE_COMMENT", "SPACES", "UNEXPECTED_CHAR", "WHILE_SIGNS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "SQL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SQLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ParseContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(SQLParser.EOF, 0); }
		public List<Sql_stmt_listContext> sql_stmt_list() {
			return getRuleContexts(Sql_stmt_listContext.class);
		}
		public Sql_stmt_listContext sql_stmt_list(int i) {
			return getRuleContext(Sql_stmt_listContext.class,i);
		}
		public List<Java_function_declaration_ListContext> java_function_declaration_List() {
			return getRuleContexts(Java_function_declaration_ListContext.class);
		}
		public Java_function_declaration_ListContext java_function_declaration_List(int i) {
			return getRuleContext(Java_function_declaration_ListContext.class,i);
		}
		public List<Java_function_callContext> java_function_call() {
			return getRuleContexts(Java_function_callContext.class);
		}
		public Java_function_callContext java_function_call(int i) {
			return getRuleContext(Java_function_callContext.class,i);
		}
		public List<ErrorContext> error() {
			return getRuleContexts(ErrorContext.class);
		}
		public ErrorContext error(int i) {
			return getRuleContext(ErrorContext.class,i);
		}
		public ParseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterParse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitParse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitParse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParseContext parse() throws RecognitionException {
		ParseContext _localctx = new ParseContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_parse);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(328);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SCOL) | (1L << OPEN_PAR) | (1L << K_ALTER))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (K_CREATE - 74)) | (1L << (K_DELETE - 74)) | (1L << (K_DROP - 74)) | (1L << (K_INSERT - 74)))) != 0) || ((((_la - 155)) & ~0x3f) == 0 && ((1L << (_la - 155)) & ((1L << (K_SELECT - 155)) | (1L << (K_UPDATE - 155)) | (1L << (K_VALUES - 155)) | (1L << (IDENTIFIER - 155)) | (1L << (STRING_LITERAL - 155)) | (1L << (UNEXPECTED_CHAR - 155)))) != 0)) {
				{
				setState(326);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(322);
					sql_stmt_list();
					}
					break;
				case 2:
					{
					setState(323);
					java_function_declaration_List();
					}
					break;
				case 3:
					{
					setState(324);
					java_function_call();
					}
					break;
				case 4:
					{
					setState(325);
					error();
					}
					break;
				}
				}
				setState(330);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(331);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ErrorContext extends ParserRuleContext {
		public Token UNEXPECTED_CHAR;
		public TerminalNode UNEXPECTED_CHAR() { return getToken(SQLParser.UNEXPECTED_CHAR, 0); }
		public ErrorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_error; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterError(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitError(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitError(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ErrorContext error() throws RecognitionException {
		ErrorContext _localctx = new ErrorContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_error);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(333);
			((ErrorContext)_localctx).UNEXPECTED_CHAR = match(UNEXPECTED_CHAR);

			     throw new RuntimeException("UNEXPECTED_CHAR=" + (((ErrorContext)_localctx).UNEXPECTED_CHAR!=null?((ErrorContext)_localctx).UNEXPECTED_CHAR.getText():null));
			   
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sql_stmt_listContext extends ParserRuleContext {
		public List<Sql_stmtContext> sql_stmt() {
			return getRuleContexts(Sql_stmtContext.class);
		}
		public Sql_stmtContext sql_stmt(int i) {
			return getRuleContext(Sql_stmtContext.class,i);
		}
		public List<TerminalNode> SCOL() { return getTokens(SQLParser.SCOL); }
		public TerminalNode SCOL(int i) {
			return getToken(SQLParser.SCOL, i);
		}
		public Sql_stmt_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sql_stmt_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterSql_stmt_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitSql_stmt_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitSql_stmt_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sql_stmt_listContext sql_stmt_list() throws RecognitionException {
		Sql_stmt_listContext _localctx = new Sql_stmt_listContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_sql_stmt_list);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(339);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SCOL) {
				{
				{
				setState(336);
				match(SCOL);
				}
				}
				setState(341);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(342);
			sql_stmt();
			setState(351);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(344); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(343);
						match(SCOL);
						}
						}
						setState(346); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==SCOL );
					setState(348);
					sql_stmt();
					}
					} 
				}
				setState(353);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(357);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(354);
					match(SCOL);
					}
					} 
				}
				setState(359);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sql_stmtContext extends ParserRuleContext {
		public Create_aggerationt_functionContext create_aggerationt_function() {
			return getRuleContext(Create_aggerationt_functionContext.class,0);
		}
		public Alter_table_stmtContext alter_table_stmt() {
			return getRuleContext(Alter_table_stmtContext.class,0);
		}
		public Create_table_stmtContext create_table_stmt() {
			return getRuleContext(Create_table_stmtContext.class,0);
		}
		public Create_typeContext create_type() {
			return getRuleContext(Create_typeContext.class,0);
		}
		public Delete_stmtContext delete_stmt() {
			return getRuleContext(Delete_stmtContext.class,0);
		}
		public Drop_table_stmtContext drop_table_stmt() {
			return getRuleContext(Drop_table_stmtContext.class,0);
		}
		public Factored_select_stmtContext factored_select_stmt() {
			return getRuleContext(Factored_select_stmtContext.class,0);
		}
		public Insert_stmtContext insert_stmt() {
			return getRuleContext(Insert_stmtContext.class,0);
		}
		public Update_stmtContext update_stmt() {
			return getRuleContext(Update_stmtContext.class,0);
		}
		public Sql_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sql_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterSql_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitSql_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitSql_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sql_stmtContext sql_stmt() throws RecognitionException {
		Sql_stmtContext _localctx = new Sql_stmtContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_sql_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(369);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(360);
				create_aggerationt_function();
				}
				break;
			case 2:
				{
				setState(361);
				alter_table_stmt();
				}
				break;
			case 3:
				{
				setState(362);
				create_table_stmt();
				}
				break;
			case 4:
				{
				setState(363);
				create_type();
				}
				break;
			case 5:
				{
				setState(364);
				delete_stmt();
				}
				break;
			case 6:
				{
				setState(365);
				drop_table_stmt();
				}
				break;
			case 7:
				{
				setState(366);
				factored_select_stmt();
				}
				break;
			case 8:
				{
				setState(367);
				insert_stmt();
				}
				break;
			case 9:
				{
				setState(368);
				update_stmt();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_aggerationt_functionContext extends ParserRuleContext {
		public TerminalNode K_CREATE() { return getToken(SQLParser.K_CREATE, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public Jar_pathContext jar_path() {
			return getRuleContext(Jar_pathContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public Class_nameContext class_name() {
			return getRuleContext(Class_nameContext.class,0);
		}
		public Method_nameContext method_name() {
			return getRuleContext(Method_nameContext.class,0);
		}
		public Return_typeContext return_type() {
			return getRuleContext(Return_typeContext.class,0);
		}
		public TerminalNode OPEN_ARRAY() { return getToken(SQLParser.OPEN_ARRAY, 0); }
		public Params_agg_funContext params_agg_fun() {
			return getRuleContext(Params_agg_funContext.class,0);
		}
		public TerminalNode CLOSE_ARRAY() { return getToken(SQLParser.CLOSE_ARRAY, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public TerminalNode SCOL() { return getToken(SQLParser.SCOL, 0); }
		public List<Any_name_without_keywordContext> any_name_without_keyword() {
			return getRuleContexts(Any_name_without_keywordContext.class);
		}
		public Any_name_without_keywordContext any_name_without_keyword(int i) {
			return getRuleContext(Any_name_without_keywordContext.class,i);
		}
		public Create_aggerationt_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_aggerationt_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterCreate_aggerationt_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitCreate_aggerationt_function(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitCreate_aggerationt_function(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_aggerationt_functionContext create_aggerationt_function() throws RecognitionException {
		Create_aggerationt_functionContext _localctx = new Create_aggerationt_functionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_create_aggerationt_function);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(371);
			match(K_CREATE);
			setState(375);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(372);
					any_name_without_keyword();
					}
					} 
				}
				setState(377);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			setState(378);
			match(OPEN_PAR);
			setState(379);
			jar_path();
			setState(380);
			match(COMMA);
			setState(381);
			class_name();
			setState(382);
			match(COMMA);
			setState(383);
			method_name();
			setState(384);
			match(COMMA);
			setState(385);
			return_type();
			setState(386);
			match(COMMA);
			setState(387);
			match(OPEN_ARRAY);
			setState(388);
			params_agg_fun();
			setState(389);
			match(CLOSE_ARRAY);
			setState(390);
			match(CLOSE_PAR);
			setState(391);
			match(SCOL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Params_agg_funContext extends ParserRuleContext {
		public TerminalNode K_number() { return getToken(SQLParser.K_number, 0); }
		public TerminalNode K_STRING() { return getToken(SQLParser.K_STRING, 0); }
		public TerminalNode K_BOOLEAN() { return getToken(SQLParser.K_BOOLEAN, 0); }
		public Params_agg_funContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params_agg_fun; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterParams_agg_fun(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitParams_agg_fun(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitParams_agg_fun(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Params_agg_funContext params_agg_fun() throws RecognitionException {
		Params_agg_funContext _localctx = new Params_agg_funContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_params_agg_fun);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(393);
			_la = _input.LA(1);
			if ( !(((((_la - 190)) & ~0x3f) == 0 && ((1L << (_la - 190)) & ((1L << (K_STRING - 190)) | (1L << (K_BOOLEAN - 190)) | (1L << (K_number - 190)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Jar_pathContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Jar_pathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jar_path; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterJar_path(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitJar_path(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitJar_path(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Jar_pathContext jar_path() throws RecognitionException {
		Jar_pathContext _localctx = new Jar_pathContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_jar_path);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(395);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Class_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Class_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterClass_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitClass_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitClass_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_nameContext class_name() throws RecognitionException {
		Class_nameContext _localctx = new Class_nameContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_class_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(397);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Method_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Method_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterMethod_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitMethod_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitMethod_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Method_nameContext method_name() throws RecognitionException {
		Method_nameContext _localctx = new Method_nameContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_method_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(399);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Return_typeContext extends ParserRuleContext {
		public TerminalNode K_number() { return getToken(SQLParser.K_number, 0); }
		public TerminalNode K_STRING() { return getToken(SQLParser.K_STRING, 0); }
		public TerminalNode K_BOOLEAN() { return getToken(SQLParser.K_BOOLEAN, 0); }
		public Return_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterReturn_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitReturn_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitReturn_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_typeContext return_type() throws RecognitionException {
		Return_typeContext _localctx = new Return_typeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_return_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(401);
			_la = _input.LA(1);
			if ( !(((((_la - 190)) & ~0x3f) == 0 && ((1L << (_la - 190)) & ((1L << (K_STRING - 190)) | (1L << (K_BOOLEAN - 190)) | (1L << (K_number - 190)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamsContext extends ParserRuleContext {
		public List<Any_name_without_keywordContext> any_name_without_keyword() {
			return getRuleContexts(Any_name_without_keywordContext.class);
		}
		public Any_name_without_keywordContext any_name_without_keyword(int i) {
			return getRuleContext(Any_name_without_keywordContext.class,i);
		}
		public List<TerminalNode> NUMERIC_LITERAL() { return getTokens(SQLParser.NUMERIC_LITERAL); }
		public TerminalNode NUMERIC_LITERAL(int i) {
			return getToken(SQLParser.NUMERIC_LITERAL, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitParams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_params);
		int _la;
		try {
			setState(415);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_PAR:
			case IDENTIFIER:
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(403);
				any_name_without_keyword();
				}
				break;
			case NUMERIC_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(404);
				match(NUMERIC_LITERAL);
				setState(412);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(405);
					match(COMMA);
					setState(408);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case OPEN_PAR:
					case IDENTIFIER:
					case STRING_LITERAL:
						{
						setState(406);
						any_name_without_keyword();
						}
						break;
					case NUMERIC_LITERAL:
						{
						setState(407);
						match(NUMERIC_LITERAL);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					}
					setState(414);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_typeContext extends ParserRuleContext {
		public TerminalNode K_CREATE() { return getToken(SQLParser.K_CREATE, 0); }
		public List<TerminalNode> K_TYPE() { return getTokens(SQLParser.K_TYPE); }
		public TerminalNode K_TYPE(int i) {
			return getToken(SQLParser.K_TYPE, i);
		}
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public List<Column_defContext> column_def() {
			return getRuleContexts(Column_defContext.class);
		}
		public Column_defContext column_def(int i) {
			return getRuleContext(Column_defContext.class,i);
		}
		public List<Create_type_valueContext> create_type_value() {
			return getRuleContexts(Create_type_valueContext.class);
		}
		public Create_type_valueContext create_type_value(int i) {
			return getRuleContext(Create_type_valueContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public List<TerminalNode> ASSIGN() { return getTokens(SQLParser.ASSIGN); }
		public TerminalNode ASSIGN(int i) {
			return getToken(SQLParser.ASSIGN, i);
		}
		public TerminalNode K_PATH() { return getToken(SQLParser.K_PATH, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public List<Table_constraintContext> table_constraint() {
			return getRuleContexts(Table_constraintContext.class);
		}
		public Table_constraintContext table_constraint(int i) {
			return getRuleContext(Table_constraintContext.class,i);
		}
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Create_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterCreate_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitCreate_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitCreate_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_typeContext create_type() throws RecognitionException {
		Create_typeContext _localctx = new Create_typeContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_create_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(417);
			match(K_CREATE);
			setState(418);
			match(K_TYPE);
			setState(419);
			table_name();
			{
			setState(420);
			match(OPEN_PAR);
			setState(421);
			column_def();
			setState(422);
			create_type_value();
			setState(431);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				setState(429);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(423);
					match(COMMA);
					setState(424);
					table_constraint();
					}
					break;
				case 2:
					{
					setState(425);
					match(COMMA);
					setState(426);
					column_def();
					setState(427);
					create_type_value();
					}
					break;
				}
				}
				setState(433);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(434);
			match(CLOSE_PAR);
			}
			setState(442);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_TYPE) {
				{
				setState(436);
				match(K_TYPE);
				setState(437);
				match(ASSIGN);
				setState(438);
				_la = _input.LA(1);
				if ( !(_la==T__0 || _la==T__1) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(439);
				match(K_PATH);
				setState(440);
				match(ASSIGN);
				{
				setState(441);
				any_name();
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_type_valueContext extends ParserRuleContext {
		public TerminalNode K_number() { return getToken(SQLParser.K_number, 0); }
		public TerminalNode K_STRING() { return getToken(SQLParser.K_STRING, 0); }
		public TerminalNode K_BOOLEAN() { return getToken(SQLParser.K_BOOLEAN, 0); }
		public Any_name_without_keywordContext any_name_without_keyword() {
			return getRuleContext(Any_name_without_keywordContext.class,0);
		}
		public Create_type_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_type_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterCreate_type_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitCreate_type_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitCreate_type_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_type_valueContext create_type_value() throws RecognitionException {
		Create_type_valueContext _localctx = new Create_type_valueContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_create_type_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(448);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_number:
				{
				setState(444);
				match(K_number);
				}
				break;
			case K_STRING:
				{
				setState(445);
				match(K_STRING);
				}
				break;
			case K_BOOLEAN:
				{
				setState(446);
				match(K_BOOLEAN);
				}
				break;
			case OPEN_PAR:
			case IDENTIFIER:
			case STRING_LITERAL:
				{
				setState(447);
				any_name_without_keyword();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_type_value1Context extends ParserRuleContext {
		public TerminalNode K_number() { return getToken(SQLParser.K_number, 0); }
		public TerminalNode K_STRING() { return getToken(SQLParser.K_STRING, 0); }
		public TerminalNode K_BOOLEAN() { return getToken(SQLParser.K_BOOLEAN, 0); }
		public Create_type_value1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_type_value1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterCreate_type_value1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitCreate_type_value1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitCreate_type_value1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_type_value1Context create_type_value1() throws RecognitionException {
		Create_type_value1Context _localctx = new Create_type_value1Context(_ctx, getState());
		enterRule(_localctx, 26, RULE_create_type_value1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(450);
			_la = _input.LA(1);
			if ( !(((((_la - 190)) & ~0x3f) == 0 && ((1L << (_la - 190)) & ((1L << (K_STRING - 190)) | (1L << (K_BOOLEAN - 190)) | (1L << (K_number - 190)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Number_kContext extends ParserRuleContext {
		public TerminalNode K_number() { return getToken(SQLParser.K_number, 0); }
		public Number_kContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number_k; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterNumber_k(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitNumber_k(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitNumber_k(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Number_kContext number_k() throws RecognitionException {
		Number_kContext _localctx = new Number_kContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_number_k);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(452);
			match(K_number);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class String_kContext extends ParserRuleContext {
		public TerminalNode K_STRING() { return getToken(SQLParser.K_STRING, 0); }
		public String_kContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_k; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterString_k(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitString_k(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitString_k(this);
			else return visitor.visitChildren(this);
		}
	}

	public final String_kContext string_k() throws RecognitionException {
		String_kContext _localctx = new String_kContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_string_k);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(454);
			match(K_STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Boolean_kContext extends ParserRuleContext {
		public TerminalNode K_BOOLEAN() { return getToken(SQLParser.K_BOOLEAN, 0); }
		public Boolean_kContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolean_k; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterBoolean_k(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitBoolean_k(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitBoolean_k(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Boolean_kContext boolean_k() throws RecognitionException {
		Boolean_kContext _localctx = new Boolean_kContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_boolean_k);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(456);
			match(K_BOOLEAN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Print_grammerContext extends ParserRuleContext {
		public TerminalNode K_PRINT() { return getToken(SQLParser.K_PRINT, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public TerminalNode SCOL() { return getToken(SQLParser.SCOL, 0); }
		public List<PrintGContext> printG() {
			return getRuleContexts(PrintGContext.class);
		}
		public PrintGContext printG(int i) {
			return getRuleContext(PrintGContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(SQLParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(SQLParser.PLUS, i);
		}
		public Print_grammerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print_grammer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterPrint_grammer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitPrint_grammer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitPrint_grammer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Print_grammerContext print_grammer() throws RecognitionException {
		Print_grammerContext _localctx = new Print_grammerContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_print_grammer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(458);
			match(K_PRINT);
			setState(459);
			match(OPEN_PAR);
			{
			setState(460);
			printG();
			setState(465);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS) {
				{
				{
				setState(461);
				match(PLUS);
				setState(462);
				printG();
				}
				}
				setState(467);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(468);
			match(CLOSE_PAR);
			setState(469);
			match(SCOL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrintGContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Java_function_call_for_loopContext java_function_call_for_loop() {
			return getRuleContext(Java_function_call_for_loopContext.class,0);
		}
		public Increase_and_decreaseContext increase_and_decrease() {
			return getRuleContext(Increase_and_decreaseContext.class,0);
		}
		public Array_nameContext array_name() {
			return getRuleContext(Array_nameContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PrintGContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printG; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterPrintG(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitPrintG(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitPrintG(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintGContext printG() throws RecognitionException {
		PrintGContext _localctx = new PrintGContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_printG);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(476);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(471);
				any_name();
				}
				break;
			case 2:
				{
				setState(472);
				java_function_call_for_loop();
				}
				break;
			case 3:
				{
				setState(473);
				increase_and_decrease();
				}
				break;
			case 4:
				{
				setState(474);
				array_name();
				}
				break;
			case 5:
				{
				setState(475);
				expr(0);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Java_function_declaration_ListContext extends ParserRuleContext {
		public List<Java_function_declarationContext> java_function_declaration() {
			return getRuleContexts(Java_function_declarationContext.class);
		}
		public Java_function_declarationContext java_function_declaration(int i) {
			return getRuleContext(Java_function_declarationContext.class,i);
		}
		public Java_function_declaration_ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_java_function_declaration_List; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterJava_function_declaration_List(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitJava_function_declaration_List(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitJava_function_declaration_List(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Java_function_declaration_ListContext java_function_declaration_List() throws RecognitionException {
		Java_function_declaration_ListContext _localctx = new Java_function_declaration_ListContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_java_function_declaration_List);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(478);
			java_function_declaration();
			setState(482);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(479);
					java_function_declaration();
					}
					} 
				}
				setState(484);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Java_function_declarationContext extends ParserRuleContext {
		public Java_function_headerContext java_function_header() {
			return getRuleContext(Java_function_headerContext.class,0);
		}
		public Java_function_bodyContext java_function_body() {
			return getRuleContext(Java_function_bodyContext.class,0);
		}
		public Java_function_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_java_function_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterJava_function_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitJava_function_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitJava_function_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Java_function_declarationContext java_function_declaration() throws RecognitionException {
		Java_function_declarationContext _localctx = new Java_function_declarationContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_java_function_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(485);
			java_function_header();
			setState(486);
			java_function_body();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Java_function_headerContext extends ParserRuleContext {
		public Any_name_without_keywordContext any_name_without_keyword() {
			return getRuleContext(Any_name_without_keywordContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public Parameters_listContext parameters_list() {
			return getRuleContext(Parameters_listContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public Java_function_headerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_java_function_header; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterJava_function_header(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitJava_function_header(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitJava_function_header(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Java_function_headerContext java_function_header() throws RecognitionException {
		Java_function_headerContext _localctx = new Java_function_headerContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_java_function_header);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(488);
			any_name_without_keyword();
			setState(489);
			match(OPEN_PAR);
			setState(490);
			parameters_list();
			setState(491);
			match(CLOSE_PAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Java_function_callContext extends ParserRuleContext {
		public Any_name_without_keywordContext any_name_without_keyword() {
			return getRuleContext(Any_name_without_keywordContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public Arguments_listContext arguments_list() {
			return getRuleContext(Arguments_listContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public TerminalNode SCOL() { return getToken(SQLParser.SCOL, 0); }
		public TerminalNode COMMA() { return getToken(SQLParser.COMMA, 0); }
		public Higher_order_functionContext higher_order_function() {
			return getRuleContext(Higher_order_functionContext.class,0);
		}
		public Java_function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_java_function_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterJava_function_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitJava_function_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitJava_function_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Java_function_callContext java_function_call() throws RecognitionException {
		Java_function_callContext _localctx = new Java_function_callContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_java_function_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(493);
			any_name_without_keyword();
			setState(494);
			match(OPEN_PAR);
			setState(495);
			arguments_list();
			setState(498);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(496);
				match(COMMA);
				setState(497);
				higher_order_function();
				}
			}

			setState(500);
			match(CLOSE_PAR);
			setState(501);
			match(SCOL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Java_function_call_for_varContext extends ParserRuleContext {
		public Any_name_without_keywordContext any_name_without_keyword() {
			return getRuleContext(Any_name_without_keywordContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public Arguments_listContext arguments_list() {
			return getRuleContext(Arguments_listContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public Java_function_call_for_varContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_java_function_call_for_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterJava_function_call_for_var(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitJava_function_call_for_var(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitJava_function_call_for_var(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Java_function_call_for_varContext java_function_call_for_var() throws RecognitionException {
		Java_function_call_for_varContext _localctx = new Java_function_call_for_varContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_java_function_call_for_var);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(503);
			any_name_without_keyword();
			setState(504);
			match(OPEN_PAR);
			setState(505);
			arguments_list();
			setState(506);
			match(CLOSE_PAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Java_function_call_for_var1Context extends ParserRuleContext {
		public Any_name_without_keywordContext any_name_without_keyword() {
			return getRuleContext(Any_name_without_keywordContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public Arguments_listContext arguments_list() {
			return getRuleContext(Arguments_listContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public TerminalNode COMMA() { return getToken(SQLParser.COMMA, 0); }
		public Higher_order_functionContext higher_order_function() {
			return getRuleContext(Higher_order_functionContext.class,0);
		}
		public Java_function_call_for_var1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_java_function_call_for_var1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterJava_function_call_for_var1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitJava_function_call_for_var1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitJava_function_call_for_var1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Java_function_call_for_var1Context java_function_call_for_var1() throws RecognitionException {
		Java_function_call_for_var1Context _localctx = new Java_function_call_for_var1Context(_ctx, getState());
		enterRule(_localctx, 48, RULE_java_function_call_for_var1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(508);
			any_name_without_keyword();
			setState(509);
			match(OPEN_PAR);
			setState(510);
			arguments_list();
			setState(513);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(511);
				match(COMMA);
				setState(512);
				higher_order_function();
				}
			}

			setState(515);
			match(CLOSE_PAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Java_function_call_for_loopContext extends ParserRuleContext {
		public Any_name_without_keywordContext any_name_without_keyword() {
			return getRuleContext(Any_name_without_keywordContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public Arguments_listContext arguments_list() {
			return getRuleContext(Arguments_listContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public Java_function_call_for_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_java_function_call_for_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterJava_function_call_for_loop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitJava_function_call_for_loop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitJava_function_call_for_loop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Java_function_call_for_loopContext java_function_call_for_loop() throws RecognitionException {
		Java_function_call_for_loopContext _localctx = new Java_function_call_for_loopContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_java_function_call_for_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(517);
			any_name_without_keyword();
			setState(518);
			match(OPEN_PAR);
			setState(519);
			arguments_list();
			setState(520);
			match(CLOSE_PAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Java_function_bodyContext extends ParserRuleContext {
		public List_loopStatementContext list_loopStatement() {
			return getRuleContext(List_loopStatementContext.class,0);
		}
		public Java_function_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_java_function_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterJava_function_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitJava_function_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitJava_function_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Java_function_bodyContext java_function_body() throws RecognitionException {
		Java_function_bodyContext _localctx = new Java_function_bodyContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_java_function_body);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(522);
			match(T__2);
			setState(523);
			list_loopStatement();
			setState(524);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Loops_bodyContext extends ParserRuleContext {
		public List<Sql_stmt_listContext> sql_stmt_list() {
			return getRuleContexts(Sql_stmt_listContext.class);
		}
		public Sql_stmt_listContext sql_stmt_list(int i) {
			return getRuleContext(Sql_stmt_listContext.class,i);
		}
		public List<Var_grammerContext> var_grammer() {
			return getRuleContexts(Var_grammerContext.class);
		}
		public Var_grammerContext var_grammer(int i) {
			return getRuleContext(Var_grammerContext.class,i);
		}
		public List<For_grammerContext> for_grammer() {
			return getRuleContexts(For_grammerContext.class);
		}
		public For_grammerContext for_grammer(int i) {
			return getRuleContext(For_grammerContext.class,i);
		}
		public List<Foreach_grammerContext> foreach_grammer() {
			return getRuleContexts(Foreach_grammerContext.class);
		}
		public Foreach_grammerContext foreach_grammer(int i) {
			return getRuleContext(Foreach_grammerContext.class,i);
		}
		public List<If_else_grammerContext> if_else_grammer() {
			return getRuleContexts(If_else_grammerContext.class);
		}
		public If_else_grammerContext if_else_grammer(int i) {
			return getRuleContext(If_else_grammerContext.class,i);
		}
		public List<While_grammerContext> while_grammer() {
			return getRuleContexts(While_grammerContext.class);
		}
		public While_grammerContext while_grammer(int i) {
			return getRuleContext(While_grammerContext.class,i);
		}
		public List<Do_while_grammerContext> do_while_grammer() {
			return getRuleContexts(Do_while_grammerContext.class);
		}
		public Do_while_grammerContext do_while_grammer(int i) {
			return getRuleContext(Do_while_grammerContext.class,i);
		}
		public List<Switch_grammerContext> switch_grammer() {
			return getRuleContexts(Switch_grammerContext.class);
		}
		public Switch_grammerContext switch_grammer(int i) {
			return getRuleContext(Switch_grammerContext.class,i);
		}
		public List<Array_Intill_grammerContext> array_Intill_grammer() {
			return getRuleContexts(Array_Intill_grammerContext.class);
		}
		public Array_Intill_grammerContext array_Intill_grammer(int i) {
			return getRuleContext(Array_Intill_grammerContext.class,i);
		}
		public List<Java_function_callContext> java_function_call() {
			return getRuleContexts(Java_function_callContext.class);
		}
		public Java_function_callContext java_function_call(int i) {
			return getRuleContext(Java_function_callContext.class,i);
		}
		public List<Increase_and_decreaseContext> increase_and_decrease() {
			return getRuleContexts(Increase_and_decreaseContext.class);
		}
		public Increase_and_decreaseContext increase_and_decrease(int i) {
			return getRuleContext(Increase_and_decreaseContext.class,i);
		}
		public List<TerminalNode> SCOL() { return getTokens(SQLParser.SCOL); }
		public TerminalNode SCOL(int i) {
			return getToken(SQLParser.SCOL, i);
		}
		public List<Return_grammerContext> return_grammer() {
			return getRuleContexts(Return_grammerContext.class);
		}
		public Return_grammerContext return_grammer(int i) {
			return getRuleContext(Return_grammerContext.class,i);
		}
		public List<Array_valueContext> array_value() {
			return getRuleContexts(Array_valueContext.class);
		}
		public Array_valueContext array_value(int i) {
			return getRuleContext(Array_valueContext.class,i);
		}
		public List<Array_of_json_grammerContext> array_of_json_grammer() {
			return getRuleContexts(Array_of_json_grammerContext.class);
		}
		public Array_of_json_grammerContext array_of_json_grammer(int i) {
			return getRuleContext(Array_of_json_grammerContext.class,i);
		}
		public List<Print_grammerContext> print_grammer() {
			return getRuleContexts(Print_grammerContext.class);
		}
		public Print_grammerContext print_grammer(int i) {
			return getRuleContext(Print_grammerContext.class,i);
		}
		public Loops_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loops_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterLoops_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitLoops_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitLoops_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Loops_bodyContext loops_body() throws RecognitionException {
		Loops_bodyContext _localctx = new Loops_bodyContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_loops_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(545);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SCOL) | (1L << OPEN_PAR) | (1L << PLUS) | (1L << MINUS) | (1L << K_ALTER))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (K_CREATE - 74)) | (1L << (K_DELETE - 74)) | (1L << (K_DROP - 74)) | (1L << (K_FOR - 74)) | (1L << (K_IF - 74)) | (1L << (K_INSERT - 74)))) != 0) || ((((_la - 155)) & ~0x3f) == 0 && ((1L << (_la - 155)) & ((1L << (K_SELECT - 155)) | (1L << (K_UPDATE - 155)) | (1L << (K_VALUES - 155)) | (1L << (K_VAR - 155)) | (1L << (K_RETURN - 155)) | (1L << (K_WHILE - 155)) | (1L << (K_SWITCH - 155)) | (1L << (K_DO - 155)) | (1L << (K_PRINT - 155)) | (1L << (IDENTIFIER - 155)) | (1L << (STRING_LITERAL - 155)))) != 0)) {
				{
				setState(543);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
				case 1:
					{
					setState(526);
					sql_stmt_list();
					}
					break;
				case 2:
					{
					setState(527);
					var_grammer();
					}
					break;
				case 3:
					{
					setState(528);
					for_grammer();
					}
					break;
				case 4:
					{
					setState(529);
					foreach_grammer();
					}
					break;
				case 5:
					{
					setState(530);
					if_else_grammer();
					}
					break;
				case 6:
					{
					setState(531);
					while_grammer();
					}
					break;
				case 7:
					{
					setState(532);
					do_while_grammer();
					}
					break;
				case 8:
					{
					setState(533);
					switch_grammer();
					}
					break;
				case 9:
					{
					setState(534);
					array_Intill_grammer();
					}
					break;
				case 10:
					{
					setState(535);
					java_function_call();
					}
					break;
				case 11:
					{
					setState(536);
					increase_and_decrease();
					setState(537);
					match(SCOL);
					}
					break;
				case 12:
					{
					setState(539);
					return_grammer();
					}
					break;
				case 13:
					{
					setState(540);
					array_value();
					}
					break;
				case 14:
					{
					setState(541);
					array_of_json_grammer();
					}
					break;
				case 15:
					{
					setState(542);
					print_grammer();
					}
					break;
				}
				}
				setState(547);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class List_loopStatementContext extends ParserRuleContext {
		public List<LoopStatementContext> loopStatement() {
			return getRuleContexts(LoopStatementContext.class);
		}
		public LoopStatementContext loopStatement(int i) {
			return getRuleContext(LoopStatementContext.class,i);
		}
		public List_loopStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list_loopStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterList_loopStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitList_loopStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitList_loopStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final List_loopStatementContext list_loopStatement() throws RecognitionException {
		List_loopStatementContext _localctx = new List_loopStatementContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_list_loopStatement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(551);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(548);
					loopStatement();
					}
					} 
				}
				setState(553);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			}
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LoopStatementContext extends ParserRuleContext {
		public Sql_stmt_listContext sql_stmt_list() {
			return getRuleContext(Sql_stmt_listContext.class,0);
		}
		public Var_grammerContext var_grammer() {
			return getRuleContext(Var_grammerContext.class,0);
		}
		public For_grammerContext for_grammer() {
			return getRuleContext(For_grammerContext.class,0);
		}
		public Foreach_grammerContext foreach_grammer() {
			return getRuleContext(Foreach_grammerContext.class,0);
		}
		public If_else_grammerContext if_else_grammer() {
			return getRuleContext(If_else_grammerContext.class,0);
		}
		public While_grammerContext while_grammer() {
			return getRuleContext(While_grammerContext.class,0);
		}
		public Do_while_grammerContext do_while_grammer() {
			return getRuleContext(Do_while_grammerContext.class,0);
		}
		public Switch_grammerContext switch_grammer() {
			return getRuleContext(Switch_grammerContext.class,0);
		}
		public Array_valueContext array_value() {
			return getRuleContext(Array_valueContext.class,0);
		}
		public Array_Intill_grammerContext array_Intill_grammer() {
			return getRuleContext(Array_Intill_grammerContext.class,0);
		}
		public Print_grammerContext print_grammer() {
			return getRuleContext(Print_grammerContext.class,0);
		}
		public Java_function_declarationContext java_function_declaration() {
			return getRuleContext(Java_function_declarationContext.class,0);
		}
		public Java_function_callContext java_function_call() {
			return getRuleContext(Java_function_callContext.class,0);
		}
		public Increase_and_decreaseContext increase_and_decrease() {
			return getRuleContext(Increase_and_decreaseContext.class,0);
		}
		public TerminalNode SCOL() { return getToken(SQLParser.SCOL, 0); }
		public Array_of_json_grammerContext array_of_json_grammer() {
			return getRuleContext(Array_of_json_grammerContext.class,0);
		}
		public Return_grammerContext return_grammer() {
			return getRuleContext(Return_grammerContext.class,0);
		}
		public LoopStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterLoopStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitLoopStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitLoopStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopStatementContext loopStatement() throws RecognitionException {
		LoopStatementContext _localctx = new LoopStatementContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_loopStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(572);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(554);
				sql_stmt_list();
				}
				break;
			case 2:
				{
				setState(555);
				var_grammer();
				}
				break;
			case 3:
				{
				setState(556);
				for_grammer();
				}
				break;
			case 4:
				{
				setState(557);
				foreach_grammer();
				}
				break;
			case 5:
				{
				setState(558);
				if_else_grammer();
				}
				break;
			case 6:
				{
				setState(559);
				while_grammer();
				}
				break;
			case 7:
				{
				setState(560);
				do_while_grammer();
				}
				break;
			case 8:
				{
				setState(561);
				switch_grammer();
				}
				break;
			case 9:
				{
				setState(562);
				array_value();
				}
				break;
			case 10:
				{
				setState(563);
				array_Intill_grammer();
				}
				break;
			case 11:
				{
				setState(564);
				print_grammer();
				}
				break;
			case 12:
				{
				setState(565);
				java_function_declaration();
				}
				break;
			case 13:
				{
				setState(566);
				java_function_call();
				}
				break;
			case 14:
				{
				setState(567);
				increase_and_decrease();
				setState(568);
				match(SCOL);
				}
				break;
			case 15:
				{
				setState(570);
				array_of_json_grammer();
				}
				break;
			case 16:
				{
				setState(571);
				return_grammer();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Higher_order_functionContext extends ParserRuleContext {
		public TerminalNode K_FUNCTION() { return getToken(SQLParser.K_FUNCTION, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public Loops_bodyContext loops_body() {
			return getRuleContext(Loops_bodyContext.class,0);
		}
		public List<Any_name_without_keywordContext> any_name_without_keyword() {
			return getRuleContexts(Any_name_without_keywordContext.class);
		}
		public Any_name_without_keywordContext any_name_without_keyword(int i) {
			return getRuleContext(Any_name_without_keywordContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public Higher_order_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_higher_order_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterHigher_order_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitHigher_order_function(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitHigher_order_function(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Higher_order_functionContext higher_order_function() throws RecognitionException {
		Higher_order_functionContext _localctx = new Higher_order_functionContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_higher_order_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(574);
			match(K_FUNCTION);
			setState(575);
			match(OPEN_PAR);
			{
			setState(576);
			any_name_without_keyword();
			setState(581);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(577);
				match(COMMA);
				setState(578);
				any_name_without_keyword();
				}
				}
				setState(583);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(584);
			match(CLOSE_PAR);
			setState(585);
			match(T__2);
			setState(586);
			loops_body();
			setState(587);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Return_bodyContext extends ParserRuleContext {
		public For_signsContext for_signs() {
			return getRuleContext(For_signsContext.class,0);
		}
		public List<Any_name_without_keywordContext> any_name_without_keyword() {
			return getRuleContexts(Any_name_without_keywordContext.class);
		}
		public Any_name_without_keywordContext any_name_without_keyword(int i) {
			return getRuleContext(Any_name_without_keywordContext.class,i);
		}
		public List<TerminalNode> WHILE_SIGNS() { return getTokens(SQLParser.WHILE_SIGNS); }
		public TerminalNode WHILE_SIGNS(int i) {
			return getToken(SQLParser.WHILE_SIGNS, i);
		}
		public Return_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterReturn_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitReturn_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitReturn_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_bodyContext return_body() throws RecognitionException {
		Return_bodyContext _localctx = new Return_bodyContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_return_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(589);
			any_name_without_keyword();
			setState(594);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHILE_SIGNS) {
				{
				{
				setState(590);
				match(WHILE_SIGNS);
				setState(591);
				any_name_without_keyword();
				}
				}
				setState(596);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(597);
			for_signs();
			{
			setState(598);
			any_name_without_keyword();
			setState(603);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHILE_SIGNS) {
				{
				{
				setState(599);
				match(WHILE_SIGNS);
				setState(600);
				any_name_without_keyword();
				}
				}
				setState(605);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Array_Intill_grammerContext extends ParserRuleContext {
		public TerminalNode K_VAR() { return getToken(SQLParser.K_VAR, 0); }
		public TerminalNode ASSIGN() { return getToken(SQLParser.ASSIGN, 0); }
		public TerminalNode SCOL() { return getToken(SQLParser.SCOL, 0); }
		public List<Any_name_without_keywordContext> any_name_without_keyword() {
			return getRuleContexts(Any_name_without_keywordContext.class);
		}
		public Any_name_without_keywordContext any_name_without_keyword(int i) {
			return getRuleContext(Any_name_without_keywordContext.class,i);
		}
		public Java_function_call_for_loopContext java_function_call_for_loop() {
			return getRuleContext(Java_function_call_for_loopContext.class,0);
		}
		public Sql_stmtContext sql_stmt() {
			return getRuleContext(Sql_stmtContext.class,0);
		}
		public If_oneline_grammerContext if_oneline_grammer() {
			return getRuleContext(If_oneline_grammerContext.class,0);
		}
		public List<TerminalNode> OPEN_ARRAY() { return getTokens(SQLParser.OPEN_ARRAY); }
		public TerminalNode OPEN_ARRAY(int i) {
			return getToken(SQLParser.OPEN_ARRAY, i);
		}
		public List<TerminalNode> CLOSE_ARRAY() { return getTokens(SQLParser.CLOSE_ARRAY); }
		public TerminalNode CLOSE_ARRAY(int i) {
			return getToken(SQLParser.CLOSE_ARRAY, i);
		}
		public TerminalNode IDENTIFIER() { return getToken(SQLParser.IDENTIFIER, 0); }
		public List<TerminalNode> NUMERIC_LITERAL() { return getTokens(SQLParser.NUMERIC_LITERAL); }
		public TerminalNode NUMERIC_LITERAL(int i) {
			return getToken(SQLParser.NUMERIC_LITERAL, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public Array_Intill_grammerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_Intill_grammer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterArray_Intill_grammer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitArray_Intill_grammer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitArray_Intill_grammer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_Intill_grammerContext array_Intill_grammer() throws RecognitionException {
		Array_Intill_grammerContext _localctx = new Array_Intill_grammerContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_array_Intill_grammer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(606);
			match(K_VAR);
			setState(665);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				{
				setState(649);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IDENTIFIER:
					{
					{
					setState(607);
					match(IDENTIFIER);
					setState(626);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
					case 1:
						{
						setState(608);
						match(OPEN_ARRAY);
						setState(611);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case OPEN_PAR:
						case IDENTIFIER:
						case STRING_LITERAL:
							{
							setState(609);
							any_name_without_keyword();
							}
							break;
						case NUMERIC_LITERAL:
							{
							setState(610);
							match(NUMERIC_LITERAL);
							}
							break;
						case CLOSE_ARRAY:
							break;
						default:
							break;
						}
						setState(613);
						match(CLOSE_ARRAY);
						}
						break;
					case 2:
						{
						setState(614);
						match(OPEN_ARRAY);
						setState(617);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case OPEN_PAR:
						case IDENTIFIER:
						case STRING_LITERAL:
							{
							setState(615);
							any_name_without_keyword();
							}
							break;
						case NUMERIC_LITERAL:
							{
							setState(616);
							match(NUMERIC_LITERAL);
							}
							break;
						case CLOSE_ARRAY:
							break;
						default:
							break;
						}
						setState(619);
						match(CLOSE_ARRAY);
						setState(620);
						match(OPEN_ARRAY);
						setState(623);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case OPEN_PAR:
						case IDENTIFIER:
						case STRING_LITERAL:
							{
							setState(621);
							any_name_without_keyword();
							}
							break;
						case NUMERIC_LITERAL:
							{
							setState(622);
							match(NUMERIC_LITERAL);
							}
							break;
						case CLOSE_ARRAY:
							break;
						default:
							break;
						}
						setState(625);
						match(CLOSE_ARRAY);
						}
						break;
					}
					}
					}
					break;
				case OPEN_ARRAY:
					{
					{
					setState(646);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
					case 1:
						{
						setState(628);
						match(OPEN_ARRAY);
						setState(631);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case OPEN_PAR:
						case IDENTIFIER:
						case STRING_LITERAL:
							{
							setState(629);
							any_name_without_keyword();
							}
							break;
						case NUMERIC_LITERAL:
							{
							setState(630);
							match(NUMERIC_LITERAL);
							}
							break;
						case CLOSE_ARRAY:
							break;
						default:
							break;
						}
						setState(633);
						match(CLOSE_ARRAY);
						}
						break;
					case 2:
						{
						setState(634);
						match(OPEN_ARRAY);
						setState(637);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case OPEN_PAR:
						case IDENTIFIER:
						case STRING_LITERAL:
							{
							setState(635);
							any_name_without_keyword();
							}
							break;
						case NUMERIC_LITERAL:
							{
							setState(636);
							match(NUMERIC_LITERAL);
							}
							break;
						case CLOSE_ARRAY:
							break;
						default:
							break;
						}
						setState(639);
						match(CLOSE_ARRAY);
						setState(640);
						match(OPEN_ARRAY);
						setState(643);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case OPEN_PAR:
						case IDENTIFIER:
						case STRING_LITERAL:
							{
							setState(641);
							any_name_without_keyword();
							}
							break;
						case NUMERIC_LITERAL:
							{
							setState(642);
							match(NUMERIC_LITERAL);
							}
							break;
						case CLOSE_ARRAY:
							break;
						default:
							break;
						}
						setState(645);
						match(CLOSE_ARRAY);
						}
						break;
					}
					setState(648);
					match(IDENTIFIER);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 2:
				{
				setState(663);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IDENTIFIER:
					{
					{
					setState(651);
					match(IDENTIFIER);
					setState(655);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
					case 1:
						{
						setState(652);
						match(T__4);
						}
						break;
					case 2:
						{
						setState(653);
						match(T__4);
						setState(654);
						match(T__4);
						}
						break;
					}
					}
					}
					break;
				case T__4:
					{
					{
					setState(660);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
					case 1:
						{
						setState(657);
						match(T__4);
						}
						break;
					case 2:
						{
						setState(658);
						match(T__4);
						setState(659);
						match(T__4);
						}
						break;
					}
					setState(662);
					match(IDENTIFIER);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			}
			setState(667);
			match(ASSIGN);
			setState(708);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SCOL:
			case OPEN_ARRAY:
				{
				setState(700);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPEN_ARRAY) {
					{
					setState(668);
					match(OPEN_ARRAY);
					setState(697);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
					case 1:
						{
						{
						setState(671);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case OPEN_PAR:
						case IDENTIFIER:
						case STRING_LITERAL:
							{
							setState(669);
							any_name_without_keyword();
							}
							break;
						case NUMERIC_LITERAL:
							{
							setState(670);
							match(NUMERIC_LITERAL);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(680);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==COMMA) {
							{
							{
							setState(673);
							match(COMMA);
							setState(676);
							_errHandler.sync(this);
							switch (_input.LA(1)) {
							case OPEN_PAR:
							case IDENTIFIER:
							case STRING_LITERAL:
								{
								setState(674);
								any_name_without_keyword();
								}
								break;
							case NUMERIC_LITERAL:
								{
								setState(675);
								match(NUMERIC_LITERAL);
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							}
							}
							setState(682);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
						}
						break;
					case 2:
						{
						{
						setState(685);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case OPEN_PAR:
						case IDENTIFIER:
						case STRING_LITERAL:
							{
							setState(683);
							any_name_without_keyword();
							}
							break;
						case NUMERIC_LITERAL:
							{
							setState(684);
							match(NUMERIC_LITERAL);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(694);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==COMMA) {
							{
							{
							setState(687);
							match(COMMA);
							setState(690);
							_errHandler.sync(this);
							switch (_input.LA(1)) {
							case OPEN_PAR:
							case IDENTIFIER:
							case STRING_LITERAL:
								{
								setState(688);
								any_name_without_keyword();
								}
								break;
							case NUMERIC_LITERAL:
								{
								setState(689);
								match(NUMERIC_LITERAL);
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							}
							}
							setState(696);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
						}
						break;
					}
					setState(699);
					match(CLOSE_ARRAY);
					}
				}

				}
				break;
			case OPEN_PAR:
			case K_ALTER:
			case K_CREATE:
			case K_DELETE:
			case K_DROP:
			case K_INSERT:
			case K_SELECT:
			case K_UPDATE:
			case K_VALUES:
			case IDENTIFIER:
			case STRING_LITERAL:
				{
				setState(706);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
				case 1:
					{
					setState(702);
					any_name_without_keyword();
					}
					break;
				case 2:
					{
					setState(703);
					java_function_call_for_loop();
					}
					break;
				case 3:
					{
					setState(704);
					sql_stmt();
					}
					break;
				case 4:
					{
					setState(705);
					if_oneline_grammer();
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(710);
			match(SCOL);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Parameters_listContext extends ParserRuleContext {
		public List<Prams_with_ingthContext> prams_with_ingth() {
			return getRuleContexts(Prams_with_ingthContext.class);
		}
		public Prams_with_ingthContext prams_with_ingth(int i) {
			return getRuleContext(Prams_with_ingthContext.class,i);
		}
		public List<ParmsContext> parms() {
			return getRuleContexts(ParmsContext.class);
		}
		public ParmsContext parms(int i) {
			return getRuleContext(ParmsContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public Parameters_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterParameters_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitParameters_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitParameters_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parameters_listContext parameters_list() throws RecognitionException {
		Parameters_listContext _localctx = new Parameters_listContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_parameters_list);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(743);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				{
				setState(713);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_VAR) {
					{
					setState(712);
					parms();
					}
				}

				}
				break;
			case 2:
				{
				{
				setState(715);
				prams_with_ingth();
				setState(720);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(716);
					match(COMMA);
					setState(717);
					prams_with_ingth();
					}
					}
					setState(722);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			case 3:
				{
				{
				setState(733);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==K_VAR) {
					{
					{
					setState(723);
					parms();
					setState(728);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(724);
							match(COMMA);
							setState(725);
							parms();
							}
							} 
						}
						setState(730);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
					}
					}
					}
					setState(735);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(740);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(736);
					match(COMMA);
					setState(737);
					prams_with_ingth();
					}
					}
					setState(742);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Arguments_listContext extends ParserRuleContext {
		public List<Arguments_list_bodyContext> arguments_list_body() {
			return getRuleContexts(Arguments_list_bodyContext.class);
		}
		public Arguments_list_bodyContext arguments_list_body(int i) {
			return getRuleContext(Arguments_list_bodyContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public Arguments_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterArguments_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitArguments_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitArguments_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Arguments_listContext arguments_list() throws RecognitionException {
		Arguments_listContext _localctx = new Arguments_listContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_arguments_list);
		int _la;
		try {
			int _alt;
			setState(756);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(746);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPEN_PAR || ((((_la - 195)) & ~0x3f) == 0 && ((1L << (_la - 195)) & ((1L << (IDENTIFIER - 195)) | (1L << (NUMERIC_LITERAL - 195)) | (1L << (STRING_LITERAL - 195)))) != 0)) {
					{
					setState(745);
					arguments_list_body();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(748);
				arguments_list_body();
				setState(753);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(749);
						match(COMMA);
						{
						setState(750);
						arguments_list_body();
						}
						}
						} 
					}
					setState(755);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Arguments_list_bodyContext extends ParserRuleContext {
		public Any_name_without_keywordContext any_name_without_keyword() {
			return getRuleContext(Any_name_without_keywordContext.class,0);
		}
		public TerminalNode NUMERIC_LITERAL() { return getToken(SQLParser.NUMERIC_LITERAL, 0); }
		public Array_name_callContext array_name_call() {
			return getRuleContext(Array_name_callContext.class,0);
		}
		public Java_function_call_for_loopContext java_function_call_for_loop() {
			return getRuleContext(Java_function_call_for_loopContext.class,0);
		}
		public Arguments_list_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments_list_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterArguments_list_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitArguments_list_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitArguments_list_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Arguments_list_bodyContext arguments_list_body() throws RecognitionException {
		Arguments_list_bodyContext _localctx = new Arguments_list_bodyContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_arguments_list_body);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(762);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				{
				setState(758);
				any_name_without_keyword();
				}
				break;
			case 2:
				{
				setState(759);
				match(NUMERIC_LITERAL);
				}
				break;
			case 3:
				{
				setState(760);
				array_name_call();
				}
				break;
			case 4:
				{
				setState(761);
				java_function_call_for_loop();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParmsContext extends ParserRuleContext {
		public TerminalNode K_VAR() { return getToken(SQLParser.K_VAR, 0); }
		public Any_name_without_keywordContext any_name_without_keyword() {
			return getRuleContext(Any_name_without_keywordContext.class,0);
		}
		public ParmsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parms; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterParms(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitParms(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitParms(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParmsContext parms() throws RecognitionException {
		ParmsContext _localctx = new ParmsContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_parms);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(764);
			match(K_VAR);
			setState(765);
			any_name_without_keyword();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Prams_with_ingthContext extends ParserRuleContext {
		public TerminalNode K_VAR() { return getToken(SQLParser.K_VAR, 0); }
		public Any_name_without_keywordContext any_name_without_keyword() {
			return getRuleContext(Any_name_without_keywordContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(SQLParser.ASSIGN, 0); }
		public TerminalNode NUMERIC_LITERAL() { return getToken(SQLParser.NUMERIC_LITERAL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Prams_with_ingthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prams_with_ingth; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterPrams_with_ingth(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitPrams_with_ingth(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitPrams_with_ingth(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Prams_with_ingthContext prams_with_ingth() throws RecognitionException {
		Prams_with_ingthContext _localctx = new Prams_with_ingthContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_prams_with_ingth);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(767);
			match(K_VAR);
			setState(768);
			any_name_without_keyword();
			{
			setState(769);
			match(ASSIGN);
			setState(772);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				{
				setState(770);
				match(NUMERIC_LITERAL);
				}
				break;
			case 2:
				{
				setState(771);
				expr(0);
				}
				break;
			}
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class While_grammerContext extends ParserRuleContext {
		public TerminalNode K_WHILE() { return getToken(SQLParser.K_WHILE, 0); }
		public While_header_grammerContext while_header_grammer() {
			return getRuleContext(While_header_grammerContext.class,0);
		}
		public While_body_graammerContext while_body_graammer() {
			return getRuleContext(While_body_graammerContext.class,0);
		}
		public While_grammerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_grammer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterWhile_grammer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitWhile_grammer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitWhile_grammer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_grammerContext while_grammer() throws RecognitionException {
		While_grammerContext _localctx = new While_grammerContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_while_grammer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(774);
			match(K_WHILE);
			setState(775);
			while_header_grammer();
			setState(776);
			while_body_graammer();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class While_body_graammerContext extends ParserRuleContext {
		public One_loop_bodyContext one_loop_body() {
			return getRuleContext(One_loop_bodyContext.class,0);
		}
		public List<List_loopStatementContext> list_loopStatement() {
			return getRuleContexts(List_loopStatementContext.class);
		}
		public List_loopStatementContext list_loopStatement(int i) {
			return getRuleContext(List_loopStatementContext.class,i);
		}
		public TerminalNode K_CONTINUE() { return getToken(SQLParser.K_CONTINUE, 0); }
		public TerminalNode SCOL() { return getToken(SQLParser.SCOL, 0); }
		public While_body_graammerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_body_graammer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterWhile_body_graammer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitWhile_body_graammer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitWhile_body_graammer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_body_graammerContext while_body_graammer() throws RecognitionException {
		While_body_graammerContext _localctx = new While_body_graammerContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_while_body_graammer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(797);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				{
				{
				setState(778);
				match(T__2);
				setState(792);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
				case 1:
					{
					{
					setState(779);
					list_loopStatement();
					setState(782);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_CONTINUE) {
						{
						setState(780);
						match(K_CONTINUE);
						setState(781);
						match(SCOL);
						}
					}

					setState(785);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
					case 1:
						{
						setState(784);
						list_loopStatement();
						}
						break;
					}
					}
					}
					break;
				case 2:
					{
					{
					setState(789);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_CONTINUE) {
						{
						setState(787);
						match(K_CONTINUE);
						setState(788);
						match(SCOL);
						}
					}

					setState(791);
					list_loopStatement();
					}
					}
					break;
				}
				setState(794);
				match(T__3);
				}
				}
				break;
			case SCOL:
			case OPEN_PAR:
			case PLUS:
			case MINUS:
			case K_ALTER:
			case K_CREATE:
			case K_DELETE:
			case K_DROP:
			case K_FOR:
			case K_IF:
			case K_INSERT:
			case K_SELECT:
			case K_UPDATE:
			case K_VALUES:
			case K_VAR:
			case K_RETURN:
			case K_WHILE:
			case K_SWITCH:
			case K_DO:
			case K_PRINT:
			case IDENTIFIER:
			case STRING_LITERAL:
				{
				setState(796);
				one_loop_body();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Do_while_grammerContext extends ParserRuleContext {
		public TerminalNode K_DO() { return getToken(SQLParser.K_DO, 0); }
		public While_body_graammerContext while_body_graammer() {
			return getRuleContext(While_body_graammerContext.class,0);
		}
		public While_header_grammerContext while_header_grammer() {
			return getRuleContext(While_header_grammerContext.class,0);
		}
		public TerminalNode SCOL() { return getToken(SQLParser.SCOL, 0); }
		public Do_while_grammerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_do_while_grammer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterDo_while_grammer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitDo_while_grammer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitDo_while_grammer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Do_while_grammerContext do_while_grammer() throws RecognitionException {
		Do_while_grammerContext _localctx = new Do_while_grammerContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_do_while_grammer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(799);
			match(K_DO);
			setState(800);
			while_body_graammer();
			setState(801);
			while_header_grammer();
			setState(802);
			match(SCOL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class While_header_grammerContext extends ParserRuleContext {
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public Java_function_call_for_loopContext java_function_call_for_loop() {
			return getRuleContext(Java_function_call_for_loopContext.class,0);
		}
		public While_comperContext while_comper() {
			return getRuleContext(While_comperContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public While_header_grammerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_header_grammer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterWhile_header_grammer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitWhile_header_grammer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitWhile_header_grammer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_header_grammerContext while_header_grammer() throws RecognitionException {
		While_header_grammerContext _localctx = new While_header_grammerContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_while_header_grammer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(804);
			match(OPEN_PAR);
			setState(820);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				{
				setState(805);
				java_function_call_for_loop();
				setState(809);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT) | (1L << LT_EQ) | (1L << GT) | (1L << GT_EQ) | (1L << EQ) | (1L << NOT_EQ1))) != 0)) {
					{
					setState(806);
					while_comper();
					setState(807);
					_la = _input.LA(1);
					if ( !(_la==T__5 || _la==T__6) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				}
				break;
			case 2:
				{
				{
				setState(811);
				expr(0);
				}
				setState(812);
				while_comper();
				{
				setState(816);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case OPEN_PAR:
				case PLUS:
				case MINUS:
				case TILDE:
				case K_ABORT:
				case K_ACTION:
				case K_ADD:
				case K_AFTER:
				case K_ALL:
				case K_ALTER:
				case K_ANALYZE:
				case K_AND:
				case K_AS:
				case K_ASC:
				case K_ATTACH:
				case K_AUTOINCREMENT:
				case K_BEFORE:
				case K_BEGIN:
				case K_BETWEEN:
				case K_BY:
				case K_CASCADE:
				case K_CASE:
				case K_CAST:
				case K_CHECK:
				case K_COLLATE:
				case K_COLUMN:
				case K_COMMIT:
				case K_CONFLICT:
				case K_CONSTRAINT:
				case K_CREATE:
				case K_CROSS:
				case K_CURRENT_DATE:
				case K_CURRENT_TIME:
				case K_CURRENT_TIMESTAMP:
				case K_DATABASE:
				case K_DEFAULT:
				case K_DEFERRABLE:
				case K_DEFERRED:
				case K_DELETE:
				case K_DESC:
				case K_DETACH:
				case K_DISTINCT:
				case K_DROP:
				case K_EACH:
				case K_ELSE:
				case K_END:
				case K_ENABLE:
				case K_ESCAPE:
				case K_EXCEPT:
				case K_EXCLUSIVE:
				case K_EXISTS:
				case K_EXPLAIN:
				case K_FAIL:
				case K_FOR:
				case K_FOREIGN:
				case K_FROM:
				case K_FULL:
				case K_GLOB:
				case K_GROUP:
				case K_HAVING:
				case K_IF:
				case K_IGNORE:
				case K_IMMEDIATE:
				case K_IN:
				case K_INDEX:
				case K_INDEXED:
				case K_INITIALLY:
				case K_INNER:
				case K_INSERT:
				case K_INSTEAD:
				case K_INTERSECT:
				case K_INTO:
				case K_IS:
				case K_ISNULL:
				case K_JOIN:
				case K_KEY:
				case K_LEFT:
				case K_LIKE:
				case K_LIMIT:
				case K_MATCH:
				case K_NATURAL:
				case K_NEXTVAL:
				case K_NO:
				case K_NOT:
				case K_NOTNULL:
				case K_NULL:
				case K_OF:
				case K_OFFSET:
				case K_ON:
				case K_OR:
				case K_ORDER:
				case K_OUTER:
				case K_PLAN:
				case K_PRAGMA:
				case K_PRIMARY:
				case K_QUERY:
				case K_RAISE:
				case K_RECURSIVE:
				case K_REFERENCES:
				case K_REGEXP:
				case K_REINDEX:
				case K_RELEASE:
				case K_RENAME:
				case K_REPLACE:
				case K_RESTRICT:
				case K_RIGHT:
				case K_ROLLBACK:
				case K_ROW:
				case K_SAVEPOINT:
				case K_SELECT:
				case K_SET:
				case K_TABLE:
				case K_TEMP:
				case K_TEMPORARY:
				case K_THEN:
				case K_TO:
				case K_TRANSACTION:
				case K_TRIGGER:
				case K_UNION:
				case K_UNIQUE:
				case K_UPDATE:
				case K_USING:
				case K_VACUUM:
				case K_VALUES:
				case K_VIEW:
				case K_VIRTUAL:
				case K_WHEN:
				case K_WHERE:
				case K_WITH:
				case K_WITHOUT:
				case K_RETURN:
				case K_WHILE:
				case K_SWITCH:
				case K_BREAK:
				case K_DO:
				case K_FUNCTION:
				case IDENTIFIER:
				case NUMERIC_LITERAL:
				case STRING_LITERAL:
				case BLOB_LITERAL:
					{
					setState(813);
					expr(0);
					}
					break;
				case T__5:
					{
					setState(814);
					match(T__5);
					}
					break;
				case T__6:
					{
					setState(815);
					match(T__6);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				break;
			case 3:
				{
				setState(818);
				match(T__5);
				}
				break;
			case 4:
				{
				setState(819);
				match(T__6);
				}
				break;
			}
			setState(822);
			match(CLOSE_PAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class While_header_grammer1Context extends ParserRuleContext {
		public TerminalNode K_WHILE() { return getToken(SQLParser.K_WHILE, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public Java_function_call_for_loopContext java_function_call_for_loop() {
			return getRuleContext(Java_function_call_for_loopContext.class,0);
		}
		public While_comperContext while_comper() {
			return getRuleContext(While_comperContext.class,0);
		}
		public List<Ll1Context> ll1() {
			return getRuleContexts(Ll1Context.class);
		}
		public Ll1Context ll1(int i) {
			return getRuleContext(Ll1Context.class,i);
		}
		public List<Any_name_without_keywordContext> any_name_without_keyword() {
			return getRuleContexts(Any_name_without_keywordContext.class);
		}
		public Any_name_without_keywordContext any_name_without_keyword(int i) {
			return getRuleContext(Any_name_without_keywordContext.class,i);
		}
		public List<TerminalNode> NUMERIC_LITERAL() { return getTokens(SQLParser.NUMERIC_LITERAL); }
		public TerminalNode NUMERIC_LITERAL(int i) {
			return getToken(SQLParser.NUMERIC_LITERAL, i);
		}
		public List<TerminalNode> PIPE2() { return getTokens(SQLParser.PIPE2); }
		public TerminalNode PIPE2(int i) {
			return getToken(SQLParser.PIPE2, i);
		}
		public List<While_signsContext> while_signs() {
			return getRuleContexts(While_signsContext.class);
		}
		public While_signsContext while_signs(int i) {
			return getRuleContext(While_signsContext.class,i);
		}
		public While_header_grammer1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_header_grammer1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterWhile_header_grammer1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitWhile_header_grammer1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitWhile_header_grammer1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_header_grammer1Context while_header_grammer1() throws RecognitionException {
		While_header_grammer1Context _localctx = new While_header_grammer1Context(_ctx, getState());
		enterRule(_localctx, 84, RULE_while_header_grammer1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(824);
			match(K_WHILE);
			setState(825);
			match(OPEN_PAR);
			setState(893);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
			case 1:
				{
				setState(826);
				java_function_call_for_loop();
				setState(830);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT) | (1L << LT_EQ) | (1L << GT) | (1L << GT_EQ) | (1L << EQ) | (1L << NOT_EQ1))) != 0)) {
					{
					setState(827);
					while_comper();
					setState(828);
					_la = _input.LA(1);
					if ( !(_la==T__5 || _la==T__6) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				}
				break;
			case 2:
				{
				{
				{
				{
				setState(835);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
				case 1:
					{
					setState(832);
					ll1();
					}
					break;
				case 2:
					{
					setState(833);
					any_name_without_keyword();
					}
					break;
				case 3:
					{
					setState(834);
					match(NUMERIC_LITERAL);
					}
					break;
				}
				setState(845);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STAR) | (1L << PLUS) | (1L << MINUS) | (1L << DIV) | (1L << MOD))) != 0)) {
					{
					{
					setState(837);
					while_signs();
					setState(841);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
					case 1:
						{
						setState(838);
						any_name_without_keyword();
						}
						break;
					case 2:
						{
						setState(839);
						match(NUMERIC_LITERAL);
						}
						break;
					case 3:
						{
						setState(840);
						ll1();
						}
						break;
					}
					}
					}
					setState(847);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				setState(867);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__7 || _la==PIPE2) {
					{
					{
					setState(848);
					_la = _input.LA(1);
					if ( !(_la==T__7 || _la==PIPE2) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					{
					setState(852);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
					case 1:
						{
						setState(849);
						ll1();
						}
						break;
					case 2:
						{
						setState(850);
						any_name_without_keyword();
						}
						break;
					case 3:
						{
						setState(851);
						match(NUMERIC_LITERAL);
						}
						break;
					}
					setState(862);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STAR) | (1L << PLUS) | (1L << MINUS) | (1L << DIV) | (1L << MOD))) != 0)) {
						{
						{
						setState(854);
						while_signs();
						setState(858);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
						case 1:
							{
							setState(855);
							any_name_without_keyword();
							}
							break;
						case 2:
							{
							setState(856);
							match(NUMERIC_LITERAL);
							}
							break;
						case 3:
							{
							setState(857);
							ll1();
							}
							break;
						}
						}
						}
						setState(864);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					}
					setState(869);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				setState(870);
				while_comper();
				setState(889);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case OPEN_PAR:
				case IDENTIFIER:
				case NUMERIC_LITERAL:
				case STRING_LITERAL:
					{
					{
					setState(874);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
					case 1:
						{
						setState(871);
						ll1();
						}
						break;
					case 2:
						{
						setState(872);
						any_name_without_keyword();
						}
						break;
					case 3:
						{
						setState(873);
						match(NUMERIC_LITERAL);
						}
						break;
					}
					setState(884);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STAR) | (1L << PLUS) | (1L << MINUS) | (1L << DIV) | (1L << MOD))) != 0)) {
						{
						{
						setState(876);
						while_signs();
						setState(880);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
						case 1:
							{
							setState(877);
							any_name_without_keyword();
							}
							break;
						case 2:
							{
							setState(878);
							match(NUMERIC_LITERAL);
							}
							break;
						case 3:
							{
							setState(879);
							ll1();
							}
							break;
						}
						}
						}
						setState(886);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					break;
				case T__5:
					{
					setState(887);
					match(T__5);
					}
					break;
				case T__6:
					{
					setState(888);
					match(T__6);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				break;
			case 3:
				{
				setState(891);
				match(T__5);
				}
				break;
			case 4:
				{
				setState(892);
				match(T__6);
				}
				break;
			}
			setState(895);
			match(CLOSE_PAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Ll1Context extends ParserRuleContext {
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public List<Ll1Context> ll1() {
			return getRuleContexts(Ll1Context.class);
		}
		public Ll1Context ll1(int i) {
			return getRuleContext(Ll1Context.class,i);
		}
		public List<While_signsContext> while_signs() {
			return getRuleContexts(While_signsContext.class);
		}
		public While_signsContext while_signs(int i) {
			return getRuleContext(While_signsContext.class,i);
		}
		public List<Any_name_without_keywordContext> any_name_without_keyword() {
			return getRuleContexts(Any_name_without_keywordContext.class);
		}
		public Any_name_without_keywordContext any_name_without_keyword(int i) {
			return getRuleContext(Any_name_without_keywordContext.class,i);
		}
		public List<TerminalNode> NUMERIC_LITERAL() { return getTokens(SQLParser.NUMERIC_LITERAL); }
		public TerminalNode NUMERIC_LITERAL(int i) {
			return getToken(SQLParser.NUMERIC_LITERAL, i);
		}
		public Ll1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ll1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterLl1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitLl1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitLl1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ll1Context ll1() throws RecognitionException {
		Ll1Context _localctx = new Ll1Context(_ctx, getState());
		enterRule(_localctx, 86, RULE_ll1);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(965);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
			case 1:
				{
				{
				setState(897);
				match(OPEN_PAR);
				setState(914);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,85,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(900);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case OPEN_PAR:
						case IDENTIFIER:
						case STRING_LITERAL:
							{
							setState(898);
							any_name_without_keyword();
							}
							break;
						case NUMERIC_LITERAL:
							{
							setState(899);
							match(NUMERIC_LITERAL);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(909);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,84,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(902);
								while_signs();
								setState(905);
								_errHandler.sync(this);
								switch (_input.LA(1)) {
								case OPEN_PAR:
								case IDENTIFIER:
								case STRING_LITERAL:
									{
									setState(903);
									any_name_without_keyword();
									}
									break;
								case NUMERIC_LITERAL:
									{
									setState(904);
									match(NUMERIC_LITERAL);
									}
									break;
								default:
									throw new NoViableAltException(this);
								}
								}
								} 
							}
							setState(911);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,84,_ctx);
						}
						}
						} 
					}
					setState(916);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,85,_ctx);
				}
				setState(937);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPEN_PAR) | (1L << STAR) | (1L << PLUS) | (1L << MINUS) | (1L << DIV) | (1L << MOD))) != 0) || ((((_la - 195)) & ~0x3f) == 0 && ((1L << (_la - 195)) & ((1L << (IDENTIFIER - 195)) | (1L << (NUMERIC_LITERAL - 195)) | (1L << (STRING_LITERAL - 195)))) != 0)) {
					{
					setState(935);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case STAR:
					case PLUS:
					case MINUS:
					case DIV:
					case MOD:
						{
						{
						setState(917);
						while_signs();
						setState(918);
						ll1();
						setState(919);
						while_signs();
						}
						}
						break;
					case OPEN_PAR:
					case IDENTIFIER:
					case NUMERIC_LITERAL:
					case STRING_LITERAL:
						{
						{
						setState(923);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case OPEN_PAR:
						case IDENTIFIER:
						case STRING_LITERAL:
							{
							setState(921);
							any_name_without_keyword();
							}
							break;
						case NUMERIC_LITERAL:
							{
							setState(922);
							match(NUMERIC_LITERAL);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(932);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,88,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(925);
								while_signs();
								setState(928);
								_errHandler.sync(this);
								switch (_input.LA(1)) {
								case OPEN_PAR:
								case IDENTIFIER:
								case STRING_LITERAL:
									{
									setState(926);
									any_name_without_keyword();
									}
									break;
								case NUMERIC_LITERAL:
									{
									setState(927);
									match(NUMERIC_LITERAL);
									}
									break;
								default:
									throw new NoViableAltException(this);
								}
								}
								} 
							}
							setState(934);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,88,_ctx);
						}
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(939);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(940);
				match(CLOSE_PAR);
				}
				}
				break;
			case 2:
				{
				{
				setState(941);
				match(OPEN_PAR);
				setState(947);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,91,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(942);
						ll1();
						setState(943);
						while_signs();
						}
						} 
					}
					setState(949);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,91,_ctx);
				}
				{
				setState(952);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case OPEN_PAR:
				case IDENTIFIER:
				case STRING_LITERAL:
					{
					setState(950);
					any_name_without_keyword();
					}
					break;
				case NUMERIC_LITERAL:
					{
					setState(951);
					match(NUMERIC_LITERAL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(961);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STAR) | (1L << PLUS) | (1L << MINUS) | (1L << DIV) | (1L << MOD))) != 0)) {
					{
					{
					setState(954);
					while_signs();
					setState(957);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case OPEN_PAR:
					case IDENTIFIER:
					case STRING_LITERAL:
						{
						setState(955);
						any_name_without_keyword();
						}
						break;
					case NUMERIC_LITERAL:
						{
						setState(956);
						match(NUMERIC_LITERAL);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					}
					setState(963);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				setState(964);
				match(CLOSE_PAR);
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_oneline_grammerContext extends ParserRuleContext {
		public List<Any_name_without_keywordContext> any_name_without_keyword() {
			return getRuleContexts(Any_name_without_keywordContext.class);
		}
		public Any_name_without_keywordContext any_name_without_keyword(int i) {
			return getRuleContext(Any_name_without_keywordContext.class,i);
		}
		public TerminalNode QM() { return getToken(SQLParser.QM, 0); }
		public TerminalNode DD() { return getToken(SQLParser.DD, 0); }
		public List<TerminalNode> OPEN_PAR() { return getTokens(SQLParser.OPEN_PAR); }
		public TerminalNode OPEN_PAR(int i) {
			return getToken(SQLParser.OPEN_PAR, i);
		}
		public List<TerminalNode> CLOSE_PAR() { return getTokens(SQLParser.CLOSE_PAR); }
		public TerminalNode CLOSE_PAR(int i) {
			return getToken(SQLParser.CLOSE_PAR, i);
		}
		public List<If_oneline_grammerContext> if_oneline_grammer() {
			return getRuleContexts(If_oneline_grammerContext.class);
		}
		public If_oneline_grammerContext if_oneline_grammer(int i) {
			return getRuleContext(If_oneline_grammerContext.class,i);
		}
		public Literal_valueContext literal_value() {
			return getRuleContext(Literal_valueContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(SQLParser.IDENTIFIER, 0); }
		public List<If_oneline_signl_grammerContext> if_oneline_signl_grammer() {
			return getRuleContexts(If_oneline_signl_grammerContext.class);
		}
		public If_oneline_signl_grammerContext if_oneline_signl_grammer(int i) {
			return getRuleContext(If_oneline_signl_grammerContext.class,i);
		}
		public List<TerminalNode> NUMERIC_LITERAL() { return getTokens(SQLParser.NUMERIC_LITERAL); }
		public TerminalNode NUMERIC_LITERAL(int i) {
			return getToken(SQLParser.NUMERIC_LITERAL, i);
		}
		public List<Java_function_call_for_loopContext> java_function_call_for_loop() {
			return getRuleContexts(Java_function_call_for_loopContext.class);
		}
		public Java_function_call_for_loopContext java_function_call_for_loop(int i) {
			return getRuleContext(Java_function_call_for_loopContext.class,i);
		}
		public List<TerminalNode> ASSIGN() { return getTokens(SQLParser.ASSIGN); }
		public TerminalNode ASSIGN(int i) {
			return getToken(SQLParser.ASSIGN, i);
		}
		public List<Array_nameContext> array_name() {
			return getRuleContexts(Array_nameContext.class);
		}
		public Array_nameContext array_name(int i) {
			return getRuleContext(Array_nameContext.class,i);
		}
		public If_oneline_grammerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_oneline_grammer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterIf_oneline_grammer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitIf_oneline_grammer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitIf_oneline_grammer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_oneline_grammerContext if_oneline_grammer() throws RecognitionException {
		If_oneline_grammerContext _localctx = new If_oneline_grammerContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_if_oneline_grammer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(968);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
			case 1:
				{
				setState(967);
				match(OPEN_PAR);
				}
				break;
			}
			setState(970);
			any_name_without_keyword();
			setState(980);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT) | (1L << LT_EQ) | (1L << GT) | (1L << GT_EQ) | (1L << EQ) | (1L << NOT_EQ1))) != 0)) {
				{
				setState(972); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(971);
					if_oneline_signl_grammer();
					}
					}
					setState(974); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT) | (1L << LT_EQ) | (1L << GT) | (1L << GT_EQ) | (1L << EQ) | (1L << NOT_EQ1))) != 0) );
				setState(978);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case K_CURRENT_DATE:
				case K_CURRENT_TIME:
				case K_CURRENT_TIMESTAMP:
				case K_NULL:
				case NUMERIC_LITERAL:
				case STRING_LITERAL:
				case BLOB_LITERAL:
					{
					setState(976);
					literal_value();
					}
					break;
				case IDENTIFIER:
					{
					setState(977);
					match(IDENTIFIER);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
			}

			setState(983);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CLOSE_PAR) {
				{
				setState(982);
				match(CLOSE_PAR);
				}
			}

			setState(985);
			match(QM);
			setState(987);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
			case 1:
				{
				setState(986);
				match(OPEN_PAR);
				}
				break;
			}
			setState(1004);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,105,_ctx) ) {
			case 1:
				{
				{
				setState(989);
				if_oneline_grammer();
				}
				}
				break;
			case 2:
				{
				{
				setState(997);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
				case 1:
					{
					setState(993);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
					case 1:
						{
						setState(990);
						any_name_without_keyword();
						}
						break;
					case 2:
						{
						setState(991);
						java_function_call_for_loop();
						}
						break;
					case 3:
						{
						setState(992);
						array_name();
						}
						break;
					}
					setState(995);
					match(ASSIGN);
					}
					break;
				}
				setState(1002);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,104,_ctx) ) {
				case 1:
					{
					setState(999);
					any_name_without_keyword();
					}
					break;
				case 2:
					{
					setState(1000);
					match(NUMERIC_LITERAL);
					}
					break;
				case 3:
					{
					setState(1001);
					java_function_call_for_loop();
					}
					break;
				}
				}
				}
				break;
			}
			setState(1007);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CLOSE_PAR) {
				{
				setState(1006);
				match(CLOSE_PAR);
				}
			}

			setState(1009);
			match(DD);
			setState(1011);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
			case 1:
				{
				setState(1010);
				match(OPEN_PAR);
				}
				break;
			}
			setState(1028);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,111,_ctx) ) {
			case 1:
				{
				{
				setState(1013);
				if_oneline_grammer();
				}
				}
				break;
			case 2:
				{
				{
				setState(1021);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,109,_ctx) ) {
				case 1:
					{
					setState(1017);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
					case 1:
						{
						setState(1014);
						any_name_without_keyword();
						}
						break;
					case 2:
						{
						setState(1015);
						java_function_call_for_loop();
						}
						break;
					case 3:
						{
						setState(1016);
						array_name();
						}
						break;
					}
					setState(1019);
					match(ASSIGN);
					}
					break;
				}
				setState(1026);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,110,_ctx) ) {
				case 1:
					{
					setState(1023);
					any_name_without_keyword();
					}
					break;
				case 2:
					{
					setState(1024);
					match(NUMERIC_LITERAL);
					}
					break;
				case 3:
					{
					setState(1025);
					java_function_call_for_loop();
					}
					break;
				}
				}
				}
				break;
			}
			setState(1031);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,112,_ctx) ) {
			case 1:
				{
				setState(1030);
				match(CLOSE_PAR);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_oneline_signl_grammerContext extends ParserRuleContext {
		public TerminalNode EQ() { return getToken(SQLParser.EQ, 0); }
		public TerminalNode NOT_EQ1() { return getToken(SQLParser.NOT_EQ1, 0); }
		public TerminalNode LT() { return getToken(SQLParser.LT, 0); }
		public TerminalNode LT_EQ() { return getToken(SQLParser.LT_EQ, 0); }
		public TerminalNode GT() { return getToken(SQLParser.GT, 0); }
		public TerminalNode GT_EQ() { return getToken(SQLParser.GT_EQ, 0); }
		public If_oneline_signl_grammerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_oneline_signl_grammer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterIf_oneline_signl_grammer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitIf_oneline_signl_grammer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitIf_oneline_signl_grammer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_oneline_signl_grammerContext if_oneline_signl_grammer() throws RecognitionException {
		If_oneline_signl_grammerContext _localctx = new If_oneline_signl_grammerContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_if_oneline_signl_grammer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1033);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT) | (1L << LT_EQ) | (1L << GT) | (1L << GT_EQ) | (1L << EQ) | (1L << NOT_EQ1))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class True_or_falseContext extends ParserRuleContext {
		public True_or_falseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_true_or_false; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterTrue_or_false(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitTrue_or_false(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitTrue_or_false(this);
			else return visitor.visitChildren(this);
		}
	}

	public final True_or_falseContext true_or_false() throws RecognitionException {
		True_or_falseContext _localctx = new True_or_falseContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_true_or_false);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1035);
			_la = _input.LA(1);
			if ( !(_la==T__5 || _la==T__6) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_grammer1Context extends ParserRuleContext {
		public TerminalNode K_IF() { return getToken(SQLParser.K_IF, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public Java_function_headerContext java_function_header() {
			return getRuleContext(Java_function_headerContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(SQLParser.IDENTIFIER, 0); }
		public One_loop_bodyContext one_loop_body() {
			return getRuleContext(One_loop_bodyContext.class,0);
		}
		public While_comperContext while_comper() {
			return getRuleContext(While_comperContext.class,0);
		}
		public Loops_bodyContext loops_body() {
			return getRuleContext(Loops_bodyContext.class,0);
		}
		public List<Ll1Context> ll1() {
			return getRuleContexts(Ll1Context.class);
		}
		public Ll1Context ll1(int i) {
			return getRuleContext(Ll1Context.class,i);
		}
		public List<Any_name_without_keywordContext> any_name_without_keyword() {
			return getRuleContexts(Any_name_without_keywordContext.class);
		}
		public Any_name_without_keywordContext any_name_without_keyword(int i) {
			return getRuleContext(Any_name_without_keywordContext.class,i);
		}
		public List<TerminalNode> NUMERIC_LITERAL() { return getTokens(SQLParser.NUMERIC_LITERAL); }
		public TerminalNode NUMERIC_LITERAL(int i) {
			return getToken(SQLParser.NUMERIC_LITERAL, i);
		}
		public List<TerminalNode> PIPE2() { return getTokens(SQLParser.PIPE2); }
		public TerminalNode PIPE2(int i) {
			return getToken(SQLParser.PIPE2, i);
		}
		public List<While_signsContext> while_signs() {
			return getRuleContexts(While_signsContext.class);
		}
		public While_signsContext while_signs(int i) {
			return getRuleContext(While_signsContext.class,i);
		}
		public If_grammer1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_grammer1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterIf_grammer1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitIf_grammer1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitIf_grammer1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_grammer1Context if_grammer1() throws RecognitionException {
		If_grammer1Context _localctx = new If_grammer1Context(_ctx, getState());
		enterRule(_localctx, 94, RULE_if_grammer1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1037);
			match(K_IF);
			setState(1038);
			match(OPEN_PAR);
			setState(1107);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,125,_ctx) ) {
			case 1:
				{
				setState(1039);
				java_function_header();
				setState(1043);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT) | (1L << LT_EQ) | (1L << GT) | (1L << GT_EQ) | (1L << EQ) | (1L << NOT_EQ1))) != 0)) {
					{
					setState(1040);
					while_comper();
					setState(1041);
					_la = _input.LA(1);
					if ( !(_la==T__5 || _la==T__6) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				}
				break;
			case 2:
				{
				{
				{
				{
				setState(1048);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,114,_ctx) ) {
				case 1:
					{
					setState(1045);
					ll1();
					}
					break;
				case 2:
					{
					setState(1046);
					any_name_without_keyword();
					}
					break;
				case 3:
					{
					setState(1047);
					match(NUMERIC_LITERAL);
					}
					break;
				}
				setState(1058);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STAR) | (1L << PLUS) | (1L << MINUS) | (1L << DIV) | (1L << MOD))) != 0)) {
					{
					{
					setState(1050);
					while_signs();
					setState(1054);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,115,_ctx) ) {
					case 1:
						{
						setState(1051);
						any_name_without_keyword();
						}
						break;
					case 2:
						{
						setState(1052);
						match(NUMERIC_LITERAL);
						}
						break;
					case 3:
						{
						setState(1053);
						ll1();
						}
						break;
					}
					}
					}
					setState(1060);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				setState(1080);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__7 || _la==PIPE2) {
					{
					{
					setState(1061);
					_la = _input.LA(1);
					if ( !(_la==T__7 || _la==PIPE2) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					{
					setState(1065);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,117,_ctx) ) {
					case 1:
						{
						setState(1062);
						ll1();
						}
						break;
					case 2:
						{
						setState(1063);
						any_name_without_keyword();
						}
						break;
					case 3:
						{
						setState(1064);
						match(NUMERIC_LITERAL);
						}
						break;
					}
					setState(1075);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STAR) | (1L << PLUS) | (1L << MINUS) | (1L << DIV) | (1L << MOD))) != 0)) {
						{
						{
						setState(1067);
						while_signs();
						setState(1071);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,118,_ctx) ) {
						case 1:
							{
							setState(1068);
							any_name_without_keyword();
							}
							break;
						case 2:
							{
							setState(1069);
							match(NUMERIC_LITERAL);
							}
							break;
						case 3:
							{
							setState(1070);
							ll1();
							}
							break;
						}
						}
						}
						setState(1077);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					}
					setState(1082);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				setState(1083);
				while_comper();
				setState(1102);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case OPEN_PAR:
				case IDENTIFIER:
				case NUMERIC_LITERAL:
				case STRING_LITERAL:
					{
					{
					setState(1087);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,121,_ctx) ) {
					case 1:
						{
						setState(1084);
						ll1();
						}
						break;
					case 2:
						{
						setState(1085);
						any_name_without_keyword();
						}
						break;
					case 3:
						{
						setState(1086);
						match(NUMERIC_LITERAL);
						}
						break;
					}
					setState(1097);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STAR) | (1L << PLUS) | (1L << MINUS) | (1L << DIV) | (1L << MOD))) != 0)) {
						{
						{
						setState(1089);
						while_signs();
						setState(1093);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,122,_ctx) ) {
						case 1:
							{
							setState(1090);
							any_name_without_keyword();
							}
							break;
						case 2:
							{
							setState(1091);
							match(NUMERIC_LITERAL);
							}
							break;
						case 3:
							{
							setState(1092);
							ll1();
							}
							break;
						}
						}
						}
						setState(1099);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					break;
				case T__5:
					{
					setState(1100);
					match(T__5);
					}
					break;
				case T__6:
					{
					setState(1101);
					match(T__6);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				break;
			case 3:
				{
				setState(1104);
				match(T__5);
				}
				break;
			case 4:
				{
				setState(1105);
				match(T__6);
				}
				break;
			case 5:
				{
				setState(1106);
				match(IDENTIFIER);
				}
				break;
			}
			setState(1109);
			match(CLOSE_PAR);
			setState(1115);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				{
				{
				setState(1110);
				match(T__2);
				setState(1111);
				loops_body();
				setState(1112);
				match(T__3);
				}
				}
				break;
			case SCOL:
			case OPEN_PAR:
			case PLUS:
			case MINUS:
			case K_ALTER:
			case K_CREATE:
			case K_DELETE:
			case K_DROP:
			case K_FOR:
			case K_IF:
			case K_INSERT:
			case K_SELECT:
			case K_UPDATE:
			case K_VALUES:
			case K_VAR:
			case K_RETURN:
			case K_WHILE:
			case K_SWITCH:
			case K_DO:
			case K_PRINT:
			case IDENTIFIER:
			case STRING_LITERAL:
				{
				setState(1114);
				one_loop_body();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_else_grammerContext extends ParserRuleContext {
		public List<If_grammerContext> if_grammer() {
			return getRuleContexts(If_grammerContext.class);
		}
		public If_grammerContext if_grammer(int i) {
			return getRuleContext(If_grammerContext.class,i);
		}
		public List<TerminalNode> K_ELSE() { return getTokens(SQLParser.K_ELSE); }
		public TerminalNode K_ELSE(int i) {
			return getToken(SQLParser.K_ELSE, i);
		}
		public List_loopStatementContext list_loopStatement() {
			return getRuleContext(List_loopStatementContext.class,0);
		}
		public One_loop_bodyContext one_loop_body() {
			return getRuleContext(One_loop_bodyContext.class,0);
		}
		public If_else_grammerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_else_grammer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterIf_else_grammer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitIf_else_grammer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitIf_else_grammer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_else_grammerContext if_else_grammer() throws RecognitionException {
		If_else_grammerContext _localctx = new If_else_grammerContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_if_else_grammer);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1117);
			if_grammer();
			setState(1122);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,127,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1118);
					match(K_ELSE);
					setState(1119);
					if_grammer();
					}
					} 
				}
				setState(1124);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,127,_ctx);
			}
			setState(1133);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,129,_ctx) ) {
			case 1:
				{
				setState(1125);
				match(K_ELSE);
				setState(1131);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__2:
					{
					{
					setState(1126);
					match(T__2);
					setState(1127);
					list_loopStatement();
					setState(1128);
					match(T__3);
					}
					}
					break;
				case SCOL:
				case OPEN_PAR:
				case PLUS:
				case MINUS:
				case K_ALTER:
				case K_CREATE:
				case K_DELETE:
				case K_DROP:
				case K_FOR:
				case K_IF:
				case K_INSERT:
				case K_SELECT:
				case K_UPDATE:
				case K_VALUES:
				case K_VAR:
				case K_RETURN:
				case K_WHILE:
				case K_SWITCH:
				case K_DO:
				case K_PRINT:
				case IDENTIFIER:
				case STRING_LITERAL:
					{
					{
					setState(1130);
					one_loop_body();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			}
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_grammerContext extends ParserRuleContext {
		public TerminalNode K_IF() { return getToken(SQLParser.K_IF, 0); }
		public If_header_grammerContext if_header_grammer() {
			return getRuleContext(If_header_grammerContext.class,0);
		}
		public One_loop_bodyContext one_loop_body() {
			return getRuleContext(One_loop_bodyContext.class,0);
		}
		public List_loopStatementContext list_loopStatement() {
			return getRuleContext(List_loopStatementContext.class,0);
		}
		public If_grammerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_grammer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterIf_grammer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitIf_grammer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitIf_grammer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_grammerContext if_grammer() throws RecognitionException {
		If_grammerContext _localctx = new If_grammerContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_if_grammer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1135);
			match(K_IF);
			setState(1136);
			if_header_grammer();
			setState(1142);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				{
				{
				setState(1137);
				match(T__2);
				setState(1138);
				list_loopStatement();
				setState(1139);
				match(T__3);
				}
				}
				break;
			case SCOL:
			case OPEN_PAR:
			case PLUS:
			case MINUS:
			case K_ALTER:
			case K_CREATE:
			case K_DELETE:
			case K_DROP:
			case K_FOR:
			case K_IF:
			case K_INSERT:
			case K_SELECT:
			case K_UPDATE:
			case K_VALUES:
			case K_VAR:
			case K_RETURN:
			case K_WHILE:
			case K_SWITCH:
			case K_DO:
			case K_PRINT:
			case IDENTIFIER:
			case STRING_LITERAL:
				{
				setState(1141);
				one_loop_body();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_header_grammerContext extends ParserRuleContext {
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public Java_function_call_for_loopContext java_function_call_for_loop() {
			return getRuleContext(Java_function_call_for_loopContext.class,0);
		}
		public While_comperContext while_comper() {
			return getRuleContext(While_comperContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public True_or_falseContext true_or_false() {
			return getRuleContext(True_or_falseContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(SQLParser.IDENTIFIER, 0); }
		public If_header_grammerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_header_grammer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterIf_header_grammer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitIf_header_grammer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitIf_header_grammer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_header_grammerContext if_header_grammer() throws RecognitionException {
		If_header_grammerContext _localctx = new If_header_grammerContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_if_header_grammer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1144);
			match(OPEN_PAR);
			setState(1161);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,134,_ctx) ) {
			case 1:
				{
				setState(1145);
				java_function_call_for_loop();
				setState(1149);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT) | (1L << LT_EQ) | (1L << GT) | (1L << GT_EQ) | (1L << EQ) | (1L << NOT_EQ1))) != 0)) {
					{
					setState(1146);
					while_comper();
					setState(1147);
					true_or_false();
					}
				}

				}
				break;
			case 2:
				{
				{
				setState(1151);
				expr(0);
				}
				setState(1152);
				while_comper();
				setState(1155);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case OPEN_PAR:
				case PLUS:
				case MINUS:
				case TILDE:
				case K_ABORT:
				case K_ACTION:
				case K_ADD:
				case K_AFTER:
				case K_ALL:
				case K_ALTER:
				case K_ANALYZE:
				case K_AND:
				case K_AS:
				case K_ASC:
				case K_ATTACH:
				case K_AUTOINCREMENT:
				case K_BEFORE:
				case K_BEGIN:
				case K_BETWEEN:
				case K_BY:
				case K_CASCADE:
				case K_CASE:
				case K_CAST:
				case K_CHECK:
				case K_COLLATE:
				case K_COLUMN:
				case K_COMMIT:
				case K_CONFLICT:
				case K_CONSTRAINT:
				case K_CREATE:
				case K_CROSS:
				case K_CURRENT_DATE:
				case K_CURRENT_TIME:
				case K_CURRENT_TIMESTAMP:
				case K_DATABASE:
				case K_DEFAULT:
				case K_DEFERRABLE:
				case K_DEFERRED:
				case K_DELETE:
				case K_DESC:
				case K_DETACH:
				case K_DISTINCT:
				case K_DROP:
				case K_EACH:
				case K_ELSE:
				case K_END:
				case K_ENABLE:
				case K_ESCAPE:
				case K_EXCEPT:
				case K_EXCLUSIVE:
				case K_EXISTS:
				case K_EXPLAIN:
				case K_FAIL:
				case K_FOR:
				case K_FOREIGN:
				case K_FROM:
				case K_FULL:
				case K_GLOB:
				case K_GROUP:
				case K_HAVING:
				case K_IF:
				case K_IGNORE:
				case K_IMMEDIATE:
				case K_IN:
				case K_INDEX:
				case K_INDEXED:
				case K_INITIALLY:
				case K_INNER:
				case K_INSERT:
				case K_INSTEAD:
				case K_INTERSECT:
				case K_INTO:
				case K_IS:
				case K_ISNULL:
				case K_JOIN:
				case K_KEY:
				case K_LEFT:
				case K_LIKE:
				case K_LIMIT:
				case K_MATCH:
				case K_NATURAL:
				case K_NEXTVAL:
				case K_NO:
				case K_NOT:
				case K_NOTNULL:
				case K_NULL:
				case K_OF:
				case K_OFFSET:
				case K_ON:
				case K_OR:
				case K_ORDER:
				case K_OUTER:
				case K_PLAN:
				case K_PRAGMA:
				case K_PRIMARY:
				case K_QUERY:
				case K_RAISE:
				case K_RECURSIVE:
				case K_REFERENCES:
				case K_REGEXP:
				case K_REINDEX:
				case K_RELEASE:
				case K_RENAME:
				case K_REPLACE:
				case K_RESTRICT:
				case K_RIGHT:
				case K_ROLLBACK:
				case K_ROW:
				case K_SAVEPOINT:
				case K_SELECT:
				case K_SET:
				case K_TABLE:
				case K_TEMP:
				case K_TEMPORARY:
				case K_THEN:
				case K_TO:
				case K_TRANSACTION:
				case K_TRIGGER:
				case K_UNION:
				case K_UNIQUE:
				case K_UPDATE:
				case K_USING:
				case K_VACUUM:
				case K_VALUES:
				case K_VIEW:
				case K_VIRTUAL:
				case K_WHEN:
				case K_WHERE:
				case K_WITH:
				case K_WITHOUT:
				case K_RETURN:
				case K_WHILE:
				case K_SWITCH:
				case K_BREAK:
				case K_DO:
				case K_FUNCTION:
				case IDENTIFIER:
				case NUMERIC_LITERAL:
				case STRING_LITERAL:
				case BLOB_LITERAL:
					{
					setState(1153);
					expr(0);
					}
					break;
				case T__5:
				case T__6:
					{
					setState(1154);
					true_or_false();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 3:
				{
				setState(1159);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__5:
				case T__6:
					{
					setState(1157);
					true_or_false();
					}
					break;
				case IDENTIFIER:
					{
					setState(1158);
					match(IDENTIFIER);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			}
			setState(1163);
			match(CLOSE_PAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Foreach_grammerContext extends ParserRuleContext {
		public TerminalNode K_FOR() { return getToken(SQLParser.K_FOR, 0); }
		public Foreach_header_grammerContext foreach_header_grammer() {
			return getRuleContext(Foreach_header_grammerContext.class,0);
		}
		public List_loopStatementContext list_loopStatement() {
			return getRuleContext(List_loopStatementContext.class,0);
		}
		public One_loop_bodyContext one_loop_body() {
			return getRuleContext(One_loop_bodyContext.class,0);
		}
		public Foreach_grammerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreach_grammer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterForeach_grammer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitForeach_grammer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitForeach_grammer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Foreach_grammerContext foreach_grammer() throws RecognitionException {
		Foreach_grammerContext _localctx = new Foreach_grammerContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_foreach_grammer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1165);
			match(K_FOR);
			setState(1166);
			foreach_header_grammer();
			setState(1172);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				{
				{
				setState(1167);
				match(T__2);
				setState(1168);
				list_loopStatement();
				setState(1169);
				match(T__3);
				}
				}
				break;
			case SCOL:
			case OPEN_PAR:
			case PLUS:
			case MINUS:
			case K_ALTER:
			case K_CREATE:
			case K_DELETE:
			case K_DROP:
			case K_FOR:
			case K_IF:
			case K_INSERT:
			case K_SELECT:
			case K_UPDATE:
			case K_VALUES:
			case K_VAR:
			case K_RETURN:
			case K_WHILE:
			case K_SWITCH:
			case K_DO:
			case K_PRINT:
			case IDENTIFIER:
			case STRING_LITERAL:
				{
				{
				setState(1171);
				one_loop_body();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Foreach_header_grammerContext extends ParserRuleContext {
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public List<Any_name_without_keywordContext> any_name_without_keyword() {
			return getRuleContexts(Any_name_without_keywordContext.class);
		}
		public Any_name_without_keywordContext any_name_without_keyword(int i) {
			return getRuleContext(Any_name_without_keywordContext.class,i);
		}
		public TerminalNode DD() { return getToken(SQLParser.DD, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public TerminalNode K_VAR() { return getToken(SQLParser.K_VAR, 0); }
		public Foreach_header_grammerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreach_header_grammer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterForeach_header_grammer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitForeach_header_grammer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitForeach_header_grammer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Foreach_header_grammerContext foreach_header_grammer() throws RecognitionException {
		Foreach_header_grammerContext _localctx = new Foreach_header_grammerContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_foreach_header_grammer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1174);
			match(OPEN_PAR);
			setState(1176);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_VAR) {
				{
				setState(1175);
				match(K_VAR);
				}
			}

			setState(1178);
			any_name_without_keyword();
			setState(1179);
			match(DD);
			setState(1180);
			any_name_without_keyword();
			setState(1181);
			match(CLOSE_PAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class For_grammerContext extends ParserRuleContext {
		public TerminalNode K_FOR() { return getToken(SQLParser.K_FOR, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public For_headerContext for_header() {
			return getRuleContext(For_headerContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public List_loopStatementContext list_loopStatement() {
			return getRuleContext(List_loopStatementContext.class,0);
		}
		public One_loop_bodyContext one_loop_body() {
			return getRuleContext(One_loop_bodyContext.class,0);
		}
		public For_grammerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_grammer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterFor_grammer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitFor_grammer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitFor_grammer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_grammerContext for_grammer() throws RecognitionException {
		For_grammerContext _localctx = new For_grammerContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_for_grammer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1183);
			match(K_FOR);
			setState(1184);
			match(OPEN_PAR);
			setState(1185);
			for_header();
			setState(1186);
			match(CLOSE_PAR);
			setState(1192);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				{
				{
				setState(1187);
				match(T__2);
				setState(1188);
				list_loopStatement();
				setState(1189);
				match(T__3);
				}
				}
				break;
			case SCOL:
			case OPEN_PAR:
			case PLUS:
			case MINUS:
			case K_ALTER:
			case K_CREATE:
			case K_DELETE:
			case K_DROP:
			case K_FOR:
			case K_IF:
			case K_INSERT:
			case K_SELECT:
			case K_UPDATE:
			case K_VALUES:
			case K_VAR:
			case K_RETURN:
			case K_WHILE:
			case K_SWITCH:
			case K_DO:
			case K_PRINT:
			case IDENTIFIER:
			case STRING_LITERAL:
				{
				{
				setState(1191);
				one_loop_body();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class For_headerContext extends ParserRuleContext {
		public List<Any_name_without_keywordContext> any_name_without_keyword() {
			return getRuleContexts(Any_name_without_keywordContext.class);
		}
		public Any_name_without_keywordContext any_name_without_keyword(int i) {
			return getRuleContext(Any_name_without_keywordContext.class,i);
		}
		public TerminalNode ASSIGN() { return getToken(SQLParser.ASSIGN, 0); }
		public List<TerminalNode> SCOL() { return getTokens(SQLParser.SCOL); }
		public TerminalNode SCOL(int i) {
			return getToken(SQLParser.SCOL, i);
		}
		public For_signsContext for_signs() {
			return getRuleContext(For_signsContext.class,0);
		}
		public Increase_and_decreaseContext increase_and_decrease() {
			return getRuleContext(Increase_and_decreaseContext.class,0);
		}
		public List<TerminalNode> NUMERIC_LITERAL() { return getTokens(SQLParser.NUMERIC_LITERAL); }
		public TerminalNode NUMERIC_LITERAL(int i) {
			return getToken(SQLParser.NUMERIC_LITERAL, i);
		}
		public TerminalNode K_VAR() { return getToken(SQLParser.K_VAR, 0); }
		public For_headerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_header; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterFor_header(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitFor_header(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitFor_header(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_headerContext for_header() throws RecognitionException {
		For_headerContext _localctx = new For_headerContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_for_header);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1195);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_VAR) {
				{
				setState(1194);
				match(K_VAR);
				}
			}

			setState(1197);
			any_name_without_keyword();
			setState(1198);
			match(ASSIGN);
			{
			setState(1199);
			match(NUMERIC_LITERAL);
			}
			setState(1200);
			match(SCOL);
			setState(1201);
			any_name_without_keyword();
			setState(1202);
			for_signs();
			setState(1205);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMERIC_LITERAL:
				{
				setState(1203);
				match(NUMERIC_LITERAL);
				}
				break;
			case OPEN_PAR:
			case IDENTIFIER:
			case STRING_LITERAL:
				{
				setState(1204);
				any_name_without_keyword();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1207);
			match(SCOL);
			setState(1208);
			increase_and_decrease();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Switch_grammerContext extends ParserRuleContext {
		public TerminalNode K_SWITCH() { return getToken(SQLParser.K_SWITCH, 0); }
		public Switch_header_grammerContext switch_header_grammer() {
			return getRuleContext(Switch_header_grammerContext.class,0);
		}
		public List_loopStatementContext list_loopStatement() {
			return getRuleContext(List_loopStatementContext.class,0);
		}
		public List<Case_grammerContext> case_grammer() {
			return getRuleContexts(Case_grammerContext.class);
		}
		public Case_grammerContext case_grammer(int i) {
			return getRuleContext(Case_grammerContext.class,i);
		}
		public Default_grammerContext default_grammer() {
			return getRuleContext(Default_grammerContext.class,0);
		}
		public Switch_grammerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch_grammer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterSwitch_grammer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitSwitch_grammer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitSwitch_grammer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Switch_grammerContext switch_grammer() throws RecognitionException {
		Switch_grammerContext _localctx = new Switch_grammerContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_switch_grammer);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1210);
			match(K_SWITCH);
			setState(1211);
			switch_header_grammer();
			setState(1212);
			match(T__2);
			setState(1214);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,140,_ctx) ) {
			case 1:
				{
				setState(1213);
				list_loopStatement();
				}
				break;
			}
			setState(1249);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,148,_ctx) ) {
			case 1:
				{
				{
				setState(1219);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==K_CASE) {
					{
					{
					setState(1216);
					case_grammer();
					}
					}
					setState(1221);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1223);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_DEFAULT) {
					{
					setState(1222);
					default_grammer();
					}
				}

				}
				}
				break;
			case 2:
				{
				{
				setState(1226);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_DEFAULT) {
					{
					setState(1225);
					default_grammer();
					}
				}

				setState(1231);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==K_CASE) {
					{
					{
					setState(1228);
					case_grammer();
					}
					}
					setState(1233);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			case 3:
				{
				{
				setState(1237);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,145,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1234);
						case_grammer();
						}
						} 
					}
					setState(1239);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,145,_ctx);
				}
				setState(1241);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_DEFAULT) {
					{
					setState(1240);
					default_grammer();
					}
				}

				setState(1246);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==K_CASE) {
					{
					{
					setState(1243);
					case_grammer();
					}
					}
					setState(1248);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			}
			setState(1251);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Switch_header_grammerContext extends ParserRuleContext {
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(SQLParser.IDENTIFIER, 0); }
		public Any_name_without_keywordContext any_name_without_keyword() {
			return getRuleContext(Any_name_without_keywordContext.class,0);
		}
		public Switch_header_grammerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch_header_grammer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterSwitch_header_grammer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitSwitch_header_grammer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitSwitch_header_grammer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Switch_header_grammerContext switch_header_grammer() throws RecognitionException {
		Switch_header_grammerContext _localctx = new Switch_header_grammerContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_switch_header_grammer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1253);
			match(OPEN_PAR);
			setState(1262);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
				{
				{
				setState(1254);
				match(T__8);
				setState(1255);
				match(IDENTIFIER);
				setState(1256);
				match(T__8);
				}
				}
				break;
			case T__9:
				{
				{
				setState(1257);
				match(T__9);
				setState(1258);
				any_name_without_keyword();
				setState(1259);
				match(T__9);
				}
				}
				break;
			case OPEN_PAR:
			case PLUS:
			case MINUS:
			case TILDE:
			case K_ABORT:
			case K_ACTION:
			case K_ADD:
			case K_AFTER:
			case K_ALL:
			case K_ALTER:
			case K_ANALYZE:
			case K_AND:
			case K_AS:
			case K_ASC:
			case K_ATTACH:
			case K_AUTOINCREMENT:
			case K_BEFORE:
			case K_BEGIN:
			case K_BETWEEN:
			case K_BY:
			case K_CASCADE:
			case K_CASE:
			case K_CAST:
			case K_CHECK:
			case K_COLLATE:
			case K_COLUMN:
			case K_COMMIT:
			case K_CONFLICT:
			case K_CONSTRAINT:
			case K_CREATE:
			case K_CROSS:
			case K_CURRENT_DATE:
			case K_CURRENT_TIME:
			case K_CURRENT_TIMESTAMP:
			case K_DATABASE:
			case K_DEFAULT:
			case K_DEFERRABLE:
			case K_DEFERRED:
			case K_DELETE:
			case K_DESC:
			case K_DETACH:
			case K_DISTINCT:
			case K_DROP:
			case K_EACH:
			case K_ELSE:
			case K_END:
			case K_ENABLE:
			case K_ESCAPE:
			case K_EXCEPT:
			case K_EXCLUSIVE:
			case K_EXISTS:
			case K_EXPLAIN:
			case K_FAIL:
			case K_FOR:
			case K_FOREIGN:
			case K_FROM:
			case K_FULL:
			case K_GLOB:
			case K_GROUP:
			case K_HAVING:
			case K_IF:
			case K_IGNORE:
			case K_IMMEDIATE:
			case K_IN:
			case K_INDEX:
			case K_INDEXED:
			case K_INITIALLY:
			case K_INNER:
			case K_INSERT:
			case K_INSTEAD:
			case K_INTERSECT:
			case K_INTO:
			case K_IS:
			case K_ISNULL:
			case K_JOIN:
			case K_KEY:
			case K_LEFT:
			case K_LIKE:
			case K_LIMIT:
			case K_MATCH:
			case K_NATURAL:
			case K_NEXTVAL:
			case K_NO:
			case K_NOT:
			case K_NOTNULL:
			case K_NULL:
			case K_OF:
			case K_OFFSET:
			case K_ON:
			case K_OR:
			case K_ORDER:
			case K_OUTER:
			case K_PLAN:
			case K_PRAGMA:
			case K_PRIMARY:
			case K_QUERY:
			case K_RAISE:
			case K_RECURSIVE:
			case K_REFERENCES:
			case K_REGEXP:
			case K_REINDEX:
			case K_RELEASE:
			case K_RENAME:
			case K_REPLACE:
			case K_RESTRICT:
			case K_RIGHT:
			case K_ROLLBACK:
			case K_ROW:
			case K_SAVEPOINT:
			case K_SELECT:
			case K_SET:
			case K_TABLE:
			case K_TEMP:
			case K_TEMPORARY:
			case K_THEN:
			case K_TO:
			case K_TRANSACTION:
			case K_TRIGGER:
			case K_UNION:
			case K_UNIQUE:
			case K_UPDATE:
			case K_USING:
			case K_VACUUM:
			case K_VALUES:
			case K_VIEW:
			case K_VIRTUAL:
			case K_WHEN:
			case K_WHERE:
			case K_WITH:
			case K_WITHOUT:
			case K_RETURN:
			case K_WHILE:
			case K_SWITCH:
			case K_BREAK:
			case K_DO:
			case K_FUNCTION:
			case IDENTIFIER:
			case NUMERIC_LITERAL:
			case STRING_LITERAL:
			case BLOB_LITERAL:
				{
				setState(1261);
				expr(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1264);
			match(CLOSE_PAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Case_grammerContext extends ParserRuleContext {
		public TerminalNode K_CASE() { return getToken(SQLParser.K_CASE, 0); }
		public TerminalNode DD() { return getToken(SQLParser.DD, 0); }
		public List_loopStatementContext list_loopStatement() {
			return getRuleContext(List_loopStatementContext.class,0);
		}
		public TerminalNode K_BREAK() { return getToken(SQLParser.K_BREAK, 0); }
		public TerminalNode SCOL() { return getToken(SQLParser.SCOL, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Case_grammerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case_grammer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterCase_grammer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitCase_grammer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitCase_grammer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Case_grammerContext case_grammer() throws RecognitionException {
		Case_grammerContext _localctx = new Case_grammerContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_case_grammer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1266);
			match(K_CASE);
			setState(1272);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,150,_ctx) ) {
			case 1:
				{
				{
				setState(1267);
				match(OPEN_PAR);
				{
				setState(1268);
				expr(0);
				}
				setState(1269);
				match(CLOSE_PAR);
				}
				}
				break;
			case 2:
				{
				{
				setState(1271);
				expr(0);
				}
				}
				break;
			}
			setState(1274);
			match(DD);
			setState(1275);
			list_loopStatement();
			setState(1276);
			match(K_BREAK);
			setState(1277);
			match(SCOL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Default_grammerContext extends ParserRuleContext {
		public TerminalNode K_DEFAULT() { return getToken(SQLParser.K_DEFAULT, 0); }
		public TerminalNode DD() { return getToken(SQLParser.DD, 0); }
		public List_loopStatementContext list_loopStatement() {
			return getRuleContext(List_loopStatementContext.class,0);
		}
		public TerminalNode K_BREAK() { return getToken(SQLParser.K_BREAK, 0); }
		public TerminalNode SCOL() { return getToken(SQLParser.SCOL, 0); }
		public Default_grammerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_default_grammer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterDefault_grammer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitDefault_grammer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitDefault_grammer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Default_grammerContext default_grammer() throws RecognitionException {
		Default_grammerContext _localctx = new Default_grammerContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_default_grammer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1279);
			match(K_DEFAULT);
			setState(1280);
			match(DD);
			setState(1281);
			list_loopStatement();
			setState(1282);
			match(K_BREAK);
			setState(1283);
			match(SCOL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Var_grammer0Context extends ParserRuleContext {
		public List<Any_name_without_keywordContext> any_name_without_keyword() {
			return getRuleContexts(Any_name_without_keywordContext.class);
		}
		public Any_name_without_keywordContext any_name_without_keyword(int i) {
			return getRuleContext(Any_name_without_keywordContext.class,i);
		}
		public TerminalNode SCOL() { return getToken(SQLParser.SCOL, 0); }
		public List<Array_nameContext> array_name() {
			return getRuleContexts(Array_nameContext.class);
		}
		public Array_nameContext array_name(int i) {
			return getRuleContext(Array_nameContext.class,i);
		}
		public List<Java_function_call_for_varContext> java_function_call_for_var() {
			return getRuleContexts(Java_function_call_for_varContext.class);
		}
		public Java_function_call_for_varContext java_function_call_for_var(int i) {
			return getRuleContext(Java_function_call_for_varContext.class,i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public While_signsContext while_signs() {
			return getRuleContext(While_signsContext.class,0);
		}
		public List<TerminalNode> ASSIGN() { return getTokens(SQLParser.ASSIGN); }
		public TerminalNode ASSIGN(int i) {
			return getToken(SQLParser.ASSIGN, i);
		}
		public List<TerminalNode> NUMERIC_LITERAL() { return getTokens(SQLParser.NUMERIC_LITERAL); }
		public TerminalNode NUMERIC_LITERAL(int i) {
			return getToken(SQLParser.NUMERIC_LITERAL, i);
		}
		public List<Sql_stmtContext> sql_stmt() {
			return getRuleContexts(Sql_stmtContext.class);
		}
		public Sql_stmtContext sql_stmt(int i) {
			return getRuleContext(Sql_stmtContext.class,i);
		}
		public List<If_oneline_grammerContext> if_oneline_grammer() {
			return getRuleContexts(If_oneline_grammerContext.class);
		}
		public If_oneline_grammerContext if_oneline_grammer(int i) {
			return getRuleContext(If_oneline_grammerContext.class,i);
		}
		public List<Array_name_callContext> array_name_call() {
			return getRuleContexts(Array_name_callContext.class);
		}
		public Array_name_callContext array_name_call(int i) {
			return getRuleContext(Array_name_callContext.class,i);
		}
		public List<Json_grammerContext> json_grammer() {
			return getRuleContexts(Json_grammerContext.class);
		}
		public Json_grammerContext json_grammer(int i) {
			return getRuleContext(Json_grammerContext.class,i);
		}
		public List<True_or_falseContext> true_or_false() {
			return getRuleContexts(True_or_falseContext.class);
		}
		public True_or_falseContext true_or_false(int i) {
			return getRuleContext(True_or_falseContext.class,i);
		}
		public TerminalNode K_VAR() { return getToken(SQLParser.K_VAR, 0); }
		public List<Select_stmtContext> select_stmt() {
			return getRuleContexts(Select_stmtContext.class);
		}
		public Select_stmtContext select_stmt(int i) {
			return getRuleContext(Select_stmtContext.class,i);
		}
		public List<TerminalNode> MINUS() { return getTokens(SQLParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(SQLParser.MINUS, i);
		}
		public List<TerminalNode> PLUS() { return getTokens(SQLParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(SQLParser.PLUS, i);
		}
		public Var_grammer0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_grammer0; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterVar_grammer0(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitVar_grammer0(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitVar_grammer0(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_grammer0Context var_grammer0() throws RecognitionException {
		Var_grammer0Context _localctx = new Var_grammer0Context(_ctx, getState());
		enterRule(_localctx, 118, RULE_var_grammer0);
		int _la;
		try {
			setState(1349);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,163,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1285);
				any_name_without_keyword();
				setState(1313);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 22)) & ~0x3f) == 0 && ((1L << (_la - 22)) & ((1L << (OPEN_PAR - 22)) | (1L << (STAR - 22)) | (1L << (PLUS - 22)) | (1L << (MINUS - 22)) | (1L << (TILDE - 22)) | (1L << (DIV - 22)) | (1L << (MOD - 22)) | (1L << (K_ABORT - 22)) | (1L << (K_ACTION - 22)) | (1L << (K_ADD - 22)) | (1L << (K_AFTER - 22)) | (1L << (K_ALL - 22)) | (1L << (K_ALTER - 22)) | (1L << (K_ANALYZE - 22)) | (1L << (K_AND - 22)) | (1L << (K_AS - 22)) | (1L << (K_ASC - 22)) | (1L << (K_ATTACH - 22)) | (1L << (K_AUTOINCREMENT - 22)) | (1L << (K_BEFORE - 22)) | (1L << (K_BEGIN - 22)) | (1L << (K_BETWEEN - 22)) | (1L << (K_BY - 22)) | (1L << (K_CASCADE - 22)) | (1L << (K_CASE - 22)) | (1L << (K_CAST - 22)) | (1L << (K_CHECK - 22)) | (1L << (K_COLLATE - 22)) | (1L << (K_COLUMN - 22)) | (1L << (K_COMMIT - 22)) | (1L << (K_CONFLICT - 22)) | (1L << (K_CONSTRAINT - 22)) | (1L << (K_CREATE - 22)) | (1L << (K_CROSS - 22)) | (1L << (K_CURRENT_DATE - 22)) | (1L << (K_CURRENT_TIME - 22)) | (1L << (K_CURRENT_TIMESTAMP - 22)) | (1L << (K_DATABASE - 22)) | (1L << (K_DEFAULT - 22)) | (1L << (K_DEFERRABLE - 22)) | (1L << (K_DEFERRED - 22)) | (1L << (K_DELETE - 22)) | (1L << (K_DESC - 22)) | (1L << (K_DETACH - 22)))) != 0) || ((((_la - 86)) & ~0x3f) == 0 && ((1L << (_la - 86)) & ((1L << (K_DISTINCT - 86)) | (1L << (K_DROP - 86)) | (1L << (K_EACH - 86)) | (1L << (K_ELSE - 86)) | (1L << (K_END - 86)) | (1L << (K_ENABLE - 86)) | (1L << (K_ESCAPE - 86)) | (1L << (K_EXCEPT - 86)) | (1L << (K_EXCLUSIVE - 86)) | (1L << (K_EXISTS - 86)) | (1L << (K_EXPLAIN - 86)) | (1L << (K_FAIL - 86)) | (1L << (K_FOR - 86)) | (1L << (K_FOREIGN - 86)) | (1L << (K_FROM - 86)) | (1L << (K_FULL - 86)) | (1L << (K_GLOB - 86)) | (1L << (K_GROUP - 86)) | (1L << (K_HAVING - 86)) | (1L << (K_IF - 86)) | (1L << (K_IGNORE - 86)) | (1L << (K_IMMEDIATE - 86)) | (1L << (K_IN - 86)) | (1L << (K_INDEX - 86)) | (1L << (K_INDEXED - 86)) | (1L << (K_INITIALLY - 86)) | (1L << (K_INNER - 86)) | (1L << (K_INSERT - 86)) | (1L << (K_INSTEAD - 86)) | (1L << (K_INTERSECT - 86)) | (1L << (K_INTO - 86)) | (1L << (K_IS - 86)) | (1L << (K_ISNULL - 86)) | (1L << (K_JOIN - 86)) | (1L << (K_KEY - 86)) | (1L << (K_LEFT - 86)) | (1L << (K_LIKE - 86)) | (1L << (K_LIMIT - 86)) | (1L << (K_MATCH - 86)) | (1L << (K_NATURAL - 86)) | (1L << (K_NEXTVAL - 86)) | (1L << (K_NO - 86)) | (1L << (K_NOT - 86)) | (1L << (K_NOTNULL - 86)) | (1L << (K_NULL - 86)) | (1L << (K_OF - 86)) | (1L << (K_OFFSET - 86)) | (1L << (K_ON - 86)) | (1L << (K_OR - 86)) | (1L << (K_ORDER - 86)) | (1L << (K_OUTER - 86)) | (1L << (K_PLAN - 86)) | (1L << (K_PRAGMA - 86)) | (1L << (K_PRIMARY - 86)) | (1L << (K_QUERY - 86)) | (1L << (K_RAISE - 86)) | (1L << (K_RECURSIVE - 86)) | (1L << (K_REFERENCES - 86)) | (1L << (K_REGEXP - 86)) | (1L << (K_REINDEX - 86)) | (1L << (K_RELEASE - 86)) | (1L << (K_RENAME - 86)) | (1L << (K_REPLACE - 86)))) != 0) || ((((_la - 150)) & ~0x3f) == 0 && ((1L << (_la - 150)) & ((1L << (K_RESTRICT - 150)) | (1L << (K_RIGHT - 150)) | (1L << (K_ROLLBACK - 150)) | (1L << (K_ROW - 150)) | (1L << (K_SAVEPOINT - 150)) | (1L << (K_SELECT - 150)) | (1L << (K_SET - 150)) | (1L << (K_TABLE - 150)) | (1L << (K_TEMP - 150)) | (1L << (K_TEMPORARY - 150)) | (1L << (K_THEN - 150)) | (1L << (K_TO - 150)) | (1L << (K_TRANSACTION - 150)) | (1L << (K_TRIGGER - 150)) | (1L << (K_UNION - 150)) | (1L << (K_UNIQUE - 150)) | (1L << (K_UPDATE - 150)) | (1L << (K_USING - 150)) | (1L << (K_VACUUM - 150)) | (1L << (K_VALUES - 150)) | (1L << (K_VIEW - 150)) | (1L << (K_VIRTUAL - 150)) | (1L << (K_WHEN - 150)) | (1L << (K_WHERE - 150)) | (1L << (K_WITH - 150)) | (1L << (K_WITHOUT - 150)) | (1L << (K_RETURN - 150)) | (1L << (K_WHILE - 150)) | (1L << (K_SWITCH - 150)) | (1L << (K_BREAK - 150)) | (1L << (K_DO - 150)) | (1L << (K_FUNCTION - 150)) | (1L << (IDENTIFIER - 150)) | (1L << (NUMERIC_LITERAL - 150)) | (1L << (STRING_LITERAL - 150)) | (1L << (BLOB_LITERAL - 150)))) != 0)) {
					{
					setState(1287);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,151,_ctx) ) {
					case 1:
						{
						setState(1286);
						while_signs();
						}
						break;
					}
					setState(1293);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,152,_ctx) ) {
					case 1:
						{
						setState(1289);
						array_name();
						}
						break;
					case 2:
						{
						setState(1290);
						java_function_call_for_var();
						}
						break;
					case 3:
						{
						setState(1291);
						any_name_without_keyword();
						}
						break;
					case 4:
						{
						setState(1292);
						expr(0);
						}
						break;
					}
					setState(1310);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==ASSIGN) {
						{
						{
						setState(1295);
						match(ASSIGN);
						setState(1306);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,153,_ctx) ) {
						case 1:
							{
							setState(1296);
							match(NUMERIC_LITERAL);
							}
							break;
						case 2:
							{
							setState(1297);
							sql_stmt();
							}
							break;
						case 3:
							{
							setState(1298);
							java_function_call_for_var();
							}
							break;
						case 4:
							{
							setState(1299);
							if_oneline_grammer();
							}
							break;
						case 5:
							{
							setState(1300);
							array_name_call();
							}
							break;
						case 6:
							{
							setState(1301);
							array_name();
							}
							break;
						case 7:
							{
							setState(1302);
							json_grammer();
							}
							break;
						case 8:
							{
							setState(1303);
							any_name_without_keyword();
							}
							break;
						case 9:
							{
							setState(1304);
							expr(0);
							}
							break;
						case 10:
							{
							setState(1305);
							true_or_false();
							}
							break;
						}
						}
						}
						setState(1312);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1315);
				match(SCOL);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(1318);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_VAR) {
					{
					setState(1317);
					match(K_VAR);
					}
				}

				setState(1320);
				any_name_without_keyword();
				setState(1345);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,162,_ctx) ) {
				case 1:
					{
					setState(1342);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==ASSIGN) {
						{
						{
						setState(1321);
						match(ASSIGN);
						setState(1338);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,160,_ctx) ) {
						case 1:
							{
							{
							setState(1328);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,159,_ctx) ) {
							case 1:
								{
								setState(1323);
								_errHandler.sync(this);
								_la = _input.LA(1);
								if (_la==MINUS) {
									{
									setState(1322);
									match(MINUS);
									}
								}

								}
								break;
							case 2:
								{
								setState(1326);
								_errHandler.sync(this);
								_la = _input.LA(1);
								if (_la==PLUS) {
									{
									setState(1325);
									match(PLUS);
									}
								}

								}
								break;
							}
							setState(1330);
							match(NUMERIC_LITERAL);
							}
							}
							break;
						case 2:
							{
							setState(1331);
							select_stmt();
							}
							break;
						case 3:
							{
							setState(1332);
							java_function_call_for_var();
							}
							break;
						case 4:
							{
							setState(1333);
							if_oneline_grammer();
							}
							break;
						case 5:
							{
							setState(1334);
							json_grammer();
							}
							break;
						case 6:
							{
							setState(1335);
							any_name_without_keyword();
							}
							break;
						case 7:
							{
							setState(1336);
							expr(0);
							}
							break;
						case 8:
							{
							setState(1337);
							true_or_false();
							}
							break;
						}
						}
						}
						setState(1344);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				}
				setState(1347);
				match(SCOL);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Var_grammerContext extends ParserRuleContext {
		public Var_grammer2Context var_grammer2() {
			return getRuleContext(Var_grammer2Context.class,0);
		}
		public Var_3Context var_3() {
			return getRuleContext(Var_3Context.class,0);
		}
		public Var_4Context var_4() {
			return getRuleContext(Var_4Context.class,0);
		}
		public Var_grammerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_grammer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterVar_grammer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitVar_grammer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitVar_grammer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_grammerContext var_grammer() throws RecognitionException {
		Var_grammerContext _localctx = new Var_grammerContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_var_grammer);
		try {
			setState(1354);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,164,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1351);
				var_grammer2();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1352);
				var_3();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1353);
				var_4();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Var_grammer2Context extends ParserRuleContext {
		public TerminalNode K_VAR() { return getToken(SQLParser.K_VAR, 0); }
		public Any_name_without_keywordContext any_name_without_keyword() {
			return getRuleContext(Any_name_without_keywordContext.class,0);
		}
		public TerminalNode SCOL() { return getToken(SQLParser.SCOL, 0); }
		public TerminalNode ASSIGN() { return getToken(SQLParser.ASSIGN, 0); }
		public TerminalNode NUMERIC_LITERAL() { return getToken(SQLParser.NUMERIC_LITERAL, 0); }
		public True_or_falseContext true_or_false() {
			return getRuleContext(True_or_falseContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(SQLParser.IDENTIFIER, 0); }
		public TerminalNode MINUS() { return getToken(SQLParser.MINUS, 0); }
		public TerminalNode PLUS() { return getToken(SQLParser.PLUS, 0); }
		public Var_grammer2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_grammer2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterVar_grammer2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitVar_grammer2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitVar_grammer2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_grammer2Context var_grammer2() throws RecognitionException {
		Var_grammer2Context _localctx = new Var_grammer2Context(_ctx, getState());
		enterRule(_localctx, 122, RULE_var_grammer2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1356);
			match(K_VAR);
			setState(1357);
			any_name_without_keyword();
			setState(1367);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(1358);
				match(ASSIGN);
				setState(1360);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PLUS || _la==MINUS) {
					{
					setState(1359);
					_la = _input.LA(1);
					if ( !(_la==PLUS || _la==MINUS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(1365);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NUMERIC_LITERAL:
					{
					setState(1362);
					match(NUMERIC_LITERAL);
					}
					break;
				case T__5:
				case T__6:
					{
					setState(1363);
					true_or_false();
					}
					break;
				case IDENTIFIER:
					{
					setState(1364);
					match(IDENTIFIER);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
			}

			setState(1369);
			match(SCOL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Var_3Context extends ParserRuleContext {
		public TerminalNode K_VAR() { return getToken(SQLParser.K_VAR, 0); }
		public Any_name_without_keywordContext any_name_without_keyword() {
			return getRuleContext(Any_name_without_keywordContext.class,0);
		}
		public TerminalNode SCOL() { return getToken(SQLParser.SCOL, 0); }
		public TerminalNode ASSIGN() { return getToken(SQLParser.ASSIGN, 0); }
		public Factored_select_stmtContext factored_select_stmt() {
			return getRuleContext(Factored_select_stmtContext.class,0);
		}
		public Java_function_call_for_varContext java_function_call_for_var() {
			return getRuleContext(Java_function_call_for_varContext.class,0);
		}
		public If_oneline_grammerContext if_oneline_grammer() {
			return getRuleContext(If_oneline_grammerContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Var_3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_3; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterVar_3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitVar_3(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitVar_3(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_3Context var_3() throws RecognitionException {
		Var_3Context _localctx = new Var_3Context(_ctx, getState());
		enterRule(_localctx, 124, RULE_var_3);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1371);
			match(K_VAR);
			setState(1372);
			any_name_without_keyword();
			setState(1380);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(1373);
				match(ASSIGN);
				setState(1378);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,168,_ctx) ) {
				case 1:
					{
					setState(1374);
					factored_select_stmt();
					}
					break;
				case 2:
					{
					setState(1375);
					java_function_call_for_var();
					}
					break;
				case 3:
					{
					setState(1376);
					if_oneline_grammer();
					}
					break;
				case 4:
					{
					setState(1377);
					expr(0);
					}
					break;
				}
				}
			}

			setState(1382);
			match(SCOL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Var_4Context extends ParserRuleContext {
		public Any_name_without_keywordContext any_name_without_keyword() {
			return getRuleContext(Any_name_without_keywordContext.class,0);
		}
		public TerminalNode SCOL() { return getToken(SQLParser.SCOL, 0); }
		public While_signsContext while_signs() {
			return getRuleContext(While_signsContext.class,0);
		}
		public Array_nameContext array_name() {
			return getRuleContext(Array_nameContext.class,0);
		}
		public Java_function_call_for_varContext java_function_call_for_var() {
			return getRuleContext(Java_function_call_for_varContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<X1Context> x1() {
			return getRuleContexts(X1Context.class);
		}
		public X1Context x1(int i) {
			return getRuleContext(X1Context.class,i);
		}
		public Var_4Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_4; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterVar_4(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitVar_4(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitVar_4(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_4Context var_4() throws RecognitionException {
		Var_4Context _localctx = new Var_4Context(_ctx, getState());
		enterRule(_localctx, 126, RULE_var_4);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1384);
			any_name_without_keyword();
			{
			setState(1386);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,170,_ctx) ) {
			case 1:
				{
				setState(1385);
				while_signs();
				}
				break;
			}
			setState(1391);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,171,_ctx) ) {
			case 1:
				{
				setState(1388);
				array_name();
				}
				break;
			case 2:
				{
				setState(1389);
				java_function_call_for_var();
				}
				break;
			case 3:
				{
				setState(1390);
				expr(0);
				}
				break;
			}
			setState(1396);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ASSIGN) {
				{
				{
				setState(1393);
				x1();
				}
				}
				setState(1398);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(1399);
			match(SCOL);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class X1Context extends ParserRuleContext {
		public TerminalNode ASSIGN() { return getToken(SQLParser.ASSIGN, 0); }
		public TerminalNode NUMERIC_LITERAL() { return getToken(SQLParser.NUMERIC_LITERAL, 0); }
		public Java_function_call_for_varContext java_function_call_for_var() {
			return getRuleContext(Java_function_call_for_varContext.class,0);
		}
		public Sql_stmtContext sql_stmt() {
			return getRuleContext(Sql_stmtContext.class,0);
		}
		public If_oneline_grammerContext if_oneline_grammer() {
			return getRuleContext(If_oneline_grammerContext.class,0);
		}
		public Array_name_callContext array_name_call() {
			return getRuleContext(Array_name_callContext.class,0);
		}
		public Array_nameContext array_name() {
			return getRuleContext(Array_nameContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public True_or_falseContext true_or_false() {
			return getRuleContext(True_or_falseContext.class,0);
		}
		public X1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_x1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterX1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitX1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitX1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final X1Context x1() throws RecognitionException {
		X1Context _localctx = new X1Context(_ctx, getState());
		enterRule(_localctx, 128, RULE_x1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1401);
			match(ASSIGN);
			setState(1410);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,173,_ctx) ) {
			case 1:
				{
				setState(1402);
				match(NUMERIC_LITERAL);
				}
				break;
			case 2:
				{
				setState(1403);
				java_function_call_for_var();
				}
				break;
			case 3:
				{
				setState(1404);
				sql_stmt();
				}
				break;
			case 4:
				{
				setState(1405);
				if_oneline_grammer();
				}
				break;
			case 5:
				{
				setState(1406);
				array_name_call();
				}
				break;
			case 6:
				{
				setState(1407);
				array_name();
				}
				break;
			case 7:
				{
				setState(1408);
				expr(0);
				}
				break;
			case 8:
				{
				setState(1409);
				true_or_false();
				}
				break;
			}
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class True_grammerContext extends ParserRuleContext {
		public True_grammerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_true_grammer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterTrue_grammer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitTrue_grammer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitTrue_grammer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final True_grammerContext true_grammer() throws RecognitionException {
		True_grammerContext _localctx = new True_grammerContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_true_grammer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1412);
			match(T__5);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class False_grammerContext extends ParserRuleContext {
		public False_grammerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_false_grammer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterFalse_grammer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitFalse_grammer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitFalse_grammer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final False_grammerContext false_grammer() throws RecognitionException {
		False_grammerContext _localctx = new False_grammerContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_false_grammer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1414);
			match(T__6);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class One_loop_bodyContext extends ParserRuleContext {
		public Sql_stmt_listContext sql_stmt_list() {
			return getRuleContext(Sql_stmt_listContext.class,0);
		}
		public Var_grammerContext var_grammer() {
			return getRuleContext(Var_grammerContext.class,0);
		}
		public For_grammerContext for_grammer() {
			return getRuleContext(For_grammerContext.class,0);
		}
		public If_else_grammerContext if_else_grammer() {
			return getRuleContext(If_else_grammerContext.class,0);
		}
		public While_grammerContext while_grammer() {
			return getRuleContext(While_grammerContext.class,0);
		}
		public Do_while_grammerContext do_while_grammer() {
			return getRuleContext(Do_while_grammerContext.class,0);
		}
		public Switch_grammerContext switch_grammer() {
			return getRuleContext(Switch_grammerContext.class,0);
		}
		public Array_Intill_grammerContext array_Intill_grammer() {
			return getRuleContext(Array_Intill_grammerContext.class,0);
		}
		public Java_function_callContext java_function_call() {
			return getRuleContext(Java_function_callContext.class,0);
		}
		public Increase_and_decreaseContext increase_and_decrease() {
			return getRuleContext(Increase_and_decreaseContext.class,0);
		}
		public TerminalNode SCOL() { return getToken(SQLParser.SCOL, 0); }
		public Return_grammerContext return_grammer() {
			return getRuleContext(Return_grammerContext.class,0);
		}
		public Array_valueContext array_value() {
			return getRuleContext(Array_valueContext.class,0);
		}
		public Array_of_json_grammerContext array_of_json_grammer() {
			return getRuleContext(Array_of_json_grammerContext.class,0);
		}
		public Print_grammerContext print_grammer() {
			return getRuleContext(Print_grammerContext.class,0);
		}
		public One_loop_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_one_loop_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterOne_loop_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitOne_loop_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitOne_loop_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final One_loop_bodyContext one_loop_body() throws RecognitionException {
		One_loop_bodyContext _localctx = new One_loop_bodyContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_one_loop_body);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1432);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,174,_ctx) ) {
			case 1:
				{
				setState(1416);
				sql_stmt_list();
				}
				break;
			case 2:
				{
				setState(1417);
				var_grammer();
				}
				break;
			case 3:
				{
				setState(1418);
				for_grammer();
				}
				break;
			case 4:
				{
				setState(1419);
				if_else_grammer();
				}
				break;
			case 5:
				{
				setState(1420);
				while_grammer();
				}
				break;
			case 6:
				{
				setState(1421);
				do_while_grammer();
				}
				break;
			case 7:
				{
				setState(1422);
				switch_grammer();
				}
				break;
			case 8:
				{
				setState(1423);
				array_Intill_grammer();
				}
				break;
			case 9:
				{
				setState(1424);
				java_function_call();
				}
				break;
			case 10:
				{
				setState(1425);
				increase_and_decrease();
				setState(1426);
				match(SCOL);
				}
				break;
			case 11:
				{
				setState(1428);
				return_grammer();
				}
				break;
			case 12:
				{
				setState(1429);
				array_value();
				}
				break;
			case 13:
				{
				setState(1430);
				array_of_json_grammer();
				}
				break;
			case 14:
				{
				setState(1431);
				print_grammer();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Array_nameContext extends ParserRuleContext {
		public List<Any_name_without_keywordContext> any_name_without_keyword() {
			return getRuleContexts(Any_name_without_keywordContext.class);
		}
		public Any_name_without_keywordContext any_name_without_keyword(int i) {
			return getRuleContext(Any_name_without_keywordContext.class,i);
		}
		public List<TerminalNode> OPEN_ARRAY() { return getTokens(SQLParser.OPEN_ARRAY); }
		public TerminalNode OPEN_ARRAY(int i) {
			return getToken(SQLParser.OPEN_ARRAY, i);
		}
		public List<TerminalNode> CLOSE_ARRAY() { return getTokens(SQLParser.CLOSE_ARRAY); }
		public TerminalNode CLOSE_ARRAY(int i) {
			return getToken(SQLParser.CLOSE_ARRAY, i);
		}
		public List<TerminalNode> NUMERIC_LITERAL() { return getTokens(SQLParser.NUMERIC_LITERAL); }
		public TerminalNode NUMERIC_LITERAL(int i) {
			return getToken(SQLParser.NUMERIC_LITERAL, i);
		}
		public Array_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterArray_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitArray_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitArray_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_nameContext array_name() throws RecognitionException {
		Array_nameContext _localctx = new Array_nameContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_array_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1434);
			any_name_without_keyword();
			setState(1453);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,178,_ctx) ) {
			case 1:
				{
				{
				setState(1435);
				match(OPEN_ARRAY);
				setState(1438);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NUMERIC_LITERAL:
					{
					setState(1436);
					match(NUMERIC_LITERAL);
					}
					break;
				case OPEN_PAR:
				case IDENTIFIER:
				case STRING_LITERAL:
					{
					setState(1437);
					any_name_without_keyword();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1440);
				match(CLOSE_ARRAY);
				}
				}
				break;
			case 2:
				{
				{
				setState(1444);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case OPEN_ARRAY:
					{
					setState(1441);
					match(OPEN_ARRAY);
					setState(1442);
					match(NUMERIC_LITERAL);
					}
					break;
				case OPEN_PAR:
				case IDENTIFIER:
				case STRING_LITERAL:
					{
					setState(1443);
					any_name_without_keyword();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1446);
				match(CLOSE_ARRAY);
				setState(1447);
				match(OPEN_ARRAY);
				setState(1450);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NUMERIC_LITERAL:
					{
					setState(1448);
					match(NUMERIC_LITERAL);
					}
					break;
				case OPEN_PAR:
				case IDENTIFIER:
				case STRING_LITERAL:
					{
					setState(1449);
					any_name_without_keyword();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1452);
				match(CLOSE_ARRAY);
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Array_name_callContext extends ParserRuleContext {
		public Any_name_without_keywordContext any_name_without_keyword() {
			return getRuleContext(Any_name_without_keywordContext.class,0);
		}
		public Array_name_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_name_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterArray_name_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitArray_name_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitArray_name_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_name_callContext array_name_call() throws RecognitionException {
		Array_name_callContext _localctx = new Array_name_callContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_array_name_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1455);
			any_name_without_keyword();
			setState(1458);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				{
				{
				setState(1456);
				match(T__4);
				}
				}
				break;
			case T__10:
				{
				{
				setState(1457);
				match(T__10);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Array_valueContext extends ParserRuleContext {
		public List<Array_nameContext> array_name() {
			return getRuleContexts(Array_nameContext.class);
		}
		public Array_nameContext array_name(int i) {
			return getRuleContext(Array_nameContext.class,i);
		}
		public List<TerminalNode> ASSIGN() { return getTokens(SQLParser.ASSIGN); }
		public TerminalNode ASSIGN(int i) {
			return getToken(SQLParser.ASSIGN, i);
		}
		public TerminalNode SCOL() { return getToken(SQLParser.SCOL, 0); }
		public List<TerminalNode> NUMERIC_LITERAL() { return getTokens(SQLParser.NUMERIC_LITERAL); }
		public TerminalNode NUMERIC_LITERAL(int i) {
			return getToken(SQLParser.NUMERIC_LITERAL, i);
		}
		public List<Any_name_without_keywordContext> any_name_without_keyword() {
			return getRuleContexts(Any_name_without_keywordContext.class);
		}
		public Any_name_without_keywordContext any_name_without_keyword(int i) {
			return getRuleContext(Any_name_without_keywordContext.class,i);
		}
		public If_oneline_grammerContext if_oneline_grammer() {
			return getRuleContext(If_oneline_grammerContext.class,0);
		}
		public Java_function_call_for_loopContext java_function_call_for_loop() {
			return getRuleContext(Java_function_call_for_loopContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode IDENTIFIER() { return getToken(SQLParser.IDENTIFIER, 0); }
		public List<True_or_falseContext> true_or_false() {
			return getRuleContexts(True_or_falseContext.class);
		}
		public True_or_falseContext true_or_false(int i) {
			return getRuleContext(True_or_falseContext.class,i);
		}
		public List<While_signsContext> while_signs() {
			return getRuleContexts(While_signsContext.class);
		}
		public While_signsContext while_signs(int i) {
			return getRuleContext(While_signsContext.class,i);
		}
		public Array_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterArray_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitArray_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitArray_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_valueContext array_value() throws RecognitionException {
		Array_valueContext _localctx = new Array_valueContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_array_value);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1460);
			array_name();
			setState(1461);
			match(ASSIGN);
			setState(1480);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,183,_ctx) ) {
			case 1:
				{
				setState(1462);
				match(NUMERIC_LITERAL);
				}
				break;
			case 2:
				{
				setState(1463);
				any_name_without_keyword();
				}
				break;
			case 3:
				{
				setState(1464);
				if_oneline_grammer();
				}
				break;
			case 4:
				{
				setState(1465);
				java_function_call_for_loop();
				}
				break;
			case 5:
				{
				setState(1466);
				expr(0);
				}
				break;
			case 6:
				{
				setState(1467);
				match(IDENTIFIER);
				}
				break;
			case 7:
				{
				setState(1468);
				true_or_false();
				}
				break;
			case 8:
				{
				setState(1469);
				match(T__11);
				}
				break;
			case 9:
				{
				{
				setState(1470);
				array_name();
				setState(1478);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SCOL:
				case OPEN_PAR:
				case ASSIGN:
				case STAR:
				case PLUS:
				case MINUS:
				case TILDE:
				case DIV:
				case MOD:
				case K_ABORT:
				case K_ACTION:
				case K_ADD:
				case K_AFTER:
				case K_ALL:
				case K_ALTER:
				case K_ANALYZE:
				case K_AND:
				case K_AS:
				case K_ASC:
				case K_ATTACH:
				case K_AUTOINCREMENT:
				case K_BEFORE:
				case K_BEGIN:
				case K_BETWEEN:
				case K_BY:
				case K_CASCADE:
				case K_CASE:
				case K_CAST:
				case K_CHECK:
				case K_COLLATE:
				case K_COLUMN:
				case K_COMMIT:
				case K_CONFLICT:
				case K_CONSTRAINT:
				case K_CREATE:
				case K_CROSS:
				case K_CURRENT_DATE:
				case K_CURRENT_TIME:
				case K_CURRENT_TIMESTAMP:
				case K_DATABASE:
				case K_DEFAULT:
				case K_DEFERRABLE:
				case K_DEFERRED:
				case K_DELETE:
				case K_DESC:
				case K_DETACH:
				case K_DISTINCT:
				case K_DROP:
				case K_EACH:
				case K_ELSE:
				case K_END:
				case K_ENABLE:
				case K_ESCAPE:
				case K_EXCEPT:
				case K_EXCLUSIVE:
				case K_EXISTS:
				case K_EXPLAIN:
				case K_FAIL:
				case K_FOR:
				case K_FOREIGN:
				case K_FROM:
				case K_FULL:
				case K_GLOB:
				case K_GROUP:
				case K_HAVING:
				case K_IF:
				case K_IGNORE:
				case K_IMMEDIATE:
				case K_IN:
				case K_INDEX:
				case K_INDEXED:
				case K_INITIALLY:
				case K_INNER:
				case K_INSERT:
				case K_INSTEAD:
				case K_INTERSECT:
				case K_INTO:
				case K_IS:
				case K_ISNULL:
				case K_JOIN:
				case K_KEY:
				case K_LEFT:
				case K_LIKE:
				case K_LIMIT:
				case K_MATCH:
				case K_NATURAL:
				case K_NEXTVAL:
				case K_NO:
				case K_NOT:
				case K_NOTNULL:
				case K_NULL:
				case K_OF:
				case K_OFFSET:
				case K_ON:
				case K_OR:
				case K_ORDER:
				case K_OUTER:
				case K_PLAN:
				case K_PRAGMA:
				case K_PRIMARY:
				case K_QUERY:
				case K_RAISE:
				case K_RECURSIVE:
				case K_REFERENCES:
				case K_REGEXP:
				case K_REINDEX:
				case K_RELEASE:
				case K_RENAME:
				case K_REPLACE:
				case K_RESTRICT:
				case K_RIGHT:
				case K_ROLLBACK:
				case K_ROW:
				case K_SAVEPOINT:
				case K_SELECT:
				case K_SET:
				case K_TABLE:
				case K_TEMP:
				case K_TEMPORARY:
				case K_THEN:
				case K_TO:
				case K_TRANSACTION:
				case K_TRIGGER:
				case K_UNION:
				case K_UNIQUE:
				case K_UPDATE:
				case K_USING:
				case K_VACUUM:
				case K_VALUES:
				case K_VIEW:
				case K_VIRTUAL:
				case K_WHEN:
				case K_WHERE:
				case K_WITH:
				case K_WITHOUT:
				case K_RETURN:
				case K_WHILE:
				case K_SWITCH:
				case K_BREAK:
				case K_DO:
				case K_FUNCTION:
				case IDENTIFIER:
				case NUMERIC_LITERAL:
				case STRING_LITERAL:
				case BLOB_LITERAL:
					{
					setState(1472);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,180,_ctx) ) {
					case 1:
						{
						setState(1471);
						while_signs();
						}
						break;
					}
					setState(1475);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (((((_la - 22)) & ~0x3f) == 0 && ((1L << (_la - 22)) & ((1L << (OPEN_PAR - 22)) | (1L << (PLUS - 22)) | (1L << (MINUS - 22)) | (1L << (TILDE - 22)) | (1L << (K_ABORT - 22)) | (1L << (K_ACTION - 22)) | (1L << (K_ADD - 22)) | (1L << (K_AFTER - 22)) | (1L << (K_ALL - 22)) | (1L << (K_ALTER - 22)) | (1L << (K_ANALYZE - 22)) | (1L << (K_AND - 22)) | (1L << (K_AS - 22)) | (1L << (K_ASC - 22)) | (1L << (K_ATTACH - 22)) | (1L << (K_AUTOINCREMENT - 22)) | (1L << (K_BEFORE - 22)) | (1L << (K_BEGIN - 22)) | (1L << (K_BETWEEN - 22)) | (1L << (K_BY - 22)) | (1L << (K_CASCADE - 22)) | (1L << (K_CASE - 22)) | (1L << (K_CAST - 22)) | (1L << (K_CHECK - 22)) | (1L << (K_COLLATE - 22)) | (1L << (K_COLUMN - 22)) | (1L << (K_COMMIT - 22)) | (1L << (K_CONFLICT - 22)) | (1L << (K_CONSTRAINT - 22)) | (1L << (K_CREATE - 22)) | (1L << (K_CROSS - 22)) | (1L << (K_CURRENT_DATE - 22)) | (1L << (K_CURRENT_TIME - 22)) | (1L << (K_CURRENT_TIMESTAMP - 22)) | (1L << (K_DATABASE - 22)) | (1L << (K_DEFAULT - 22)) | (1L << (K_DEFERRABLE - 22)) | (1L << (K_DEFERRED - 22)) | (1L << (K_DELETE - 22)) | (1L << (K_DESC - 22)) | (1L << (K_DETACH - 22)))) != 0) || ((((_la - 86)) & ~0x3f) == 0 && ((1L << (_la - 86)) & ((1L << (K_DISTINCT - 86)) | (1L << (K_DROP - 86)) | (1L << (K_EACH - 86)) | (1L << (K_ELSE - 86)) | (1L << (K_END - 86)) | (1L << (K_ENABLE - 86)) | (1L << (K_ESCAPE - 86)) | (1L << (K_EXCEPT - 86)) | (1L << (K_EXCLUSIVE - 86)) | (1L << (K_EXISTS - 86)) | (1L << (K_EXPLAIN - 86)) | (1L << (K_FAIL - 86)) | (1L << (K_FOR - 86)) | (1L << (K_FOREIGN - 86)) | (1L << (K_FROM - 86)) | (1L << (K_FULL - 86)) | (1L << (K_GLOB - 86)) | (1L << (K_GROUP - 86)) | (1L << (K_HAVING - 86)) | (1L << (K_IF - 86)) | (1L << (K_IGNORE - 86)) | (1L << (K_IMMEDIATE - 86)) | (1L << (K_IN - 86)) | (1L << (K_INDEX - 86)) | (1L << (K_INDEXED - 86)) | (1L << (K_INITIALLY - 86)) | (1L << (K_INNER - 86)) | (1L << (K_INSERT - 86)) | (1L << (K_INSTEAD - 86)) | (1L << (K_INTERSECT - 86)) | (1L << (K_INTO - 86)) | (1L << (K_IS - 86)) | (1L << (K_ISNULL - 86)) | (1L << (K_JOIN - 86)) | (1L << (K_KEY - 86)) | (1L << (K_LEFT - 86)) | (1L << (K_LIKE - 86)) | (1L << (K_LIMIT - 86)) | (1L << (K_MATCH - 86)) | (1L << (K_NATURAL - 86)) | (1L << (K_NEXTVAL - 86)) | (1L << (K_NO - 86)) | (1L << (K_NOT - 86)) | (1L << (K_NOTNULL - 86)) | (1L << (K_NULL - 86)) | (1L << (K_OF - 86)) | (1L << (K_OFFSET - 86)) | (1L << (K_ON - 86)) | (1L << (K_OR - 86)) | (1L << (K_ORDER - 86)) | (1L << (K_OUTER - 86)) | (1L << (K_PLAN - 86)) | (1L << (K_PRAGMA - 86)) | (1L << (K_PRIMARY - 86)) | (1L << (K_QUERY - 86)) | (1L << (K_RAISE - 86)) | (1L << (K_RECURSIVE - 86)) | (1L << (K_REFERENCES - 86)) | (1L << (K_REGEXP - 86)) | (1L << (K_REINDEX - 86)) | (1L << (K_RELEASE - 86)) | (1L << (K_RENAME - 86)) | (1L << (K_REPLACE - 86)))) != 0) || ((((_la - 150)) & ~0x3f) == 0 && ((1L << (_la - 150)) & ((1L << (K_RESTRICT - 150)) | (1L << (K_RIGHT - 150)) | (1L << (K_ROLLBACK - 150)) | (1L << (K_ROW - 150)) | (1L << (K_SAVEPOINT - 150)) | (1L << (K_SELECT - 150)) | (1L << (K_SET - 150)) | (1L << (K_TABLE - 150)) | (1L << (K_TEMP - 150)) | (1L << (K_TEMPORARY - 150)) | (1L << (K_THEN - 150)) | (1L << (K_TO - 150)) | (1L << (K_TRANSACTION - 150)) | (1L << (K_TRIGGER - 150)) | (1L << (K_UNION - 150)) | (1L << (K_UNIQUE - 150)) | (1L << (K_UPDATE - 150)) | (1L << (K_USING - 150)) | (1L << (K_VACUUM - 150)) | (1L << (K_VALUES - 150)) | (1L << (K_VIEW - 150)) | (1L << (K_VIRTUAL - 150)) | (1L << (K_WHEN - 150)) | (1L << (K_WHERE - 150)) | (1L << (K_WITH - 150)) | (1L << (K_WITHOUT - 150)) | (1L << (K_RETURN - 150)) | (1L << (K_WHILE - 150)) | (1L << (K_SWITCH - 150)) | (1L << (K_BREAK - 150)) | (1L << (K_DO - 150)) | (1L << (K_FUNCTION - 150)) | (1L << (IDENTIFIER - 150)) | (1L << (NUMERIC_LITERAL - 150)) | (1L << (STRING_LITERAL - 150)) | (1L << (BLOB_LITERAL - 150)))) != 0)) {
						{
						setState(1474);
						expr(0);
						}
					}

					}
					break;
				case T__12:
				case T__13:
					{
					setState(1477);
					_la = _input.LA(1);
					if ( !(_la==T__12 || _la==T__13) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				break;
			}
			setState(1508);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(1482);
				match(ASSIGN);
				setState(1488);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,184,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1483);
						array_name();
						setState(1484);
						match(ASSIGN);
						}
						} 
					}
					setState(1490);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,184,_ctx);
				}
				setState(1506);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,188,_ctx) ) {
				case 1:
					{
					setState(1491);
					match(NUMERIC_LITERAL);
					}
					break;
				case 2:
					{
					setState(1492);
					any_name_without_keyword();
					}
					break;
				case 3:
					{
					setState(1493);
					expr(0);
					}
					break;
				case 4:
					{
					setState(1494);
					true_or_false();
					}
					break;
				case 5:
					{
					setState(1495);
					match(T__11);
					}
					break;
				case 6:
					{
					{
					setState(1496);
					array_name();
					setState(1504);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case SCOL:
					case OPEN_PAR:
					case STAR:
					case PLUS:
					case MINUS:
					case TILDE:
					case DIV:
					case MOD:
					case K_ABORT:
					case K_ACTION:
					case K_ADD:
					case K_AFTER:
					case K_ALL:
					case K_ALTER:
					case K_ANALYZE:
					case K_AND:
					case K_AS:
					case K_ASC:
					case K_ATTACH:
					case K_AUTOINCREMENT:
					case K_BEFORE:
					case K_BEGIN:
					case K_BETWEEN:
					case K_BY:
					case K_CASCADE:
					case K_CASE:
					case K_CAST:
					case K_CHECK:
					case K_COLLATE:
					case K_COLUMN:
					case K_COMMIT:
					case K_CONFLICT:
					case K_CONSTRAINT:
					case K_CREATE:
					case K_CROSS:
					case K_CURRENT_DATE:
					case K_CURRENT_TIME:
					case K_CURRENT_TIMESTAMP:
					case K_DATABASE:
					case K_DEFAULT:
					case K_DEFERRABLE:
					case K_DEFERRED:
					case K_DELETE:
					case K_DESC:
					case K_DETACH:
					case K_DISTINCT:
					case K_DROP:
					case K_EACH:
					case K_ELSE:
					case K_END:
					case K_ENABLE:
					case K_ESCAPE:
					case K_EXCEPT:
					case K_EXCLUSIVE:
					case K_EXISTS:
					case K_EXPLAIN:
					case K_FAIL:
					case K_FOR:
					case K_FOREIGN:
					case K_FROM:
					case K_FULL:
					case K_GLOB:
					case K_GROUP:
					case K_HAVING:
					case K_IF:
					case K_IGNORE:
					case K_IMMEDIATE:
					case K_IN:
					case K_INDEX:
					case K_INDEXED:
					case K_INITIALLY:
					case K_INNER:
					case K_INSERT:
					case K_INSTEAD:
					case K_INTERSECT:
					case K_INTO:
					case K_IS:
					case K_ISNULL:
					case K_JOIN:
					case K_KEY:
					case K_LEFT:
					case K_LIKE:
					case K_LIMIT:
					case K_MATCH:
					case K_NATURAL:
					case K_NEXTVAL:
					case K_NO:
					case K_NOT:
					case K_NOTNULL:
					case K_NULL:
					case K_OF:
					case K_OFFSET:
					case K_ON:
					case K_OR:
					case K_ORDER:
					case K_OUTER:
					case K_PLAN:
					case K_PRAGMA:
					case K_PRIMARY:
					case K_QUERY:
					case K_RAISE:
					case K_RECURSIVE:
					case K_REFERENCES:
					case K_REGEXP:
					case K_REINDEX:
					case K_RELEASE:
					case K_RENAME:
					case K_REPLACE:
					case K_RESTRICT:
					case K_RIGHT:
					case K_ROLLBACK:
					case K_ROW:
					case K_SAVEPOINT:
					case K_SELECT:
					case K_SET:
					case K_TABLE:
					case K_TEMP:
					case K_TEMPORARY:
					case K_THEN:
					case K_TO:
					case K_TRANSACTION:
					case K_TRIGGER:
					case K_UNION:
					case K_UNIQUE:
					case K_UPDATE:
					case K_USING:
					case K_VACUUM:
					case K_VALUES:
					case K_VIEW:
					case K_VIRTUAL:
					case K_WHEN:
					case K_WHERE:
					case K_WITH:
					case K_WITHOUT:
					case K_RETURN:
					case K_WHILE:
					case K_SWITCH:
					case K_BREAK:
					case K_DO:
					case K_FUNCTION:
					case IDENTIFIER:
					case NUMERIC_LITERAL:
					case STRING_LITERAL:
					case BLOB_LITERAL:
						{
						setState(1498);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,185,_ctx) ) {
						case 1:
							{
							setState(1497);
							while_signs();
							}
							break;
						}
						setState(1501);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (((((_la - 22)) & ~0x3f) == 0 && ((1L << (_la - 22)) & ((1L << (OPEN_PAR - 22)) | (1L << (PLUS - 22)) | (1L << (MINUS - 22)) | (1L << (TILDE - 22)) | (1L << (K_ABORT - 22)) | (1L << (K_ACTION - 22)) | (1L << (K_ADD - 22)) | (1L << (K_AFTER - 22)) | (1L << (K_ALL - 22)) | (1L << (K_ALTER - 22)) | (1L << (K_ANALYZE - 22)) | (1L << (K_AND - 22)) | (1L << (K_AS - 22)) | (1L << (K_ASC - 22)) | (1L << (K_ATTACH - 22)) | (1L << (K_AUTOINCREMENT - 22)) | (1L << (K_BEFORE - 22)) | (1L << (K_BEGIN - 22)) | (1L << (K_BETWEEN - 22)) | (1L << (K_BY - 22)) | (1L << (K_CASCADE - 22)) | (1L << (K_CASE - 22)) | (1L << (K_CAST - 22)) | (1L << (K_CHECK - 22)) | (1L << (K_COLLATE - 22)) | (1L << (K_COLUMN - 22)) | (1L << (K_COMMIT - 22)) | (1L << (K_CONFLICT - 22)) | (1L << (K_CONSTRAINT - 22)) | (1L << (K_CREATE - 22)) | (1L << (K_CROSS - 22)) | (1L << (K_CURRENT_DATE - 22)) | (1L << (K_CURRENT_TIME - 22)) | (1L << (K_CURRENT_TIMESTAMP - 22)) | (1L << (K_DATABASE - 22)) | (1L << (K_DEFAULT - 22)) | (1L << (K_DEFERRABLE - 22)) | (1L << (K_DEFERRED - 22)) | (1L << (K_DELETE - 22)) | (1L << (K_DESC - 22)) | (1L << (K_DETACH - 22)))) != 0) || ((((_la - 86)) & ~0x3f) == 0 && ((1L << (_la - 86)) & ((1L << (K_DISTINCT - 86)) | (1L << (K_DROP - 86)) | (1L << (K_EACH - 86)) | (1L << (K_ELSE - 86)) | (1L << (K_END - 86)) | (1L << (K_ENABLE - 86)) | (1L << (K_ESCAPE - 86)) | (1L << (K_EXCEPT - 86)) | (1L << (K_EXCLUSIVE - 86)) | (1L << (K_EXISTS - 86)) | (1L << (K_EXPLAIN - 86)) | (1L << (K_FAIL - 86)) | (1L << (K_FOR - 86)) | (1L << (K_FOREIGN - 86)) | (1L << (K_FROM - 86)) | (1L << (K_FULL - 86)) | (1L << (K_GLOB - 86)) | (1L << (K_GROUP - 86)) | (1L << (K_HAVING - 86)) | (1L << (K_IF - 86)) | (1L << (K_IGNORE - 86)) | (1L << (K_IMMEDIATE - 86)) | (1L << (K_IN - 86)) | (1L << (K_INDEX - 86)) | (1L << (K_INDEXED - 86)) | (1L << (K_INITIALLY - 86)) | (1L << (K_INNER - 86)) | (1L << (K_INSERT - 86)) | (1L << (K_INSTEAD - 86)) | (1L << (K_INTERSECT - 86)) | (1L << (K_INTO - 86)) | (1L << (K_IS - 86)) | (1L << (K_ISNULL - 86)) | (1L << (K_JOIN - 86)) | (1L << (K_KEY - 86)) | (1L << (K_LEFT - 86)) | (1L << (K_LIKE - 86)) | (1L << (K_LIMIT - 86)) | (1L << (K_MATCH - 86)) | (1L << (K_NATURAL - 86)) | (1L << (K_NEXTVAL - 86)) | (1L << (K_NO - 86)) | (1L << (K_NOT - 86)) | (1L << (K_NOTNULL - 86)) | (1L << (K_NULL - 86)) | (1L << (K_OF - 86)) | (1L << (K_OFFSET - 86)) | (1L << (K_ON - 86)) | (1L << (K_OR - 86)) | (1L << (K_ORDER - 86)) | (1L << (K_OUTER - 86)) | (1L << (K_PLAN - 86)) | (1L << (K_PRAGMA - 86)) | (1L << (K_PRIMARY - 86)) | (1L << (K_QUERY - 86)) | (1L << (K_RAISE - 86)) | (1L << (K_RECURSIVE - 86)) | (1L << (K_REFERENCES - 86)) | (1L << (K_REGEXP - 86)) | (1L << (K_REINDEX - 86)) | (1L << (K_RELEASE - 86)) | (1L << (K_RENAME - 86)) | (1L << (K_REPLACE - 86)))) != 0) || ((((_la - 150)) & ~0x3f) == 0 && ((1L << (_la - 150)) & ((1L << (K_RESTRICT - 150)) | (1L << (K_RIGHT - 150)) | (1L << (K_ROLLBACK - 150)) | (1L << (K_ROW - 150)) | (1L << (K_SAVEPOINT - 150)) | (1L << (K_SELECT - 150)) | (1L << (K_SET - 150)) | (1L << (K_TABLE - 150)) | (1L << (K_TEMP - 150)) | (1L << (K_TEMPORARY - 150)) | (1L << (K_THEN - 150)) | (1L << (K_TO - 150)) | (1L << (K_TRANSACTION - 150)) | (1L << (K_TRIGGER - 150)) | (1L << (K_UNION - 150)) | (1L << (K_UNIQUE - 150)) | (1L << (K_UPDATE - 150)) | (1L << (K_USING - 150)) | (1L << (K_VACUUM - 150)) | (1L << (K_VALUES - 150)) | (1L << (K_VIEW - 150)) | (1L << (K_VIRTUAL - 150)) | (1L << (K_WHEN - 150)) | (1L << (K_WHERE - 150)) | (1L << (K_WITH - 150)) | (1L << (K_WITHOUT - 150)) | (1L << (K_RETURN - 150)) | (1L << (K_WHILE - 150)) | (1L << (K_SWITCH - 150)) | (1L << (K_BREAK - 150)) | (1L << (K_DO - 150)) | (1L << (K_FUNCTION - 150)) | (1L << (IDENTIFIER - 150)) | (1L << (NUMERIC_LITERAL - 150)) | (1L << (STRING_LITERAL - 150)) | (1L << (BLOB_LITERAL - 150)))) != 0)) {
							{
							setState(1500);
							expr(0);
							}
						}

						}
						break;
					case T__12:
					case T__13:
						{
						setState(1503);
						_la = _input.LA(1);
						if ( !(_la==T__12 || _la==T__13) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					}
					break;
				}
				}
			}

			setState(1510);
			match(SCOL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Increase_and_decreaseContext extends ParserRuleContext {
		public List<Any_name_without_keywordContext> any_name_without_keyword() {
			return getRuleContexts(Any_name_without_keywordContext.class);
		}
		public Any_name_without_keywordContext any_name_without_keyword(int i) {
			return getRuleContext(Any_name_without_keywordContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(SQLParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(SQLParser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(SQLParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(SQLParser.MINUS, i);
		}
		public TerminalNode NUMERIC_LITERAL() { return getToken(SQLParser.NUMERIC_LITERAL, 0); }
		public Increase_and_decreaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_increase_and_decrease; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterIncrease_and_decrease(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitIncrease_and_decrease(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitIncrease_and_decrease(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Increase_and_decreaseContext increase_and_decrease() throws RecognitionException {
		Increase_and_decreaseContext _localctx = new Increase_and_decreaseContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_increase_and_decrease);
		try {
			setState(1538);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_PAR:
			case IDENTIFIER:
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1512);
				any_name_without_keyword();
				setState(1522);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__12:
					{
					{
					setState(1513);
					match(T__12);
					}
					}
					break;
				case T__13:
					{
					{
					setState(1514);
					match(T__13);
					}
					}
					break;
				case PLUS:
					{
					setState(1515);
					match(PLUS);
					setState(1518);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case NUMERIC_LITERAL:
						{
						setState(1516);
						match(NUMERIC_LITERAL);
						}
						break;
					case OPEN_PAR:
					case IDENTIFIER:
					case STRING_LITERAL:
						{
						setState(1517);
						any_name_without_keyword();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				case MINUS:
					{
					setState(1520);
					match(MINUS);
					setState(1521);
					match(NUMERIC_LITERAL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				break;
			case PLUS:
			case MINUS:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(1535);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,193,_ctx) ) {
				case 1:
					{
					{
					setState(1524);
					match(PLUS);
					setState(1525);
					match(PLUS);
					}
					}
					break;
				case 2:
					{
					{
					setState(1526);
					match(MINUS);
					setState(1527);
					match(MINUS);
					}
					}
					break;
				case 3:
					{
					setState(1528);
					match(PLUS);
					setState(1531);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case NUMERIC_LITERAL:
						{
						setState(1529);
						match(NUMERIC_LITERAL);
						}
						break;
					case OPEN_PAR:
					case IDENTIFIER:
					case STRING_LITERAL:
						{
						setState(1530);
						any_name_without_keyword();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				case 4:
					{
					setState(1533);
					match(MINUS);
					setState(1534);
					match(NUMERIC_LITERAL);
					}
					break;
				}
				setState(1537);
				any_name_without_keyword();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Any_name_without_keywordContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SQLParser.IDENTIFIER, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(SQLParser.STRING_LITERAL, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public Any_name_without_keywordContext any_name_without_keyword() {
			return getRuleContext(Any_name_without_keywordContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public Any_name_without_keywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_any_name_without_keyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterAny_name_without_keyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitAny_name_without_keyword(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitAny_name_without_keyword(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Any_name_without_keywordContext any_name_without_keyword() throws RecognitionException {
		Any_name_without_keywordContext _localctx = new Any_name_without_keywordContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_any_name_without_keyword);
		try {
			setState(1546);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1540);
				match(IDENTIFIER);
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(1541);
				match(STRING_LITERAL);
				}
				break;
			case OPEN_PAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(1542);
				match(OPEN_PAR);
				setState(1543);
				any_name_without_keyword();
				setState(1544);
				match(CLOSE_PAR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Return_grammerContext extends ParserRuleContext {
		public TerminalNode K_RETURN() { return getToken(SQLParser.K_RETURN, 0); }
		public TerminalNode SCOL() { return getToken(SQLParser.SCOL, 0); }
		public Literal_valueContext literal_value() {
			return getRuleContext(Literal_valueContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(SQLParser.IDENTIFIER, 0); }
		public Java_function_call_for_loopContext java_function_call_for_loop() {
			return getRuleContext(Java_function_call_for_loopContext.class,0);
		}
		public True_or_falseContext true_or_false() {
			return getRuleContext(True_or_falseContext.class,0);
		}
		public If_oneline_grammerContext if_oneline_grammer() {
			return getRuleContext(If_oneline_grammerContext.class,0);
		}
		public Array_nameContext array_name() {
			return getRuleContext(Array_nameContext.class,0);
		}
		public Increase_and_decreaseContext increase_and_decrease() {
			return getRuleContext(Increase_and_decreaseContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Return_grammerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_grammer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterReturn_grammer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitReturn_grammer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitReturn_grammer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_grammerContext return_grammer() throws RecognitionException {
		Return_grammerContext _localctx = new Return_grammerContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_return_grammer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1548);
			match(K_RETURN);
			setState(1558);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,196,_ctx) ) {
			case 1:
				{
				setState(1549);
				literal_value();
				}
				break;
			case 2:
				{
				setState(1550);
				match(IDENTIFIER);
				}
				break;
			case 3:
				{
				setState(1551);
				java_function_call_for_loop();
				}
				break;
			case 4:
				{
				setState(1552);
				true_or_false();
				}
				break;
			case 5:
				{
				setState(1553);
				match(T__11);
				}
				break;
			case 6:
				{
				setState(1554);
				if_oneline_grammer();
				}
				break;
			case 7:
				{
				setState(1555);
				array_name();
				}
				break;
			case 8:
				{
				setState(1556);
				increase_and_decrease();
				}
				break;
			case 9:
				{
				setState(1557);
				expr(0);
				}
				break;
			}
			setState(1560);
			match(SCOL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Json_grammerContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(SQLParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(SQLParser.IDENTIFIER, i);
		}
		public List<TerminalNode> DD() { return getTokens(SQLParser.DD); }
		public TerminalNode DD(int i) {
			return getToken(SQLParser.DD, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<Json_grammerContext> json_grammer() {
			return getRuleContexts(Json_grammerContext.class);
		}
		public Json_grammerContext json_grammer(int i) {
			return getRuleContext(Json_grammerContext.class,i);
		}
		public Json_grammerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_json_grammer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterJson_grammer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitJson_grammer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitJson_grammer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Json_grammerContext json_grammer() throws RecognitionException {
		Json_grammerContext _localctx = new Json_grammerContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_json_grammer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1562);
			match(T__2);
			{
			setState(1563);
			match(IDENTIFIER);
			setState(1564);
			match(DD);
			setState(1567);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_PAR:
			case PLUS:
			case MINUS:
			case TILDE:
			case K_ABORT:
			case K_ACTION:
			case K_ADD:
			case K_AFTER:
			case K_ALL:
			case K_ALTER:
			case K_ANALYZE:
			case K_AND:
			case K_AS:
			case K_ASC:
			case K_ATTACH:
			case K_AUTOINCREMENT:
			case K_BEFORE:
			case K_BEGIN:
			case K_BETWEEN:
			case K_BY:
			case K_CASCADE:
			case K_CASE:
			case K_CAST:
			case K_CHECK:
			case K_COLLATE:
			case K_COLUMN:
			case K_COMMIT:
			case K_CONFLICT:
			case K_CONSTRAINT:
			case K_CREATE:
			case K_CROSS:
			case K_CURRENT_DATE:
			case K_CURRENT_TIME:
			case K_CURRENT_TIMESTAMP:
			case K_DATABASE:
			case K_DEFAULT:
			case K_DEFERRABLE:
			case K_DEFERRED:
			case K_DELETE:
			case K_DESC:
			case K_DETACH:
			case K_DISTINCT:
			case K_DROP:
			case K_EACH:
			case K_ELSE:
			case K_END:
			case K_ENABLE:
			case K_ESCAPE:
			case K_EXCEPT:
			case K_EXCLUSIVE:
			case K_EXISTS:
			case K_EXPLAIN:
			case K_FAIL:
			case K_FOR:
			case K_FOREIGN:
			case K_FROM:
			case K_FULL:
			case K_GLOB:
			case K_GROUP:
			case K_HAVING:
			case K_IF:
			case K_IGNORE:
			case K_IMMEDIATE:
			case K_IN:
			case K_INDEX:
			case K_INDEXED:
			case K_INITIALLY:
			case K_INNER:
			case K_INSERT:
			case K_INSTEAD:
			case K_INTERSECT:
			case K_INTO:
			case K_IS:
			case K_ISNULL:
			case K_JOIN:
			case K_KEY:
			case K_LEFT:
			case K_LIKE:
			case K_LIMIT:
			case K_MATCH:
			case K_NATURAL:
			case K_NEXTVAL:
			case K_NO:
			case K_NOT:
			case K_NOTNULL:
			case K_NULL:
			case K_OF:
			case K_OFFSET:
			case K_ON:
			case K_OR:
			case K_ORDER:
			case K_OUTER:
			case K_PLAN:
			case K_PRAGMA:
			case K_PRIMARY:
			case K_QUERY:
			case K_RAISE:
			case K_RECURSIVE:
			case K_REFERENCES:
			case K_REGEXP:
			case K_REINDEX:
			case K_RELEASE:
			case K_RENAME:
			case K_REPLACE:
			case K_RESTRICT:
			case K_RIGHT:
			case K_ROLLBACK:
			case K_ROW:
			case K_SAVEPOINT:
			case K_SELECT:
			case K_SET:
			case K_TABLE:
			case K_TEMP:
			case K_TEMPORARY:
			case K_THEN:
			case K_TO:
			case K_TRANSACTION:
			case K_TRIGGER:
			case K_UNION:
			case K_UNIQUE:
			case K_UPDATE:
			case K_USING:
			case K_VACUUM:
			case K_VALUES:
			case K_VIEW:
			case K_VIRTUAL:
			case K_WHEN:
			case K_WHERE:
			case K_WITH:
			case K_WITHOUT:
			case K_RETURN:
			case K_WHILE:
			case K_SWITCH:
			case K_BREAK:
			case K_DO:
			case K_FUNCTION:
			case IDENTIFIER:
			case NUMERIC_LITERAL:
			case STRING_LITERAL:
			case BLOB_LITERAL:
				{
				setState(1565);
				expr(0);
				}
				break;
			case T__2:
				{
				setState(1566);
				json_grammer();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
			setState(1578);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1569);
				match(COMMA);
				{
				setState(1570);
				match(IDENTIFIER);
				setState(1571);
				match(DD);
				setState(1574);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case OPEN_PAR:
				case PLUS:
				case MINUS:
				case TILDE:
				case K_ABORT:
				case K_ACTION:
				case K_ADD:
				case K_AFTER:
				case K_ALL:
				case K_ALTER:
				case K_ANALYZE:
				case K_AND:
				case K_AS:
				case K_ASC:
				case K_ATTACH:
				case K_AUTOINCREMENT:
				case K_BEFORE:
				case K_BEGIN:
				case K_BETWEEN:
				case K_BY:
				case K_CASCADE:
				case K_CASE:
				case K_CAST:
				case K_CHECK:
				case K_COLLATE:
				case K_COLUMN:
				case K_COMMIT:
				case K_CONFLICT:
				case K_CONSTRAINT:
				case K_CREATE:
				case K_CROSS:
				case K_CURRENT_DATE:
				case K_CURRENT_TIME:
				case K_CURRENT_TIMESTAMP:
				case K_DATABASE:
				case K_DEFAULT:
				case K_DEFERRABLE:
				case K_DEFERRED:
				case K_DELETE:
				case K_DESC:
				case K_DETACH:
				case K_DISTINCT:
				case K_DROP:
				case K_EACH:
				case K_ELSE:
				case K_END:
				case K_ENABLE:
				case K_ESCAPE:
				case K_EXCEPT:
				case K_EXCLUSIVE:
				case K_EXISTS:
				case K_EXPLAIN:
				case K_FAIL:
				case K_FOR:
				case K_FOREIGN:
				case K_FROM:
				case K_FULL:
				case K_GLOB:
				case K_GROUP:
				case K_HAVING:
				case K_IF:
				case K_IGNORE:
				case K_IMMEDIATE:
				case K_IN:
				case K_INDEX:
				case K_INDEXED:
				case K_INITIALLY:
				case K_INNER:
				case K_INSERT:
				case K_INSTEAD:
				case K_INTERSECT:
				case K_INTO:
				case K_IS:
				case K_ISNULL:
				case K_JOIN:
				case K_KEY:
				case K_LEFT:
				case K_LIKE:
				case K_LIMIT:
				case K_MATCH:
				case K_NATURAL:
				case K_NEXTVAL:
				case K_NO:
				case K_NOT:
				case K_NOTNULL:
				case K_NULL:
				case K_OF:
				case K_OFFSET:
				case K_ON:
				case K_OR:
				case K_ORDER:
				case K_OUTER:
				case K_PLAN:
				case K_PRAGMA:
				case K_PRIMARY:
				case K_QUERY:
				case K_RAISE:
				case K_RECURSIVE:
				case K_REFERENCES:
				case K_REGEXP:
				case K_REINDEX:
				case K_RELEASE:
				case K_RENAME:
				case K_REPLACE:
				case K_RESTRICT:
				case K_RIGHT:
				case K_ROLLBACK:
				case K_ROW:
				case K_SAVEPOINT:
				case K_SELECT:
				case K_SET:
				case K_TABLE:
				case K_TEMP:
				case K_TEMPORARY:
				case K_THEN:
				case K_TO:
				case K_TRANSACTION:
				case K_TRIGGER:
				case K_UNION:
				case K_UNIQUE:
				case K_UPDATE:
				case K_USING:
				case K_VACUUM:
				case K_VALUES:
				case K_VIEW:
				case K_VIRTUAL:
				case K_WHEN:
				case K_WHERE:
				case K_WITH:
				case K_WITHOUT:
				case K_RETURN:
				case K_WHILE:
				case K_SWITCH:
				case K_BREAK:
				case K_DO:
				case K_FUNCTION:
				case IDENTIFIER:
				case NUMERIC_LITERAL:
				case STRING_LITERAL:
				case BLOB_LITERAL:
					{
					setState(1572);
					expr(0);
					}
					break;
				case T__2:
					{
					setState(1573);
					json_grammer();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				}
				setState(1580);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1581);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Open_parContext extends ParserRuleContext {
		public Open_parContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_open_par; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterOpen_par(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitOpen_par(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitOpen_par(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Open_parContext open_par() throws RecognitionException {
		Open_parContext _localctx = new Open_parContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_open_par);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1583);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Close_parContext extends ParserRuleContext {
		public Close_parContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_close_par; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterClose_par(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitClose_par(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitClose_par(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Close_parContext close_par() throws RecognitionException {
		Close_parContext _localctx = new Close_parContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_close_par);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1585);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValueContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SQLParser.IDENTIFIER, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Array_of_json_grammerContext array_of_json_grammer() {
			return getRuleContext(Array_of_json_grammerContext.class,0);
		}
		public Json_grammerContext json_grammer() {
			return getRuleContext(Json_grammerContext.class,0);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_value);
		try {
			setState(1594);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,200,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1587);
				match(IDENTIFIER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1588);
				expr(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1589);
				match(T__5);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1590);
				match(T__6);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1591);
				match(T__11);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1592);
				array_of_json_grammer();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1593);
				json_grammer();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Array_of_json_grammerContext extends ParserRuleContext {
		public Any_name_without_keywordContext any_name_without_keyword() {
			return getRuleContext(Any_name_without_keywordContext.class,0);
		}
		public TerminalNode DD() { return getToken(SQLParser.DD, 0); }
		public TerminalNode SCOL() { return getToken(SQLParser.SCOL, 0); }
		public TerminalNode OPEN_ARRAY() { return getToken(SQLParser.OPEN_ARRAY, 0); }
		public TerminalNode CLOSE_ARRAY() { return getToken(SQLParser.CLOSE_ARRAY, 0); }
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public Array_of_json_grammerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_of_json_grammer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterArray_of_json_grammer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitArray_of_json_grammer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitArray_of_json_grammer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_of_json_grammerContext array_of_json_grammer() throws RecognitionException {
		Array_of_json_grammerContext _localctx = new Array_of_json_grammerContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_array_of_json_grammer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1596);
			any_name_without_keyword();
			setState(1597);
			match(DD);
			setState(1610);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_ARRAY:
				{
				{
				setState(1598);
				match(OPEN_ARRAY);
				{
				setState(1599);
				value();
				setState(1604);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1600);
					match(COMMA);
					setState(1601);
					value();
					}
					}
					setState(1606);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				setState(1607);
				match(CLOSE_ARRAY);
				}
				}
				break;
			case T__4:
				{
				{
				setState(1609);
				match(T__4);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1612);
			match(SCOL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class For_signsContext extends ParserRuleContext {
		public TerminalNode GT_EQ() { return getToken(SQLParser.GT_EQ, 0); }
		public TerminalNode LT_EQ() { return getToken(SQLParser.LT_EQ, 0); }
		public TerminalNode LT() { return getToken(SQLParser.LT, 0); }
		public TerminalNode GT() { return getToken(SQLParser.GT, 0); }
		public For_signsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_signs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterFor_signs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitFor_signs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitFor_signs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_signsContext for_signs() throws RecognitionException {
		For_signsContext _localctx = new For_signsContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_for_signs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1614);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT) | (1L << LT_EQ) | (1L << GT) | (1L << GT_EQ))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class While_comperContext extends ParserRuleContext {
		public TerminalNode EQ() { return getToken(SQLParser.EQ, 0); }
		public TerminalNode NOT_EQ1() { return getToken(SQLParser.NOT_EQ1, 0); }
		public TerminalNode LT() { return getToken(SQLParser.LT, 0); }
		public TerminalNode LT_EQ() { return getToken(SQLParser.LT_EQ, 0); }
		public TerminalNode GT() { return getToken(SQLParser.GT, 0); }
		public TerminalNode GT_EQ() { return getToken(SQLParser.GT_EQ, 0); }
		public While_comperContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_comper; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterWhile_comper(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitWhile_comper(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitWhile_comper(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_comperContext while_comper() throws RecognitionException {
		While_comperContext _localctx = new While_comperContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_while_comper);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1616);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT) | (1L << LT_EQ) | (1L << GT) | (1L << GT_EQ) | (1L << EQ) | (1L << NOT_EQ1))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class While_signsContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(SQLParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(SQLParser.MINUS, 0); }
		public TerminalNode DIV() { return getToken(SQLParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(SQLParser.MOD, 0); }
		public TerminalNode STAR() { return getToken(SQLParser.STAR, 0); }
		public While_signsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_signs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterWhile_signs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitWhile_signs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitWhile_signs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_signsContext while_signs() throws RecognitionException {
		While_signsContext _localctx = new While_signsContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_while_signs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1618);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STAR) | (1L << PLUS) | (1L << MINUS) | (1L << DIV) | (1L << MOD))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Alter_table_stmtContext extends ParserRuleContext {
		public TerminalNode K_ALTER() { return getToken(SQLParser.K_ALTER, 0); }
		public TerminalNode K_TABLE() { return getToken(SQLParser.K_TABLE, 0); }
		public Source_table_nameContext source_table_name() {
			return getRuleContext(Source_table_nameContext.class,0);
		}
		public TerminalNode K_RENAME() { return getToken(SQLParser.K_RENAME, 0); }
		public TerminalNode K_TO() { return getToken(SQLParser.K_TO, 0); }
		public New_table_nameContext new_table_name() {
			return getRuleContext(New_table_nameContext.class,0);
		}
		public Alter_table_addContext alter_table_add() {
			return getRuleContext(Alter_table_addContext.class,0);
		}
		public Alter_table_add_constraintContext alter_table_add_constraint() {
			return getRuleContext(Alter_table_add_constraintContext.class,0);
		}
		public TerminalNode K_ADD() { return getToken(SQLParser.K_ADD, 0); }
		public Column_defContext column_def() {
			return getRuleContext(Column_defContext.class,0);
		}
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SQLParser.DOT, 0); }
		public TerminalNode K_COLUMN() { return getToken(SQLParser.K_COLUMN, 0); }
		public Alter_table_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter_table_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterAlter_table_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitAlter_table_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitAlter_table_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Alter_table_stmtContext alter_table_stmt() throws RecognitionException {
		Alter_table_stmtContext _localctx = new Alter_table_stmtContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_alter_table_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1620);
			match(K_ALTER);
			setState(1621);
			match(K_TABLE);
			setState(1625);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,203,_ctx) ) {
			case 1:
				{
				setState(1622);
				database_name();
				setState(1623);
				match(DOT);
				}
				break;
			}
			setState(1627);
			source_table_name();
			setState(1638);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,205,_ctx) ) {
			case 1:
				{
				setState(1628);
				match(K_RENAME);
				setState(1629);
				match(K_TO);
				setState(1630);
				new_table_name();
				}
				break;
			case 2:
				{
				setState(1631);
				alter_table_add();
				}
				break;
			case 3:
				{
				setState(1632);
				alter_table_add_constraint();
				}
				break;
			case 4:
				{
				setState(1633);
				match(K_ADD);
				setState(1635);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,204,_ctx) ) {
				case 1:
					{
					setState(1634);
					match(K_COLUMN);
					}
					break;
				}
				setState(1637);
				column_def();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Alter_table_add_constraintContext extends ParserRuleContext {
		public TerminalNode K_ADD() { return getToken(SQLParser.K_ADD, 0); }
		public TerminalNode K_CONSTRAINT() { return getToken(SQLParser.K_CONSTRAINT, 0); }
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Table_constraintContext table_constraint() {
			return getRuleContext(Table_constraintContext.class,0);
		}
		public Alter_table_add_constraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter_table_add_constraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterAlter_table_add_constraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitAlter_table_add_constraint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitAlter_table_add_constraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Alter_table_add_constraintContext alter_table_add_constraint() throws RecognitionException {
		Alter_table_add_constraintContext _localctx = new Alter_table_add_constraintContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_alter_table_add_constraint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1640);
			match(K_ADD);
			setState(1641);
			match(K_CONSTRAINT);
			setState(1642);
			any_name();
			setState(1643);
			table_constraint();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Alter_table_addContext extends ParserRuleContext {
		public TerminalNode K_ADD() { return getToken(SQLParser.K_ADD, 0); }
		public Table_constraintContext table_constraint() {
			return getRuleContext(Table_constraintContext.class,0);
		}
		public Alter_table_addContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter_table_add; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterAlter_table_add(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitAlter_table_add(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitAlter_table_add(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Alter_table_addContext alter_table_add() throws RecognitionException {
		Alter_table_addContext _localctx = new Alter_table_addContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_alter_table_add);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1645);
			match(K_ADD);
			setState(1646);
			table_constraint();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_table_stmtContext extends ParserRuleContext {
		public TerminalNode K_CREATE() { return getToken(SQLParser.K_CREATE, 0); }
		public TerminalNode K_TABLE() { return getToken(SQLParser.K_TABLE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode K_TYPE() { return getToken(SQLParser.K_TYPE, 0); }
		public TerminalNode K_PATH() { return getToken(SQLParser.K_PATH, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public List<Column_defContext> column_def() {
			return getRuleContexts(Column_defContext.class);
		}
		public Column_defContext column_def(int i) {
			return getRuleContext(Column_defContext.class,i);
		}
		public List<Create_type_valueContext> create_type_value() {
			return getRuleContexts(Create_type_valueContext.class);
		}
		public Create_type_valueContext create_type_value(int i) {
			return getRuleContext(Create_type_valueContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public Csv_sContext csv_s() {
			return getRuleContext(Csv_sContext.class,0);
		}
		public Json_sContext json_s() {
			return getRuleContext(Json_sContext.class,0);
		}
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public TerminalNode K_IF() { return getToken(SQLParser.K_IF, 0); }
		public TerminalNode K_NOT() { return getToken(SQLParser.K_NOT, 0); }
		public TerminalNode K_EXISTS() { return getToken(SQLParser.K_EXISTS, 0); }
		public List<TerminalNode> ASSIGN() { return getTokens(SQLParser.ASSIGN); }
		public TerminalNode ASSIGN(int i) {
			return getToken(SQLParser.ASSIGN, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public List<Table_constraintContext> table_constraint() {
			return getRuleContexts(Table_constraintContext.class);
		}
		public Table_constraintContext table_constraint(int i) {
			return getRuleContext(Table_constraintContext.class,i);
		}
		public Create_table_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterCreate_table_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitCreate_table_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitCreate_table_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_stmtContext create_table_stmt() throws RecognitionException {
		Create_table_stmtContext _localctx = new Create_table_stmtContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_create_table_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1648);
			match(K_CREATE);
			setState(1649);
			match(K_TABLE);
			setState(1653);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,206,_ctx) ) {
			case 1:
				{
				setState(1650);
				match(K_IF);
				setState(1651);
				match(K_NOT);
				setState(1652);
				match(K_EXISTS);
				}
				break;
			}
			setState(1655);
			table_name();
			{
			setState(1656);
			match(OPEN_PAR);
			setState(1657);
			column_def();
			setState(1658);
			create_type_value();
			setState(1667);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				setState(1665);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,207,_ctx) ) {
				case 1:
					{
					setState(1659);
					match(COMMA);
					setState(1660);
					table_constraint();
					}
					break;
				case 2:
					{
					setState(1661);
					match(COMMA);
					setState(1662);
					column_def();
					setState(1663);
					create_type_value();
					}
					break;
				}
				}
				setState(1669);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1670);
			match(CLOSE_PAR);
			}
			setState(1672);
			match(K_TYPE);
			setState(1674);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(1673);
				match(ASSIGN);
				}
			}

			setState(1678);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__14:
			case T__15:
				{
				setState(1676);
				csv_s();
				}
				break;
			case T__16:
			case T__17:
				{
				setState(1677);
				json_s();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1681);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1680);
				match(COMMA);
				}
			}

			setState(1683);
			match(K_PATH);
			setState(1685);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(1684);
				match(ASSIGN);
				}
			}

			{
			setState(1687);
			any_name();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Csv_sContext extends ParserRuleContext {
		public Csv_sContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_csv_s; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterCsv_s(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitCsv_s(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitCsv_s(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Csv_sContext csv_s() throws RecognitionException {
		Csv_sContext _localctx = new Csv_sContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_csv_s);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1689);
			_la = _input.LA(1);
			if ( !(_la==T__14 || _la==T__15) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Json_sContext extends ParserRuleContext {
		public Json_sContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_json_s; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterJson_s(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitJson_s(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitJson_s(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Json_sContext json_s() throws RecognitionException {
		Json_sContext _localctx = new Json_sContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_json_s);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1691);
			_la = _input.LA(1);
			if ( !(_la==T__16 || _la==T__17) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_table_stmt1Context extends ParserRuleContext {
		public TerminalNode K_CREATE() { return getToken(SQLParser.K_CREATE, 0); }
		public TerminalNode K_TABLE() { return getToken(SQLParser.K_TABLE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public List<Column_defContext> column_def() {
			return getRuleContexts(Column_defContext.class);
		}
		public Column_defContext column_def(int i) {
			return getRuleContext(Column_defContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public TerminalNode K_AS() { return getToken(SQLParser.K_AS, 0); }
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public TerminalNode K_IF() { return getToken(SQLParser.K_IF, 0); }
		public TerminalNode K_NOT() { return getToken(SQLParser.K_NOT, 0); }
		public TerminalNode K_EXISTS() { return getToken(SQLParser.K_EXISTS, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SQLParser.DOT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public List<Table_constraintContext> table_constraint() {
			return getRuleContexts(Table_constraintContext.class);
		}
		public Table_constraintContext table_constraint(int i) {
			return getRuleContext(Table_constraintContext.class,i);
		}
		public Create_table_stmt1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_stmt1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterCreate_table_stmt1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitCreate_table_stmt1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitCreate_table_stmt1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_stmt1Context create_table_stmt1() throws RecognitionException {
		Create_table_stmt1Context _localctx = new Create_table_stmt1Context(_ctx, getState());
		enterRule(_localctx, 176, RULE_create_table_stmt1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1693);
			match(K_CREATE);
			setState(1694);
			match(K_TABLE);
			setState(1698);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,213,_ctx) ) {
			case 1:
				{
				setState(1695);
				match(K_IF);
				setState(1696);
				match(K_NOT);
				setState(1697);
				match(K_EXISTS);
				}
				break;
			}
			setState(1703);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,214,_ctx) ) {
			case 1:
				{
				setState(1700);
				database_name();
				setState(1701);
				match(DOT);
				}
				break;
			}
			setState(1705);
			table_name();
			setState(1721);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_PAR:
				{
				setState(1706);
				match(OPEN_PAR);
				setState(1707);
				column_def();
				setState(1714);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					setState(1712);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,215,_ctx) ) {
					case 1:
						{
						setState(1708);
						match(COMMA);
						setState(1709);
						table_constraint();
						}
						break;
					case 2:
						{
						setState(1710);
						match(COMMA);
						setState(1711);
						column_def();
						}
						break;
					}
					}
					setState(1716);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1717);
				match(CLOSE_PAR);
				}
				break;
			case K_AS:
				{
				setState(1719);
				match(K_AS);
				setState(1720);
				select_stmt();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_tayp_stmt1Context extends ParserRuleContext {
		public TerminalNode K_CREATE() { return getToken(SQLParser.K_CREATE, 0); }
		public TerminalNode K_TABLE() { return getToken(SQLParser.K_TABLE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode K_TYPE() { return getToken(SQLParser.K_TYPE, 0); }
		public List<TerminalNode> ASSIGN() { return getTokens(SQLParser.ASSIGN); }
		public TerminalNode ASSIGN(int i) {
			return getToken(SQLParser.ASSIGN, i);
		}
		public TerminalNode K_PATH() { return getToken(SQLParser.K_PATH, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public List<Column_defContext> column_def() {
			return getRuleContexts(Column_defContext.class);
		}
		public Column_defContext column_def(int i) {
			return getRuleContext(Column_defContext.class,i);
		}
		public List<Create_type_valueContext> create_type_value() {
			return getRuleContexts(Create_type_valueContext.class);
		}
		public Create_type_valueContext create_type_value(int i) {
			return getRuleContext(Create_type_valueContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public Any_name_without_keywordContext any_name_without_keyword() {
			return getRuleContext(Any_name_without_keywordContext.class,0);
		}
		public TerminalNode K_IF() { return getToken(SQLParser.K_IF, 0); }
		public TerminalNode K_NOT() { return getToken(SQLParser.K_NOT, 0); }
		public TerminalNode K_EXISTS() { return getToken(SQLParser.K_EXISTS, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public List<Table_constraintContext> table_constraint() {
			return getRuleContexts(Table_constraintContext.class);
		}
		public Table_constraintContext table_constraint(int i) {
			return getRuleContext(Table_constraintContext.class,i);
		}
		public Create_tayp_stmt1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_tayp_stmt1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterCreate_tayp_stmt1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitCreate_tayp_stmt1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitCreate_tayp_stmt1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_tayp_stmt1Context create_tayp_stmt1() throws RecognitionException {
		Create_tayp_stmt1Context _localctx = new Create_tayp_stmt1Context(_ctx, getState());
		enterRule(_localctx, 178, RULE_create_tayp_stmt1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1723);
			match(K_CREATE);
			setState(1724);
			match(K_TABLE);
			setState(1728);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,218,_ctx) ) {
			case 1:
				{
				setState(1725);
				match(K_IF);
				setState(1726);
				match(K_NOT);
				setState(1727);
				match(K_EXISTS);
				}
				break;
			}
			setState(1730);
			table_name();
			{
			setState(1731);
			match(OPEN_PAR);
			setState(1732);
			column_def();
			setState(1733);
			create_type_value();
			setState(1742);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				setState(1740);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,219,_ctx) ) {
				case 1:
					{
					setState(1734);
					match(COMMA);
					setState(1735);
					table_constraint();
					}
					break;
				case 2:
					{
					setState(1736);
					match(COMMA);
					setState(1737);
					column_def();
					setState(1738);
					create_type_value();
					}
					break;
				}
				}
				setState(1744);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1745);
			match(CLOSE_PAR);
			}
			setState(1747);
			match(K_TYPE);
			setState(1748);
			match(ASSIGN);
			setState(1749);
			_la = _input.LA(1);
			if ( !(_la==T__0 || _la==T__1) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1750);
			match(K_PATH);
			setState(1751);
			match(ASSIGN);
			{
			setState(1752);
			any_name_without_keyword();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Delete_stmtContext extends ParserRuleContext {
		public TerminalNode K_DELETE() { return getToken(SQLParser.K_DELETE, 0); }
		public TerminalNode K_FROM() { return getToken(SQLParser.K_FROM, 0); }
		public Qualified_table_nameContext qualified_table_name() {
			return getRuleContext(Qualified_table_nameContext.class,0);
		}
		public TerminalNode K_WHERE() { return getToken(SQLParser.K_WHERE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Delete_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delete_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterDelete_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitDelete_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitDelete_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Delete_stmtContext delete_stmt() throws RecognitionException {
		Delete_stmtContext _localctx = new Delete_stmtContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_delete_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1754);
			match(K_DELETE);
			setState(1755);
			match(K_FROM);
			setState(1756);
			qualified_table_name();
			setState(1759);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(1757);
				match(K_WHERE);
				setState(1758);
				expr(0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Drop_table_stmtContext extends ParserRuleContext {
		public TerminalNode K_DROP() { return getToken(SQLParser.K_DROP, 0); }
		public TerminalNode K_TABLE() { return getToken(SQLParser.K_TABLE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode K_IF() { return getToken(SQLParser.K_IF, 0); }
		public TerminalNode K_EXISTS() { return getToken(SQLParser.K_EXISTS, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SQLParser.DOT, 0); }
		public Drop_table_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_table_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterDrop_table_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitDrop_table_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitDrop_table_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Drop_table_stmtContext drop_table_stmt() throws RecognitionException {
		Drop_table_stmtContext _localctx = new Drop_table_stmtContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_drop_table_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1761);
			match(K_DROP);
			setState(1762);
			match(K_TABLE);
			setState(1765);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,222,_ctx) ) {
			case 1:
				{
				setState(1763);
				match(K_IF);
				setState(1764);
				match(K_EXISTS);
				}
				break;
			}
			setState(1770);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,223,_ctx) ) {
			case 1:
				{
				setState(1767);
				database_name();
				setState(1768);
				match(DOT);
				}
				break;
			}
			setState(1772);
			table_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Insert_stmtContext extends ParserRuleContext {
		public TerminalNode K_INSERT() { return getToken(SQLParser.K_INSERT, 0); }
		public TerminalNode K_INTO() { return getToken(SQLParser.K_INTO, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode K_VALUES() { return getToken(SQLParser.K_VALUES, 0); }
		public List<TerminalNode> OPEN_PAR() { return getTokens(SQLParser.OPEN_PAR); }
		public TerminalNode OPEN_PAR(int i) {
			return getToken(SQLParser.OPEN_PAR, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> CLOSE_PAR() { return getTokens(SQLParser.CLOSE_PAR); }
		public TerminalNode CLOSE_PAR(int i) {
			return getToken(SQLParser.CLOSE_PAR, i);
		}
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public TerminalNode K_DEFAULT() { return getToken(SQLParser.K_DEFAULT, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SQLParser.DOT, 0); }
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public Insert_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insert_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterInsert_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitInsert_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitInsert_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Insert_stmtContext insert_stmt() throws RecognitionException {
		Insert_stmtContext _localctx = new Insert_stmtContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_insert_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1774);
			match(K_INSERT);
			setState(1775);
			match(K_INTO);
			setState(1779);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,224,_ctx) ) {
			case 1:
				{
				setState(1776);
				database_name();
				setState(1777);
				match(DOT);
				}
				break;
			}
			setState(1781);
			table_name();
			setState(1793);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(1782);
				match(OPEN_PAR);
				setState(1783);
				column_name();
				setState(1788);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1784);
					match(COMMA);
					setState(1785);
					column_name();
					}
					}
					setState(1790);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1791);
				match(CLOSE_PAR);
				}
			}

			setState(1826);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,230,_ctx) ) {
			case 1:
				{
				setState(1795);
				match(K_VALUES);
				setState(1796);
				match(OPEN_PAR);
				setState(1797);
				expr(0);
				setState(1802);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1798);
					match(COMMA);
					setState(1799);
					expr(0);
					}
					}
					setState(1804);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1805);
				match(CLOSE_PAR);
				setState(1820);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1806);
					match(COMMA);
					setState(1807);
					match(OPEN_PAR);
					setState(1808);
					expr(0);
					setState(1813);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1809);
						match(COMMA);
						setState(1810);
						expr(0);
						}
						}
						setState(1815);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1816);
					match(CLOSE_PAR);
					}
					}
					setState(1822);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				{
				setState(1823);
				select_stmt();
				}
				break;
			case 3:
				{
				setState(1824);
				match(K_DEFAULT);
				setState(1825);
				match(K_VALUES);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Factored_select_stmtContext extends ParserRuleContext {
		public Select_or_valuesContext select_or_values() {
			return getRuleContext(Select_or_valuesContext.class,0);
		}
		public TerminalNode K_ORDER() { return getToken(SQLParser.K_ORDER, 0); }
		public TerminalNode K_BY() { return getToken(SQLParser.K_BY, 0); }
		public List<Ordering_termContext> ordering_term() {
			return getRuleContexts(Ordering_termContext.class);
		}
		public Ordering_termContext ordering_term(int i) {
			return getRuleContext(Ordering_termContext.class,i);
		}
		public TerminalNode K_LIMIT() { return getToken(SQLParser.K_LIMIT, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public TerminalNode K_OFFSET() { return getToken(SQLParser.K_OFFSET, 0); }
		public Factored_select_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factored_select_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterFactored_select_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitFactored_select_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitFactored_select_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Factored_select_stmtContext factored_select_stmt() throws RecognitionException {
		Factored_select_stmtContext _localctx = new Factored_select_stmtContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_factored_select_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1828);
			select_or_values();
			setState(1839);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ORDER) {
				{
				setState(1829);
				match(K_ORDER);
				setState(1830);
				match(K_BY);
				setState(1831);
				ordering_term();
				setState(1836);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1832);
					match(COMMA);
					setState(1833);
					ordering_term();
					}
					}
					setState(1838);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1847);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_LIMIT) {
				{
				setState(1841);
				match(K_LIMIT);
				setState(1842);
				expr(0);
				setState(1845);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA || _la==K_OFFSET) {
					{
					setState(1843);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(1844);
					expr(0);
					}
				}

				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Select_stmtContext extends ParserRuleContext {
		public Select_or_valuesContext select_or_values() {
			return getRuleContext(Select_or_valuesContext.class,0);
		}
		public TerminalNode K_ORDER() { return getToken(SQLParser.K_ORDER, 0); }
		public TerminalNode K_BY() { return getToken(SQLParser.K_BY, 0); }
		public List<Ordering_termContext> ordering_term() {
			return getRuleContexts(Ordering_termContext.class);
		}
		public Ordering_termContext ordering_term(int i) {
			return getRuleContext(Ordering_termContext.class,i);
		}
		public TerminalNode K_LIMIT() { return getToken(SQLParser.K_LIMIT, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public TerminalNode K_OFFSET() { return getToken(SQLParser.K_OFFSET, 0); }
		public Select_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterSelect_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitSelect_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitSelect_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_stmtContext select_stmt() throws RecognitionException {
		Select_stmtContext _localctx = new Select_stmtContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_select_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1849);
			select_or_values();
			setState(1860);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ORDER) {
				{
				setState(1850);
				match(K_ORDER);
				setState(1851);
				match(K_BY);
				setState(1852);
				ordering_term();
				setState(1857);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1853);
					match(COMMA);
					setState(1854);
					ordering_term();
					}
					}
					setState(1859);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1868);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_LIMIT) {
				{
				setState(1862);
				match(K_LIMIT);
				setState(1863);
				expr(0);
				setState(1866);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA || _la==K_OFFSET) {
					{
					setState(1864);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(1865);
					expr(0);
					}
				}

				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Select_or_valuesContext extends ParserRuleContext {
		public TerminalNode K_SELECT() { return getToken(SQLParser.K_SELECT, 0); }
		public List<Result_columnContext> result_column() {
			return getRuleContexts(Result_columnContext.class);
		}
		public Result_columnContext result_column(int i) {
			return getRuleContext(Result_columnContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public TerminalNode K_FROM() { return getToken(SQLParser.K_FROM, 0); }
		public TerminalNode K_WHERE() { return getToken(SQLParser.K_WHERE, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode K_GROUP() { return getToken(SQLParser.K_GROUP, 0); }
		public TerminalNode K_BY() { return getToken(SQLParser.K_BY, 0); }
		public TerminalNode K_DISTINCT() { return getToken(SQLParser.K_DISTINCT, 0); }
		public TerminalNode K_ALL() { return getToken(SQLParser.K_ALL, 0); }
		public List<Table_or_subqueryContext> table_or_subquery() {
			return getRuleContexts(Table_or_subqueryContext.class);
		}
		public Table_or_subqueryContext table_or_subquery(int i) {
			return getRuleContext(Table_or_subqueryContext.class,i);
		}
		public Join_clauseContext join_clause() {
			return getRuleContext(Join_clauseContext.class,0);
		}
		public TerminalNode K_HAVING() { return getToken(SQLParser.K_HAVING, 0); }
		public TerminalNode K_VALUES() { return getToken(SQLParser.K_VALUES, 0); }
		public List<TerminalNode> OPEN_PAR() { return getTokens(SQLParser.OPEN_PAR); }
		public TerminalNode OPEN_PAR(int i) {
			return getToken(SQLParser.OPEN_PAR, i);
		}
		public List<TerminalNode> CLOSE_PAR() { return getTokens(SQLParser.CLOSE_PAR); }
		public TerminalNode CLOSE_PAR(int i) {
			return getToken(SQLParser.CLOSE_PAR, i);
		}
		public Select_or_valuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_or_values; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterSelect_or_values(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitSelect_or_values(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitSelect_or_values(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_or_valuesContext select_or_values() throws RecognitionException {
		Select_or_valuesContext _localctx = new Select_or_valuesContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_select_or_values);
		int _la;
		try {
			setState(1944);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_SELECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1870);
				match(K_SELECT);
				setState(1872);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,239,_ctx) ) {
				case 1:
					{
					setState(1871);
					_la = _input.LA(1);
					if ( !(_la==K_ALL || _la==K_DISTINCT) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				}
				setState(1874);
				result_column();
				setState(1879);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1875);
					match(COMMA);
					setState(1876);
					result_column();
					}
					}
					setState(1881);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1894);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_FROM) {
					{
					setState(1882);
					match(K_FROM);
					setState(1892);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,242,_ctx) ) {
					case 1:
						{
						setState(1883);
						table_or_subquery();
						setState(1888);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==COMMA) {
							{
							{
							setState(1884);
							match(COMMA);
							setState(1885);
							table_or_subquery();
							}
							}
							setState(1890);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
						break;
					case 2:
						{
						setState(1891);
						join_clause();
						}
						break;
					}
					}
				}

				setState(1898);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_WHERE) {
					{
					setState(1896);
					match(K_WHERE);
					setState(1897);
					expr(0);
					}
				}

				setState(1914);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_GROUP) {
					{
					setState(1900);
					match(K_GROUP);
					setState(1901);
					match(K_BY);
					setState(1902);
					expr(0);
					setState(1907);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1903);
						match(COMMA);
						setState(1904);
						expr(0);
						}
						}
						setState(1909);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1912);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_HAVING) {
						{
						setState(1910);
						match(K_HAVING);
						setState(1911);
						expr(0);
						}
					}

					}
				}

				}
				break;
			case K_VALUES:
				enterOuterAlt(_localctx, 2);
				{
				setState(1916);
				match(K_VALUES);
				setState(1917);
				match(OPEN_PAR);
				setState(1918);
				expr(0);
				setState(1923);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1919);
					match(COMMA);
					setState(1920);
					expr(0);
					}
					}
					setState(1925);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1926);
				match(CLOSE_PAR);
				setState(1941);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1927);
					match(COMMA);
					setState(1928);
					match(OPEN_PAR);
					setState(1929);
					expr(0);
					setState(1934);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1930);
						match(COMMA);
						setState(1931);
						expr(0);
						}
						}
						setState(1936);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1937);
					match(CLOSE_PAR);
					}
					}
					setState(1943);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Update_stmtContext extends ParserRuleContext {
		public TerminalNode K_UPDATE() { return getToken(SQLParser.K_UPDATE, 0); }
		public Qualified_table_nameContext qualified_table_name() {
			return getRuleContext(Qualified_table_nameContext.class,0);
		}
		public TerminalNode K_SET() { return getToken(SQLParser.K_SET, 0); }
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public List<TerminalNode> ASSIGN() { return getTokens(SQLParser.ASSIGN); }
		public TerminalNode ASSIGN(int i) {
			return getToken(SQLParser.ASSIGN, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public TerminalNode K_WHERE() { return getToken(SQLParser.K_WHERE, 0); }
		public Update_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_update_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterUpdate_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitUpdate_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitUpdate_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Update_stmtContext update_stmt() throws RecognitionException {
		Update_stmtContext _localctx = new Update_stmtContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_update_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1946);
			match(K_UPDATE);
			setState(1947);
			qualified_table_name();
			setState(1948);
			match(K_SET);
			setState(1949);
			column_name();
			setState(1950);
			match(ASSIGN);
			setState(1951);
			expr(0);
			setState(1959);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1952);
				match(COMMA);
				setState(1953);
				column_name();
				setState(1954);
				match(ASSIGN);
				setState(1955);
				expr(0);
				}
				}
				setState(1961);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1964);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(1962);
				match(K_WHERE);
				setState(1963);
				expr(0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_defContext extends ParserRuleContext {
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public List<Column_constraintContext> column_constraint() {
			return getRuleContexts(Column_constraintContext.class);
		}
		public Column_constraintContext column_constraint(int i) {
			return getRuleContext(Column_constraintContext.class,i);
		}
		public List<Type_nameContext> type_name() {
			return getRuleContexts(Type_nameContext.class);
		}
		public Type_nameContext type_name(int i) {
			return getRuleContext(Type_nameContext.class,i);
		}
		public Column_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterColumn_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitColumn_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitColumn_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_defContext column_def() throws RecognitionException {
		Column_defContext _localctx = new Column_defContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_column_def);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1966);
			column_name();
			setState(1971);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,255,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(1969);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,254,_ctx) ) {
					case 1:
						{
						setState(1967);
						column_constraint();
						}
						break;
					case 2:
						{
						setState(1968);
						type_name();
						}
						break;
					}
					} 
				}
				setState(1973);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,255,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Type_nameContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public List<Signed_numberContext> signed_number() {
			return getRuleContexts(Signed_numberContext.class);
		}
		public Signed_numberContext signed_number(int i) {
			return getRuleContext(Signed_numberContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public TerminalNode COMMA() { return getToken(SQLParser.COMMA, 0); }
		public List<Any_nameContext> any_name() {
			return getRuleContexts(Any_nameContext.class);
		}
		public Any_nameContext any_name(int i) {
			return getRuleContext(Any_nameContext.class,i);
		}
		public Type_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterType_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitType_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitType_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_nameContext type_name() throws RecognitionException {
		Type_nameContext _localctx = new Type_nameContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_type_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1974);
			name();
			setState(1994);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,259,_ctx) ) {
			case 1:
				{
				setState(1975);
				match(OPEN_PAR);
				setState(1976);
				signed_number();
				setState(1978);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 22)) & ~0x3f) == 0 && ((1L << (_la - 22)) & ((1L << (OPEN_PAR - 22)) | (1L << (K_ABORT - 22)) | (1L << (K_ACTION - 22)) | (1L << (K_ADD - 22)) | (1L << (K_AFTER - 22)) | (1L << (K_ALL - 22)) | (1L << (K_ALTER - 22)) | (1L << (K_ANALYZE - 22)) | (1L << (K_AND - 22)) | (1L << (K_AS - 22)) | (1L << (K_ASC - 22)) | (1L << (K_ATTACH - 22)) | (1L << (K_AUTOINCREMENT - 22)) | (1L << (K_BEFORE - 22)) | (1L << (K_BEGIN - 22)) | (1L << (K_BETWEEN - 22)) | (1L << (K_BY - 22)) | (1L << (K_CASCADE - 22)) | (1L << (K_CASE - 22)) | (1L << (K_CAST - 22)) | (1L << (K_CHECK - 22)) | (1L << (K_COLLATE - 22)) | (1L << (K_COLUMN - 22)) | (1L << (K_COMMIT - 22)) | (1L << (K_CONFLICT - 22)) | (1L << (K_CONSTRAINT - 22)) | (1L << (K_CREATE - 22)) | (1L << (K_CROSS - 22)) | (1L << (K_CURRENT_DATE - 22)) | (1L << (K_CURRENT_TIME - 22)) | (1L << (K_CURRENT_TIMESTAMP - 22)) | (1L << (K_DATABASE - 22)) | (1L << (K_DEFAULT - 22)) | (1L << (K_DEFERRABLE - 22)) | (1L << (K_DEFERRED - 22)) | (1L << (K_DELETE - 22)) | (1L << (K_DESC - 22)) | (1L << (K_DETACH - 22)))) != 0) || ((((_la - 86)) & ~0x3f) == 0 && ((1L << (_la - 86)) & ((1L << (K_DISTINCT - 86)) | (1L << (K_DROP - 86)) | (1L << (K_EACH - 86)) | (1L << (K_ELSE - 86)) | (1L << (K_END - 86)) | (1L << (K_ENABLE - 86)) | (1L << (K_ESCAPE - 86)) | (1L << (K_EXCEPT - 86)) | (1L << (K_EXCLUSIVE - 86)) | (1L << (K_EXISTS - 86)) | (1L << (K_EXPLAIN - 86)) | (1L << (K_FAIL - 86)) | (1L << (K_FOR - 86)) | (1L << (K_FOREIGN - 86)) | (1L << (K_FROM - 86)) | (1L << (K_FULL - 86)) | (1L << (K_GLOB - 86)) | (1L << (K_GROUP - 86)) | (1L << (K_HAVING - 86)) | (1L << (K_IF - 86)) | (1L << (K_IGNORE - 86)) | (1L << (K_IMMEDIATE - 86)) | (1L << (K_IN - 86)) | (1L << (K_INDEX - 86)) | (1L << (K_INDEXED - 86)) | (1L << (K_INITIALLY - 86)) | (1L << (K_INNER - 86)) | (1L << (K_INSERT - 86)) | (1L << (K_INSTEAD - 86)) | (1L << (K_INTERSECT - 86)) | (1L << (K_INTO - 86)) | (1L << (K_IS - 86)) | (1L << (K_ISNULL - 86)) | (1L << (K_JOIN - 86)) | (1L << (K_KEY - 86)) | (1L << (K_LEFT - 86)) | (1L << (K_LIKE - 86)) | (1L << (K_LIMIT - 86)) | (1L << (K_MATCH - 86)) | (1L << (K_NATURAL - 86)) | (1L << (K_NEXTVAL - 86)) | (1L << (K_NO - 86)) | (1L << (K_NOT - 86)) | (1L << (K_NOTNULL - 86)) | (1L << (K_NULL - 86)) | (1L << (K_OF - 86)) | (1L << (K_OFFSET - 86)) | (1L << (K_ON - 86)) | (1L << (K_OR - 86)) | (1L << (K_ORDER - 86)) | (1L << (K_OUTER - 86)) | (1L << (K_PLAN - 86)) | (1L << (K_PRAGMA - 86)) | (1L << (K_PRIMARY - 86)) | (1L << (K_QUERY - 86)) | (1L << (K_RAISE - 86)) | (1L << (K_RECURSIVE - 86)) | (1L << (K_REFERENCES - 86)) | (1L << (K_REGEXP - 86)) | (1L << (K_REINDEX - 86)) | (1L << (K_RELEASE - 86)) | (1L << (K_RENAME - 86)) | (1L << (K_REPLACE - 86)))) != 0) || ((((_la - 150)) & ~0x3f) == 0 && ((1L << (_la - 150)) & ((1L << (K_RESTRICT - 150)) | (1L << (K_RIGHT - 150)) | (1L << (K_ROLLBACK - 150)) | (1L << (K_ROW - 150)) | (1L << (K_SAVEPOINT - 150)) | (1L << (K_SELECT - 150)) | (1L << (K_SET - 150)) | (1L << (K_TABLE - 150)) | (1L << (K_TEMP - 150)) | (1L << (K_TEMPORARY - 150)) | (1L << (K_THEN - 150)) | (1L << (K_TO - 150)) | (1L << (K_TRANSACTION - 150)) | (1L << (K_TRIGGER - 150)) | (1L << (K_UNION - 150)) | (1L << (K_UNIQUE - 150)) | (1L << (K_UPDATE - 150)) | (1L << (K_USING - 150)) | (1L << (K_VACUUM - 150)) | (1L << (K_VALUES - 150)) | (1L << (K_VIEW - 150)) | (1L << (K_VIRTUAL - 150)) | (1L << (K_WHEN - 150)) | (1L << (K_WHERE - 150)) | (1L << (K_WITH - 150)) | (1L << (K_WITHOUT - 150)) | (1L << (K_RETURN - 150)) | (1L << (K_WHILE - 150)) | (1L << (K_SWITCH - 150)) | (1L << (K_BREAK - 150)) | (1L << (K_DO - 150)) | (1L << (K_FUNCTION - 150)) | (1L << (IDENTIFIER - 150)) | (1L << (STRING_LITERAL - 150)))) != 0)) {
					{
					setState(1977);
					any_name();
					}
				}

				setState(1980);
				match(CLOSE_PAR);
				}
				break;
			case 2:
				{
				setState(1982);
				match(OPEN_PAR);
				setState(1983);
				signed_number();
				setState(1985);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 22)) & ~0x3f) == 0 && ((1L << (_la - 22)) & ((1L << (OPEN_PAR - 22)) | (1L << (K_ABORT - 22)) | (1L << (K_ACTION - 22)) | (1L << (K_ADD - 22)) | (1L << (K_AFTER - 22)) | (1L << (K_ALL - 22)) | (1L << (K_ALTER - 22)) | (1L << (K_ANALYZE - 22)) | (1L << (K_AND - 22)) | (1L << (K_AS - 22)) | (1L << (K_ASC - 22)) | (1L << (K_ATTACH - 22)) | (1L << (K_AUTOINCREMENT - 22)) | (1L << (K_BEFORE - 22)) | (1L << (K_BEGIN - 22)) | (1L << (K_BETWEEN - 22)) | (1L << (K_BY - 22)) | (1L << (K_CASCADE - 22)) | (1L << (K_CASE - 22)) | (1L << (K_CAST - 22)) | (1L << (K_CHECK - 22)) | (1L << (K_COLLATE - 22)) | (1L << (K_COLUMN - 22)) | (1L << (K_COMMIT - 22)) | (1L << (K_CONFLICT - 22)) | (1L << (K_CONSTRAINT - 22)) | (1L << (K_CREATE - 22)) | (1L << (K_CROSS - 22)) | (1L << (K_CURRENT_DATE - 22)) | (1L << (K_CURRENT_TIME - 22)) | (1L << (K_CURRENT_TIMESTAMP - 22)) | (1L << (K_DATABASE - 22)) | (1L << (K_DEFAULT - 22)) | (1L << (K_DEFERRABLE - 22)) | (1L << (K_DEFERRED - 22)) | (1L << (K_DELETE - 22)) | (1L << (K_DESC - 22)) | (1L << (K_DETACH - 22)))) != 0) || ((((_la - 86)) & ~0x3f) == 0 && ((1L << (_la - 86)) & ((1L << (K_DISTINCT - 86)) | (1L << (K_DROP - 86)) | (1L << (K_EACH - 86)) | (1L << (K_ELSE - 86)) | (1L << (K_END - 86)) | (1L << (K_ENABLE - 86)) | (1L << (K_ESCAPE - 86)) | (1L << (K_EXCEPT - 86)) | (1L << (K_EXCLUSIVE - 86)) | (1L << (K_EXISTS - 86)) | (1L << (K_EXPLAIN - 86)) | (1L << (K_FAIL - 86)) | (1L << (K_FOR - 86)) | (1L << (K_FOREIGN - 86)) | (1L << (K_FROM - 86)) | (1L << (K_FULL - 86)) | (1L << (K_GLOB - 86)) | (1L << (K_GROUP - 86)) | (1L << (K_HAVING - 86)) | (1L << (K_IF - 86)) | (1L << (K_IGNORE - 86)) | (1L << (K_IMMEDIATE - 86)) | (1L << (K_IN - 86)) | (1L << (K_INDEX - 86)) | (1L << (K_INDEXED - 86)) | (1L << (K_INITIALLY - 86)) | (1L << (K_INNER - 86)) | (1L << (K_INSERT - 86)) | (1L << (K_INSTEAD - 86)) | (1L << (K_INTERSECT - 86)) | (1L << (K_INTO - 86)) | (1L << (K_IS - 86)) | (1L << (K_ISNULL - 86)) | (1L << (K_JOIN - 86)) | (1L << (K_KEY - 86)) | (1L << (K_LEFT - 86)) | (1L << (K_LIKE - 86)) | (1L << (K_LIMIT - 86)) | (1L << (K_MATCH - 86)) | (1L << (K_NATURAL - 86)) | (1L << (K_NEXTVAL - 86)) | (1L << (K_NO - 86)) | (1L << (K_NOT - 86)) | (1L << (K_NOTNULL - 86)) | (1L << (K_NULL - 86)) | (1L << (K_OF - 86)) | (1L << (K_OFFSET - 86)) | (1L << (K_ON - 86)) | (1L << (K_OR - 86)) | (1L << (K_ORDER - 86)) | (1L << (K_OUTER - 86)) | (1L << (K_PLAN - 86)) | (1L << (K_PRAGMA - 86)) | (1L << (K_PRIMARY - 86)) | (1L << (K_QUERY - 86)) | (1L << (K_RAISE - 86)) | (1L << (K_RECURSIVE - 86)) | (1L << (K_REFERENCES - 86)) | (1L << (K_REGEXP - 86)) | (1L << (K_REINDEX - 86)) | (1L << (K_RELEASE - 86)) | (1L << (K_RENAME - 86)) | (1L << (K_REPLACE - 86)))) != 0) || ((((_la - 150)) & ~0x3f) == 0 && ((1L << (_la - 150)) & ((1L << (K_RESTRICT - 150)) | (1L << (K_RIGHT - 150)) | (1L << (K_ROLLBACK - 150)) | (1L << (K_ROW - 150)) | (1L << (K_SAVEPOINT - 150)) | (1L << (K_SELECT - 150)) | (1L << (K_SET - 150)) | (1L << (K_TABLE - 150)) | (1L << (K_TEMP - 150)) | (1L << (K_TEMPORARY - 150)) | (1L << (K_THEN - 150)) | (1L << (K_TO - 150)) | (1L << (K_TRANSACTION - 150)) | (1L << (K_TRIGGER - 150)) | (1L << (K_UNION - 150)) | (1L << (K_UNIQUE - 150)) | (1L << (K_UPDATE - 150)) | (1L << (K_USING - 150)) | (1L << (K_VACUUM - 150)) | (1L << (K_VALUES - 150)) | (1L << (K_VIEW - 150)) | (1L << (K_VIRTUAL - 150)) | (1L << (K_WHEN - 150)) | (1L << (K_WHERE - 150)) | (1L << (K_WITH - 150)) | (1L << (K_WITHOUT - 150)) | (1L << (K_RETURN - 150)) | (1L << (K_WHILE - 150)) | (1L << (K_SWITCH - 150)) | (1L << (K_BREAK - 150)) | (1L << (K_DO - 150)) | (1L << (K_FUNCTION - 150)) | (1L << (IDENTIFIER - 150)) | (1L << (STRING_LITERAL - 150)))) != 0)) {
					{
					setState(1984);
					any_name();
					}
				}

				setState(1987);
				match(COMMA);
				setState(1988);
				signed_number();
				setState(1990);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 22)) & ~0x3f) == 0 && ((1L << (_la - 22)) & ((1L << (OPEN_PAR - 22)) | (1L << (K_ABORT - 22)) | (1L << (K_ACTION - 22)) | (1L << (K_ADD - 22)) | (1L << (K_AFTER - 22)) | (1L << (K_ALL - 22)) | (1L << (K_ALTER - 22)) | (1L << (K_ANALYZE - 22)) | (1L << (K_AND - 22)) | (1L << (K_AS - 22)) | (1L << (K_ASC - 22)) | (1L << (K_ATTACH - 22)) | (1L << (K_AUTOINCREMENT - 22)) | (1L << (K_BEFORE - 22)) | (1L << (K_BEGIN - 22)) | (1L << (K_BETWEEN - 22)) | (1L << (K_BY - 22)) | (1L << (K_CASCADE - 22)) | (1L << (K_CASE - 22)) | (1L << (K_CAST - 22)) | (1L << (K_CHECK - 22)) | (1L << (K_COLLATE - 22)) | (1L << (K_COLUMN - 22)) | (1L << (K_COMMIT - 22)) | (1L << (K_CONFLICT - 22)) | (1L << (K_CONSTRAINT - 22)) | (1L << (K_CREATE - 22)) | (1L << (K_CROSS - 22)) | (1L << (K_CURRENT_DATE - 22)) | (1L << (K_CURRENT_TIME - 22)) | (1L << (K_CURRENT_TIMESTAMP - 22)) | (1L << (K_DATABASE - 22)) | (1L << (K_DEFAULT - 22)) | (1L << (K_DEFERRABLE - 22)) | (1L << (K_DEFERRED - 22)) | (1L << (K_DELETE - 22)) | (1L << (K_DESC - 22)) | (1L << (K_DETACH - 22)))) != 0) || ((((_la - 86)) & ~0x3f) == 0 && ((1L << (_la - 86)) & ((1L << (K_DISTINCT - 86)) | (1L << (K_DROP - 86)) | (1L << (K_EACH - 86)) | (1L << (K_ELSE - 86)) | (1L << (K_END - 86)) | (1L << (K_ENABLE - 86)) | (1L << (K_ESCAPE - 86)) | (1L << (K_EXCEPT - 86)) | (1L << (K_EXCLUSIVE - 86)) | (1L << (K_EXISTS - 86)) | (1L << (K_EXPLAIN - 86)) | (1L << (K_FAIL - 86)) | (1L << (K_FOR - 86)) | (1L << (K_FOREIGN - 86)) | (1L << (K_FROM - 86)) | (1L << (K_FULL - 86)) | (1L << (K_GLOB - 86)) | (1L << (K_GROUP - 86)) | (1L << (K_HAVING - 86)) | (1L << (K_IF - 86)) | (1L << (K_IGNORE - 86)) | (1L << (K_IMMEDIATE - 86)) | (1L << (K_IN - 86)) | (1L << (K_INDEX - 86)) | (1L << (K_INDEXED - 86)) | (1L << (K_INITIALLY - 86)) | (1L << (K_INNER - 86)) | (1L << (K_INSERT - 86)) | (1L << (K_INSTEAD - 86)) | (1L << (K_INTERSECT - 86)) | (1L << (K_INTO - 86)) | (1L << (K_IS - 86)) | (1L << (K_ISNULL - 86)) | (1L << (K_JOIN - 86)) | (1L << (K_KEY - 86)) | (1L << (K_LEFT - 86)) | (1L << (K_LIKE - 86)) | (1L << (K_LIMIT - 86)) | (1L << (K_MATCH - 86)) | (1L << (K_NATURAL - 86)) | (1L << (K_NEXTVAL - 86)) | (1L << (K_NO - 86)) | (1L << (K_NOT - 86)) | (1L << (K_NOTNULL - 86)) | (1L << (K_NULL - 86)) | (1L << (K_OF - 86)) | (1L << (K_OFFSET - 86)) | (1L << (K_ON - 86)) | (1L << (K_OR - 86)) | (1L << (K_ORDER - 86)) | (1L << (K_OUTER - 86)) | (1L << (K_PLAN - 86)) | (1L << (K_PRAGMA - 86)) | (1L << (K_PRIMARY - 86)) | (1L << (K_QUERY - 86)) | (1L << (K_RAISE - 86)) | (1L << (K_RECURSIVE - 86)) | (1L << (K_REFERENCES - 86)) | (1L << (K_REGEXP - 86)) | (1L << (K_REINDEX - 86)) | (1L << (K_RELEASE - 86)) | (1L << (K_RENAME - 86)) | (1L << (K_REPLACE - 86)))) != 0) || ((((_la - 150)) & ~0x3f) == 0 && ((1L << (_la - 150)) & ((1L << (K_RESTRICT - 150)) | (1L << (K_RIGHT - 150)) | (1L << (K_ROLLBACK - 150)) | (1L << (K_ROW - 150)) | (1L << (K_SAVEPOINT - 150)) | (1L << (K_SELECT - 150)) | (1L << (K_SET - 150)) | (1L << (K_TABLE - 150)) | (1L << (K_TEMP - 150)) | (1L << (K_TEMPORARY - 150)) | (1L << (K_THEN - 150)) | (1L << (K_TO - 150)) | (1L << (K_TRANSACTION - 150)) | (1L << (K_TRIGGER - 150)) | (1L << (K_UNION - 150)) | (1L << (K_UNIQUE - 150)) | (1L << (K_UPDATE - 150)) | (1L << (K_USING - 150)) | (1L << (K_VACUUM - 150)) | (1L << (K_VALUES - 150)) | (1L << (K_VIEW - 150)) | (1L << (K_VIRTUAL - 150)) | (1L << (K_WHEN - 150)) | (1L << (K_WHERE - 150)) | (1L << (K_WITH - 150)) | (1L << (K_WITHOUT - 150)) | (1L << (K_RETURN - 150)) | (1L << (K_WHILE - 150)) | (1L << (K_SWITCH - 150)) | (1L << (K_BREAK - 150)) | (1L << (K_DO - 150)) | (1L << (K_FUNCTION - 150)) | (1L << (IDENTIFIER - 150)) | (1L << (STRING_LITERAL - 150)))) != 0)) {
					{
					setState(1989);
					any_name();
					}
				}

				setState(1992);
				match(CLOSE_PAR);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_constraintContext extends ParserRuleContext {
		public Column_constraint_primary_keyContext column_constraint_primary_key() {
			return getRuleContext(Column_constraint_primary_keyContext.class,0);
		}
		public Column_constraint_foreign_keyContext column_constraint_foreign_key() {
			return getRuleContext(Column_constraint_foreign_keyContext.class,0);
		}
		public Column_constraint_not_nullContext column_constraint_not_null() {
			return getRuleContext(Column_constraint_not_nullContext.class,0);
		}
		public Column_constraint_nullContext column_constraint_null() {
			return getRuleContext(Column_constraint_nullContext.class,0);
		}
		public TerminalNode K_CHECK() { return getToken(SQLParser.K_CHECK, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public Column_defaultContext column_default() {
			return getRuleContext(Column_defaultContext.class,0);
		}
		public TerminalNode K_COLLATE() { return getToken(SQLParser.K_COLLATE, 0); }
		public Collation_nameContext collation_name() {
			return getRuleContext(Collation_nameContext.class,0);
		}
		public TerminalNode K_CONSTRAINT() { return getToken(SQLParser.K_CONSTRAINT, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Column_constraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_constraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterColumn_constraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitColumn_constraint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitColumn_constraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_constraintContext column_constraint() throws RecognitionException {
		Column_constraintContext _localctx = new Column_constraintContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_column_constraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1998);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_CONSTRAINT) {
				{
				setState(1996);
				match(K_CONSTRAINT);
				setState(1997);
				name();
				}
			}

			setState(2012);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_PRIMARY:
				{
				setState(2000);
				column_constraint_primary_key();
				}
				break;
			case K_REFERENCES:
				{
				setState(2001);
				column_constraint_foreign_key();
				}
				break;
			case K_NOT:
				{
				setState(2002);
				column_constraint_not_null();
				}
				break;
			case K_NULL:
				{
				setState(2003);
				column_constraint_null();
				}
				break;
			case K_CHECK:
				{
				setState(2004);
				match(K_CHECK);
				setState(2005);
				match(OPEN_PAR);
				setState(2006);
				expr(0);
				setState(2007);
				match(CLOSE_PAR);
				}
				break;
			case K_DEFAULT:
				{
				setState(2009);
				column_default();
				}
				break;
			case K_COLLATE:
				{
				setState(2010);
				match(K_COLLATE);
				setState(2011);
				collation_name();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_constraint_primary_keyContext extends ParserRuleContext {
		public TerminalNode K_PRIMARY() { return getToken(SQLParser.K_PRIMARY, 0); }
		public TerminalNode K_KEY() { return getToken(SQLParser.K_KEY, 0); }
		public TerminalNode K_AUTOINCREMENT() { return getToken(SQLParser.K_AUTOINCREMENT, 0); }
		public TerminalNode K_ASC() { return getToken(SQLParser.K_ASC, 0); }
		public TerminalNode K_DESC() { return getToken(SQLParser.K_DESC, 0); }
		public Column_constraint_primary_keyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_constraint_primary_key; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterColumn_constraint_primary_key(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitColumn_constraint_primary_key(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitColumn_constraint_primary_key(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_constraint_primary_keyContext column_constraint_primary_key() throws RecognitionException {
		Column_constraint_primary_keyContext _localctx = new Column_constraint_primary_keyContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_column_constraint_primary_key);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2014);
			match(K_PRIMARY);
			setState(2015);
			match(K_KEY);
			setState(2017);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,262,_ctx) ) {
			case 1:
				{
				setState(2016);
				_la = _input.LA(1);
				if ( !(_la==K_ASC || _la==K_DESC) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
			setState(2020);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,263,_ctx) ) {
			case 1:
				{
				setState(2019);
				match(K_AUTOINCREMENT);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_constraint_foreign_keyContext extends ParserRuleContext {
		public Foreign_key_clauseContext foreign_key_clause() {
			return getRuleContext(Foreign_key_clauseContext.class,0);
		}
		public Column_constraint_foreign_keyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_constraint_foreign_key; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterColumn_constraint_foreign_key(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitColumn_constraint_foreign_key(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitColumn_constraint_foreign_key(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_constraint_foreign_keyContext column_constraint_foreign_key() throws RecognitionException {
		Column_constraint_foreign_keyContext _localctx = new Column_constraint_foreign_keyContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_column_constraint_foreign_key);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2022);
			foreign_key_clause();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_constraint_not_nullContext extends ParserRuleContext {
		public TerminalNode K_NOT() { return getToken(SQLParser.K_NOT, 0); }
		public TerminalNode K_NULL() { return getToken(SQLParser.K_NULL, 0); }
		public Column_constraint_not_nullContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_constraint_not_null; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterColumn_constraint_not_null(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitColumn_constraint_not_null(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitColumn_constraint_not_null(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_constraint_not_nullContext column_constraint_not_null() throws RecognitionException {
		Column_constraint_not_nullContext _localctx = new Column_constraint_not_nullContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_column_constraint_not_null);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2024);
			match(K_NOT);
			setState(2025);
			match(K_NULL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_constraint_nullContext extends ParserRuleContext {
		public TerminalNode K_NULL() { return getToken(SQLParser.K_NULL, 0); }
		public Column_constraint_nullContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_constraint_null; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterColumn_constraint_null(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitColumn_constraint_null(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitColumn_constraint_null(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_constraint_nullContext column_constraint_null() throws RecognitionException {
		Column_constraint_nullContext _localctx = new Column_constraint_nullContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_column_constraint_null);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2027);
			match(K_NULL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_defaultContext extends ParserRuleContext {
		public TerminalNode K_DEFAULT() { return getToken(SQLParser.K_DEFAULT, 0); }
		public Column_default_valueContext column_default_value() {
			return getRuleContext(Column_default_valueContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public TerminalNode K_NEXTVAL() { return getToken(SQLParser.K_NEXTVAL, 0); }
		public List<Any_nameContext> any_name() {
			return getRuleContexts(Any_nameContext.class);
		}
		public Any_nameContext any_name(int i) {
			return getRuleContext(Any_nameContext.class,i);
		}
		public Column_defaultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_default; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterColumn_default(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitColumn_default(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitColumn_default(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_defaultContext column_default() throws RecognitionException {
		Column_defaultContext _localctx = new Column_defaultContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_column_default);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2029);
			match(K_DEFAULT);
			setState(2041);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,264,_ctx) ) {
			case 1:
				{
				setState(2030);
				column_default_value();
				}
				break;
			case 2:
				{
				setState(2031);
				match(OPEN_PAR);
				setState(2032);
				expr(0);
				setState(2033);
				match(CLOSE_PAR);
				}
				break;
			case 3:
				{
				setState(2035);
				match(K_NEXTVAL);
				setState(2036);
				match(OPEN_PAR);
				setState(2037);
				expr(0);
				setState(2038);
				match(CLOSE_PAR);
				}
				break;
			case 4:
				{
				setState(2040);
				any_name();
				}
				break;
			}
			setState(2049);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__18) {
				{
				setState(2043);
				match(T__18);
				setState(2045); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(2044);
						any_name();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(2047); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,265,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_default_valueContext extends ParserRuleContext {
		public Signed_numberContext signed_number() {
			return getRuleContext(Signed_numberContext.class,0);
		}
		public Literal_valueContext literal_value() {
			return getRuleContext(Literal_valueContext.class,0);
		}
		public Column_default_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_default_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterColumn_default_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitColumn_default_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitColumn_default_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_default_valueContext column_default_value() throws RecognitionException {
		Column_default_valueContext _localctx = new Column_default_valueContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_column_default_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2053);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,267,_ctx) ) {
			case 1:
				{
				setState(2051);
				signed_number();
				}
				break;
			case 2:
				{
				setState(2052);
				literal_value();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprwhereContext extends ParserRuleContext {
		public Var1Context var1() {
			return getRuleContext(Var1Context.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public OpeerationContext opeeration() {
			return getRuleContext(OpeerationContext.class,0);
		}
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public List<TerminalNode> DOT() { return getTokens(SQLParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(SQLParser.DOT, i);
		}
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public List<Expr1Context> expr1() {
			return getRuleContexts(Expr1Context.class);
		}
		public Expr1Context expr1(int i) {
			return getRuleContext(Expr1Context.class,i);
		}
		public TerminalNode K_IN() { return getToken(SQLParser.K_IN, 0); }
		public TerminalNode K_NOT() { return getToken(SQLParser.K_NOT, 0); }
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public ExprwhereContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprwhere; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterExprwhere(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitExprwhere(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitExprwhere(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprwhereContext exprwhere() throws RecognitionException {
		ExprwhereContext _localctx = new ExprwhereContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_exprwhere);
		int _la;
		try {
			setState(2101);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,275,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2055);
				var1();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2056);
				expr(0);
				setState(2057);
				opeeration();
				setState(2058);
				expr(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2068);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,269,_ctx) ) {
				case 1:
					{
					setState(2063);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,268,_ctx) ) {
					case 1:
						{
						setState(2060);
						database_name();
						setState(2061);
						match(DOT);
						}
						break;
					}
					setState(2065);
					table_name();
					setState(2066);
					match(DOT);
					}
					break;
				}
				setState(2070);
				column_name();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2071);
				match(OPEN_PAR);
				setState(2072);
				expr(0);
				setState(2073);
				match(CLOSE_PAR);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2075);
				expr1(0);
				setState(2077);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_NOT) {
					{
					setState(2076);
					match(K_NOT);
					}
				}

				setState(2079);
				match(K_IN);
				setState(2099);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,274,_ctx) ) {
				case 1:
					{
					setState(2080);
					match(OPEN_PAR);
					setState(2090);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,272,_ctx) ) {
					case 1:
						{
						setState(2081);
						select_stmt();
						}
						break;
					case 2:
						{
						setState(2082);
						expr1(0);
						setState(2087);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==COMMA) {
							{
							{
							setState(2083);
							match(COMMA);
							setState(2084);
							expr1(0);
							}
							}
							setState(2089);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
						break;
					}
					setState(2092);
					match(CLOSE_PAR);
					}
					break;
				case 2:
					{
					setState(2096);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,273,_ctx) ) {
					case 1:
						{
						setState(2093);
						database_name();
						setState(2094);
						match(DOT);
						}
						break;
					}
					setState(2098);
					table_name();
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public Var1Context var1() {
			return getRuleContext(Var1Context.class,0);
		}
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public List<TerminalNode> DOT() { return getTokens(SQLParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(SQLParser.DOT, i);
		}
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public OpeerationContext opeeration() {
			return getRuleContext(OpeerationContext.class,0);
		}
		public TerminalNode K_IN() { return getToken(SQLParser.K_IN, 0); }
		public TerminalNode K_NOT() { return getToken(SQLParser.K_NOT, 0); }
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 214;
		enterRecursionRule(_localctx, 214, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2120);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,278,_ctx) ) {
			case 1:
				{
				setState(2104);
				var1();
				}
				break;
			case 2:
				{
				setState(2113);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,277,_ctx) ) {
				case 1:
					{
					setState(2108);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,276,_ctx) ) {
					case 1:
						{
						setState(2105);
						database_name();
						setState(2106);
						match(DOT);
						}
						break;
					}
					setState(2110);
					table_name();
					setState(2111);
					match(DOT);
					}
					break;
				}
				setState(2115);
				column_name();
				}
				break;
			case 3:
				{
				setState(2116);
				match(OPEN_PAR);
				setState(2117);
				expr(0);
				setState(2118);
				match(CLOSE_PAR);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(2154);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,285,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2152);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,284,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(2122);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(2123);
						opeeration();
						setState(2124);
						expr(5);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(2126);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(2128);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==K_NOT) {
							{
							setState(2127);
							match(K_NOT);
							}
						}

						setState(2130);
						match(K_IN);
						setState(2150);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,283,_ctx) ) {
						case 1:
							{
							setState(2131);
							match(OPEN_PAR);
							setState(2141);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,281,_ctx) ) {
							case 1:
								{
								setState(2132);
								select_stmt();
								}
								break;
							case 2:
								{
								setState(2133);
								expr(0);
								setState(2138);
								_errHandler.sync(this);
								_la = _input.LA(1);
								while (_la==COMMA) {
									{
									{
									setState(2134);
									match(COMMA);
									setState(2135);
									expr(0);
									}
									}
									setState(2140);
									_errHandler.sync(this);
									_la = _input.LA(1);
								}
								}
								break;
							}
							setState(2143);
							match(CLOSE_PAR);
							}
							break;
						case 2:
							{
							setState(2147);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,282,_ctx) ) {
							case 1:
								{
								setState(2144);
								database_name();
								setState(2145);
								match(DOT);
								}
								break;
							}
							setState(2149);
							table_name();
							}
							break;
						}
						}
						break;
					}
					} 
				}
				setState(2156);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,285,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Expr_for_varContext extends ParserRuleContext {
		public Expr_for_varContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_for_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterExpr_for_var(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitExpr_for_var(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitExpr_for_var(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_for_varContext expr_for_var() throws RecognitionException {
		Expr_for_varContext _localctx = new Expr_for_varContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_expr_for_var);
		try {
			enterOuterAlt(_localctx, 1);
			{
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_without_comperContext extends ParserRuleContext {
		public Literal_valueContext literal_value() {
			return getRuleContext(Literal_valueContext.class,0);
		}
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public List<TerminalNode> DOT() { return getTokens(SQLParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(SQLParser.DOT, i);
		}
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public Unary_operatorContext unary_operator() {
			return getRuleContext(Unary_operatorContext.class,0);
		}
		public List<Expr_without_comperContext> expr_without_comper() {
			return getRuleContexts(Expr_without_comperContext.class);
		}
		public Expr_without_comperContext expr_without_comper(int i) {
			return getRuleContext(Expr_without_comperContext.class,i);
		}
		public Function_nameContext function_name() {
			return getRuleContext(Function_nameContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public TerminalNode STAR() { return getToken(SQLParser.STAR, 0); }
		public TerminalNode K_DISTINCT() { return getToken(SQLParser.K_DISTINCT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public TerminalNode PIPE2() { return getToken(SQLParser.PIPE2, 0); }
		public TerminalNode DIV() { return getToken(SQLParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(SQLParser.MOD, 0); }
		public TerminalNode PLUS() { return getToken(SQLParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(SQLParser.MINUS, 0); }
		public TerminalNode LT2() { return getToken(SQLParser.LT2, 0); }
		public TerminalNode GT2() { return getToken(SQLParser.GT2, 0); }
		public TerminalNode AMP() { return getToken(SQLParser.AMP, 0); }
		public TerminalNode PIPE() { return getToken(SQLParser.PIPE, 0); }
		public Expr_without_comperContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_without_comper; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterExpr_without_comper(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitExpr_without_comper(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitExpr_without_comper(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_without_comperContext expr_without_comper() throws RecognitionException {
		return expr_without_comper(0);
	}

	private Expr_without_comperContext expr_without_comper(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Expr_without_comperContext _localctx = new Expr_without_comperContext(_ctx, _parentState);
		Expr_without_comperContext _prevctx = _localctx;
		int _startState = 218;
		enterRecursionRule(_localctx, 218, RULE_expr_without_comper, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2197);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,291,_ctx) ) {
			case 1:
				{
				setState(2160);
				literal_value();
				}
				break;
			case 2:
				{
				setState(2169);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,287,_ctx) ) {
				case 1:
					{
					setState(2164);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,286,_ctx) ) {
					case 1:
						{
						setState(2161);
						database_name();
						setState(2162);
						match(DOT);
						}
						break;
					}
					setState(2166);
					table_name();
					setState(2167);
					match(DOT);
					}
					break;
				}
				setState(2171);
				column_name();
				}
				break;
			case 3:
				{
				setState(2172);
				unary_operator();
				setState(2173);
				expr_without_comper(7);
				}
				break;
			case 4:
				{
				setState(2175);
				function_name();
				setState(2176);
				match(OPEN_PAR);
				setState(2189);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case OPEN_PAR:
				case PLUS:
				case MINUS:
				case TILDE:
				case K_ABORT:
				case K_ACTION:
				case K_ADD:
				case K_AFTER:
				case K_ALL:
				case K_ALTER:
				case K_ANALYZE:
				case K_AND:
				case K_AS:
				case K_ASC:
				case K_ATTACH:
				case K_AUTOINCREMENT:
				case K_BEFORE:
				case K_BEGIN:
				case K_BETWEEN:
				case K_BY:
				case K_CASCADE:
				case K_CASE:
				case K_CAST:
				case K_CHECK:
				case K_COLLATE:
				case K_COLUMN:
				case K_COMMIT:
				case K_CONFLICT:
				case K_CONSTRAINT:
				case K_CREATE:
				case K_CROSS:
				case K_CURRENT_DATE:
				case K_CURRENT_TIME:
				case K_CURRENT_TIMESTAMP:
				case K_DATABASE:
				case K_DEFAULT:
				case K_DEFERRABLE:
				case K_DEFERRED:
				case K_DELETE:
				case K_DESC:
				case K_DETACH:
				case K_DISTINCT:
				case K_DROP:
				case K_EACH:
				case K_ELSE:
				case K_END:
				case K_ENABLE:
				case K_ESCAPE:
				case K_EXCEPT:
				case K_EXCLUSIVE:
				case K_EXISTS:
				case K_EXPLAIN:
				case K_FAIL:
				case K_FOR:
				case K_FOREIGN:
				case K_FROM:
				case K_FULL:
				case K_GLOB:
				case K_GROUP:
				case K_HAVING:
				case K_IF:
				case K_IGNORE:
				case K_IMMEDIATE:
				case K_IN:
				case K_INDEX:
				case K_INDEXED:
				case K_INITIALLY:
				case K_INNER:
				case K_INSERT:
				case K_INSTEAD:
				case K_INTERSECT:
				case K_INTO:
				case K_IS:
				case K_ISNULL:
				case K_JOIN:
				case K_KEY:
				case K_LEFT:
				case K_LIKE:
				case K_LIMIT:
				case K_MATCH:
				case K_NATURAL:
				case K_NEXTVAL:
				case K_NO:
				case K_NOT:
				case K_NOTNULL:
				case K_NULL:
				case K_OF:
				case K_OFFSET:
				case K_ON:
				case K_OR:
				case K_ORDER:
				case K_OUTER:
				case K_PLAN:
				case K_PRAGMA:
				case K_PRIMARY:
				case K_QUERY:
				case K_RAISE:
				case K_RECURSIVE:
				case K_REFERENCES:
				case K_REGEXP:
				case K_REINDEX:
				case K_RELEASE:
				case K_RENAME:
				case K_REPLACE:
				case K_RESTRICT:
				case K_RIGHT:
				case K_ROLLBACK:
				case K_ROW:
				case K_SAVEPOINT:
				case K_SELECT:
				case K_SET:
				case K_TABLE:
				case K_TEMP:
				case K_TEMPORARY:
				case K_THEN:
				case K_TO:
				case K_TRANSACTION:
				case K_TRIGGER:
				case K_UNION:
				case K_UNIQUE:
				case K_UPDATE:
				case K_USING:
				case K_VACUUM:
				case K_VALUES:
				case K_VIEW:
				case K_VIRTUAL:
				case K_WHEN:
				case K_WHERE:
				case K_WITH:
				case K_WITHOUT:
				case K_RETURN:
				case K_WHILE:
				case K_SWITCH:
				case K_BREAK:
				case K_DO:
				case K_FUNCTION:
				case IDENTIFIER:
				case NUMERIC_LITERAL:
				case STRING_LITERAL:
				case BLOB_LITERAL:
					{
					setState(2178);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,288,_ctx) ) {
					case 1:
						{
						setState(2177);
						match(K_DISTINCT);
						}
						break;
					}
					setState(2180);
					expr_without_comper(0);
					setState(2185);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(2181);
						match(COMMA);
						setState(2182);
						expr_without_comper(0);
						}
						}
						setState(2187);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case STAR:
					{
					setState(2188);
					match(STAR);
					}
					break;
				case CLOSE_PAR:
					break;
				default:
					break;
				}
				setState(2191);
				match(CLOSE_PAR);
				}
				break;
			case 5:
				{
				setState(2193);
				match(OPEN_PAR);
				setState(2194);
				expr_without_comper(0);
				setState(2195);
				match(CLOSE_PAR);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(2213);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,293,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2211);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,292,_ctx) ) {
					case 1:
						{
						_localctx = new Expr_without_comperContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr_without_comper);
						setState(2199);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(2200);
						match(PIPE2);
						setState(2201);
						expr_without_comper(7);
						}
						break;
					case 2:
						{
						_localctx = new Expr_without_comperContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr_without_comper);
						setState(2202);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(2203);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STAR) | (1L << DIV) | (1L << MOD))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(2204);
						expr_without_comper(6);
						}
						break;
					case 3:
						{
						_localctx = new Expr_without_comperContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr_without_comper);
						setState(2205);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(2206);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(2207);
						expr_without_comper(5);
						}
						break;
					case 4:
						{
						_localctx = new Expr_without_comperContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr_without_comper);
						setState(2208);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(2209);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT2) | (1L << GT2) | (1L << AMP) | (1L << PIPE))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(2210);
						expr_without_comper(4);
						}
						break;
					}
					} 
				}
				setState(2215);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,293,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class OpeerationContext extends ParserRuleContext {
		public TerminalNode STAR() { return getToken(SQLParser.STAR, 0); }
		public TerminalNode DIV() { return getToken(SQLParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(SQLParser.MOD, 0); }
		public TerminalNode PLUS() { return getToken(SQLParser.PLUS, 0); }
		public TerminalNode LT2() { return getToken(SQLParser.LT2, 0); }
		public TerminalNode GT2() { return getToken(SQLParser.GT2, 0); }
		public TerminalNode AMP() { return getToken(SQLParser.AMP, 0); }
		public TerminalNode PIPE() { return getToken(SQLParser.PIPE, 0); }
		public TerminalNode LT() { return getToken(SQLParser.LT, 0); }
		public TerminalNode LT_EQ() { return getToken(SQLParser.LT_EQ, 0); }
		public TerminalNode GT() { return getToken(SQLParser.GT, 0); }
		public TerminalNode GT_EQ() { return getToken(SQLParser.GT_EQ, 0); }
		public TerminalNode ASSIGN() { return getToken(SQLParser.ASSIGN, 0); }
		public TerminalNode EQ() { return getToken(SQLParser.EQ, 0); }
		public TerminalNode NOT_EQ1() { return getToken(SQLParser.NOT_EQ1, 0); }
		public TerminalNode NOT_EQ2() { return getToken(SQLParser.NOT_EQ2, 0); }
		public TerminalNode K_IS() { return getToken(SQLParser.K_IS, 0); }
		public TerminalNode K_NOT() { return getToken(SQLParser.K_NOT, 0); }
		public TerminalNode K_IN() { return getToken(SQLParser.K_IN, 0); }
		public TerminalNode K_LIKE() { return getToken(SQLParser.K_LIKE, 0); }
		public TerminalNode K_GLOB() { return getToken(SQLParser.K_GLOB, 0); }
		public TerminalNode K_MATCH() { return getToken(SQLParser.K_MATCH, 0); }
		public TerminalNode K_REGEXP() { return getToken(SQLParser.K_REGEXP, 0); }
		public TerminalNode MINUS() { return getToken(SQLParser.MINUS, 0); }
		public TerminalNode K_AND() { return getToken(SQLParser.K_AND, 0); }
		public TerminalNode K_OR() { return getToken(SQLParser.K_OR, 0); }
		public OpeerationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opeeration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterOpeeration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitOpeeration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitOpeeration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpeerationContext opeeration() throws RecognitionException {
		OpeerationContext _localctx = new OpeerationContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_opeeration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2243);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,294,_ctx) ) {
			case 1:
				{
				setState(2216);
				match(STAR);
				}
				break;
			case 2:
				{
				setState(2217);
				match(DIV);
				}
				break;
			case 3:
				{
				setState(2218);
				match(MOD);
				}
				break;
			case 4:
				{
				setState(2219);
				match(PLUS);
				}
				break;
			case 5:
				{
				setState(2220);
				match(LT2);
				}
				break;
			case 6:
				{
				setState(2221);
				match(GT2);
				}
				break;
			case 7:
				{
				setState(2222);
				match(AMP);
				}
				break;
			case 8:
				{
				setState(2223);
				match(PIPE);
				}
				break;
			case 9:
				{
				setState(2224);
				match(LT);
				}
				break;
			case 10:
				{
				setState(2225);
				match(LT_EQ);
				}
				break;
			case 11:
				{
				setState(2226);
				match(GT);
				}
				break;
			case 12:
				{
				setState(2227);
				match(GT_EQ);
				}
				break;
			case 13:
				{
				setState(2228);
				match(ASSIGN);
				}
				break;
			case 14:
				{
				setState(2229);
				match(EQ);
				}
				break;
			case 15:
				{
				setState(2230);
				match(NOT_EQ1);
				}
				break;
			case 16:
				{
				setState(2231);
				match(NOT_EQ2);
				}
				break;
			case 17:
				{
				setState(2232);
				match(K_IS);
				}
				break;
			case 18:
				{
				setState(2233);
				match(K_IS);
				setState(2234);
				match(K_NOT);
				}
				break;
			case 19:
				{
				setState(2235);
				match(K_IN);
				}
				break;
			case 20:
				{
				setState(2236);
				match(K_LIKE);
				}
				break;
			case 21:
				{
				setState(2237);
				match(K_GLOB);
				}
				break;
			case 22:
				{
				setState(2238);
				match(K_MATCH);
				}
				break;
			case 23:
				{
				setState(2239);
				match(K_REGEXP);
				}
				break;
			case 24:
				{
				setState(2240);
				match(MINUS);
				}
				break;
			case 25:
				{
				setState(2241);
				match(K_AND);
				}
				break;
			case 26:
				{
				setState(2242);
				match(K_OR);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Var1Context extends ParserRuleContext {
		public Literal_valueContext literal_value() {
			return getRuleContext(Literal_valueContext.class,0);
		}
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public Unary_operatorContext unary_operator() {
			return getRuleContext(Unary_operatorContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Function_exprContext function_expr() {
			return getRuleContext(Function_exprContext.class,0);
		}
		public Var1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterVar1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitVar1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitVar1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var1Context var1() throws RecognitionException {
		Var1Context _localctx = new Var1Context(_ctx, getState());
		enterRule(_localctx, 222, RULE_var1);
		try {
			setState(2251);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,295,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2245);
				literal_value();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2246);
				column_name();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2247);
				unary_operator();
				setState(2248);
				expr(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2250);
				function_expr();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_exprContext extends ParserRuleContext {
		public Function_nameContext function_name() {
			return getRuleContext(Function_nameContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode STAR() { return getToken(SQLParser.STAR, 0); }
		public TerminalNode K_DISTINCT() { return getToken(SQLParser.K_DISTINCT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public Function_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterFunction_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitFunction_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitFunction_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_exprContext function_expr() throws RecognitionException {
		Function_exprContext _localctx = new Function_exprContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_function_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2253);
			function_name();
			setState(2254);
			match(OPEN_PAR);
			setState(2267);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_PAR:
			case PLUS:
			case MINUS:
			case TILDE:
			case K_ABORT:
			case K_ACTION:
			case K_ADD:
			case K_AFTER:
			case K_ALL:
			case K_ALTER:
			case K_ANALYZE:
			case K_AND:
			case K_AS:
			case K_ASC:
			case K_ATTACH:
			case K_AUTOINCREMENT:
			case K_BEFORE:
			case K_BEGIN:
			case K_BETWEEN:
			case K_BY:
			case K_CASCADE:
			case K_CASE:
			case K_CAST:
			case K_CHECK:
			case K_COLLATE:
			case K_COLUMN:
			case K_COMMIT:
			case K_CONFLICT:
			case K_CONSTRAINT:
			case K_CREATE:
			case K_CROSS:
			case K_CURRENT_DATE:
			case K_CURRENT_TIME:
			case K_CURRENT_TIMESTAMP:
			case K_DATABASE:
			case K_DEFAULT:
			case K_DEFERRABLE:
			case K_DEFERRED:
			case K_DELETE:
			case K_DESC:
			case K_DETACH:
			case K_DISTINCT:
			case K_DROP:
			case K_EACH:
			case K_ELSE:
			case K_END:
			case K_ENABLE:
			case K_ESCAPE:
			case K_EXCEPT:
			case K_EXCLUSIVE:
			case K_EXISTS:
			case K_EXPLAIN:
			case K_FAIL:
			case K_FOR:
			case K_FOREIGN:
			case K_FROM:
			case K_FULL:
			case K_GLOB:
			case K_GROUP:
			case K_HAVING:
			case K_IF:
			case K_IGNORE:
			case K_IMMEDIATE:
			case K_IN:
			case K_INDEX:
			case K_INDEXED:
			case K_INITIALLY:
			case K_INNER:
			case K_INSERT:
			case K_INSTEAD:
			case K_INTERSECT:
			case K_INTO:
			case K_IS:
			case K_ISNULL:
			case K_JOIN:
			case K_KEY:
			case K_LEFT:
			case K_LIKE:
			case K_LIMIT:
			case K_MATCH:
			case K_NATURAL:
			case K_NEXTVAL:
			case K_NO:
			case K_NOT:
			case K_NOTNULL:
			case K_NULL:
			case K_OF:
			case K_OFFSET:
			case K_ON:
			case K_OR:
			case K_ORDER:
			case K_OUTER:
			case K_PLAN:
			case K_PRAGMA:
			case K_PRIMARY:
			case K_QUERY:
			case K_RAISE:
			case K_RECURSIVE:
			case K_REFERENCES:
			case K_REGEXP:
			case K_REINDEX:
			case K_RELEASE:
			case K_RENAME:
			case K_REPLACE:
			case K_RESTRICT:
			case K_RIGHT:
			case K_ROLLBACK:
			case K_ROW:
			case K_SAVEPOINT:
			case K_SELECT:
			case K_SET:
			case K_TABLE:
			case K_TEMP:
			case K_TEMPORARY:
			case K_THEN:
			case K_TO:
			case K_TRANSACTION:
			case K_TRIGGER:
			case K_UNION:
			case K_UNIQUE:
			case K_UPDATE:
			case K_USING:
			case K_VACUUM:
			case K_VALUES:
			case K_VIEW:
			case K_VIRTUAL:
			case K_WHEN:
			case K_WHERE:
			case K_WITH:
			case K_WITHOUT:
			case K_RETURN:
			case K_WHILE:
			case K_SWITCH:
			case K_BREAK:
			case K_DO:
			case K_FUNCTION:
			case IDENTIFIER:
			case NUMERIC_LITERAL:
			case STRING_LITERAL:
			case BLOB_LITERAL:
				{
				setState(2256);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,296,_ctx) ) {
				case 1:
					{
					setState(2255);
					match(K_DISTINCT);
					}
					break;
				}
				setState(2258);
				expr(0);
				setState(2263);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(2259);
					match(COMMA);
					setState(2260);
					expr(0);
					}
					}
					setState(2265);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case STAR:
				{
				setState(2266);
				match(STAR);
				}
				break;
			case CLOSE_PAR:
				break;
			default:
				break;
			}
			setState(2269);
			match(CLOSE_PAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr1Context extends ParserRuleContext {
		public Literal_valueContext literal_value() {
			return getRuleContext(Literal_valueContext.class,0);
		}
		public TerminalNode BIND_PARAMETER() { return getToken(SQLParser.BIND_PARAMETER, 0); }
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public List<TerminalNode> DOT() { return getTokens(SQLParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(SQLParser.DOT, i);
		}
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public Unary_operatorContext unary_operator() {
			return getRuleContext(Unary_operatorContext.class,0);
		}
		public List<Expr1Context> expr1() {
			return getRuleContexts(Expr1Context.class);
		}
		public Expr1Context expr1(int i) {
			return getRuleContext(Expr1Context.class,i);
		}
		public Function_nameContext function_name() {
			return getRuleContext(Function_nameContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public TerminalNode STAR() { return getToken(SQLParser.STAR, 0); }
		public TerminalNode K_DISTINCT() { return getToken(SQLParser.K_DISTINCT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public TerminalNode PIPE2() { return getToken(SQLParser.PIPE2, 0); }
		public TerminalNode DIV() { return getToken(SQLParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(SQLParser.MOD, 0); }
		public TerminalNode PLUS() { return getToken(SQLParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(SQLParser.MINUS, 0); }
		public TerminalNode LT2() { return getToken(SQLParser.LT2, 0); }
		public TerminalNode GT2() { return getToken(SQLParser.GT2, 0); }
		public TerminalNode AMP() { return getToken(SQLParser.AMP, 0); }
		public TerminalNode PIPE() { return getToken(SQLParser.PIPE, 0); }
		public TerminalNode LT() { return getToken(SQLParser.LT, 0); }
		public TerminalNode LT_EQ() { return getToken(SQLParser.LT_EQ, 0); }
		public TerminalNode GT() { return getToken(SQLParser.GT, 0); }
		public TerminalNode GT_EQ() { return getToken(SQLParser.GT_EQ, 0); }
		public TerminalNode ASSIGN() { return getToken(SQLParser.ASSIGN, 0); }
		public TerminalNode EQ() { return getToken(SQLParser.EQ, 0); }
		public TerminalNode NOT_EQ1() { return getToken(SQLParser.NOT_EQ1, 0); }
		public TerminalNode NOT_EQ2() { return getToken(SQLParser.NOT_EQ2, 0); }
		public TerminalNode K_IS() { return getToken(SQLParser.K_IS, 0); }
		public TerminalNode K_NOT() { return getToken(SQLParser.K_NOT, 0); }
		public TerminalNode K_IN() { return getToken(SQLParser.K_IN, 0); }
		public TerminalNode K_LIKE() { return getToken(SQLParser.K_LIKE, 0); }
		public TerminalNode K_GLOB() { return getToken(SQLParser.K_GLOB, 0); }
		public TerminalNode K_MATCH() { return getToken(SQLParser.K_MATCH, 0); }
		public TerminalNode K_REGEXP() { return getToken(SQLParser.K_REGEXP, 0); }
		public TerminalNode K_AND() { return getToken(SQLParser.K_AND, 0); }
		public TerminalNode K_OR() { return getToken(SQLParser.K_OR, 0); }
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public Expr1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterExpr1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitExpr1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitExpr1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr1Context expr1() throws RecognitionException {
		return expr1(0);
	}

	private Expr1Context expr1(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Expr1Context _localctx = new Expr1Context(_ctx, _parentState);
		Expr1Context _prevctx = _localctx;
		int _startState = 226;
		enterRecursionRule(_localctx, 226, RULE_expr1, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2310);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,304,_ctx) ) {
			case 1:
				{
				setState(2272);
				literal_value();
				}
				break;
			case 2:
				{
				setState(2273);
				match(BIND_PARAMETER);
				}
				break;
			case 3:
				{
				setState(2282);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,300,_ctx) ) {
				case 1:
					{
					setState(2277);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,299,_ctx) ) {
					case 1:
						{
						setState(2274);
						database_name();
						setState(2275);
						match(DOT);
						}
						break;
					}
					setState(2279);
					table_name();
					setState(2280);
					match(DOT);
					}
					break;
				}
				setState(2284);
				column_name();
				}
				break;
			case 4:
				{
				setState(2285);
				unary_operator();
				setState(2286);
				expr1(12);
				}
				break;
			case 5:
				{
				setState(2288);
				function_name();
				setState(2289);
				match(OPEN_PAR);
				setState(2302);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case OPEN_PAR:
				case PLUS:
				case MINUS:
				case TILDE:
				case K_ABORT:
				case K_ACTION:
				case K_ADD:
				case K_AFTER:
				case K_ALL:
				case K_ALTER:
				case K_ANALYZE:
				case K_AND:
				case K_AS:
				case K_ASC:
				case K_ATTACH:
				case K_AUTOINCREMENT:
				case K_BEFORE:
				case K_BEGIN:
				case K_BETWEEN:
				case K_BY:
				case K_CASCADE:
				case K_CASE:
				case K_CAST:
				case K_CHECK:
				case K_COLLATE:
				case K_COLUMN:
				case K_COMMIT:
				case K_CONFLICT:
				case K_CONSTRAINT:
				case K_CREATE:
				case K_CROSS:
				case K_CURRENT_DATE:
				case K_CURRENT_TIME:
				case K_CURRENT_TIMESTAMP:
				case K_DATABASE:
				case K_DEFAULT:
				case K_DEFERRABLE:
				case K_DEFERRED:
				case K_DELETE:
				case K_DESC:
				case K_DETACH:
				case K_DISTINCT:
				case K_DROP:
				case K_EACH:
				case K_ELSE:
				case K_END:
				case K_ENABLE:
				case K_ESCAPE:
				case K_EXCEPT:
				case K_EXCLUSIVE:
				case K_EXISTS:
				case K_EXPLAIN:
				case K_FAIL:
				case K_FOR:
				case K_FOREIGN:
				case K_FROM:
				case K_FULL:
				case K_GLOB:
				case K_GROUP:
				case K_HAVING:
				case K_IF:
				case K_IGNORE:
				case K_IMMEDIATE:
				case K_IN:
				case K_INDEX:
				case K_INDEXED:
				case K_INITIALLY:
				case K_INNER:
				case K_INSERT:
				case K_INSTEAD:
				case K_INTERSECT:
				case K_INTO:
				case K_IS:
				case K_ISNULL:
				case K_JOIN:
				case K_KEY:
				case K_LEFT:
				case K_LIKE:
				case K_LIMIT:
				case K_MATCH:
				case K_NATURAL:
				case K_NEXTVAL:
				case K_NO:
				case K_NOT:
				case K_NOTNULL:
				case K_NULL:
				case K_OF:
				case K_OFFSET:
				case K_ON:
				case K_OR:
				case K_ORDER:
				case K_OUTER:
				case K_PLAN:
				case K_PRAGMA:
				case K_PRIMARY:
				case K_QUERY:
				case K_RAISE:
				case K_RECURSIVE:
				case K_REFERENCES:
				case K_REGEXP:
				case K_REINDEX:
				case K_RELEASE:
				case K_RENAME:
				case K_REPLACE:
				case K_RESTRICT:
				case K_RIGHT:
				case K_ROLLBACK:
				case K_ROW:
				case K_SAVEPOINT:
				case K_SELECT:
				case K_SET:
				case K_TABLE:
				case K_TEMP:
				case K_TEMPORARY:
				case K_THEN:
				case K_TO:
				case K_TRANSACTION:
				case K_TRIGGER:
				case K_UNION:
				case K_UNIQUE:
				case K_UPDATE:
				case K_USING:
				case K_VACUUM:
				case K_VALUES:
				case K_VIEW:
				case K_VIRTUAL:
				case K_WHEN:
				case K_WHERE:
				case K_WITH:
				case K_WITHOUT:
				case K_RETURN:
				case K_WHILE:
				case K_SWITCH:
				case K_BREAK:
				case K_DO:
				case K_FUNCTION:
				case IDENTIFIER:
				case NUMERIC_LITERAL:
				case BIND_PARAMETER:
				case STRING_LITERAL:
				case BLOB_LITERAL:
					{
					setState(2291);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,301,_ctx) ) {
					case 1:
						{
						setState(2290);
						match(K_DISTINCT);
						}
						break;
					}
					setState(2293);
					expr1(0);
					setState(2298);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(2294);
						match(COMMA);
						setState(2295);
						expr1(0);
						}
						}
						setState(2300);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case STAR:
					{
					setState(2301);
					match(STAR);
					}
					break;
				case CLOSE_PAR:
					break;
				default:
					break;
				}
				setState(2304);
				match(CLOSE_PAR);
				}
				break;
			case 6:
				{
				setState(2306);
				match(OPEN_PAR);
				setState(2307);
				expr1(0);
				setState(2308);
				match(CLOSE_PAR);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(2377);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,312,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2375);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,311,_ctx) ) {
					case 1:
						{
						_localctx = new Expr1Context(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr1);
						setState(2312);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(2313);
						match(PIPE2);
						setState(2314);
						expr1(12);
						}
						break;
					case 2:
						{
						_localctx = new Expr1Context(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr1);
						setState(2315);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(2316);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STAR) | (1L << DIV) | (1L << MOD))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(2317);
						expr1(11);
						}
						break;
					case 3:
						{
						_localctx = new Expr1Context(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr1);
						setState(2318);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(2319);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(2320);
						expr1(10);
						}
						break;
					case 4:
						{
						_localctx = new Expr1Context(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr1);
						setState(2321);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(2322);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT2) | (1L << GT2) | (1L << AMP) | (1L << PIPE))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(2323);
						expr1(9);
						}
						break;
					case 5:
						{
						_localctx = new Expr1Context(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr1);
						setState(2324);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(2325);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT) | (1L << LT_EQ) | (1L << GT) | (1L << GT_EQ))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(2326);
						expr1(8);
						}
						break;
					case 6:
						{
						_localctx = new Expr1Context(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr1);
						setState(2327);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(2340);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,305,_ctx) ) {
						case 1:
							{
							setState(2328);
							match(ASSIGN);
							}
							break;
						case 2:
							{
							setState(2329);
							match(EQ);
							}
							break;
						case 3:
							{
							setState(2330);
							match(NOT_EQ1);
							}
							break;
						case 4:
							{
							setState(2331);
							match(NOT_EQ2);
							}
							break;
						case 5:
							{
							setState(2332);
							match(K_IS);
							}
							break;
						case 6:
							{
							setState(2333);
							match(K_IS);
							setState(2334);
							match(K_NOT);
							}
							break;
						case 7:
							{
							setState(2335);
							match(K_IN);
							}
							break;
						case 8:
							{
							setState(2336);
							match(K_LIKE);
							}
							break;
						case 9:
							{
							setState(2337);
							match(K_GLOB);
							}
							break;
						case 10:
							{
							setState(2338);
							match(K_MATCH);
							}
							break;
						case 11:
							{
							setState(2339);
							match(K_REGEXP);
							}
							break;
						}
						setState(2342);
						expr1(7);
						}
						break;
					case 7:
						{
						_localctx = new Expr1Context(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr1);
						setState(2343);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(2344);
						match(K_AND);
						setState(2345);
						expr1(6);
						}
						break;
					case 8:
						{
						_localctx = new Expr1Context(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr1);
						setState(2346);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(2347);
						match(K_OR);
						setState(2348);
						expr1(5);
						}
						break;
					case 9:
						{
						_localctx = new Expr1Context(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr1);
						setState(2349);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(2351);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==K_NOT) {
							{
							setState(2350);
							match(K_NOT);
							}
						}

						setState(2353);
						match(K_IN);
						setState(2373);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,310,_ctx) ) {
						case 1:
							{
							setState(2354);
							match(OPEN_PAR);
							setState(2364);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,308,_ctx) ) {
							case 1:
								{
								setState(2355);
								select_stmt();
								}
								break;
							case 2:
								{
								setState(2356);
								expr1(0);
								setState(2361);
								_errHandler.sync(this);
								_la = _input.LA(1);
								while (_la==COMMA) {
									{
									{
									setState(2357);
									match(COMMA);
									setState(2358);
									expr1(0);
									}
									}
									setState(2363);
									_errHandler.sync(this);
									_la = _input.LA(1);
								}
								}
								break;
							}
							setState(2366);
							match(CLOSE_PAR);
							}
							break;
						case 2:
							{
							setState(2370);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,309,_ctx) ) {
							case 1:
								{
								setState(2367);
								database_name();
								setState(2368);
								match(DOT);
								}
								break;
							}
							setState(2372);
							table_name();
							}
							break;
						}
						}
						break;
					}
					} 
				}
				setState(2379);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,312,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Foreign_key_clauseContext extends ParserRuleContext {
		public TerminalNode K_REFERENCES() { return getToken(SQLParser.K_REFERENCES, 0); }
		public Foreign_tableContext foreign_table() {
			return getRuleContext(Foreign_tableContext.class,0);
		}
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SQLParser.DOT, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public List<Fk_target_column_nameContext> fk_target_column_name() {
			return getRuleContexts(Fk_target_column_nameContext.class);
		}
		public Fk_target_column_nameContext fk_target_column_name(int i) {
			return getRuleContext(Fk_target_column_nameContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public TerminalNode K_DEFERRABLE() { return getToken(SQLParser.K_DEFERRABLE, 0); }
		public List<TerminalNode> K_ON() { return getTokens(SQLParser.K_ON); }
		public TerminalNode K_ON(int i) {
			return getToken(SQLParser.K_ON, i);
		}
		public List<TerminalNode> K_MATCH() { return getTokens(SQLParser.K_MATCH); }
		public TerminalNode K_MATCH(int i) {
			return getToken(SQLParser.K_MATCH, i);
		}
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public List<TerminalNode> K_DELETE() { return getTokens(SQLParser.K_DELETE); }
		public TerminalNode K_DELETE(int i) {
			return getToken(SQLParser.K_DELETE, i);
		}
		public List<TerminalNode> K_UPDATE() { return getTokens(SQLParser.K_UPDATE); }
		public TerminalNode K_UPDATE(int i) {
			return getToken(SQLParser.K_UPDATE, i);
		}
		public TerminalNode K_NOT() { return getToken(SQLParser.K_NOT, 0); }
		public TerminalNode K_INITIALLY() { return getToken(SQLParser.K_INITIALLY, 0); }
		public TerminalNode K_DEFERRED() { return getToken(SQLParser.K_DEFERRED, 0); }
		public TerminalNode K_IMMEDIATE() { return getToken(SQLParser.K_IMMEDIATE, 0); }
		public TerminalNode K_ENABLE() { return getToken(SQLParser.K_ENABLE, 0); }
		public List<TerminalNode> K_SET() { return getTokens(SQLParser.K_SET); }
		public TerminalNode K_SET(int i) {
			return getToken(SQLParser.K_SET, i);
		}
		public List<TerminalNode> K_NULL() { return getTokens(SQLParser.K_NULL); }
		public TerminalNode K_NULL(int i) {
			return getToken(SQLParser.K_NULL, i);
		}
		public List<TerminalNode> K_DEFAULT() { return getTokens(SQLParser.K_DEFAULT); }
		public TerminalNode K_DEFAULT(int i) {
			return getToken(SQLParser.K_DEFAULT, i);
		}
		public List<TerminalNode> K_CASCADE() { return getTokens(SQLParser.K_CASCADE); }
		public TerminalNode K_CASCADE(int i) {
			return getToken(SQLParser.K_CASCADE, i);
		}
		public List<TerminalNode> K_RESTRICT() { return getTokens(SQLParser.K_RESTRICT); }
		public TerminalNode K_RESTRICT(int i) {
			return getToken(SQLParser.K_RESTRICT, i);
		}
		public List<TerminalNode> K_NO() { return getTokens(SQLParser.K_NO); }
		public TerminalNode K_NO(int i) {
			return getToken(SQLParser.K_NO, i);
		}
		public List<TerminalNode> K_ACTION() { return getTokens(SQLParser.K_ACTION); }
		public TerminalNode K_ACTION(int i) {
			return getToken(SQLParser.K_ACTION, i);
		}
		public Foreign_key_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreign_key_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterForeign_key_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitForeign_key_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitForeign_key_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Foreign_key_clauseContext foreign_key_clause() throws RecognitionException {
		Foreign_key_clauseContext _localctx = new Foreign_key_clauseContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_foreign_key_clause);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2380);
			match(K_REFERENCES);
			setState(2384);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,313,_ctx) ) {
			case 1:
				{
				setState(2381);
				database_name();
				setState(2382);
				match(DOT);
				}
				break;
			}
			setState(2386);
			foreign_table();
			setState(2398);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,315,_ctx) ) {
			case 1:
				{
				setState(2387);
				match(OPEN_PAR);
				setState(2388);
				fk_target_column_name();
				setState(2393);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(2389);
					match(COMMA);
					setState(2390);
					fk_target_column_name();
					}
					}
					setState(2395);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2396);
				match(CLOSE_PAR);
				}
				break;
			}
			setState(2418);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,318,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2414);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case K_ON:
						{
						setState(2400);
						match(K_ON);
						setState(2401);
						_la = _input.LA(1);
						if ( !(_la==K_DELETE || _la==K_UPDATE) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(2410);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,316,_ctx) ) {
						case 1:
							{
							setState(2402);
							match(K_SET);
							setState(2403);
							match(K_NULL);
							}
							break;
						case 2:
							{
							setState(2404);
							match(K_SET);
							setState(2405);
							match(K_DEFAULT);
							}
							break;
						case 3:
							{
							setState(2406);
							match(K_CASCADE);
							}
							break;
						case 4:
							{
							setState(2407);
							match(K_RESTRICT);
							}
							break;
						case 5:
							{
							setState(2408);
							match(K_NO);
							setState(2409);
							match(K_ACTION);
							}
							break;
						}
						}
						break;
					case K_MATCH:
						{
						setState(2412);
						match(K_MATCH);
						setState(2413);
						name();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					} 
				}
				setState(2420);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,318,_ctx);
			}
			setState(2434);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,322,_ctx) ) {
			case 1:
				{
				setState(2422);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_NOT) {
					{
					setState(2421);
					match(K_NOT);
					}
				}

				setState(2424);
				match(K_DEFERRABLE);
				setState(2429);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,320,_ctx) ) {
				case 1:
					{
					setState(2425);
					match(K_INITIALLY);
					setState(2426);
					match(K_DEFERRED);
					}
					break;
				case 2:
					{
					setState(2427);
					match(K_INITIALLY);
					setState(2428);
					match(K_IMMEDIATE);
					}
					break;
				}
				setState(2432);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,321,_ctx) ) {
				case 1:
					{
					setState(2431);
					match(K_ENABLE);
					}
					break;
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Fk_target_column_nameContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Fk_target_column_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fk_target_column_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterFk_target_column_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitFk_target_column_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitFk_target_column_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Fk_target_column_nameContext fk_target_column_name() throws RecognitionException {
		Fk_target_column_nameContext _localctx = new Fk_target_column_nameContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_fk_target_column_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2436);
			name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Indexed_columnContext extends ParserRuleContext {
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public TerminalNode K_COLLATE() { return getToken(SQLParser.K_COLLATE, 0); }
		public Collation_nameContext collation_name() {
			return getRuleContext(Collation_nameContext.class,0);
		}
		public TerminalNode K_ASC() { return getToken(SQLParser.K_ASC, 0); }
		public TerminalNode K_DESC() { return getToken(SQLParser.K_DESC, 0); }
		public Indexed_columnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexed_column; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterIndexed_column(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitIndexed_column(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitIndexed_column(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Indexed_columnContext indexed_column() throws RecognitionException {
		Indexed_columnContext _localctx = new Indexed_columnContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_indexed_column);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2438);
			column_name();
			setState(2441);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_COLLATE) {
				{
				setState(2439);
				match(K_COLLATE);
				setState(2440);
				collation_name();
				}
			}

			setState(2444);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ASC || _la==K_DESC) {
				{
				setState(2443);
				_la = _input.LA(1);
				if ( !(_la==K_ASC || _la==K_DESC) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_constraintContext extends ParserRuleContext {
		public Table_constraint_primary_keyContext table_constraint_primary_key() {
			return getRuleContext(Table_constraint_primary_keyContext.class,0);
		}
		public Table_constraint_keyContext table_constraint_key() {
			return getRuleContext(Table_constraint_keyContext.class,0);
		}
		public Table_constraint_uniqueContext table_constraint_unique() {
			return getRuleContext(Table_constraint_uniqueContext.class,0);
		}
		public TerminalNode K_CHECK() { return getToken(SQLParser.K_CHECK, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public Table_constraint_foreign_keyContext table_constraint_foreign_key() {
			return getRuleContext(Table_constraint_foreign_keyContext.class,0);
		}
		public TerminalNode K_CONSTRAINT() { return getToken(SQLParser.K_CONSTRAINT, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Table_constraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_constraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterTable_constraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitTable_constraint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitTable_constraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_constraintContext table_constraint() throws RecognitionException {
		Table_constraintContext _localctx = new Table_constraintContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_table_constraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2448);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_CONSTRAINT) {
				{
				setState(2446);
				match(K_CONSTRAINT);
				setState(2447);
				name();
				}
			}

			setState(2459);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_PRIMARY:
				{
				setState(2450);
				table_constraint_primary_key();
				}
				break;
			case K_KEY:
				{
				setState(2451);
				table_constraint_key();
				}
				break;
			case K_UNIQUE:
				{
				setState(2452);
				table_constraint_unique();
				}
				break;
			case K_CHECK:
				{
				setState(2453);
				match(K_CHECK);
				setState(2454);
				match(OPEN_PAR);
				setState(2455);
				expr(0);
				setState(2456);
				match(CLOSE_PAR);
				}
				break;
			case K_FOREIGN:
				{
				setState(2458);
				table_constraint_foreign_key();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_constraint_primary_keyContext extends ParserRuleContext {
		public TerminalNode K_PRIMARY() { return getToken(SQLParser.K_PRIMARY, 0); }
		public TerminalNode K_KEY() { return getToken(SQLParser.K_KEY, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public List<Indexed_columnContext> indexed_column() {
			return getRuleContexts(Indexed_columnContext.class);
		}
		public Indexed_columnContext indexed_column(int i) {
			return getRuleContext(Indexed_columnContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public Table_constraint_primary_keyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_constraint_primary_key; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterTable_constraint_primary_key(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitTable_constraint_primary_key(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitTable_constraint_primary_key(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_constraint_primary_keyContext table_constraint_primary_key() throws RecognitionException {
		Table_constraint_primary_keyContext _localctx = new Table_constraint_primary_keyContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_table_constraint_primary_key);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2461);
			match(K_PRIMARY);
			setState(2462);
			match(K_KEY);
			setState(2463);
			match(OPEN_PAR);
			setState(2464);
			indexed_column();
			setState(2469);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2465);
				match(COMMA);
				setState(2466);
				indexed_column();
				}
				}
				setState(2471);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2472);
			match(CLOSE_PAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_constraint_foreign_keyContext extends ParserRuleContext {
		public TerminalNode K_FOREIGN() { return getToken(SQLParser.K_FOREIGN, 0); }
		public TerminalNode K_KEY() { return getToken(SQLParser.K_KEY, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public List<Fk_origin_column_nameContext> fk_origin_column_name() {
			return getRuleContexts(Fk_origin_column_nameContext.class);
		}
		public Fk_origin_column_nameContext fk_origin_column_name(int i) {
			return getRuleContext(Fk_origin_column_nameContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public Foreign_key_clauseContext foreign_key_clause() {
			return getRuleContext(Foreign_key_clauseContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public Table_constraint_foreign_keyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_constraint_foreign_key; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterTable_constraint_foreign_key(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitTable_constraint_foreign_key(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitTable_constraint_foreign_key(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_constraint_foreign_keyContext table_constraint_foreign_key() throws RecognitionException {
		Table_constraint_foreign_keyContext _localctx = new Table_constraint_foreign_keyContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_table_constraint_foreign_key);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2474);
			match(K_FOREIGN);
			setState(2475);
			match(K_KEY);
			setState(2476);
			match(OPEN_PAR);
			setState(2477);
			fk_origin_column_name();
			setState(2482);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2478);
				match(COMMA);
				setState(2479);
				fk_origin_column_name();
				}
				}
				setState(2484);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2485);
			match(CLOSE_PAR);
			setState(2486);
			foreign_key_clause();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_constraint_uniqueContext extends ParserRuleContext {
		public TerminalNode K_UNIQUE() { return getToken(SQLParser.K_UNIQUE, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public List<Indexed_columnContext> indexed_column() {
			return getRuleContexts(Indexed_columnContext.class);
		}
		public Indexed_columnContext indexed_column(int i) {
			return getRuleContext(Indexed_columnContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public TerminalNode K_KEY() { return getToken(SQLParser.K_KEY, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public Table_constraint_uniqueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_constraint_unique; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterTable_constraint_unique(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitTable_constraint_unique(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitTable_constraint_unique(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_constraint_uniqueContext table_constraint_unique() throws RecognitionException {
		Table_constraint_uniqueContext _localctx = new Table_constraint_uniqueContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_table_constraint_unique);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2488);
			match(K_UNIQUE);
			setState(2490);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,329,_ctx) ) {
			case 1:
				{
				setState(2489);
				match(K_KEY);
				}
				break;
			}
			setState(2493);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,330,_ctx) ) {
			case 1:
				{
				setState(2492);
				name();
				}
				break;
			}
			setState(2495);
			match(OPEN_PAR);
			setState(2496);
			indexed_column();
			setState(2501);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2497);
				match(COMMA);
				setState(2498);
				indexed_column();
				}
				}
				setState(2503);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2504);
			match(CLOSE_PAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_constraint_keyContext extends ParserRuleContext {
		public TerminalNode K_KEY() { return getToken(SQLParser.K_KEY, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public List<Indexed_columnContext> indexed_column() {
			return getRuleContexts(Indexed_columnContext.class);
		}
		public Indexed_columnContext indexed_column(int i) {
			return getRuleContext(Indexed_columnContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public Table_constraint_keyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_constraint_key; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterTable_constraint_key(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitTable_constraint_key(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitTable_constraint_key(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_constraint_keyContext table_constraint_key() throws RecognitionException {
		Table_constraint_keyContext _localctx = new Table_constraint_keyContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_table_constraint_key);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2506);
			match(K_KEY);
			setState(2508);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,332,_ctx) ) {
			case 1:
				{
				setState(2507);
				name();
				}
				break;
			}
			setState(2510);
			match(OPEN_PAR);
			setState(2511);
			indexed_column();
			setState(2516);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2512);
				match(COMMA);
				setState(2513);
				indexed_column();
				}
				}
				setState(2518);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2519);
			match(CLOSE_PAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Fk_origin_column_nameContext extends ParserRuleContext {
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public Fk_origin_column_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fk_origin_column_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterFk_origin_column_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitFk_origin_column_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitFk_origin_column_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Fk_origin_column_nameContext fk_origin_column_name() throws RecognitionException {
		Fk_origin_column_nameContext _localctx = new Fk_origin_column_nameContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_fk_origin_column_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2521);
			column_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Qualified_table_nameContext extends ParserRuleContext {
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SQLParser.DOT, 0); }
		public TerminalNode K_INDEXED() { return getToken(SQLParser.K_INDEXED, 0); }
		public TerminalNode K_BY() { return getToken(SQLParser.K_BY, 0); }
		public Index_nameContext index_name() {
			return getRuleContext(Index_nameContext.class,0);
		}
		public TerminalNode K_NOT() { return getToken(SQLParser.K_NOT, 0); }
		public Qualified_table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualified_table_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterQualified_table_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitQualified_table_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitQualified_table_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Qualified_table_nameContext qualified_table_name() throws RecognitionException {
		Qualified_table_nameContext _localctx = new Qualified_table_nameContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_qualified_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2526);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,334,_ctx) ) {
			case 1:
				{
				setState(2523);
				database_name();
				setState(2524);
				match(DOT);
				}
				break;
			}
			setState(2528);
			table_name();
			setState(2534);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_INDEXED:
				{
				setState(2529);
				match(K_INDEXED);
				setState(2530);
				match(K_BY);
				setState(2531);
				index_name();
				}
				break;
			case K_NOT:
				{
				setState(2532);
				match(K_NOT);
				setState(2533);
				match(K_INDEXED);
				}
				break;
			case EOF:
			case T__3:
			case SCOL:
			case OPEN_PAR:
			case ASSIGN:
			case PLUS:
			case MINUS:
			case K_ALTER:
			case K_CASE:
			case K_CONTINUE:
			case K_CREATE:
			case K_DEFAULT:
			case K_DELETE:
			case K_DROP:
			case K_ELSE:
			case K_FOR:
			case K_IF:
			case K_INSERT:
			case K_SELECT:
			case K_SET:
			case K_UPDATE:
			case K_VALUES:
			case K_WHERE:
			case K_VAR:
			case K_RETURN:
			case K_WHILE:
			case K_SWITCH:
			case K_BREAK:
			case K_DO:
			case K_PRINT:
			case IDENTIFIER:
			case STRING_LITERAL:
			case UNEXPECTED_CHAR:
				break;
			default:
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Ordering_termContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode K_COLLATE() { return getToken(SQLParser.K_COLLATE, 0); }
		public Collation_nameContext collation_name() {
			return getRuleContext(Collation_nameContext.class,0);
		}
		public TerminalNode K_ASC() { return getToken(SQLParser.K_ASC, 0); }
		public TerminalNode K_DESC() { return getToken(SQLParser.K_DESC, 0); }
		public Ordering_termContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ordering_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterOrdering_term(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitOrdering_term(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitOrdering_term(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ordering_termContext ordering_term() throws RecognitionException {
		Ordering_termContext _localctx = new Ordering_termContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_ordering_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2536);
			expr(0);
			setState(2539);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_COLLATE) {
				{
				setState(2537);
				match(K_COLLATE);
				setState(2538);
				collation_name();
				}
			}

			setState(2542);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ASC || _la==K_DESC) {
				{
				setState(2541);
				_la = _input.LA(1);
				if ( !(_la==K_ASC || _la==K_DESC) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pragma_valueContext extends ParserRuleContext {
		public Signed_numberContext signed_number() {
			return getRuleContext(Signed_numberContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode STRING_LITERAL() { return getToken(SQLParser.STRING_LITERAL, 0); }
		public Pragma_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pragma_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterPragma_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitPragma_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitPragma_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pragma_valueContext pragma_value() throws RecognitionException {
		Pragma_valueContext _localctx = new Pragma_valueContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_pragma_value);
		try {
			setState(2547);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,338,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2544);
				signed_number();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2545);
				name();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2546);
				match(STRING_LITERAL);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Common_table_expressionContext extends ParserRuleContext {
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode K_AS() { return getToken(SQLParser.K_AS, 0); }
		public List<TerminalNode> OPEN_PAR() { return getTokens(SQLParser.OPEN_PAR); }
		public TerminalNode OPEN_PAR(int i) {
			return getToken(SQLParser.OPEN_PAR, i);
		}
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public List<TerminalNode> CLOSE_PAR() { return getTokens(SQLParser.CLOSE_PAR); }
		public TerminalNode CLOSE_PAR(int i) {
			return getToken(SQLParser.CLOSE_PAR, i);
		}
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public Common_table_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_common_table_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterCommon_table_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitCommon_table_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitCommon_table_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Common_table_expressionContext common_table_expression() throws RecognitionException {
		Common_table_expressionContext _localctx = new Common_table_expressionContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_common_table_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2549);
			table_name();
			setState(2561);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(2550);
				match(OPEN_PAR);
				setState(2551);
				column_name();
				setState(2556);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(2552);
					match(COMMA);
					setState(2553);
					column_name();
					}
					}
					setState(2558);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2559);
				match(CLOSE_PAR);
				}
			}

			setState(2563);
			match(K_AS);
			setState(2564);
			match(OPEN_PAR);
			setState(2565);
			select_stmt();
			setState(2566);
			match(CLOSE_PAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Result_columnContext extends ParserRuleContext {
		public TerminalNode STAR() { return getToken(SQLParser.STAR, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SQLParser.DOT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Column_aliasContext column_alias() {
			return getRuleContext(Column_aliasContext.class,0);
		}
		public TerminalNode K_AS() { return getToken(SQLParser.K_AS, 0); }
		public Result_columnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_result_column; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterResult_column(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitResult_column(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitResult_column(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Result_columnContext result_column() throws RecognitionException {
		Result_columnContext _localctx = new Result_columnContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_result_column);
		int _la;
		try {
			setState(2580);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,343,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2568);
				match(STAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2569);
				table_name();
				setState(2570);
				match(DOT);
				setState(2571);
				match(STAR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2573);
				expr(0);
				setState(2578);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,342,_ctx) ) {
				case 1:
					{
					setState(2575);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_AS) {
						{
						setState(2574);
						match(K_AS);
						}
					}

					setState(2577);
					column_alias();
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_or_subqueryContext extends ParserRuleContext {
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SQLParser.DOT, 0); }
		public Table_aliasContext table_alias() {
			return getRuleContext(Table_aliasContext.class,0);
		}
		public TerminalNode K_INDEXED() { return getToken(SQLParser.K_INDEXED, 0); }
		public TerminalNode K_BY() { return getToken(SQLParser.K_BY, 0); }
		public Index_nameContext index_name() {
			return getRuleContext(Index_nameContext.class,0);
		}
		public TerminalNode K_NOT() { return getToken(SQLParser.K_NOT, 0); }
		public TerminalNode K_AS() { return getToken(SQLParser.K_AS, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public List<Table_or_subqueryContext> table_or_subquery() {
			return getRuleContexts(Table_or_subqueryContext.class);
		}
		public Table_or_subqueryContext table_or_subquery(int i) {
			return getRuleContext(Table_or_subqueryContext.class,i);
		}
		public Join_clauseContext join_clause() {
			return getRuleContext(Join_clauseContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public Table_or_subqueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_or_subquery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterTable_or_subquery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitTable_or_subquery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitTable_or_subquery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_or_subqueryContext table_or_subquery() throws RecognitionException {
		Table_or_subqueryContext _localctx = new Table_or_subqueryContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_table_or_subquery);
		int _la;
		try {
			setState(2629);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,354,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2585);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,344,_ctx) ) {
				case 1:
					{
					setState(2582);
					database_name();
					setState(2583);
					match(DOT);
					}
					break;
				}
				setState(2587);
				table_name();
				setState(2592);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,346,_ctx) ) {
				case 1:
					{
					setState(2589);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,345,_ctx) ) {
					case 1:
						{
						setState(2588);
						match(K_AS);
						}
						break;
					}
					setState(2591);
					table_alias();
					}
					break;
				}
				setState(2599);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case K_INDEXED:
					{
					setState(2594);
					match(K_INDEXED);
					setState(2595);
					match(K_BY);
					setState(2596);
					index_name();
					}
					break;
				case K_NOT:
					{
					setState(2597);
					match(K_NOT);
					setState(2598);
					match(K_INDEXED);
					}
					break;
				case EOF:
				case T__3:
				case SCOL:
				case OPEN_PAR:
				case CLOSE_PAR:
				case COMMA:
				case ASSIGN:
				case PLUS:
				case MINUS:
				case K_ALTER:
				case K_CASE:
				case K_CONTINUE:
				case K_CREATE:
				case K_DEFAULT:
				case K_DELETE:
				case K_DROP:
				case K_ELSE:
				case K_FOR:
				case K_GROUP:
				case K_IF:
				case K_INNER:
				case K_INSERT:
				case K_JOIN:
				case K_LEFT:
				case K_LIMIT:
				case K_ON:
				case K_ORDER:
				case K_SELECT:
				case K_UPDATE:
				case K_VALUES:
				case K_WHERE:
				case K_VAR:
				case K_RETURN:
				case K_WHILE:
				case K_SWITCH:
				case K_BREAK:
				case K_DO:
				case K_PRINT:
				case IDENTIFIER:
				case STRING_LITERAL:
				case UNEXPECTED_CHAR:
					break;
				default:
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2601);
				match(OPEN_PAR);
				setState(2611);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,349,_ctx) ) {
				case 1:
					{
					setState(2602);
					table_or_subquery();
					setState(2607);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(2603);
						match(COMMA);
						setState(2604);
						table_or_subquery();
						}
						}
						setState(2609);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case 2:
					{
					setState(2610);
					join_clause();
					}
					break;
				}
				setState(2613);
				match(CLOSE_PAR);
				setState(2618);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,351,_ctx) ) {
				case 1:
					{
					setState(2615);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,350,_ctx) ) {
					case 1:
						{
						setState(2614);
						match(K_AS);
						}
						break;
					}
					setState(2617);
					table_alias();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2620);
				match(OPEN_PAR);
				setState(2621);
				select_stmt();
				setState(2622);
				match(CLOSE_PAR);
				setState(2627);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,353,_ctx) ) {
				case 1:
					{
					setState(2624);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,352,_ctx) ) {
					case 1:
						{
						setState(2623);
						match(K_AS);
						}
						break;
					}
					setState(2626);
					table_alias();
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Join_clauseContext extends ParserRuleContext {
		public List<Table_or_subqueryContext> table_or_subquery() {
			return getRuleContexts(Table_or_subqueryContext.class);
		}
		public Table_or_subqueryContext table_or_subquery(int i) {
			return getRuleContext(Table_or_subqueryContext.class,i);
		}
		public List<Join_operatorContext> join_operator() {
			return getRuleContexts(Join_operatorContext.class);
		}
		public Join_operatorContext join_operator(int i) {
			return getRuleContext(Join_operatorContext.class,i);
		}
		public List<Join_constraintContext> join_constraint() {
			return getRuleContexts(Join_constraintContext.class);
		}
		public Join_constraintContext join_constraint(int i) {
			return getRuleContext(Join_constraintContext.class,i);
		}
		public Join_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_join_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterJoin_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitJoin_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitJoin_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Join_clauseContext join_clause() throws RecognitionException {
		Join_clauseContext _localctx = new Join_clauseContext(_ctx, getState());
		enterRule(_localctx, 258, RULE_join_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2631);
			table_or_subquery();
			setState(2638);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA || ((((_la - 112)) & ~0x3f) == 0 && ((1L << (_la - 112)) & ((1L << (K_INNER - 112)) | (1L << (K_JOIN - 112)) | (1L << (K_LEFT - 112)))) != 0)) {
				{
				{
				setState(2632);
				join_operator();
				setState(2633);
				table_or_subquery();
				setState(2634);
				join_constraint();
				}
				}
				setState(2640);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Join_operatorContext extends ParserRuleContext {
		public TerminalNode COMMA() { return getToken(SQLParser.COMMA, 0); }
		public TerminalNode K_JOIN() { return getToken(SQLParser.K_JOIN, 0); }
		public TerminalNode K_LEFT() { return getToken(SQLParser.K_LEFT, 0); }
		public TerminalNode K_INNER() { return getToken(SQLParser.K_INNER, 0); }
		public TerminalNode K_OUTER() { return getToken(SQLParser.K_OUTER, 0); }
		public Join_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_join_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterJoin_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitJoin_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitJoin_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Join_operatorContext join_operator() throws RecognitionException {
		Join_operatorContext _localctx = new Join_operatorContext(_ctx, getState());
		enterRule(_localctx, 260, RULE_join_operator);
		int _la;
		try {
			setState(2650);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(2641);
				match(COMMA);
				}
				break;
			case K_INNER:
			case K_JOIN:
			case K_LEFT:
				enterOuterAlt(_localctx, 2);
				{
				setState(2647);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case K_LEFT:
					{
					setState(2642);
					match(K_LEFT);
					setState(2644);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_OUTER) {
						{
						setState(2643);
						match(K_OUTER);
						}
					}

					}
					break;
				case K_INNER:
					{
					setState(2646);
					match(K_INNER);
					}
					break;
				case K_JOIN:
					break;
				default:
					break;
				}
				setState(2649);
				match(K_JOIN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Join_constraintContext extends ParserRuleContext {
		public TerminalNode K_ON() { return getToken(SQLParser.K_ON, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Join_constraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_join_constraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterJoin_constraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitJoin_constraint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitJoin_constraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Join_constraintContext join_constraint() throws RecognitionException {
		Join_constraintContext _localctx = new Join_constraintContext(_ctx, getState());
		enterRule(_localctx, 262, RULE_join_constraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2654);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ON) {
				{
				setState(2652);
				match(K_ON);
				setState(2653);
				expr(0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Select_coreContext extends ParserRuleContext {
		public TerminalNode K_SELECT() { return getToken(SQLParser.K_SELECT, 0); }
		public List<Result_columnContext> result_column() {
			return getRuleContexts(Result_columnContext.class);
		}
		public Result_columnContext result_column(int i) {
			return getRuleContext(Result_columnContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public TerminalNode K_FROM() { return getToken(SQLParser.K_FROM, 0); }
		public TerminalNode K_WHERE() { return getToken(SQLParser.K_WHERE, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode K_GROUP() { return getToken(SQLParser.K_GROUP, 0); }
		public TerminalNode K_BY() { return getToken(SQLParser.K_BY, 0); }
		public TerminalNode K_DISTINCT() { return getToken(SQLParser.K_DISTINCT, 0); }
		public TerminalNode K_ALL() { return getToken(SQLParser.K_ALL, 0); }
		public List<Table_or_subqueryContext> table_or_subquery() {
			return getRuleContexts(Table_or_subqueryContext.class);
		}
		public Table_or_subqueryContext table_or_subquery(int i) {
			return getRuleContext(Table_or_subqueryContext.class,i);
		}
		public Join_clauseContext join_clause() {
			return getRuleContext(Join_clauseContext.class,0);
		}
		public TerminalNode K_HAVING() { return getToken(SQLParser.K_HAVING, 0); }
		public TerminalNode K_VALUES() { return getToken(SQLParser.K_VALUES, 0); }
		public List<TerminalNode> OPEN_PAR() { return getTokens(SQLParser.OPEN_PAR); }
		public TerminalNode OPEN_PAR(int i) {
			return getToken(SQLParser.OPEN_PAR, i);
		}
		public List<TerminalNode> CLOSE_PAR() { return getTokens(SQLParser.CLOSE_PAR); }
		public TerminalNode CLOSE_PAR(int i) {
			return getToken(SQLParser.CLOSE_PAR, i);
		}
		public Select_coreContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_core; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterSelect_core(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitSelect_core(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitSelect_core(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_coreContext select_core() throws RecognitionException {
		Select_coreContext _localctx = new Select_coreContext(_ctx, getState());
		enterRule(_localctx, 264, RULE_select_core);
		int _la;
		try {
			setState(2730);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_SELECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(2656);
				match(K_SELECT);
				setState(2658);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,360,_ctx) ) {
				case 1:
					{
					setState(2657);
					_la = _input.LA(1);
					if ( !(_la==K_ALL || _la==K_DISTINCT) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				}
				setState(2660);
				result_column();
				setState(2665);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(2661);
					match(COMMA);
					setState(2662);
					result_column();
					}
					}
					setState(2667);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2680);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_FROM) {
					{
					setState(2668);
					match(K_FROM);
					setState(2678);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,363,_ctx) ) {
					case 1:
						{
						setState(2669);
						table_or_subquery();
						setState(2674);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==COMMA) {
							{
							{
							setState(2670);
							match(COMMA);
							setState(2671);
							table_or_subquery();
							}
							}
							setState(2676);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
						break;
					case 2:
						{
						setState(2677);
						join_clause();
						}
						break;
					}
					}
				}

				setState(2684);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_WHERE) {
					{
					setState(2682);
					match(K_WHERE);
					setState(2683);
					expr(0);
					}
				}

				setState(2700);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_GROUP) {
					{
					setState(2686);
					match(K_GROUP);
					setState(2687);
					match(K_BY);
					setState(2688);
					expr(0);
					setState(2693);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(2689);
						match(COMMA);
						setState(2690);
						expr(0);
						}
						}
						setState(2695);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2698);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_HAVING) {
						{
						setState(2696);
						match(K_HAVING);
						setState(2697);
						expr(0);
						}
					}

					}
				}

				}
				break;
			case K_VALUES:
				enterOuterAlt(_localctx, 2);
				{
				setState(2702);
				match(K_VALUES);
				setState(2703);
				match(OPEN_PAR);
				setState(2704);
				expr(0);
				setState(2709);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(2705);
					match(COMMA);
					setState(2706);
					expr(0);
					}
					}
					setState(2711);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2712);
				match(CLOSE_PAR);
				setState(2727);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(2713);
					match(COMMA);
					setState(2714);
					match(OPEN_PAR);
					setState(2715);
					expr(0);
					setState(2720);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(2716);
						match(COMMA);
						setState(2717);
						expr(0);
						}
						}
						setState(2722);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2723);
					match(CLOSE_PAR);
					}
					}
					setState(2729);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cte_table_nameContext extends ParserRuleContext {
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public Cte_table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cte_table_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterCte_table_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitCte_table_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitCte_table_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cte_table_nameContext cte_table_name() throws RecognitionException {
		Cte_table_nameContext _localctx = new Cte_table_nameContext(_ctx, getState());
		enterRule(_localctx, 266, RULE_cte_table_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2732);
			table_name();
			setState(2744);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(2733);
				match(OPEN_PAR);
				setState(2734);
				column_name();
				setState(2739);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(2735);
					match(COMMA);
					setState(2736);
					column_name();
					}
					}
					setState(2741);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2742);
				match(CLOSE_PAR);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Signed_numberContext extends ParserRuleContext {
		public TerminalNode NUMERIC_LITERAL() { return getToken(SQLParser.NUMERIC_LITERAL, 0); }
		public TerminalNode STAR() { return getToken(SQLParser.STAR, 0); }
		public TerminalNode PLUS() { return getToken(SQLParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(SQLParser.MINUS, 0); }
		public Signed_numberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signed_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterSigned_number(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitSigned_number(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitSigned_number(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Signed_numberContext signed_number() throws RecognitionException {
		Signed_numberContext _localctx = new Signed_numberContext(_ctx, getState());
		enterRule(_localctx, 268, RULE_signed_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2751);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
			case MINUS:
			case NUMERIC_LITERAL:
				{
				setState(2747);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PLUS || _la==MINUS) {
					{
					setState(2746);
					_la = _input.LA(1);
					if ( !(_la==PLUS || _la==MINUS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(2749);
				match(NUMERIC_LITERAL);
				}
				break;
			case STAR:
				{
				setState(2750);
				match(STAR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Literal_valueContext extends ParserRuleContext {
		public TerminalNode NUMERIC_LITERAL() { return getToken(SQLParser.NUMERIC_LITERAL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(SQLParser.STRING_LITERAL, 0); }
		public TerminalNode BLOB_LITERAL() { return getToken(SQLParser.BLOB_LITERAL, 0); }
		public TerminalNode K_NULL() { return getToken(SQLParser.K_NULL, 0); }
		public TerminalNode K_CURRENT_TIME() { return getToken(SQLParser.K_CURRENT_TIME, 0); }
		public TerminalNode K_CURRENT_DATE() { return getToken(SQLParser.K_CURRENT_DATE, 0); }
		public TerminalNode K_CURRENT_TIMESTAMP() { return getToken(SQLParser.K_CURRENT_TIMESTAMP, 0); }
		public Literal_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterLiteral_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitLiteral_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitLiteral_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Literal_valueContext literal_value() throws RecognitionException {
		Literal_valueContext _localctx = new Literal_valueContext(_ctx, getState());
		enterRule(_localctx, 270, RULE_literal_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2753);
			_la = _input.LA(1);
			if ( !(((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & ((1L << (K_CURRENT_DATE - 76)) | (1L << (K_CURRENT_TIME - 76)) | (1L << (K_CURRENT_TIMESTAMP - 76)) | (1L << (K_NULL - 76)))) != 0) || ((((_la - 197)) & ~0x3f) == 0 && ((1L << (_la - 197)) & ((1L << (NUMERIC_LITERAL - 197)) | (1L << (STRING_LITERAL - 197)) | (1L << (BLOB_LITERAL - 197)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Unary_operatorContext extends ParserRuleContext {
		public TerminalNode MINUS() { return getToken(SQLParser.MINUS, 0); }
		public TerminalNode PLUS() { return getToken(SQLParser.PLUS, 0); }
		public TerminalNode TILDE() { return getToken(SQLParser.TILDE, 0); }
		public TerminalNode K_NOT() { return getToken(SQLParser.K_NOT, 0); }
		public Unary_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterUnary_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitUnary_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitUnary_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Unary_operatorContext unary_operator() throws RecognitionException {
		Unary_operatorContext _localctx = new Unary_operatorContext(_ctx, getState());
		enterRule(_localctx, 272, RULE_unary_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2755);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << TILDE))) != 0) || _la==K_NOT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Error_messageContext extends ParserRuleContext {
		public TerminalNode STRING_LITERAL() { return getToken(SQLParser.STRING_LITERAL, 0); }
		public Error_messageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_error_message; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterError_message(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitError_message(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitError_message(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Error_messageContext error_message() throws RecognitionException {
		Error_messageContext _localctx = new Error_messageContext(_ctx, getState());
		enterRule(_localctx, 274, RULE_error_message);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2757);
			match(STRING_LITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Module_argumentContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Column_defContext column_def() {
			return getRuleContext(Column_defContext.class,0);
		}
		public Module_argumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_module_argument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterModule_argument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitModule_argument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitModule_argument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Module_argumentContext module_argument() throws RecognitionException {
		Module_argumentContext _localctx = new Module_argumentContext(_ctx, getState());
		enterRule(_localctx, 276, RULE_module_argument);
		try {
			setState(2761);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,377,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2759);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2760);
				column_def();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_aliasContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SQLParser.IDENTIFIER, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(SQLParser.STRING_LITERAL, 0); }
		public Column_aliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_alias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterColumn_alias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitColumn_alias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitColumn_alias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_aliasContext column_alias() throws RecognitionException {
		Column_aliasContext _localctx = new Column_aliasContext(_ctx, getState());
		enterRule(_localctx, 278, RULE_column_alias);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2763);
			_la = _input.LA(1);
			if ( !(_la==IDENTIFIER || _la==STRING_LITERAL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KeywordContext extends ParserRuleContext {
		public TerminalNode K_ABORT() { return getToken(SQLParser.K_ABORT, 0); }
		public TerminalNode K_ACTION() { return getToken(SQLParser.K_ACTION, 0); }
		public TerminalNode K_ADD() { return getToken(SQLParser.K_ADD, 0); }
		public TerminalNode K_AFTER() { return getToken(SQLParser.K_AFTER, 0); }
		public TerminalNode K_ALL() { return getToken(SQLParser.K_ALL, 0); }
		public TerminalNode K_ALTER() { return getToken(SQLParser.K_ALTER, 0); }
		public TerminalNode K_ANALYZE() { return getToken(SQLParser.K_ANALYZE, 0); }
		public TerminalNode K_AND() { return getToken(SQLParser.K_AND, 0); }
		public TerminalNode K_AS() { return getToken(SQLParser.K_AS, 0); }
		public TerminalNode K_ASC() { return getToken(SQLParser.K_ASC, 0); }
		public TerminalNode K_ATTACH() { return getToken(SQLParser.K_ATTACH, 0); }
		public TerminalNode K_AUTOINCREMENT() { return getToken(SQLParser.K_AUTOINCREMENT, 0); }
		public TerminalNode K_BEFORE() { return getToken(SQLParser.K_BEFORE, 0); }
		public TerminalNode K_BEGIN() { return getToken(SQLParser.K_BEGIN, 0); }
		public TerminalNode K_BETWEEN() { return getToken(SQLParser.K_BETWEEN, 0); }
		public TerminalNode K_BY() { return getToken(SQLParser.K_BY, 0); }
		public TerminalNode K_CASCADE() { return getToken(SQLParser.K_CASCADE, 0); }
		public TerminalNode K_CASE() { return getToken(SQLParser.K_CASE, 0); }
		public TerminalNode K_CAST() { return getToken(SQLParser.K_CAST, 0); }
		public TerminalNode K_CHECK() { return getToken(SQLParser.K_CHECK, 0); }
		public TerminalNode K_COLLATE() { return getToken(SQLParser.K_COLLATE, 0); }
		public TerminalNode K_COLUMN() { return getToken(SQLParser.K_COLUMN, 0); }
		public TerminalNode K_COMMIT() { return getToken(SQLParser.K_COMMIT, 0); }
		public TerminalNode K_CONFLICT() { return getToken(SQLParser.K_CONFLICT, 0); }
		public TerminalNode K_CONSTRAINT() { return getToken(SQLParser.K_CONSTRAINT, 0); }
		public TerminalNode K_CREATE() { return getToken(SQLParser.K_CREATE, 0); }
		public TerminalNode K_CROSS() { return getToken(SQLParser.K_CROSS, 0); }
		public TerminalNode K_CURRENT_DATE() { return getToken(SQLParser.K_CURRENT_DATE, 0); }
		public TerminalNode K_CURRENT_TIME() { return getToken(SQLParser.K_CURRENT_TIME, 0); }
		public TerminalNode K_CURRENT_TIMESTAMP() { return getToken(SQLParser.K_CURRENT_TIMESTAMP, 0); }
		public TerminalNode K_DATABASE() { return getToken(SQLParser.K_DATABASE, 0); }
		public TerminalNode K_DEFAULT() { return getToken(SQLParser.K_DEFAULT, 0); }
		public TerminalNode K_DEFERRABLE() { return getToken(SQLParser.K_DEFERRABLE, 0); }
		public TerminalNode K_DEFERRED() { return getToken(SQLParser.K_DEFERRED, 0); }
		public TerminalNode K_DELETE() { return getToken(SQLParser.K_DELETE, 0); }
		public TerminalNode K_DESC() { return getToken(SQLParser.K_DESC, 0); }
		public TerminalNode K_DETACH() { return getToken(SQLParser.K_DETACH, 0); }
		public TerminalNode K_DISTINCT() { return getToken(SQLParser.K_DISTINCT, 0); }
		public TerminalNode K_DROP() { return getToken(SQLParser.K_DROP, 0); }
		public TerminalNode K_EACH() { return getToken(SQLParser.K_EACH, 0); }
		public TerminalNode K_ELSE() { return getToken(SQLParser.K_ELSE, 0); }
		public TerminalNode K_END() { return getToken(SQLParser.K_END, 0); }
		public TerminalNode K_ENABLE() { return getToken(SQLParser.K_ENABLE, 0); }
		public TerminalNode K_ESCAPE() { return getToken(SQLParser.K_ESCAPE, 0); }
		public TerminalNode K_EXCEPT() { return getToken(SQLParser.K_EXCEPT, 0); }
		public TerminalNode K_EXCLUSIVE() { return getToken(SQLParser.K_EXCLUSIVE, 0); }
		public TerminalNode K_EXISTS() { return getToken(SQLParser.K_EXISTS, 0); }
		public TerminalNode K_EXPLAIN() { return getToken(SQLParser.K_EXPLAIN, 0); }
		public TerminalNode K_FAIL() { return getToken(SQLParser.K_FAIL, 0); }
		public TerminalNode K_FOR() { return getToken(SQLParser.K_FOR, 0); }
		public TerminalNode K_FOREIGN() { return getToken(SQLParser.K_FOREIGN, 0); }
		public TerminalNode K_FROM() { return getToken(SQLParser.K_FROM, 0); }
		public TerminalNode K_FULL() { return getToken(SQLParser.K_FULL, 0); }
		public TerminalNode K_GLOB() { return getToken(SQLParser.K_GLOB, 0); }
		public TerminalNode K_GROUP() { return getToken(SQLParser.K_GROUP, 0); }
		public TerminalNode K_HAVING() { return getToken(SQLParser.K_HAVING, 0); }
		public TerminalNode K_IF() { return getToken(SQLParser.K_IF, 0); }
		public TerminalNode K_IGNORE() { return getToken(SQLParser.K_IGNORE, 0); }
		public TerminalNode K_IMMEDIATE() { return getToken(SQLParser.K_IMMEDIATE, 0); }
		public TerminalNode K_IN() { return getToken(SQLParser.K_IN, 0); }
		public TerminalNode K_INDEX() { return getToken(SQLParser.K_INDEX, 0); }
		public TerminalNode K_INDEXED() { return getToken(SQLParser.K_INDEXED, 0); }
		public TerminalNode K_INITIALLY() { return getToken(SQLParser.K_INITIALLY, 0); }
		public TerminalNode K_INNER() { return getToken(SQLParser.K_INNER, 0); }
		public TerminalNode K_INSERT() { return getToken(SQLParser.K_INSERT, 0); }
		public TerminalNode K_INSTEAD() { return getToken(SQLParser.K_INSTEAD, 0); }
		public TerminalNode K_INTERSECT() { return getToken(SQLParser.K_INTERSECT, 0); }
		public TerminalNode K_INTO() { return getToken(SQLParser.K_INTO, 0); }
		public TerminalNode K_IS() { return getToken(SQLParser.K_IS, 0); }
		public TerminalNode K_ISNULL() { return getToken(SQLParser.K_ISNULL, 0); }
		public TerminalNode K_JOIN() { return getToken(SQLParser.K_JOIN, 0); }
		public TerminalNode K_KEY() { return getToken(SQLParser.K_KEY, 0); }
		public TerminalNode K_LEFT() { return getToken(SQLParser.K_LEFT, 0); }
		public TerminalNode K_LIKE() { return getToken(SQLParser.K_LIKE, 0); }
		public TerminalNode K_LIMIT() { return getToken(SQLParser.K_LIMIT, 0); }
		public TerminalNode K_MATCH() { return getToken(SQLParser.K_MATCH, 0); }
		public TerminalNode K_NATURAL() { return getToken(SQLParser.K_NATURAL, 0); }
		public TerminalNode K_NO() { return getToken(SQLParser.K_NO, 0); }
		public TerminalNode K_NOT() { return getToken(SQLParser.K_NOT, 0); }
		public TerminalNode K_NOTNULL() { return getToken(SQLParser.K_NOTNULL, 0); }
		public TerminalNode K_NULL() { return getToken(SQLParser.K_NULL, 0); }
		public TerminalNode K_OF() { return getToken(SQLParser.K_OF, 0); }
		public TerminalNode K_OFFSET() { return getToken(SQLParser.K_OFFSET, 0); }
		public TerminalNode K_ON() { return getToken(SQLParser.K_ON, 0); }
		public TerminalNode K_OR() { return getToken(SQLParser.K_OR, 0); }
		public TerminalNode K_ORDER() { return getToken(SQLParser.K_ORDER, 0); }
		public TerminalNode K_OUTER() { return getToken(SQLParser.K_OUTER, 0); }
		public TerminalNode K_PLAN() { return getToken(SQLParser.K_PLAN, 0); }
		public TerminalNode K_PRAGMA() { return getToken(SQLParser.K_PRAGMA, 0); }
		public TerminalNode K_PRIMARY() { return getToken(SQLParser.K_PRIMARY, 0); }
		public TerminalNode K_QUERY() { return getToken(SQLParser.K_QUERY, 0); }
		public TerminalNode K_RAISE() { return getToken(SQLParser.K_RAISE, 0); }
		public TerminalNode K_RECURSIVE() { return getToken(SQLParser.K_RECURSIVE, 0); }
		public TerminalNode K_REFERENCES() { return getToken(SQLParser.K_REFERENCES, 0); }
		public TerminalNode K_REGEXP() { return getToken(SQLParser.K_REGEXP, 0); }
		public TerminalNode K_REINDEX() { return getToken(SQLParser.K_REINDEX, 0); }
		public TerminalNode K_RELEASE() { return getToken(SQLParser.K_RELEASE, 0); }
		public TerminalNode K_RENAME() { return getToken(SQLParser.K_RENAME, 0); }
		public TerminalNode K_REPLACE() { return getToken(SQLParser.K_REPLACE, 0); }
		public TerminalNode K_RESTRICT() { return getToken(SQLParser.K_RESTRICT, 0); }
		public TerminalNode K_RIGHT() { return getToken(SQLParser.K_RIGHT, 0); }
		public TerminalNode K_ROLLBACK() { return getToken(SQLParser.K_ROLLBACK, 0); }
		public TerminalNode K_ROW() { return getToken(SQLParser.K_ROW, 0); }
		public TerminalNode K_SAVEPOINT() { return getToken(SQLParser.K_SAVEPOINT, 0); }
		public TerminalNode K_SELECT() { return getToken(SQLParser.K_SELECT, 0); }
		public TerminalNode K_SET() { return getToken(SQLParser.K_SET, 0); }
		public TerminalNode K_TABLE() { return getToken(SQLParser.K_TABLE, 0); }
		public TerminalNode K_TEMP() { return getToken(SQLParser.K_TEMP, 0); }
		public TerminalNode K_TEMPORARY() { return getToken(SQLParser.K_TEMPORARY, 0); }
		public TerminalNode K_THEN() { return getToken(SQLParser.K_THEN, 0); }
		public TerminalNode K_TO() { return getToken(SQLParser.K_TO, 0); }
		public TerminalNode K_TRANSACTION() { return getToken(SQLParser.K_TRANSACTION, 0); }
		public TerminalNode K_TRIGGER() { return getToken(SQLParser.K_TRIGGER, 0); }
		public TerminalNode K_UNION() { return getToken(SQLParser.K_UNION, 0); }
		public TerminalNode K_UNIQUE() { return getToken(SQLParser.K_UNIQUE, 0); }
		public TerminalNode K_UPDATE() { return getToken(SQLParser.K_UPDATE, 0); }
		public TerminalNode K_USING() { return getToken(SQLParser.K_USING, 0); }
		public TerminalNode K_VACUUM() { return getToken(SQLParser.K_VACUUM, 0); }
		public TerminalNode K_VALUES() { return getToken(SQLParser.K_VALUES, 0); }
		public TerminalNode K_VIEW() { return getToken(SQLParser.K_VIEW, 0); }
		public TerminalNode K_VIRTUAL() { return getToken(SQLParser.K_VIRTUAL, 0); }
		public TerminalNode K_WHEN() { return getToken(SQLParser.K_WHEN, 0); }
		public TerminalNode K_WHERE() { return getToken(SQLParser.K_WHERE, 0); }
		public TerminalNode K_WITH() { return getToken(SQLParser.K_WITH, 0); }
		public TerminalNode K_WITHOUT() { return getToken(SQLParser.K_WITHOUT, 0); }
		public TerminalNode K_NEXTVAL() { return getToken(SQLParser.K_NEXTVAL, 0); }
		public TerminalNode K_WHILE() { return getToken(SQLParser.K_WHILE, 0); }
		public TerminalNode K_SWITCH() { return getToken(SQLParser.K_SWITCH, 0); }
		public TerminalNode K_BREAK() { return getToken(SQLParser.K_BREAK, 0); }
		public TerminalNode K_DO() { return getToken(SQLParser.K_DO, 0); }
		public TerminalNode K_FUNCTION() { return getToken(SQLParser.K_FUNCTION, 0); }
		public TerminalNode K_RETURN() { return getToken(SQLParser.K_RETURN, 0); }
		public KeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterKeyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitKeyword(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitKeyword(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeywordContext keyword() throws RecognitionException {
		KeywordContext _localctx = new KeywordContext(_ctx, getState());
		enterRule(_localctx, 280, RULE_keyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2765);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << K_ABORT) | (1L << K_ACTION) | (1L << K_ADD) | (1L << K_AFTER) | (1L << K_ALL) | (1L << K_ALTER) | (1L << K_ANALYZE) | (1L << K_AND) | (1L << K_AS) | (1L << K_ASC) | (1L << K_ATTACH) | (1L << K_AUTOINCREMENT) | (1L << K_BEFORE) | (1L << K_BEGIN) | (1L << K_BETWEEN) | (1L << K_BY))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (K_CASCADE - 64)) | (1L << (K_CASE - 64)) | (1L << (K_CAST - 64)) | (1L << (K_CHECK - 64)) | (1L << (K_COLLATE - 64)) | (1L << (K_COLUMN - 64)) | (1L << (K_COMMIT - 64)) | (1L << (K_CONFLICT - 64)) | (1L << (K_CONSTRAINT - 64)) | (1L << (K_CREATE - 64)) | (1L << (K_CROSS - 64)) | (1L << (K_CURRENT_DATE - 64)) | (1L << (K_CURRENT_TIME - 64)) | (1L << (K_CURRENT_TIMESTAMP - 64)) | (1L << (K_DATABASE - 64)) | (1L << (K_DEFAULT - 64)) | (1L << (K_DEFERRABLE - 64)) | (1L << (K_DEFERRED - 64)) | (1L << (K_DELETE - 64)) | (1L << (K_DESC - 64)) | (1L << (K_DETACH - 64)) | (1L << (K_DISTINCT - 64)) | (1L << (K_DROP - 64)) | (1L << (K_EACH - 64)) | (1L << (K_ELSE - 64)) | (1L << (K_END - 64)) | (1L << (K_ENABLE - 64)) | (1L << (K_ESCAPE - 64)) | (1L << (K_EXCEPT - 64)) | (1L << (K_EXCLUSIVE - 64)) | (1L << (K_EXISTS - 64)) | (1L << (K_EXPLAIN - 64)) | (1L << (K_FAIL - 64)) | (1L << (K_FOR - 64)) | (1L << (K_FOREIGN - 64)) | (1L << (K_FROM - 64)) | (1L << (K_FULL - 64)) | (1L << (K_GLOB - 64)) | (1L << (K_GROUP - 64)) | (1L << (K_HAVING - 64)) | (1L << (K_IF - 64)) | (1L << (K_IGNORE - 64)) | (1L << (K_IMMEDIATE - 64)) | (1L << (K_IN - 64)) | (1L << (K_INDEX - 64)) | (1L << (K_INDEXED - 64)) | (1L << (K_INITIALLY - 64)) | (1L << (K_INNER - 64)) | (1L << (K_INSERT - 64)) | (1L << (K_INSTEAD - 64)) | (1L << (K_INTERSECT - 64)) | (1L << (K_INTO - 64)) | (1L << (K_IS - 64)) | (1L << (K_ISNULL - 64)) | (1L << (K_JOIN - 64)) | (1L << (K_KEY - 64)) | (1L << (K_LEFT - 64)) | (1L << (K_LIKE - 64)) | (1L << (K_LIMIT - 64)) | (1L << (K_MATCH - 64)) | (1L << (K_NATURAL - 64)) | (1L << (K_NEXTVAL - 64)) | (1L << (K_NO - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (K_NOT - 128)) | (1L << (K_NOTNULL - 128)) | (1L << (K_NULL - 128)) | (1L << (K_OF - 128)) | (1L << (K_OFFSET - 128)) | (1L << (K_ON - 128)) | (1L << (K_OR - 128)) | (1L << (K_ORDER - 128)) | (1L << (K_OUTER - 128)) | (1L << (K_PLAN - 128)) | (1L << (K_PRAGMA - 128)) | (1L << (K_PRIMARY - 128)) | (1L << (K_QUERY - 128)) | (1L << (K_RAISE - 128)) | (1L << (K_RECURSIVE - 128)) | (1L << (K_REFERENCES - 128)) | (1L << (K_REGEXP - 128)) | (1L << (K_REINDEX - 128)) | (1L << (K_RELEASE - 128)) | (1L << (K_RENAME - 128)) | (1L << (K_REPLACE - 128)) | (1L << (K_RESTRICT - 128)) | (1L << (K_RIGHT - 128)) | (1L << (K_ROLLBACK - 128)) | (1L << (K_ROW - 128)) | (1L << (K_SAVEPOINT - 128)) | (1L << (K_SELECT - 128)) | (1L << (K_SET - 128)) | (1L << (K_TABLE - 128)) | (1L << (K_TEMP - 128)) | (1L << (K_TEMPORARY - 128)) | (1L << (K_THEN - 128)) | (1L << (K_TO - 128)) | (1L << (K_TRANSACTION - 128)) | (1L << (K_TRIGGER - 128)) | (1L << (K_UNION - 128)) | (1L << (K_UNIQUE - 128)) | (1L << (K_UPDATE - 128)) | (1L << (K_USING - 128)) | (1L << (K_VACUUM - 128)) | (1L << (K_VALUES - 128)) | (1L << (K_VIEW - 128)) | (1L << (K_VIRTUAL - 128)) | (1L << (K_WHEN - 128)) | (1L << (K_WHERE - 128)) | (1L << (K_WITH - 128)) | (1L << (K_WITHOUT - 128)) | (1L << (K_RETURN - 128)) | (1L << (K_WHILE - 128)) | (1L << (K_SWITCH - 128)) | (1L << (K_BREAK - 128)) | (1L << (K_DO - 128)) | (1L << (K_FUNCTION - 128)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnknownContext extends ParserRuleContext {
		public UnknownContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unknown; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterUnknown(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitUnknown(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitUnknown(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnknownContext unknown() throws RecognitionException {
		UnknownContext _localctx = new UnknownContext(_ctx, getState());
		enterRule(_localctx, 282, RULE_unknown);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2768); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2767);
				matchWildcard();
				}
				}
				setState(2770); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << SCOL) | (1L << DOT) | (1L << OPEN_PAR) | (1L << OPEN_ARRAY) | (1L << CLOSE_ARRAY) | (1L << CLOSE_PAR) | (1L << COMMA) | (1L << ASSIGN) | (1L << STAR) | (1L << PLUS) | (1L << MINUS) | (1L << TILDE) | (1L << PIPE2) | (1L << DIV) | (1L << MOD) | (1L << LT2) | (1L << GT2) | (1L << AMP) | (1L << PIPE) | (1L << LT) | (1L << LT_EQ) | (1L << GT) | (1L << GT_EQ) | (1L << EQ) | (1L << NOT_EQ1) | (1L << NOT_EQ2) | (1L << QM) | (1L << DD) | (1L << K_ABORT) | (1L << K_ACTION) | (1L << K_ADD) | (1L << K_AFTER) | (1L << K_ALL) | (1L << K_ALTER) | (1L << K_ANALYZE) | (1L << K_AND) | (1L << K_AS) | (1L << K_ASC) | (1L << K_ATTACH) | (1L << K_AUTOINCREMENT) | (1L << K_BEFORE) | (1L << K_BEGIN) | (1L << K_BETWEEN) | (1L << K_BY))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (K_CASCADE - 64)) | (1L << (K_CASE - 64)) | (1L << (K_CONTINUE - 64)) | (1L << (K_CAST - 64)) | (1L << (K_CHECK - 64)) | (1L << (K_COLLATE - 64)) | (1L << (K_COLUMN - 64)) | (1L << (K_COMMIT - 64)) | (1L << (K_CONFLICT - 64)) | (1L << (K_CONSTRAINT - 64)) | (1L << (K_CREATE - 64)) | (1L << (K_CROSS - 64)) | (1L << (K_CURRENT_DATE - 64)) | (1L << (K_CURRENT_TIME - 64)) | (1L << (K_CURRENT_TIMESTAMP - 64)) | (1L << (K_DATABASE - 64)) | (1L << (K_DEFAULT - 64)) | (1L << (K_DEFERRABLE - 64)) | (1L << (K_DEFERRED - 64)) | (1L << (K_DELETE - 64)) | (1L << (K_DESC - 64)) | (1L << (K_DETACH - 64)) | (1L << (K_DISTINCT - 64)) | (1L << (K_DROP - 64)) | (1L << (K_EACH - 64)) | (1L << (K_ELSE - 64)) | (1L << (K_END - 64)) | (1L << (K_ENABLE - 64)) | (1L << (K_ESCAPE - 64)) | (1L << (K_EXCEPT - 64)) | (1L << (K_EXCLUSIVE - 64)) | (1L << (K_EXISTS - 64)) | (1L << (K_EXPLAIN - 64)) | (1L << (K_FAIL - 64)) | (1L << (K_FOR - 64)) | (1L << (K_FOREIGN - 64)) | (1L << (K_FROM - 64)) | (1L << (K_FULL - 64)) | (1L << (K_GLOB - 64)) | (1L << (K_GROUP - 64)) | (1L << (K_HAVING - 64)) | (1L << (K_IF - 64)) | (1L << (K_IGNORE - 64)) | (1L << (K_IMMEDIATE - 64)) | (1L << (K_IN - 64)) | (1L << (K_INDEX - 64)) | (1L << (K_INDEXED - 64)) | (1L << (K_INITIALLY - 64)) | (1L << (K_INNER - 64)) | (1L << (K_INSERT - 64)) | (1L << (K_INSTEAD - 64)) | (1L << (K_INTERSECT - 64)) | (1L << (K_INTO - 64)) | (1L << (K_IS - 64)) | (1L << (K_ISNULL - 64)) | (1L << (K_JOIN - 64)) | (1L << (K_KEY - 64)) | (1L << (K_LEFT - 64)) | (1L << (K_LIKE - 64)) | (1L << (K_LIMIT - 64)) | (1L << (K_MATCH - 64)) | (1L << (K_NATURAL - 64)) | (1L << (K_NEXTVAL - 64)) | (1L << (K_NO - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (K_NOT - 128)) | (1L << (K_NOTNULL - 128)) | (1L << (K_NULL - 128)) | (1L << (K_OF - 128)) | (1L << (K_OFFSET - 128)) | (1L << (K_ON - 128)) | (1L << (K_ONLY - 128)) | (1L << (K_OR - 128)) | (1L << (K_ORDER - 128)) | (1L << (K_OUTER - 128)) | (1L << (K_PLAN - 128)) | (1L << (K_PRAGMA - 128)) | (1L << (K_PRIMARY - 128)) | (1L << (K_QUERY - 128)) | (1L << (K_RAISE - 128)) | (1L << (K_RECURSIVE - 128)) | (1L << (K_REFERENCES - 128)) | (1L << (K_REGEXP - 128)) | (1L << (K_REINDEX - 128)) | (1L << (K_RELEASE - 128)) | (1L << (K_RENAME - 128)) | (1L << (K_REPLACE - 128)) | (1L << (K_RESTRICT - 128)) | (1L << (K_RIGHT - 128)) | (1L << (K_ROLLBACK - 128)) | (1L << (K_ROW - 128)) | (1L << (K_SAVEPOINT - 128)) | (1L << (K_SELECT - 128)) | (1L << (K_SET - 128)) | (1L << (K_TABLE - 128)) | (1L << (K_TEMP - 128)) | (1L << (K_TEMPORARY - 128)) | (1L << (K_THEN - 128)) | (1L << (K_TO - 128)) | (1L << (K_TRANSACTION - 128)) | (1L << (K_TRIGGER - 128)) | (1L << (K_UNION - 128)) | (1L << (K_UNIQUE - 128)) | (1L << (K_UPDATE - 128)) | (1L << (K_USING - 128)) | (1L << (K_VACUUM - 128)) | (1L << (K_VALUES - 128)) | (1L << (K_VIEW - 128)) | (1L << (K_VIRTUAL - 128)) | (1L << (K_WHEN - 128)) | (1L << (K_WHERE - 128)) | (1L << (K_WITH - 128)) | (1L << (K_WITHOUT - 128)) | (1L << (K_VAR - 128)) | (1L << (K_FOREACH - 128)) | (1L << (K_RETURN - 128)) | (1L << (K_ARRAY - 128)) | (1L << (K_WHILE - 128)) | (1L << (K_SWITCH - 128)) | (1L << (K_BREAK - 128)) | (1L << (K_DO - 128)) | (1L << (K_FUNCTION - 128)) | (1L << (K_PRINT - 128)) | (1L << (K_TRUE - 128)) | (1L << (K_FALSE - 128)) | (1L << (K_TYPE - 128)) | (1L << (K_PATH - 128)) | (1L << (K_STRING - 128)) | (1L << (K_BOOLEAN - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (K_number - 192)) | (1L << (K_CSV - 192)) | (1L << (K_JSON - 192)) | (1L << (IDENTIFIER - 192)) | (1L << (IDENTIFIER1 - 192)) | (1L << (NUMERIC_LITERAL - 192)) | (1L << (BIND_PARAMETER - 192)) | (1L << (STRING_LITERAL - 192)) | (1L << (BLOB_LITERAL - 192)) | (1L << (MULTILINE_COMMENT - 192)) | (1L << (SPACES - 192)) | (1L << (UNEXPECTED_CHAR - 192)) | (1L << (WHILE_SIGNS - 192)))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 284, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2772);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Function_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterFunction_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitFunction_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitFunction_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_nameContext function_name() throws RecognitionException {
		Function_nameContext _localctx = new Function_nameContext(_ctx, getState());
		enterRule(_localctx, 286, RULE_function_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2774);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Database_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Database_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_database_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterDatabase_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitDatabase_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitDatabase_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Database_nameContext database_name() throws RecognitionException {
		Database_nameContext _localctx = new Database_nameContext(_ctx, getState());
		enterRule(_localctx, 288, RULE_database_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2776);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Source_table_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Source_table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_source_table_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterSource_table_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitSource_table_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitSource_table_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Source_table_nameContext source_table_name() throws RecognitionException {
		Source_table_nameContext _localctx = new Source_table_nameContext(_ctx, getState());
		enterRule(_localctx, 290, RULE_source_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2778);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterTable_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitTable_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitTable_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_nameContext table_name() throws RecognitionException {
		Table_nameContext _localctx = new Table_nameContext(_ctx, getState());
		enterRule(_localctx, 292, RULE_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2780);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_or_index_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Table_or_index_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_or_index_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterTable_or_index_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitTable_or_index_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitTable_or_index_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_or_index_nameContext table_or_index_name() throws RecognitionException {
		Table_or_index_nameContext _localctx = new Table_or_index_nameContext(_ctx, getState());
		enterRule(_localctx, 294, RULE_table_or_index_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2782);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class New_table_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public New_table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_new_table_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterNew_table_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitNew_table_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitNew_table_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final New_table_nameContext new_table_name() throws RecognitionException {
		New_table_nameContext _localctx = new New_table_nameContext(_ctx, getState());
		enterRule(_localctx, 296, RULE_new_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2784);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Column_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterColumn_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitColumn_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitColumn_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_nameContext column_name() throws RecognitionException {
		Column_nameContext _localctx = new Column_nameContext(_ctx, getState());
		enterRule(_localctx, 298, RULE_column_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2786);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Collation_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Collation_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collation_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterCollation_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitCollation_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitCollation_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Collation_nameContext collation_name() throws RecognitionException {
		Collation_nameContext _localctx = new Collation_nameContext(_ctx, getState());
		enterRule(_localctx, 300, RULE_collation_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2788);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Foreign_tableContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Foreign_tableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreign_table; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterForeign_table(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitForeign_table(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitForeign_table(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Foreign_tableContext foreign_table() throws RecognitionException {
		Foreign_tableContext _localctx = new Foreign_tableContext(_ctx, getState());
		enterRule(_localctx, 302, RULE_foreign_table);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2790);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Index_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Index_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterIndex_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitIndex_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitIndex_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Index_nameContext index_name() throws RecognitionException {
		Index_nameContext _localctx = new Index_nameContext(_ctx, getState());
		enterRule(_localctx, 304, RULE_index_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2792);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Trigger_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Trigger_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trigger_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterTrigger_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitTrigger_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitTrigger_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Trigger_nameContext trigger_name() throws RecognitionException {
		Trigger_nameContext _localctx = new Trigger_nameContext(_ctx, getState());
		enterRule(_localctx, 306, RULE_trigger_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2794);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class View_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public View_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_view_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterView_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitView_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitView_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final View_nameContext view_name() throws RecognitionException {
		View_nameContext _localctx = new View_nameContext(_ctx, getState());
		enterRule(_localctx, 308, RULE_view_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2796);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Module_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Module_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_module_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterModule_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitModule_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitModule_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Module_nameContext module_name() throws RecognitionException {
		Module_nameContext _localctx = new Module_nameContext(_ctx, getState());
		enterRule(_localctx, 310, RULE_module_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2798);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pragma_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Pragma_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pragma_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterPragma_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitPragma_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitPragma_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pragma_nameContext pragma_name() throws RecognitionException {
		Pragma_nameContext _localctx = new Pragma_nameContext(_ctx, getState());
		enterRule(_localctx, 312, RULE_pragma_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2800);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Savepoint_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Savepoint_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_savepoint_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterSavepoint_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitSavepoint_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitSavepoint_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Savepoint_nameContext savepoint_name() throws RecognitionException {
		Savepoint_nameContext _localctx = new Savepoint_nameContext(_ctx, getState());
		enterRule(_localctx, 314, RULE_savepoint_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2802);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_aliasContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Table_aliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_alias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterTable_alias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitTable_alias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitTable_alias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_aliasContext table_alias() throws RecognitionException {
		Table_aliasContext _localctx = new Table_aliasContext(_ctx, getState());
		enterRule(_localctx, 316, RULE_table_alias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2804);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Transaction_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Transaction_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transaction_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterTransaction_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitTransaction_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitTransaction_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Transaction_nameContext transaction_name() throws RecognitionException {
		Transaction_nameContext _localctx = new Transaction_nameContext(_ctx, getState());
		enterRule(_localctx, 318, RULE_transaction_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2806);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Any_nameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SQLParser.IDENTIFIER, 0); }
		public KeywordContext keyword() {
			return getRuleContext(KeywordContext.class,0);
		}
		public TerminalNode STRING_LITERAL() { return getToken(SQLParser.STRING_LITERAL, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public Any_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_any_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterAny_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitAny_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitAny_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Any_nameContext any_name() throws RecognitionException {
		Any_nameContext _localctx = new Any_nameContext(_ctx, getState());
		enterRule(_localctx, 320, RULE_any_name);
		try {
			setState(2815);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(2808);
				match(IDENTIFIER);
				}
				break;
			case K_ABORT:
			case K_ACTION:
			case K_ADD:
			case K_AFTER:
			case K_ALL:
			case K_ALTER:
			case K_ANALYZE:
			case K_AND:
			case K_AS:
			case K_ASC:
			case K_ATTACH:
			case K_AUTOINCREMENT:
			case K_BEFORE:
			case K_BEGIN:
			case K_BETWEEN:
			case K_BY:
			case K_CASCADE:
			case K_CASE:
			case K_CAST:
			case K_CHECK:
			case K_COLLATE:
			case K_COLUMN:
			case K_COMMIT:
			case K_CONFLICT:
			case K_CONSTRAINT:
			case K_CREATE:
			case K_CROSS:
			case K_CURRENT_DATE:
			case K_CURRENT_TIME:
			case K_CURRENT_TIMESTAMP:
			case K_DATABASE:
			case K_DEFAULT:
			case K_DEFERRABLE:
			case K_DEFERRED:
			case K_DELETE:
			case K_DESC:
			case K_DETACH:
			case K_DISTINCT:
			case K_DROP:
			case K_EACH:
			case K_ELSE:
			case K_END:
			case K_ENABLE:
			case K_ESCAPE:
			case K_EXCEPT:
			case K_EXCLUSIVE:
			case K_EXISTS:
			case K_EXPLAIN:
			case K_FAIL:
			case K_FOR:
			case K_FOREIGN:
			case K_FROM:
			case K_FULL:
			case K_GLOB:
			case K_GROUP:
			case K_HAVING:
			case K_IF:
			case K_IGNORE:
			case K_IMMEDIATE:
			case K_IN:
			case K_INDEX:
			case K_INDEXED:
			case K_INITIALLY:
			case K_INNER:
			case K_INSERT:
			case K_INSTEAD:
			case K_INTERSECT:
			case K_INTO:
			case K_IS:
			case K_ISNULL:
			case K_JOIN:
			case K_KEY:
			case K_LEFT:
			case K_LIKE:
			case K_LIMIT:
			case K_MATCH:
			case K_NATURAL:
			case K_NEXTVAL:
			case K_NO:
			case K_NOT:
			case K_NOTNULL:
			case K_NULL:
			case K_OF:
			case K_OFFSET:
			case K_ON:
			case K_OR:
			case K_ORDER:
			case K_OUTER:
			case K_PLAN:
			case K_PRAGMA:
			case K_PRIMARY:
			case K_QUERY:
			case K_RAISE:
			case K_RECURSIVE:
			case K_REFERENCES:
			case K_REGEXP:
			case K_REINDEX:
			case K_RELEASE:
			case K_RENAME:
			case K_REPLACE:
			case K_RESTRICT:
			case K_RIGHT:
			case K_ROLLBACK:
			case K_ROW:
			case K_SAVEPOINT:
			case K_SELECT:
			case K_SET:
			case K_TABLE:
			case K_TEMP:
			case K_TEMPORARY:
			case K_THEN:
			case K_TO:
			case K_TRANSACTION:
			case K_TRIGGER:
			case K_UNION:
			case K_UNIQUE:
			case K_UPDATE:
			case K_USING:
			case K_VACUUM:
			case K_VALUES:
			case K_VIEW:
			case K_VIRTUAL:
			case K_WHEN:
			case K_WHERE:
			case K_WITH:
			case K_WITHOUT:
			case K_RETURN:
			case K_WHILE:
			case K_SWITCH:
			case K_BREAK:
			case K_DO:
			case K_FUNCTION:
				enterOuterAlt(_localctx, 2);
				{
				setState(2809);
				keyword();
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(2810);
				match(STRING_LITERAL);
				}
				break;
			case OPEN_PAR:
				enterOuterAlt(_localctx, 4);
				{
				setState(2811);
				match(OPEN_PAR);
				setState(2812);
				any_name();
				setState(2813);
				match(CLOSE_PAR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 107:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 109:
			return expr_without_comper_sempred((Expr_without_comperContext)_localctx, predIndex);
		case 113:
			return expr1_sempred((Expr1Context)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean expr_without_comper_sempred(Expr_without_comperContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 6);
		case 3:
			return precpred(_ctx, 5);
		case 4:
			return precpred(_ctx, 4);
		case 5:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean expr1_sempred(Expr1Context _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 11);
		case 7:
			return precpred(_ctx, 10);
		case 8:
			return precpred(_ctx, 9);
		case 9:
			return precpred(_ctx, 8);
		case 10:
			return precpred(_ctx, 7);
		case 11:
			return precpred(_ctx, 6);
		case 12:
			return precpred(_ctx, 5);
		case 13:
			return precpred(_ctx, 4);
		case 14:
			return precpred(_ctx, 1);
		}
		return true;
	}

	private static final int _serializedATNSegments = 2;
	private static final String _serializedATNSegment0 =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u00ce\u0b04\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4"+
		"w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4\177\t\177\4\u0080\t\u0080"+
		"\4\u0081\t\u0081\4\u0082\t\u0082\4\u0083\t\u0083\4\u0084\t\u0084\4\u0085"+
		"\t\u0085\4\u0086\t\u0086\4\u0087\t\u0087\4\u0088\t\u0088\4\u0089\t\u0089"+
		"\4\u008a\t\u008a\4\u008b\t\u008b\4\u008c\t\u008c\4\u008d\t\u008d\4\u008e"+
		"\t\u008e\4\u008f\t\u008f\4\u0090\t\u0090\4\u0091\t\u0091\4\u0092\t\u0092"+
		"\4\u0093\t\u0093\4\u0094\t\u0094\4\u0095\t\u0095\4\u0096\t\u0096\4\u0097"+
		"\t\u0097\4\u0098\t\u0098\4\u0099\t\u0099\4\u009a\t\u009a\4\u009b\t\u009b"+
		"\4\u009c\t\u009c\4\u009d\t\u009d\4\u009e\t\u009e\4\u009f\t\u009f\4\u00a0"+
		"\t\u00a0\4\u00a1\t\u00a1\4\u00a2\t\u00a2\3\2\3\2\3\2\3\2\7\2\u0149\n\2"+
		"\f\2\16\2\u014c\13\2\3\2\3\2\3\3\3\3\3\3\3\4\7\4\u0154\n\4\f\4\16\4\u0157"+
		"\13\4\3\4\3\4\6\4\u015b\n\4\r\4\16\4\u015c\3\4\7\4\u0160\n\4\f\4\16\4"+
		"\u0163\13\4\3\4\7\4\u0166\n\4\f\4\16\4\u0169\13\4\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\5\5\u0174\n\5\3\6\3\6\7\6\u0178\n\6\f\6\16\6\u017b\13"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7"+
		"\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f\5\f\u019b\n\f\7"+
		"\f\u019d\n\f\f\f\16\f\u01a0\13\f\5\f\u01a2\n\f\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u01b0\n\r\f\r\16\r\u01b3\13\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\5\r\u01bd\n\r\3\16\3\16\3\16\3\16\5\16\u01c3\n\16"+
		"\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\23\3\23\7\23"+
		"\u01d2\n\23\f\23\16\23\u01d5\13\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24"+
		"\3\24\5\24\u01df\n\24\3\25\3\25\7\25\u01e3\n\25\f\25\16\25\u01e6\13\25"+
		"\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\5\30"+
		"\u01f5\n\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32"+
		"\3\32\5\32\u0204\n\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34"+
		"\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\7\35\u0222\n\35\f\35\16\35\u0225\13\35\3\36\7\36"+
		"\u0228\n\36\f\36\16\36\u022b\13\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u023f\n\37"+
		"\3 \3 \3 \3 \3 \7 \u0246\n \f \16 \u0249\13 \3 \3 \3 \3 \3 \3!\3!\3!\7"+
		"!\u0253\n!\f!\16!\u0256\13!\3!\3!\3!\3!\7!\u025c\n!\f!\16!\u025f\13!\3"+
		"\"\3\"\3\"\3\"\3\"\5\"\u0266\n\"\3\"\3\"\3\"\3\"\5\"\u026c\n\"\3\"\3\""+
		"\3\"\3\"\5\"\u0272\n\"\3\"\5\"\u0275\n\"\3\"\3\"\3\"\5\"\u027a\n\"\3\""+
		"\3\"\3\"\3\"\5\"\u0280\n\"\3\"\3\"\3\"\3\"\5\"\u0286\n\"\3\"\5\"\u0289"+
		"\n\"\3\"\5\"\u028c\n\"\3\"\3\"\3\"\3\"\5\"\u0292\n\"\3\"\3\"\3\"\5\"\u0297"+
		"\n\"\3\"\5\"\u029a\n\"\5\"\u029c\n\"\3\"\3\"\3\"\3\"\5\"\u02a2\n\"\3\""+
		"\3\"\3\"\5\"\u02a7\n\"\7\"\u02a9\n\"\f\"\16\"\u02ac\13\"\3\"\3\"\5\"\u02b0"+
		"\n\"\3\"\3\"\3\"\5\"\u02b5\n\"\7\"\u02b7\n\"\f\"\16\"\u02ba\13\"\5\"\u02bc"+
		"\n\"\3\"\5\"\u02bf\n\"\3\"\3\"\3\"\3\"\5\"\u02c5\n\"\5\"\u02c7\n\"\3\""+
		"\3\"\3#\5#\u02cc\n#\3#\3#\3#\7#\u02d1\n#\f#\16#\u02d4\13#\3#\3#\3#\7#"+
		"\u02d9\n#\f#\16#\u02dc\13#\7#\u02de\n#\f#\16#\u02e1\13#\3#\3#\7#\u02e5"+
		"\n#\f#\16#\u02e8\13#\5#\u02ea\n#\3$\5$\u02ed\n$\3$\3$\3$\7$\u02f2\n$\f"+
		"$\16$\u02f5\13$\5$\u02f7\n$\3%\3%\3%\3%\5%\u02fd\n%\3&\3&\3&\3\'\3\'\3"+
		"\'\3\'\3\'\5\'\u0307\n\'\3(\3(\3(\3(\3)\3)\3)\3)\5)\u0311\n)\3)\5)\u0314"+
		"\n)\3)\3)\5)\u0318\n)\3)\5)\u031b\n)\3)\3)\3)\5)\u0320\n)\3*\3*\3*\3*"+
		"\3*\3+\3+\3+\3+\3+\5+\u032c\n+\3+\3+\3+\3+\3+\5+\u0333\n+\3+\3+\5+\u0337"+
		"\n+\3+\3+\3,\3,\3,\3,\3,\3,\5,\u0341\n,\3,\3,\3,\5,\u0346\n,\3,\3,\3,"+
		"\3,\5,\u034c\n,\7,\u034e\n,\f,\16,\u0351\13,\3,\3,\3,\3,\5,\u0357\n,\3"+
		",\3,\3,\3,\5,\u035d\n,\7,\u035f\n,\f,\16,\u0362\13,\7,\u0364\n,\f,\16"+
		",\u0367\13,\3,\3,\3,\3,\5,\u036d\n,\3,\3,\3,\3,\5,\u0373\n,\7,\u0375\n"+
		",\f,\16,\u0378\13,\3,\3,\5,\u037c\n,\3,\3,\5,\u0380\n,\3,\3,\3-\3-\3-"+
		"\5-\u0387\n-\3-\3-\3-\5-\u038c\n-\7-\u038e\n-\f-\16-\u0391\13-\7-\u0393"+
		"\n-\f-\16-\u0396\13-\3-\3-\3-\3-\3-\3-\5-\u039e\n-\3-\3-\3-\5-\u03a3\n"+
		"-\7-\u03a5\n-\f-\16-\u03a8\13-\7-\u03aa\n-\f-\16-\u03ad\13-\3-\3-\3-\3"+
		"-\3-\7-\u03b4\n-\f-\16-\u03b7\13-\3-\3-\5-\u03bb\n-\3-\3-\3-\5-\u03c0"+
		"\n-\7-\u03c2\n-\f-\16-\u03c5\13-\3-\5-\u03c8\n-\3.\5.\u03cb\n.\3.\3.\6"+
		".\u03cf\n.\r.\16.\u03d0\3.\3.\5.\u03d5\n.\5.\u03d7\n.\3.\5.\u03da\n.\3"+
		".\3.\5.\u03de\n.\3.\3.\3.\3.\5.\u03e4\n.\3.\3.\5.\u03e8\n.\3.\3.\3.\5"+
		".\u03ed\n.\5.\u03ef\n.\3.\5.\u03f2\n.\3.\3.\5.\u03f6\n.\3.\3.\3.\3.\5"+
		".\u03fc\n.\3.\3.\5.\u0400\n.\3.\3.\3.\5.\u0405\n.\5.\u0407\n.\3.\5.\u040a"+
		"\n.\3/\3/\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\61\5\61\u0416\n\61\3\61"+
		"\3\61\3\61\5\61\u041b\n\61\3\61\3\61\3\61\3\61\5\61\u0421\n\61\7\61\u0423"+
		"\n\61\f\61\16\61\u0426\13\61\3\61\3\61\3\61\3\61\5\61\u042c\n\61\3\61"+
		"\3\61\3\61\3\61\5\61\u0432\n\61\7\61\u0434\n\61\f\61\16\61\u0437\13\61"+
		"\7\61\u0439\n\61\f\61\16\61\u043c\13\61\3\61\3\61\3\61\3\61\5\61\u0442"+
		"\n\61\3\61\3\61\3\61\3\61\5\61\u0448\n\61\7\61\u044a\n\61\f\61\16\61\u044d"+
		"\13\61\3\61\3\61\5\61\u0451\n\61\3\61\3\61\3\61\5\61\u0456\n\61\3\61\3"+
		"\61\3\61\3\61\3\61\3\61\5\61\u045e\n\61\3\62\3\62\3\62\7\62\u0463\n\62"+
		"\f\62\16\62\u0466\13\62\3\62\3\62\3\62\3\62\3\62\3\62\5\62\u046e\n\62"+
		"\5\62\u0470\n\62\3\63\3\63\3\63\3\63\3\63\3\63\3\63\5\63\u0479\n\63\3"+
		"\64\3\64\3\64\3\64\3\64\5\64\u0480\n\64\3\64\3\64\3\64\3\64\5\64\u0486"+
		"\n\64\3\64\3\64\5\64\u048a\n\64\5\64\u048c\n\64\3\64\3\64\3\65\3\65\3"+
		"\65\3\65\3\65\3\65\3\65\5\65\u0497\n\65\3\66\3\66\5\66\u049b\n\66\3\66"+
		"\3\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\5\67"+
		"\u04ab\n\67\38\58\u04ae\n8\38\38\38\38\38\38\38\38\58\u04b8\n8\38\38\3"+
		"8\39\39\39\39\59\u04c1\n9\39\79\u04c4\n9\f9\169\u04c7\139\39\59\u04ca"+
		"\n9\39\59\u04cd\n9\39\79\u04d0\n9\f9\169\u04d3\139\39\79\u04d6\n9\f9\16"+
		"9\u04d9\139\39\59\u04dc\n9\39\79\u04df\n9\f9\169\u04e2\139\59\u04e4\n"+
		"9\39\39\3:\3:\3:\3:\3:\3:\3:\3:\3:\5:\u04f1\n:\3:\3:\3;\3;\3;\3;\3;\3"+
		";\5;\u04fb\n;\3;\3;\3;\3;\3;\3<\3<\3<\3<\3<\3<\3=\3=\5=\u050a\n=\3=\3"+
		"=\3=\3=\5=\u0510\n=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\5=\u051d\n=\7=\u051f"+
		"\n=\f=\16=\u0522\13=\5=\u0524\n=\3=\3=\3=\5=\u0529\n=\3=\3=\3=\5=\u052e"+
		"\n=\3=\5=\u0531\n=\5=\u0533\n=\3=\3=\3=\3=\3=\3=\3=\3=\5=\u053d\n=\7="+
		"\u053f\n=\f=\16=\u0542\13=\5=\u0544\n=\3=\3=\5=\u0548\n=\3>\3>\3>\5>\u054d"+
		"\n>\3?\3?\3?\3?\5?\u0553\n?\3?\3?\3?\5?\u0558\n?\5?\u055a\n?\3?\3?\3@"+
		"\3@\3@\3@\3@\3@\3@\5@\u0565\n@\5@\u0567\n@\3@\3@\3A\3A\5A\u056d\nA\3A"+
		"\3A\3A\5A\u0572\nA\3A\7A\u0575\nA\fA\16A\u0578\13A\3A\3A\3B\3B\3B\3B\3"+
		"B\3B\3B\3B\3B\5B\u0585\nB\3C\3C\3D\3D\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3"+
		"E\3E\3E\3E\3E\3E\5E\u059b\nE\3F\3F\3F\3F\5F\u05a1\nF\3F\3F\3F\3F\5F\u05a7"+
		"\nF\3F\3F\3F\3F\5F\u05ad\nF\3F\5F\u05b0\nF\3G\3G\3G\5G\u05b5\nG\3H\3H"+
		"\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\5H\u05c3\nH\3H\5H\u05c6\nH\3H\5H\u05c9"+
		"\nH\5H\u05cb\nH\3H\3H\3H\3H\7H\u05d1\nH\fH\16H\u05d4\13H\3H\3H\3H\3H\3"+
		"H\3H\3H\5H\u05dd\nH\3H\5H\u05e0\nH\3H\5H\u05e3\nH\5H\u05e5\nH\5H\u05e7"+
		"\nH\3H\3H\3I\3I\3I\3I\3I\3I\5I\u05f1\nI\3I\3I\5I\u05f5\nI\3I\3I\3I\3I"+
		"\3I\3I\3I\5I\u05fe\nI\3I\3I\5I\u0602\nI\3I\5I\u0605\nI\3J\3J\3J\3J\3J"+
		"\3J\5J\u060d\nJ\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\5K\u0619\nK\3K\3K\3L\3L"+
		"\3L\3L\3L\5L\u0622\nL\3L\3L\3L\3L\3L\5L\u0629\nL\7L\u062b\nL\fL\16L\u062e"+
		"\13L\3L\3L\3M\3M\3N\3N\3O\3O\3O\3O\3O\3O\3O\5O\u063d\nO\3P\3P\3P\3P\3"+
		"P\3P\7P\u0645\nP\fP\16P\u0648\13P\3P\3P\3P\5P\u064d\nP\3P\3P\3Q\3Q\3R"+
		"\3R\3S\3S\3T\3T\3T\3T\3T\5T\u065c\nT\3T\3T\3T\3T\3T\3T\3T\3T\5T\u0666"+
		"\nT\3T\5T\u0669\nT\3U\3U\3U\3U\3U\3V\3V\3V\3W\3W\3W\3W\3W\5W\u0678\nW"+
		"\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\7W\u0684\nW\fW\16W\u0687\13W\3W\3W\3W\3"+
		"W\5W\u068d\nW\3W\3W\5W\u0691\nW\3W\5W\u0694\nW\3W\3W\5W\u0698\nW\3W\3"+
		"W\3X\3X\3Y\3Y\3Z\3Z\3Z\3Z\3Z\5Z\u06a5\nZ\3Z\3Z\3Z\5Z\u06aa\nZ\3Z\3Z\3"+
		"Z\3Z\3Z\3Z\3Z\7Z\u06b3\nZ\fZ\16Z\u06b6\13Z\3Z\3Z\3Z\3Z\5Z\u06bc\nZ\3["+
		"\3[\3[\3[\3[\5[\u06c3\n[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3[\7[\u06cf\n[\f["+
		"\16[\u06d2\13[\3[\3[\3[\3[\3[\3[\3[\3[\3[\3\\\3\\\3\\\3\\\3\\\5\\\u06e2"+
		"\n\\\3]\3]\3]\3]\5]\u06e8\n]\3]\3]\3]\5]\u06ed\n]\3]\3]\3^\3^\3^\3^\3"+
		"^\5^\u06f6\n^\3^\3^\3^\3^\3^\7^\u06fd\n^\f^\16^\u0700\13^\3^\3^\5^\u0704"+
		"\n^\3^\3^\3^\3^\3^\7^\u070b\n^\f^\16^\u070e\13^\3^\3^\3^\3^\3^\3^\7^\u0716"+
		"\n^\f^\16^\u0719\13^\3^\3^\7^\u071d\n^\f^\16^\u0720\13^\3^\3^\3^\5^\u0725"+
		"\n^\3_\3_\3_\3_\3_\3_\7_\u072d\n_\f_\16_\u0730\13_\5_\u0732\n_\3_\3_\3"+
		"_\3_\5_\u0738\n_\5_\u073a\n_\3`\3`\3`\3`\3`\3`\7`\u0742\n`\f`\16`\u0745"+
		"\13`\5`\u0747\n`\3`\3`\3`\3`\5`\u074d\n`\5`\u074f\n`\3a\3a\5a\u0753\n"+
		"a\3a\3a\3a\7a\u0758\na\fa\16a\u075b\13a\3a\3a\3a\3a\7a\u0761\na\fa\16"+
		"a\u0764\13a\3a\5a\u0767\na\5a\u0769\na\3a\3a\5a\u076d\na\3a\3a\3a\3a\3"+
		"a\7a\u0774\na\fa\16a\u0777\13a\3a\3a\5a\u077b\na\5a\u077d\na\3a\3a\3a"+
		"\3a\3a\7a\u0784\na\fa\16a\u0787\13a\3a\3a\3a\3a\3a\3a\7a\u078f\na\fa\16"+
		"a\u0792\13a\3a\3a\7a\u0796\na\fa\16a\u0799\13a\5a\u079b\na\3b\3b\3b\3"+
		"b\3b\3b\3b\3b\3b\3b\3b\7b\u07a8\nb\fb\16b\u07ab\13b\3b\3b\5b\u07af\nb"+
		"\3c\3c\3c\7c\u07b4\nc\fc\16c\u07b7\13c\3d\3d\3d\3d\5d\u07bd\nd\3d\3d\3"+
		"d\3d\3d\5d\u07c4\nd\3d\3d\3d\5d\u07c9\nd\3d\3d\5d\u07cd\nd\3e\3e\5e\u07d1"+
		"\ne\3e\3e\3e\3e\3e\3e\3e\3e\3e\3e\3e\3e\5e\u07df\ne\3f\3f\3f\5f\u07e4"+
		"\nf\3f\5f\u07e7\nf\3g\3g\3h\3h\3h\3i\3i\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j"+
		"\3j\3j\5j\u07fc\nj\3j\3j\6j\u0800\nj\rj\16j\u0801\5j\u0804\nj\3k\3k\5"+
		"k\u0808\nk\3l\3l\3l\3l\3l\3l\3l\3l\5l\u0812\nl\3l\3l\3l\5l\u0817\nl\3"+
		"l\3l\3l\3l\3l\3l\3l\5l\u0820\nl\3l\3l\3l\3l\3l\3l\7l\u0828\nl\fl\16l\u082b"+
		"\13l\5l\u082d\nl\3l\3l\3l\3l\5l\u0833\nl\3l\5l\u0836\nl\5l\u0838\nl\3"+
		"m\3m\3m\3m\3m\5m\u083f\nm\3m\3m\3m\5m\u0844\nm\3m\3m\3m\3m\3m\5m\u084b"+
		"\nm\3m\3m\3m\3m\3m\3m\5m\u0853\nm\3m\3m\3m\3m\3m\3m\7m\u085b\nm\fm\16"+
		"m\u085e\13m\5m\u0860\nm\3m\3m\3m\3m\5m\u0866\nm\3m\5m\u0869\nm\7m\u086b"+
		"\nm\fm\16m\u086e\13m\3n\3n\3o\3o\3o\3o\3o\5o\u0877\no\3o\3o\3o\5o\u087c"+
		"\no\3o\3o\3o\3o\3o\3o\3o\5o\u0885\no\3o\3o\3o\7o\u088a\no\fo\16o\u088d"+
		"\13o\3o\5o\u0890\no\3o\3o\3o\3o\3o\3o\5o\u0898\no\3o\3o\3o\3o\3o\3o\3"+
		"o\3o\3o\3o\3o\3o\7o\u08a6\no\fo\16o\u08a9\13o\3p\3p\3p\3p\3p\3p\3p\3p"+
		"\3p\3p\3p\3p\3p\3p\3p\3p\3p\3p\3p\3p\3p\3p\3p\3p\3p\3p\3p\5p\u08c6\np"+
		"\3q\3q\3q\3q\3q\3q\5q\u08ce\nq\3r\3r\3r\5r\u08d3\nr\3r\3r\3r\7r\u08d8"+
		"\nr\fr\16r\u08db\13r\3r\5r\u08de\nr\3r\3r\3s\3s\3s\3s\3s\3s\5s\u08e8\n"+
		"s\3s\3s\3s\5s\u08ed\ns\3s\3s\3s\3s\3s\3s\3s\5s\u08f6\ns\3s\3s\3s\7s\u08fb"+
		"\ns\fs\16s\u08fe\13s\3s\5s\u0901\ns\3s\3s\3s\3s\3s\3s\5s\u0909\ns\3s\3"+
		"s\3s\3s\3s\3s\3s\3s\3s\3s\3s\3s\3s\3s\3s\3s\3s\3s\3s\3s\3s\3s\3s\3s\3"+
		"s\3s\3s\3s\5s\u0927\ns\3s\3s\3s\3s\3s\3s\3s\3s\3s\5s\u0932\ns\3s\3s\3"+
		"s\3s\3s\3s\7s\u093a\ns\fs\16s\u093d\13s\5s\u093f\ns\3s\3s\3s\3s\5s\u0945"+
		"\ns\3s\5s\u0948\ns\7s\u094a\ns\fs\16s\u094d\13s\3t\3t\3t\3t\5t\u0953\n"+
		"t\3t\3t\3t\3t\3t\7t\u095a\nt\ft\16t\u095d\13t\3t\3t\5t\u0961\nt\3t\3t"+
		"\3t\3t\3t\3t\3t\3t\3t\3t\5t\u096d\nt\3t\3t\5t\u0971\nt\7t\u0973\nt\ft"+
		"\16t\u0976\13t\3t\5t\u0979\nt\3t\3t\3t\3t\3t\5t\u0980\nt\3t\5t\u0983\n"+
		"t\5t\u0985\nt\3u\3u\3v\3v\3v\5v\u098c\nv\3v\5v\u098f\nv\3w\3w\5w\u0993"+
		"\nw\3w\3w\3w\3w\3w\3w\3w\3w\3w\5w\u099e\nw\3x\3x\3x\3x\3x\3x\7x\u09a6"+
		"\nx\fx\16x\u09a9\13x\3x\3x\3y\3y\3y\3y\3y\3y\7y\u09b3\ny\fy\16y\u09b6"+
		"\13y\3y\3y\3y\3z\3z\5z\u09bd\nz\3z\5z\u09c0\nz\3z\3z\3z\3z\7z\u09c6\n"+
		"z\fz\16z\u09c9\13z\3z\3z\3{\3{\5{\u09cf\n{\3{\3{\3{\3{\7{\u09d5\n{\f{"+
		"\16{\u09d8\13{\3{\3{\3|\3|\3}\3}\3}\5}\u09e1\n}\3}\3}\3}\3}\3}\3}\5}\u09e9"+
		"\n}\3~\3~\3~\5~\u09ee\n~\3~\5~\u09f1\n~\3\177\3\177\3\177\5\177\u09f6"+
		"\n\177\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080\7\u0080\u09fd\n\u0080\f"+
		"\u0080\16\u0080\u0a00\13\u0080\3\u0080\3\u0080\5\u0080\u0a04\n\u0080\3"+
		"\u0080\3\u0080\3\u0080\3\u0080\3\u0080\3\u0081\3\u0081\3\u0081\3\u0081"+
		"\3\u0081\3\u0081\3\u0081\5\u0081\u0a12\n\u0081\3\u0081\5\u0081\u0a15\n"+
		"\u0081\5\u0081\u0a17\n\u0081\3\u0082\3\u0082\3\u0082\5\u0082\u0a1c\n\u0082"+
		"\3\u0082\3\u0082\5\u0082\u0a20\n\u0082\3\u0082\5\u0082\u0a23\n\u0082\3"+
		"\u0082\3\u0082\3\u0082\3\u0082\3\u0082\5\u0082\u0a2a\n\u0082\3\u0082\3"+
		"\u0082\3\u0082\3\u0082\7\u0082\u0a30\n\u0082\f\u0082\16\u0082\u0a33\13"+
		"\u0082\3\u0082\5\u0082\u0a36\n\u0082\3\u0082\3\u0082\5\u0082\u0a3a\n\u0082"+
		"\3\u0082\5\u0082\u0a3d\n\u0082\3\u0082\3\u0082\3\u0082\3\u0082\5\u0082"+
		"\u0a43\n\u0082\3\u0082\5\u0082\u0a46\n\u0082\5\u0082\u0a48\n\u0082\3\u0083"+
		"\3\u0083\3\u0083\3\u0083\3\u0083\7\u0083\u0a4f\n\u0083\f\u0083\16\u0083"+
		"\u0a52\13\u0083\3\u0084\3\u0084\3\u0084\5\u0084\u0a57\n\u0084\3\u0084"+
		"\5\u0084\u0a5a\n\u0084\3\u0084\5\u0084\u0a5d\n\u0084\3\u0085\3\u0085\5"+
		"\u0085\u0a61\n\u0085\3\u0086\3\u0086\5\u0086\u0a65\n\u0086\3\u0086\3\u0086"+
		"\3\u0086\7\u0086\u0a6a\n\u0086\f\u0086\16\u0086\u0a6d\13\u0086\3\u0086"+
		"\3\u0086\3\u0086\3\u0086\7\u0086\u0a73\n\u0086\f\u0086\16\u0086\u0a76"+
		"\13\u0086\3\u0086\5\u0086\u0a79\n\u0086\5\u0086\u0a7b\n\u0086\3\u0086"+
		"\3\u0086\5\u0086\u0a7f\n\u0086\3\u0086\3\u0086\3\u0086\3\u0086\3\u0086"+
		"\7\u0086\u0a86\n\u0086\f\u0086\16\u0086\u0a89\13\u0086\3\u0086\3\u0086"+
		"\5\u0086\u0a8d\n\u0086\5\u0086\u0a8f\n\u0086\3\u0086\3\u0086\3\u0086\3"+
		"\u0086\3\u0086\7\u0086\u0a96\n\u0086\f\u0086\16\u0086\u0a99\13\u0086\3"+
		"\u0086\3\u0086\3\u0086\3\u0086\3\u0086\3\u0086\7\u0086\u0aa1\n\u0086\f"+
		"\u0086\16\u0086\u0aa4\13\u0086\3\u0086\3\u0086\7\u0086\u0aa8\n\u0086\f"+
		"\u0086\16\u0086\u0aab\13\u0086\5\u0086\u0aad\n\u0086\3\u0087\3\u0087\3"+
		"\u0087\3\u0087\3\u0087\7\u0087\u0ab4\n\u0087\f\u0087\16\u0087\u0ab7\13"+
		"\u0087\3\u0087\3\u0087\5\u0087\u0abb\n\u0087\3\u0088\5\u0088\u0abe\n\u0088"+
		"\3\u0088\3\u0088\5\u0088\u0ac2\n\u0088\3\u0089\3\u0089\3\u008a\3\u008a"+
		"\3\u008b\3\u008b\3\u008c\3\u008c\5\u008c\u0acc\n\u008c\3\u008d\3\u008d"+
		"\3\u008e\3\u008e\3\u008f\6\u008f\u0ad3\n\u008f\r\u008f\16\u008f\u0ad4"+
		"\3\u0090\3\u0090\3\u0091\3\u0091\3\u0092\3\u0092\3\u0093\3\u0093\3\u0094"+
		"\3\u0094\3\u0095\3\u0095\3\u0096\3\u0096\3\u0097\3\u0097\3\u0098\3\u0098"+
		"\3\u0099\3\u0099\3\u009a\3\u009a\3\u009b\3\u009b\3\u009c\3\u009c\3\u009d"+
		"\3\u009d\3\u009e\3\u009e\3\u009f\3\u009f\3\u00a0\3\u00a0\3\u00a1\3\u00a1"+
		"\3\u00a2\3\u00a2\3\u00a2\3\u00a2\3\u00a2\3\u00a2\3\u00a2\5\u00a2\u0b02"+
		"\n\u00a2\3\u00a2\2\5\u00d8\u00dc\u00e4\u00a3\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|"+
		"~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096"+
		"\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae"+
		"\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6"+
		"\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc\u00de"+
		"\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0\u00f2\u00f4\u00f6"+
		"\u00f8\u00fa\u00fc\u00fe\u0100\u0102\u0104\u0106\u0108\u010a\u010c\u010e"+
		"\u0110\u0112\u0114\u0116\u0118\u011a\u011c\u011e\u0120\u0122\u0124\u0126"+
		"\u0128\u012a\u012c\u012e\u0130\u0132\u0134\u0136\u0138\u013a\u013c\u013e"+
		"\u0140\u0142\2\27\3\2\u00c0\u00c2\3\2\3\4\3\2\b\t\4\2\n\n\"\"\3\2).\3"+
		"\2\37 \3\2\17\20\3\2),\4\2\36 #$\3\2\21\22\3\2\23\24\4\2\34\34\u0086\u0086"+
		"\4\2\66\66XX\4\2;;VV\4\2\36\36#$\3\2%(\4\2UU\u00a8\u00a8\6\2NP\u0084\u0084"+
		"\u00c7\u00c7\u00c9\u00ca\4\2\37!\u0082\u0082\4\2\u00c5\u00c5\u00c9\u00c9"+
		"\7\2\62CE\u0087\u0089\u00b1\u00b4\u00b4\u00b6\u00ba\2\u0cca\2\u014a\3"+
		"\2\2\2\4\u014f\3\2\2\2\6\u0155\3\2\2\2\b\u0173\3\2\2\2\n\u0175\3\2\2\2"+
		"\f\u018b\3\2\2\2\16\u018d\3\2\2\2\20\u018f\3\2\2\2\22\u0191\3\2\2\2\24"+
		"\u0193\3\2\2\2\26\u01a1\3\2\2\2\30\u01a3\3\2\2\2\32\u01c2\3\2\2\2\34\u01c4"+
		"\3\2\2\2\36\u01c6\3\2\2\2 \u01c8\3\2\2\2\"\u01ca\3\2\2\2$\u01cc\3\2\2"+
		"\2&\u01de\3\2\2\2(\u01e0\3\2\2\2*\u01e7\3\2\2\2,\u01ea\3\2\2\2.\u01ef"+
		"\3\2\2\2\60\u01f9\3\2\2\2\62\u01fe\3\2\2\2\64\u0207\3\2\2\2\66\u020c\3"+
		"\2\2\28\u0223\3\2\2\2:\u0229\3\2\2\2<\u023e\3\2\2\2>\u0240\3\2\2\2@\u024f"+
		"\3\2\2\2B\u0260\3\2\2\2D\u02e9\3\2\2\2F\u02f6\3\2\2\2H\u02fc\3\2\2\2J"+
		"\u02fe\3\2\2\2L\u0301\3\2\2\2N\u0308\3\2\2\2P\u031f\3\2\2\2R\u0321\3\2"+
		"\2\2T\u0326\3\2\2\2V\u033a\3\2\2\2X\u03c7\3\2\2\2Z\u03ca\3\2\2\2\\\u040b"+
		"\3\2\2\2^\u040d\3\2\2\2`\u040f\3\2\2\2b\u045f\3\2\2\2d\u0471\3\2\2\2f"+
		"\u047a\3\2\2\2h\u048f\3\2\2\2j\u0498\3\2\2\2l\u04a1\3\2\2\2n\u04ad\3\2"+
		"\2\2p\u04bc\3\2\2\2r\u04e7\3\2\2\2t\u04f4\3\2\2\2v\u0501\3\2\2\2x\u0547"+
		"\3\2\2\2z\u054c\3\2\2\2|\u054e\3\2\2\2~\u055d\3\2\2\2\u0080\u056a\3\2"+
		"\2\2\u0082\u057b\3\2\2\2\u0084\u0586\3\2\2\2\u0086\u0588\3\2\2\2\u0088"+
		"\u059a\3\2\2\2\u008a\u059c\3\2\2\2\u008c\u05b1\3\2\2\2\u008e\u05b6\3\2"+
		"\2\2\u0090\u0604\3\2\2\2\u0092\u060c\3\2\2\2\u0094\u060e\3\2\2\2\u0096"+
		"\u061c\3\2\2\2\u0098\u0631\3\2\2\2\u009a\u0633\3\2\2\2\u009c\u063c\3\2"+
		"\2\2\u009e\u063e\3\2\2\2\u00a0\u0650\3\2\2\2\u00a2\u0652\3\2\2\2\u00a4"+
		"\u0654\3\2\2\2\u00a6\u0656\3\2\2\2\u00a8\u066a\3\2\2\2\u00aa\u066f\3\2"+
		"\2\2\u00ac\u0672\3\2\2\2\u00ae\u069b\3\2\2\2\u00b0\u069d\3\2\2\2\u00b2"+
		"\u069f\3\2\2\2\u00b4\u06bd\3\2\2\2\u00b6\u06dc\3\2\2\2\u00b8\u06e3\3\2"+
		"\2\2\u00ba\u06f0\3\2\2\2\u00bc\u0726\3\2\2\2\u00be\u073b\3\2\2\2\u00c0"+
		"\u079a\3\2\2\2\u00c2\u079c\3\2\2\2\u00c4\u07b0\3\2\2\2\u00c6\u07b8\3\2"+
		"\2\2\u00c8\u07d0\3\2\2\2\u00ca\u07e0\3\2\2\2\u00cc\u07e8\3\2\2\2\u00ce"+
		"\u07ea\3\2\2\2\u00d0\u07ed\3\2\2\2\u00d2\u07ef\3\2\2\2\u00d4\u0807\3\2"+
		"\2\2\u00d6\u0837\3\2\2\2\u00d8\u084a\3\2\2\2\u00da\u086f\3\2\2\2\u00dc"+
		"\u0897\3\2\2\2\u00de\u08c5\3\2\2\2\u00e0\u08cd\3\2\2\2\u00e2\u08cf\3\2"+
		"\2\2\u00e4\u0908\3\2\2\2\u00e6\u094e\3\2\2\2\u00e8\u0986\3\2\2\2\u00ea"+
		"\u0988\3\2\2\2\u00ec\u0992\3\2\2\2\u00ee\u099f\3\2\2\2\u00f0\u09ac\3\2"+
		"\2\2\u00f2\u09ba\3\2\2\2\u00f4\u09cc\3\2\2\2\u00f6\u09db\3\2\2\2\u00f8"+
		"\u09e0\3\2\2\2\u00fa\u09ea\3\2\2\2\u00fc\u09f5\3\2\2\2\u00fe\u09f7\3\2"+
		"\2\2\u0100\u0a16\3\2\2\2\u0102\u0a47\3\2\2\2\u0104\u0a49\3\2\2\2\u0106"+
		"\u0a5c\3\2\2\2\u0108\u0a60\3\2\2\2\u010a\u0aac\3\2\2\2\u010c\u0aae\3\2"+
		"\2\2\u010e\u0ac1\3\2\2\2\u0110\u0ac3\3\2\2\2\u0112\u0ac5\3\2\2\2\u0114"+
		"\u0ac7\3\2\2\2\u0116\u0acb\3\2\2\2\u0118\u0acd\3\2\2\2\u011a\u0acf\3\2"+
		"\2\2\u011c\u0ad2\3\2\2\2\u011e\u0ad6\3\2\2\2\u0120\u0ad8\3\2\2\2\u0122"+
		"\u0ada\3\2\2\2\u0124\u0adc\3\2\2\2\u0126\u0ade\3\2\2\2\u0128\u0ae0\3\2"+
		"\2\2\u012a\u0ae2\3\2\2\2\u012c\u0ae4\3\2\2\2\u012e\u0ae6\3\2\2\2\u0130"+
		"\u0ae8\3\2\2\2\u0132\u0aea\3\2\2\2\u0134\u0aec\3\2\2\2\u0136\u0aee\3\2"+
		"\2\2\u0138\u0af0\3\2\2\2\u013a\u0af2\3\2\2\2\u013c\u0af4\3\2\2\2\u013e"+
		"\u0af6\3\2\2\2\u0140\u0af8\3\2\2\2\u0142\u0b01\3\2\2\2\u0144\u0149\5\6"+
		"\4\2\u0145\u0149\5(\25\2\u0146\u0149\5.\30\2\u0147\u0149\5\4\3\2\u0148"+
		"\u0144\3\2\2\2\u0148\u0145\3\2\2\2\u0148\u0146\3\2\2\2\u0148\u0147\3\2"+
		"\2\2\u0149\u014c\3\2\2\2\u014a\u0148\3\2\2\2\u014a\u014b\3\2\2\2\u014b"+
		"\u014d\3\2\2\2\u014c\u014a\3\2\2\2\u014d\u014e\7\2\2\3\u014e\3\3\2\2\2"+
		"\u014f\u0150\7\u00cd\2\2\u0150\u0151\b\3\1\2\u0151\5\3\2\2\2\u0152\u0154"+
		"\7\26\2\2\u0153\u0152\3\2\2\2\u0154\u0157\3\2\2\2\u0155\u0153\3\2\2\2"+
		"\u0155\u0156\3\2\2\2\u0156\u0158\3\2\2\2\u0157\u0155\3\2\2\2\u0158\u0161"+
		"\5\b\5\2\u0159\u015b\7\26\2\2\u015a\u0159\3\2\2\2\u015b\u015c\3\2\2\2"+
		"\u015c\u015a\3\2\2\2\u015c\u015d\3\2\2\2\u015d\u015e\3\2\2\2\u015e\u0160"+
		"\5\b\5\2\u015f\u015a\3\2\2\2\u0160\u0163\3\2\2\2\u0161\u015f\3\2\2\2\u0161"+
		"\u0162\3\2\2\2\u0162\u0167\3\2\2\2\u0163\u0161\3\2\2\2\u0164\u0166\7\26"+
		"\2\2\u0165\u0164\3\2\2\2\u0166\u0169\3\2\2\2\u0167\u0165\3\2\2\2\u0167"+
		"\u0168\3\2\2\2\u0168\7\3\2\2\2\u0169\u0167\3\2\2\2\u016a\u0174\5\n\6\2"+
		"\u016b\u0174\5\u00a6T\2\u016c\u0174\5\u00acW\2\u016d\u0174\5\30\r\2\u016e"+
		"\u0174\5\u00b6\\\2\u016f\u0174\5\u00b8]\2\u0170\u0174\5\u00bc_\2\u0171"+
		"\u0174\5\u00ba^\2\u0172\u0174\5\u00c2b\2\u0173\u016a\3\2\2\2\u0173\u016b"+
		"\3\2\2\2\u0173\u016c\3\2\2\2\u0173\u016d\3\2\2\2\u0173\u016e\3\2\2\2\u0173"+
		"\u016f\3\2\2\2\u0173\u0170\3\2\2\2\u0173\u0171\3\2\2\2\u0173\u0172\3\2"+
		"\2\2\u0174\t\3\2\2\2\u0175\u0179\7L\2\2\u0176\u0178\5\u0092J\2\u0177\u0176"+
		"\3\2\2\2\u0178\u017b\3\2\2\2\u0179\u0177\3\2\2\2\u0179\u017a\3\2\2\2\u017a"+
		"\u017c\3\2\2\2\u017b\u0179\3\2\2\2\u017c\u017d\7\30\2\2\u017d\u017e\5"+
		"\16\b\2\u017e\u017f\7\34\2\2\u017f\u0180\5\20\t\2\u0180\u0181\7\34\2\2"+
		"\u0181\u0182\5\22\n\2\u0182\u0183\7\34\2\2\u0183\u0184\5\24\13\2\u0184"+
		"\u0185\7\34\2\2\u0185\u0186\7\31\2\2\u0186\u0187\5\f\7\2\u0187\u0188\7"+
		"\32\2\2\u0188\u0189\7\33\2\2\u0189\u018a\7\26\2\2\u018a\13\3\2\2\2\u018b"+
		"\u018c\t\2\2\2\u018c\r\3\2\2\2\u018d\u018e\5\u0142\u00a2\2\u018e\17\3"+
		"\2\2\2\u018f\u0190\5\u0142\u00a2\2\u0190\21\3\2\2\2\u0191\u0192\5\u0142"+
		"\u00a2\2\u0192\23\3\2\2\2\u0193\u0194\t\2\2\2\u0194\25\3\2\2\2\u0195\u01a2"+
		"\5\u0092J\2\u0196\u019e\7\u00c7\2\2\u0197\u019a\7\34\2\2\u0198\u019b\5"+
		"\u0092J\2\u0199\u019b\7\u00c7\2\2\u019a\u0198\3\2\2\2\u019a\u0199\3\2"+
		"\2\2\u019b\u019d\3\2\2\2\u019c\u0197\3\2\2\2\u019d\u01a0\3\2\2\2\u019e"+
		"\u019c\3\2\2\2\u019e\u019f\3\2\2\2\u019f\u01a2\3\2\2\2\u01a0\u019e\3\2"+
		"\2\2\u01a1\u0195\3\2\2\2\u01a1\u0196\3\2\2\2\u01a2\27\3\2\2\2\u01a3\u01a4"+
		"\7L\2\2\u01a4\u01a5\7\u00be\2\2\u01a5\u01a6\5\u0126\u0094\2\u01a6\u01a7"+
		"\7\30\2\2\u01a7\u01a8\5\u00c4c\2\u01a8\u01b1\5\32\16\2\u01a9\u01aa\7\34"+
		"\2\2\u01aa\u01b0\5\u00ecw\2\u01ab\u01ac\7\34\2\2\u01ac\u01ad\5\u00c4c"+
		"\2\u01ad\u01ae\5\32\16\2\u01ae\u01b0\3\2\2\2\u01af\u01a9\3\2\2\2\u01af"+
		"\u01ab\3\2\2\2\u01b0\u01b3\3\2\2\2\u01b1\u01af\3\2\2\2\u01b1\u01b2\3\2"+
		"\2\2\u01b2\u01b4\3\2\2\2\u01b3\u01b1\3\2\2\2\u01b4\u01b5\7\33\2\2\u01b5"+
		"\u01bc\3\2\2\2\u01b6\u01b7\7\u00be\2\2\u01b7\u01b8\7\35\2\2\u01b8\u01b9"+
		"\t\3\2\2\u01b9\u01ba\7\u00bf\2\2\u01ba\u01bb\7\35\2\2\u01bb\u01bd\5\u0142"+
		"\u00a2\2\u01bc\u01b6\3\2\2\2\u01bc\u01bd\3\2\2\2\u01bd\31\3\2\2\2\u01be"+
		"\u01c3\7\u00c2\2\2\u01bf\u01c3\7\u00c0\2\2\u01c0\u01c3\7\u00c1\2\2\u01c1"+
		"\u01c3\5\u0092J\2\u01c2\u01be\3\2\2\2\u01c2\u01bf\3\2\2\2\u01c2\u01c0"+
		"\3\2\2\2\u01c2\u01c1\3\2\2\2\u01c3\33\3\2\2\2\u01c4\u01c5\t\2\2\2\u01c5"+
		"\35\3\2\2\2\u01c6\u01c7\7\u00c2\2\2\u01c7\37\3\2\2\2\u01c8\u01c9\7\u00c0"+
		"\2\2\u01c9!\3\2\2\2\u01ca\u01cb\7\u00c1\2\2\u01cb#\3\2\2\2\u01cc\u01cd"+
		"\7\u00bb\2\2\u01cd\u01ce\7\30\2\2\u01ce\u01d3\5&\24\2\u01cf\u01d0\7\37"+
		"\2\2\u01d0\u01d2\5&\24\2\u01d1\u01cf\3\2\2\2\u01d2\u01d5\3\2\2\2\u01d3"+
		"\u01d1\3\2\2\2\u01d3\u01d4\3\2\2\2\u01d4\u01d6\3\2\2\2\u01d5\u01d3\3\2"+
		"\2\2\u01d6\u01d7\7\33\2\2\u01d7\u01d8\7\26\2\2\u01d8%\3\2\2\2\u01d9\u01df"+
		"\5\u0142\u00a2\2\u01da\u01df\5\64\33\2\u01db\u01df\5\u0090I\2\u01dc\u01df"+
		"\5\u008aF\2\u01dd\u01df\5\u00d8m\2\u01de\u01d9\3\2\2\2\u01de\u01da\3\2"+
		"\2\2\u01de\u01db\3\2\2\2\u01de\u01dc\3\2\2\2\u01de\u01dd\3\2\2\2\u01df"+
		"\'\3\2\2\2\u01e0\u01e4\5*\26\2\u01e1\u01e3\5*\26\2\u01e2\u01e1\3\2\2\2"+
		"\u01e3\u01e6\3\2\2\2\u01e4\u01e2\3\2\2\2\u01e4\u01e5\3\2\2\2\u01e5)\3"+
		"\2\2\2\u01e6\u01e4\3\2\2\2\u01e7\u01e8\5,\27\2\u01e8\u01e9\5\66\34\2\u01e9"+
		"+\3\2\2\2\u01ea\u01eb\5\u0092J\2\u01eb\u01ec\7\30\2\2\u01ec\u01ed\5D#"+
		"\2\u01ed\u01ee\7\33\2\2\u01ee-\3\2\2\2\u01ef\u01f0\5\u0092J\2\u01f0\u01f1"+
		"\7\30\2\2\u01f1\u01f4\5F$\2\u01f2\u01f3\7\34\2\2\u01f3\u01f5\5> \2\u01f4"+
		"\u01f2\3\2\2\2\u01f4\u01f5\3\2\2\2\u01f5\u01f6\3\2\2\2\u01f6\u01f7\7\33"+
		"\2\2\u01f7\u01f8\7\26\2\2\u01f8/\3\2\2\2\u01f9\u01fa\5\u0092J\2\u01fa"+
		"\u01fb\7\30\2\2\u01fb\u01fc\5F$\2\u01fc\u01fd\7\33\2\2\u01fd\61\3\2\2"+
		"\2\u01fe\u01ff\5\u0092J\2\u01ff\u0200\7\30\2\2\u0200\u0203\5F$\2\u0201"+
		"\u0202\7\34\2\2\u0202\u0204\5> \2\u0203\u0201\3\2\2\2\u0203\u0204\3\2"+
		"\2\2\u0204\u0205\3\2\2\2\u0205\u0206\7\33\2\2\u0206\63\3\2\2\2\u0207\u0208"+
		"\5\u0092J\2\u0208\u0209\7\30\2\2\u0209\u020a\5F$\2\u020a\u020b\7\33\2"+
		"\2\u020b\65\3\2\2\2\u020c\u020d\7\5\2\2\u020d\u020e\5:\36\2\u020e\u020f"+
		"\7\6\2\2\u020f\67\3\2\2\2\u0210\u0222\5\6\4\2\u0211\u0222\5z>\2\u0212"+
		"\u0222\5l\67\2\u0213\u0222\5h\65\2\u0214\u0222\5b\62\2\u0215\u0222\5N"+
		"(\2\u0216\u0222\5R*\2\u0217\u0222\5p9\2\u0218\u0222\5B\"\2\u0219\u0222"+
		"\5.\30\2\u021a\u021b\5\u0090I\2\u021b\u021c\7\26\2\2\u021c\u0222\3\2\2"+
		"\2\u021d\u0222\5\u0094K\2\u021e\u0222\5\u008eH\2\u021f\u0222\5\u009eP"+
		"\2\u0220\u0222\5$\23\2\u0221\u0210\3\2\2\2\u0221\u0211\3\2\2\2\u0221\u0212"+
		"\3\2\2\2\u0221\u0213\3\2\2\2\u0221\u0214\3\2\2\2\u0221\u0215\3\2\2\2\u0221"+
		"\u0216\3\2\2\2\u0221\u0217\3\2\2\2\u0221\u0218\3\2\2\2\u0221\u0219\3\2"+
		"\2\2\u0221\u021a\3\2\2\2\u0221\u021d\3\2\2\2\u0221\u021e\3\2\2\2\u0221"+
		"\u021f\3\2\2\2\u0221\u0220\3\2\2\2\u0222\u0225\3\2\2\2\u0223\u0221\3\2"+
		"\2\2\u0223\u0224\3\2\2\2\u02249\3\2\2\2\u0225\u0223\3\2\2\2\u0226\u0228"+
		"\5<\37\2\u0227\u0226\3\2\2\2\u0228\u022b\3\2\2\2\u0229\u0227\3\2\2\2\u0229"+
		"\u022a\3\2\2\2\u022a;\3\2\2\2\u022b\u0229\3\2\2\2\u022c\u023f\5\6\4\2"+
		"\u022d\u023f\5z>\2\u022e\u023f\5l\67\2\u022f\u023f\5h\65\2\u0230\u023f"+
		"\5b\62\2\u0231\u023f\5N(\2\u0232\u023f\5R*\2\u0233\u023f\5p9\2\u0234\u023f"+
		"\5\u008eH\2\u0235\u023f\5B\"\2\u0236\u023f\5$\23\2\u0237\u023f\5*\26\2"+
		"\u0238\u023f\5.\30\2\u0239\u023a\5\u0090I\2\u023a\u023b\7\26\2\2\u023b"+
		"\u023f\3\2\2\2\u023c\u023f\5\u009eP\2\u023d\u023f\5\u0094K\2\u023e\u022c"+
		"\3\2\2\2\u023e\u022d\3\2\2\2\u023e\u022e\3\2\2\2\u023e\u022f\3\2\2\2\u023e"+
		"\u0230\3\2\2\2\u023e\u0231\3\2\2\2\u023e\u0232\3\2\2\2\u023e\u0233\3\2"+
		"\2\2\u023e\u0234\3\2\2\2\u023e\u0235\3\2\2\2\u023e\u0236\3\2\2\2\u023e"+
		"\u0237\3\2\2\2\u023e\u0238\3\2\2\2\u023e\u0239\3\2\2\2\u023e\u023c\3\2"+
		"\2\2\u023e\u023d\3\2\2\2\u023f=\3\2\2\2\u0240\u0241\7\u00ba\2\2\u0241"+
		"\u0242\7\30\2\2\u0242\u0247\5\u0092J\2\u0243\u0244\7\34\2\2\u0244\u0246"+
		"\5\u0092J\2\u0245\u0243\3\2\2\2\u0246\u0249\3\2\2\2\u0247\u0245\3\2\2"+
		"\2\u0247\u0248\3\2\2\2\u0248\u024a\3\2\2\2\u0249\u0247\3\2\2\2\u024a\u024b"+
		"\7\33\2\2\u024b\u024c\7\5\2\2\u024c\u024d\58\35\2\u024d\u024e\7\6\2\2"+
		"\u024e?\3\2\2\2\u024f\u0254\5\u0092J\2\u0250\u0251\7\u00ce\2\2\u0251\u0253"+
		"\5\u0092J\2\u0252\u0250\3\2\2\2\u0253\u0256\3\2\2\2\u0254\u0252\3\2\2"+
		"\2\u0254\u0255\3\2\2\2\u0255\u0257\3\2\2\2\u0256\u0254\3\2\2\2\u0257\u0258"+
		"\5\u00a0Q\2\u0258\u025d\5\u0092J\2\u0259\u025a\7\u00ce\2\2\u025a\u025c"+
		"\5\u0092J\2\u025b\u0259\3\2\2\2\u025c\u025f\3\2\2\2\u025d\u025b\3\2\2"+
		"\2\u025d\u025e\3\2\2\2\u025eA\3\2\2\2\u025f\u025d\3\2\2\2\u0260\u029b"+
		"\7\u00b2\2\2\u0261\u0274\7\u00c5\2\2\u0262\u0265\7\31\2\2\u0263\u0266"+
		"\5\u0092J\2\u0264\u0266\7\u00c7\2\2\u0265\u0263\3\2\2\2\u0265\u0264\3"+
		"\2\2\2\u0265\u0266\3\2\2\2\u0266\u0267\3\2\2\2\u0267\u0275\7\32\2\2\u0268"+
		"\u026b\7\31\2\2\u0269\u026c\5\u0092J\2\u026a\u026c\7\u00c7\2\2\u026b\u0269"+
		"\3\2\2\2\u026b\u026a\3\2\2\2\u026b\u026c\3\2\2\2\u026c\u026d\3\2\2\2\u026d"+
		"\u026e\7\32\2\2\u026e\u0271\7\31\2\2\u026f\u0272\5\u0092J\2\u0270\u0272"+
		"\7\u00c7\2\2\u0271\u026f\3\2\2\2\u0271\u0270\3\2\2\2\u0271\u0272\3\2\2"+
		"\2\u0272\u0273\3\2\2\2\u0273\u0275\7\32\2\2\u0274\u0262\3\2\2\2\u0274"+
		"\u0268\3\2\2\2\u0275\u028c\3\2\2\2\u0276\u0279\7\31\2\2\u0277\u027a\5"+
		"\u0092J\2\u0278\u027a\7\u00c7\2\2\u0279\u0277\3\2\2\2\u0279\u0278\3\2"+
		"\2\2\u0279\u027a\3\2\2\2\u027a\u027b\3\2\2\2\u027b\u0289\7\32\2\2\u027c"+
		"\u027f\7\31\2\2\u027d\u0280\5\u0092J\2\u027e\u0280\7\u00c7\2\2\u027f\u027d"+
		"\3\2\2\2\u027f\u027e\3\2\2\2\u027f\u0280\3\2\2\2\u0280\u0281\3\2\2\2\u0281"+
		"\u0282\7\32\2\2\u0282\u0285\7\31\2\2\u0283\u0286\5\u0092J\2\u0284\u0286"+
		"\7\u00c7\2\2\u0285\u0283\3\2\2\2\u0285\u0284\3\2\2\2\u0285\u0286\3\2\2"+
		"\2\u0286\u0287\3\2\2\2\u0287\u0289\7\32\2\2\u0288\u0276\3\2\2\2\u0288"+
		"\u027c\3\2\2\2\u0289\u028a\3\2\2\2\u028a\u028c\7\u00c5\2\2\u028b\u0261"+
		"\3\2\2\2\u028b\u0288\3\2\2\2\u028c\u029c\3\2\2\2\u028d\u0291\7\u00c5\2"+
		"\2\u028e\u0292\7\7\2\2\u028f\u0290\7\7\2\2\u0290\u0292\7\7\2\2\u0291\u028e"+
		"\3\2\2\2\u0291\u028f\3\2\2\2\u0292\u029a\3\2\2\2\u0293\u0297\7\7\2\2\u0294"+
		"\u0295\7\7\2\2\u0295\u0297\7\7\2\2\u0296\u0293\3\2\2\2\u0296\u0294\3\2"+
		"\2\2\u0297\u0298\3\2\2\2\u0298\u029a\7\u00c5\2\2\u0299\u028d\3\2\2\2\u0299"+
		"\u0296\3\2\2\2\u029a\u029c\3\2\2\2\u029b\u028b\3\2\2\2\u029b\u0299\3\2"+
		"\2\2\u029c\u029d\3\2\2\2\u029d\u02c6\7\35\2\2\u029e\u02bb\7\31\2\2\u029f"+
		"\u02a2\5\u0092J\2\u02a0\u02a2\7\u00c7\2\2\u02a1\u029f\3\2\2\2\u02a1\u02a0"+
		"\3\2\2\2\u02a2\u02aa\3\2\2\2\u02a3\u02a6\7\34\2\2\u02a4\u02a7\5\u0092"+
		"J\2\u02a5\u02a7\7\u00c7\2\2\u02a6\u02a4\3\2\2\2\u02a6\u02a5\3\2\2\2\u02a7"+
		"\u02a9\3\2\2\2\u02a8\u02a3\3\2\2\2\u02a9\u02ac\3\2\2\2\u02aa\u02a8\3\2"+
		"\2\2\u02aa\u02ab\3\2\2\2\u02ab\u02bc\3\2\2\2\u02ac\u02aa\3\2\2\2\u02ad"+
		"\u02b0\5\u0092J\2\u02ae\u02b0\7\u00c7\2\2\u02af\u02ad\3\2\2\2\u02af\u02ae"+
		"\3\2\2\2\u02b0\u02b8\3\2\2\2\u02b1\u02b4\7\34\2\2\u02b2\u02b5\5\u0092"+
		"J\2\u02b3\u02b5\7\u00c7\2\2\u02b4\u02b2\3\2\2\2\u02b4\u02b3\3\2\2\2\u02b5"+
		"\u02b7\3\2\2\2\u02b6\u02b1\3\2\2\2\u02b7\u02ba\3\2\2\2\u02b8\u02b6\3\2"+
		"\2\2\u02b8\u02b9\3\2\2\2\u02b9\u02bc\3\2\2\2\u02ba\u02b8\3\2\2\2\u02bb"+
		"\u02a1\3\2\2\2\u02bb\u02af\3\2\2\2\u02bc\u02bd\3\2\2\2\u02bd\u02bf\7\32"+
		"\2\2\u02be\u029e\3\2\2\2\u02be\u02bf\3\2\2\2\u02bf\u02c7\3\2\2\2\u02c0"+
		"\u02c5\5\u0092J\2\u02c1\u02c5\5\64\33\2\u02c2\u02c5\5\b\5\2\u02c3\u02c5"+
		"\5Z.\2\u02c4\u02c0\3\2\2\2\u02c4\u02c1\3\2\2\2\u02c4\u02c2\3\2\2\2\u02c4"+
		"\u02c3\3\2\2\2\u02c5\u02c7\3\2\2\2\u02c6\u02be\3\2\2\2\u02c6\u02c4\3\2"+
		"\2\2\u02c7\u02c8\3\2\2\2\u02c8\u02c9\7\26\2\2\u02c9C\3\2\2\2\u02ca\u02cc"+
		"\5J&\2\u02cb\u02ca\3\2\2\2\u02cb\u02cc\3\2\2\2\u02cc\u02ea\3\2\2\2\u02cd"+
		"\u02d2\5L\'\2\u02ce\u02cf\7\34\2\2\u02cf\u02d1\5L\'\2\u02d0\u02ce\3\2"+
		"\2\2\u02d1\u02d4\3\2\2\2\u02d2\u02d0\3\2\2\2\u02d2\u02d3\3\2\2\2\u02d3"+
		"\u02ea\3\2\2\2\u02d4\u02d2\3\2\2\2\u02d5\u02da\5J&\2\u02d6\u02d7\7\34"+
		"\2\2\u02d7\u02d9\5J&\2\u02d8\u02d6\3\2\2\2\u02d9\u02dc\3\2\2\2\u02da\u02d8"+
		"\3\2\2\2\u02da\u02db\3\2\2\2\u02db\u02de\3\2\2\2\u02dc\u02da\3\2\2\2\u02dd"+
		"\u02d5\3\2\2\2\u02de\u02e1\3\2\2\2\u02df\u02dd\3\2\2\2\u02df\u02e0\3\2"+
		"\2\2\u02e0\u02e6\3\2\2\2\u02e1\u02df\3\2\2\2\u02e2\u02e3\7\34\2\2\u02e3"+
		"\u02e5\5L\'\2\u02e4\u02e2\3\2\2\2\u02e5\u02e8\3\2\2\2\u02e6\u02e4\3\2"+
		"\2\2\u02e6\u02e7\3\2\2\2\u02e7\u02ea\3\2\2\2\u02e8\u02e6\3\2\2\2\u02e9"+
		"\u02cb\3\2\2\2\u02e9\u02cd\3\2\2\2\u02e9\u02df\3\2\2\2\u02eaE\3\2\2\2"+
		"\u02eb\u02ed\5H%\2\u02ec\u02eb\3\2\2\2\u02ec\u02ed\3\2\2\2\u02ed\u02f7"+
		"\3\2\2\2\u02ee\u02f3\5H%\2\u02ef\u02f0\7\34\2\2\u02f0\u02f2\5H%\2\u02f1"+
		"\u02ef\3\2\2\2\u02f2\u02f5\3\2\2\2\u02f3\u02f1\3\2\2\2\u02f3\u02f4\3\2"+
		"\2\2\u02f4\u02f7\3\2\2\2\u02f5\u02f3\3\2\2\2\u02f6\u02ec\3\2\2\2\u02f6"+
		"\u02ee\3\2\2\2\u02f7G\3\2\2\2\u02f8\u02fd\5\u0092J\2\u02f9\u02fd\7\u00c7"+
		"\2\2\u02fa\u02fd\5\u008cG\2\u02fb\u02fd\5\64\33\2\u02fc\u02f8\3\2\2\2"+
		"\u02fc\u02f9\3\2\2\2\u02fc\u02fa\3\2\2\2\u02fc\u02fb\3\2\2\2\u02fdI\3"+
		"\2\2\2\u02fe\u02ff\7\u00b2\2\2\u02ff\u0300\5\u0092J\2\u0300K\3\2\2\2\u0301"+
		"\u0302\7\u00b2\2\2\u0302\u0303\5\u0092J\2\u0303\u0306\7\35\2\2\u0304\u0307"+
		"\7\u00c7\2\2\u0305\u0307\5\u00d8m\2\u0306\u0304\3\2\2\2\u0306\u0305\3"+
		"\2\2\2\u0307M\3\2\2\2\u0308\u0309\7\u00b6\2\2\u0309\u030a\5T+\2\u030a"+
		"\u030b\5P)\2\u030bO\3\2\2\2\u030c\u031a\7\5\2\2\u030d\u0310\5:\36\2\u030e"+
		"\u030f\7D\2\2\u030f\u0311\7\26\2\2\u0310\u030e\3\2\2\2\u0310\u0311\3\2"+
		"\2\2\u0311\u0313\3\2\2\2\u0312\u0314\5:\36\2\u0313\u0312\3\2\2\2\u0313"+
		"\u0314\3\2\2\2\u0314\u031b\3\2\2\2\u0315\u0316\7D\2\2\u0316\u0318\7\26"+
		"\2\2\u0317\u0315\3\2\2\2\u0317\u0318\3\2\2\2\u0318\u0319\3\2\2\2\u0319"+
		"\u031b\5:\36\2\u031a\u030d\3\2\2\2\u031a\u0317\3\2\2\2\u031b\u031c\3\2"+
		"\2\2\u031c\u031d\7\6\2\2\u031d\u0320\3\2\2\2\u031e\u0320\5\u0088E\2\u031f"+
		"\u030c\3\2\2\2\u031f\u031e\3\2\2\2\u0320Q\3\2\2\2\u0321\u0322\7\u00b9"+
		"\2\2\u0322\u0323\5P)\2\u0323\u0324\5T+\2\u0324\u0325\7\26\2\2\u0325S\3"+
		"\2\2\2\u0326\u0336\7\30\2\2\u0327\u032b\5\64\33\2\u0328\u0329\5\u00a2"+
		"R\2\u0329\u032a\t\4\2\2\u032a\u032c\3\2\2\2\u032b\u0328\3\2\2\2\u032b"+
		"\u032c\3\2\2\2\u032c\u0337\3\2\2\2\u032d\u032e\5\u00d8m\2\u032e\u0332"+
		"\5\u00a2R\2\u032f\u0333\5\u00d8m\2\u0330\u0333\7\b\2\2\u0331\u0333\7\t"+
		"\2\2\u0332\u032f\3\2\2\2\u0332\u0330\3\2\2\2\u0332\u0331\3\2\2\2\u0333"+
		"\u0337\3\2\2\2\u0334\u0337\7\b\2\2\u0335\u0337\7\t\2\2\u0336\u0327\3\2"+
		"\2\2\u0336\u032d\3\2\2\2\u0336\u0334\3\2\2\2\u0336\u0335\3\2\2\2\u0337"+
		"\u0338\3\2\2\2\u0338\u0339\7\33\2\2\u0339U\3\2\2\2\u033a\u033b\7\u00b6"+
		"\2\2\u033b\u037f\7\30\2\2\u033c\u0340\5\64\33\2\u033d\u033e\5\u00a2R\2"+
		"\u033e\u033f\t\4\2\2\u033f\u0341\3\2\2\2\u0340\u033d\3\2\2\2\u0340\u0341"+
		"\3\2\2\2\u0341\u0380\3\2\2\2\u0342\u0346\5X-\2\u0343\u0346\5\u0092J\2"+
		"\u0344\u0346\7\u00c7\2\2\u0345\u0342\3\2\2\2\u0345\u0343\3\2\2\2\u0345"+
		"\u0344\3\2\2\2\u0346\u034f\3\2\2\2\u0347\u034b\5\u00a4S\2\u0348\u034c"+
		"\5\u0092J\2\u0349\u034c\7\u00c7\2\2\u034a\u034c\5X-\2\u034b\u0348\3\2"+
		"\2\2\u034b\u0349\3\2\2\2\u034b\u034a\3\2\2\2\u034c\u034e\3\2\2\2\u034d"+
		"\u0347\3\2\2\2\u034e\u0351\3\2\2\2\u034f\u034d\3\2\2\2\u034f\u0350\3\2"+
		"\2\2\u0350\u0365\3\2\2\2\u0351\u034f\3\2\2\2\u0352\u0356\t\5\2\2\u0353"+
		"\u0357\5X-\2\u0354\u0357\5\u0092J\2\u0355\u0357\7\u00c7\2\2\u0356\u0353"+
		"\3\2\2\2\u0356\u0354\3\2\2\2\u0356\u0355\3\2\2\2\u0357\u0360\3\2\2\2\u0358"+
		"\u035c\5\u00a4S\2\u0359\u035d\5\u0092J\2\u035a\u035d\7\u00c7\2\2\u035b"+
		"\u035d\5X-\2\u035c\u0359\3\2\2\2\u035c\u035a\3\2\2\2\u035c\u035b\3\2\2"+
		"\2\u035d\u035f\3\2\2\2\u035e\u0358\3\2\2\2\u035f\u0362\3\2\2\2\u0360\u035e"+
		"\3\2\2\2\u0360\u0361\3\2\2\2\u0361\u0364\3\2\2\2\u0362\u0360\3\2\2\2\u0363"+
		"\u0352\3\2\2\2\u0364\u0367\3\2\2\2\u0365\u0363\3\2\2\2\u0365\u0366\3\2"+
		"\2\2\u0366\u0368\3\2\2\2\u0367\u0365\3\2\2\2\u0368\u037b\5\u00a2R\2\u0369"+
		"\u036d\5X-\2\u036a\u036d\5\u0092J\2\u036b\u036d\7\u00c7\2\2\u036c\u0369"+
		"\3\2\2\2\u036c\u036a\3\2\2\2\u036c\u036b\3\2\2\2\u036d\u0376\3\2\2\2\u036e"+
		"\u0372\5\u00a4S\2\u036f\u0373\5\u0092J\2\u0370\u0373\7\u00c7\2\2\u0371"+
		"\u0373\5X-\2\u0372\u036f\3\2\2\2\u0372\u0370\3\2\2\2\u0372\u0371\3\2\2"+
		"\2\u0373\u0375\3\2\2\2\u0374\u036e\3\2\2\2\u0375\u0378\3\2\2\2\u0376\u0374"+
		"\3\2\2\2\u0376\u0377\3\2\2\2\u0377\u037c\3\2\2\2\u0378\u0376\3\2\2\2\u0379"+
		"\u037c\7\b\2\2\u037a\u037c\7\t\2\2\u037b\u036c\3\2\2\2\u037b\u0379\3\2"+
		"\2\2\u037b\u037a\3\2\2\2\u037c\u0380\3\2\2\2\u037d\u0380\7\b\2\2\u037e"+
		"\u0380\7\t\2\2\u037f\u033c\3\2\2\2\u037f\u0345\3\2\2\2\u037f\u037d\3\2"+
		"\2\2\u037f\u037e\3\2\2\2\u0380\u0381\3\2\2\2\u0381\u0382\7\33\2\2\u0382"+
		"W\3\2\2\2\u0383\u0394\7\30\2\2\u0384\u0387\5\u0092J\2\u0385\u0387\7\u00c7"+
		"\2\2\u0386\u0384\3\2\2\2\u0386\u0385\3\2\2\2\u0387\u038f\3\2\2\2\u0388"+
		"\u038b\5\u00a4S\2\u0389\u038c\5\u0092J\2\u038a\u038c\7\u00c7\2\2\u038b"+
		"\u0389\3\2\2\2\u038b\u038a\3\2\2\2\u038c\u038e\3\2\2\2\u038d\u0388\3\2"+
		"\2\2\u038e\u0391\3\2\2\2\u038f\u038d\3\2\2\2\u038f\u0390\3\2\2\2\u0390"+
		"\u0393\3\2\2\2\u0391\u038f\3\2\2\2\u0392\u0386\3\2\2\2\u0393\u0396\3\2"+
		"\2\2\u0394\u0392\3\2\2\2\u0394\u0395\3\2\2\2\u0395\u03ab\3\2\2\2\u0396"+
		"\u0394\3\2\2\2\u0397\u0398\5\u00a4S\2\u0398\u0399\5X-\2\u0399\u039a\5"+
		"\u00a4S\2\u039a\u03aa\3\2\2\2\u039b\u039e\5\u0092J\2\u039c\u039e\7\u00c7"+
		"\2\2\u039d\u039b\3\2\2\2\u039d\u039c\3\2\2\2\u039e\u03a6\3\2\2\2\u039f"+
		"\u03a2\5\u00a4S\2\u03a0\u03a3\5\u0092J\2\u03a1\u03a3\7\u00c7\2\2\u03a2"+
		"\u03a0\3\2\2\2\u03a2\u03a1\3\2\2\2\u03a3\u03a5\3\2\2\2\u03a4\u039f\3\2"+
		"\2\2\u03a5\u03a8\3\2\2\2\u03a6\u03a4\3\2\2\2\u03a6\u03a7\3\2\2\2\u03a7"+
		"\u03aa\3\2\2\2\u03a8\u03a6\3\2\2\2\u03a9\u0397\3\2\2\2\u03a9\u039d\3\2"+
		"\2\2\u03aa\u03ad\3\2\2\2\u03ab\u03a9\3\2\2\2\u03ab\u03ac\3\2\2\2\u03ac"+
		"\u03ae\3\2\2\2\u03ad\u03ab\3\2\2\2\u03ae\u03c8\7\33\2\2\u03af\u03b5\7"+
		"\30\2\2\u03b0\u03b1\5X-\2\u03b1\u03b2\5\u00a4S\2\u03b2\u03b4\3\2\2\2\u03b3"+
		"\u03b0\3\2\2\2\u03b4\u03b7\3\2\2\2\u03b5\u03b3\3\2\2\2\u03b5\u03b6\3\2"+
		"\2\2\u03b6\u03ba\3\2\2\2\u03b7\u03b5\3\2\2\2\u03b8\u03bb\5\u0092J\2\u03b9"+
		"\u03bb\7\u00c7\2\2\u03ba\u03b8\3\2\2\2\u03ba\u03b9\3\2\2\2\u03bb\u03c3"+
		"\3\2\2\2\u03bc\u03bf\5\u00a4S\2\u03bd\u03c0\5\u0092J\2\u03be\u03c0\7\u00c7"+
		"\2\2\u03bf\u03bd\3\2\2\2\u03bf\u03be\3\2\2\2\u03c0\u03c2\3\2\2\2\u03c1"+
		"\u03bc\3\2\2\2\u03c2\u03c5\3\2\2\2\u03c3\u03c1\3\2\2\2\u03c3\u03c4\3\2"+
		"\2\2\u03c4\u03c6\3\2\2\2\u03c5\u03c3\3\2\2\2\u03c6\u03c8\7\33\2\2\u03c7"+
		"\u0383\3\2\2\2\u03c7\u03af\3\2\2\2\u03c8Y\3\2\2\2\u03c9\u03cb\7\30\2\2"+
		"\u03ca\u03c9\3\2\2\2\u03ca\u03cb\3\2\2\2\u03cb\u03cc\3\2\2\2\u03cc\u03d6"+
		"\5\u0092J\2\u03cd\u03cf\5\\/\2\u03ce\u03cd\3\2\2\2\u03cf\u03d0\3\2\2\2"+
		"\u03d0\u03ce\3\2\2\2\u03d0\u03d1\3\2\2\2\u03d1\u03d4\3\2\2\2\u03d2\u03d5"+
		"\5\u0110\u0089\2\u03d3\u03d5\7\u00c5\2\2\u03d4\u03d2\3\2\2\2\u03d4\u03d3"+
		"\3\2\2\2\u03d5\u03d7\3\2\2\2\u03d6\u03ce\3\2\2\2\u03d6\u03d7\3\2\2\2\u03d7"+
		"\u03d9\3\2\2\2\u03d8\u03da\7\33\2\2\u03d9\u03d8\3\2\2\2\u03d9\u03da\3"+
		"\2\2\2\u03da\u03db\3\2\2\2\u03db\u03dd\7\60\2\2\u03dc\u03de\7\30\2\2\u03dd"+
		"\u03dc\3\2\2\2\u03dd\u03de\3\2\2\2\u03de\u03ee\3\2\2\2\u03df\u03ef\5Z"+
		".\2\u03e0\u03e4\5\u0092J\2\u03e1\u03e4\5\64\33\2\u03e2\u03e4\5\u008aF"+
		"\2\u03e3\u03e0\3\2\2\2\u03e3\u03e1\3\2\2\2\u03e3\u03e2\3\2\2\2\u03e4\u03e5"+
		"\3\2\2\2\u03e5\u03e6\7\35\2\2\u03e6\u03e8\3\2\2\2\u03e7\u03e3\3\2\2\2"+
		"\u03e7\u03e8\3\2\2\2\u03e8\u03ec\3\2\2\2\u03e9\u03ed\5\u0092J\2\u03ea"+
		"\u03ed\7\u00c7\2\2\u03eb\u03ed\5\64\33\2\u03ec\u03e9\3\2\2\2\u03ec\u03ea"+
		"\3\2\2\2\u03ec\u03eb\3\2\2\2\u03ed\u03ef\3\2\2\2\u03ee\u03df\3\2\2\2\u03ee"+
		"\u03e7\3\2\2\2\u03ef\u03f1\3\2\2\2\u03f0\u03f2\7\33\2\2\u03f1\u03f0\3"+
		"\2\2\2\u03f1\u03f2\3\2\2\2\u03f2\u03f3\3\2\2\2\u03f3\u03f5\7\61\2\2\u03f4"+
		"\u03f6\7\30\2\2\u03f5\u03f4\3\2\2\2\u03f5\u03f6\3\2\2\2\u03f6\u0406\3"+
		"\2\2\2\u03f7\u0407\5Z.\2\u03f8\u03fc\5\u0092J\2\u03f9\u03fc\5\64\33\2"+
		"\u03fa\u03fc\5\u008aF\2\u03fb\u03f8\3\2\2\2\u03fb\u03f9\3\2\2\2\u03fb"+
		"\u03fa\3\2\2\2\u03fc\u03fd\3\2\2\2\u03fd\u03fe\7\35\2\2\u03fe\u0400\3"+
		"\2\2\2\u03ff\u03fb\3\2\2\2\u03ff\u0400\3\2\2\2\u0400\u0404\3\2\2\2\u0401"+
		"\u0405\5\u0092J\2\u0402\u0405\7\u00c7\2\2\u0403\u0405\5\64\33\2\u0404"+
		"\u0401\3\2\2\2\u0404\u0402\3\2\2\2\u0404\u0403\3\2\2\2\u0405\u0407\3\2"+
		"\2\2\u0406\u03f7\3\2\2\2\u0406\u03ff\3\2\2\2\u0407\u0409\3\2\2\2\u0408"+
		"\u040a\7\33\2\2\u0409\u0408\3\2\2\2\u0409\u040a\3\2\2\2\u040a[\3\2\2\2"+
		"\u040b\u040c\t\6\2\2\u040c]\3\2\2\2\u040d\u040e\t\4\2\2\u040e_\3\2\2\2"+
		"\u040f\u0410\7k\2\2\u0410\u0455\7\30\2\2\u0411\u0415\5,\27\2\u0412\u0413"+
		"\5\u00a2R\2\u0413\u0414\t\4\2\2\u0414\u0416\3\2\2\2\u0415\u0412\3\2\2"+
		"\2\u0415\u0416\3\2\2\2\u0416\u0456\3\2\2\2\u0417\u041b\5X-\2\u0418\u041b"+
		"\5\u0092J\2\u0419\u041b\7\u00c7\2\2\u041a\u0417\3\2\2\2\u041a\u0418\3"+
		"\2\2\2\u041a\u0419\3\2\2\2\u041b\u0424\3\2\2\2\u041c\u0420\5\u00a4S\2"+
		"\u041d\u0421\5\u0092J\2\u041e\u0421\7\u00c7\2\2\u041f\u0421\5X-\2\u0420"+
		"\u041d\3\2\2\2\u0420\u041e\3\2\2\2\u0420\u041f\3\2\2\2\u0421\u0423\3\2"+
		"\2\2\u0422\u041c\3\2\2\2\u0423\u0426\3\2\2\2\u0424\u0422\3\2\2\2\u0424"+
		"\u0425\3\2\2\2\u0425\u043a\3\2\2\2\u0426\u0424\3\2\2\2\u0427\u042b\t\5"+
		"\2\2\u0428\u042c\5X-\2\u0429\u042c\5\u0092J\2\u042a\u042c\7\u00c7\2\2"+
		"\u042b\u0428\3\2\2\2\u042b\u0429\3\2\2\2\u042b\u042a\3\2\2\2\u042c\u0435"+
		"\3\2\2\2\u042d\u0431\5\u00a4S\2\u042e\u0432\5\u0092J\2\u042f\u0432\7\u00c7"+
		"\2\2\u0430\u0432\5X-\2\u0431\u042e\3\2\2\2\u0431\u042f\3\2\2\2\u0431\u0430"+
		"\3\2\2\2\u0432\u0434\3\2\2\2\u0433\u042d\3\2\2\2\u0434\u0437\3\2\2\2\u0435"+
		"\u0433\3\2\2\2\u0435\u0436\3\2\2\2\u0436\u0439\3\2\2\2\u0437\u0435\3\2"+
		"\2\2\u0438\u0427\3\2\2\2\u0439\u043c\3\2\2\2\u043a\u0438\3\2\2\2\u043a"+
		"\u043b\3\2\2\2\u043b\u043d\3\2\2\2\u043c\u043a\3\2\2\2\u043d\u0450\5\u00a2"+
		"R\2\u043e\u0442\5X-\2\u043f\u0442\5\u0092J\2\u0440\u0442\7\u00c7\2\2\u0441"+
		"\u043e\3\2\2\2\u0441\u043f\3\2\2\2\u0441\u0440\3\2\2\2\u0442\u044b\3\2"+
		"\2\2\u0443\u0447\5\u00a4S\2\u0444\u0448\5\u0092J\2\u0445\u0448\7\u00c7"+
		"\2\2\u0446\u0448\5X-\2\u0447\u0444\3\2\2\2\u0447\u0445\3\2\2\2\u0447\u0446"+
		"\3\2\2\2\u0448\u044a\3\2\2\2\u0449\u0443\3\2\2\2\u044a\u044d\3\2\2\2\u044b"+
		"\u0449\3\2\2\2\u044b\u044c\3\2\2\2\u044c\u0451\3\2\2\2\u044d\u044b\3\2"+
		"\2\2\u044e\u0451\7\b\2\2\u044f\u0451\7\t\2\2\u0450\u0441\3\2\2\2\u0450"+
		"\u044e\3\2\2\2\u0450\u044f\3\2\2\2\u0451\u0456\3\2\2\2\u0452\u0456\7\b"+
		"\2\2\u0453\u0456\7\t\2\2\u0454\u0456\7\u00c5\2\2\u0455\u0411\3\2\2\2\u0455"+
		"\u041a\3\2\2\2\u0455\u0452\3\2\2\2\u0455\u0453\3\2\2\2\u0455\u0454\3\2"+
		"\2\2\u0456\u0457\3\2\2\2\u0457\u045d\7\33\2\2\u0458\u0459\7\5\2\2\u0459"+
		"\u045a\58\35\2\u045a\u045b\7\6\2\2\u045b\u045e\3\2\2\2\u045c\u045e\5\u0088"+
		"E\2\u045d\u0458\3\2\2\2\u045d\u045c\3\2\2\2\u045ea\3\2\2\2\u045f\u0464"+
		"\5d\63\2\u0460\u0461\7[\2\2\u0461\u0463\5d\63\2\u0462\u0460\3\2\2\2\u0463"+
		"\u0466\3\2\2\2\u0464\u0462\3\2\2\2\u0464\u0465\3\2\2\2\u0465\u046f\3\2"+
		"\2\2\u0466\u0464\3\2\2\2\u0467\u046d\7[\2\2\u0468\u0469\7\5\2\2\u0469"+
		"\u046a\5:\36\2\u046a\u046b\7\6\2\2\u046b\u046e\3\2\2\2\u046c\u046e\5\u0088"+
		"E\2\u046d\u0468\3\2\2\2\u046d\u046c\3\2\2\2\u046e\u0470\3\2\2\2\u046f"+
		"\u0467\3\2\2\2\u046f\u0470\3\2\2\2\u0470c\3\2\2\2\u0471\u0472\7k\2\2\u0472"+
		"\u0478\5f\64\2\u0473\u0474\7\5\2\2\u0474\u0475\5:\36\2\u0475\u0476\7\6"+
		"\2\2\u0476\u0479\3\2\2\2\u0477\u0479\5\u0088E\2\u0478\u0473\3\2\2\2\u0478"+
		"\u0477\3\2\2\2\u0479e\3\2\2\2\u047a\u048b\7\30\2\2\u047b\u047f\5\64\33"+
		"\2\u047c\u047d\5\u00a2R\2\u047d\u047e\5^\60\2\u047e\u0480\3\2\2\2\u047f"+
		"\u047c\3\2\2\2\u047f\u0480\3\2\2\2\u0480\u048c\3\2\2\2\u0481\u0482\5\u00d8"+
		"m\2\u0482\u0485\5\u00a2R\2\u0483\u0486\5\u00d8m\2\u0484\u0486\5^\60\2"+
		"\u0485\u0483\3\2\2\2\u0485\u0484\3\2\2\2\u0486\u048c\3\2\2\2\u0487\u048a"+
		"\5^\60\2\u0488\u048a\7\u00c5\2\2\u0489\u0487\3\2\2\2\u0489\u0488\3\2\2"+
		"\2\u048a\u048c\3\2\2\2\u048b\u047b\3\2\2\2\u048b\u0481\3\2\2\2\u048b\u0489"+
		"\3\2\2\2\u048c\u048d\3\2\2\2\u048d\u048e\7\33\2\2\u048eg\3\2\2\2\u048f"+
		"\u0490\7d\2\2\u0490\u0496\5j\66\2\u0491\u0492\7\5\2\2\u0492\u0493\5:\36"+
		"\2\u0493\u0494\7\6\2\2\u0494\u0497\3\2\2\2\u0495\u0497\5\u0088E\2\u0496"+
		"\u0491\3\2\2\2\u0496\u0495\3\2\2\2\u0497i\3\2\2\2\u0498\u049a\7\30\2\2"+
		"\u0499\u049b\7\u00b2\2\2\u049a\u0499\3\2\2\2\u049a\u049b\3\2\2\2\u049b"+
		"\u049c\3\2\2\2\u049c\u049d\5\u0092J\2\u049d\u049e\7\61\2\2\u049e\u049f"+
		"\5\u0092J\2\u049f\u04a0\7\33\2\2\u04a0k\3\2\2\2\u04a1\u04a2\7d\2\2\u04a2"+
		"\u04a3\7\30\2\2\u04a3\u04a4\5n8\2\u04a4\u04aa\7\33\2\2\u04a5\u04a6\7\5"+
		"\2\2\u04a6\u04a7\5:\36\2\u04a7\u04a8\7\6\2\2\u04a8\u04ab\3\2\2\2\u04a9"+
		"\u04ab\5\u0088E\2\u04aa\u04a5\3\2\2\2\u04aa\u04a9\3\2\2\2\u04abm\3\2\2"+
		"\2\u04ac\u04ae\7\u00b2\2\2\u04ad\u04ac\3\2\2\2\u04ad\u04ae\3\2\2\2\u04ae"+
		"\u04af\3\2\2\2\u04af\u04b0\5\u0092J\2\u04b0\u04b1\7\35\2\2\u04b1\u04b2"+
		"\7\u00c7\2\2\u04b2\u04b3\7\26\2\2\u04b3\u04b4\5\u0092J\2\u04b4\u04b7\5"+
		"\u00a0Q\2\u04b5\u04b8\7\u00c7\2\2\u04b6\u04b8\5\u0092J\2\u04b7\u04b5\3"+
		"\2\2\2\u04b7\u04b6\3\2\2\2\u04b8\u04b9\3\2\2\2\u04b9\u04ba\7\26\2\2\u04ba"+
		"\u04bb\5\u0090I\2\u04bbo\3\2\2\2\u04bc\u04bd\7\u00b7\2\2\u04bd\u04be\5"+
		"r:\2\u04be\u04c0\7\5\2\2\u04bf\u04c1\5:\36\2\u04c0\u04bf\3\2\2\2\u04c0"+
		"\u04c1\3\2\2\2\u04c1\u04e3\3\2\2\2\u04c2\u04c4\5t;\2\u04c3\u04c2\3\2\2"+
		"\2\u04c4\u04c7\3\2\2\2\u04c5\u04c3\3\2\2\2\u04c5\u04c6\3\2\2\2\u04c6\u04c9"+
		"\3\2\2\2\u04c7\u04c5\3\2\2\2\u04c8\u04ca\5v<\2\u04c9\u04c8\3\2\2\2\u04c9"+
		"\u04ca\3\2\2\2\u04ca\u04e4\3\2\2\2\u04cb\u04cd\5v<\2\u04cc\u04cb\3\2\2"+
		"\2\u04cc\u04cd\3\2\2\2\u04cd\u04d1\3\2\2\2\u04ce\u04d0\5t;\2\u04cf\u04ce"+
		"\3\2\2\2\u04d0\u04d3\3\2\2\2\u04d1\u04cf\3\2\2\2\u04d1\u04d2\3\2\2\2\u04d2"+
		"\u04e4\3\2\2\2\u04d3\u04d1\3\2\2\2\u04d4\u04d6\5t;\2\u04d5\u04d4\3\2\2"+
		"\2\u04d6\u04d9\3\2\2\2\u04d7\u04d5\3\2\2\2\u04d7\u04d8\3\2\2\2\u04d8\u04db"+
		"\3\2\2\2\u04d9\u04d7\3\2\2\2\u04da\u04dc\5v<\2\u04db\u04da\3\2\2\2\u04db"+
		"\u04dc\3\2\2\2\u04dc\u04e0\3\2\2\2\u04dd\u04df\5t;\2\u04de\u04dd\3\2\2"+
		"\2\u04df\u04e2\3\2\2\2\u04e0\u04de\3\2\2\2\u04e0\u04e1\3\2\2\2\u04e1\u04e4"+
		"\3\2\2\2\u04e2\u04e0\3\2\2\2\u04e3\u04c5\3\2\2\2\u04e3\u04cc\3\2\2\2\u04e3"+
		"\u04d7\3\2\2\2\u04e4\u04e5\3\2\2\2\u04e5\u04e6\7\6\2\2\u04e6q\3\2\2\2"+
		"\u04e7\u04f0\7\30\2\2\u04e8\u04e9\7\13\2\2\u04e9\u04ea\7\u00c5\2\2\u04ea"+
		"\u04f1\7\13\2\2\u04eb\u04ec\7\f\2\2\u04ec\u04ed\5\u0092J\2\u04ed\u04ee"+
		"\7\f\2\2\u04ee\u04f1\3\2\2\2\u04ef\u04f1\5\u00d8m\2\u04f0\u04e8\3\2\2"+
		"\2\u04f0\u04eb\3\2\2\2\u04f0\u04ef\3\2\2\2\u04f1\u04f2\3\2\2\2\u04f2\u04f3"+
		"\7\33\2\2\u04f3s\3\2\2\2\u04f4\u04fa\7C\2\2\u04f5\u04f6\7\30\2\2\u04f6"+
		"\u04f7\5\u00d8m\2\u04f7\u04f8\7\33\2\2\u04f8\u04fb\3\2\2\2\u04f9\u04fb"+
		"\5\u00d8m\2\u04fa\u04f5\3\2\2\2\u04fa\u04f9\3\2\2\2\u04fb\u04fc\3\2\2"+
		"\2\u04fc\u04fd\7\61\2\2\u04fd\u04fe\5:\36\2\u04fe\u04ff\7\u00b8\2\2\u04ff"+
		"\u0500\7\26\2\2\u0500u\3\2\2\2\u0501\u0502\7R\2\2\u0502\u0503\7\61\2\2"+
		"\u0503\u0504\5:\36\2\u0504\u0505\7\u00b8\2\2\u0505\u0506\7\26\2\2\u0506"+
		"w\3\2\2\2\u0507\u0523\5\u0092J\2\u0508\u050a\5\u00a4S\2\u0509\u0508\3"+
		"\2\2\2\u0509\u050a\3\2\2\2\u050a\u050f\3\2\2\2\u050b\u0510\5\u008aF\2"+
		"\u050c\u0510\5\60\31\2\u050d\u0510\5\u0092J\2\u050e\u0510\5\u00d8m\2\u050f"+
		"\u050b\3\2\2\2\u050f\u050c\3\2\2\2\u050f\u050d\3\2\2\2\u050f\u050e\3\2"+
		"\2\2\u0510\u0520\3\2\2\2\u0511\u051c\7\35\2\2\u0512\u051d\7\u00c7\2\2"+
		"\u0513\u051d\5\b\5\2\u0514\u051d\5\60\31\2\u0515\u051d\5Z.\2\u0516\u051d"+
		"\5\u008cG\2\u0517\u051d\5\u008aF\2\u0518\u051d\5\u0096L\2\u0519\u051d"+
		"\5\u0092J\2\u051a\u051d\5\u00d8m\2\u051b\u051d\5^\60\2\u051c\u0512\3\2"+
		"\2\2\u051c\u0513\3\2\2\2\u051c\u0514\3\2\2\2\u051c\u0515\3\2\2\2\u051c"+
		"\u0516\3\2\2\2\u051c\u0517\3\2\2\2\u051c\u0518\3\2\2\2\u051c\u0519\3\2"+
		"\2\2\u051c\u051a\3\2\2\2\u051c\u051b\3\2\2\2\u051d\u051f\3\2\2\2\u051e"+
		"\u0511\3\2\2\2\u051f\u0522\3\2\2\2\u0520\u051e\3\2\2\2\u0520\u0521\3\2"+
		"\2\2\u0521\u0524\3\2\2\2\u0522\u0520\3\2\2\2\u0523\u0509\3\2\2\2\u0523"+
		"\u0524\3\2\2\2\u0524\u0525\3\2\2\2\u0525\u0526\7\26\2\2\u0526\u0548\3"+
		"\2\2\2\u0527\u0529\7\u00b2\2\2\u0528\u0527\3\2\2\2\u0528\u0529\3\2\2\2"+
		"\u0529\u052a\3\2\2\2\u052a\u0543\5\u0092J\2\u052b\u053c\7\35\2\2\u052c"+
		"\u052e\7 \2\2\u052d\u052c\3\2\2\2\u052d\u052e\3\2\2\2\u052e\u0533\3\2"+
		"\2\2\u052f\u0531\7\37\2\2\u0530\u052f\3\2\2\2\u0530\u0531\3\2\2\2\u0531"+
		"\u0533\3\2\2\2\u0532\u052d\3\2\2\2\u0532\u0530\3\2\2\2\u0533\u0534\3\2"+
		"\2\2\u0534\u053d\7\u00c7\2\2\u0535\u053d\5\u00be`\2\u0536\u053d\5\60\31"+
		"\2\u0537\u053d\5Z.\2\u0538\u053d\5\u0096L\2\u0539\u053d\5\u0092J\2\u053a"+
		"\u053d\5\u00d8m\2\u053b\u053d\5^\60\2\u053c\u0532\3\2\2\2\u053c\u0535"+
		"\3\2\2\2\u053c\u0536\3\2\2\2\u053c\u0537\3\2\2\2\u053c\u0538\3\2\2\2\u053c"+
		"\u0539\3\2\2\2\u053c\u053a\3\2\2\2\u053c\u053b\3\2\2\2\u053d\u053f\3\2"+
		"\2\2\u053e\u052b\3\2\2\2\u053f\u0542\3\2\2\2\u0540\u053e\3\2\2\2\u0540"+
		"\u0541\3\2\2\2\u0541\u0544\3\2\2\2\u0542\u0540\3\2\2\2\u0543\u0540\3\2"+
		"\2\2\u0543\u0544\3\2\2\2\u0544\u0545\3\2\2\2\u0545\u0546\7\26\2\2\u0546"+
		"\u0548\3\2\2\2\u0547\u0507\3\2\2\2\u0547\u0528\3\2\2\2\u0548y\3\2\2\2"+
		"\u0549\u054d\5|?\2\u054a\u054d\5~@\2\u054b\u054d\5\u0080A\2\u054c\u0549"+
		"\3\2\2\2\u054c\u054a\3\2\2\2\u054c\u054b\3\2\2\2\u054d{\3\2\2\2\u054e"+
		"\u054f\7\u00b2\2\2\u054f\u0559\5\u0092J\2\u0550\u0552\7\35\2\2\u0551\u0553"+
		"\t\7\2\2\u0552\u0551\3\2\2\2\u0552\u0553\3\2\2\2\u0553\u0557\3\2\2\2\u0554"+
		"\u0558\7\u00c7\2\2\u0555\u0558\5^\60\2\u0556\u0558\7\u00c5\2\2\u0557\u0554"+
		"\3\2\2\2\u0557\u0555\3\2\2\2\u0557\u0556\3\2\2\2\u0558\u055a\3\2\2\2\u0559"+
		"\u0550\3\2\2\2\u0559\u055a\3\2\2\2\u055a\u055b\3\2\2\2\u055b\u055c\7\26"+
		"\2\2\u055c}\3\2\2\2\u055d\u055e\7\u00b2\2\2\u055e\u0566\5\u0092J\2\u055f"+
		"\u0564\7\35\2\2\u0560\u0565\5\u00bc_\2\u0561\u0565\5\60\31\2\u0562\u0565"+
		"\5Z.\2\u0563\u0565\5\u00d8m\2\u0564\u0560\3\2\2\2\u0564\u0561\3\2\2\2"+
		"\u0564\u0562\3\2\2\2\u0564\u0563\3\2\2\2\u0565\u0567\3\2\2\2\u0566\u055f"+
		"\3\2\2\2\u0566\u0567\3\2\2\2\u0567\u0568\3\2\2\2\u0568\u0569\7\26\2\2"+
		"\u0569\177\3\2\2\2\u056a\u056c\5\u0092J\2\u056b\u056d\5\u00a4S\2\u056c"+
		"\u056b\3\2\2\2\u056c\u056d\3\2\2\2\u056d\u0571\3\2\2\2\u056e\u0572\5\u008a"+
		"F\2\u056f\u0572\5\60\31\2\u0570\u0572\5\u00d8m\2\u0571\u056e\3\2\2\2\u0571"+
		"\u056f\3\2\2\2\u0571\u0570\3\2\2\2\u0571\u0572\3\2\2\2\u0572\u0576\3\2"+
		"\2\2\u0573\u0575\5\u0082B\2\u0574\u0573\3\2\2\2\u0575\u0578\3\2\2\2\u0576"+
		"\u0574\3\2\2\2\u0576\u0577\3\2\2\2\u0577\u0579\3\2\2\2\u0578\u0576\3\2"+
		"\2\2\u0579\u057a\7\26\2\2\u057a\u0081\3\2\2\2\u057b\u0584\7\35\2\2\u057c"+
		"\u0585\7\u00c7\2\2\u057d\u0585\5\60\31\2\u057e\u0585\5\b\5\2\u057f\u0585"+
		"\5Z.\2\u0580\u0585\5\u008cG\2\u0581\u0585\5\u008aF\2\u0582\u0585\5\u00d8"+
		"m\2\u0583\u0585\5^\60\2\u0584\u057c\3\2\2\2\u0584\u057d\3\2\2\2\u0584"+
		"\u057e\3\2\2\2\u0584\u057f\3\2\2\2\u0584\u0580\3\2\2\2\u0584\u0581\3\2"+
		"\2\2\u0584\u0582\3\2\2\2\u0584\u0583\3\2\2\2\u0585\u0083\3\2\2\2\u0586"+
		"\u0587\7\b\2\2\u0587\u0085\3\2\2\2\u0588\u0589\7\t\2\2\u0589\u0087\3\2"+
		"\2\2\u058a\u059b\5\6\4\2\u058b\u059b\5z>\2\u058c\u059b\5l\67\2\u058d\u059b"+
		"\5b\62\2\u058e\u059b\5N(\2\u058f\u059b\5R*\2\u0590\u059b\5p9\2\u0591\u059b"+
		"\5B\"\2\u0592\u059b\5.\30\2\u0593\u0594\5\u0090I\2\u0594\u0595\7\26\2"+
		"\2\u0595\u059b\3\2\2\2\u0596\u059b\5\u0094K\2\u0597\u059b\5\u008eH\2\u0598"+
		"\u059b\5\u009eP\2\u0599\u059b\5$\23\2\u059a\u058a\3\2\2\2\u059a\u058b"+
		"\3\2\2\2\u059a\u058c\3\2\2\2\u059a\u058d\3\2\2\2\u059a\u058e\3\2\2\2\u059a"+
		"\u058f\3\2\2\2\u059a\u0590\3\2\2\2\u059a\u0591\3\2\2\2\u059a\u0592\3\2"+
		"\2\2\u059a\u0593\3\2\2\2\u059a\u0596\3\2\2\2\u059a\u0597\3\2\2\2\u059a"+
		"\u0598\3\2\2\2\u059a\u0599\3\2\2\2\u059b\u0089\3\2\2\2\u059c\u05af\5\u0092"+
		"J\2\u059d\u05a0\7\31\2\2\u059e\u05a1\7\u00c7\2\2\u059f\u05a1\5\u0092J"+
		"\2\u05a0\u059e\3\2\2\2\u05a0\u059f\3\2\2\2\u05a1\u05a2\3\2\2\2\u05a2\u05b0"+
		"\7\32\2\2\u05a3\u05a4\7\31\2\2\u05a4\u05a7\7\u00c7\2\2\u05a5\u05a7\5\u0092"+
		"J\2\u05a6\u05a3\3\2\2\2\u05a6\u05a5\3\2\2\2\u05a7\u05a8\3\2\2\2\u05a8"+
		"\u05a9\7\32\2\2\u05a9\u05ac\7\31\2\2\u05aa\u05ad\7\u00c7\2\2\u05ab\u05ad"+
		"\5\u0092J\2\u05ac\u05aa\3\2\2\2\u05ac\u05ab\3\2\2\2\u05ad\u05ae\3\2\2"+
		"\2\u05ae\u05b0\7\32\2\2\u05af\u059d\3\2\2\2\u05af\u05a6\3\2\2\2\u05b0"+
		"\u008b\3\2\2\2\u05b1\u05b4\5\u0092J\2\u05b2\u05b5\7\7\2\2\u05b3\u05b5"+
		"\7\r\2\2\u05b4\u05b2\3\2\2\2\u05b4\u05b3\3\2\2\2\u05b5\u008d\3\2\2\2\u05b6"+
		"\u05b7\5\u008aF\2\u05b7\u05ca\7\35\2\2\u05b8\u05cb\7\u00c7\2\2\u05b9\u05cb"+
		"\5\u0092J\2\u05ba\u05cb\5Z.\2\u05bb\u05cb\5\64\33\2\u05bc\u05cb\5\u00d8"+
		"m\2\u05bd\u05cb\7\u00c5\2\2\u05be\u05cb\5^\60\2\u05bf\u05cb\7\16\2\2\u05c0"+
		"\u05c8\5\u008aF\2\u05c1\u05c3\5\u00a4S\2\u05c2\u05c1\3\2\2\2\u05c2\u05c3"+
		"\3\2\2\2\u05c3\u05c5\3\2\2\2\u05c4\u05c6\5\u00d8m\2\u05c5\u05c4\3\2\2"+
		"\2\u05c5\u05c6\3\2\2\2\u05c6\u05c9\3\2\2\2\u05c7\u05c9\t\b\2\2\u05c8\u05c2"+
		"\3\2\2\2\u05c8\u05c7\3\2\2\2\u05c9\u05cb\3\2\2\2\u05ca\u05b8\3\2\2\2\u05ca"+
		"\u05b9\3\2\2\2\u05ca\u05ba\3\2\2\2\u05ca\u05bb\3\2\2\2\u05ca\u05bc\3\2"+
		"\2\2\u05ca\u05bd\3\2\2\2\u05ca\u05be\3\2\2\2\u05ca\u05bf\3\2\2\2\u05ca"+
		"\u05c0\3\2\2\2\u05cb\u05e6\3\2\2\2\u05cc\u05d2\7\35\2\2\u05cd\u05ce\5"+
		"\u008aF\2\u05ce\u05cf\7\35\2\2\u05cf\u05d1\3\2\2\2\u05d0\u05cd\3\2\2\2"+
		"\u05d1\u05d4\3\2\2\2\u05d2\u05d0\3\2\2\2\u05d2\u05d3\3\2\2\2\u05d3\u05e4"+
		"\3\2\2\2\u05d4\u05d2\3\2\2\2\u05d5\u05e5\7\u00c7\2\2\u05d6\u05e5\5\u0092"+
		"J\2\u05d7\u05e5\5\u00d8m\2\u05d8\u05e5\5^\60\2\u05d9\u05e5\7\16\2\2\u05da"+
		"\u05e2\5\u008aF\2\u05db\u05dd\5\u00a4S\2\u05dc\u05db\3\2\2\2\u05dc\u05dd"+
		"\3\2\2\2\u05dd\u05df\3\2\2\2\u05de\u05e0\5\u00d8m\2\u05df\u05de\3\2\2"+
		"\2\u05df\u05e0\3\2\2\2\u05e0\u05e3\3\2\2\2\u05e1\u05e3\t\b\2\2\u05e2\u05dc"+
		"\3\2\2\2\u05e2\u05e1\3\2\2\2\u05e3\u05e5\3\2\2\2\u05e4\u05d5\3\2\2\2\u05e4"+
		"\u05d6\3\2\2\2\u05e4\u05d7\3\2\2\2\u05e4\u05d8\3\2\2\2\u05e4\u05d9\3\2"+
		"\2\2\u05e4\u05da\3\2\2\2\u05e5\u05e7\3\2\2\2\u05e6\u05cc\3\2\2\2\u05e6"+
		"\u05e7\3\2\2\2\u05e7\u05e8\3\2\2\2\u05e8\u05e9\7\26\2\2\u05e9\u008f\3"+
		"\2\2\2\u05ea\u05f4\5\u0092J\2\u05eb\u05f5\7\17\2\2\u05ec\u05f5\7\20\2"+
		"\2\u05ed\u05f0\7\37\2\2\u05ee\u05f1\7\u00c7\2\2\u05ef\u05f1\5\u0092J\2"+
		"\u05f0\u05ee\3\2\2\2\u05f0\u05ef\3\2\2\2\u05f1\u05f5\3\2\2\2\u05f2\u05f3"+
		"\7 \2\2\u05f3\u05f5\7\u00c7\2\2\u05f4\u05eb\3\2\2\2\u05f4\u05ec\3\2\2"+
		"\2\u05f4\u05ed\3\2\2\2\u05f4\u05f2\3\2\2\2\u05f5\u0605\3\2\2\2\u05f6\u05f7"+
		"\7\37\2\2\u05f7\u0602\7\37\2\2\u05f8\u05f9\7 \2\2\u05f9\u0602\7 \2\2\u05fa"+
		"\u05fd\7\37\2\2\u05fb\u05fe\7\u00c7\2\2\u05fc\u05fe\5\u0092J\2\u05fd\u05fb"+
		"\3\2\2\2\u05fd\u05fc\3\2\2\2\u05fe\u0602\3\2\2\2\u05ff\u0600\7 \2\2\u0600"+
		"\u0602\7\u00c7\2\2\u0601\u05f6\3\2\2\2\u0601\u05f8\3\2\2\2\u0601\u05fa"+
		"\3\2\2\2\u0601\u05ff\3\2\2\2\u0602\u0603\3\2\2\2\u0603\u0605\5\u0092J"+
		"\2\u0604\u05ea\3\2\2\2\u0604\u0601\3\2\2\2\u0605\u0091\3\2\2\2\u0606\u060d"+
		"\7\u00c5\2\2\u0607\u060d\7\u00c9\2\2\u0608\u0609\7\30\2\2\u0609\u060a"+
		"\5\u0092J\2\u060a\u060b\7\33\2\2\u060b\u060d\3\2\2\2\u060c\u0606\3\2\2"+
		"\2\u060c\u0607\3\2\2\2\u060c\u0608\3\2\2\2\u060d\u0093\3\2\2\2\u060e\u0618"+
		"\7\u00b4\2\2\u060f\u0619\5\u0110\u0089\2\u0610\u0619\7\u00c5\2\2\u0611"+
		"\u0619\5\64\33\2\u0612\u0619\5^\60\2\u0613\u0619\7\16\2\2\u0614\u0619"+
		"\5Z.\2\u0615\u0619\5\u008aF\2\u0616\u0619\5\u0090I\2\u0617\u0619\5\u00d8"+
		"m\2\u0618\u060f\3\2\2\2\u0618\u0610\3\2\2\2\u0618\u0611\3\2\2\2\u0618"+
		"\u0612\3\2\2\2\u0618\u0613\3\2\2\2\u0618\u0614\3\2\2\2\u0618\u0615\3\2"+
		"\2\2\u0618\u0616\3\2\2\2\u0618\u0617\3\2\2\2\u0619\u061a\3\2\2\2\u061a"+
		"\u061b\7\26\2\2\u061b\u0095\3\2\2\2\u061c\u061d\7\5\2\2\u061d\u061e\7"+
		"\u00c5\2\2\u061e\u0621\7\61\2\2\u061f\u0622\5\u00d8m\2\u0620\u0622\5\u0096"+
		"L\2\u0621\u061f\3\2\2\2\u0621\u0620\3\2\2\2\u0622\u062c\3\2\2\2\u0623"+
		"\u0624\7\34\2\2\u0624\u0625\7\u00c5\2\2\u0625\u0628\7\61\2\2\u0626\u0629"+
		"\5\u00d8m\2\u0627\u0629\5\u0096L\2\u0628\u0626\3\2\2\2\u0628\u0627\3\2"+
		"\2\2\u0629\u062b\3\2\2\2\u062a\u0623\3\2\2\2\u062b\u062e\3\2\2\2\u062c"+
		"\u062a\3\2\2\2\u062c\u062d\3\2\2\2\u062d\u062f\3\2\2\2\u062e\u062c\3\2"+
		"\2\2\u062f\u0630\7\6\2\2\u0630\u0097\3\2\2\2\u0631\u0632\7\5\2\2\u0632"+
		"\u0099\3\2\2\2\u0633\u0634\7\6\2\2\u0634\u009b\3\2\2\2\u0635\u063d\7\u00c5"+
		"\2\2\u0636\u063d\5\u00d8m\2\u0637\u063d\7\b\2\2\u0638\u063d\7\t\2\2\u0639"+
		"\u063d\7\16\2\2\u063a\u063d\5\u009eP\2\u063b\u063d\5\u0096L\2\u063c\u0635"+
		"\3\2\2\2\u063c\u0636\3\2\2\2\u063c\u0637\3\2\2\2\u063c\u0638\3\2\2\2\u063c"+
		"\u0639\3\2\2\2\u063c\u063a\3\2\2\2\u063c\u063b\3\2\2\2\u063d\u009d\3\2"+
		"\2\2\u063e\u063f\5\u0092J\2\u063f\u064c\7\61\2\2\u0640\u0641\7\31\2\2"+
		"\u0641\u0646\5\u009cO\2\u0642\u0643\7\34\2\2\u0643\u0645\5\u009cO\2\u0644"+
		"\u0642\3\2\2\2\u0645\u0648\3\2\2\2\u0646\u0644\3\2\2\2\u0646\u0647\3\2"+
		"\2\2\u0647\u0649\3\2\2\2\u0648\u0646\3\2\2\2\u0649\u064a\7\32\2\2\u064a"+
		"\u064d\3\2\2\2\u064b\u064d\7\7\2\2\u064c\u0640\3\2\2\2\u064c\u064b\3\2"+
		"\2\2\u064d\u064e\3\2\2\2\u064e\u064f\7\26\2\2\u064f\u009f\3\2\2\2\u0650"+
		"\u0651\t\t\2\2\u0651\u00a1\3\2\2\2\u0652\u0653\t\6\2\2\u0653\u00a3\3\2"+
		"\2\2\u0654\u0655\t\n\2\2\u0655\u00a5\3\2\2\2\u0656\u0657\7\67\2\2\u0657"+
		"\u065b\7\u009f\2\2\u0658\u0659\5\u0122\u0092\2\u0659\u065a\7\27\2\2\u065a"+
		"\u065c\3\2\2\2\u065b\u0658\3\2\2\2\u065b\u065c\3\2\2\2\u065c\u065d\3\2"+
		"\2\2\u065d\u0668\5\u0124\u0093\2\u065e\u065f\7\u0096\2\2\u065f\u0660\7"+
		"\u00a3\2\2\u0660\u0669\5\u012a\u0096\2\u0661\u0669\5\u00aaV\2\u0662\u0669"+
		"\5\u00a8U\2\u0663\u0665\7\64\2\2\u0664\u0666\7H\2\2\u0665\u0664\3\2\2"+
		"\2\u0665\u0666\3\2\2\2\u0666\u0667\3\2\2\2\u0667\u0669\5\u00c4c\2\u0668"+
		"\u065e\3\2\2\2\u0668\u0661\3\2\2\2\u0668\u0662\3\2\2\2\u0668\u0663\3\2"+
		"\2\2\u0669\u00a7\3\2\2\2\u066a\u066b\7\64\2\2\u066b\u066c\7K\2\2\u066c"+
		"\u066d\5\u0142\u00a2\2\u066d\u066e\5\u00ecw\2\u066e\u00a9\3\2\2\2\u066f"+
		"\u0670\7\64\2\2\u0670\u0671\5\u00ecw\2\u0671\u00ab\3\2\2\2\u0672\u0673"+
		"\7L\2\2\u0673\u0677\7\u009f\2\2\u0674\u0675\7k\2\2\u0675\u0676\7\u0082"+
		"\2\2\u0676\u0678\7a\2\2\u0677\u0674\3\2\2\2\u0677\u0678\3\2\2\2\u0678"+
		"\u0679\3\2\2\2\u0679\u067a\5\u0126\u0094\2\u067a\u067b\7\30\2\2\u067b"+
		"\u067c\5\u00c4c\2\u067c\u0685\5\32\16\2\u067d\u067e\7\34\2\2\u067e\u0684"+
		"\5\u00ecw\2\u067f\u0680\7\34\2\2\u0680\u0681\5\u00c4c\2\u0681\u0682\5"+
		"\32\16\2\u0682\u0684\3\2\2\2\u0683\u067d\3\2\2\2\u0683\u067f\3\2\2\2\u0684"+
		"\u0687\3\2\2\2\u0685\u0683\3\2\2\2\u0685\u0686\3\2\2\2\u0686\u0688\3\2"+
		"\2\2\u0687\u0685\3\2\2\2\u0688\u0689\7\33\2\2\u0689\u068a\3\2\2\2\u068a"+
		"\u068c\7\u00be\2\2\u068b\u068d\7\35\2\2\u068c\u068b\3\2\2\2\u068c\u068d"+
		"\3\2\2\2\u068d\u0690\3\2\2\2\u068e\u0691\5\u00aeX\2\u068f\u0691\5\u00b0"+
		"Y\2\u0690\u068e\3\2\2\2\u0690\u068f\3\2\2\2\u0691\u0693\3\2\2\2\u0692"+
		"\u0694\7\34\2\2\u0693\u0692\3\2\2\2\u0693\u0694\3\2\2\2\u0694\u0695\3"+
		"\2\2\2\u0695\u0697\7\u00bf\2\2\u0696\u0698\7\35\2\2\u0697\u0696\3\2\2"+
		"\2\u0697\u0698\3\2\2\2\u0698\u0699\3\2\2\2\u0699\u069a\5\u0142\u00a2\2"+
		"\u069a\u00ad\3\2\2\2\u069b\u069c\t\13\2\2\u069c\u00af\3\2\2\2\u069d\u069e"+
		"\t\f\2\2\u069e\u00b1\3\2\2\2\u069f\u06a0\7L\2\2\u06a0\u06a4\7\u009f\2"+
		"\2\u06a1\u06a2\7k\2\2\u06a2\u06a3\7\u0082\2\2\u06a3\u06a5\7a\2\2\u06a4"+
		"\u06a1\3\2\2\2\u06a4\u06a5\3\2\2\2\u06a5\u06a9\3\2\2\2\u06a6\u06a7\5\u0122"+
		"\u0092\2\u06a7\u06a8\7\27\2\2\u06a8\u06aa\3\2\2\2\u06a9\u06a6\3\2\2\2"+
		"\u06a9\u06aa\3\2\2\2\u06aa\u06ab\3\2\2\2\u06ab\u06bb\5\u0126\u0094\2\u06ac"+
		"\u06ad\7\30\2\2\u06ad\u06b4\5\u00c4c\2\u06ae\u06af\7\34\2\2\u06af\u06b3"+
		"\5\u00ecw\2\u06b0\u06b1\7\34\2\2\u06b1\u06b3\5\u00c4c\2\u06b2\u06ae\3"+
		"\2\2\2\u06b2\u06b0\3\2\2\2\u06b3\u06b6\3\2\2\2\u06b4\u06b2\3\2\2\2\u06b4"+
		"\u06b5\3\2\2\2\u06b5\u06b7\3\2\2\2\u06b6\u06b4\3\2\2\2\u06b7\u06b8\7\33"+
		"\2\2\u06b8\u06bc\3\2\2\2\u06b9\u06ba\7:\2\2\u06ba\u06bc\5\u00be`\2\u06bb"+
		"\u06ac\3\2\2\2\u06bb\u06b9\3\2\2\2\u06bc\u00b3\3\2\2\2\u06bd\u06be\7L"+
		"\2\2\u06be\u06c2\7\u009f\2\2\u06bf\u06c0\7k\2\2\u06c0\u06c1\7\u0082\2"+
		"\2\u06c1\u06c3\7a\2\2\u06c2\u06bf\3\2\2\2\u06c2\u06c3\3\2\2\2\u06c3\u06c4"+
		"\3\2\2\2\u06c4\u06c5\5\u0126\u0094\2\u06c5\u06c6\7\30\2\2\u06c6\u06c7"+
		"\5\u00c4c\2\u06c7\u06d0\5\32\16\2\u06c8\u06c9\7\34\2\2\u06c9\u06cf\5\u00ec"+
		"w\2\u06ca\u06cb\7\34\2\2\u06cb\u06cc\5\u00c4c\2\u06cc\u06cd\5\32\16\2"+
		"\u06cd\u06cf\3\2\2\2\u06ce\u06c8\3\2\2\2\u06ce\u06ca\3\2\2\2\u06cf\u06d2"+
		"\3\2\2\2\u06d0\u06ce\3\2\2\2\u06d0\u06d1\3\2\2\2\u06d1\u06d3\3\2\2\2\u06d2"+
		"\u06d0\3\2\2\2\u06d3\u06d4\7\33\2\2\u06d4\u06d5\3\2\2\2\u06d5\u06d6\7"+
		"\u00be\2\2\u06d6\u06d7\7\35\2\2\u06d7\u06d8\t\3\2\2\u06d8\u06d9\7\u00bf"+
		"\2\2\u06d9\u06da\7\35\2\2\u06da\u06db\5\u0092J\2\u06db\u00b5\3\2\2\2\u06dc"+
		"\u06dd\7U\2\2\u06dd\u06de\7f\2\2\u06de\u06e1\5\u00f8}\2\u06df\u06e0\7"+
		"\u00af\2\2\u06e0\u06e2\5\u00d8m\2\u06e1\u06df\3\2\2\2\u06e1\u06e2\3\2"+
		"\2\2\u06e2\u00b7\3\2\2\2\u06e3\u06e4\7Y\2\2\u06e4\u06e7\7\u009f\2\2\u06e5"+
		"\u06e6\7k\2\2\u06e6\u06e8\7a\2\2\u06e7\u06e5\3\2\2\2\u06e7\u06e8\3\2\2"+
		"\2\u06e8\u06ec\3\2\2\2\u06e9\u06ea\5\u0122\u0092\2\u06ea\u06eb\7\27\2"+
		"\2\u06eb\u06ed\3\2\2\2\u06ec\u06e9\3\2\2\2\u06ec\u06ed\3\2\2\2\u06ed\u06ee"+
		"\3\2\2\2\u06ee\u06ef\5\u0126\u0094\2\u06ef\u00b9\3\2\2\2\u06f0\u06f1\7"+
		"s\2\2\u06f1\u06f5\7v\2\2\u06f2\u06f3\5\u0122\u0092\2\u06f3\u06f4\7\27"+
		"\2\2\u06f4\u06f6\3\2\2\2\u06f5\u06f2\3\2\2\2\u06f5\u06f6\3\2\2\2\u06f6"+
		"\u06f7\3\2\2\2\u06f7\u0703\5\u0126\u0094\2\u06f8\u06f9\7\30\2\2\u06f9"+
		"\u06fe\5\u012c\u0097\2\u06fa\u06fb\7\34\2\2\u06fb\u06fd\5\u012c\u0097"+
		"\2\u06fc\u06fa\3\2\2\2\u06fd\u0700\3\2\2\2\u06fe\u06fc\3\2\2\2\u06fe\u06ff"+
		"\3\2\2\2\u06ff\u0701\3\2\2\2\u0700\u06fe\3\2\2\2\u0701\u0702\7\33\2\2"+
		"\u0702\u0704\3\2\2\2\u0703\u06f8\3\2\2\2\u0703\u0704\3\2\2\2\u0704\u0724"+
		"\3\2\2\2\u0705\u0706\7\u00ab\2\2\u0706\u0707\7\30\2\2\u0707\u070c\5\u00d8"+
		"m\2\u0708\u0709\7\34\2\2\u0709\u070b\5\u00d8m\2\u070a\u0708\3\2\2\2\u070b"+
		"\u070e\3\2\2\2\u070c\u070a\3\2\2\2\u070c\u070d\3\2\2\2\u070d\u070f\3\2"+
		"\2\2\u070e\u070c\3\2\2\2\u070f\u071e\7\33\2\2\u0710\u0711\7\34\2\2\u0711"+
		"\u0712\7\30\2\2\u0712\u0717\5\u00d8m\2\u0713\u0714\7\34\2\2\u0714\u0716"+
		"\5\u00d8m\2\u0715\u0713\3\2\2\2\u0716\u0719\3\2\2\2\u0717\u0715\3\2\2"+
		"\2\u0717\u0718\3\2\2\2\u0718\u071a\3\2\2\2\u0719\u0717\3\2\2\2\u071a\u071b"+
		"\7\33\2\2\u071b\u071d\3\2\2\2\u071c\u0710\3\2\2\2\u071d\u0720\3\2\2\2"+
		"\u071e\u071c\3\2\2\2\u071e\u071f\3\2\2\2\u071f\u0725\3\2\2\2\u0720\u071e"+
		"\3\2\2\2\u0721\u0725\5\u00be`\2\u0722\u0723\7R\2\2\u0723\u0725\7\u00ab"+
		"\2\2\u0724\u0705\3\2\2\2\u0724\u0721\3\2\2\2\u0724\u0722\3\2\2\2\u0725"+
		"\u00bb\3\2\2\2\u0726\u0731\5\u00c0a\2\u0727\u0728\7\u008a\2\2\u0728\u0729"+
		"\7A\2\2\u0729\u072e\5\u00fa~\2\u072a\u072b\7\34\2\2\u072b\u072d\5\u00fa"+
		"~\2\u072c\u072a\3\2\2\2\u072d\u0730\3\2\2\2\u072e\u072c\3\2\2\2\u072e"+
		"\u072f\3\2\2\2\u072f\u0732\3\2\2\2\u0730\u072e\3\2\2\2\u0731\u0727\3\2"+
		"\2\2\u0731\u0732\3\2\2\2\u0732\u0739\3\2\2\2\u0733\u0734\7}\2\2\u0734"+
		"\u0737\5\u00d8m\2\u0735\u0736\t\r\2\2\u0736\u0738\5\u00d8m\2\u0737\u0735"+
		"\3\2\2\2\u0737\u0738\3\2\2\2\u0738\u073a\3\2\2\2\u0739\u0733\3\2\2\2\u0739"+
		"\u073a\3\2\2\2\u073a\u00bd\3\2\2\2\u073b\u0746\5\u00c0a\2\u073c\u073d"+
		"\7\u008a\2\2\u073d\u073e\7A\2\2\u073e\u0743\5\u00fa~\2\u073f\u0740\7\34"+
		"\2\2\u0740\u0742\5\u00fa~\2\u0741\u073f\3\2\2\2\u0742\u0745\3\2\2\2\u0743"+
		"\u0741\3\2\2\2\u0743\u0744\3\2\2\2\u0744\u0747\3\2\2\2\u0745\u0743\3\2"+
		"\2\2\u0746\u073c\3\2\2\2\u0746\u0747\3\2\2\2\u0747\u074e\3\2\2\2\u0748"+
		"\u0749\7}\2\2\u0749\u074c\5\u00d8m\2\u074a\u074b\t\r\2\2\u074b\u074d\5"+
		"\u00d8m\2\u074c\u074a\3\2\2\2\u074c\u074d\3\2\2\2\u074d\u074f\3\2\2\2"+
		"\u074e\u0748\3\2\2\2\u074e\u074f\3\2\2\2\u074f\u00bf\3\2\2\2\u0750\u0752"+
		"\7\u009d\2\2\u0751\u0753\t\16\2\2\u0752\u0751\3\2\2\2\u0752\u0753\3\2"+
		"\2\2\u0753\u0754\3\2\2\2\u0754\u0759\5\u0100\u0081\2\u0755\u0756\7\34"+
		"\2\2\u0756\u0758\5\u0100\u0081\2\u0757\u0755\3\2\2\2\u0758\u075b\3\2\2"+
		"\2\u0759\u0757\3\2\2\2\u0759\u075a\3\2\2\2\u075a\u0768\3\2\2\2\u075b\u0759"+
		"\3\2\2\2\u075c\u0766\7f\2\2\u075d\u0762\5\u0102\u0082\2\u075e\u075f\7"+
		"\34\2\2\u075f\u0761\5\u0102\u0082\2\u0760\u075e\3\2\2\2\u0761\u0764\3"+
		"\2\2\2\u0762\u0760\3\2\2\2\u0762\u0763\3\2\2\2\u0763\u0767\3\2\2\2\u0764"+
		"\u0762\3\2\2\2\u0765\u0767\5\u0104\u0083\2\u0766\u075d\3\2\2\2\u0766\u0765"+
		"\3\2\2\2\u0767\u0769\3\2\2\2\u0768\u075c\3\2\2\2\u0768\u0769\3\2\2\2\u0769"+
		"\u076c\3\2\2\2\u076a\u076b\7\u00af\2\2\u076b\u076d\5\u00d8m\2\u076c\u076a"+
		"\3\2\2\2\u076c\u076d\3\2\2\2\u076d\u077c\3\2\2\2\u076e\u076f\7i\2\2\u076f"+
		"\u0770\7A\2\2\u0770\u0775\5\u00d8m\2\u0771\u0772\7\34\2\2\u0772\u0774"+
		"\5\u00d8m\2\u0773\u0771\3\2\2\2\u0774\u0777\3\2\2\2\u0775\u0773\3\2\2"+
		"\2\u0775\u0776\3\2\2\2\u0776\u077a\3\2\2\2\u0777\u0775\3\2\2\2\u0778\u0779"+
		"\7j\2\2\u0779\u077b\5\u00d8m\2\u077a\u0778\3\2\2\2\u077a\u077b\3\2\2\2"+
		"\u077b\u077d\3\2\2\2\u077c\u076e\3\2\2\2\u077c\u077d\3\2\2\2\u077d\u079b"+
		"\3\2\2\2\u077e\u077f\7\u00ab\2\2\u077f\u0780\7\30\2\2\u0780\u0785\5\u00d8"+
		"m\2\u0781\u0782\7\34\2\2\u0782\u0784\5\u00d8m\2\u0783\u0781\3\2\2\2\u0784"+
		"\u0787\3\2\2\2\u0785\u0783\3\2\2\2\u0785\u0786\3\2\2\2\u0786\u0788\3\2"+
		"\2\2\u0787\u0785\3\2\2\2\u0788\u0797\7\33\2\2\u0789\u078a\7\34\2\2\u078a"+
		"\u078b\7\30\2\2\u078b\u0790\5\u00d8m\2\u078c\u078d\7\34\2\2\u078d\u078f"+
		"\5\u00d8m\2\u078e\u078c\3\2\2\2\u078f\u0792\3\2\2\2\u0790\u078e\3\2\2"+
		"\2\u0790\u0791\3\2\2\2\u0791\u0793\3\2\2\2\u0792\u0790\3\2\2\2\u0793\u0794"+
		"\7\33\2\2\u0794\u0796\3\2\2\2\u0795\u0789\3\2\2\2\u0796\u0799\3\2\2\2"+
		"\u0797\u0795\3\2\2\2\u0797\u0798\3\2\2\2\u0798\u079b\3\2\2\2\u0799\u0797"+
		"\3\2\2\2\u079a\u0750\3\2\2\2\u079a\u077e\3\2\2\2\u079b\u00c1\3\2\2\2\u079c"+
		"\u079d\7\u00a8\2\2\u079d\u079e\5\u00f8}\2\u079e\u079f\7\u009e\2\2\u079f"+
		"\u07a0\5\u012c\u0097\2\u07a0\u07a1\7\35\2\2\u07a1\u07a9\5\u00d8m\2\u07a2"+
		"\u07a3\7\34\2\2\u07a3\u07a4\5\u012c\u0097\2\u07a4\u07a5\7\35\2\2\u07a5"+
		"\u07a6\5\u00d8m\2\u07a6\u07a8\3\2\2\2\u07a7\u07a2\3\2\2\2\u07a8\u07ab"+
		"\3\2\2\2\u07a9\u07a7\3\2\2\2\u07a9\u07aa\3\2\2\2\u07aa\u07ae\3\2\2\2\u07ab"+
		"\u07a9\3\2\2\2\u07ac\u07ad\7\u00af\2\2\u07ad\u07af\5\u00d8m\2\u07ae\u07ac"+
		"\3\2\2\2\u07ae\u07af\3\2\2\2\u07af\u00c3\3\2\2\2\u07b0\u07b5\5\u012c\u0097"+
		"\2\u07b1\u07b4\5\u00c8e\2\u07b2\u07b4\5\u00c6d\2\u07b3\u07b1\3\2\2\2\u07b3"+
		"\u07b2\3\2\2\2\u07b4\u07b7\3\2\2\2\u07b5\u07b3\3\2\2\2\u07b5\u07b6\3\2"+
		"\2\2\u07b6\u00c5\3\2\2\2\u07b7\u07b5\3\2\2\2\u07b8\u07cc\5\u011e\u0090"+
		"\2\u07b9\u07ba\7\30\2\2\u07ba\u07bc\5\u010e\u0088\2\u07bb\u07bd\5\u0142"+
		"\u00a2\2\u07bc\u07bb\3\2\2\2\u07bc\u07bd\3\2\2\2\u07bd\u07be\3\2\2\2\u07be"+
		"\u07bf\7\33\2\2\u07bf\u07cd\3\2\2\2\u07c0\u07c1\7\30\2\2\u07c1\u07c3\5"+
		"\u010e\u0088\2\u07c2\u07c4\5\u0142\u00a2\2\u07c3\u07c2\3\2\2\2\u07c3\u07c4"+
		"\3\2\2\2\u07c4\u07c5\3\2\2\2\u07c5\u07c6\7\34\2\2\u07c6\u07c8\5\u010e"+
		"\u0088\2\u07c7\u07c9\5\u0142\u00a2\2\u07c8\u07c7\3\2\2\2\u07c8\u07c9\3"+
		"\2\2\2\u07c9\u07ca\3\2\2\2\u07ca\u07cb\7\33\2\2\u07cb\u07cd\3\2\2\2\u07cc"+
		"\u07b9\3\2\2\2\u07cc\u07c0\3\2\2\2\u07cc\u07cd\3\2\2\2\u07cd\u00c7\3\2"+
		"\2\2\u07ce\u07cf\7K\2\2\u07cf\u07d1\5\u011e\u0090\2\u07d0\u07ce\3\2\2"+
		"\2\u07d0\u07d1\3\2\2\2\u07d1\u07de\3\2\2\2\u07d2\u07df\5\u00caf\2\u07d3"+
		"\u07df\5\u00ccg\2\u07d4\u07df\5\u00ceh\2\u07d5\u07df\5\u00d0i\2\u07d6"+
		"\u07d7\7F\2\2\u07d7\u07d8\7\30\2\2\u07d8\u07d9\5\u00d8m\2\u07d9\u07da"+
		"\7\33\2\2\u07da\u07df\3\2\2\2\u07db\u07df\5\u00d2j\2\u07dc\u07dd\7G\2"+
		"\2\u07dd\u07df\5\u012e\u0098\2\u07de\u07d2\3\2\2\2\u07de\u07d3\3\2\2\2"+
		"\u07de\u07d4\3\2\2\2\u07de\u07d5\3\2\2\2\u07de\u07d6\3\2\2\2\u07de\u07db"+
		"\3\2\2\2\u07de\u07dc\3\2\2\2\u07df\u00c9\3\2\2\2\u07e0\u07e1\7\u008e\2"+
		"\2\u07e1\u07e3\7z\2\2\u07e2\u07e4\t\17\2\2\u07e3\u07e2\3\2\2\2\u07e3\u07e4"+
		"\3\2\2\2\u07e4\u07e6\3\2\2\2\u07e5\u07e7\7=\2\2\u07e6\u07e5\3\2\2\2\u07e6"+
		"\u07e7\3\2\2\2\u07e7\u00cb\3\2\2\2\u07e8\u07e9\5\u00e6t\2\u07e9\u00cd"+
		"\3\2\2\2\u07ea\u07eb\7\u0082\2\2\u07eb\u07ec\7\u0084\2\2\u07ec\u00cf\3"+
		"\2\2\2\u07ed\u07ee\7\u0084\2\2\u07ee\u00d1\3\2\2\2\u07ef\u07fb\7R\2\2"+
		"\u07f0\u07fc\5\u00d4k\2\u07f1\u07f2\7\30\2\2\u07f2\u07f3\5\u00d8m\2\u07f3"+
		"\u07f4\7\33\2\2\u07f4\u07fc\3\2\2\2\u07f5\u07f6\7\u0080\2\2\u07f6\u07f7"+
		"\7\30\2\2\u07f7\u07f8\5\u00d8m\2\u07f8\u07f9\7\33\2\2\u07f9\u07fc\3\2"+
		"\2\2\u07fa\u07fc\5\u0142\u00a2\2\u07fb\u07f0\3\2\2\2\u07fb\u07f1\3\2\2"+
		"\2\u07fb\u07f5\3\2\2\2\u07fb\u07fa\3\2\2\2\u07fc\u0803\3\2\2\2\u07fd\u07ff"+
		"\7\25\2\2\u07fe\u0800\5\u0142\u00a2\2\u07ff\u07fe\3\2\2\2\u0800\u0801"+
		"\3\2\2\2\u0801\u07ff\3\2\2\2\u0801\u0802\3\2\2\2\u0802\u0804\3\2\2\2\u0803"+
		"\u07fd\3\2\2\2\u0803\u0804\3\2\2\2\u0804\u00d3\3\2\2\2\u0805\u0808\5\u010e"+
		"\u0088\2\u0806\u0808\5\u0110\u0089\2\u0807\u0805\3\2\2\2\u0807\u0806\3"+
		"\2\2\2\u0808\u00d5\3\2\2\2\u0809\u0838\5\u00e0q\2\u080a\u080b\5\u00d8"+
		"m\2\u080b\u080c\5\u00dep\2\u080c\u080d\5\u00d8m\2\u080d\u0838\3\2\2\2"+
		"\u080e\u080f\5\u0122\u0092\2\u080f\u0810\7\27\2\2\u0810\u0812\3\2\2\2"+
		"\u0811\u080e\3\2\2\2\u0811\u0812\3\2\2\2\u0812\u0813\3\2\2\2\u0813\u0814"+
		"\5\u0126\u0094\2\u0814\u0815\7\27\2\2\u0815\u0817\3\2\2\2\u0816\u0811"+
		"\3\2\2\2\u0816\u0817\3\2\2\2\u0817\u0818\3\2\2\2\u0818\u0838\5\u012c\u0097"+
		"\2\u0819\u081a\7\30\2\2\u081a\u081b\5\u00d8m\2\u081b\u081c\7\33\2\2\u081c"+
		"\u0838\3\2\2\2\u081d\u081f\5\u00e4s\2\u081e\u0820\7\u0082\2\2\u081f\u081e"+
		"\3\2\2\2\u081f\u0820\3\2\2\2\u0820\u0821\3\2\2\2\u0821\u0835\7n\2\2\u0822"+
		"\u082c\7\30\2\2\u0823\u082d\5\u00be`\2\u0824\u0829\5\u00e4s\2\u0825\u0826"+
		"\7\34\2\2\u0826\u0828\5\u00e4s\2\u0827\u0825\3\2\2\2\u0828\u082b\3\2\2"+
		"\2\u0829\u0827\3\2\2\2\u0829\u082a\3\2\2\2\u082a\u082d\3\2\2\2\u082b\u0829"+
		"\3\2\2\2\u082c\u0823\3\2\2\2\u082c\u0824\3\2\2\2\u082c\u082d\3\2\2\2\u082d"+
		"\u082e\3\2\2\2\u082e\u0836\7\33\2\2\u082f\u0830\5\u0122\u0092\2\u0830"+
		"\u0831\7\27\2\2\u0831\u0833\3\2\2\2\u0832\u082f\3\2\2\2\u0832\u0833\3"+
		"\2\2\2\u0833\u0834\3\2\2\2\u0834\u0836\5\u0126\u0094\2\u0835\u0822\3\2"+
		"\2\2\u0835\u0832\3\2\2\2\u0836\u0838\3\2\2\2\u0837\u0809\3\2\2\2\u0837"+
		"\u080a\3\2\2\2\u0837\u0816\3\2\2\2\u0837\u0819\3\2\2\2\u0837\u081d\3\2"+
		"\2\2\u0838\u00d7\3\2\2\2\u0839\u083a\bm\1\2\u083a\u084b\5\u00e0q\2\u083b"+
		"\u083c\5\u0122\u0092\2\u083c\u083d\7\27\2\2\u083d\u083f\3\2\2\2\u083e"+
		"\u083b\3\2\2\2\u083e\u083f\3\2\2\2\u083f\u0840\3\2\2\2\u0840\u0841\5\u0126"+
		"\u0094\2\u0841\u0842\7\27\2\2\u0842\u0844\3\2\2\2\u0843\u083e\3\2\2\2"+
		"\u0843\u0844\3\2\2\2\u0844\u0845\3\2\2\2\u0845\u084b\5\u012c\u0097\2\u0846"+
		"\u0847\7\30\2\2\u0847\u0848\5\u00d8m\2\u0848\u0849\7\33\2\2\u0849\u084b"+
		"\3\2\2\2\u084a\u0839\3\2\2\2\u084a\u0843\3\2\2\2\u084a\u0846\3\2\2\2\u084b"+
		"\u086c\3\2\2\2\u084c\u084d\f\6\2\2\u084d\u084e\5\u00dep\2\u084e\u084f"+
		"\5\u00d8m\7\u084f\u086b\3\2\2\2\u0850\u0852\f\3\2\2\u0851\u0853\7\u0082"+
		"\2\2\u0852\u0851\3\2\2\2\u0852\u0853\3\2\2\2\u0853\u0854\3\2\2\2\u0854"+
		"\u0868\7n\2\2\u0855\u085f\7\30\2\2\u0856\u0860\5\u00be`\2\u0857\u085c"+
		"\5\u00d8m\2\u0858\u0859\7\34\2\2\u0859\u085b\5\u00d8m\2\u085a\u0858\3"+
		"\2\2\2\u085b\u085e\3\2\2\2\u085c\u085a\3\2\2\2\u085c\u085d\3\2\2\2\u085d"+
		"\u0860\3\2\2\2\u085e\u085c\3\2\2\2\u085f\u0856\3\2\2\2\u085f\u0857\3\2"+
		"\2\2\u085f\u0860\3\2\2\2\u0860\u0861\3\2\2\2\u0861\u0869\7\33\2\2\u0862"+
		"\u0863\5\u0122\u0092\2\u0863\u0864\7\27\2\2\u0864\u0866\3\2\2\2\u0865"+
		"\u0862\3\2\2\2\u0865\u0866\3\2\2\2\u0866\u0867\3\2\2\2\u0867\u0869\5\u0126"+
		"\u0094\2\u0868\u0855\3\2\2\2\u0868\u0865\3\2\2\2\u0869\u086b\3\2\2\2\u086a"+
		"\u084c\3\2\2\2\u086a\u0850\3\2\2\2\u086b\u086e\3\2\2\2\u086c\u086a\3\2"+
		"\2\2\u086c\u086d\3\2\2\2\u086d\u00d9\3\2\2\2\u086e\u086c\3\2\2\2\u086f"+
		"\u0870\3\2\2\2\u0870\u00db\3\2\2\2\u0871\u0872\bo\1\2\u0872\u0898\5\u0110"+
		"\u0089\2\u0873\u0874\5\u0122\u0092\2\u0874\u0875\7\27\2\2\u0875\u0877"+
		"\3\2\2\2\u0876\u0873\3\2\2\2\u0876\u0877\3\2\2\2\u0877\u0878\3\2\2\2\u0878"+
		"\u0879\5\u0126\u0094\2\u0879\u087a\7\27\2\2\u087a\u087c\3\2\2\2\u087b"+
		"\u0876\3\2\2\2\u087b\u087c\3\2\2\2\u087c\u087d\3\2\2\2\u087d\u0898\5\u012c"+
		"\u0097\2\u087e\u087f\5\u0112\u008a\2\u087f\u0880\5\u00dco\t\u0880\u0898"+
		"\3\2\2\2\u0881\u0882\5\u0120\u0091\2\u0882\u088f\7\30\2\2\u0883\u0885"+
		"\7X\2\2\u0884\u0883\3\2\2\2\u0884\u0885\3\2\2\2\u0885\u0886\3\2\2\2\u0886"+
		"\u088b\5\u00dco\2\u0887\u0888\7\34\2\2\u0888\u088a\5\u00dco\2\u0889\u0887"+
		"\3\2\2\2\u088a\u088d\3\2\2\2\u088b\u0889\3\2\2\2\u088b\u088c\3\2\2\2\u088c"+
		"\u0890\3\2\2\2\u088d\u088b\3\2\2\2\u088e\u0890\7\36\2\2\u088f\u0884\3"+
		"\2\2\2\u088f\u088e\3\2\2\2\u088f\u0890\3\2\2\2\u0890\u0891\3\2\2\2\u0891"+
		"\u0892\7\33\2\2\u0892\u0898\3\2\2\2\u0893\u0894\7\30\2\2\u0894\u0895\5"+
		"\u00dco\2\u0895\u0896\7\33\2\2\u0896\u0898\3\2\2\2\u0897\u0871\3\2\2\2"+
		"\u0897\u087b\3\2\2\2\u0897\u087e\3\2\2\2\u0897\u0881\3\2\2\2\u0897\u0893"+
		"\3\2\2\2\u0898\u08a7\3\2\2\2\u0899\u089a\f\b\2\2\u089a\u089b\7\"\2\2\u089b"+
		"\u08a6\5\u00dco\t\u089c\u089d\f\7\2\2\u089d\u089e\t\20\2\2\u089e\u08a6"+
		"\5\u00dco\b\u089f\u08a0\f\6\2\2\u08a0\u08a1\t\7\2\2\u08a1\u08a6\5\u00dc"+
		"o\7\u08a2\u08a3\f\5\2\2\u08a3\u08a4\t\21\2\2\u08a4\u08a6\5\u00dco\6\u08a5"+
		"\u0899\3\2\2\2\u08a5\u089c\3\2\2\2\u08a5\u089f\3\2\2\2\u08a5\u08a2\3\2"+
		"\2\2\u08a6\u08a9\3\2\2\2\u08a7\u08a5\3\2\2\2\u08a7\u08a8\3\2\2\2\u08a8"+
		"\u00dd\3\2\2\2\u08a9\u08a7\3\2\2\2\u08aa\u08c6\7\36\2\2\u08ab\u08c6\7"+
		"#\2\2\u08ac\u08c6\7$\2\2\u08ad\u08c6\7\37\2\2\u08ae\u08c6\7%\2\2\u08af"+
		"\u08c6\7&\2\2\u08b0\u08c6\7\'\2\2\u08b1\u08c6\7(\2\2\u08b2\u08c6\7)\2"+
		"\2\u08b3\u08c6\7*\2\2\u08b4\u08c6\7+\2\2\u08b5\u08c6\7,\2\2\u08b6\u08c6"+
		"\7\35\2\2\u08b7\u08c6\7-\2\2\u08b8\u08c6\7.\2\2\u08b9\u08c6\7/\2\2\u08ba"+
		"\u08c6\7w\2\2\u08bb\u08bc\7w\2\2\u08bc\u08c6\7\u0082\2\2\u08bd\u08c6\7"+
		"n\2\2\u08be\u08c6\7|\2\2\u08bf\u08c6\7h\2\2\u08c0\u08c6\7~\2\2\u08c1\u08c6"+
		"\7\u0093\2\2\u08c2\u08c6\7 \2\2\u08c3\u08c6\79\2\2\u08c4\u08c6\7\u0089"+
		"\2\2\u08c5\u08aa\3\2\2\2\u08c5\u08ab\3\2\2\2\u08c5\u08ac\3\2\2\2\u08c5"+
		"\u08ad\3\2\2\2\u08c5\u08ae\3\2\2\2\u08c5\u08af\3\2\2\2\u08c5\u08b0\3\2"+
		"\2\2\u08c5\u08b1\3\2\2\2\u08c5\u08b2\3\2\2\2\u08c5\u08b3\3\2\2\2\u08c5"+
		"\u08b4\3\2\2\2\u08c5\u08b5\3\2\2\2\u08c5\u08b6\3\2\2\2\u08c5\u08b7\3\2"+
		"\2\2\u08c5\u08b8\3\2\2\2\u08c5\u08b9\3\2\2\2\u08c5\u08ba\3\2\2\2\u08c5"+
		"\u08bb\3\2\2\2\u08c5\u08bd\3\2\2\2\u08c5\u08be\3\2\2\2\u08c5\u08bf\3\2"+
		"\2\2\u08c5\u08c0\3\2\2\2\u08c5\u08c1\3\2\2\2\u08c5\u08c2\3\2\2\2\u08c5"+
		"\u08c3\3\2\2\2\u08c5\u08c4\3\2\2\2\u08c6\u00df\3\2\2";
	private static final String _serializedATNSegment1 =
		"\2\u08c7\u08ce\5\u0110\u0089\2\u08c8\u08ce\5\u012c\u0097\2\u08c9\u08ca"+
		"\5\u0112\u008a\2\u08ca\u08cb\5\u00d8m\2\u08cb\u08ce\3\2\2\2\u08cc\u08ce"+
		"\5\u00e2r\2\u08cd\u08c7\3\2\2\2\u08cd\u08c8\3\2\2\2\u08cd\u08c9\3\2\2"+
		"\2\u08cd\u08cc\3\2\2\2\u08ce\u00e1\3\2\2\2\u08cf\u08d0\5\u0120\u0091\2"+
		"\u08d0\u08dd\7\30\2\2\u08d1\u08d3\7X\2\2\u08d2\u08d1\3\2\2\2\u08d2\u08d3"+
		"\3\2\2\2\u08d3\u08d4\3\2\2\2\u08d4\u08d9\5\u00d8m\2\u08d5\u08d6\7\34\2"+
		"\2\u08d6\u08d8\5\u00d8m\2\u08d7\u08d5\3\2\2\2\u08d8\u08db\3\2\2\2\u08d9"+
		"\u08d7\3\2\2\2\u08d9\u08da\3\2\2\2\u08da\u08de\3\2\2\2\u08db\u08d9\3\2"+
		"\2\2\u08dc\u08de\7\36\2\2\u08dd\u08d2\3\2\2\2\u08dd\u08dc\3\2\2\2\u08dd"+
		"\u08de\3\2\2\2\u08de\u08df\3\2\2\2\u08df\u08e0\7\33\2\2\u08e0\u00e3\3"+
		"\2\2\2\u08e1\u08e2\bs\1\2\u08e2\u0909\5\u0110\u0089\2\u08e3\u0909\7\u00c8"+
		"\2\2\u08e4\u08e5\5\u0122\u0092\2\u08e5\u08e6\7\27\2\2\u08e6\u08e8\3\2"+
		"\2\2\u08e7\u08e4\3\2\2\2\u08e7\u08e8\3\2\2\2\u08e8\u08e9\3\2\2\2\u08e9"+
		"\u08ea\5\u0126\u0094\2\u08ea\u08eb\7\27\2\2\u08eb\u08ed\3\2\2\2\u08ec"+
		"\u08e7\3\2\2\2\u08ec\u08ed\3\2\2\2\u08ed\u08ee\3\2\2\2\u08ee\u0909\5\u012c"+
		"\u0097\2\u08ef\u08f0\5\u0112\u008a\2\u08f0\u08f1\5\u00e4s\16\u08f1\u0909"+
		"\3\2\2\2\u08f2\u08f3\5\u0120\u0091\2\u08f3\u0900\7\30\2\2\u08f4\u08f6"+
		"\7X\2\2\u08f5\u08f4\3\2\2\2\u08f5\u08f6\3\2\2\2\u08f6\u08f7\3\2\2\2\u08f7"+
		"\u08fc\5\u00e4s\2\u08f8\u08f9\7\34\2\2\u08f9\u08fb\5\u00e4s\2\u08fa\u08f8"+
		"\3\2\2\2\u08fb\u08fe\3\2\2\2\u08fc\u08fa\3\2\2\2\u08fc\u08fd\3\2\2\2\u08fd"+
		"\u0901\3\2\2\2\u08fe\u08fc\3\2\2\2\u08ff\u0901\7\36\2\2\u0900\u08f5\3"+
		"\2\2\2\u0900\u08ff\3\2\2\2\u0900\u0901\3\2\2\2\u0901\u0902\3\2\2\2\u0902"+
		"\u0903\7\33\2\2\u0903\u0909\3\2\2\2\u0904\u0905\7\30\2\2\u0905\u0906\5"+
		"\u00e4s\2\u0906\u0907\7\33\2\2\u0907\u0909\3\2\2\2\u0908\u08e1\3\2\2\2"+
		"\u0908\u08e3\3\2\2\2\u0908\u08ec\3\2\2\2\u0908\u08ef\3\2\2\2\u0908\u08f2"+
		"\3\2\2\2\u0908\u0904\3\2\2\2\u0909\u094b\3\2\2\2\u090a\u090b\f\r\2\2\u090b"+
		"\u090c\7\"\2\2\u090c\u094a\5\u00e4s\16\u090d\u090e\f\f\2\2\u090e\u090f"+
		"\t\20\2\2\u090f\u094a\5\u00e4s\r\u0910\u0911\f\13\2\2\u0911\u0912\t\7"+
		"\2\2\u0912\u094a\5\u00e4s\f\u0913\u0914\f\n\2\2\u0914\u0915\t\21\2\2\u0915"+
		"\u094a\5\u00e4s\13\u0916\u0917\f\t\2\2\u0917\u0918\t\t\2\2\u0918\u094a"+
		"\5\u00e4s\n\u0919\u0926\f\b\2\2\u091a\u0927\7\35\2\2\u091b\u0927\7-\2"+
		"\2\u091c\u0927\7.\2\2\u091d\u0927\7/\2\2\u091e\u0927\7w\2\2\u091f\u0920"+
		"\7w\2\2\u0920\u0927\7\u0082\2\2\u0921\u0927\7n\2\2\u0922\u0927\7|\2\2"+
		"\u0923\u0927\7h\2\2\u0924\u0927\7~\2\2\u0925\u0927\7\u0093\2\2\u0926\u091a"+
		"\3\2\2\2\u0926\u091b\3\2\2\2\u0926\u091c\3\2\2\2\u0926\u091d\3\2\2\2\u0926"+
		"\u091e\3\2\2\2\u0926\u091f\3\2\2\2\u0926\u0921\3\2\2\2\u0926\u0922\3\2"+
		"\2\2\u0926\u0923\3\2\2\2\u0926\u0924\3\2\2\2\u0926\u0925\3\2\2\2\u0927"+
		"\u0928\3\2\2\2\u0928\u094a\5\u00e4s\t\u0929\u092a\f\7\2\2\u092a\u092b"+
		"\79\2\2\u092b\u094a\5\u00e4s\b\u092c\u092d\f\6\2\2\u092d\u092e\7\u0089"+
		"\2\2\u092e\u094a\5\u00e4s\7\u092f\u0931\f\3\2\2\u0930\u0932\7\u0082\2"+
		"\2\u0931\u0930\3\2\2\2\u0931\u0932\3\2\2\2\u0932\u0933\3\2\2\2\u0933\u0947"+
		"\7n\2\2\u0934\u093e\7\30\2\2\u0935\u093f\5\u00be`\2\u0936\u093b\5\u00e4"+
		"s\2\u0937\u0938\7\34\2\2\u0938\u093a\5\u00e4s\2\u0939\u0937\3\2\2\2\u093a"+
		"\u093d\3\2\2\2\u093b\u0939\3\2\2\2\u093b\u093c\3\2\2\2\u093c\u093f\3\2"+
		"\2\2\u093d\u093b\3\2\2\2\u093e\u0935\3\2\2\2\u093e\u0936\3\2\2\2\u093e"+
		"\u093f\3\2\2\2\u093f\u0940\3\2\2\2\u0940\u0948\7\33\2\2\u0941\u0942\5"+
		"\u0122\u0092\2\u0942\u0943\7\27\2\2\u0943\u0945\3\2\2\2\u0944\u0941\3"+
		"\2\2\2\u0944\u0945\3\2\2\2\u0945\u0946\3\2\2\2\u0946\u0948\5\u0126\u0094"+
		"\2\u0947\u0934\3\2\2\2\u0947\u0944\3\2\2\2\u0948\u094a\3\2\2\2\u0949\u090a"+
		"\3\2\2\2\u0949\u090d\3\2\2\2\u0949\u0910\3\2\2\2\u0949\u0913\3\2\2\2\u0949"+
		"\u0916\3\2\2\2\u0949\u0919\3\2\2\2\u0949\u0929\3\2\2\2\u0949\u092c\3\2"+
		"\2\2\u0949\u092f\3\2\2\2\u094a\u094d\3\2\2\2\u094b\u0949\3\2\2\2\u094b"+
		"\u094c\3\2\2\2\u094c\u00e5\3\2\2\2\u094d\u094b\3\2\2\2\u094e\u0952\7\u0092"+
		"\2\2\u094f\u0950\5\u0122\u0092\2\u0950\u0951\7\27\2\2\u0951\u0953\3\2"+
		"\2\2\u0952\u094f\3\2\2\2\u0952\u0953\3\2\2\2\u0953\u0954\3\2\2\2\u0954"+
		"\u0960\5\u0130\u0099\2\u0955\u0956\7\30\2\2\u0956\u095b\5\u00e8u\2\u0957"+
		"\u0958\7\34\2\2\u0958\u095a\5\u00e8u\2\u0959\u0957\3\2\2\2\u095a\u095d"+
		"\3\2\2\2\u095b\u0959\3\2\2\2\u095b\u095c\3\2\2\2\u095c\u095e\3\2\2\2\u095d"+
		"\u095b\3\2\2\2\u095e\u095f\7\33\2\2\u095f\u0961\3\2\2\2\u0960\u0955\3"+
		"\2\2\2\u0960\u0961\3\2\2\2\u0961\u0974\3\2\2\2\u0962\u0963\7\u0087\2\2"+
		"\u0963\u096c\t\22\2\2\u0964\u0965\7\u009e\2\2\u0965\u096d\7\u0084\2\2"+
		"\u0966\u0967\7\u009e\2\2\u0967\u096d\7R\2\2\u0968\u096d\7B\2\2\u0969\u096d"+
		"\7\u0098\2\2\u096a\u096b\7\u0081\2\2\u096b\u096d\7\63\2\2\u096c\u0964"+
		"\3\2\2\2\u096c\u0966\3\2\2\2\u096c\u0968\3\2\2\2\u096c\u0969\3\2\2\2\u096c"+
		"\u096a\3\2\2\2\u096d\u0971\3\2\2\2\u096e\u096f\7~\2\2\u096f\u0971\5\u011e"+
		"\u0090\2\u0970\u0962\3\2\2\2\u0970\u096e\3\2\2\2\u0971\u0973\3\2\2\2\u0972"+
		"\u0970\3\2\2\2\u0973\u0976\3\2\2\2\u0974\u0972\3\2\2\2\u0974\u0975\3\2"+
		"\2\2\u0975\u0984\3\2\2\2\u0976\u0974\3\2\2\2\u0977\u0979\7\u0082\2\2\u0978"+
		"\u0977\3\2\2\2\u0978\u0979\3\2\2\2\u0979\u097a\3\2\2\2\u097a\u097f\7S"+
		"\2\2\u097b\u097c\7q\2\2\u097c\u0980\7T\2\2\u097d\u097e\7q\2\2\u097e\u0980"+
		"\7m\2\2\u097f\u097b\3\2\2\2\u097f\u097d\3\2\2\2\u097f\u0980\3\2\2\2\u0980"+
		"\u0982\3\2\2\2\u0981\u0983\7]\2\2\u0982\u0981\3\2\2\2\u0982\u0983\3\2"+
		"\2\2\u0983\u0985\3\2\2\2\u0984\u0978\3\2\2\2\u0984\u0985\3\2\2\2\u0985"+
		"\u00e7\3\2\2\2\u0986\u0987\5\u011e\u0090\2\u0987\u00e9\3\2\2\2\u0988\u098b"+
		"\5\u012c\u0097\2\u0989\u098a\7G\2\2\u098a\u098c\5\u012e\u0098\2\u098b"+
		"\u0989\3\2\2\2\u098b\u098c\3\2\2\2\u098c\u098e\3\2\2\2\u098d\u098f\t\17"+
		"\2\2\u098e\u098d\3\2\2\2\u098e\u098f\3\2\2\2\u098f\u00eb\3\2\2\2\u0990"+
		"\u0991\7K\2\2\u0991\u0993\5\u011e\u0090\2\u0992\u0990\3\2\2\2\u0992\u0993"+
		"\3\2\2\2\u0993\u099d\3\2\2\2\u0994\u099e\5\u00eex\2\u0995\u099e\5\u00f4"+
		"{\2\u0996\u099e\5\u00f2z\2\u0997\u0998\7F\2\2\u0998\u0999\7\30\2\2\u0999"+
		"\u099a\5\u00d8m\2\u099a\u099b\7\33\2\2\u099b\u099e\3\2\2\2\u099c\u099e"+
		"\5\u00f0y\2\u099d\u0994\3\2\2\2\u099d\u0995\3\2\2\2\u099d\u0996\3\2\2"+
		"\2\u099d\u0997\3\2\2\2\u099d\u099c\3\2\2\2\u099e\u00ed\3\2\2\2\u099f\u09a0"+
		"\7\u008e\2\2\u09a0\u09a1\7z\2\2\u09a1\u09a2\7\30\2\2\u09a2\u09a7\5\u00ea"+
		"v\2\u09a3\u09a4\7\34\2\2\u09a4\u09a6\5\u00eav\2\u09a5\u09a3\3\2\2\2\u09a6"+
		"\u09a9\3\2\2\2\u09a7\u09a5\3\2\2\2\u09a7\u09a8\3\2\2\2\u09a8\u09aa\3\2"+
		"\2\2\u09a9\u09a7\3\2\2\2\u09aa\u09ab\7\33\2\2\u09ab\u00ef\3\2\2\2\u09ac"+
		"\u09ad\7e\2\2\u09ad\u09ae\7z\2\2\u09ae\u09af\7\30\2\2\u09af\u09b4\5\u00f6"+
		"|\2\u09b0\u09b1\7\34\2\2\u09b1\u09b3\5\u00f6|\2\u09b2\u09b0\3\2\2\2\u09b3"+
		"\u09b6\3\2\2\2\u09b4\u09b2\3\2\2\2\u09b4\u09b5\3\2\2\2\u09b5\u09b7\3\2"+
		"\2\2\u09b6\u09b4\3\2\2\2\u09b7\u09b8\7\33\2\2\u09b8\u09b9\5\u00e6t\2\u09b9"+
		"\u00f1\3\2\2\2\u09ba\u09bc\7\u00a7\2\2\u09bb\u09bd\7z\2\2\u09bc\u09bb"+
		"\3\2\2\2\u09bc\u09bd\3\2\2\2\u09bd\u09bf\3\2\2\2\u09be\u09c0\5\u011e\u0090"+
		"\2\u09bf\u09be\3\2\2\2\u09bf\u09c0\3\2\2\2\u09c0\u09c1\3\2\2\2\u09c1\u09c2"+
		"\7\30\2\2\u09c2\u09c7\5\u00eav\2\u09c3\u09c4\7\34\2\2\u09c4\u09c6\5\u00ea"+
		"v\2\u09c5\u09c3\3\2\2\2\u09c6\u09c9\3\2\2\2\u09c7\u09c5\3\2\2\2\u09c7"+
		"\u09c8\3\2\2\2\u09c8\u09ca\3\2\2\2\u09c9\u09c7\3\2\2\2\u09ca\u09cb\7\33"+
		"\2\2\u09cb\u00f3\3\2\2\2\u09cc\u09ce\7z\2\2\u09cd\u09cf\5\u011e\u0090"+
		"\2\u09ce\u09cd\3\2\2\2\u09ce\u09cf\3\2\2\2\u09cf\u09d0\3\2\2\2\u09d0\u09d1"+
		"\7\30\2\2\u09d1\u09d6\5\u00eav\2\u09d2\u09d3\7\34\2\2\u09d3\u09d5\5\u00ea"+
		"v\2\u09d4\u09d2\3\2\2\2\u09d5\u09d8\3\2\2\2\u09d6\u09d4\3\2\2\2\u09d6"+
		"\u09d7\3\2\2\2\u09d7\u09d9\3\2\2\2\u09d8\u09d6\3\2\2\2\u09d9\u09da\7\33"+
		"\2\2\u09da\u00f5\3\2\2\2\u09db\u09dc\5\u012c\u0097\2\u09dc\u00f7\3\2\2"+
		"\2\u09dd\u09de\5\u0122\u0092\2\u09de\u09df\7\27\2\2\u09df\u09e1\3\2\2"+
		"\2\u09e0\u09dd\3\2\2\2\u09e0\u09e1\3\2\2\2\u09e1\u09e2\3\2\2\2\u09e2\u09e8"+
		"\5\u0126\u0094\2\u09e3\u09e4\7p\2\2\u09e4\u09e5\7A\2\2\u09e5\u09e9\5\u0132"+
		"\u009a\2\u09e6\u09e7\7\u0082\2\2\u09e7\u09e9\7p\2\2\u09e8\u09e3\3\2\2"+
		"\2\u09e8\u09e6\3\2\2\2\u09e8\u09e9\3\2\2\2\u09e9\u00f9\3\2\2\2\u09ea\u09ed"+
		"\5\u00d8m\2\u09eb\u09ec\7G\2\2\u09ec\u09ee\5\u012e\u0098\2\u09ed\u09eb"+
		"\3\2\2\2\u09ed\u09ee\3\2\2\2\u09ee\u09f0\3\2\2\2\u09ef\u09f1\t\17\2\2"+
		"\u09f0\u09ef\3\2\2\2\u09f0\u09f1\3\2\2\2\u09f1\u00fb\3\2\2\2\u09f2\u09f6"+
		"\5\u010e\u0088\2\u09f3\u09f6\5\u011e\u0090\2\u09f4\u09f6\7\u00c9\2\2\u09f5"+
		"\u09f2\3\2\2\2\u09f5\u09f3\3\2\2\2\u09f5\u09f4\3\2\2\2\u09f6\u00fd\3\2"+
		"\2\2\u09f7\u0a03\5\u0126\u0094\2\u09f8\u09f9\7\30\2\2\u09f9\u09fe\5\u012c"+
		"\u0097\2\u09fa\u09fb\7\34\2\2\u09fb\u09fd\5\u012c\u0097\2\u09fc\u09fa"+
		"\3\2\2\2\u09fd\u0a00\3\2\2\2\u09fe\u09fc\3\2\2\2\u09fe\u09ff\3\2\2\2\u09ff"+
		"\u0a01\3\2\2\2\u0a00\u09fe\3\2\2\2\u0a01\u0a02\7\33\2\2\u0a02\u0a04\3"+
		"\2\2\2\u0a03\u09f8\3\2\2\2\u0a03\u0a04\3\2\2\2\u0a04\u0a05\3\2\2\2\u0a05"+
		"\u0a06\7:\2\2\u0a06\u0a07\7\30\2\2\u0a07\u0a08\5\u00be`\2\u0a08\u0a09"+
		"\7\33\2\2\u0a09\u00ff\3\2\2\2\u0a0a\u0a17\7\36\2\2\u0a0b\u0a0c\5\u0126"+
		"\u0094\2\u0a0c\u0a0d\7\27\2\2\u0a0d\u0a0e\7\36\2\2\u0a0e\u0a17\3\2\2\2"+
		"\u0a0f\u0a14\5\u00d8m\2\u0a10\u0a12\7:\2\2\u0a11\u0a10\3\2\2\2\u0a11\u0a12"+
		"\3\2\2\2\u0a12\u0a13\3\2\2\2\u0a13\u0a15\5\u0118\u008d\2\u0a14\u0a11\3"+
		"\2\2\2\u0a14\u0a15\3\2\2\2\u0a15\u0a17\3\2\2\2\u0a16\u0a0a\3\2\2\2\u0a16"+
		"\u0a0b\3\2\2\2\u0a16\u0a0f\3\2\2\2\u0a17\u0101\3\2\2\2\u0a18\u0a19\5\u0122"+
		"\u0092\2\u0a19\u0a1a\7\27\2\2\u0a1a\u0a1c\3\2\2\2\u0a1b\u0a18\3\2\2\2"+
		"\u0a1b\u0a1c\3\2\2\2\u0a1c\u0a1d\3\2\2\2\u0a1d\u0a22\5\u0126\u0094\2\u0a1e"+
		"\u0a20\7:\2\2\u0a1f\u0a1e\3\2\2\2\u0a1f\u0a20\3\2\2\2\u0a20\u0a21\3\2"+
		"\2\2\u0a21\u0a23\5\u013e\u00a0\2\u0a22\u0a1f\3\2\2\2\u0a22\u0a23\3\2\2"+
		"\2\u0a23\u0a29\3\2\2\2\u0a24\u0a25\7p\2\2\u0a25\u0a26\7A\2\2\u0a26\u0a2a"+
		"\5\u0132\u009a\2\u0a27\u0a28\7\u0082\2\2\u0a28\u0a2a\7p\2\2\u0a29\u0a24"+
		"\3\2\2\2\u0a29\u0a27\3\2\2\2\u0a29\u0a2a\3\2\2\2\u0a2a\u0a48\3\2\2\2\u0a2b"+
		"\u0a35\7\30\2\2\u0a2c\u0a31\5\u0102\u0082\2\u0a2d\u0a2e\7\34\2\2\u0a2e"+
		"\u0a30\5\u0102\u0082\2\u0a2f\u0a2d\3\2\2\2\u0a30\u0a33\3\2\2\2\u0a31\u0a2f"+
		"\3\2\2\2\u0a31\u0a32\3\2\2\2\u0a32\u0a36\3\2\2\2\u0a33\u0a31\3\2\2\2\u0a34"+
		"\u0a36\5\u0104\u0083\2\u0a35\u0a2c\3\2\2\2\u0a35\u0a34\3\2\2\2\u0a36\u0a37"+
		"\3\2\2\2\u0a37\u0a3c\7\33\2\2\u0a38\u0a3a\7:\2\2\u0a39\u0a38\3\2\2\2\u0a39"+
		"\u0a3a\3\2\2\2\u0a3a\u0a3b\3\2\2\2\u0a3b\u0a3d\5\u013e\u00a0\2\u0a3c\u0a39"+
		"\3\2\2\2\u0a3c\u0a3d\3\2\2\2\u0a3d\u0a48\3\2\2\2\u0a3e\u0a3f\7\30\2\2"+
		"\u0a3f\u0a40\5\u00be`\2\u0a40\u0a45\7\33\2\2\u0a41\u0a43\7:\2\2\u0a42"+
		"\u0a41\3\2\2\2\u0a42\u0a43\3\2\2\2\u0a43\u0a44\3\2\2\2\u0a44\u0a46\5\u013e"+
		"\u00a0\2\u0a45\u0a42\3\2\2\2\u0a45\u0a46\3\2\2\2\u0a46\u0a48\3\2\2\2\u0a47"+
		"\u0a1b\3\2\2\2\u0a47\u0a2b\3\2\2\2\u0a47\u0a3e\3\2\2\2\u0a48\u0103\3\2"+
		"\2\2\u0a49\u0a50\5\u0102\u0082\2\u0a4a\u0a4b\5\u0106\u0084\2\u0a4b\u0a4c"+
		"\5\u0102\u0082\2\u0a4c\u0a4d\5\u0108\u0085\2\u0a4d\u0a4f\3\2\2\2\u0a4e"+
		"\u0a4a\3\2\2\2\u0a4f\u0a52\3\2\2\2\u0a50\u0a4e\3\2\2\2\u0a50\u0a51\3\2"+
		"\2\2\u0a51\u0105\3\2\2\2\u0a52\u0a50\3\2\2\2\u0a53\u0a5d\7\34\2\2\u0a54"+
		"\u0a56\7{\2\2\u0a55\u0a57\7\u008b\2\2\u0a56\u0a55\3\2\2\2\u0a56\u0a57"+
		"\3\2\2\2\u0a57\u0a5a\3\2\2\2\u0a58\u0a5a\7r\2\2\u0a59\u0a54\3\2\2\2\u0a59"+
		"\u0a58\3\2\2\2\u0a59\u0a5a\3\2\2\2\u0a5a\u0a5b\3\2\2\2\u0a5b\u0a5d\7y"+
		"\2\2\u0a5c\u0a53\3\2\2\2\u0a5c\u0a59\3\2\2\2\u0a5d\u0107\3\2\2\2\u0a5e"+
		"\u0a5f\7\u0087\2\2\u0a5f\u0a61\5\u00d8m\2\u0a60\u0a5e\3\2\2\2\u0a60\u0a61"+
		"\3\2\2\2\u0a61\u0109\3\2\2\2\u0a62\u0a64\7\u009d\2\2\u0a63\u0a65\t\16"+
		"\2\2\u0a64\u0a63\3\2\2\2\u0a64\u0a65\3\2\2\2\u0a65\u0a66\3\2\2\2\u0a66"+
		"\u0a6b\5\u0100\u0081\2\u0a67\u0a68\7\34\2\2\u0a68\u0a6a\5\u0100\u0081"+
		"\2\u0a69\u0a67\3\2\2\2\u0a6a\u0a6d\3\2\2\2\u0a6b\u0a69\3\2\2\2\u0a6b\u0a6c"+
		"\3\2\2\2\u0a6c\u0a7a\3\2\2\2\u0a6d\u0a6b\3\2\2\2\u0a6e\u0a78\7f\2\2\u0a6f"+
		"\u0a74\5\u0102\u0082\2\u0a70\u0a71\7\34\2\2\u0a71\u0a73\5\u0102\u0082"+
		"\2\u0a72\u0a70\3\2\2\2\u0a73\u0a76\3\2\2\2\u0a74\u0a72\3\2\2\2\u0a74\u0a75"+
		"\3\2\2\2\u0a75\u0a79\3\2\2\2\u0a76\u0a74\3\2\2\2\u0a77\u0a79\5\u0104\u0083"+
		"\2\u0a78\u0a6f\3\2\2\2\u0a78\u0a77\3\2\2\2\u0a79\u0a7b\3\2\2\2\u0a7a\u0a6e"+
		"\3\2\2\2\u0a7a\u0a7b\3\2\2\2\u0a7b\u0a7e\3\2\2\2\u0a7c\u0a7d\7\u00af\2"+
		"\2\u0a7d\u0a7f\5\u00d8m\2\u0a7e\u0a7c\3\2\2\2\u0a7e\u0a7f\3\2\2\2\u0a7f"+
		"\u0a8e\3\2\2\2\u0a80\u0a81\7i\2\2\u0a81\u0a82\7A\2\2\u0a82\u0a87\5\u00d8"+
		"m\2\u0a83\u0a84\7\34\2\2\u0a84\u0a86\5\u00d8m\2\u0a85\u0a83\3\2\2\2\u0a86"+
		"\u0a89\3\2\2\2\u0a87\u0a85\3\2\2\2\u0a87\u0a88\3\2\2\2\u0a88\u0a8c\3\2"+
		"\2\2\u0a89\u0a87\3\2\2\2\u0a8a\u0a8b\7j\2\2\u0a8b\u0a8d\5\u00d8m\2\u0a8c"+
		"\u0a8a\3\2\2\2\u0a8c\u0a8d\3\2\2\2\u0a8d\u0a8f\3\2\2\2\u0a8e\u0a80\3\2"+
		"\2\2\u0a8e\u0a8f\3\2\2\2\u0a8f\u0aad\3\2\2\2\u0a90\u0a91\7\u00ab\2\2\u0a91"+
		"\u0a92\7\30\2\2\u0a92\u0a97\5\u00d8m\2\u0a93\u0a94\7\34\2\2\u0a94\u0a96"+
		"\5\u00d8m\2\u0a95\u0a93\3\2\2\2\u0a96\u0a99\3\2\2\2\u0a97\u0a95\3\2\2"+
		"\2\u0a97\u0a98\3\2\2\2\u0a98\u0a9a\3\2\2\2\u0a99\u0a97\3\2\2\2\u0a9a\u0aa9"+
		"\7\33\2\2\u0a9b\u0a9c\7\34\2\2\u0a9c\u0a9d\7\30\2\2\u0a9d\u0aa2\5\u00d8"+
		"m\2\u0a9e\u0a9f\7\34\2\2\u0a9f\u0aa1\5\u00d8m\2\u0aa0\u0a9e\3\2\2\2\u0aa1"+
		"\u0aa4\3\2\2\2\u0aa2\u0aa0\3\2\2\2\u0aa2\u0aa3\3\2\2\2\u0aa3\u0aa5\3\2"+
		"\2\2\u0aa4\u0aa2\3\2\2\2\u0aa5\u0aa6\7\33\2\2\u0aa6\u0aa8\3\2\2\2\u0aa7"+
		"\u0a9b\3\2\2\2\u0aa8\u0aab\3\2\2\2\u0aa9\u0aa7\3\2\2\2\u0aa9\u0aaa\3\2"+
		"\2\2\u0aaa\u0aad\3\2\2\2\u0aab\u0aa9\3\2\2\2\u0aac\u0a62\3\2\2\2\u0aac"+
		"\u0a90\3\2\2\2\u0aad\u010b\3\2\2\2\u0aae\u0aba\5\u0126\u0094\2\u0aaf\u0ab0"+
		"\7\30\2\2\u0ab0\u0ab5\5\u012c\u0097\2\u0ab1\u0ab2\7\34\2\2\u0ab2\u0ab4"+
		"\5\u012c\u0097\2\u0ab3\u0ab1\3\2\2\2\u0ab4\u0ab7\3\2\2\2\u0ab5\u0ab3\3"+
		"\2\2\2\u0ab5\u0ab6\3\2\2\2\u0ab6\u0ab8\3\2\2\2\u0ab7\u0ab5\3\2\2\2\u0ab8"+
		"\u0ab9\7\33\2\2\u0ab9\u0abb\3\2\2\2\u0aba\u0aaf\3\2\2\2\u0aba\u0abb\3"+
		"\2\2\2\u0abb\u010d\3\2\2\2\u0abc\u0abe\t\7\2\2\u0abd\u0abc\3\2\2\2\u0abd"+
		"\u0abe\3\2\2\2\u0abe\u0abf\3\2\2\2\u0abf\u0ac2\7\u00c7\2\2\u0ac0\u0ac2"+
		"\7\36\2\2\u0ac1\u0abd\3\2\2\2\u0ac1\u0ac0\3\2\2\2\u0ac2\u010f\3\2\2\2"+
		"\u0ac3\u0ac4\t\23\2\2\u0ac4\u0111\3\2\2\2\u0ac5\u0ac6\t\24\2\2\u0ac6\u0113"+
		"\3\2\2\2\u0ac7\u0ac8\7\u00c9\2\2\u0ac8\u0115\3\2\2\2\u0ac9\u0acc\5\u00d8"+
		"m\2\u0aca\u0acc\5\u00c4c\2\u0acb\u0ac9\3\2\2\2\u0acb\u0aca\3\2\2\2\u0acc"+
		"\u0117\3\2\2\2\u0acd\u0ace\t\25\2\2\u0ace\u0119\3\2\2\2\u0acf\u0ad0\t"+
		"\26\2\2\u0ad0\u011b\3\2\2\2\u0ad1\u0ad3\13\2\2\2\u0ad2\u0ad1\3\2\2\2\u0ad3"+
		"\u0ad4\3\2\2\2\u0ad4\u0ad2\3\2\2\2\u0ad4\u0ad5\3\2\2\2\u0ad5\u011d\3\2"+
		"\2\2\u0ad6\u0ad7\5\u0142\u00a2\2\u0ad7\u011f\3\2\2\2\u0ad8\u0ad9\5\u0142"+
		"\u00a2\2\u0ad9\u0121\3\2\2\2\u0ada\u0adb\5\u0142\u00a2\2\u0adb\u0123\3"+
		"\2\2\2\u0adc\u0add\5\u0142\u00a2\2\u0add\u0125\3\2\2\2\u0ade\u0adf\5\u0142"+
		"\u00a2\2\u0adf\u0127\3\2\2\2\u0ae0\u0ae1\5\u0142\u00a2\2\u0ae1\u0129\3"+
		"\2\2\2\u0ae2\u0ae3\5\u0142\u00a2\2\u0ae3\u012b\3\2\2\2\u0ae4\u0ae5\5\u0142"+
		"\u00a2\2\u0ae5\u012d\3\2\2\2\u0ae6\u0ae7\5\u0142\u00a2\2\u0ae7\u012f\3"+
		"\2\2\2\u0ae8\u0ae9\5\u0142\u00a2\2\u0ae9\u0131\3\2\2\2\u0aea\u0aeb\5\u0142"+
		"\u00a2\2\u0aeb\u0133\3\2\2\2\u0aec\u0aed\5\u0142\u00a2\2\u0aed\u0135\3"+
		"\2\2\2\u0aee\u0aef\5\u0142\u00a2\2\u0aef\u0137\3\2\2\2\u0af0\u0af1\5\u0142"+
		"\u00a2\2\u0af1\u0139\3\2\2\2\u0af2\u0af3\5\u0142\u00a2\2\u0af3\u013b\3"+
		"\2\2\2\u0af4\u0af5\5\u0142\u00a2\2\u0af5\u013d\3\2\2\2\u0af6\u0af7\5\u0142"+
		"\u00a2\2\u0af7\u013f\3\2\2\2\u0af8\u0af9\5\u0142\u00a2\2\u0af9\u0141\3"+
		"\2\2\2\u0afa\u0b02\7\u00c5\2\2\u0afb\u0b02\5\u011a\u008e\2\u0afc\u0b02"+
		"\7\u00c9\2\2\u0afd\u0afe\7\30\2\2\u0afe\u0aff\5\u0142\u00a2\2\u0aff\u0b00"+
		"\7\33\2\2\u0b00\u0b02\3\2\2\2\u0b01\u0afa\3\2\2\2\u0b01\u0afb\3\2\2\2"+
		"\u0b01\u0afc\3\2\2\2\u0b01\u0afd\3\2\2\2\u0b02\u0143\3\2\2\2\u017e\u0148"+
		"\u014a\u0155\u015c\u0161\u0167\u0173\u0179\u019a\u019e\u01a1\u01af\u01b1"+
		"\u01bc\u01c2\u01d3\u01de\u01e4\u01f4\u0203\u0221\u0223\u0229\u023e\u0247"+
		"\u0254\u025d\u0265\u026b\u0271\u0274\u0279\u027f\u0285\u0288\u028b\u0291"+
		"\u0296\u0299\u029b\u02a1\u02a6\u02aa\u02af\u02b4\u02b8\u02bb\u02be\u02c4"+
		"\u02c6\u02cb\u02d2\u02da\u02df\u02e6\u02e9\u02ec\u02f3\u02f6\u02fc\u0306"+
		"\u0310\u0313\u0317\u031a\u031f\u032b\u0332\u0336\u0340\u0345\u034b\u034f"+
		"\u0356\u035c\u0360\u0365\u036c\u0372\u0376\u037b\u037f\u0386\u038b\u038f"+
		"\u0394\u039d\u03a2\u03a6\u03a9\u03ab\u03b5\u03ba\u03bf\u03c3\u03c7\u03ca"+
		"\u03d0\u03d4\u03d6\u03d9\u03dd\u03e3\u03e7\u03ec\u03ee\u03f1\u03f5\u03fb"+
		"\u03ff\u0404\u0406\u0409\u0415\u041a\u0420\u0424\u042b\u0431\u0435\u043a"+
		"\u0441\u0447\u044b\u0450\u0455\u045d\u0464\u046d\u046f\u0478\u047f\u0485"+
		"\u0489\u048b\u0496\u049a\u04aa\u04ad\u04b7\u04c0\u04c5\u04c9\u04cc\u04d1"+
		"\u04d7\u04db\u04e0\u04e3\u04f0\u04fa\u0509\u050f\u051c\u0520\u0523\u0528"+
		"\u052d\u0530\u0532\u053c\u0540\u0543\u0547\u054c\u0552\u0557\u0559\u0564"+
		"\u0566\u056c\u0571\u0576\u0584\u059a\u05a0\u05a6\u05ac\u05af\u05b4\u05c2"+
		"\u05c5\u05c8\u05ca\u05d2\u05dc\u05df\u05e2\u05e4\u05e6\u05f0\u05f4\u05fd"+
		"\u0601\u0604\u060c\u0618\u0621\u0628\u062c\u063c\u0646\u064c\u065b\u0665"+
		"\u0668\u0677\u0683\u0685\u068c\u0690\u0693\u0697\u06a4\u06a9\u06b2\u06b4"+
		"\u06bb\u06c2\u06ce\u06d0\u06e1\u06e7\u06ec\u06f5\u06fe\u0703\u070c\u0717"+
		"\u071e\u0724\u072e\u0731\u0737\u0739\u0743\u0746\u074c\u074e\u0752\u0759"+
		"\u0762\u0766\u0768\u076c\u0775\u077a\u077c\u0785\u0790\u0797\u079a\u07a9"+
		"\u07ae\u07b3\u07b5\u07bc\u07c3\u07c8\u07cc\u07d0\u07de\u07e3\u07e6\u07fb"+
		"\u0801\u0803\u0807\u0811\u0816\u081f\u0829\u082c\u0832\u0835\u0837\u083e"+
		"\u0843\u084a\u0852\u085c\u085f\u0865\u0868\u086a\u086c\u0876\u087b\u0884"+
		"\u088b\u088f\u0897\u08a5\u08a7\u08c5\u08cd\u08d2\u08d9\u08dd\u08e7\u08ec"+
		"\u08f5\u08fc\u0900\u0908\u0926\u0931\u093b\u093e\u0944\u0947\u0949\u094b"+
		"\u0952\u095b\u0960\u096c\u0970\u0974\u0978\u097f\u0982\u0984\u098b\u098e"+
		"\u0992\u099d\u09a7\u09b4\u09bc\u09bf\u09c7\u09ce\u09d6\u09e0\u09e8\u09ed"+
		"\u09f0\u09f5\u09fe\u0a03\u0a11\u0a14\u0a16\u0a1b\u0a1f\u0a22\u0a29\u0a31"+
		"\u0a35\u0a39\u0a3c\u0a42\u0a45\u0a47\u0a50\u0a56\u0a59\u0a5c\u0a60\u0a64"+
		"\u0a6b\u0a74\u0a78\u0a7a\u0a7e\u0a87\u0a8c\u0a8e\u0a97\u0aa2\u0aa9\u0aac"+
		"\u0ab5\u0aba\u0abd\u0ac1\u0acb\u0ad4\u0b01";
	public static final String _serializedATN = Utils.join(
		new String[] {
			_serializedATNSegment0,
			_serializedATNSegment1
		},
		""
	);
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}