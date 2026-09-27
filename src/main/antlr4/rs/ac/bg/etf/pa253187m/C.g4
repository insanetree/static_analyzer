grammar C;

program
    : statement* EOF
    ;

statement
    : 'int' IDENTIFIER '=' INTEGER ';'
    ;
    
IDENTIFIER
    : [a-zA-Z_] [a-zA-Z0-9_]*
    ;

INTEGER
    : [0-9]+
    ;

WS
    : [ \t\r\n]+ -> skip
    ;