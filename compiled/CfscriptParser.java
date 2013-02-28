// Generated from Cfscript.g4 by ANTLR 4.0
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CfscriptParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__41=1, T__40=2, T__39=3, T__38=4, T__37=5, T__36=6, T__35=7, T__34=8, 
		T__33=9, T__32=10, T__31=11, T__30=12, T__29=13, T__28=14, T__27=15, T__26=16, 
		T__25=17, T__24=18, T__23=19, T__22=20, T__21=21, T__20=22, T__19=23, 
		T__18=24, T__17=25, T__16=26, T__15=27, T__14=28, T__13=29, T__12=30, 
		T__11=31, T__10=32, T__9=33, T__8=34, T__7=35, T__6=36, T__5=37, T__4=38, 
		T__3=39, T__2=40, T__1=41, T__0=42, StringLiteral=43, ArrayIndex=44, Identifier=45, 
		WS=46, COMMENT=47;
	public static final String[] tokenNames = {
		"<INVALID>", "'component'", "']'", "'&'", "'()'", "','", "'-'", "'*'", 
		"'while'", "'['", "'('", "':'", "'if'", "'<'", "'--'", "'false'", "'!='", 
		"'<='", "'var'", "'?'", "'<<'", "'{'", "'}'", "'true'", "'++'", "'>>'", 
		"'%'", "'^'", "'function'", "')'", "'.'", "'+'", "'for'", "'='", "';'", 
		"'&&'", "'||'", "'>'", "'/'", "'=='", "'>='", "'|'", "'!'", "StringLiteral", 
		"ArrayIndex", "Identifier", "WS", "COMMENT"
	};
	public static final int
		RULE_component = 0, RULE_componentBody = 1, RULE_componentElement = 2, 
		RULE_functionDeclaration = 3, RULE_functionName = 4, RULE_argumentsDefinition = 5, 
		RULE_argumentDefinition = 6, RULE_argumentName = 7, RULE_functionBody = 8, 
		RULE_statement = 9, RULE_variableStatement = 10, RULE_nonVarVariableStatement = 11, 
		RULE_ifStatement = 12, RULE_forStatement = 13, RULE_whileStatement = 14, 
		RULE_expressionStatement = 15, RULE_expression = 16, RULE_expressionItem = 17, 
		RULE_expressionItemSuffix = 18, RULE_methodCall = 19, RULE_variableName = 20, 
		RULE_variableSuffix = 21, RULE_arrayLiteral = 22, RULE_objectLiteral = 23, 
		RULE_keyValue = 24;
	public static final String[] ruleNames = {
		"component", "componentBody", "componentElement", "functionDeclaration", 
		"functionName", "argumentsDefinition", "argumentDefinition", "argumentName", 
		"functionBody", "statement", "variableStatement", "nonVarVariableStatement", 
		"ifStatement", "forStatement", "whileStatement", "expressionStatement", 
		"expression", "expressionItem", "expressionItemSuffix", "methodCall", 
		"variableName", "variableSuffix", "arrayLiteral", "objectLiteral", "keyValue"
	};

	@Override
	public String getGrammarFileName() { return "Cfscript.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public CfscriptParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ComponentContext extends ParserRuleContext {
		public KeyValueContext keyValue(int i) {
			return getRuleContext(KeyValueContext.class,i);
		}
		public ComponentBodyContext componentBody() {
			return getRuleContext(ComponentBodyContext.class,0);
		}
		public List<KeyValueContext> keyValue() {
			return getRuleContexts(KeyValueContext.class);
		}
		public ComponentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_component; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CfscriptListener ) ((CfscriptListener)listener).enterComponent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CfscriptListener ) ((CfscriptListener)listener).exitComponent(this);
		}
	}

	public final ComponentContext component() throws RecognitionException {
		ComponentContext _localctx = new ComponentContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_component);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50); match(1);
			setState(54);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Identifier) {
				{
				{
				setState(51); keyValue();
				}
				}
				setState(56);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(57); match(21);
			setState(58); componentBody();
			setState(59); match(22);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComponentBodyContext extends ParserRuleContext {
		public ComponentElementContext componentElement(int i) {
			return getRuleContext(ComponentElementContext.class,i);
		}
		public List<ComponentElementContext> componentElement() {
			return getRuleContexts(ComponentElementContext.class);
		}
		public ComponentBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_componentBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CfscriptListener ) ((CfscriptListener)listener).enterComponentBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CfscriptListener ) ((CfscriptListener)listener).exitComponentBody(this);
		}
	}

	public final ComponentBodyContext componentBody() throws RecognitionException {
		ComponentBodyContext _localctx = new ComponentBodyContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_componentBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 8) | (1L << 9) | (1L << 10) | (1L << 12) | (1L << 15) | (1L << 18) | (1L << 21) | (1L << 23) | (1L << 28) | (1L << 32) | (1L << 42) | (1L << StringLiteral) | (1L << Identifier))) != 0)) {
				{
				{
				setState(61); componentElement();
				}
				}
				setState(66);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComponentElementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public ComponentElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_componentElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CfscriptListener ) ((CfscriptListener)listener).enterComponentElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CfscriptListener ) ((CfscriptListener)listener).exitComponentElement(this);
		}
	}

	public final ComponentElementContext componentElement() throws RecognitionException {
		ComponentElementContext _localctx = new ComponentElementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_componentElement);
		try {
			setState(69);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(67); statement();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(68); functionDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionDeclarationContext extends ParserRuleContext {
		public TerminalNode Identifier(int i) {
			return getToken(CfscriptParser.Identifier, i);
		}
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public ArgumentsDefinitionContext argumentsDefinition() {
			return getRuleContext(ArgumentsDefinitionContext.class,0);
		}
		public List<TerminalNode> Identifier() { return getTokens(CfscriptParser.Identifier); }
		public FunctionNameContext functionName() {
			return getRuleContext(FunctionNameContext.class,0);
		}
		public FunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CfscriptListener ) ((CfscriptListener)listener).enterFunctionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CfscriptListener ) ((CfscriptListener)listener).exitFunctionDeclaration(this);
		}
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_functionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(71); match(Identifier);
				}
				break;
			}
			setState(75);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(74); match(Identifier);
				}
			}

			setState(77); match(28);
			setState(78); functionName();
			setState(79); argumentsDefinition();
			setState(80); match(21);
			setState(81); functionBody();
			setState(82); match(22);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(CfscriptParser.Identifier, 0); }
		public FunctionNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CfscriptListener ) ((CfscriptListener)listener).enterFunctionName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CfscriptListener ) ((CfscriptListener)listener).exitFunctionName(this);
		}
	}

	public final FunctionNameContext functionName() throws RecognitionException {
		FunctionNameContext _localctx = new FunctionNameContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_functionName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84); match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentsDefinitionContext extends ParserRuleContext {
		public ArgumentDefinitionContext argumentDefinition(int i) {
			return getRuleContext(ArgumentDefinitionContext.class,i);
		}
		public List<ArgumentDefinitionContext> argumentDefinition() {
			return getRuleContexts(ArgumentDefinitionContext.class);
		}
		public ArgumentsDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentsDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CfscriptListener ) ((CfscriptListener)listener).enterArgumentsDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CfscriptListener ) ((CfscriptListener)listener).exitArgumentsDefinition(this);
		}
	}

	public final ArgumentsDefinitionContext argumentsDefinition() throws RecognitionException {
		ArgumentsDefinitionContext _localctx = new ArgumentsDefinitionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_argumentsDefinition);
		int _la;
		try {
			setState(98);
			switch (_input.LA(1)) {
			case 10:
				enterOuterAlt(_localctx, 1);
				{
				setState(86); match(10);
				setState(87); argumentDefinition();
				setState(92);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==5) {
					{
					{
					setState(88); match(5);
					setState(89); argumentDefinition();
					}
					}
					setState(94);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(95); match(29);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 2);
				{
				setState(97); match(4);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentDefinitionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Identifier(int i) {
			return getToken(CfscriptParser.Identifier, i);
		}
		public ArgumentNameContext argumentName() {
			return getRuleContext(ArgumentNameContext.class,0);
		}
		public List<TerminalNode> Identifier() { return getTokens(CfscriptParser.Identifier); }
		public ArgumentDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CfscriptListener ) ((CfscriptListener)listener).enterArgumentDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CfscriptListener ) ((CfscriptListener)listener).exitArgumentDefinition(this);
		}
	}

	public final ArgumentDefinitionContext argumentDefinition() throws RecognitionException {
		ArgumentDefinitionContext _localctx = new ArgumentDefinitionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_argumentDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(100); match(Identifier);
				}
				break;
			}
			setState(104);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(103); match(Identifier);
				}
				break;
			}
			setState(106); argumentName();
			setState(109);
			_la = _input.LA(1);
			if (_la==33) {
				{
				setState(107); match(33);
				setState(108); expression(0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(CfscriptParser.Identifier, 0); }
		public ArgumentNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CfscriptListener ) ((CfscriptListener)listener).enterArgumentName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CfscriptListener ) ((CfscriptListener)listener).exitArgumentName(this);
		}
	}

	public final ArgumentNameContext argumentName() throws RecognitionException {
		ArgumentNameContext _localctx = new ArgumentNameContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_argumentName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111); match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionBodyContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public FunctionBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CfscriptListener ) ((CfscriptListener)listener).enterFunctionBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CfscriptListener ) ((CfscriptListener)listener).exitFunctionBody(this);
		}
	}

	public final FunctionBodyContext functionBody() throws RecognitionException {
		FunctionBodyContext _localctx = new FunctionBodyContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_functionBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 8) | (1L << 9) | (1L << 10) | (1L << 12) | (1L << 15) | (1L << 18) | (1L << 21) | (1L << 23) | (1L << 32) | (1L << 42) | (1L << StringLiteral) | (1L << Identifier))) != 0)) {
				{
				{
				setState(113); statement();
				}
				}
				setState(118);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public NonVarVariableStatementContext nonVarVariableStatement() {
			return getRuleContext(NonVarVariableStatementContext.class,0);
		}
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public VariableStatementContext variableStatement() {
			return getRuleContext(VariableStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CfscriptListener ) ((CfscriptListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CfscriptListener ) ((CfscriptListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_statement);
		try {
			setState(125);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(119); variableStatement();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(120); nonVarVariableStatement();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(121); expressionStatement();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(122); ifStatement();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(123); forStatement();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(124); whileStatement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableNameContext variableName() {
			return getRuleContext(VariableNameContext.class,0);
		}
		public VariableStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CfscriptListener ) ((CfscriptListener)listener).enterVariableStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CfscriptListener ) ((CfscriptListener)listener).exitVariableStatement(this);
		}
	}

	public final VariableStatementContext variableStatement() throws RecognitionException {
		VariableStatementContext _localctx = new VariableStatementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_variableStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127); match(18);
			setState(128); variableName();
			setState(129); match(33);
			setState(130); expression(0);
			setState(131); match(34);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NonVarVariableStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableNameContext variableName() {
			return getRuleContext(VariableNameContext.class,0);
		}
		public NonVarVariableStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonVarVariableStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CfscriptListener ) ((CfscriptListener)listener).enterNonVarVariableStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CfscriptListener ) ((CfscriptListener)listener).exitNonVarVariableStatement(this);
		}
	}

	public final NonVarVariableStatementContext nonVarVariableStatement() throws RecognitionException {
		NonVarVariableStatementContext _localctx = new NonVarVariableStatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_nonVarVariableStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133); variableName();
			setState(134); match(33);
			setState(135); expression(0);
			setState(136); match(34);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CfscriptListener ) ((CfscriptListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CfscriptListener ) ((CfscriptListener)listener).exitIfStatement(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138); match(12);
			setState(139); match(10);
			setState(140); expression(0);
			setState(141); match(29);
			setState(142); match(21);
			setState(143); functionBody();
			setState(144); match(22);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForStatementContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public NonVarVariableStatementContext nonVarVariableStatement() {
			return getRuleContext(NonVarVariableStatementContext.class,0);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public VariableStatementContext variableStatement() {
			return getRuleContext(VariableStatementContext.class,0);
		}
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CfscriptListener ) ((CfscriptListener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CfscriptListener ) ((CfscriptListener)listener).exitForStatement(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_forStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146); match(32);
			setState(147); match(10);
			setState(150);
			switch (_input.LA(1)) {
			case 18:
				{
				setState(148); variableStatement();
				}
				break;
			case Identifier:
				{
				setState(149); nonVarVariableStatement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(152); expression(0);
			setState(153); match(34);
			setState(154); expression(0);
			setState(155); match(29);
			setState(156); match(21);
			setState(157); functionBody();
			setState(158); match(22);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhileStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CfscriptListener ) ((CfscriptListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CfscriptListener ) ((CfscriptListener)listener).exitWhileStatement(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160); match(8);
			setState(161); match(10);
			setState(162); expression(0);
			setState(163); match(29);
			setState(164); match(21);
			setState(165); functionBody();
			setState(166); match(22);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CfscriptListener ) ((CfscriptListener)listener).enterExpressionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CfscriptListener ) ((CfscriptListener)listener).exitExpressionStatement(this);
		}
	}

	public final ExpressionStatementContext expressionStatement() throws RecognitionException {
		ExpressionStatementContext _localctx = new ExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_expressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168); expression(0);
			setState(169); match(34);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public int _p;
		public TerminalNode StringLiteral() { return getToken(CfscriptParser.StringLiteral, 0); }
		public ObjectLiteralContext objectLiteral() {
			return getRuleContext(ObjectLiteralContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ArrayLiteralContext arrayLiteral() {
			return getRuleContext(ArrayLiteralContext.class,0);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExpressionItemContext expressionItem() {
			return getRuleContext(ExpressionItemContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ExpressionContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CfscriptListener ) ((CfscriptListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CfscriptListener ) ((CfscriptListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState, _p);
		ExpressionContext _prevctx = _localctx;
		int _startState = 32;
		enterRecursionRule(_localctx, RULE_expression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			switch (_input.LA(1)) {
			case 42:
				{
				setState(172); match(42);
				setState(173); expression(7);
				}
				break;
			case 10:
				{
				setState(174); match(10);
				setState(175); expression(0);
				setState(176); match(29);
				}
				break;
			case 9:
				{
				setState(178); arrayLiteral();
				}
				break;
			case 21:
				{
				setState(179); objectLiteral();
				}
				break;
			case StringLiteral:
				{
				setState(180); match(StringLiteral);
				}
				break;
			case 23:
				{
				setState(181); match(23);
				}
				break;
			case 15:
				{
				setState(182); match(15);
				}
				break;
			case Identifier:
				{
				setState(183); expressionItem();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(228);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(226);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(186);
						if (!(20 >= _localctx._p)) throw new FailedPredicateException(this, "20 >= $_p");
						setState(187);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 7) | (1L << 26) | (1L << 38))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(188); expression(21);
						}
						break;

					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(189);
						if (!(19 >= _localctx._p)) throw new FailedPredicateException(this, "19 >= $_p");
						setState(190);
						_la = _input.LA(1);
						if ( !(_la==6 || _la==31) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(191); expression(20);
						}
						break;

					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(192);
						if (!(18 >= _localctx._p)) throw new FailedPredicateException(this, "18 >= $_p");
						setState(193);
						_la = _input.LA(1);
						if ( !(_la==20 || _la==25) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(194); expression(19);
						}
						break;

					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(195);
						if (!(17 >= _localctx._p)) throw new FailedPredicateException(this, "17 >= $_p");
						setState(196);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 13) | (1L << 17) | (1L << 37) | (1L << 40))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(197); expression(18);
						}
						break;

					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(198);
						if (!(16 >= _localctx._p)) throw new FailedPredicateException(this, "16 >= $_p");
						setState(199);
						_la = _input.LA(1);
						if ( !(_la==16 || _la==39) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(200); expression(17);
						}
						break;

					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(201);
						if (!(15 >= _localctx._p)) throw new FailedPredicateException(this, "15 >= $_p");
						setState(202); match(3);
						setState(203); expression(16);
						}
						break;

					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(204);
						if (!(14 >= _localctx._p)) throw new FailedPredicateException(this, "14 >= $_p");
						setState(205); match(27);
						setState(206); expression(15);
						}
						break;

					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(207);
						if (!(13 >= _localctx._p)) throw new FailedPredicateException(this, "13 >= $_p");
						setState(208); match(41);
						setState(209); expression(14);
						}
						break;

					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(210);
						if (!(12 >= _localctx._p)) throw new FailedPredicateException(this, "12 >= $_p");
						setState(211); match(35);
						setState(212); expression(13);
						}
						break;

					case 10:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(213);
						if (!(11 >= _localctx._p)) throw new FailedPredicateException(this, "11 >= $_p");
						setState(214); match(36);
						setState(215); expression(12);
						}
						break;

					case 11:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(216);
						if (!(10 >= _localctx._p)) throw new FailedPredicateException(this, "10 >= $_p");
						setState(217); match(19);
						setState(218); expression(0);
						setState(219); match(11);
						setState(220); expression(11);
						}
						break;

					case 12:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(222);
						if (!(9 >= _localctx._p)) throw new FailedPredicateException(this, "9 >= $_p");
						setState(223); match(24);
						}
						break;

					case 13:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(224);
						if (!(8 >= _localctx._p)) throw new FailedPredicateException(this, "8 >= $_p");
						setState(225); match(14);
						}
						break;
					}
					} 
				}
				setState(230);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ExpressionItemContext extends ParserRuleContext {
		public List<ExpressionItemSuffixContext> expressionItemSuffix() {
			return getRuleContexts(ExpressionItemSuffixContext.class);
		}
		public ExpressionItemSuffixContext expressionItemSuffix(int i) {
			return getRuleContext(ExpressionItemSuffixContext.class,i);
		}
		public TerminalNode Identifier() { return getToken(CfscriptParser.Identifier, 0); }
		public ExpressionItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CfscriptListener ) ((CfscriptListener)listener).enterExpressionItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CfscriptListener ) ((CfscriptListener)listener).exitExpressionItem(this);
		}
	}

	public final ExpressionItemContext expressionItem() throws RecognitionException {
		ExpressionItemContext _localctx = new ExpressionItemContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_expressionItem);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(231); match(Identifier);
			setState(235);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(232); expressionItemSuffix();
					}
					} 
				}
				setState(237);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionItemSuffixContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExpressionItemContext expressionItem() {
			return getRuleContext(ExpressionItemContext.class,0);
		}
		public TerminalNode ArrayIndex() { return getToken(CfscriptParser.ArrayIndex, 0); }
		public ExpressionItemSuffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionItemSuffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CfscriptListener ) ((CfscriptListener)listener).enterExpressionItemSuffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CfscriptListener ) ((CfscriptListener)listener).exitExpressionItemSuffix(this);
		}
	}

	public final ExpressionItemSuffixContext expressionItemSuffix() throws RecognitionException {
		ExpressionItemSuffixContext _localctx = new ExpressionItemSuffixContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_expressionItemSuffix);
		int _la;
		try {
			setState(255);
			switch (_input.LA(1)) {
			case 30:
				enterOuterAlt(_localctx, 1);
				{
				setState(238); match(30);
				setState(239); expressionItem();
				}
				break;
			case ArrayIndex:
				enterOuterAlt(_localctx, 2);
				{
				setState(240); match(ArrayIndex);
				}
				break;
			case 4:
			case 10:
				enterOuterAlt(_localctx, 3);
				{
				setState(253);
				switch (_input.LA(1)) {
				case 4:
					{
					setState(241); match(4);
					}
					break;
				case 10:
					{
					setState(242); match(10);
					setState(243); expression(0);
					setState(248);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==5) {
						{
						{
						setState(244); match(5);
						setState(245); expression(0);
						}
						}
						setState(250);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(251); match(29);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodCallContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode Identifier() { return getToken(CfscriptParser.Identifier, 0); }
		public MethodCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CfscriptListener ) ((CfscriptListener)listener).enterMethodCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CfscriptListener ) ((CfscriptListener)listener).exitMethodCall(this);
		}
	}

	public final MethodCallContext methodCall() throws RecognitionException {
		MethodCallContext _localctx = new MethodCallContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_methodCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257); match(Identifier);
			setState(270);
			switch (_input.LA(1)) {
			case 4:
				{
				setState(258); match(4);
				}
				break;
			case 10:
				{
				setState(259); match(10);
				setState(260); expression(0);
				setState(265);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==5) {
					{
					{
					setState(261); match(5);
					setState(262); expression(0);
					}
					}
					setState(267);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(268); match(29);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableNameContext extends ParserRuleContext {
		public VariableSuffixContext variableSuffix(int i) {
			return getRuleContext(VariableSuffixContext.class,i);
		}
		public List<VariableSuffixContext> variableSuffix() {
			return getRuleContexts(VariableSuffixContext.class);
		}
		public TerminalNode Identifier() { return getToken(CfscriptParser.Identifier, 0); }
		public VariableNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CfscriptListener ) ((CfscriptListener)listener).enterVariableName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CfscriptListener ) ((CfscriptListener)listener).exitVariableName(this);
		}
	}

	public final VariableNameContext variableName() throws RecognitionException {
		VariableNameContext _localctx = new VariableNameContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_variableName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(272); match(Identifier);
			setState(276);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(273); variableSuffix();
					}
					} 
				}
				setState(278);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableSuffixContext extends ParserRuleContext {
		public VariableNameContext variableName() {
			return getRuleContext(VariableNameContext.class,0);
		}
		public TerminalNode ArrayIndex() { return getToken(CfscriptParser.ArrayIndex, 0); }
		public VariableSuffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableSuffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CfscriptListener ) ((CfscriptListener)listener).enterVariableSuffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CfscriptListener ) ((CfscriptListener)listener).exitVariableSuffix(this);
		}
	}

	public final VariableSuffixContext variableSuffix() throws RecognitionException {
		VariableSuffixContext _localctx = new VariableSuffixContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_variableSuffix);
		try {
			setState(282);
			switch (_input.LA(1)) {
			case ArrayIndex:
				enterOuterAlt(_localctx, 1);
				{
				setState(279); match(ArrayIndex);
				}
				break;
			case 30:
				enterOuterAlt(_localctx, 2);
				{
				setState(280); match(30);
				setState(281); variableName();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayLiteralContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ArrayLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CfscriptListener ) ((CfscriptListener)listener).enterArrayLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CfscriptListener ) ((CfscriptListener)listener).exitArrayLiteral(this);
		}
	}

	public final ArrayLiteralContext arrayLiteral() throws RecognitionException {
		ArrayLiteralContext _localctx = new ArrayLiteralContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_arrayLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284); match(9);
			setState(285); expression(0);
			setState(290);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==5) {
				{
				{
				setState(286); match(5);
				setState(287); expression(0);
				}
				}
				setState(292);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(293); match(2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ObjectLiteralContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode Identifier(int i) {
			return getToken(CfscriptParser.Identifier, i);
		}
		public List<TerminalNode> Identifier() { return getTokens(CfscriptParser.Identifier); }
		public ObjectLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CfscriptListener ) ((CfscriptListener)listener).enterObjectLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CfscriptListener ) ((CfscriptListener)listener).exitObjectLiteral(this);
		}
	}

	public final ObjectLiteralContext objectLiteral() throws RecognitionException {
		ObjectLiteralContext _localctx = new ObjectLiteralContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_objectLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295); match(21);
			setState(308);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(296); match(Identifier);
				setState(297); match(33);
				setState(298); expression(0);
				setState(305);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==5) {
					{
					{
					setState(299); match(5);
					setState(300); match(Identifier);
					setState(301); match(33);
					setState(302); expression(0);
					}
					}
					setState(307);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(310); match(22);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KeyValueContext extends ParserRuleContext {
		public TerminalNode StringLiteral() { return getToken(CfscriptParser.StringLiteral, 0); }
		public TerminalNode Identifier() { return getToken(CfscriptParser.Identifier, 0); }
		public KeyValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CfscriptListener ) ((CfscriptListener)listener).enterKeyValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CfscriptListener ) ((CfscriptListener)listener).exitKeyValue(this);
		}
	}

	public final KeyValueContext keyValue() throws RecognitionException {
		KeyValueContext _localctx = new KeyValueContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_keyValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(312); match(Identifier);
			setState(313); match(33);
			setState(314); match(StringLiteral);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 16: return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return 20 >= _localctx._p;

		case 1: return 19 >= _localctx._p;

		case 2: return 18 >= _localctx._p;

		case 3: return 17 >= _localctx._p;

		case 4: return 16 >= _localctx._p;

		case 5: return 15 >= _localctx._p;

		case 6: return 14 >= _localctx._p;

		case 7: return 13 >= _localctx._p;

		case 8: return 12 >= _localctx._p;

		case 9: return 11 >= _localctx._p;

		case 10: return 10 >= _localctx._p;

		case 11: return 9 >= _localctx._p;

		case 12: return 8 >= _localctx._p;
		}
		return true;
	}

	public static final String _serializedATN =
		"\2\3\61\u013f\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b"+
		"\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t"+
		"\20\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t"+
		"\27\4\30\t\30\4\31\t\31\4\32\t\32\3\2\3\2\7\2\67\n\2\f\2\16\2:\13\2\3"+
		"\2\3\2\3\2\3\2\3\3\7\3A\n\3\f\3\16\3D\13\3\3\4\3\4\5\4H\n\4\3\5\5\5K\n"+
		"\5\3\5\5\5N\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\7"+
		"\7]\n\7\f\7\16\7`\13\7\3\7\3\7\3\7\5\7e\n\7\3\b\5\bh\n\b\3\b\5\bk\n\b"+
		"\3\b\3\b\3\b\5\bp\n\b\3\t\3\t\3\n\7\nu\n\n\f\n\16\nx\13\n\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\5\13\u0080\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r"+
		"\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\5"+
		"\17\u0099\n\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00bb\n\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u00e5\n\22\f\22\16\22\u00e8"+
		"\13\22\3\23\3\23\7\23\u00ec\n\23\f\23\16\23\u00ef\13\23\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\7\24\u00f9\n\24\f\24\16\24\u00fc\13\24\3\24"+
		"\3\24\5\24\u0100\n\24\5\24\u0102\n\24\3\25\3\25\3\25\3\25\3\25\3\25\7"+
		"\25\u010a\n\25\f\25\16\25\u010d\13\25\3\25\3\25\5\25\u0111\n\25\3\26\3"+
		"\26\7\26\u0115\n\26\f\26\16\26\u0118\13\26\3\27\3\27\3\27\5\27\u011d\n"+
		"\27\3\30\3\30\3\30\3\30\7\30\u0123\n\30\f\30\16\30\u0126\13\30\3\30\3"+
		"\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\7\31\u0132\n\31\f\31\16\31"+
		"\u0135\13\31\5\31\u0137\n\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\2\33\2"+
		"\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\2\7\5\t\t\34\34("+
		"(\4\b\b!!\4\26\26\33\33\6\17\17\23\23\'\'**\4\22\22))\u0156\2\64\3\2\2"+
		"\2\4B\3\2\2\2\6G\3\2\2\2\bJ\3\2\2\2\nV\3\2\2\2\fd\3\2\2\2\16g\3\2\2\2"+
		"\20q\3\2\2\2\22v\3\2\2\2\24\177\3\2\2\2\26\u0081\3\2\2\2\30\u0087\3\2"+
		"\2\2\32\u008c\3\2\2\2\34\u0094\3\2\2\2\36\u00a2\3\2\2\2 \u00aa\3\2\2\2"+
		"\"\u00ba\3\2\2\2$\u00e9\3\2\2\2&\u0101\3\2\2\2(\u0103\3\2\2\2*\u0112\3"+
		"\2\2\2,\u011c\3\2\2\2.\u011e\3\2\2\2\60\u0129\3\2\2\2\62\u013a\3\2\2\2"+
		"\648\7\3\2\2\65\67\5\62\32\2\66\65\3\2\2\2\67:\3\2\2\28\66\3\2\2\289\3"+
		"\2\2\29;\3\2\2\2:8\3\2\2\2;<\7\27\2\2<=\5\4\3\2=>\7\30\2\2>\3\3\2\2\2"+
		"?A\5\6\4\2@?\3\2\2\2AD\3\2\2\2B@\3\2\2\2BC\3\2\2\2C\5\3\2\2\2DB\3\2\2"+
		"\2EH\5\24\13\2FH\5\b\5\2GE\3\2\2\2GF\3\2\2\2H\7\3\2\2\2IK\7/\2\2JI\3\2"+
		"\2\2JK\3\2\2\2KM\3\2\2\2LN\7/\2\2ML\3\2\2\2MN\3\2\2\2NO\3\2\2\2OP\7\36"+
		"\2\2PQ\5\n\6\2QR\5\f\7\2RS\7\27\2\2ST\5\22\n\2TU\7\30\2\2U\t\3\2\2\2V"+
		"W\7/\2\2W\13\3\2\2\2XY\7\f\2\2Y^\5\16\b\2Z[\7\7\2\2[]\5\16\b\2\\Z\3\2"+
		"\2\2]`\3\2\2\2^\\\3\2\2\2^_\3\2\2\2_a\3\2\2\2`^\3\2\2\2ab\7\37\2\2be\3"+
		"\2\2\2ce\7\6\2\2dX\3\2\2\2dc\3\2\2\2e\r\3\2\2\2fh\7/\2\2gf\3\2\2\2gh\3"+
		"\2\2\2hj\3\2\2\2ik\7/\2\2ji\3\2\2\2jk\3\2\2\2kl\3\2\2\2lo\5\20\t\2mn\7"+
		"#\2\2np\5\"\22\2om\3\2\2\2op\3\2\2\2p\17\3\2\2\2qr\7/\2\2r\21\3\2\2\2"+
		"su\5\24\13\2ts\3\2\2\2ux\3\2\2\2vt\3\2\2\2vw\3\2\2\2w\23\3\2\2\2xv\3\2"+
		"\2\2y\u0080\5\26\f\2z\u0080\5\30\r\2{\u0080\5 \21\2|\u0080\5\32\16\2}"+
		"\u0080\5\34\17\2~\u0080\5\36\20\2\177y\3\2\2\2\177z\3\2\2\2\177{\3\2\2"+
		"\2\177|\3\2\2\2\177}\3\2\2\2\177~\3\2\2\2\u0080\25\3\2\2\2\u0081\u0082"+
		"\7\24\2\2\u0082\u0083\5*\26\2\u0083\u0084\7#\2\2\u0084\u0085\5\"\22\2"+
		"\u0085\u0086\7$\2\2\u0086\27\3\2\2\2\u0087\u0088\5*\26\2\u0088\u0089\7"+
		"#\2\2\u0089\u008a\5\"\22\2\u008a\u008b\7$\2\2\u008b\31\3\2\2\2\u008c\u008d"+
		"\7\16\2\2\u008d\u008e\7\f\2\2\u008e\u008f\5\"\22\2\u008f\u0090\7\37\2"+
		"\2\u0090\u0091\7\27\2\2\u0091\u0092\5\22\n\2\u0092\u0093\7\30\2\2\u0093"+
		"\33\3\2\2\2\u0094\u0095\7\"\2\2\u0095\u0098\7\f\2\2\u0096\u0099\5\26\f"+
		"\2\u0097\u0099\5\30\r\2\u0098\u0096\3\2\2\2\u0098\u0097\3\2\2\2\u0099"+
		"\u009a\3\2\2\2\u009a\u009b\5\"\22\2\u009b\u009c\7$\2\2\u009c\u009d\5\""+
		"\22\2\u009d\u009e\7\37\2\2\u009e\u009f\7\27\2\2\u009f\u00a0\5\22\n\2\u00a0"+
		"\u00a1\7\30\2\2\u00a1\35\3\2\2\2\u00a2\u00a3\7\n\2\2\u00a3\u00a4\7\f\2"+
		"\2\u00a4\u00a5\5\"\22\2\u00a5\u00a6\7\37\2\2\u00a6\u00a7\7\27\2\2\u00a7"+
		"\u00a8\5\22\n\2\u00a8\u00a9\7\30\2\2\u00a9\37\3\2\2\2\u00aa\u00ab\5\""+
		"\22\2\u00ab\u00ac\7$\2\2\u00ac!\3\2\2\2\u00ad\u00ae\b\22\1\2\u00ae\u00af"+
		"\7,\2\2\u00af\u00bb\5\"\22\2\u00b0\u00b1\7\f\2\2\u00b1\u00b2\5\"\22\2"+
		"\u00b2\u00b3\7\37\2\2\u00b3\u00bb\3\2\2\2\u00b4\u00bb\5.\30\2\u00b5\u00bb"+
		"\5\60\31\2\u00b6\u00bb\7-\2\2\u00b7\u00bb\7\31\2\2\u00b8\u00bb\7\21\2"+
		"\2\u00b9\u00bb\5$\23\2\u00ba\u00ad\3\2\2\2\u00ba\u00b0\3\2\2\2\u00ba\u00b4"+
		"\3\2\2\2\u00ba\u00b5\3\2\2\2\u00ba\u00b6\3\2\2\2\u00ba\u00b7\3\2\2\2\u00ba"+
		"\u00b8\3\2\2\2\u00ba\u00b9\3\2\2\2\u00bb\u00e6\3\2\2\2\u00bc\u00bd\6\22"+
		"\2\3\u00bd\u00be\t\2\2\2\u00be\u00e5\5\"\22\2\u00bf\u00c0\6\22\3\3\u00c0"+
		"\u00c1\t\3\2\2\u00c1\u00e5\5\"\22\2\u00c2\u00c3\6\22\4\3\u00c3\u00c4\t"+
		"\4\2\2\u00c4\u00e5\5\"\22\2\u00c5\u00c6\6\22\5\3\u00c6\u00c7\t\5\2\2\u00c7"+
		"\u00e5\5\"\22\2\u00c8\u00c9\6\22\6\3\u00c9\u00ca\t\6\2\2\u00ca\u00e5\5"+
		"\"\22\2\u00cb\u00cc\6\22\7\3\u00cc\u00cd\7\5\2\2\u00cd\u00e5\5\"\22\2"+
		"\u00ce\u00cf\6\22\b\3\u00cf\u00d0\7\35\2\2\u00d0\u00e5\5\"\22\2\u00d1"+
		"\u00d2\6\22\t\3\u00d2\u00d3\7+\2\2\u00d3\u00e5\5\"\22\2\u00d4\u00d5\6"+
		"\22\n\3\u00d5\u00d6\7%\2\2\u00d6\u00e5\5\"\22\2\u00d7\u00d8\6\22\13\3"+
		"\u00d8\u00d9\7&\2\2\u00d9\u00e5\5\"\22\2\u00da\u00db\6\22\f\3\u00db\u00dc"+
		"\7\25\2\2\u00dc\u00dd\5\"\22\2\u00dd\u00de\7\r\2\2\u00de\u00df\5\"\22"+
		"\2\u00df\u00e5\3\2\2\2\u00e0\u00e1\6\22\r\3\u00e1\u00e5\7\32\2\2\u00e2"+
		"\u00e3\6\22\16\3\u00e3\u00e5\7\20\2\2\u00e4\u00bc\3\2\2\2\u00e4\u00bf"+
		"\3\2\2\2\u00e4\u00c2\3\2\2\2\u00e4\u00c5\3\2\2\2\u00e4\u00c8\3\2\2\2\u00e4"+
		"\u00cb\3\2\2\2\u00e4\u00ce\3\2\2\2\u00e4\u00d1\3\2\2\2\u00e4\u00d4\3\2"+
		"\2\2\u00e4\u00d7\3\2\2\2\u00e4\u00da\3\2\2\2\u00e4\u00e0\3\2\2\2\u00e4"+
		"\u00e2\3\2\2\2\u00e5\u00e8\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e6\u00e7\3\2"+
		"\2\2\u00e7#\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e9\u00ed\7/\2\2\u00ea\u00ec"+
		"\5&\24\2\u00eb\u00ea\3\2\2\2\u00ec\u00ef\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ed"+
		"\u00ee\3\2\2\2\u00ee%\3\2\2\2\u00ef\u00ed\3\2\2\2\u00f0\u00f1\7 \2\2\u00f1"+
		"\u0102\5$\23\2\u00f2\u0102\7.\2\2\u00f3\u0100\7\6\2\2\u00f4\u00f5\7\f"+
		"\2\2\u00f5\u00fa\5\"\22\2\u00f6\u00f7\7\7\2\2\u00f7\u00f9\5\"\22\2\u00f8"+
		"\u00f6\3\2\2\2\u00f9\u00fc\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fa\u00fb\3\2"+
		"\2\2\u00fb\u00fd\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fd\u00fe\7\37\2\2\u00fe"+
		"\u0100\3\2\2\2\u00ff\u00f3\3\2\2\2\u00ff\u00f4\3\2\2\2\u0100\u0102\3\2"+
		"\2\2\u0101\u00f0\3\2\2\2\u0101\u00f2\3\2\2\2\u0101\u00ff\3\2\2\2\u0102"+
		"\'\3\2\2\2\u0103\u0110\7/\2\2\u0104\u0111\7\6\2\2\u0105\u0106\7\f\2\2"+
		"\u0106\u010b\5\"\22\2\u0107\u0108\7\7\2\2\u0108\u010a\5\"\22\2\u0109\u0107"+
		"\3\2\2\2\u010a\u010d\3\2\2\2\u010b\u0109\3\2\2\2\u010b\u010c\3\2\2\2\u010c"+
		"\u010e\3\2\2\2\u010d\u010b\3\2\2\2\u010e\u010f\7\37\2\2\u010f\u0111\3"+
		"\2\2\2\u0110\u0104\3\2\2\2\u0110\u0105\3\2\2\2\u0111)\3\2\2\2\u0112\u0116"+
		"\7/\2\2\u0113\u0115\5,\27\2\u0114\u0113\3\2\2\2\u0115\u0118\3\2\2\2\u0116"+
		"\u0114\3\2\2\2\u0116\u0117\3\2\2\2\u0117+\3\2\2\2\u0118\u0116\3\2\2\2"+
		"\u0119\u011d\7.\2\2\u011a\u011b\7 \2\2\u011b\u011d\5*\26\2\u011c\u0119"+
		"\3\2\2\2\u011c\u011a\3\2\2\2\u011d-\3\2\2\2\u011e\u011f\7\13\2\2\u011f"+
		"\u0124\5\"\22\2\u0120\u0121\7\7\2\2\u0121\u0123\5\"\22\2\u0122\u0120\3"+
		"\2\2\2\u0123\u0126\3\2\2\2\u0124\u0122\3\2\2\2\u0124\u0125\3\2\2\2\u0125"+
		"\u0127\3\2\2\2\u0126\u0124\3\2\2\2\u0127\u0128\7\4\2\2\u0128/\3\2\2\2"+
		"\u0129\u0136\7\27\2\2\u012a\u012b\7/\2\2\u012b\u012c\7#\2\2\u012c\u0133"+
		"\5\"\22\2\u012d\u012e\7\7\2\2\u012e\u012f\7/\2\2\u012f\u0130\7#\2\2\u0130"+
		"\u0132\5\"\22\2\u0131\u012d\3\2\2\2\u0132\u0135\3\2\2\2\u0133\u0131\3"+
		"\2\2\2\u0133\u0134\3\2\2\2\u0134\u0137\3\2\2\2\u0135\u0133\3\2\2\2\u0136"+
		"\u012a\3\2\2\2\u0136\u0137\3\2\2\2\u0137\u0138\3\2\2\2\u0138\u0139\7\30"+
		"\2\2\u0139\61\3\2\2\2\u013a\u013b\7/\2\2\u013b\u013c\7#\2\2\u013c\u013d"+
		"\7-\2\2\u013d\63\3\2\2\2\358BGJM^dgjov\177\u0098\u00ba\u00e4\u00e6\u00ed"+
		"\u00fa\u00ff\u0101\u010b\u0110\u0116\u011c\u0124\u0133\u0136";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}