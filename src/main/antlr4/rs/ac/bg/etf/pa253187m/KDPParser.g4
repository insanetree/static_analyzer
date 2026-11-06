parser grammar KDPParser;

options { tokenVocab=KDPLexer; }

compilationUnit
  : translationUnit? EOF
  ;

translationUnit
  : externalDeclaration+
  ;

externalDeclaration
  : processDefinition
  | resourceDeclaration
  ;

processDefinition
  : PROCESS ID LBRACE statementList? RBRACE
  ;

statementList
  : statement+
  ;

statement
  : functionCall SEMI
  ;

functionCall
  : designator LPAREN argumentList? RPAREN
  ;

argumentList
  : argument (COMMA argument)*
  ;

argument
  : expression
  ;

expression
  : MINUS? term (addOp term)*
  ;

term
  : factor (mulOp factor)*
  ;

factor
  : designator
  | functionCall
  | INT
  ;

resourceDeclaration
  : typeId resourceId SEMI
  ;

designator
  : ID
  ;

typeId
  : ID
  ;

resourceId
  : ID
  ;

addOp
  : PLUS
  | MINUS
  ;

mulOp
  : ASTERISK
  | DIV
  | MOD
  ;