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
		T__23=1, T__22=2, T__21=3, T__20=4, T__19=5, T__18=6, T__17=7, T__16=8, 
		T__15=9, T__14=10, T__13=11, T__12=12, T__11=13, T__10=14, T__9=15, T__8=16, 
		T__7=17, T__6=18, T__5=19, T__4=20, T__3=21, T__2=22, T__1=23, T__0=24, 
		StringLiteral=25, ArrayIndex=26, Identifier=27, WS=28, COMMENT=29;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'component'", "']'", "'variable'", "'&'", "'()'", "')'", "'function'", 
		"'.'", "','", "'+'", "'while'", "'['", "'('", "'for'", "'if'", "'savecontent'", 
		"'='", "'return'", "';'", "'var'", "'{'", "'else'", "'}'", "'property'", 
		"StringLiteral", "ArrayIndex", "Identifier", "WS", "COMMENT"
	};
	public static final String[] ruleNames = {
		"T__23", "T__22", "T__21", "T__20", "T__19", "T__18", "T__17", "T__16", 
		"T__15", "T__14", "T__13", "T__12", "T__11", "T__10", "T__9", "T__8", 
		"T__7", "T__6", "T__5", "T__4", "T__3", "T__2", "T__1", "T__0", "StringLiteral", 
		"ArrayIndex", "Identifier", "WS", "COMMENT"
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
		case 27: WS_action((RuleContext)_localctx, actionIndex); break;

		case 28: COMMENT_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}
	private void COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1: _channel = HIDDEN;  break;
		}
	}

	public static final String _serializedATN =
		"\2\4\37\u00e6\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b"+
		"\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20"+
		"\t\20\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27"+
		"\t\27\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36"+
		"\t\36\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3"+
		"\r\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3"+
		"\27\3\27\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3"+
		"\32\7\32\u00a9\n\32\f\32\16\32\u00ac\13\32\3\32\3\32\3\33\3\33\3\33\7"+
		"\33\u00b3\n\33\f\33\16\33\u00b6\13\33\3\33\3\33\3\33\3\33\3\33\5\33\u00bd"+
		"\n\33\3\34\6\34\u00c0\n\34\r\34\16\34\u00c1\3\35\6\35\u00c5\n\35\r\35"+
		"\16\35\u00c6\3\35\3\35\3\36\3\36\3\36\3\36\7\36\u00cf\n\36\f\36\16\36"+
		"\u00d2\13\36\3\36\5\36\u00d5\n\36\3\36\3\36\3\36\3\36\3\36\7\36\u00dc"+
		"\n\36\f\36\16\36\u00df\13\36\3\36\3\36\5\36\u00e3\n\36\3\36\3\36\3\u00dd"+
		"\37\3\3\1\5\4\1\7\5\1\t\6\1\13\7\1\r\b\1\17\t\1\21\n\1\23\13\1\25\f\1"+
		"\27\r\1\31\16\1\33\17\1\35\20\1\37\21\1!\22\1#\23\1%\24\1\'\25\1)\26\1"+
		"+\27\1-\30\1/\31\1\61\32\1\63\33\1\65\34\1\67\35\19\36\2;\37\3\3\2\b\4"+
		"$$^^\3\63;\3\62;\6\62;C\\aac|\5\13\f\17\17\"\"\4\f\f\17\17\u00ee\2\3\3"+
		"\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2"+
		"\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3"+
		"\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2"+
		"%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61"+
		"\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2"+
		"\3=\3\2\2\2\5G\3\2\2\2\7I\3\2\2\2\tR\3\2\2\2\13T\3\2\2\2\rW\3\2\2\2\17"+
		"Y\3\2\2\2\21b\3\2\2\2\23d\3\2\2\2\25f\3\2\2\2\27h\3\2\2\2\31n\3\2\2\2"+
		"\33p\3\2\2\2\35r\3\2\2\2\37v\3\2\2\2!y\3\2\2\2#\u0085\3\2\2\2%\u0087\3"+
		"\2\2\2\'\u008e\3\2\2\2)\u0090\3\2\2\2+\u0094\3\2\2\2-\u0096\3\2\2\2/\u009b"+
		"\3\2\2\2\61\u009d\3\2\2\2\63\u00a6\3\2\2\2\65\u00bc\3\2\2\2\67\u00bf\3"+
		"\2\2\29\u00c4\3\2\2\2;\u00e2\3\2\2\2=>\7e\2\2>?\7q\2\2?@\7o\2\2@A\7r\2"+
		"\2AB\7q\2\2BC\7p\2\2CD\7g\2\2DE\7p\2\2EF\7v\2\2F\4\3\2\2\2GH\7_\2\2H\6"+
		"\3\2\2\2IJ\7x\2\2JK\7c\2\2KL\7t\2\2LM\7k\2\2MN\7c\2\2NO\7d\2\2OP\7n\2"+
		"\2PQ\7g\2\2Q\b\3\2\2\2RS\7(\2\2S\n\3\2\2\2TU\7*\2\2UV\7+\2\2V\f\3\2\2"+
		"\2WX\7+\2\2X\16\3\2\2\2YZ\7h\2\2Z[\7w\2\2[\\\7p\2\2\\]\7e\2\2]^\7v\2\2"+
		"^_\7k\2\2_`\7q\2\2`a\7p\2\2a\20\3\2\2\2bc\7\60\2\2c\22\3\2\2\2de\7.\2"+
		"\2e\24\3\2\2\2fg\7-\2\2g\26\3\2\2\2hi\7y\2\2ij\7j\2\2jk\7k\2\2kl\7n\2"+
		"\2lm\7g\2\2m\30\3\2\2\2no\7]\2\2o\32\3\2\2\2pq\7*\2\2q\34\3\2\2\2rs\7"+
		"h\2\2st\7q\2\2tu\7t\2\2u\36\3\2\2\2vw\7k\2\2wx\7h\2\2x \3\2\2\2yz\7u\2"+
		"\2z{\7c\2\2{|\7x\2\2|}\7g\2\2}~\7e\2\2~\177\7q\2\2\177\u0080\7p\2\2\u0080"+
		"\u0081\7v\2\2\u0081\u0082\7g\2\2\u0082\u0083\7p\2\2\u0083\u0084\7v\2\2"+
		"\u0084\"\3\2\2\2\u0085\u0086\7?\2\2\u0086$\3\2\2\2\u0087\u0088\7t\2\2"+
		"\u0088\u0089\7g\2\2\u0089\u008a\7v\2\2\u008a\u008b\7w\2\2\u008b\u008c"+
		"\7t\2\2\u008c\u008d\7p\2\2\u008d&\3\2\2\2\u008e\u008f\7=\2\2\u008f(\3"+
		"\2\2\2\u0090\u0091\7x\2\2\u0091\u0092\7c\2\2\u0092\u0093\7t\2\2\u0093"+
		"*\3\2\2\2\u0094\u0095\7}\2\2\u0095,\3\2\2\2\u0096\u0097\7g\2\2\u0097\u0098"+
		"\7n\2\2\u0098\u0099\7u\2\2\u0099\u009a\7g\2\2\u009a.\3\2\2\2\u009b\u009c"+
		"\7\177\2\2\u009c\60\3\2\2\2\u009d\u009e\7r\2\2\u009e\u009f\7t\2\2\u009f"+
		"\u00a0\7q\2\2\u00a0\u00a1\7r\2\2\u00a1\u00a2\7g\2\2\u00a2\u00a3\7t\2\2"+
		"\u00a3\u00a4\7v\2\2\u00a4\u00a5\7{\2\2\u00a5\62\3\2\2\2\u00a6\u00aa\7"+
		"$\2\2\u00a7\u00a9\n\2\2\2\u00a8\u00a7\3\2\2\2\u00a9\u00ac\3\2\2\2\u00aa"+
		"\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ad\3\2\2\2\u00ac\u00aa\3\2"+
		"\2\2\u00ad\u00ae\7$\2\2\u00ae\64\3\2\2\2\u00af\u00b0\7]\2\2\u00b0\u00b4"+
		"\t\3\2\2\u00b1\u00b3\t\4\2\2\u00b2\u00b1\3\2\2\2\u00b3\u00b6\3\2\2\2\u00b4"+
		"\u00b2\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b7\3\2\2\2\u00b6\u00b4\3\2"+
		"\2\2\u00b7\u00bd\7_\2\2\u00b8\u00b9\7]\2\2\u00b9\u00ba\5\63\32\2\u00ba"+
		"\u00bb\7_\2\2\u00bb\u00bd\3\2\2\2\u00bc\u00af\3\2\2\2\u00bc\u00b8\3\2"+
		"\2\2\u00bd\66\3\2\2\2\u00be\u00c0\t\5\2\2\u00bf\u00be\3\2\2\2\u00c0\u00c1"+
		"\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c28\3\2\2\2\u00c3"+
		"\u00c5\t\6\2\2\u00c4\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c4\3\2"+
		"\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00c9\b\35\2\2\u00c9"+
		":\3\2\2\2\u00ca\u00cb\7\61\2\2\u00cb\u00cc\7\61\2\2\u00cc\u00d0\3\2\2"+
		"\2\u00cd\u00cf\n\7\2\2\u00ce\u00cd\3\2\2\2\u00cf\u00d2\3\2\2\2\u00d0\u00ce"+
		"\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d4\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d3"+
		"\u00d5\7\17\2\2\u00d4\u00d3\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d6\3"+
		"\2\2\2\u00d6\u00e3\7\f\2\2\u00d7\u00d8\7\61\2\2\u00d8\u00d9\7,\2\2\u00d9"+
		"\u00dd\3\2\2\2\u00da\u00dc\13\2\2\2\u00db\u00da\3\2\2\2\u00dc\u00df\3"+
		"\2\2\2\u00dd\u00de\3\2\2\2\u00dd\u00db\3\2\2\2\u00de\u00e0\3\2\2\2\u00df"+
		"\u00dd\3\2\2\2\u00e0\u00e1\7,\2\2\u00e1\u00e3\7\61\2\2\u00e2\u00ca\3\2"+
		"\2\2\u00e2\u00d7\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e5\b\36\3\2\u00e5"+
		"<\3\2\2\2\f\2\u00aa\u00b4\u00bc\u00c1\u00c6\u00d0\u00d4\u00dd\u00e2";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}