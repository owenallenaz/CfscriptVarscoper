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
		T__55=1, T__54=2, T__53=3, T__52=4, T__51=5, T__50=6, T__49=7, T__48=8, 
		T__47=9, T__46=10, T__45=11, T__44=12, T__43=13, T__42=14, T__41=15, T__40=16, 
		T__39=17, T__38=18, T__37=19, T__36=20, T__35=21, T__34=22, T__33=23, 
		T__32=24, T__31=25, T__30=26, T__29=27, T__28=28, T__27=29, T__26=30, 
		T__25=31, T__24=32, T__23=33, T__22=34, T__21=35, T__20=36, T__19=37, 
		T__18=38, T__17=39, T__16=40, T__15=41, T__14=42, T__13=43, T__12=44, 
		T__11=45, T__10=46, T__9=47, T__8=48, T__7=49, T__6=50, T__5=51, T__4=52, 
		T__3=53, T__2=54, T__1=55, T__0=56, StringLiteral=57, ArrayIndex=58, Identifier=59, 
		WS=60, COMMENT=61;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'component'", "'&'", "'()'", "'*'", "'['", "'<'", "'--'", "'savecontent'", 
		"'false'", "'!='", "'<='", "'<<'", "'}'", "'eq'", "'lt'", "'%'", "'variable'", 
		"')'", "'gt'", "'='", "'gte'", "'|'", "'!'", "']'", "','", "'-'", "'while'", 
		"':'", "'not'", "'('", "'if'", "'lte'", "'var'", "'?'", "'{'", "'and'", 
		"'else'", "'true'", "'++'", "'>>'", "'property'", "'^'", "'is'", "'function'", 
		"'.'", "'+'", "'for'", "'return'", "';'", "'&&'", "'||'", "'>'", "'neq'", 
		"'=='", "'/'", "'>='", "StringLiteral", "ArrayIndex", "Identifier", "WS", 
		"COMMENT"
	};
	public static final String[] ruleNames = {
		"T__55", "T__54", "T__53", "T__52", "T__51", "T__50", "T__49", "T__48", 
		"T__47", "T__46", "T__45", "T__44", "T__43", "T__42", "T__41", "T__40", 
		"T__39", "T__38", "T__37", "T__36", "T__35", "T__34", "T__33", "T__32", 
		"T__31", "T__30", "T__29", "T__28", "T__27", "T__26", "T__25", "T__24", 
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
		case 59: WS_action((RuleContext)_localctx, actionIndex); break;

		case 60: COMMENT_action((RuleContext)_localctx, actionIndex); break;
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
		"\2\4?\u0185\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t"+
		"\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20"+
		"\t\20\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27"+
		"\t\27\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36"+
		"\t\36\4\37\t\37\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4"+
		"(\t(\4)\t)\4*\t*\4+\t+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62"+
		"\t\62\4\63\t\63\4\64\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4"+
		":\t:\4;\t;\4<\t<\4=\t=\4>\t>\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\3\3\3\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13"+
		"\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\21"+
		"\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\24\3\24"+
		"\3\24\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32"+
		"\3\32\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\36\3\36\3\36"+
		"\3\36\3\37\3\37\3 \3 \3 \3!\3!\3!\3!\3\"\3\"\3\"\3\"\3#\3#\3$\3$\3%\3"+
		"%\3%\3%\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3)\3)\3)\3*\3*\3*"+
		"\3*\3*\3*\3*\3*\3*\3+\3+\3,\3,\3,\3-\3-\3-\3-\3-\3-\3-\3-\3-\3.\3.\3/"+
		"\3/\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\62\3\62\3"+
		"\63\3\63\3\63\3\64\3\64\3\64\3\65\3\65\3\66\3\66\3\66\3\66\3\67\3\67\3"+
		"\67\38\38\39\39\39\3:\3:\7:\u0148\n:\f:\16:\u014b\13:\3:\3:\3;\3;\3;\7"+
		";\u0152\n;\f;\16;\u0155\13;\3;\3;\3;\3;\3;\5;\u015c\n;\3<\6<\u015f\n<"+
		"\r<\16<\u0160\3=\6=\u0164\n=\r=\16=\u0165\3=\3=\3>\3>\3>\3>\7>\u016e\n"+
		">\f>\16>\u0171\13>\3>\5>\u0174\n>\3>\3>\3>\3>\3>\7>\u017b\n>\f>\16>\u017e"+
		"\13>\3>\3>\5>\u0182\n>\3>\3>\3\u017c?\3\3\1\5\4\1\7\5\1\t\6\1\13\7\1\r"+
		"\b\1\17\t\1\21\n\1\23\13\1\25\f\1\27\r\1\31\16\1\33\17\1\35\20\1\37\21"+
		"\1!\22\1#\23\1%\24\1\'\25\1)\26\1+\27\1-\30\1/\31\1\61\32\1\63\33\1\65"+
		"\34\1\67\35\19\36\1;\37\1= \1?!\1A\"\1C#\1E$\1G%\1I&\1K\'\1M(\1O)\1Q*"+
		"\1S+\1U,\1W-\1Y.\1[/\1]\60\1_\61\1a\62\1c\63\1e\64\1g\65\1i\66\1k\67\1"+
		"m8\1o9\1q:\1s;\1u<\1w=\1y>\2{?\3\3\2\b\4$$^^\3\63;\3\62;\6\62;C\\aac|"+
		"\5\13\f\17\17\"\"\4\f\f\17\17\u018d\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2"+
		"\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23"+
		"\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2"+
		"\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2"+
		"\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3"+
		"\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2"+
		"\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2"+
		"\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2["+
		"\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2"+
		"\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2"+
		"\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\3}\3\2\2\2\5\u0087\3\2\2"+
		"\2\7\u0089\3\2\2\2\t\u008c\3\2\2\2\13\u008e\3\2\2\2\r\u0090\3\2\2\2\17"+
		"\u0092\3\2\2\2\21\u0095\3\2\2\2\23\u00a1\3\2\2\2\25\u00a7\3\2\2\2\27\u00aa"+
		"\3\2\2\2\31\u00ad\3\2\2\2\33\u00b0\3\2\2\2\35\u00b2\3\2\2\2\37\u00b5\3"+
		"\2\2\2!\u00b8\3\2\2\2#\u00ba\3\2\2\2%\u00c3\3\2\2\2\'\u00c5\3\2\2\2)\u00c8"+
		"\3\2\2\2+\u00ca\3\2\2\2-\u00ce\3\2\2\2/\u00d0\3\2\2\2\61\u00d2\3\2\2\2"+
		"\63\u00d4\3\2\2\2\65\u00d6\3\2\2\2\67\u00d8\3\2\2\29\u00de\3\2\2\2;\u00e0"+
		"\3\2\2\2=\u00e4\3\2\2\2?\u00e6\3\2\2\2A\u00e9\3\2\2\2C\u00ed\3\2\2\2E"+
		"\u00f1\3\2\2\2G\u00f3\3\2\2\2I\u00f5\3\2\2\2K\u00f9\3\2\2\2M\u00fe\3\2"+
		"\2\2O\u0103\3\2\2\2Q\u0106\3\2\2\2S\u0109\3\2\2\2U\u0112\3\2\2\2W\u0114"+
		"\3\2\2\2Y\u0117\3\2\2\2[\u0120\3\2\2\2]\u0122\3\2\2\2_\u0124\3\2\2\2a"+
		"\u0128\3\2\2\2c\u012f\3\2\2\2e\u0131\3\2\2\2g\u0134\3\2\2\2i\u0137\3\2"+
		"\2\2k\u0139\3\2\2\2m\u013d\3\2\2\2o\u0140\3\2\2\2q\u0142\3\2\2\2s\u0145"+
		"\3\2\2\2u\u015b\3\2\2\2w\u015e\3\2\2\2y\u0163\3\2\2\2{\u0181\3\2\2\2}"+
		"~\7e\2\2~\177\7q\2\2\177\u0080\7o\2\2\u0080\u0081\7r\2\2\u0081\u0082\7"+
		"q\2\2\u0082\u0083\7p\2\2\u0083\u0084\7g\2\2\u0084\u0085\7p\2\2\u0085\u0086"+
		"\7v\2\2\u0086\4\3\2\2\2\u0087\u0088\7(\2\2\u0088\6\3\2\2\2\u0089\u008a"+
		"\7*\2\2\u008a\u008b\7+\2\2\u008b\b\3\2\2\2\u008c\u008d\7,\2\2\u008d\n"+
		"\3\2\2\2\u008e\u008f\7]\2\2\u008f\f\3\2\2\2\u0090\u0091\7>\2\2\u0091\16"+
		"\3\2\2\2\u0092\u0093\7/\2\2\u0093\u0094\7/\2\2\u0094\20\3\2\2\2\u0095"+
		"\u0096\7u\2\2\u0096\u0097\7c\2\2\u0097\u0098\7x\2\2\u0098\u0099\7g\2\2"+
		"\u0099\u009a\7e\2\2\u009a\u009b\7q\2\2\u009b\u009c\7p\2\2\u009c\u009d"+
		"\7v\2\2\u009d\u009e\7g\2\2\u009e\u009f\7p\2\2\u009f\u00a0\7v\2\2\u00a0"+
		"\22\3\2\2\2\u00a1\u00a2\7h\2\2\u00a2\u00a3\7c\2\2\u00a3\u00a4\7n\2\2\u00a4"+
		"\u00a5\7u\2\2\u00a5\u00a6\7g\2\2\u00a6\24\3\2\2\2\u00a7\u00a8\7#\2\2\u00a8"+
		"\u00a9\7?\2\2\u00a9\26\3\2\2\2\u00aa\u00ab\7>\2\2\u00ab\u00ac\7?\2\2\u00ac"+
		"\30\3\2\2\2\u00ad\u00ae\7>\2\2\u00ae\u00af\7>\2\2\u00af\32\3\2\2\2\u00b0"+
		"\u00b1\7\177\2\2\u00b1\34\3\2\2\2\u00b2\u00b3\7g\2\2\u00b3\u00b4\7s\2"+
		"\2\u00b4\36\3\2\2\2\u00b5\u00b6\7n\2\2\u00b6\u00b7\7v\2\2\u00b7 \3\2\2"+
		"\2\u00b8\u00b9\7\'\2\2\u00b9\"\3\2\2\2\u00ba\u00bb\7x\2\2\u00bb\u00bc"+
		"\7c\2\2\u00bc\u00bd\7t\2\2\u00bd\u00be\7k\2\2\u00be\u00bf\7c\2\2\u00bf"+
		"\u00c0\7d\2\2\u00c0\u00c1\7n\2\2\u00c1\u00c2\7g\2\2\u00c2$\3\2\2\2\u00c3"+
		"\u00c4\7+\2\2\u00c4&\3\2\2\2\u00c5\u00c6\7i\2\2\u00c6\u00c7\7v\2\2\u00c7"+
		"(\3\2\2\2\u00c8\u00c9\7?\2\2\u00c9*\3\2\2\2\u00ca\u00cb\7i\2\2\u00cb\u00cc"+
		"\7v\2\2\u00cc\u00cd\7g\2\2\u00cd,\3\2\2\2\u00ce\u00cf\7~\2\2\u00cf.\3"+
		"\2\2\2\u00d0\u00d1\7#\2\2\u00d1\60\3\2\2\2\u00d2\u00d3\7_\2\2\u00d3\62"+
		"\3\2\2\2\u00d4\u00d5\7.\2\2\u00d5\64\3\2\2\2\u00d6\u00d7\7/\2\2\u00d7"+
		"\66\3\2\2\2\u00d8\u00d9\7y\2\2\u00d9\u00da\7j\2\2\u00da\u00db\7k\2\2\u00db"+
		"\u00dc\7n\2\2\u00dc\u00dd\7g\2\2\u00dd8\3\2\2\2\u00de\u00df\7<\2\2\u00df"+
		":\3\2\2\2\u00e0\u00e1\7p\2\2\u00e1\u00e2\7q\2\2\u00e2\u00e3\7v\2\2\u00e3"+
		"<\3\2\2\2\u00e4\u00e5\7*\2\2\u00e5>\3\2\2\2\u00e6\u00e7\7k\2\2\u00e7\u00e8"+
		"\7h\2\2\u00e8@\3\2\2\2\u00e9\u00ea\7n\2\2\u00ea\u00eb\7v\2\2\u00eb\u00ec"+
		"\7g\2\2\u00ecB\3\2\2\2\u00ed\u00ee\7x\2\2\u00ee\u00ef\7c\2\2\u00ef\u00f0"+
		"\7t\2\2\u00f0D\3\2\2\2\u00f1\u00f2\7A\2\2\u00f2F\3\2\2\2\u00f3\u00f4\7"+
		"}\2\2\u00f4H\3\2\2\2\u00f5\u00f6\7c\2\2\u00f6\u00f7\7p\2\2\u00f7\u00f8"+
		"\7f\2\2\u00f8J\3\2\2\2\u00f9\u00fa\7g\2\2\u00fa\u00fb\7n\2\2\u00fb\u00fc"+
		"\7u\2\2\u00fc\u00fd\7g\2\2\u00fdL\3\2\2\2\u00fe\u00ff\7v\2\2\u00ff\u0100"+
		"\7t\2\2\u0100\u0101\7w\2\2\u0101\u0102\7g\2\2\u0102N\3\2\2\2\u0103\u0104"+
		"\7-\2\2\u0104\u0105\7-\2\2\u0105P\3\2\2\2\u0106\u0107\7@\2\2\u0107\u0108"+
		"\7@\2\2\u0108R\3\2\2\2\u0109\u010a\7r\2\2\u010a\u010b\7t\2\2\u010b\u010c"+
		"\7q\2\2\u010c\u010d\7r\2\2\u010d\u010e\7g\2\2\u010e\u010f\7t\2\2\u010f"+
		"\u0110\7v\2\2\u0110\u0111\7{\2\2\u0111T\3\2\2\2\u0112\u0113\7`\2\2\u0113"+
		"V\3\2\2\2\u0114\u0115\7k\2\2\u0115\u0116\7u\2\2\u0116X\3\2\2\2\u0117\u0118"+
		"\7h\2\2\u0118\u0119\7w\2\2\u0119\u011a\7p\2\2\u011a\u011b\7e\2\2\u011b"+
		"\u011c\7v\2\2\u011c\u011d\7k\2\2\u011d\u011e\7q\2\2\u011e\u011f\7p\2\2"+
		"\u011fZ\3\2\2\2\u0120\u0121\7\60\2\2\u0121\\\3\2\2\2\u0122\u0123\7-\2"+
		"\2\u0123^\3\2\2\2\u0124\u0125\7h\2\2\u0125\u0126\7q\2\2\u0126\u0127\7"+
		"t\2\2\u0127`\3\2\2\2\u0128\u0129\7t\2\2\u0129\u012a\7g\2\2\u012a\u012b"+
		"\7v\2\2\u012b\u012c\7w\2\2\u012c\u012d\7t\2\2\u012d\u012e\7p\2\2\u012e"+
		"b\3\2\2\2\u012f\u0130\7=\2\2\u0130d\3\2\2\2\u0131\u0132\7(\2\2\u0132\u0133"+
		"\7(\2\2\u0133f\3\2\2\2\u0134\u0135\7~\2\2\u0135\u0136\7~\2\2\u0136h\3"+
		"\2\2\2\u0137\u0138\7@\2\2\u0138j\3\2\2\2\u0139\u013a\7p\2\2\u013a\u013b"+
		"\7g\2\2\u013b\u013c\7s\2\2\u013cl\3\2\2\2\u013d\u013e\7?\2\2\u013e\u013f"+
		"\7?\2\2\u013fn\3\2\2\2\u0140\u0141\7\61\2\2\u0141p\3\2\2\2\u0142\u0143"+
		"\7@\2\2\u0143\u0144\7?\2\2\u0144r\3\2\2\2\u0145\u0149\7$\2\2\u0146\u0148"+
		"\n\2\2\2\u0147\u0146\3\2\2\2\u0148\u014b\3\2\2\2\u0149\u0147\3\2\2\2\u0149"+
		"\u014a\3\2\2\2\u014a\u014c\3\2\2\2\u014b\u0149\3\2\2\2\u014c\u014d\7$"+
		"\2\2\u014dt\3\2\2\2\u014e\u014f\7]\2\2\u014f\u0153\t\3\2\2\u0150\u0152"+
		"\t\4\2\2\u0151\u0150\3\2\2\2\u0152\u0155\3\2\2\2\u0153\u0151\3\2\2\2\u0153"+
		"\u0154\3\2\2\2\u0154\u0156\3\2\2\2\u0155\u0153\3\2\2\2\u0156\u015c\7_"+
		"\2\2\u0157\u0158\7]\2\2\u0158\u0159\5s:\2\u0159\u015a\7_\2\2\u015a\u015c"+
		"\3\2\2\2\u015b\u014e\3\2\2\2\u015b\u0157\3\2\2\2\u015cv\3\2\2\2\u015d"+
		"\u015f\t\5\2\2\u015e\u015d\3\2\2\2\u015f\u0160\3\2\2\2\u0160\u015e\3\2"+
		"\2\2\u0160\u0161\3\2\2\2\u0161x\3\2\2\2\u0162\u0164\t\6\2\2\u0163\u0162"+
		"\3\2\2\2\u0164\u0165\3\2\2\2\u0165\u0163\3\2\2\2\u0165\u0166\3\2\2\2\u0166"+
		"\u0167\3\2\2\2\u0167\u0168\b=\2\2\u0168z\3\2\2\2\u0169\u016a\7\61\2\2"+
		"\u016a\u016b\7\61\2\2\u016b\u016f\3\2\2\2\u016c\u016e\n\7\2\2\u016d\u016c"+
		"\3\2\2\2\u016e\u0171\3\2\2\2\u016f\u016d\3\2\2\2\u016f\u0170\3\2\2\2\u0170"+
		"\u0173\3\2\2\2\u0171\u016f\3\2\2\2\u0172\u0174\7\17\2\2\u0173\u0172\3"+
		"\2\2\2\u0173\u0174\3\2\2\2\u0174\u0175\3\2\2\2\u0175\u0182\7\f\2\2\u0176"+
		"\u0177\7\61\2\2\u0177\u0178\7,\2\2\u0178\u017c\3\2\2\2\u0179\u017b\13"+
		"\2\2\2\u017a\u0179\3\2\2\2\u017b\u017e\3\2\2\2\u017c\u017d\3\2\2\2\u017c"+
		"\u017a\3\2\2\2\u017d\u017f\3\2\2\2\u017e\u017c\3\2\2\2\u017f\u0180\7,"+
		"\2\2\u0180\u0182\7\61\2\2\u0181\u0169\3\2\2\2\u0181\u0176\3\2\2\2\u0182"+
		"\u0183\3\2\2\2\u0183\u0184\b>\3\2\u0184|\3\2\2\2\f\2\u0149\u0153\u015b"+
		"\u0160\u0165\u016f\u0173\u017c\u0181";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}