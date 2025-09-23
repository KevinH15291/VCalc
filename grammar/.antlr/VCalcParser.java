// Generated from /Users/cannedbeans/sharedlinuxdir/school/cmput415/VCalcBase/grammar/VCalc.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class VCalcParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		PAR=10, MUL=11, DIV=12, REM=13, ADD=14, SUB=15, GE=16, LE=17, EE=18, NE=19, 
		IN_KW=20, IF_KW=21, FI_KW=22, INT_KW=23, PRINT_KW=24, POOL_KW=25, LOOP_KW=26, 
		ID=27, INT=28, WS=29, LINE_COMMENT=30;
	public static final int
		RULE_file = 0, RULE_statement = 1, RULE_expr = 2, RULE_domain = 3, RULE_generator = 4, 
		RULE_filter = 5, RULE_if = 6, RULE_loop = 7, RULE_decl = 8, RULE_assign = 9, 
		RULE_print = 10;
	private static String[] makeRuleNames() {
		return new String[] {
			"file", "statement", "expr", "domain", "generator", "filter", "if", "loop", 
			"decl", "assign", "print"
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

	@Override
	public String getGrammarFileName() { return "VCalc.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public VCalcParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FileContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(VCalcParser.EOF, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public FileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file; }
	}

	public final FileContext file() throws RecognitionException {
		FileContext _localctx = new FileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_file);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(25);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 220200960L) != 0)) {
				{
				{
				setState(22);
				statement();
				}
				}
				setState(27);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(28);
			match(EOF);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public DeclContext decl() {
			return getRuleContext(DeclContext.class,0);
		}
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public IfContext if_() {
			return getRuleContext(IfContext.class,0);
		}
		public LoopContext loop() {
			return getRuleContext(LoopContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(45);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(30);
				decl();
				setState(31);
				match(T__0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(33);
				assign();
				setState(34);
				match(T__0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(36);
				if_();
				setState(37);
				match(T__0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(39);
				loop();
				setState(40);
				match(T__0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(42);
				print();
				setState(43);
				match(T__0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Range_eContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Range_eContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Equality_eContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode EE() { return getToken(VCalcParser.EE, 0); }
		public TerminalNode NE() { return getToken(VCalcParser.NE, 0); }
		public Equality_eContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Comp_eContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode LE() { return getToken(VCalcParser.LE, 0); }
		public TerminalNode GE() { return getToken(VCalcParser.GE, 0); }
		public Comp_eContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ID_eContext extends ExprContext {
		public TerminalNode ID() { return getToken(VCalcParser.ID, 0); }
		public ID_eContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Index_eContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Index_eContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Domain_eContext extends ExprContext {
		public DomainContext domain() {
			return getRuleContext(DomainContext.class,0);
		}
		public Domain_eContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Parens_eContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Parens_eContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Int_eContext extends ExprContext {
		public TerminalNode INT() { return getToken(VCalcParser.INT, 0); }
		public Int_eContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AddSub_eContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ADD() { return getToken(VCalcParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(VCalcParser.SUB, 0); }
		public AddSub_eContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MulDivMod_eContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MUL() { return getToken(VCalcParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(VCalcParser.DIV, 0); }
		public TerminalNode REM() { return getToken(VCalcParser.REM, 0); }
		public MulDivMod_eContext(ExprContext ctx) { copyFrom(ctx); }
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				{
				_localctx = new Domain_eContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(48);
				domain();
				}
				break;
			case T__4:
				{
				_localctx = new Parens_eContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(49);
				match(T__4);
				setState(50);
				expr(0);
				setState(51);
				match(T__5);
				}
				break;
			case INT:
				{
				_localctx = new Int_eContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(53);
				match(INT);
				}
				break;
			case ID:
				{
				_localctx = new ID_eContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(54);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(79);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(77);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new Range_eContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(57);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(58);
						match(T__3);
						setState(59);
						expr(9);
						}
						break;
					case 2:
						{
						_localctx = new MulDivMod_eContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(60);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(61);
						((MulDivMod_eContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 14336L) != 0)) ) {
							((MulDivMod_eContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(62);
						expr(8);
						}
						break;
					case 3:
						{
						_localctx = new AddSub_eContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(63);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(64);
						((AddSub_eContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
							((AddSub_eContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(65);
						expr(7);
						}
						break;
					case 4:
						{
						_localctx = new Comp_eContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(66);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(67);
						((Comp_eContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==GE || _la==LE) ) {
							((Comp_eContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(68);
						expr(6);
						}
						break;
					case 5:
						{
						_localctx = new Equality_eContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(69);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(70);
						((Equality_eContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==EE || _la==NE) ) {
							((Equality_eContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(71);
						expr(5);
						}
						break;
					case 6:
						{
						_localctx = new Index_eContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(72);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(73);
						match(T__1);
						setState(74);
						expr(0);
						setState(75);
						match(T__2);
						}
						break;
					}
					} 
				}
				setState(81);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DomainContext extends ParserRuleContext {
		public GeneratorContext generator() {
			return getRuleContext(GeneratorContext.class,0);
		}
		public FilterContext filter() {
			return getRuleContext(FilterContext.class,0);
		}
		public DomainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_domain; }
	}

	public final DomainContext domain() throws RecognitionException {
		DomainContext _localctx = new DomainContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_domain);
		try {
			setState(84);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(82);
				generator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(83);
				filter();
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

	@SuppressWarnings("CheckReturnValue")
	public static class GeneratorContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(VCalcParser.ID, 0); }
		public TerminalNode IN_KW() { return getToken(VCalcParser.IN_KW, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public GeneratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_generator; }
	}

	public final GeneratorContext generator() throws RecognitionException {
		GeneratorContext _localctx = new GeneratorContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_generator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			match(T__1);
			setState(87);
			match(ID);
			setState(88);
			match(IN_KW);
			setState(89);
			expr(0);
			setState(90);
			match(T__6);
			setState(91);
			expr(0);
			setState(92);
			match(T__2);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FilterContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(VCalcParser.ID, 0); }
		public TerminalNode IN_KW() { return getToken(VCalcParser.IN_KW, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public FilterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filter; }
	}

	public final FilterContext filter() throws RecognitionException {
		FilterContext _localctx = new FilterContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_filter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			match(T__1);
			setState(95);
			match(ID);
			setState(96);
			match(IN_KW);
			setState(97);
			expr(0);
			setState(98);
			match(T__7);
			setState(99);
			expr(0);
			setState(100);
			match(T__2);
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

	@SuppressWarnings("CheckReturnValue")
	public static class IfContext extends ParserRuleContext {
		public TerminalNode IF_KW() { return getToken(VCalcParser.IF_KW, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode FI_KW() { return getToken(VCalcParser.FI_KW, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public IfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if; }
	}

	public final IfContext if_() throws RecognitionException {
		IfContext _localctx = new IfContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_if);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			match(IF_KW);
			setState(103);
			match(T__4);
			setState(104);
			expr(0);
			setState(105);
			match(T__5);
			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 220200960L) != 0)) {
				{
				{
				setState(106);
				statement();
				}
				}
				setState(111);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(112);
			match(FI_KW);
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

	@SuppressWarnings("CheckReturnValue")
	public static class LoopContext extends ParserRuleContext {
		public TerminalNode LOOP_KW() { return getToken(VCalcParser.LOOP_KW, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode POOL_KW() { return getToken(VCalcParser.POOL_KW, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public LoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop; }
	}

	public final LoopContext loop() throws RecognitionException {
		LoopContext _localctx = new LoopContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_loop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(LOOP_KW);
			setState(115);
			match(T__4);
			setState(116);
			expr(0);
			setState(117);
			match(T__5);
			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 220200960L) != 0)) {
				{
				{
				setState(118);
				statement();
				}
				}
				setState(123);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(124);
			match(POOL_KW);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DeclContext extends ParserRuleContext {
		public Token type;
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public TerminalNode ID() { return getToken(VCalcParser.ID, 0); }
		public DeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl; }
	}

	public final DeclContext decl() throws RecognitionException {
		DeclContext _localctx = new DeclContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			((DeclContext)_localctx).type = match(ID);
			setState(127);
			assign();
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

	@SuppressWarnings("CheckReturnValue")
	public static class AssignContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(VCalcParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			match(ID);
			setState(130);
			match(T__8);
			setState(131);
			expr(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PrintContext extends ParserRuleContext {
		public TerminalNode PRINT_KW() { return getToken(VCalcParser.PRINT_KW, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			match(PRINT_KW);
			setState(134);
			match(T__4);
			setState(135);
			expr(0);
			setState(136);
			match(T__5);
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
		case 2:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 8);
		case 1:
			return precpred(_ctx, 7);
		case 2:
			return precpred(_ctx, 6);
		case 3:
			return precpred(_ctx, 5);
		case 4:
			return precpred(_ctx, 4);
		case 5:
			return precpred(_ctx, 9);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u001e\u008b\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0001\u0000\u0005\u0000"+
		"\u0018\b\u0000\n\u0000\f\u0000\u001b\t\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0003\u0001.\b\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0003\u00028\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002N\b"+
		"\u0002\n\u0002\f\u0002Q\t\u0002\u0001\u0003\u0001\u0003\u0003\u0003U\b"+
		"\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006l\b\u0006\n\u0006"+
		"\f\u0006o\t\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0005\u0007x\b\u0007\n\u0007\f\u0007{\t"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t"+
		"\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0000"+
		"\u0001\u0004\u000b\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014"+
		"\u0000\u0004\u0001\u0000\u000b\r\u0001\u0000\u000e\u000f\u0001\u0000\u0010"+
		"\u0011\u0001\u0000\u0012\u0013\u0090\u0000\u0019\u0001\u0000\u0000\u0000"+
		"\u0002-\u0001\u0000\u0000\u0000\u00047\u0001\u0000\u0000\u0000\u0006T"+
		"\u0001\u0000\u0000\u0000\bV\u0001\u0000\u0000\u0000\n^\u0001\u0000\u0000"+
		"\u0000\ff\u0001\u0000\u0000\u0000\u000er\u0001\u0000\u0000\u0000\u0010"+
		"~\u0001\u0000\u0000\u0000\u0012\u0081\u0001\u0000\u0000\u0000\u0014\u0085"+
		"\u0001\u0000\u0000\u0000\u0016\u0018\u0003\u0002\u0001\u0000\u0017\u0016"+
		"\u0001\u0000\u0000\u0000\u0018\u001b\u0001\u0000\u0000\u0000\u0019\u0017"+
		"\u0001\u0000\u0000\u0000\u0019\u001a\u0001\u0000\u0000\u0000\u001a\u001c"+
		"\u0001\u0000\u0000\u0000\u001b\u0019\u0001\u0000\u0000\u0000\u001c\u001d"+
		"\u0005\u0000\u0000\u0001\u001d\u0001\u0001\u0000\u0000\u0000\u001e\u001f"+
		"\u0003\u0010\b\u0000\u001f \u0005\u0001\u0000\u0000 .\u0001\u0000\u0000"+
		"\u0000!\"\u0003\u0012\t\u0000\"#\u0005\u0001\u0000\u0000#.\u0001\u0000"+
		"\u0000\u0000$%\u0003\f\u0006\u0000%&\u0005\u0001\u0000\u0000&.\u0001\u0000"+
		"\u0000\u0000\'(\u0003\u000e\u0007\u0000()\u0005\u0001\u0000\u0000).\u0001"+
		"\u0000\u0000\u0000*+\u0003\u0014\n\u0000+,\u0005\u0001\u0000\u0000,.\u0001"+
		"\u0000\u0000\u0000-\u001e\u0001\u0000\u0000\u0000-!\u0001\u0000\u0000"+
		"\u0000-$\u0001\u0000\u0000\u0000-\'\u0001\u0000\u0000\u0000-*\u0001\u0000"+
		"\u0000\u0000.\u0003\u0001\u0000\u0000\u0000/0\u0006\u0002\uffff\uffff"+
		"\u000008\u0003\u0006\u0003\u000012\u0005\u0005\u0000\u000023\u0003\u0004"+
		"\u0002\u000034\u0005\u0006\u0000\u000048\u0001\u0000\u0000\u000058\u0005"+
		"\u001c\u0000\u000068\u0005\u001b\u0000\u00007/\u0001\u0000\u0000\u0000"+
		"71\u0001\u0000\u0000\u000075\u0001\u0000\u0000\u000076\u0001\u0000\u0000"+
		"\u00008O\u0001\u0000\u0000\u00009:\n\b\u0000\u0000:;\u0005\u0004\u0000"+
		"\u0000;N\u0003\u0004\u0002\t<=\n\u0007\u0000\u0000=>\u0007\u0000\u0000"+
		"\u0000>N\u0003\u0004\u0002\b?@\n\u0006\u0000\u0000@A\u0007\u0001\u0000"+
		"\u0000AN\u0003\u0004\u0002\u0007BC\n\u0005\u0000\u0000CD\u0007\u0002\u0000"+
		"\u0000DN\u0003\u0004\u0002\u0006EF\n\u0004\u0000\u0000FG\u0007\u0003\u0000"+
		"\u0000GN\u0003\u0004\u0002\u0005HI\n\t\u0000\u0000IJ\u0005\u0002\u0000"+
		"\u0000JK\u0003\u0004\u0002\u0000KL\u0005\u0003\u0000\u0000LN\u0001\u0000"+
		"\u0000\u0000M9\u0001\u0000\u0000\u0000M<\u0001\u0000\u0000\u0000M?\u0001"+
		"\u0000\u0000\u0000MB\u0001\u0000\u0000\u0000ME\u0001\u0000\u0000\u0000"+
		"MH\u0001\u0000\u0000\u0000NQ\u0001\u0000\u0000\u0000OM\u0001\u0000\u0000"+
		"\u0000OP\u0001\u0000\u0000\u0000P\u0005\u0001\u0000\u0000\u0000QO\u0001"+
		"\u0000\u0000\u0000RU\u0003\b\u0004\u0000SU\u0003\n\u0005\u0000TR\u0001"+
		"\u0000\u0000\u0000TS\u0001\u0000\u0000\u0000U\u0007\u0001\u0000\u0000"+
		"\u0000VW\u0005\u0002\u0000\u0000WX\u0005\u001b\u0000\u0000XY\u0005\u0014"+
		"\u0000\u0000YZ\u0003\u0004\u0002\u0000Z[\u0005\u0007\u0000\u0000[\\\u0003"+
		"\u0004\u0002\u0000\\]\u0005\u0003\u0000\u0000]\t\u0001\u0000\u0000\u0000"+
		"^_\u0005\u0002\u0000\u0000_`\u0005\u001b\u0000\u0000`a\u0005\u0014\u0000"+
		"\u0000ab\u0003\u0004\u0002\u0000bc\u0005\b\u0000\u0000cd\u0003\u0004\u0002"+
		"\u0000de\u0005\u0003\u0000\u0000e\u000b\u0001\u0000\u0000\u0000fg\u0005"+
		"\u0015\u0000\u0000gh\u0005\u0005\u0000\u0000hi\u0003\u0004\u0002\u0000"+
		"im\u0005\u0006\u0000\u0000jl\u0003\u0002\u0001\u0000kj\u0001\u0000\u0000"+
		"\u0000lo\u0001\u0000\u0000\u0000mk\u0001\u0000\u0000\u0000mn\u0001\u0000"+
		"\u0000\u0000np\u0001\u0000\u0000\u0000om\u0001\u0000\u0000\u0000pq\u0005"+
		"\u0016\u0000\u0000q\r\u0001\u0000\u0000\u0000rs\u0005\u001a\u0000\u0000"+
		"st\u0005\u0005\u0000\u0000tu\u0003\u0004\u0002\u0000uy\u0005\u0006\u0000"+
		"\u0000vx\u0003\u0002\u0001\u0000wv\u0001\u0000\u0000\u0000x{\u0001\u0000"+
		"\u0000\u0000yw\u0001\u0000\u0000\u0000yz\u0001\u0000\u0000\u0000z|\u0001"+
		"\u0000\u0000\u0000{y\u0001\u0000\u0000\u0000|}\u0005\u0019\u0000\u0000"+
		"}\u000f\u0001\u0000\u0000\u0000~\u007f\u0005\u001b\u0000\u0000\u007f\u0080"+
		"\u0003\u0012\t\u0000\u0080\u0011\u0001\u0000\u0000\u0000\u0081\u0082\u0005"+
		"\u001b\u0000\u0000\u0082\u0083\u0005\t\u0000\u0000\u0083\u0084\u0003\u0004"+
		"\u0002\u0000\u0084\u0013\u0001\u0000\u0000\u0000\u0085\u0086\u0005\u0018"+
		"\u0000\u0000\u0086\u0087\u0005\u0005\u0000\u0000\u0087\u0088\u0003\u0004"+
		"\u0002\u0000\u0088\u0089\u0005\u0006\u0000\u0000\u0089\u0015\u0001\u0000"+
		"\u0000\u0000\b\u0019-7MOTmy";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}