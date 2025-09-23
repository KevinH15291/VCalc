grammar VCalc;

file: statement* EOF;

statement
        :   decl    ';' 
        |   assign  ';' 
        |   if      ';' 
        |   loop    ';' 
        |   print   ';' 
        ;

expr    :   domain                      # Domain_e   
        |   expr '[' expr ']'           # Index_e
        |   expr '..' expr              # Range_e
        |   expr op=('*'|'/'|'%') expr  # MulDivMod_e
        |   expr op=('+'|'-') expr      # AddSub_e
        |   expr op=('<'|'>') expr      # Comp_e
        |   expr op=('=='|'!=') expr    # Equality_e
        |   '(' expr ')'                # Parens_e
        |   INT                         # Int_e
        |   ID                          # ID_e
        ;

domain  :   generator                   
        |   filter                      
        ;

generator
        :   '['ID 'in' expr '|' expr ']' ;
filter  :   '[' ID 'in' expr '&' expr ']' ;

if      :   'if' '(' expr ')' statement* 'fi' ;
loop    :   'loop' '(' expr ')' statement* 'pool' ;
decl    :   type=ID assign ;
assign  :   ID '=' expr ;
print   :   'print' '(' expr ')' ;


PAR     :   '(' ')' ;
MUL     :   '*' ; 
DIV     :   '/' ;
REM     :   '%' ;
ADD     :   '+' ;
SUB     :   '-' ;
GE      :   '>' ;
LE      :   '<' ;
EE      :   '==' ;
NE      :   '!=' ;

IN_KW   : 'in' ;       
IF_KW   : 'if' ;       
FI_KW   : 'fi' ;
INT_KW  : 'int' ;
PRINT_KW: 'print' ;
POOL_KW : 'pool' ;
LOOP_KW : 'loop' ;


ID      :   [a-zA-Z][a-zA-Z0-9]* ; 
INT     :   [0-9]+ ;

WS      : [ \t\r\n]+ -> skip ;
LINE_COMMENT: '//' .*? ('\n' | EOF) -> skip ;
