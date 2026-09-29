lexer grammar CLexer;

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
COMMA: ',';
INCREMENT: '++';
PLUS: '+';
DECREMENT: '--';
MINUS: '-';
ASTERISK: '*';
DIV: '/';
QMARK: '?';
COLON: ':';

ID: [_a-zA-Z][_a-zA-Z0-9]*;
INT: [0-9]
   | [1-9][0-9]+
   | '0'[0-7][0-7]*
   | ('0x'|'0X')[0-9a-fA-F]
   ;
WS: [ \t\r\n]+ -> skip;
