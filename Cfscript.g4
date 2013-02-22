grammar Cfscript;

component
	: 'component' '{' componentBody '}'
	;

componentBody
	: componentElement (componentElement)*
	;

componentElement
	: statement
	| functionDeclaration
	;

functionDeclaration
	: Identifier 'function' Identifier '()' '{' functionBody '}'
	;

functionBody
	: statement (statement)*
	;

statement
	: variableStatement
	| nonVarVariableStatement
	| expression
	;

variableStatement
	: 'var' variableName '=' expression ';'
	;

nonVarVariableStatement
	: variableName '=' expression ';'
	;

expression
	: '[' .*? ']' 
	| '{' .*? '}'
	| 'true' 
	| 'false'
	| Identifier
	;

variableName
	: Identifier
	;

Identifier
	: [a-zA-Z0-9]+
	;

WS
	: [ \t\r\n]+ -> skip 
	;