// Generated from Cfscript.g4 by ANTLR 4.0
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CfscriptLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__21=1, T__20=2, T__19=3, T__18=4, T__17=5, T__16=6, T__15=7, T__14=8, 
		T__13=9, T__12=10, T__11=11, T__10=12, T__9=13, T__8=14, T__7=15, T__6=16, 
		T__5=17, T__4=18, T__3=19, T__2=20, T__1=21, T__0=22, StringLiteral=23, 
		ArrayIndex=24, Identifier=25, WS=26, COMMENT=27;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'component'", "']'", "'()'", "')'", "'function'", "'.'", "','", "'+'", 
		"'-'", "'*'", "'['", "'('", "'--'", "'='", "'false'", "';'", "'var'", 
		"'{'", "'/'", "'}'", "'true'", "'++'", "StringLiteral", "ArrayIndex", 
		"Identifier", "WS", "COMMENT"
	};
	public static final String[] ruleNames = {
		"T__21", "T__20", "T__19", "T__18", "T__17", "T__16", "T__15", "T__14", 
		"T__13", "T__12", "T__11", "T__10", "T__9", "T__8", "T__7", "T__6", "T__5", 
		"T__4", "T__3", "T__2", "T__1", "T__0", "StringLiteral", "ArrayIndex", 
		"Identifier", "WS", "COMMENT"
	};


	public CfscriptLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Cfscript.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 25: WS_action((RuleContext)_localctx, actionIndex); break;

		case 26: COMMENT_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}
	private void COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\2\4\35\u00b2\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b"+
		"\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20"+
		"\t\20\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27"+
		"\t\27\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f"+
		"\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3"+
		"\21\3\22\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3"+
		"\26\3\26\3\27\3\27\3\27\3\30\3\30\7\30\u0083\n\30\f\30\16\30\u0086\13"+
		"\30\3\30\3\30\3\31\3\31\3\31\7\31\u008d\n\31\f\31\16\31\u0090\13\31\3"+
		"\31\3\31\3\31\3\31\3\31\5\31\u0097\n\31\3\32\6\32\u009a\n\32\r\32\16\32"+
		"\u009b\3\33\6\33\u009f\n\33\r\33\16\33\u00a0\3\33\3\33\3\34\3\34\3\34"+
		"\3\34\7\34\u00a9\n\34\f\34\16\34\u00ac\13\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\u00aa\35\3\3\1\5\4\1\7\5\1\t\6\1\13\7\1\r\b\1\17\t\1\21\n\1\23\13\1"+
		"\25\f\1\27\r\1\31\16\1\33\17\1\35\20\1\37\21\1!\22\1#\23\1%\24\1\'\25"+
		"\1)\26\1+\27\1-\30\1/\31\1\61\32\1\63\33\1\65\34\2\67\35\3\3\2\7\4$$^"+
		"^\3\63;\3\62;\5\62;C\\c|\5\13\f\17\17\"\"\u00b7\2\3\3\2\2\2\2\5\3\2\2"+
		"\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3"+
		"\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\39\3\2\2\2\5C\3\2\2\2\7E\3\2\2\2\tH\3"+
		"\2\2\2\13J\3\2\2\2\rS\3\2\2\2\17U\3\2\2\2\21W\3\2\2\2\23Y\3\2\2\2\25["+
		"\3\2\2\2\27]\3\2\2\2\31_\3\2\2\2\33a\3\2\2\2\35d\3\2\2\2\37f\3\2\2\2!"+
		"l\3\2\2\2#n\3\2\2\2%r\3\2\2\2\'t\3\2\2\2)v\3\2\2\2+x\3\2\2\2-}\3\2\2\2"+
		"/\u0080\3\2\2\2\61\u0096\3\2\2\2\63\u0099\3\2\2\2\65\u009e\3\2\2\2\67"+
		"\u00a4\3\2\2\29:\7e\2\2:;\7q\2\2;<\7o\2\2<=\7r\2\2=>\7q\2\2>?\7p\2\2?"+
		"@\7g\2\2@A\7p\2\2AB\7v\2\2B\4\3\2\2\2CD\7_\2\2D\6\3\2\2\2EF\7*\2\2FG\7"+
		"+\2\2G\b\3\2\2\2HI\7+\2\2I\n\3\2\2\2JK\7h\2\2KL\7w\2\2LM\7p\2\2MN\7e\2"+
		"\2NO\7v\2\2OP\7k\2\2PQ\7q\2\2QR\7p\2\2R\f\3\2\2\2ST\7\60\2\2T\16\3\2\2"+
		"\2UV\7.\2\2V\20\3\2\2\2WX\7-\2\2X\22\3\2\2\2YZ\7/\2\2Z\24\3\2\2\2[\\\7"+
		",\2\2\\\26\3\2\2\2]^\7]\2\2^\30\3\2\2\2_`\7*\2\2`\32\3\2\2\2ab\7/\2\2"+
		"bc\7/\2\2c\34\3\2\2\2de\7?\2\2e\36\3\2\2\2fg\7h\2\2gh\7c\2\2hi\7n\2\2"+
		"ij\7u\2\2jk\7g\2\2k \3\2\2\2lm\7=\2\2m\"\3\2\2\2no\7x\2\2op\7c\2\2pq\7"+
		"t\2\2q$\3\2\2\2rs\7}\2\2s&\3\2\2\2tu\7\61\2\2u(\3\2\2\2vw\7\177\2\2w*"+
		"\3\2\2\2xy\7v\2\2yz\7t\2\2z{\7w\2\2{|\7g\2\2|,\3\2\2\2}~\7-\2\2~\177\7"+
		"-\2\2\177.\3\2\2\2\u0080\u0084\7$\2\2\u0081\u0083\n\2\2\2\u0082\u0081"+
		"\3\2\2\2\u0083\u0086\3\2\2\2\u0084\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085"+
		"\u0087\3\2\2\2\u0086\u0084\3\2\2\2\u0087\u0088\7$\2\2\u0088\60\3\2\2\2"+
		"\u0089\u008a\7]\2\2\u008a\u008e\t\3\2\2\u008b\u008d\t\4\2\2\u008c\u008b"+
		"\3\2\2\2\u008d\u0090\3\2\2\2\u008e\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f"+
		"\u0091\3\2\2\2\u0090\u008e\3\2\2\2\u0091\u0097\7_\2\2\u0092\u0093\7]\2"+
		"\2\u0093\u0094\5/\30\2\u0094\u0095\7_\2\2\u0095\u0097\3\2\2\2\u0096\u0089"+
		"\3\2\2\2\u0096\u0092\3\2\2\2\u0097\62\3\2\2\2\u0098\u009a\t\5\2\2\u0099"+
		"\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u0099\3\2\2\2\u009b\u009c\3\2"+
		"\2\2\u009c\64\3\2\2\2\u009d\u009f\t\6\2\2\u009e\u009d\3\2\2\2\u009f\u00a0"+
		"\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2"+
		"\u00a3\b\33\2\2\u00a3\66\3\2\2\2\u00a4\u00a5\7\61\2\2\u00a5\u00a6\7,\2"+
		"\2\u00a6\u00aa\3\2\2\2\u00a7\u00a9\13\2\2\2\u00a8\u00a7\3\2\2\2\u00a9"+
		"\u00ac\3\2\2\2\u00aa\u00ab\3\2\2\2\u00aa\u00a8\3\2\2\2\u00ab\u00ad\3\2"+
		"\2\2\u00ac\u00aa\3\2\2\2\u00ad\u00ae\7,\2\2\u00ae\u00af\7\61\2\2\u00af"+
		"\u00b0\3\2\2\2\u00b0\u00b1\b\34\3\2\u00b18\3\2\2\2\t\2\u0084\u008e\u0096"+
		"\u009b\u00a0\u00aa";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}