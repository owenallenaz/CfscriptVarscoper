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
	: assignmentExpression
	| arrayLiteral
	| objectLiteral
	| StringLiteral
	| incrementExpression
	| decrementExpression
	| 'true' 
	| 'false'
	| Identifier
	;

incrementExpression
	: variableName '++'
	;

decrementExpression
	: variableName '--'
	;

assignmentExpression
	: Identifier (assignmentExpressionSuffix)*
	| assignmentExpression (('+'|'-'|'/'|'*') assignmentExpression)+
	;

assignmentExpressionSuffix
	: '.' assignmentExpression
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