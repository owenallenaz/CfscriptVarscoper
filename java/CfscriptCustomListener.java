import java.util.HashMap;

public class CfscriptCustomListener extends CfscriptBaseListener {
	public HashMap<String, ComponentFunction> functions;
	private String currentFunction;

	public CfscriptCustomListener() {
		functions = new HashMap<String, ComponentFunction>();
	}

	@Override 
	public void enterArgumentDefinition(CfscriptParser.ArgumentDefinitionContext ctx) {
		String varName = ctx.argumentName().Identifier().getText();
		if (!functions.get(currentFunction).varred.containsKey(varName)) {
			functions.get(currentFunction).varred.put(varName, true);
		}
	}

	@Override
	public void enterVariableStatement(CfscriptParser.VariableStatementContext ctx) {
		if (currentFunction == null) {
			return;
		}
		
		String varName = ctx.variableName().Identifier().getText();
		if (!functions.get(currentFunction).varred.containsKey(varName)) {
			functions.get(currentFunction).varred.put(varName, true);
		}
	}

	@Override
	public void enterNonVarVariableStatement(CfscriptParser.NonVarVariableStatementContext ctx) {
		if (currentFunction == null) {
			return;
		}

		String varName = ctx.variableName().Identifier().getText();
		if (!functions.get(currentFunction).varred.containsKey(varName)) {
			functions.get(currentFunction).unvarred.put(varName, true);
		}
	}

	@Override
	public void enterFunctionDeclaration(CfscriptParser.FunctionDeclarationContext ctx) {
		String functionName = ctx.functionName().getText();
		currentFunction = functionName;
		ComponentFunction function = new ComponentFunction(functionName);
		functions.put(functionName, function);
	}
	
	@Override
	public void exitFunctionDeclaration(CfscriptParser.FunctionDeclarationContext ctx) {
		currentFunction = null;
	}

	public boolean hasUnvarred() {
		for(String i : functions.keySet()) {
			if (functions.get(i).hasUnvarred()) {
				return true;
			}
		}
		
		return false;
	}
}