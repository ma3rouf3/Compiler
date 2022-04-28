/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2014 by Bart Kiers
 *
 * Permission is hereby granted, free of charge, to any person
 * obtaining a copy of this software and associated documentation
 * files (the "Software"), to deal in the Software without
 * restriction, including without limitation the rights to use,
 * copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the
 * Software is furnished to do so, subject to the following
 * conditions:
 *
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
 * EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES
 * OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT
 * HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY,
 * WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING
 * FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR
 * OTHER DEALINGS IN THE SOFTWARE.
 *
 * Project      : sqlite-parser; an ANTLR4 grammar for SQLite
 *                https://github.com/bkiers/sqlite-parser
 * Developed by : Bart Kiers, bart@big-o.nl
 */
grammar SQL;

parse
 : ( sql_stmt_list | java_function_declaration_List | java_function_call | error )* EOF
 ;

error
 : UNEXPECTED_CHAR
   {
     throw new RuntimeException("UNEXPECTED_CHAR=" + $UNEXPECTED_CHAR.text);
   }
 ;

sql_stmt_list
 : ';'* sql_stmt ( ';'+ sql_stmt )* ';'*
 ;

sql_stmt
 //: ( K_EXPLAIN ( K_QUERY K_PLAN )? )? ( alter_table_stmt
   :                                  (
                                      create_aggerationt_function
                                      | alter_table_stmt
                                   //   | analyze_stmt
                                    //  | attach_stmt
                                    //  | begin_stmt
                                     // | commit_stmt
                                     // | compound_select_stmt
                                    //  | create_index_stmt
                                      | create_table_stmt
                                      | create_type
                            //          | create_trigger_stmt
                            //          | create_view_stmt
                            //          | create_virtual_table_stmt
                                      | delete_stmt
                            //          | delete_stmt_limited
                            //          | detach_stmt
                             //         | drop_index_stmt
                                      | drop_table_stmt
                            //          | drop_trigger_stmt
                           //           | drop_view_stmt
                                      | factored_select_stmt
                                      | insert_stmt
                    //                  | pragma_stmt
                   //                   | reindex_stmt
                   //                   | release_stmt
                    //                  | rollback_stmt
                   //                   | savepoint_stmt
                   //                   | simple_select_stmt
                  //                    | select_stmt
                                      | update_stmt
                  //                    | update_stmt_limited
                  //                    | vacuum_stmt

                                   /*   |var_grammer
                                      | for_grammer
                                      | if_grammer
                                      | if_else_grammer
                                      | if_oneline_grammer
                                      | while_grammer
                                      | do_while
                                      | switch_grammer
                                      |array_Intill_grammer  */


                                      )
 ;


create_aggerationt_function
:
 K_CREATE any_name_without_keyword* '('jar_path ',' class_name ',' method_name ',' return_type ',' '[' params_agg_fun ']' ')' SCOL
;
params_agg_fun
:
 (K_number | K_STRING | K_BOOLEAN  )
;

 jar_path
:
any_name
;
class_name
:
any_name
;
method_name
:
any_name
;
return_type
:
(K_number | K_STRING | K_BOOLEAN  )

;
params
:
any_name_without_keyword|NUMERIC_LITERAL (  ','  (any_name_without_keyword | NUMERIC_LITERAL) )*
;

 // ( '(' any_name_without_keyword create_type_value ')' )*
 /*
create_typel
:
K_CREATE K_TYPE table_name ( '(' column_def create_type_value ( ',' table_constraint | ',' column_def create_type_value )* ')' )  K_TYPE '='    ( 'CSV' | 'JSON' ) K_PATH '=' ( any_name )
;
*/

 create_type
:
K_CREATE K_TYPE table_name ( '(' column_def create_type_value ( ',' table_constraint | ',' column_def create_type_value )* ')' ) ( K_TYPE '='    ( 'CSV' | 'JSON' ) K_PATH '=' ( any_name ))?
;


create_type_value
:
(K_number | K_STRING | K_BOOLEAN |any_name_without_keyword)
//( number_k | string_k | boolean_k )
;


create_type_value1
:
(K_number | K_STRING | K_BOOLEAN)
//( number_k | string_k | boolean_k )
;
number_k:
K_number
;
string_k:
K_STRING
;

boolean_k
:
K_BOOLEAN
;


print_grammer
:    K_PRINT '('  ( printG ('+' printG )*  ) ')' SCOL
 ;

 printG
 :
 ( any_name | java_function_call_for_loop | increase_and_decrease | array_name | expr )
 ;


java_function_declaration_List:
java_function_declaration (java_function_declaration )*
;

java_function_declaration
: java_function_header   java_function_body
;

java_function_header
: any_name_without_keyword '(' parameters_list ')'
;
java_function_call
: any_name_without_keyword '(' arguments_list  (','higher_order_function)?  ')' SCOL
;

java_function_call_for_var
: any_name_without_keyword '(' arguments_list  ')'
;
java_function_call_for_var1
: any_name_without_keyword '(' arguments_list  (','higher_order_function)?')'
;

java_function_call_for_loop
: any_name_without_keyword '(' arguments_list ')'
;


java_function_body
:
    '{'
 //    ( sql_stmt_list | var_grammer  | for_grammer | foreach_grammer  | if_else_grammer | while_grammer | do_while_grammer | switch_grammer | array_Intill_grammer | print_grammer | java_function_declaration | java_function_call | increase_and_decrease SCOL | array_value | array_of_json_grammer |return_grammer)*
   list_loopStatement
    '}'
;

loops_body
:
   ( sql_stmt_list | var_grammer | for_grammer | foreach_grammer | if_else_grammer  | while_grammer | do_while_grammer | switch_grammer | array_Intill_grammer | java_function_call |increase_and_decrease SCOL | return_grammer | array_value |array_of_json_grammer | print_grammer)*
;

list_loopStatement:
//     ( sql_stmt_list | var_grammer  | for_grammer | foreach_grammer  | if_else_grammer | while_grammer | do_while_grammer | switch_grammer | array_Intill_grammer | print_grammer | java_function_declaration | java_function_call | increase_and_decrease SCOL | array_value | array_of_json_grammer |return_grammer)*
( loopStatement*)

;

loopStatement
:
( sql_stmt_list | var_grammer  | for_grammer | foreach_grammer  | if_else_grammer | while_grammer | do_while_grammer | switch_grammer | array_value | array_Intill_grammer | print_grammer | java_function_declaration | java_function_call | increase_and_decrease SCOL  | array_of_json_grammer |return_grammer)
;

 higher_order_function
 :
K_FUNCTION '(' (any_name_without_keyword (',' any_name_without_keyword)* ) ')'
'{' loops_body '}'

 ;

 return_body
  :
   (any_name_without_keyword  (WHILE_SIGNS any_name_without_keyword)* ) for_signs (any_name_without_keyword  (WHILE_SIGNS any_name_without_keyword)* )
    ;



array_Intill_grammer
 :
 ( K_VAR (  ( ( IDENTIFIER ('[' (any_name_without_keyword|NUMERIC_LITERAL)? ']' |'['(any_name_without_keyword|NUMERIC_LITERAL)?']''['(any_name_without_keyword|NUMERIC_LITERAL)?']') ) | ( ('['(any_name_without_keyword|NUMERIC_LITERAL)?']'|'['(any_name_without_keyword|NUMERIC_LITERAL)?']''['(any_name_without_keyword|NUMERIC_LITERAL)?']') IDENTIFIER ) )
           | ( (IDENTIFIER ('[]' |'[]''[]') ) | ( ('[]'|'[]''[]') IDENTIFIER ) )
                  )
  '='
(
('['
   (
    ( (any_name_without_keyword|NUMERIC_LITERAL) ( ',' (any_name_without_keyword|NUMERIC_LITERAL))* )
 |  ( (any_name_without_keyword|NUMERIC_LITERAL) ( ',' (any_name_without_keyword|NUMERIC_LITERAL))* )

  )
 ']')?
 | (any_name_without_keyword | java_function_call_for_loop | sql_stmt | if_oneline_grammer )
 )
 SCOL)
 ;



  parameters_list
  :  ( (parms)?
     |  (prams_with_ingth (',' prams_with_ingth )*)
     |  ( (parms (',' parms)*)* (',' prams_with_ingth )* )
     )
  ;

 arguments_list
  :
  arguments_list_body? |  arguments_list_body (',' (arguments_list_body) )*
  ;

arguments_list_body
:
(any_name_without_keyword | NUMERIC_LITERAL | array_name_call | java_function_call_for_loop)
;


 parms
  : K_VAR  any_name_without_keyword
  ;

prams_with_ingth
:
K_VAR any_name_without_keyword ('=' (NUMERIC_LITERAL| expr))
;


while_grammer
:
  K_WHILE while_header_grammer while_body_graammer
;

while_body_graammer:
    ( ('{'(  ( list_loopStatement  (K_CONTINUE SCOL)? (list_loopStatement)? ) | ((K_CONTINUE SCOL)? list_loopStatement) )'}' ) | one_loop_body )
;

 do_while_grammer
 :
  //K_DO '{'  loops_body'}'
 K_DO while_body_graammer
 while_header_grammer ';'

 ;

while_header_grammer
:
  '('
  ( java_function_call_for_loop  ( while_comper ('true' | 'false'  ) )?
  |   (  expr  )   while_comper (  (   expr | 'true' | 'false'  ) )
  | 'true' | 'false'    )
    ')'

;

while_header_grammer1
:
  K_WHILE '('
  ( java_function_call_for_loop  (while_comper ('true' | 'false'  ) )?
  | ( (
     (  (ll1|any_name_without_keyword | NUMERIC_LITERAL )   ( while_signs (any_name_without_keyword | NUMERIC_LITERAL|ll1 )  )*     )
       ( ('||' | '&&')
          (  (ll1|any_name_without_keyword | NUMERIC_LITERAL )   ( while_signs (any_name_without_keyword | NUMERIC_LITERAL|ll1 )  )*     )

    )*
      )
    while_comper
   (
     (  (ll1|any_name_without_keyword | NUMERIC_LITERAL )   ( while_signs (any_name_without_keyword | NUMERIC_LITERAL|ll1 )  )*     )
     | 'true' | 'false'  ) )
     | 'true' | 'false'    )
    ')'
;


  ll1
  :
  ( ( '('  ( (any_name_without_keyword | NUMERIC_LITERAL) ( while_signs (any_name_without_keyword|NUMERIC_LITERAL))* )*  ( (while_signs  ll1  while_signs ) | ( (any_name_without_keyword| NUMERIC_LITERAL) ( while_signs (any_name_without_keyword|NUMERIC_LITERAL))*)  )*   ')' )

   | ( '('  ( ll1  while_signs)*  ( (any_name_without_keyword | NUMERIC_LITERAL) ( while_signs (any_name_without_keyword|NUMERIC_LITERAL) )* ) ')' )

    )
   ;



if_oneline_grammer
:  '('?
   any_name_without_keyword ( if_oneline_signl_grammer+ (literal_value|IDENTIFIER))?
   ')'?
   QM '('? (( if_oneline_grammer)|( ( (any_name_without_keyword|java_function_call_for_loop|array_name) ASSIGN)?(any_name_without_keyword| NUMERIC_LITERAL | java_function_call_for_loop) ) ) ')'? DD  '('? ((if_oneline_grammer)|(((any_name_without_keyword|java_function_call_for_loop|array_name) '=')? (any_name_without_keyword| NUMERIC_LITERAL | java_function_call_for_loop))) ')'?
;

if_oneline_signl_grammer
:
  ( EQ
   | NOT_EQ1
   | LT
   | LT_EQ
   | GT
   | GT_EQ )
;


true_or_false
:
('true' | 'false' )
;

if_grammer1
:  K_IF '('
          ( java_function_header (while_comper ('true' | 'false'  ) )?
          | ( (
             (  (ll1|any_name_without_keyword | NUMERIC_LITERAL )   ( while_signs (any_name_without_keyword | NUMERIC_LITERAL|ll1 )  )*     )
               ( ('||' | '&&')
                  (  (ll1|any_name_without_keyword | NUMERIC_LITERAL )   ( while_signs (any_name_without_keyword | NUMERIC_LITERAL|ll1 )  )*     )

                 //(ll1|any_name_without_keyword | NUMERIC_LITERAL ) ( while_signs (any_name_without_keyword | NUMERIC_LITERAL | ll1)  )*
                   )*
              )
            while_comper
           (
             (  (ll1|any_name_without_keyword | NUMERIC_LITERAL )   ( while_signs (any_name_without_keyword | NUMERIC_LITERAL|ll1 )  )*     )
             | 'true' | 'false') )
             | 'true' | 'false' |IDENTIFIER   )
            ')'
  ( ('{'
   loops_body
   '}' ) | one_loop_body )


;

if_else_grammer
:
(   if_grammer
    ( K_ELSE if_grammer )*
     (K_ELSE  (  ('{' list_loopStatement '}') | ( one_loop_body)  ) )?
)
;
if_grammer
:
K_IF if_header_grammer   ( ('{'  list_loopStatement  '}' ) | one_loop_body )
;

if_header_grammer
:
 '('  ( java_function_call_for_loop  (while_comper true_or_false)?
    | (expr ) while_comper ( expr | true_or_false )
    |      ( true_or_false | IDENTIFIER )  )
  ')'
;

foreach_grammer
: K_FOR
    foreach_header_grammer
     ( ( '{' list_loopStatement '}' ) | ( one_loop_body) )
;

foreach_header_grammer
:
'('
   (K_VAR)?  any_name_without_keyword ':'   any_name_without_keyword
  ')'
;

 for_grammer
 :  K_FOR
    '('
    for_header
    ')'
  ( (  '{' list_loopStatement '}') | ( one_loop_body  ) )
 ;
for_header
:
    (K_VAR)?  any_name_without_keyword '=' (NUMERIC_LITERAL) ';' any_name_without_keyword  for_signs (NUMERIC_LITERAL|any_name_without_keyword) ';' increase_and_decrease
;

switch_grammer
:
  // K_SWITCH '(' ( ('\'' IDENTIFIER'\'' ) | ('"' any_name_without_keyword '"') | expr_without_comper )')'
  K_SWITCH switch_header_grammer
   '{' list_loopStatement?
  (   ( case_grammer* default_grammer? )
    | ( default_grammer? case_grammer*)
    | ( case_grammer* default_grammer? case_grammer*)
   )
     '}'
;

switch_header_grammer
:
  '(' ( ('\'' IDENTIFIER'\'' ) | ('"' any_name_without_keyword '"') | expr )')'
;

case_grammer
:
  //   K_CASE   ( ('(' (any_name_without_keyword|NUMERIC_LITERAL) ')') | (any_name_without_keyword|NUMERIC_LITERAL) )
    K_CASE   ( ('(' (expr) ')') | (expr) )
    ':'
   list_loopStatement
    K_BREAK';'
;

default_grammer
:
 K_DEFAULT  ':'
 list_loopStatement
       K_BREAK';'
;

/*
var_grammer1
:
      (any_name_without_keyword ( (while_signs)? ( ASSIGN ( NUMERIC_LITERAL | sql_stmt  | java_function_call_for_var | if_oneline_grammer| array_name_call| array_name | json_grammer | any_name_without_keyword|expr | 'true' | 'false' ) )*)? SCOL)
   |  ((K_VAR)? any_name_without_keyword (('=' (( ('-'? |'+'? )  NUMERIC_LITERAL) | select_stmt | java_function_call_for_var | if_oneline_grammer | json_grammer | any_name_without_keyword | expr | 'true' | 'false' ))*)? SCOL)
;*/
var_grammer0
:
      (any_name_without_keyword ( (while_signs)? (array_name  | java_function_call_for_var | any_name_without_keyword|expr)( ASSIGN ( NUMERIC_LITERAL | sql_stmt  | java_function_call_for_var | if_oneline_grammer| array_name_call| array_name | json_grammer | any_name_without_keyword|expr |  true_or_false ) )*)? SCOL)
   |  ((K_VAR)? any_name_without_keyword ( ('=' (( ('-'? |'+'? )  NUMERIC_LITERAL) | select_stmt | java_function_call_for_var | if_oneline_grammer | json_grammer | any_name_without_keyword | expr |true_or_false ))*)? SCOL)
;



var_grammer
:
  var_grammer2
  | var_3
  |  var_4


;

var_grammer2
:
K_VAR any_name_without_keyword   ( ASSIGN  ('-' |'+' )?( NUMERIC_LITERAL | true_or_false | IDENTIFIER ) )?  SCOL

;
var_3
:
K_VAR any_name_without_keyword  ( ASSIGN (factored_select_stmt | java_function_call_for_var | if_oneline_grammer | expr)  )? SCOL
;
var_4
:
     ( any_name_without_keyword ( (while_signs)? (array_name  | java_function_call_for_var | expr )? x1* ) SCOL )
;
x1
:
( ASSIGN( NUMERIC_LITERAL   | java_function_call_for_var | sql_stmt | if_oneline_grammer | array_name_call| array_name | expr |  true_or_false ) )
;

true_grammer
:
'true'
;

false_grammer
:
'false'
;


one_loop_body:
 ( sql_stmt_list | var_grammer | for_grammer   | if_else_grammer  | while_grammer | do_while_grammer | switch_grammer | array_Intill_grammer | java_function_call |increase_and_decrease SCOL | return_grammer | array_value |array_of_json_grammer | print_grammer)
;


array_name
:
any_name_without_keyword
 ( ('[' (NUMERIC_LITERAL | any_name_without_keyword)']' )| ( ('['NUMERIC_LITERAL | any_name_without_keyword)']''['(NUMERIC_LITERAL| any_name_without_keyword)']'))

 ;

array_name_call
:
any_name_without_keyword
 (('[]' )| ('[][]'))
;

array_value
:
    array_name
 ASSIGN (NUMERIC_LITERAL|any_name_without_keyword| if_oneline_grammer |java_function_call_for_loop|expr|IDENTIFIER| true_or_false |'null'| ( array_name (while_signs? (expr)? |( '--' | '++') ) ) )
 ( ASSIGN ( array_name '=')* (NUMERIC_LITERAL | any_name_without_keyword |expr| true_or_false |'null' | ( array_name (while_signs? (expr)? |( '--' | '++') ) ) ) )?
 SCOL
;

 increase_and_decrease
 :
  (any_name_without_keyword ( ('--') | ('++') | PLUS (NUMERIC_LITERAL|any_name_without_keyword) | MINUS NUMERIC_LITERAL ) )
 | (( (PLUS PLUS) | (MINUS MINUS) | PLUS (NUMERIC_LITERAL|any_name_without_keyword) | MINUS NUMERIC_LITERAL ) any_name_without_keyword )
 ;

  any_name_without_keyword
   : IDENTIFIER
   | STRING_LITERAL
   | '(' any_name_without_keyword ')'
   ;

return_grammer
:
K_RETURN (literal_value|IDENTIFIER |java_function_call_for_loop |true_or_false|'null'|if_oneline_grammer|array_name | increase_and_decrease | expr) SCOL
;

json_grammer
:  '{' (IDENTIFIER ':' (expr|json_grammer) ) (',' (IDENTIFIER ':' (expr|json_grammer) ))*
   '}'
;

open_par
:
'{'
;

close_par
:
'}'
;
 value
 :
 IDENTIFIER|expr|'true'|'false'|'null'|array_of_json_grammer|json_grammer
 ;

array_of_json_grammer
:
any_name_without_keyword
':'
 (('[' (value(','value)*) ']')
| ('[]') ) SCOL
;

 for_signs
 :
   GT_EQ
 | LT_EQ
 | LT
 | GT
 ;

while_comper
:
(EQ
| NOT_EQ1
| LT
| LT_EQ
| GT
| GT_EQ
)
;


while_signs
:
PLUS
| MINUS
| DIV
| MOD
| STAR
;




alter_table_stmt
// : K_ALTER K_TABLE K_ONLY? ( database_name '.' )? source_table_name
 : K_ALTER K_TABLE  ( database_name '.' )? source_table_name
   ( K_RENAME K_TO new_table_name
   | alter_table_add
   | alter_table_add_constraint
   | K_ADD K_COLUMN? column_def
   )
  // K_ENABLE? (unknown)?
 ;

alter_table_add_constraint
 : K_ADD K_CONSTRAINT any_name table_constraint
 ;

alter_table_add
 : K_ADD table_constraint
 ;
/*
analyze_stmt
 : K_ANALYZE ( database_name | table_or_index_name | database_name '.' table_or_index_name )?
 ;

attach_stmt
 : K_ATTACH K_DATABASE? expr K_AS database_name
 ;

begin_stmt
 : K_BEGIN ( K_DEFERRED | K_IMMEDIATE | K_EXCLUSIVE )? ( K_TRANSACTION transaction_name? )?
 ;

commit_stmt
 : ( K_COMMIT | K_END ) ( K_TRANSACTION transaction_name? )?
 ;

compound_select_stmt
 : ( K_WITH K_RECURSIVE? common_table_expression ( ',' common_table_expression )* )?
   select_core ( ( K_UNION K_ALL? | K_INTERSECT | K_EXCEPT ) select_core )+
   ( K_ORDER K_BY ordering_term ( ',' ordering_term )* )?
   ( K_LIMIT expr ( ( K_OFFSET | ',' ) expr )? )?
 ;

create_index_stmt
 : K_CREATE K_UNIQUE? K_INDEX ( K_IF K_NOT K_EXISTS )?
   ( database_name '.' )? index_name K_ON table_name '(' indexed_column ( ',' indexed_column )* ')'
   ( K_WHERE expr )?
 ;
*/

create_table_stmt
:
 K_CREATE  K_TABLE ( K_IF K_NOT K_EXISTS )?
     table_name
     ( '(' column_def create_type_value ( ',' table_constraint | ',' column_def create_type_value )* ')'  ) K_TYPE '='?  ( csv_s| json_s ) ','? K_PATH '='? ( any_name )
 ;
 csv_s
 :
  ('"csv"' | 'csv')
;

json_s
:
 ('"json"' | 'json' )
;

/*
 create_type_value1
:
(
'String'
| 'number'
| 'boolean'
)
;*/

create_table_stmt1
// : K_CREATE ( K_TEMP | K_TEMPORARY )? K_TABLE ( K_IF K_NOT K_EXISTS )?
  : K_CREATE  K_TABLE ( K_IF K_NOT K_EXISTS )?
   ( database_name '.' )? table_name
  // ( '(' column_def ( ',' table_constraint | ',' column_def )* ')' ( K_WITHOUT IDENTIFIER )?
    ( '(' column_def ( ',' table_constraint | ',' column_def )* ')'
   | K_AS select_stmt
 //  ) (unknown)?
 )
 ;

 create_tayp_stmt1
 // : K_CREATE ( K_TEMP | K_TEMPORARY )? K_TABLE ( K_IF K_NOT K_EXISTS )?
   : K_CREATE  K_TABLE ( K_IF K_NOT K_EXISTS )?
     table_name
   // ( '(' column_def ( ',' table_constraint | ',' column_def )* ')' ( K_WITHOUT IDENTIFIER )?
     ( '(' column_def create_type_value ( ',' table_constraint | ',' column_def create_type_value  )* ')'
  //  ) (unknown)?
  )
     K_TYPE '=' ('CSV' | 'JSON' ) K_PATH '=' ( any_name_without_keyword )
  ;

/*
create_trigger_stmt
 : K_CREATE ( K_TEMP | K_TEMPORARY )? K_TRIGGER ( K_IF K_NOT K_EXISTS )?
   ( database_name '.' )? trigger_name ( K_BEFORE  | K_AFTER | K_INSTEAD K_OF )?
   ( K_DELETE | K_INSERT | K_UPDATE ( K_OF column_name ( ',' column_name )* )? ) K_ON ( database_name '.' )? table_name
   ( K_FOR K_EACH K_ROW )? ( K_WHEN expr )?
   K_BEGIN ( ( update_stmt | insert_stmt | delete_stmt | select_stmt ) ';' )+ K_END
 ;

create_view_stmt
 : K_CREATE ( K_TEMP | K_TEMPORARY )? K_VIEW ( K_IF K_NOT K_EXISTS )?
   ( database_name '.' )? view_name K_AS select_stmt
 ;

create_virtual_table_stmt
 : K_CREATE K_VIRTUAL K_TABLE ( K_IF K_NOT K_EXISTS )?
   ( database_name '.' )? table_name
   K_USING module_name ( '(' module_argument ( ',' module_argument )* ')' )?
 ;
*/
delete_stmt
// : with_clause? K_DELETE K_FROM qualified_table_name
  :  K_DELETE K_FROM qualified_table_name
   ( K_WHERE expr )?
 ;
/*
delete_stmt_limited
 : with_clause? K_DELETE K_FROM qualified_table_name
   ( K_WHERE expr )?
   ( ( K_ORDER K_BY ordering_term ( ',' ordering_term )* )?
     K_LIMIT expr ( ( K_OFFSET | ',' ) expr )?
   )?
 ;

detach_stmt
 : K_DETACH K_DATABASE? database_name
 ;

drop_index_stmt
 : K_DROP K_INDEX ( K_IF K_EXISTS )? ( database_name '.' )? index_name
 ;
*/
drop_table_stmt
 : K_DROP K_TABLE ( K_IF K_EXISTS )? ( database_name '.' )? table_name
 ;
/*
drop_trigger_stmt
 : K_DROP K_TRIGGER ( K_IF K_EXISTS )? ( database_name '.' )? trigger_name
 ;

drop_view_stmt
 : K_DROP K_VIEW ( K_IF K_EXISTS )? ( database_name '.' )? view_name
 ;
*/


insert_stmt
 /*: with_clause? ( K_INSERT
                | K_REPLACE
                | K_INSERT K_OR K_REPLACE
                | K_INSERT K_OR K_ROLLBACK
                | K_INSERT K_OR K_ABORT
                | K_INSERT K_OR K_FAIL
                | K_INSERT K_OR K_IGNORE ) K_INTO*/
                :   K_INSERT  K_INTO
   ( database_name '.' )? table_name ( '(' column_name ( ',' column_name )* ')' )?
   ( K_VALUES '(' expr ( ',' expr )* ')' ( ',' '(' expr ( ',' expr )* ')' )*
   | select_stmt
   | K_DEFAULT K_VALUES
   )
 ;
/*
pragma_stmt
 : K_PRAGMA ( database_name '.' )? pragma_name ( '=' pragma_value
                                               | '(' pragma_value ')' )?
 ;

reindex_stmt
 : K_REINDEX ( collation_name

savepoint_stmt
 : K_SAVEPOINT savepoint_name
 ;

simple_select_stmt
 : ( K_WITH K_RECURSIVE? common_table_expression ( ',' common_table_expression )* )?
   select_core ( K_ORDER K_BY ordering_term ( ',' order
             | ( database_name '.' )? ( table_name | index_name )
             )?
 ;

release_stmt
 : K_RELEASE K_SAVEPOINT? savepoint_name
 ;

rollback_stmt
 : K_ROLLBACK ( K_TRANSACTION transaction_name? )? ( K_TO K_SAVEPOINT? savepoint_name )?
 ;ing_term )* )?
   ( K_LIMIT expr ( ( K_OFFSET | ',' ) expr )? )?
 ;
*/
factored_select_stmt
 //: ( K_WITH K_RECURSIVE? common_table_expression ( ',' common_table_expression )* )?
  : select_or_values   // ( compound_operator select_core )*  هي معدلة كلها
   ( K_ORDER K_BY ordering_term ( ',' ordering_term )* )?
   ( K_LIMIT expr ( ( K_OFFSET | ',' ) expr )? )?
 ;

select_stmt
 //: ( K_WITH K_RECURSIVE? common_table_expression ( ',' common_table_expression )* )?
  // select_or_values ( compound_operator select_or_values )*

   : select_or_values
   ( K_ORDER K_BY ordering_term ( ',' ordering_term )* )?
   ( K_LIMIT expr ( ( K_OFFSET | ',' ) expr )? )?
 ;

select_or_values
 : K_SELECT ( K_DISTINCT | K_ALL )? result_column ( ',' result_column )*
   ( K_FROM ( table_or_subquery ( ',' table_or_subquery )* | join_clause ) )?
   ( K_WHERE expr )?
   ( K_GROUP K_BY expr ( ',' expr )* ( K_HAVING expr )? )?
 | K_VALUES '(' expr ( ',' expr )* ')' ( ',' '(' expr ( ',' expr )* ')' )*
 ;

update_stmt
 /* : with_clause? K_UPDATE ( K_OR K_ROLLBACK
                         | K_OR K_ABORT
                         | K_OR K_REPLACE
                         | K_OR K_FAIL
                         | K_OR K_IGNORE )? qualified_table_name*/
                            :  K_UPDATE  qualified_table_name
   K_SET column_name '=' expr ( ',' column_name '=' expr )* ( K_WHERE expr )?
 ;
/*
update_stmt_limited
 : with_clause? K_UPDATE ( K_OR K_ROLLBACK
                         | K_OR K_ABORT
                         | K_OR K_REPLACE
                         | K_OR K_FAIL
                         | K_OR K_IGNORE )? qualified_table_name
   K_SET column_name '=' expr ( ',' column_name '=' expr )* ( K_WHERE expr )?
   ( ( K_ORDER K_BY ordering_term ( ',' ordering_term )* )?
     K_LIMIT expr ( ( K_OFFSET | ',' ) expr )?
   )?
 ;

vacuum_stmt
 : K_VACUUM
 ;
*/


column_def
 : column_name ( column_constraint | type_name )*
 ;

type_name
 : name ( '(' signed_number (any_name)? ')'
         | '(' signed_number (any_name)? ',' signed_number (any_name)? ')' )?
 ;

column_constraint
 : ( K_CONSTRAINT name )?
   ( column_constraint_primary_key
   | column_constraint_foreign_key
   | column_constraint_not_null
   | column_constraint_null
 //  | K_UNIQUE conflict_clause
   | K_CHECK '(' expr ')'
   | column_default
   | K_COLLATE collation_name
   )
 ;

column_constraint_primary_key
// : K_PRIMARY K_KEY ( K_ASC | K_DESC )? conflict_clause K_AUTOINCREMENT?
 : K_PRIMARY K_KEY ( K_ASC | K_DESC )?  K_AUTOINCREMENT?
 ;

column_constraint_foreign_key
 : foreign_key_clause
 ;

column_constraint_not_null
// : K_NOT K_NULL conflict_clause
  : K_NOT K_NULL
 ;

column_constraint_null
// : K_NULL conflict_clause
 : K_NULL
 ;

column_default
 : K_DEFAULT (column_default_value | '(' expr ')' | K_NEXTVAL '(' expr ')' | any_name )  ( '::' any_name+ )?
 ;

column_default_value
 : ( signed_number | literal_value )
 ;
/*
conflict_clause
 : ( K_ON K_CONFLICT ( K_ROLLBACK
                     | K_ABORT
                     | K_FAIL
                     | K_IGNORE
                     | K_REPLACE
                     )
   )?
 ;
*/

/*
    SQLite understands the following binary operators, in order from highest to
    lowest precedence:

    ||
    *    /    %
    +    -
    <<   >>   &    |
    <    <=   >    >=
    =    ==   !=   <>   IS   IS NOT   IN   LIKE   GLOB   MATCH   REGEXP
    AND
    OR
*/


exprwhere
:
var1
 | expr opeeration expr
 | ( ( database_name '.' )? table_name '.' )? column_name
 | OPEN_PAR expr CLOSE_PAR
 | expr1 K_NOT? K_IN ( '(' ( select_stmt
                             | expr1 ( ',' expr1 )*
                             )?
                         ')'
                       | ( database_name '.' )? table_name )
;



expr
:
var1
 | expr opeeration expr
 | ( ( database_name '.' )? table_name '.' )? column_name
 | OPEN_PAR expr CLOSE_PAR
 | expr K_NOT? K_IN ( '(' ( select_stmt  | expr ( ',' expr )*  )?
                         ')'
                       | ( database_name '.' )? table_name )
;
expr_for_var
:



;
expr_without_comper
:
  literal_value
// | BIND_PARAMETER
 | ( ( database_name '.' )? table_name '.' )?   column_name
 | unary_operator expr_without_comper
 | expr_without_comper '||' expr_without_comper
 | expr_without_comper ( '*' | '/' | '%' ) expr_without_comper
 | expr_without_comper ( '+' | '-' ) expr_without_comper
 | expr_without_comper ( '<<' | '>>' | '&' | '|' ) expr_without_comper
 | function_name '(' ( K_DISTINCT? expr_without_comper ( ',' expr_without_comper )* | '*' )? ')'
 | '(' expr_without_comper ')'

;



opeeration:
( '*' | '/' | '%' | '+' | '<<' | '>>' | '&' | '|' | '<' | '<=' | '>' | '>=' | '=' | '==' | '!=' | '<>' |
K_IS | K_IS K_NOT | K_IN | K_LIKE | K_GLOB | K_MATCH | K_REGEXP | MINUS| K_AND | K_OR)
;

var1
:
literal_value
 | column_name
 | unary_operator expr
 | function_expr
 //| '(' expr ')'

;

function_expr
:
  function_name '(' ( K_DISTINCT? expr ( ',' expr )* | STAR )? ')'
;

expr1
 :literal_value
 | BIND_PARAMETER
 | ( ( database_name '.' )? table_name '.' )? column_name
 | unary_operator expr1
 | expr1 '||' expr1
 | expr1 ( '*' | '/' | '%' ) expr1
 | expr1 ( '+' | '-' ) expr1
 | expr1 ( '<<' | '>>' | '&' | '|' ) expr1
 | expr1 ( '<' | '<=' | '>' | '>=' ) expr1
 | expr1 ( '=' | '==' | '!=' | '<>' | K_IS | K_IS K_NOT | K_IN | K_LIKE | K_GLOB | K_MATCH | K_REGEXP ) expr1
 | expr1 K_AND expr1
 | expr1 K_OR expr1
 | function_name '(' ( K_DISTINCT? expr1 ( ',' expr1 )* | '*' )? ')'
 | '(' expr1 ')'
 | expr1 K_NOT? K_IN ( '(' ( select_stmt
                           | expr1 ( ',' expr1 )*
                           )?
                       ')'
                     | ( database_name '.' )? table_name )
/* | K_CAST '(' expr K_AS type_name ')'
 | expr K_COLLATE collation_name
 | expr K_NOT? ( K_LIKE | K_GLOB | K_REGEXP | K_MATCH ) expr ( K_ESCAPE expr )?
 | expr ( K_ISNULL | K_NOTNULL | K_NOT K_NULL )
 | expr K_IS K_NOT? expr
 | expr K_NOT? K_BETWEEN expr K_AND expr

 | ( ( K_NOT )? K_EXISTS )? '(' select_stmt ')'
 | K_CASE expr? ( K_WHEN expr K_THEN expr )+ ( K_ELSE expr )? K_END
 | raise_function

  */
;

foreign_key_clause
 : K_REFERENCES ( database_name '.' )? foreign_table ( '(' fk_target_column_name ( ',' fk_target_column_name )* ')' )?
   ( ( K_ON ( K_DELETE | K_UPDATE ) ( K_SET K_NULL
                                    | K_SET K_DEFAULT
                                    | K_CASCADE
                                    | K_RESTRICT
                                    | K_NO K_ACTION )
     | K_MATCH name
     )
   )*
   ( K_NOT? K_DEFERRABLE ( K_INITIALLY K_DEFERRED | K_INITIALLY K_IMMEDIATE )? K_ENABLE? )?
 ;

fk_target_column_name
 : name
 ;
/*
raise_function
 : K_RAISE '(' ( K_IGNORE
               | ( K_ROLLBACK | K_ABORT | K_FAIL ) ',' error_message )
           ')'
 ;
*/
indexed_column
 : column_name ( K_COLLATE collation_name )? ( K_ASC | K_DESC )?
 ;

table_constraint
 : ( K_CONSTRAINT name )?
   ( table_constraint_primary_key
   | table_constraint_key
   | table_constraint_unique
   | K_CHECK '(' expr ')'
   | table_constraint_foreign_key
   )
 ;

table_constraint_primary_key
 //: K_PRIMARY K_KEY '(' indexed_column ( ',' indexed_column )* ')' conflict_clause
 : K_PRIMARY K_KEY '(' indexed_column ( ',' indexed_column )* ')'
 ;

table_constraint_foreign_key
 : K_FOREIGN K_KEY '(' fk_origin_column_name ( ',' fk_origin_column_name )* ')' foreign_key_clause
 ;

table_constraint_unique
// : K_UNIQUE K_KEY? name? '(' indexed_column ( ',' indexed_column )* ')' conflict_clause
 : K_UNIQUE K_KEY? name? '(' indexed_column ( ',' indexed_column )* ')'
 ;

table_constraint_key
 //: K_KEY name? '(' indexed_column ( ',' indexed_column )* ')' conflict_clause
 : K_KEY name? '(' indexed_column ( ',' indexed_column )* ')'
 ;

fk_origin_column_name
 : column_name
 ;
/*
with_clause
 : K_WITH K_RECURSIVE? cte_table_name K_AS '(' select_stmt ')' ( ',' cte_table_name K_AS '(' select_stmt ')' )*
 ;
*/
qualified_table_name
 : ( database_name '.' )? table_name ( K_INDEXED K_BY index_name
                                     | K_NOT K_INDEXED )?
 ;

ordering_term
 : expr ( K_COLLATE collation_name )? ( K_ASC | K_DESC )?
 ;

pragma_value
 : signed_number
 | name
 | STRING_LITERAL
 ;

common_table_expression
 : table_name ( '(' column_name ( ',' column_name )* ')' )? K_AS '(' select_stmt ')'
 ;

result_column
 : STAR
 | table_name '.' '*'
 | expr ( K_AS? column_alias )?
 ;

table_or_subquery
 : ( database_name '.' )? table_name ( K_AS? table_alias )?
   ( K_INDEXED K_BY index_name
   | K_NOT K_INDEXED )?
 | '(' ( table_or_subquery ( ',' table_or_subquery )*
       | join_clause )
   ')' ( K_AS? table_alias )?
 | '(' select_stmt ')' ( K_AS? table_alias )?
 ;

join_clause
 : table_or_subquery ( join_operator table_or_subquery join_constraint )*
// : table_or_subquery ( join_operator table_or_subquery  )*
 ;


join_operator
 :
  ','
 //| K_NATURAL? ( K_LEFT K_OUTER? | K_INNER | K_CROSS )? K_JOIN
   |  ( K_LEFT K_OUTER? | K_INNER  | K_RIGHT)? K_JOIN
 ;

join_constraint
 //: ( K_ON expr
  // | K_USING '(' column_name ( ',' column_name )* ')' )?
  : ( K_ON expr)?
 ;

select_core
 : K_SELECT ( K_DISTINCT | K_ALL )? result_column ( ',' result_column )*
   ( K_FROM ( table_or_subquery ( ',' table_or_subquery )* | join_clause ) )?
   ( K_WHERE expr )?
   ( K_GROUP K_BY expr ( ',' expr )* ( K_HAVING expr )? )?
 | K_VALUES '(' expr ( ',' expr )* ')' ( ',' '(' expr ( ',' expr )* ')' )*
 ;
/*
compound_operator
 : K_UNION
 | K_UNION K_ALL
 | K_INTERSECT
 | K_EXCEPT
 ;
*/

cte_table_name
 : table_name ( '(' column_name ( ',' column_name )* ')' )?
 ;

signed_number
 : ( ( '+' | '-' )? NUMERIC_LITERAL | '*' )
 ;

literal_value
 : NUMERIC_LITERAL
 | STRING_LITERAL
 | BLOB_LITERAL
 | K_NULL
 | K_CURRENT_TIME
 | K_CURRENT_DATE
 | K_CURRENT_TIMESTAMP
 ;

unary_operator
 : '-'
 | '+'
 | '~'
 | K_NOT
 ;

error_message
 : STRING_LITERAL
 ;

module_argument // TODO check what exactly is permitted here
 : expr
 | column_def
 ;

column_alias
 : IDENTIFIER
 | STRING_LITERAL
 ;


keyword
 : K_ABORT
 | K_ACTION
 | K_ADD
 | K_AFTER
 | K_ALL
 | K_ALTER
 | K_ANALYZE
 | K_AND
 | K_AS
 | K_ASC
 | K_ATTACH
 | K_AUTOINCREMENT
 | K_BEFORE
 | K_BEGIN
 | K_BETWEEN
 | K_BY
 | K_CASCADE
 | K_CASE
 | K_CAST
 | K_CHECK
 | K_COLLATE
 | K_COLUMN
 | K_COMMIT
 | K_CONFLICT
 | K_CONSTRAINT
 | K_CREATE
 | K_CROSS
 | K_CURRENT_DATE
 | K_CURRENT_TIME
 | K_CURRENT_TIMESTAMP
 | K_DATABASE
 | K_DEFAULT
 | K_DEFERRABLE
 | K_DEFERRED
 | K_DELETE
 | K_DESC
 | K_DETACH
 | K_DISTINCT
 | K_DROP
 | K_EACH
 | K_ELSE
 | K_END
 | K_ENABLE
 | K_ESCAPE
 | K_EXCEPT
 | K_EXCLUSIVE
 | K_EXISTS
 | K_EXPLAIN
 | K_FAIL
 | K_FOR
 | K_FOREIGN
 | K_FROM
 | K_FULL
 | K_GLOB
 | K_GROUP
 | K_HAVING
 | K_IF
 | K_IGNORE
 | K_IMMEDIATE
 | K_IN
 | K_INDEX
 | K_INDEXED
 | K_INITIALLY
 | K_INNER
 | K_INSERT
 | K_INSTEAD
 | K_INTERSECT
 | K_INTO
 | K_IS
 | K_ISNULL
 | K_JOIN
 | K_KEY
 | K_LEFT
 | K_LIKE
 | K_LIMIT
 | K_MATCH
 | K_NATURAL
 | K_NO
 | K_NOT
 | K_NOTNULL
 | K_NULL
 | K_OF
 | K_OFFSET
 | K_ON
 | K_OR
 | K_ORDER
 | K_OUTER
 | K_PLAN
 | K_PRAGMA
 | K_PRIMARY
 | K_QUERY
 | K_RAISE
 | K_RECURSIVE
 | K_REFERENCES
 | K_REGEXP
 | K_REINDEX
 | K_RELEASE
 | K_RENAME
 | K_REPLACE
 | K_RESTRICT
 | K_RIGHT
 | K_ROLLBACK
 | K_ROW
 | K_SAVEPOINT
 | K_SELECT
 | K_SET
 | K_TABLE
 | K_TEMP
 | K_TEMPORARY
 | K_THEN
 | K_TO
 | K_TRANSACTION
 | K_TRIGGER
 | K_UNION
 | K_UNIQUE
 | K_UPDATE
 | K_USING
 | K_VACUUM
 | K_VALUES
 | K_VIEW
 | K_VIRTUAL
 | K_WHEN
 | K_WHERE
 | K_WITH
 | K_WITHOUT
 | K_NEXTVAL

  | K_WHILE
  | K_SWITCH
  | K_BREAK
  |K_DO
  |K_FUNCTION
  |K_RETURN
 ;

// TODO check all names below

//[a-zA-Z_0-9\t \-\[\]\=]+
unknown
 : .+
 ;

name
 : any_name
 ;

function_name
 : any_name
 ;

database_name
 : any_name
 ;

source_table_name
 : any_name
 ;

table_name
 : any_name
 ;

table_or_index_name
 : any_name
 ;

new_table_name
 : any_name
 ;

column_name
 : any_name
 ;

collation_name
 : any_name
 ;

foreign_table
 : any_name
 ;

index_name
 : any_name
 ;

trigger_name
 : any_name
 ;

view_name
 : any_name
 ;

module_name
 : any_name
 ;

pragma_name
 : any_name
 ;

savepoint_name
 : any_name
 ;

table_alias
 : any_name
 ;

transaction_name
 : any_name
 ;

any_name
 : IDENTIFIER
 | keyword
 | STRING_LITERAL
 | '(' any_name ')'
 ;

SCOL : ';';
DOT : '.';
OPEN_PAR : '(';
OPEN_ARRAY: '[';
CLOSE_ARRAY: ']';
CLOSE_PAR : ')';
COMMA : ',';
ASSIGN : '=';
STAR : '*';
PLUS : '+';
MINUS : '-';
TILDE : '~';
PIPE2 : '||';
DIV : '/';
MOD : '%';
LT2 : '<<';
GT2 : '>>';
AMP : '&';
PIPE : '|';
LT : '<';
LT_EQ : '<=';
GT : '>';
GT_EQ : '>=';
EQ : '==';
NOT_EQ1 : '!=';
NOT_EQ2 : '<>';
QM : '?';
DD : ':';


// http://www.sqlite.org/lang_keywords.html
K_ABORT : A B O R T;
K_ACTION : A C T I O N;
K_ADD : A D D;
K_AFTER : A F T E R;
K_ALL : A L L;
K_ALTER : A L T E R;
K_ANALYZE : A N A L Y Z E;
K_AND : A N D;
K_AS : A S;
K_ASC : A S C;
K_ATTACH : A T T A C H;
K_AUTOINCREMENT : A U T O I N C R E M E N T;
K_BEFORE : B E F O R E;
K_BEGIN : B E G I N;
K_BETWEEN : B E T W E E N;
K_BY : B Y;
K_CASCADE : C A S C A D E;
K_CASE : C A S E;
K_CONTINUE : C O N T I N U E;
K_CAST : C A S T;
K_CHECK : C H E C K;
K_COLLATE : C O L L A T E;
K_COLUMN : C O L U M N;
K_COMMIT : C O M M I T;
K_CONFLICT : C O N F L I C T;
K_CONSTRAINT : C O N S T R A I N T;
K_CREATE : C R E A T E;
K_CROSS : C R O S S;
K_CURRENT_DATE : C U R R E N T '_' D A T E;
K_CURRENT_TIME : C U R R E N T '_' T I M E;
K_CURRENT_TIMESTAMP : C U R R E N T '_' T I M E S T A M P;
K_DATABASE : D A T A B A S E;
K_DEFAULT : D E F A U L T;
K_DEFERRABLE : D E F E R R A B L E;
K_DEFERRED : D E F E R R E D;
K_DELETE : D E L E T E;
K_DESC : D E S C;
K_DETACH : D E T A C H;
K_DISTINCT : D I S T I N C T;
K_DROP : D R O P;
K_EACH : E A C H;
K_ELSE : E L S E;
K_END : E N D;
K_ENABLE : E N A B L E;
K_ESCAPE : E S C A P E;
K_EXCEPT : E X C E P T;
K_EXCLUSIVE : E X C L U S I V E;
K_EXISTS : E X I S T S;
K_EXPLAIN : E X P L A I N;
K_FAIL : F A I L;
K_FOR : F O R;
K_FOREIGN : F O R E I G N;
K_FROM : F R O M;
K_FULL : F U L L;
K_GLOB : G L O B;
K_GROUP : G R O U P;
K_HAVING : H A V I N G;
K_IF : I F;
K_IGNORE : I G N O R E;
K_IMMEDIATE : I M M E D I A T E;
K_IN : I N;
K_INDEX : I N D E X;
K_INDEXED : I N D E X E D;
K_INITIALLY : I N I T I A L L Y;
K_INNER : I N N E R;
K_INSERT : I N S E R T;
K_INSTEAD : I N S T E A D;
K_INTERSECT : I N T E R S E C T;
K_INTO : I N T O;
K_IS : I S;
K_ISNULL : I S N U L L;
K_JOIN : J O I N;
K_KEY : K E Y;
K_LEFT : L E F T;
K_LIKE : L I K E;
K_LIMIT : L I M I T;
K_MATCH : M A T C H;
K_NATURAL : N A T U R A L;
K_NEXTVAL : N E X T V A L;
K_NO : N O;
K_NOT : N O T;
K_NOTNULL : N O T N U L L;
K_NULL : N U L L;
K_OF : O F;
K_OFFSET : O F F S E T;
K_ON : O N;
K_ONLY : O N L Y;
K_OR : O R;
K_ORDER : O R D E R;
K_OUTER : O U T E R;
K_PLAN : P L A N;
K_PRAGMA : P R A G M A;
K_PRIMARY : P R I M A R Y;
K_QUERY : Q U E R Y;
K_RAISE : R A I S E;
K_RECURSIVE : R E C U R S I V E;
K_REFERENCES : R E F E R E N C E S;
K_REGEXP : R E G E X P;
K_REINDEX : R E I N D E X;
K_RELEASE : R E L E A S E;
K_RENAME : R E N A M E;
K_REPLACE : R E P L A C E;
K_RESTRICT : R E S T R I C T;
K_RIGHT : R I G H T;
K_ROLLBACK : R O L L B A C K;
K_ROW : R O W;
K_SAVEPOINT : S A V E P O I N T;
K_SELECT : S E L E C T;
K_SET : S E T;
K_TABLE : T A B L E;
K_TEMP : T E M P;
K_TEMPORARY : T E M P O R A R Y;
K_THEN : T H E N;
K_TO : T O;
K_TRANSACTION : T R A N S A C T I O N;
K_TRIGGER : T R I G G E R;
K_UNION : U N I O N;
K_UNIQUE : U N I Q U E;
K_UPDATE : U P D A T E;
K_USING : U S I N G;
K_VACUUM : V A C U U M;
K_VALUES : V A L U E S;
K_VIEW : V I E W;
K_VIRTUAL : V I R T U A L;
K_WHEN : W H E N;
K_WHERE : W H E R E;
K_WITH : W I T H;
K_WITHOUT : W I T H O U T;
K_VAR: V A R ;
K_FOREACH: F O R E A C H ;
K_RETURN: R E T U R N ;
K_ARRAY : A R R A Y;

K_WHILE : W H I L E;
K_SWITCH : S W I T C H;
K_BREAK : B R E A K;
K_DO: D O;
K_FUNCTION: F U N C T I O N;
K_PRINT: P R I N T;

K_TRUE: T R U E ;
K_FALSE : F A L S E ;

K_TYPE : T Y P E ;
K_PATH : P A T H ;
K_STRING : S T R I N G ;
K_BOOLEAN : B O O L E A N ;
K_number : N U M B E R ;

K_CSV : C S V ;
K_JSON : J S O N ;


IDENTIFIER
 : '"' (~'"' | '""')* '"'
 | '`' (~'`' | '``')* '`'
 /* | '[' ~']'* ']'  */
 | [a-zA-Z_] [a-zA-Z_0-9]* // TODO check: needs more chars in set
 ;
IDENTIFIER1
 : '"' (~'"' | '""')* '"'
  [a-zA-Z_] [a-zA-Z_0-9]*
;
NUMERIC_LITERAL
 : DIGIT+ ( '.' DIGIT* )? ( E [-+]? DIGIT+ )?
 | '.' DIGIT+ ( E [-+]? DIGIT+ )?
 ;

BIND_PARAMETER
 : '?' DIGIT*
 | [:@$] IDENTIFIER
 ;

STRING_LITERAL
 : '\'' ( ~'\'' | '\'\'' )* '\''
 ;

BLOB_LITERAL
 : X STRING_LITERAL
 ;
/*
SINGLE_LINE_COMMENT
 : '--' ~[\r\n]* -> channel(HIDDEN)
 ;*/

MULTILINE_COMMENT
 : '/*' .*? ( '*/' | EOF ) -> channel(HIDDEN)
 ;

SPACES
 : [ \u000B\t\r\n] -> channel(HIDDEN)
 ;

UNEXPECTED_CHAR
 : .
 ;

fragment DIGIT : [0-9];

fragment A : [aA];
fragment B : [bB];
fragment C : [cC];
fragment D : [dD];
fragment E : [eE];
fragment F : [fF];
fragment G : [gG];
fragment H : [hH];
fragment I : [iI];
fragment J : [jJ];
fragment K : [kK];
fragment L : [lL];
fragment M : [mM];
fragment N : [nN];
fragment O : [oO];
fragment P : [pP];
fragment Q : [qQ];
fragment R : [rR];
fragment S : [sS];
fragment T : [tT];
fragment U : [uU];
fragment V : [vV];
fragment W : [wW];
fragment X : [xX];
fragment Y : [yY];
fragment Z : [zZ];
