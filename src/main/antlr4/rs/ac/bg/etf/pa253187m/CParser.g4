parser grammar CParser;

options { tokenVocab=CLexer; }

compilationUnit
  : translationUnit? EOF
  ;

translationUnit
  : externalDeclaration+
  ;

externalDeclaration
  : functionDefinition
  ;

functionDefinition
  : typeId funcId LPAREN RPAREN LBRACE RBRACE
  ;

typeId
  : ID
  ;

funcId
  : ID
  ;
