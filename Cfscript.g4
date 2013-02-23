grammar Cfscript;

component
	: 'component' '{' componentBody '}'
	;

componentBody
	: (componentElement)*
	;

componentElement
	: statement
	| functionDeclaration
	;

functionDeclaration
	: Identifier 'function' Identifier '()' '{' functionBody '}'
	;

functionBody
	: (statement)*
	;

statement
	: variableStatement
	| nonVarVariableStatement
	| expressionStatement
	;

variableStatement
	: 'var' variableName '=' expression ';'
	;

nonVarVariableStatement
	: variableName '=' expression ';'
	;

expressionStatement
	: expression ';'
	;

expression
	: methodCall
	| arrayLiteral
	| objectLiteral
	| StringLiteral
	| 'true' 
	| 'false'
	| Identifier
	;

methodCall
	: Identifier ('()' | '(' expression (',' expression)* ')' )
	;

variableName
	: Identifier
	;

arrayLiteral
	: '[' expression (',' expression)* ']'
	;

objectLiteral
	: '{' (Identifier '=' expression (',' Identifier '=' expression)*)? '}'
	;

StringLiteral
    :  '"' (~('\\'|'"'))* '"'
    ;

Identifier
	: [a-zA-Z0-9]+
	;

WS
	: [ \t\r\n]+ -> skip 
	;