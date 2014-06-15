grammar SimpleDartWithArrays;

options { 
    language = Java;
}

/*
 * Parser rules
 */
compilationUnit : (functionDeclaration | globalVariableDeclaration)*;

globalVariableDeclaration : variableDeclarationStatement;

// function definitions
functionDeclaration : typeIdentifier IDENT functionParameters functionBody;

functionParameters : LPAREN variableList? RPAREN;

functionBody : block;

// blocks and statements
block: LCURLY blockStatement* RCURLY;

blockStatement : variableDeclarationStatement | statement;

statement 
    : block
    | assignment SEMICOLON
    | expression? SEMICOLON
    | IF parExpression statement (ELSE statement)?
    | forStatement
    | WHILE parExpression statement
    | jumpStatement;

assignment : IDENT arrayIdent? EQUAL expression;

forStatement : FOR LPAREN forControl RPAREN statement;

forControl : forInit? SEMICOLON logicalOr? SEMICOLON forUpdate?;

forInit : variableDeclaration;

forUpdate : assignment;

parExpression : LPAREN logicalOr RPAREN;

jumpStatement 
    : ( continueSt=CONTINUE 
      | breakSt=BREAK 
      | returnSt=RETURN expression?
      ) SEMICOLON;

arrayInitializer : LSQUARE expressionList RSQUARE; 

expression : ariphExpression;

funcCall : IDENT LPAREN expressionList? RPAREN;

logicalOr : logicalAnd (OR logicalAnd)?;
logicalAnd : relationalExpr (AND relationalExpr)?;
relationalExpr
    : id=(TRUE | FALSE)
    | NOT relationalExpr
    | ariphExpression relOp=(EE | NE | GE | LE | LESS | MORE) ariphExpression
    | LPAREN logicalOr RPAREN;

simpleExpression 
    : ident=IDENT arrayIdent?
    | newExpr=LPAREN expression RPAREN
    | funcCall;

arrayIdent : LSQUARE NUM_INT RSQUARE;

expressionList : expression (COMMA expression)*;

// types and variables
variableList : variable (COMMA variable)*;

typeIdentifier : VOID | INT | LIST;

variableType : LIST | INT;

variable : variableType IDENT;

variableDeclarationStatement : variableDeclaration SEMICOLON;

variableDeclaration : variableType variableDeclarators;
 
variableDeclarators : variableDeclarator (COMMA variableDeclarator)*;

variableDeclarator : IDENT (EQUAL variableInitializer)?;

variableInitializer : arrayInitializer | expression;

// ariphmetic expressions
ariphExpression :  ariphExpression sign=(PLUS | MINUS) ariphTerm | ariphTerm;
ariphTerm : ariphTerm sign=(STAR | SLASH) ariphFactor | ariphFactor;
ariphFactor : num=NUM_INT | unary=MINUS ariphFactor | simpleExpression;

/*
 * Lexer rules
 */
VOID    : 'void';
INT     : 'int';
LIST    : 'List';
RETURN  : 'return';
LCURLY  : '{';
RCURLY  : '}';
LPAREN  : '(';
RPAREN  : ')';
LSQUARE : '[';
RSQUARE : ']';
EQUAL   : '=';
PLUS    : '+';
MINUS   : '-';
STAR    : '*';
SLASH   : '/';
COMMA   : ',';
LE      : '<=';
GE      : '>=';
EE      : '==';
NE      : '!=';
LESS    : '<';
MORE    : '>';
NOT     : '!';
TRUE    : 'true';
FALSE   : 'false';
OR      : '||';
AND     : '&&';
IF      : 'if';
ELSE    : 'else';
FOR     : 'for';
WHILE   : 'while';
BREAK   : 'break';
CONTINUE: 'continue';
SEMICOLON : ';';
DOT     : '.';
NUM_INT : ('0'..'9')+;
IDENT   : LITERAL (LITERAL | NUM_INT | '_')*;
LITERAL : 'a'..'z' | 'A'..'Z';
WS      : [ \n\t\r]+ -> skip;