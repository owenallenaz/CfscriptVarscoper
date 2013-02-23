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
	| expression
	;

variableStatement
	: 'var' Identifier '=' expression ';'
	;

nonVarVariableStatement
	: variableName '=' expression ';'
	;

expression
	: '[' .*? ']'
	| '{' .*? '}'
	| '"' .*? '"'
	| 'true' 
	| 'false'
	| variableName
	;

variableName
	: Identifier
	;

Identifier
	: [a-z]+
	;

WS
	: [ \t\r\n]+ -> skip 
	;