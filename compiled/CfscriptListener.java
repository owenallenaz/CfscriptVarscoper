// Generated from Cfscript.g4 by ANTLR 4.0
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;

public interface CfscriptListener extends ParseTreeListener {
	void enterObjectLiteral(CfscriptParser.ObjectLiteralContext ctx);
	void exitObjectLiteral(CfscriptParser.ObjectLiteralContext ctx);

	void enterQuotedVariableName(CfscriptParser.QuotedVariableNameContext ctx);
	void exitQuotedVariableName(CfscriptParser.QuotedVariableNameContext ctx);

	void enterExpression(CfscriptParser.ExpressionContext ctx);
	void exitExpression(CfscriptParser.ExpressionContext ctx);

	void enterArrayLiteral(CfscriptParser.ArrayLiteralContext ctx);
	void exitArrayLiteral(CfscriptParser.ArrayLiteralContext ctx);

	void enterVariableStatement(CfscriptParser.VariableStatementContext ctx);
	void exitVariableStatement(CfscriptParser.VariableStatementContext ctx);

	void enterForStatement(CfscriptParser.ForStatementContext ctx);
	void exitForStatement(CfscriptParser.ForStatementContext ctx);

	void enterVariableName(CfscriptParser.VariableNameContext ctx);
	void exitVariableName(CfscriptParser.VariableNameContext ctx);

	void enterMethodCall(CfscriptParser.MethodCallContext ctx);
	void exitMethodCall(CfscriptParser.MethodCallContext ctx);

	void enterExpressionStatement(CfscriptParser.ExpressionStatementContext ctx);
	void exitExpressionStatement(CfscriptParser.ExpressionStatementContext ctx);

	void enterPropertyDeclaration(CfscriptParser.PropertyDeclarationContext ctx);
	void exitPropertyDeclaration(CfscriptParser.PropertyDeclarationContext ctx);

	void enterVariableSuffix(CfscriptParser.VariableSuffixContext ctx);
	void exitVariableSuffix(CfscriptParser.VariableSuffixContext ctx);

	void enterReturnStatement(CfscriptParser.ReturnStatementContext ctx);
	void exitReturnStatement(CfscriptParser.ReturnStatementContext ctx);

	void enterNonVarVariableStatement(CfscriptParser.NonVarVariableStatementContext ctx);
	void exitNonVarVariableStatement(CfscriptParser.NonVarVariableStatementContext ctx);

	void enterComponent(CfscriptParser.ComponentContext ctx);
	void exitComponent(CfscriptParser.ComponentContext ctx);

	void enterArgumentName(CfscriptParser.ArgumentNameContext ctx);
	void exitArgumentName(CfscriptParser.ArgumentNameContext ctx);

	void enterSaveContentStatement(CfscriptParser.SaveContentStatementContext ctx);
	void exitSaveContentStatement(CfscriptParser.SaveContentStatementContext ctx);

	void enterFunctionBody(CfscriptParser.FunctionBodyContext ctx);
	void exitFunctionBody(CfscriptParser.FunctionBodyContext ctx);

	void enterArgumentsDefinition(CfscriptParser.ArgumentsDefinitionContext ctx);
	void exitArgumentsDefinition(CfscriptParser.ArgumentsDefinitionContext ctx);

	void enterComponentElement(CfscriptParser.ComponentElementContext ctx);
	void exitComponentElement(CfscriptParser.ComponentElementContext ctx);

	void enterIfStatement(CfscriptParser.IfStatementContext ctx);
	void exitIfStatement(CfscriptParser.IfStatementContext ctx);

	void enterStatement(CfscriptParser.StatementContext ctx);
	void exitStatement(CfscriptParser.StatementContext ctx);

	void enterExpressionItemSuffix(CfscriptParser.ExpressionItemSuffixContext ctx);
	void exitExpressionItemSuffix(CfscriptParser.ExpressionItemSuffixContext ctx);

	void enterArgumentDefinition(CfscriptParser.ArgumentDefinitionContext ctx);
	void exitArgumentDefinition(CfscriptParser.ArgumentDefinitionContext ctx);

	void enterWhileStatement(CfscriptParser.WhileStatementContext ctx);
	void exitWhileStatement(CfscriptParser.WhileStatementContext ctx);

	void enterExpressionItem(CfscriptParser.ExpressionItemContext ctx);
	void exitExpressionItem(CfscriptParser.ExpressionItemContext ctx);

	void enterFunctionDeclaration(CfscriptParser.FunctionDeclarationContext ctx);
	void exitFunctionDeclaration(CfscriptParser.FunctionDeclarationContext ctx);

	void enterFunctionName(CfscriptParser.FunctionNameContext ctx);
	void exitFunctionName(CfscriptParser.FunctionNameContext ctx);

	void enterComponentBody(CfscriptParser.ComponentBodyContext ctx);
	void exitComponentBody(CfscriptParser.ComponentBodyContext ctx);

	void enterKeyValue(CfscriptParser.KeyValueContext ctx);
	void exitKeyValue(CfscriptParser.KeyValueContext ctx);

	void enterMethodArgument(CfscriptParser.MethodArgumentContext ctx);
	void exitMethodArgument(CfscriptParser.MethodArgumentContext ctx);
}