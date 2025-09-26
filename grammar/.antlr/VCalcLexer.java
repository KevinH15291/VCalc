// Generated from /Users/cannedbeans/sharedlinuxdir/school/cmput415/VCalcBase/grammar/VCalc.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class VCalcLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		PAR=10, MUL=11, DIV=12, REM=13, ADD=14, SUB=15, GE=16, LE=17, EE=18, NE=19, 
		IN_KW=20, IF_KW=21, FI_KW=22, INT_KW=23, PRINT_KW=24, POOL_KW=25, LOOP_KW=26, 
		VECTOR_KW=27, ID=28, INT=29, WS=30, LINE_COMMENT=31;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"PAR", "MUL", "DIV", "REM", "ADD", "SUB", "GE", "LE", "EE", "NE", "IN_KW", 
			"IF_KW", "FI_KW", "INT_KW", "PRINT_KW", "POOL_KW", "LOOP_KW", "VECTOR_KW", 
			"ID", "INT", "WS", "LINE_COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'['", "']'", "'..'", "'('", "')'", "'|'", "'&'", "'='", 
			null, "'*'", "'/'", "'%'", "'+'", "'-'", "'>'", "'<'", "'=='", "'!='", 
			"'in'", "'if'", "'fi'", "'int'", "'print'", "'pool'", "'loop'", "'vector'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, "PAR", "MUL", 
			"DIV", "REM", "ADD", "SUB", "GE", "LE", "EE", "NE", "IN_KW", "IF_KW", 
			"FI_KW", "INT_KW", "PRINT_KW", "POOL_KW", "LOOP_KW", "VECTOR_KW", "ID", 
			"INT", "WS", "LINE_COMMENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public VCalcLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "VCalc.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u001f\u00ae\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0002\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a"+
		"\u0002\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d"+
		"\u0002\u001e\u0007\u001e\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001"+
		"\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e"+
		"\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b"+
		"\u0005\u001b\u0090\b\u001b\n\u001b\f\u001b\u0093\t\u001b\u0001\u001c\u0004"+
		"\u001c\u0096\b\u001c\u000b\u001c\f\u001c\u0097\u0001\u001d\u0004\u001d"+
		"\u009b\b\u001d\u000b\u001d\f\u001d\u009c\u0001\u001d\u0001\u001d\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0005\u001e\u00a5\b\u001e\n"+
		"\u001e\f\u001e\u00a8\t\u001e\u0001\u001e\u0003\u001e\u00ab\b\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u00a6\u0000\u001f\u0001\u0001\u0003\u0002\u0005"+
		"\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n"+
		"\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011"+
		"#\u0012%\u0013\'\u0014)\u0015+\u0016-\u0017/\u00181\u00193\u001a5\u001b"+
		"7\u001c9\u001d;\u001e=\u001f\u0001\u0000\u0005\u0002\u0000AZaz\u0003\u0000"+
		"09AZaz\u0001\u000009\u0003\u0000\t\n\r\r  \u0001\u0001\n\n\u00b1\u0000"+
		"\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000"+
		"\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000"+
		"\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r"+
		"\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011"+
		"\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015"+
		"\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019"+
		"\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d"+
		"\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001"+
		"\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000"+
		"\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000"+
		"\u0000+\u0001\u0000\u0000\u0000\u0000-\u0001\u0000\u0000\u0000\u0000/"+
		"\u0001\u0000\u0000\u0000\u00001\u0001\u0000\u0000\u0000\u00003\u0001\u0000"+
		"\u0000\u0000\u00005\u0001\u0000\u0000\u0000\u00007\u0001\u0000\u0000\u0000"+
		"\u00009\u0001\u0000\u0000\u0000\u0000;\u0001\u0000\u0000\u0000\u0000="+
		"\u0001\u0000\u0000\u0000\u0001?\u0001\u0000\u0000\u0000\u0003A\u0001\u0000"+
		"\u0000\u0000\u0005C\u0001\u0000\u0000\u0000\u0007E\u0001\u0000\u0000\u0000"+
		"\tH\u0001\u0000\u0000\u0000\u000bJ\u0001\u0000\u0000\u0000\rL\u0001\u0000"+
		"\u0000\u0000\u000fN\u0001\u0000\u0000\u0000\u0011P\u0001\u0000\u0000\u0000"+
		"\u0013R\u0001\u0000\u0000\u0000\u0015U\u0001\u0000\u0000\u0000\u0017W"+
		"\u0001\u0000\u0000\u0000\u0019Y\u0001\u0000\u0000\u0000\u001b[\u0001\u0000"+
		"\u0000\u0000\u001d]\u0001\u0000\u0000\u0000\u001f_\u0001\u0000\u0000\u0000"+
		"!a\u0001\u0000\u0000\u0000#c\u0001\u0000\u0000\u0000%f\u0001\u0000\u0000"+
		"\u0000\'i\u0001\u0000\u0000\u0000)l\u0001\u0000\u0000\u0000+o\u0001\u0000"+
		"\u0000\u0000-r\u0001\u0000\u0000\u0000/v\u0001\u0000\u0000\u00001|\u0001"+
		"\u0000\u0000\u00003\u0081\u0001\u0000\u0000\u00005\u0086\u0001\u0000\u0000"+
		"\u00007\u008d\u0001\u0000\u0000\u00009\u0095\u0001\u0000\u0000\u0000;"+
		"\u009a\u0001\u0000\u0000\u0000=\u00a0\u0001\u0000\u0000\u0000?@\u0005"+
		";\u0000\u0000@\u0002\u0001\u0000\u0000\u0000AB\u0005[\u0000\u0000B\u0004"+
		"\u0001\u0000\u0000\u0000CD\u0005]\u0000\u0000D\u0006\u0001\u0000\u0000"+
		"\u0000EF\u0005.\u0000\u0000FG\u0005.\u0000\u0000G\b\u0001\u0000\u0000"+
		"\u0000HI\u0005(\u0000\u0000I\n\u0001\u0000\u0000\u0000JK\u0005)\u0000"+
		"\u0000K\f\u0001\u0000\u0000\u0000LM\u0005|\u0000\u0000M\u000e\u0001\u0000"+
		"\u0000\u0000NO\u0005&\u0000\u0000O\u0010\u0001\u0000\u0000\u0000PQ\u0005"+
		"=\u0000\u0000Q\u0012\u0001\u0000\u0000\u0000RS\u0005(\u0000\u0000ST\u0005"+
		")\u0000\u0000T\u0014\u0001\u0000\u0000\u0000UV\u0005*\u0000\u0000V\u0016"+
		"\u0001\u0000\u0000\u0000WX\u0005/\u0000\u0000X\u0018\u0001\u0000\u0000"+
		"\u0000YZ\u0005%\u0000\u0000Z\u001a\u0001\u0000\u0000\u0000[\\\u0005+\u0000"+
		"\u0000\\\u001c\u0001\u0000\u0000\u0000]^\u0005-\u0000\u0000^\u001e\u0001"+
		"\u0000\u0000\u0000_`\u0005>\u0000\u0000` \u0001\u0000\u0000\u0000ab\u0005"+
		"<\u0000\u0000b\"\u0001\u0000\u0000\u0000cd\u0005=\u0000\u0000de\u0005"+
		"=\u0000\u0000e$\u0001\u0000\u0000\u0000fg\u0005!\u0000\u0000gh\u0005="+
		"\u0000\u0000h&\u0001\u0000\u0000\u0000ij\u0005i\u0000\u0000jk\u0005n\u0000"+
		"\u0000k(\u0001\u0000\u0000\u0000lm\u0005i\u0000\u0000mn\u0005f\u0000\u0000"+
		"n*\u0001\u0000\u0000\u0000op\u0005f\u0000\u0000pq\u0005i\u0000\u0000q"+
		",\u0001\u0000\u0000\u0000rs\u0005i\u0000\u0000st\u0005n\u0000\u0000tu"+
		"\u0005t\u0000\u0000u.\u0001\u0000\u0000\u0000vw\u0005p\u0000\u0000wx\u0005"+
		"r\u0000\u0000xy\u0005i\u0000\u0000yz\u0005n\u0000\u0000z{\u0005t\u0000"+
		"\u0000{0\u0001\u0000\u0000\u0000|}\u0005p\u0000\u0000}~\u0005o\u0000\u0000"+
		"~\u007f\u0005o\u0000\u0000\u007f\u0080\u0005l\u0000\u0000\u00802\u0001"+
		"\u0000\u0000\u0000\u0081\u0082\u0005l\u0000\u0000\u0082\u0083\u0005o\u0000"+
		"\u0000\u0083\u0084\u0005o\u0000\u0000\u0084\u0085\u0005p\u0000\u0000\u0085"+
		"4\u0001\u0000\u0000\u0000\u0086\u0087\u0005v\u0000\u0000\u0087\u0088\u0005"+
		"e\u0000\u0000\u0088\u0089\u0005c\u0000\u0000\u0089\u008a\u0005t\u0000"+
		"\u0000\u008a\u008b\u0005o\u0000\u0000\u008b\u008c\u0005r\u0000\u0000\u008c"+
		"6\u0001\u0000\u0000\u0000\u008d\u0091\u0007\u0000\u0000\u0000\u008e\u0090"+
		"\u0007\u0001\u0000\u0000\u008f\u008e\u0001\u0000\u0000\u0000\u0090\u0093"+
		"\u0001\u0000\u0000\u0000\u0091\u008f\u0001\u0000\u0000\u0000\u0091\u0092"+
		"\u0001\u0000\u0000\u0000\u00928\u0001\u0000\u0000\u0000\u0093\u0091\u0001"+
		"\u0000\u0000\u0000\u0094\u0096\u0007\u0002\u0000\u0000\u0095\u0094\u0001"+
		"\u0000\u0000\u0000\u0096\u0097\u0001\u0000\u0000\u0000\u0097\u0095\u0001"+
		"\u0000\u0000\u0000\u0097\u0098\u0001\u0000\u0000\u0000\u0098:\u0001\u0000"+
		"\u0000\u0000\u0099\u009b\u0007\u0003\u0000\u0000\u009a\u0099\u0001\u0000"+
		"\u0000\u0000\u009b\u009c\u0001\u0000\u0000\u0000\u009c\u009a\u0001\u0000"+
		"\u0000\u0000\u009c\u009d\u0001\u0000\u0000\u0000\u009d\u009e\u0001\u0000"+
		"\u0000\u0000\u009e\u009f\u0006\u001d\u0000\u0000\u009f<\u0001\u0000\u0000"+
		"\u0000\u00a0\u00a1\u0005/\u0000\u0000\u00a1\u00a2\u0005/\u0000\u0000\u00a2"+
		"\u00a6\u0001\u0000\u0000\u0000\u00a3\u00a5\t\u0000\u0000\u0000\u00a4\u00a3"+
		"\u0001\u0000\u0000\u0000\u00a5\u00a8\u0001\u0000\u0000\u0000\u00a6\u00a7"+
		"\u0001\u0000\u0000\u0000\u00a6\u00a4\u0001\u0000\u0000\u0000\u00a7\u00aa"+
		"\u0001\u0000\u0000\u0000\u00a8\u00a6\u0001\u0000\u0000\u0000\u00a9\u00ab"+
		"\u0007\u0004\u0000\u0000\u00aa\u00a9\u0001\u0000\u0000\u0000\u00ab\u00ac"+
		"\u0001\u0000\u0000\u0000\u00ac\u00ad\u0006\u001e\u0000\u0000\u00ad>\u0001"+
		"\u0000\u0000\u0000\u0006\u0000\u0091\u0097\u009c\u00a6\u00aa\u0001\u0006"+
		"\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}