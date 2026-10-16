lexer grammar KDPLexer;

LINE_COMMENT: '//' ~[\r\n]* -> skip;
BLOCK_COMMENT: '/*' .*? '*/' -> skip;

// Simple tokens and operators
SEMI: ';';
DOT: '.';
LPAREN: '(';
RPAREN: ')';
LBRACKET: '[';
RBRACKET: ']';
LBRACE: '{';
RBRACE: '}';
ASSIGN: '=';
EQ: '==';
NEQ: '!=';
GT: '>';
GE: '>=';
LT: '<';
LE: '<=';
AND: '&&';
OR: '||';
COMMA: ',';
INCREMENT: '++';
PLUS: '+';
DECREMENT: '--';
MINUS: '-';
ASTERISK: '*';
DIV: '/';
MOD: '%';
QMARK: '?';
COLON: ':';

// Keywords
PROGRAM: 'program';
PROCESS: 'process';
CONST: 'const';
ENUM: 'enum';
CLASS: 'class';
ABSTRACT: 'abstract';
EXTENDS: 'extends';
IF: 'if';
ELSE: 'else';
BREAK: 'break';
CONTINUE: 'continue';
RETURN: 'return';
READ: 'read';
PRINT: 'print';
SWITCH: 'switch';
CASE: 'case';
FOR: 'for';
NEW: 'new';
LENGTH: 'length';
VOID: 'void';

ID: [_a-zA-Z][_a-zA-Z0-9]*;
INT: [0-9]
   | [1-9][0-9]+
   | '0'[0-7][0-7]*
   | ('0x'|'0X')[0-9a-fA-F]
   ;
WS: [ \t\r\n]+ -> skip;
