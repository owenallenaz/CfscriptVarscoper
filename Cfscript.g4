grammar Cfscript;

component
	: 'component' keyValue* '{' componentBody '}'
	;

componentBody
	: (componentElement)*
	;

componentElement
	: statement
	| functionDeclaration
	;

functionDeclaration
	: Identifier? Identifier? 'function' functionName argumentsDefinition '{' functionBody '}'
	;

functionName
	: Identifier
	;

argumentsDefinition
	: '(' argumentDefinition (',' argumentDefinition)* ')'
	| '()'
	;

argumentDefinition
	: Identifier? Identifier? argumentName ('=' expression)?
	; 

argumentName
	: Identifier
	;

functionBody
	: (statement)*
	;

statement
	: variableStatement
	| nonVarVariableStatement
	| expressionStatement
	| ifStatement
	| forStatement
	| whileStatement
	;

variableStatement
	: 'var' variableName '=' expression ';'
	;

nonVarVariableStatement
	: variableName '=' expression ';'
	;

ifStatement
	: 'if' '(' expression ')' '{' functionBody '}'
	;

forStatement
	: 'for' '(' ( variableStatement | nonVarVariableStatement ) expression ';' expression ')' '{' functionBody '}'
	;

whileStatement
	: 'while' '(' expression ')' '{' functionBody '}'
	;

expressionStatement
	: expression ';'
	;

expression
	: '(' expression ')'
	| expression ('*' | '/' | '%') expression
	| expression ('+' | '-') expression
	| expression ('<<' | '>>') expression
	| expression ('<' | '>' | '<=' | '>=') expression
	| expression ('!=' | '==') expression
	| expression '&' expression
	| expression '^' expression
	| expression '|' expression
	| expression '&&' expression
	| expression '||' expression
	| expression '?' expression ':' expression
	| expression '++'
	| expression '--'
	| '!' expression
	| arrayLiteral
	| objectLiteral
	| StringLiteral
	| 'true'
	| 'false'
	| expressionItem
	;

expressionItem
	: Identifier (expressionItemSuffix)*
	;

expressionItemSuffix
	: '.' expressionItem
	| ArrayIndex
	| ('()' | '(' expression (',' expression)* ')' )
	;

methodCall
	: Identifier ('()' | '(' expression (',' expression)* ')' )
	;

variableName
	: Identifier (variableSuffix)*
	;

variableSuffix
	: ArrayIndex
	| '.' variableName
	;

arrayLiteral
	: '[' expression (',' expression)* ']'
	;

objectLiteral
	: '{' (Identifier '=' expression (',' Identifier '=' expression)*)? '}'
	;

keyValue
	: Identifier '=' StringLiteral
	;

StringLiteral
    :  '"' (~('\\'|'"'))* '"'
    ;

 ArrayIndex
 	: '[' [1-9] [0-9]* ']'
 	| '[' StringLiteral ']'
 	;

Identifier
	: [a-zA-Z0-9]+
	;

WS
	: [ \t\r\n]+ -> skip 
	;

COMMENT 
	: '/*' .*? '*/'  -> skip
	;