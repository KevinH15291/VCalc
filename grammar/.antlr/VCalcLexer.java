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
		ID=27, INT=28, WS=29, LINE_COMMENT=30;
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
			"IF_KW", "FI_KW", "INT_KW", "PRINT_KW", "POOL_KW", "LOOP_KW", "ID", "INT", 
			"WS", "LINE_COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'['", "']'", "'..'", "'('", "')'", "'|'", "'&'", "'='", 
			null, "'*'", "'/'", "'%'", "'+'", "'-'", "'>'", "'<'", "'=='", "'!='", 
			"'in'", "'if'", "'fi'", "'int'", "'print'", "'pool'", "'loop'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, "PAR", "MUL", 
			"DIV", "REM", "ADD", "SUB", "GE", "LE", "EE", "NE", "IN_KW", "IF_KW", 
			"FI_KW", "INT_KW", "PRINT_KW", "POOL_KW", "LOOP_KW", "ID", "INT", "WS", 
			"LINE_COMMENT"
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
		"\u0004\u0000\u001e\u00a5\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0002\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a"+
		"\u0002\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001"+
		"\b\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001"+
		"\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f"+
		"\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u001a\u0001\u001a\u0005\u001a\u0087\b\u001a\n\u001a"+
		"\f\u001a\u008a\t\u001a\u0001\u001b\u0004\u001b\u008d\b\u001b\u000b\u001b"+
		"\f\u001b\u008e\u0001\u001c\u0004\u001c\u0092\b\u001c\u000b\u001c\f\u001c"+
		"\u0093\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0005\u001d\u009c\b\u001d\n\u001d\f\u001d\u009f\t\u001d\u0001\u001d"+
		"\u0003\u001d\u00a2\b\u001d\u0001\u001d\u0001\u001d\u0001\u009d\u0000\u001e"+
		"\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r"+
		"\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e"+
		"\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'\u0014)\u0015+\u0016-\u0017"+
		"/\u00181\u00193\u001a5\u001b7\u001c9\u001d;\u001e\u0001\u0000\u0005\u0002"+
		"\u0000AZaz\u0003\u000009AZaz\u0001\u000009\u0003\u0000\t\n\r\r  \u0001"+
		"\u0001\n\n\u00a8\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001"+
		"\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001"+
		"\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000"+
		"\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000"+
		"\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000"+
		"\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000"+
		"\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000"+
		"\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000"+
		"\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000"+
		"%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001"+
		"\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000-\u0001\u0000\u0000"+
		"\u0000\u0000/\u0001\u0000\u0000\u0000\u00001\u0001\u0000\u0000\u0000\u0000"+
		"3\u0001\u0000\u0000\u0000\u00005\u0001\u0000\u0000\u0000\u00007\u0001"+
		"\u0000\u0000\u0000\u00009\u0001\u0000\u0000\u0000\u0000;\u0001\u0000\u0000"+
		"\u0000\u0001=\u0001\u0000\u0000\u0000\u0003?\u0001\u0000\u0000\u0000\u0005"+
		"A\u0001\u0000\u0000\u0000\u0007C\u0001\u0000\u0000\u0000\tF\u0001\u0000"+
		"\u0000\u0000\u000bH\u0001\u0000\u0000\u0000\rJ\u0001\u0000\u0000\u0000"+
		"\u000fL\u0001\u0000\u0000\u0000\u0011N\u0001\u0000\u0000\u0000\u0013P"+
		"\u0001\u0000\u0000\u0000\u0015S\u0001\u0000\u0000\u0000\u0017U\u0001\u0000"+
		"\u0000\u0000\u0019W\u0001\u0000\u0000\u0000\u001bY\u0001\u0000\u0000\u0000"+
		"\u001d[\u0001\u0000\u0000\u0000\u001f]\u0001\u0000\u0000\u0000!_\u0001"+
		"\u0000\u0000\u0000#a\u0001\u0000\u0000\u0000%d\u0001\u0000\u0000\u0000"+
		"\'g\u0001\u0000\u0000\u0000)j\u0001\u0000\u0000\u0000+m\u0001\u0000\u0000"+
		"\u0000-p\u0001\u0000\u0000\u0000/t\u0001\u0000\u0000\u00001z\u0001\u0000"+
		"\u0000\u00003\u007f\u0001\u0000\u0000\u00005\u0084\u0001\u0000\u0000\u0000"+
		"7\u008c\u0001\u0000\u0000\u00009\u0091\u0001\u0000\u0000\u0000;\u0097"+
		"\u0001\u0000\u0000\u0000=>\u0005;\u0000\u0000>\u0002\u0001\u0000\u0000"+
		"\u0000?@\u0005[\u0000\u0000@\u0004\u0001\u0000\u0000\u0000AB\u0005]\u0000"+
		"\u0000B\u0006\u0001\u0000\u0000\u0000CD\u0005.\u0000\u0000DE\u0005.\u0000"+
		"\u0000E\b\u0001\u0000\u0000\u0000FG\u0005(\u0000\u0000G\n\u0001\u0000"+
		"\u0000\u0000HI\u0005)\u0000\u0000I\f\u0001\u0000\u0000\u0000JK\u0005|"+
		"\u0000\u0000K\u000e\u0001\u0000\u0000\u0000LM\u0005&\u0000\u0000M\u0010"+
		"\u0001\u0000\u0000\u0000NO\u0005=\u0000\u0000O\u0012\u0001\u0000\u0000"+
		"\u0000PQ\u0005(\u0000\u0000QR\u0005)\u0000\u0000R\u0014\u0001\u0000\u0000"+
		"\u0000ST\u0005*\u0000\u0000T\u0016\u0001\u0000\u0000\u0000UV\u0005/\u0000"+
		"\u0000V\u0018\u0001\u0000\u0000\u0000WX\u0005%\u0000\u0000X\u001a\u0001"+
		"\u0000\u0000\u0000YZ\u0005+\u0000\u0000Z\u001c\u0001\u0000\u0000\u0000"+
		"[\\\u0005-\u0000\u0000\\\u001e\u0001\u0000\u0000\u0000]^\u0005>\u0000"+
		"\u0000^ \u0001\u0000\u0000\u0000_`\u0005<\u0000\u0000`\"\u0001\u0000\u0000"+
		"\u0000ab\u0005=\u0000\u0000bc\u0005=\u0000\u0000c$\u0001\u0000\u0000\u0000"+
		"de\u0005!\u0000\u0000ef\u0005=\u0000\u0000f&\u0001\u0000\u0000\u0000g"+
		"h\u0005i\u0000\u0000hi\u0005n\u0000\u0000i(\u0001\u0000\u0000\u0000jk"+
		"\u0005i\u0000\u0000kl\u0005f\u0000\u0000l*\u0001\u0000\u0000\u0000mn\u0005"+
		"f\u0000\u0000no\u0005i\u0000\u0000o,\u0001\u0000\u0000\u0000pq\u0005i"+
		"\u0000\u0000qr\u0005n\u0000\u0000rs\u0005t\u0000\u0000s.\u0001\u0000\u0000"+
		"\u0000tu\u0005p\u0000\u0000uv\u0005r\u0000\u0000vw\u0005i\u0000\u0000"+
		"wx\u0005n\u0000\u0000xy\u0005t\u0000\u0000y0\u0001\u0000\u0000\u0000z"+
		"{\u0005p\u0000\u0000{|\u0005o\u0000\u0000|}\u0005o\u0000\u0000}~\u0005"+
		"l\u0000\u0000~2\u0001\u0000\u0000\u0000\u007f\u0080\u0005l\u0000\u0000"+
		"\u0080\u0081\u0005o\u0000\u0000\u0081\u0082\u0005o\u0000\u0000\u0082\u0083"+
		"\u0005p\u0000\u0000\u00834\u0001\u0000\u0000\u0000\u0084\u0088\u0007\u0000"+
		"\u0000\u0000\u0085\u0087\u0007\u0001\u0000\u0000\u0086\u0085\u0001\u0000"+
		"\u0000\u0000\u0087\u008a\u0001\u0000\u0000\u0000\u0088\u0086\u0001\u0000"+
		"\u0000\u0000\u0088\u0089\u0001\u0000\u0000\u0000\u00896\u0001\u0000\u0000"+
		"\u0000\u008a\u0088\u0001\u0000\u0000\u0000\u008b\u008d\u0007\u0002\u0000"+
		"\u0000\u008c\u008b\u0001\u0000\u0000\u0000\u008d\u008e\u0001\u0000\u0000"+
		"\u0000\u008e\u008c\u0001\u0000\u0000\u0000\u008e\u008f\u0001\u0000\u0000"+
		"\u0000\u008f8\u0001\u0000\u0000\u0000\u0090\u0092\u0007\u0003\u0000\u0000"+
		"\u0091\u0090\u0001\u0000\u0000\u0000\u0092\u0093\u0001\u0000\u0000\u0000"+
		"\u0093\u0091\u0001\u0000\u0000\u0000\u0093\u0094\u0001\u0000\u0000\u0000"+
		"\u0094\u0095\u0001\u0000\u0000\u0000\u0095\u0096\u0006\u001c\u0000\u0000"+
		"\u0096:\u0001\u0000\u0000\u0000\u0097\u0098\u0005/\u0000\u0000\u0098\u0099"+
		"\u0005/\u0000\u0000\u0099\u009d\u0001\u0000\u0000\u0000\u009a\u009c\t"+
		"\u0000\u0000\u0000\u009b\u009a\u0001\u0000\u0000\u0000\u009c\u009f\u0001"+
		"\u0000\u0000\u0000\u009d\u009e\u0001\u0000\u0000\u0000\u009d\u009b\u0001"+
		"\u0000\u0000\u0000\u009e\u00a1\u0001\u0000\u0000\u0000\u009f\u009d\u0001"+
		"\u0000\u0000\u0000\u00a0\u00a2\u0007\u0004\u0000\u0000\u00a1\u00a0\u0001"+
		"\u0000\u0000\u0000\u00a2\u00a3\u0001\u0000\u0000\u0000\u00a3\u00a4\u0006"+
		"\u001d\u0000\u0000\u00a4<\u0001\u0000\u0000\u0000\u0006\u0000\u0088\u008e"+
		"\u0093\u009d\u00a1\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}