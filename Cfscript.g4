grammar Cfscript;

component
	: 'component' keyValue* '{' componentBody '}'
	;

componentBody
	: (componentElement)*
	;

componentElement
	: functionDeclaration
	| propertyDeclaration
	| statement
	;

propertyDeclaration
	: 'property' Identifier ';'
	| 'property' keyValue* ';'
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
	| returnStatement
	| ifStatement
	| forStatement
	| whileStatement
	| saveContentStatement
	;

saveContentStatement
	: 'savecontent' 'variable' '=' quotedVariableName '{' functionBody '}'
	;

variableStatement
	: 'var' variableName ('&'|'+')? '=' expression ';'
	;

nonVarVariableStatement
	: variableName ('&'|'+')? '=' expression ';'
	;

returnStatement
	: 'return' expression ';'
	;

ifStatement
	: 'if' '(' expression ')' '{' functionBody '}' ('else' ifStatement)* ('else' '{' functionBody '}')?
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
	| expression ('<' | '>' | '<=' | '>=' | 'gt' | 'gte' | 'lt' | 'lte') expression
	| expression ('!=' | '==' | 'eq' | 'neq' | 'is' | 'is' 'not') expression
	| expression ('&' | 'and') expression
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
	| '[' expression ']'
	| ArrayIndex
	| ('()' | '(' methodArgument (',' methodArgument)* ')' )
	;

methodCall
	: Identifier ('()' | '(' methodArgument (',' methodArgument)* ')' )
	;

methodArgument
	: Identifier '=' expression
	| expression
	;

quotedVariableName
	: StringLiteral
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
	: '"' (~('\\'|'"'))* '"'
	;

ArrayIndex
	: '[' [1-9] [0-9]* ']'
	| '[' StringLiteral ']'
	;

Identifier
	: [a-zA-Z0-9_]+
	;

WS
	: [ \t\r\n]+ -> skip 
	;

COMMENT
	:	( '//' ~[\r\n]* '\r'? '\n' | '/*' .*? '*/' ) -> channel(HIDDEN)
	;