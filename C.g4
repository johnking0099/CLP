grammar C;

/*******************************************************************
 *                              TOKENS                             *
 *******************************************************************/
IDENTIFIER : IDENTIFIER_NONDIGIT (IDENTIFIER_NONDIGIT|DIGIT)* ;

fragment
IDENTIFIER_NONDIGIT : [_a-zA-Z]
                    | UNICODE_CHAR
                    ;

fragment
UNICODE_CHAR : '\\u' HEX_QUAD
             | '\\U' HEX_QUAD HEX_QUAD
             ;

fragment
HEX_QUAD : HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT ;

fragment
DIGIT : [0-9] ;

fragment
OCT_DIGIT : [0-7] ;

fragment
HEX_DIGIT : [0-9a-fA-F] ;

/*******************
 * INTEGER_LITERAL *
 *******************/
INTEGER_LITERAL : DEC_LITERAL INT_SUFFIX?
                | OCT_LITERAL INT_SUFFIX?
                | HEX_LITERAL INT_SUFFIX?
                ;

fragment
DEC_LITERAL : [1-9][0-9]* ;

fragment
OCT_LITERAL : '0'[0-7]* ;

fragment
HEX_LITERAL : '0'[xX][0-9a-fA-F]+ ;

fragment
INT_SUFFIX : [uU] [lL]?
           | [uU] ('ll'|'LL')?
           | [lL] [uU]?
           | ('ll'|'LL') [uU]?
           ;

/********************
 * FLOATING_LITERAL *
 ********************/
FLOATING_LITERAL : FRACTIONAL_CONSTANT EXPONENT_PART? FLOATING_SUFFIX?
                 | DIGIT_SEQUENCE EXPONENT_PART FLOATING_SUFFIX?
                 ;

fragment
FRACTIONAL_CONSTANT : DIGIT_SEQUENCE? '.' DIGIT_SEQUENCE
                    | DIGIT_SEQUENCE '.'
                    ;

fragment
EXPONENT_PART : [eE] [+-]? DIGIT_SEQUENCE ;

fragment
DIGIT_SEQUENCE : DIGIT+ ;

fragment
FLOATING_SUFFIX : [flFL] ;

/*********************
 * CHARACTER_LITERAL *
 *********************/
CHARACTER_LITERAL : [uUL]? '\'' C_CHAR_SEQUENCE '\'' ;

fragment
C_CHAR_SEQUENCE : C_CHAR+ ;

fragment
C_CHAR : ~['\\\n]
       | ESCAPE_SEQUENCE
       | UNICODE_CHAR
       ;

fragment
ESCAPE_SEQUENCE : SIMPLE_ESCAPE_CHAR
                | OCT_ESCAPE_CHAR
                | HEX_ESCAPE_SEQUENCE
                ;

fragment
SIMPLE_ESCAPE_CHAR : '\\\\'
                   | '\\\''
                   | '\\"'
                   | '\\?'
                   | '\\a'
                   | '\\b'
                   | '\\f'
                   | '\\n'
                   | '\\r'
                   | '\\t'
                   | '\\v'
                   ;

fragment
OCT_ESCAPE_CHAR : '\\' OCT_DIGIT
                | '\\' OCT_DIGIT OCT_DIGIT
                | '\\' OCT_DIGIT OCT_DIGIT OCT_DIGIT
                ;

fragment
HEX_ESCAPE_SEQUENCE : '\\x' HEX_DIGIT+ ;

/******************
 * STRING_LITERAL *
 ******************/
STRING_LITERAL : ('u8'|[uUL])? '"' S_CHAR_SEQUENCE? '"'
               | ('u8'|[uUL])? 'R' RAW_STRING
               ;

fragment
S_CHAR_SEQUENCE : S_CHAR+ ;

fragment
S_CHAR : ~["\\\n]
       | ESCAPE_SEQUENCE
       | UNICODE_CHAR
       ;

fragment
RAW_STRING : '"' D_CHAR_SEQUENCE? '(' R_CHAR_SEQUENCE? ')' D_CHAR_SEQUENCE? '"' ;

fragment
R_CHAR_SEQUENCE : R_CHAR+ ;

fragment
R_CHAR : ~[\n] ;

fragment
D_CHAR_SEQUENCE : D_CHAR+ ;

fragment
D_CHAR : ~[ ()\\\t\v\f\n] ;

/*******************
 * BOOLEAN_LITERAL *
 *******************/
BOOLEAN_LITERAL : 'false'
                | 'true'
                ;

/*******************
 * POINTER_LITERAL *
 *******************/
POINTER_LITERAL : 'nullptr' ;

/****************
 * UDEF_LITERAL *
 ****************/
UDEF_LITERAL : UDEF_INTEGER_LITERAL
             | UDEF_FLOATING_LITERAL
             | UDEF_CHARACTER_LITERAL
             | UDEF_STRING_LITERAL
             ;

fragment
UDEF_INTEGER_LITERAL : DEC_LITERAL UDEF_SUFFIX
                     | OCT_LITERAL UDEF_SUFFIX
                     | HEX_LITERAL UDEF_SUFFIX
                     ;

fragment
UDEF_FLOATING_LITERAL : FRACTIONAL_CONSTANT EXPONENT_PART? UDEF_SUFFIX
                      | DIGIT_SEQUENCE EXPONENT_PART UDEF_SUFFIX
                      ;

fragment
UDEF_CHARACTER_LITERAL : CHARACTER_LITERAL UDEF_SUFFIX ;

fragment
UDEF_STRING_LITERAL : STRING_LITERAL UDEF_SUFFIX ;

fragment
UDEF_SUFFIX : IDENTIFIER ;

/*****************
 * TO BE SKIPPED *
 *****************/
WS : [ \t\r\n]+ -> skip ;

COMMENT : '/*'.*?'*/' -> skip ;

COMMENT2 : '//'.*?'\n' -> skip ;

/* EO-Tokens */

/*******************************************************************
 *                            CONSTANTS                            *
 *******************************************************************/
constant : integer_constant
         | character_constant
         | floating_constant
         | enumeration_constant
         ;

integer_constant : INTEGER_LITERAL ;

character_constant : CHARACTER_LITERAL ;

floating_constant : FLOATING_LITERAL ;

enumeration_constant : IDENTIFIER ;

/*******************************************************************
 *                          DECLARATIONS                           *
 *******************************************************************/
declaration_specifier : storage_specifier
                      | type_specifier
                      | type_qualifier
                      | 'typedef'
                      ;

storage_specifier : 'auto' | 'register' | 'static' | 'extern' ;

declarator : pointer? direct_declarator ;

pointer : '*' type_qualifier* pointer? ;

direct_declarator : IDENTIFIER
                  | '(' declarator ')' /*this rule can cauze comfliction with function call with one parameter*/
                  | direct_declarator '[' constant_expression? ']'
                  | direct_declarator '(' parameter_type_list? ')'
//                  | direct_declarator '(' IDENTIFIER* ')'
                  ;

parameter_type_list : parameter_list
                    | parameter_list ',' '...'
                    ;

parameter_list : parameter_declaration
               | parameter_list ',' parameter_declaration
               ;

parameter_declaration : declaration_specifier+ declarator
                      | declaration_specifier+ abstract_declarator
                      | declaration_specifier+
                      ;

abstract_declarator : pointer direct_abstract_declarator
                    | pointer
                    | direct_abstract_declarator
                    ;

direct_abstract_declarator : '(' abstract_declarator ')'
                           | direct_abstract_declarator '[' constant_expression? ']'
                           | '[' constant_expression? ']'
                           | direct_abstract_declarator '(' parameter_type_list? ')'
                           | '(' parameter_type_list? ')'
                           ;

declaration : declaration_specifier+ init_declarator_list? ;

init_declarator_list : init_declarator
                     | init_declarator_list ',' init_declarator
                     ;

init_declarator : declarator
                | declarator '=' initializer
                ;

initializer : assignment_expression
            | '{' initializer_list ','? '}'
            ;

initializer_list : initializer
                 | initializer_list ',' initializer
                 ;

/*******************************************************************
 *                             TYPES                               *
 *******************************************************************/
type_specifier : 'void' | 'float' | 'double'
               | ('signed'|'unsigned')? ('char'|'short'|'int'|'long')
               | struct_or_union_specifier
               | enum_specifier
               | typedef_name
               ;

type_qualifier : 'const' | 'volatile' ;

struct_or_union_specifier : struct_or_union IDENTIFIER '{' struct_declaration_statement+ '}'
                          | struct_or_union IDENTIFIER
                          | struct_or_union '{' struct_declaration_statement+ '}'
                          ;

struct_or_union : 'struct' | 'union' ;

struct_declaration_statement : struct_declaration ';' ;

struct_declaration : (type_specifier|type_qualifier)* struct_declarator_list ;

struct_declarator_list : struct_declarator
                       | struct_declarator_list ',' struct_declarator
                       ;

struct_declarator : declarator
                  | declarator ':' constant_expression
                  | ':' constant_expression
                  ;

enum_specifier : 'enum' IDENTIFIER '{' enumerator_list '}'
               | 'enum' IDENTIFIER
               | 'enum' '{' enumerator_list '}'
               ;

enumerator_list : enumerator
                | enumerator_list ',' enumerator
                ;

enumerator : IDENTIFIER
           | IDENTIFIER '=' constant_expression
           ;

typedef_name : IDENTIFIER ;

/*******************************************************************
 *                          EXPRESSIONS                            *
 *******************************************************************/
constant_expression : conditional_expression ;

conditional_expression : logical_or_expression
                       | logical_or_expression '?' expression ':' conditional_expression
                       ;

logical_or_expression : logical_and_expression
                      | logical_or_expression '||' logical_and_expression
                      ;

logical_and_expression : inclusive_or_expression
                       | logical_and_expression '&&' inclusive_or_expression
                       ;

inclusive_or_expression : exclusive_or_expression
                        | inclusive_or_expression '|' exclusive_or_expression
                        ;

exclusive_or_expression : and_expression
                        | exclusive_or_expression '^' and_expression
                        ;

and_expression : equality_expression
               | and_expression '&' equality_expression
               ;

equality_expression : relational_expression
                    | equality_expression ('=='|'!=') relational_expression
                    ;

relational_expression : shift_expression
                      | relational_expression ('<'|'<='|'>'|'>=') shift_expression
                      ;

shift_expression : additive_expression
                 | shift_expression ('<<'|'>>') additive_expression
                 ;

additive_expression : multiplicative_expression
                    | additive_expression ('+'|'-') multiplicative_expression
                    ;

multiplicative_expression : cast_expression
                          | multiplicative_expression ('*'|'/'|'%') cast_expression
                          ;

cast_expression : unary_expression
                | '(' type_name ')' cast_expression
                ;

type_name : (type_specifier|type_qualifier)+ abstract_declarator? ;

unary_expression : postfix_expression
                 | ('++'|'--') unary_expression
                 | 'sizeof' (unary_expression|type_name)
                 | 'sizeof' '(' (unary_expression|type_name) ')'
                 | ('&'|'*'|'+'|'-'|'~'|'!') cast_expression
                 ;

postfix_expression : primary_expression
                   | postfix_expression '[' expression ']'
                   | postfix_expression '(' assignment_expression_list? ')'
                   | postfix_expression ('.'|'->') IDENTIFIER
                   | postfix_expression ('++'|'--')
                   ;

primary_expression : IDENTIFIER | constant | STRING_LITERAL
                   | '(' expression ')'
                   ;

expression : assignment_expression
           | expression ',' assignment_expression
           ;

assignment_expression : conditional_expression
                      | unary_expression
                            ('='|'*='|'/='|'%='|'+='|'-='|'<<='|'>>='|'&='|'^='|'|=')
                            assignment_expression
                      ;

assignment_expression_list : assignment_expression
                           | assignment_expression_list ',' assignment_expression
                           ;

/*******************************************************************
 *                           STATEMENTS                            *
 *******************************************************************/
compound_statement : '{' statement* '}' ;

statement : labeled_statement
          | expression_statement
          | compound_statement
          | selection_statement
          | iteration_statement
          | jump_statement
          | declaration_statement
          ;

labeled_statement : IDENTIFIER ':' statement
                  | 'case' constant_expression ':' statement
                  | 'default' ':' statement
                  ;

declaration_statement : declaration? ';' ;

expression_statement : expression? ';' ;

selection_statement : 'if' '(' expression ')' statement
                    | 'if' '(' expression ')' statement 'else' statement
                    | 'switch' '(' expression ')' statement
                    ;

iteration_statement : 'while' '(' expression ')' statement
                    | 'do' statement 'while' '(' expression ')'
                    | 'for' '(' expression? ';' expression? ';' expression? ')' statement
                    ;

jump_statement : 'goto' IDENTIFIER ';'
               | 'continue' ';'
               | 'break' ';'
               | 'return' expression? ';'
               ;

/*******************************************************************
 *                         ENTERANCE                               *
 *******************************************************************/
translation_unit : external_declaration* ;

external_declaration : declaration_statement
                     | function_definition
                     ;

function_definition : declaration_specifier* declarator declaration*
                          compound_statement
                    ;

entrance : translation_unit;
/*EOF*/
