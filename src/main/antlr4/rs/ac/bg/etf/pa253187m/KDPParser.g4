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
  : PROCESS LBRACE RBRACE
  ;

resourceDeclaration
  : typeId resourceId SEMI
  ;

typeId
  : ID
  ;

resourceId
  : ID
  ;
