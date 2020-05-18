package gen;// Generated from D:/yapis/ListCompiler1/src/main/java\Grammar.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		STRING=1, OPEN_CURLY_BRACKET=2, CLOSE_CURLY_BRACKET=3, OPEN_BRACKET=4, 
		CLOSE_BRACKET=5, PRINT=6, VOID=7, LIST=8, ELEMENT=9, COMMA=10, NAME=11, 
		NUMBER=12, ASSIGNMENT=13, FOR=14, IS_EMPTY=15, CONTAINS=16, IF=17, ELSE=18, 
		EQUAL=19, CLEAR=20, ADD=21, GET=22, REMOVE=23, SIZE=24, GE=25, GT=26, 
		LE=27, LT=28, PLUS=29, SKIP_=30, NEWLINE=31, INDENT=32, DEDENT=33;
	public static final int
		RULE_program = 0, RULE_block = 1, RULE_print = 2, RULE_content = 3, RULE_type = 4, 
		RULE_functionDefine = 5, RULE_functionCall = 6, RULE_forCycle = 7, RULE_elementDeclaration = 8, 
		RULE_listDeclaration = 9, RULE_equalNames = 10, RULE_contains = 11, RULE_is_empty = 12, 
		RULE_compare = 13, RULE_ifBlock = 14, RULE_elseBlock = 15, RULE_add = 16, 
		RULE_clear = 17, RULE_get = 18, RULE_remove = 19, RULE_size = 20, RULE_compareGE = 21, 
		RULE_compareGT = 22, RULE_compareLE = 23, RULE_compareLT = 24, RULE_compareEQ = 25, 
		RULE_concate = 26;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "block", "print", "content", "type", "functionDefine", "functionCall", 
			"forCycle", "elementDeclaration", "listDeclaration", "equalNames", "contains", 
			"is_empty", "compare", "ifBlock", "elseBlock", "add", "clear", "get", 
			"remove", "size", "compareGE", "compareGT", "compareLE", "compareLT", 
			"compareEQ", "concate"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'{'", "'}'", "'('", "')'", "'Print'", "'Void'", "'List'", 
			"'Element'", "','", null, null, "'='", "'For'", "'IsEmpty'", "'Contains'", 
			"'If'", "'Else'", "'=='", "'Clear'", "'Add'", "'Get'", "'Remove'", "'Size'", 
			"'>='", "'>'", "'<='", "'<'", "'+'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "STRING", "OPEN_CURLY_BRACKET", "CLOSE_CURLY_BRACKET", "OPEN_BRACKET", 
			"CLOSE_BRACKET", "PRINT", "VOID", "LIST", "ELEMENT", "COMMA", "NAME", 
			"NUMBER", "ASSIGNMENT", "FOR", "IS_EMPTY", "CONTAINS", "IF", "ELSE", 
			"EQUAL", "CLEAR", "ADD", "GET", "REMOVE", "SIZE", "GE", "GT", "LE", "LT", 
			"PLUS", "SKIP_", "NEWLINE", "INDENT", "DEDENT"
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
	public String getGrammarFileName() { return "Grammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(GrammarParser.EOF, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(GrammarParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(GrammarParser.NEWLINE, i);
		}
		public List<ContentContext> content() {
			return getRuleContexts(ContentContext.class);
		}
		public ContentContext content(int i) {
			return getRuleContext(ContentContext.class,i);
		}
		public List<FunctionDefineContext> functionDefine() {
			return getRuleContexts(FunctionDefineContext.class);
		}
		public FunctionDefineContext functionDefine(int i) {
			return getRuleContext(FunctionDefineContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << LIST) | (1L << ELEMENT) | (1L << NAME) | (1L << FOR) | (1L << IF) | (1L << CLEAR) | (1L << ADD) | (1L << REMOVE) | (1L << PLUS) | (1L << NEWLINE))) != 0)) {
				{
				setState(56);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NEWLINE:
					{
					setState(54);
					match(NEWLINE);
					}
					break;
				case PRINT:
				case LIST:
				case ELEMENT:
				case NAME:
				case FOR:
				case IF:
				case CLEAR:
				case ADD:
				case REMOVE:
				case PLUS:
					{
					setState(55);
					content();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(60);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(64);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VOID) {
				{
				{
				setState(61);
				functionDefine();
				}
				}
				setState(66);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(67);
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

	public static class BlockContext extends ParserRuleContext {
		public List<TerminalNode> NEWLINE() { return getTokens(GrammarParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(GrammarParser.NEWLINE, i);
		}
		public TerminalNode INDENT() { return getToken(GrammarParser.INDENT, 0); }
		public TerminalNode DEDENT() { return getToken(GrammarParser.DEDENT, 0); }
		public List<ContentContext> content() {
			return getRuleContexts(ContentContext.class);
		}
		public ContentContext content(int i) {
			return getRuleContext(ContentContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			match(NEWLINE);
			setState(70);
			match(INDENT);
			setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << LIST) | (1L << ELEMENT) | (1L << NAME) | (1L << FOR) | (1L << IF) | (1L << CLEAR) | (1L << ADD) | (1L << REMOVE) | (1L << PLUS))) != 0)) {
				{
				{
				setState(71);
				content();
				setState(72);
				match(NEWLINE);
				}
				}
				setState(78);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(79);
			match(DEDENT);
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

	public static class PrintContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(GrammarParser.PRINT, 0); }
		public TerminalNode OPEN_BRACKET() { return getToken(GrammarParser.OPEN_BRACKET, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(GrammarParser.CLOSE_BRACKET, 0); }
		public TerminalNode STRING() { return getToken(GrammarParser.STRING, 0); }
		public TerminalNode NAME() { return getToken(GrammarParser.NAME, 0); }
		public SizeContext size() {
			return getRuleContext(SizeContext.class,0);
		}
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitPrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			match(PRINT);
			setState(82);
			match(OPEN_BRACKET);
			setState(86);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				{
				setState(83);
				match(STRING);
				}
				break;
			case NAME:
				{
				setState(84);
				match(NAME);
				}
				break;
			case SIZE:
				{
				setState(85);
				size();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(88);
			match(CLOSE_BRACKET);
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

	public static class ContentContext extends ParserRuleContext {
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public ForCycleContext forCycle() {
			return getRuleContext(ForCycleContext.class,0);
		}
		public ElementDeclarationContext elementDeclaration() {
			return getRuleContext(ElementDeclarationContext.class,0);
		}
		public ListDeclarationContext listDeclaration() {
			return getRuleContext(ListDeclarationContext.class,0);
		}
		public IfBlockContext ifBlock() {
			return getRuleContext(IfBlockContext.class,0);
		}
		public AddContext add() {
			return getRuleContext(AddContext.class,0);
		}
		public ClearContext clear() {
			return getRuleContext(ClearContext.class,0);
		}
		public RemoveContext remove() {
			return getRuleContext(RemoveContext.class,0);
		}
		public ConcateContext concate() {
			return getRuleContext(ConcateContext.class,0);
		}
		public ContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_content; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContentContext content() throws RecognitionException {
		ContentContext _localctx = new ContentContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_content);
		try {
			setState(100);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(90);
				print();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(91);
				functionCall();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(92);
				forCycle();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(93);
				elementDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(94);
				listDeclaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(95);
				ifBlock();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(96);
				add();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(97);
				clear();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(98);
				remove();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(99);
				concate();
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode LIST() { return getToken(GrammarParser.LIST, 0); }
		public TerminalNode ELEMENT() { return getToken(GrammarParser.ELEMENT, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			_la = _input.LA(1);
			if ( !(_la==LIST || _la==ELEMENT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class FunctionDefineContext extends ParserRuleContext {
		public TerminalNode VOID() { return getToken(GrammarParser.VOID, 0); }
		public List<TerminalNode> NAME() { return getTokens(GrammarParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(GrammarParser.NAME, i);
		}
		public TerminalNode OPEN_BRACKET() { return getToken(GrammarParser.OPEN_BRACKET, 0); }
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public TerminalNode CLOSE_BRACKET() { return getToken(GrammarParser.CLOSE_BRACKET, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(GrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GrammarParser.COMMA, i);
		}
		public FunctionDefineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDefine; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterFunctionDefine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitFunctionDefine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitFunctionDefine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDefineContext functionDefine() throws RecognitionException {
		FunctionDefineContext _localctx = new FunctionDefineContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_functionDefine);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			match(VOID);
			setState(105);
			match(NAME);
			setState(106);
			match(OPEN_BRACKET);
			setState(107);
			type();
			setState(108);
			match(NAME);
			setState(115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(109);
				match(COMMA);
				setState(110);
				type();
				setState(111);
				match(NAME);
				}
				}
				setState(117);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(118);
			match(CLOSE_BRACKET);
			setState(119);
			block();
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

	public static class FunctionCallContext extends ParserRuleContext {
		public List<TerminalNode> NAME() { return getTokens(GrammarParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(GrammarParser.NAME, i);
		}
		public TerminalNode OPEN_BRACKET() { return getToken(GrammarParser.OPEN_BRACKET, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(GrammarParser.CLOSE_BRACKET, 0); }
		public List<TerminalNode> COMMA() { return getTokens(GrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GrammarParser.COMMA, i);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_functionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			match(NAME);
			setState(122);
			match(OPEN_BRACKET);
			setState(123);
			match(NAME);
			setState(128);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(124);
				match(COMMA);
				setState(125);
				match(NAME);
				}
				}
				setState(130);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(131);
			match(CLOSE_BRACKET);
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

	public static class ForCycleContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(GrammarParser.FOR, 0); }
		public TerminalNode OPEN_BRACKET() { return getToken(GrammarParser.OPEN_BRACKET, 0); }
		public List<TerminalNode> NAME() { return getTokens(GrammarParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(GrammarParser.NAME, i);
		}
		public TerminalNode COMMA() { return getToken(GrammarParser.COMMA, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(GrammarParser.CLOSE_BRACKET, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ForCycleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forCycle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterForCycle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitForCycle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitForCycle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForCycleContext forCycle() throws RecognitionException {
		ForCycleContext _localctx = new ForCycleContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_forCycle);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			match(FOR);
			setState(134);
			match(OPEN_BRACKET);
			setState(135);
			match(NAME);
			setState(136);
			match(COMMA);
			setState(137);
			match(NAME);
			setState(138);
			match(CLOSE_BRACKET);
			setState(139);
			block();
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

	public static class ElementDeclarationContext extends ParserRuleContext {
		public List<TerminalNode> NAME() { return getTokens(GrammarParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(GrammarParser.NAME, i);
		}
		public TerminalNode ASSIGNMENT() { return getToken(GrammarParser.ASSIGNMENT, 0); }
		public TerminalNode STRING() { return getToken(GrammarParser.STRING, 0); }
		public GetContext get() {
			return getRuleContext(GetContext.class,0);
		}
		public TerminalNode ELEMENT() { return getToken(GrammarParser.ELEMENT, 0); }
		public ElementDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterElementDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitElementDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitElementDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementDeclarationContext elementDeclaration() throws RecognitionException {
		ElementDeclarationContext _localctx = new ElementDeclarationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_elementDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELEMENT) {
				{
				setState(141);
				match(ELEMENT);
				}
			}

			setState(144);
			match(NAME);
			setState(145);
			match(ASSIGNMENT);
			setState(149);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				{
				setState(146);
				match(STRING);
				}
				break;
			case NAME:
				{
				setState(147);
				match(NAME);
				}
				break;
			case GET:
				{
				setState(148);
				get();
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

	public static class ListDeclarationContext extends ParserRuleContext {
		public TerminalNode LIST() { return getToken(GrammarParser.LIST, 0); }
		public List<TerminalNode> NAME() { return getTokens(GrammarParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(GrammarParser.NAME, i);
		}
		public TerminalNode ASSIGNMENT() { return getToken(GrammarParser.ASSIGNMENT, 0); }
		public ListDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterListDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitListDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitListDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListDeclarationContext listDeclaration() throws RecognitionException {
		ListDeclarationContext _localctx = new ListDeclarationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_listDeclaration);
		int _la;
		try {
			setState(159);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(151);
				match(LIST);
				setState(152);
				match(NAME);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(154);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LIST) {
					{
					setState(153);
					match(LIST);
					}
				}

				setState(156);
				match(NAME);
				setState(157);
				match(ASSIGNMENT);
				setState(158);
				match(NAME);
				}
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

	public static class EqualNamesContext extends ParserRuleContext {
		public List<TerminalNode> NAME() { return getTokens(GrammarParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(GrammarParser.NAME, i);
		}
		public TerminalNode EQUAL() { return getToken(GrammarParser.EQUAL, 0); }
		public EqualNamesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalNames; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterEqualNames(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitEqualNames(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitEqualNames(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqualNamesContext equalNames() throws RecognitionException {
		EqualNamesContext _localctx = new EqualNamesContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_equalNames);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			match(NAME);
			setState(162);
			match(EQUAL);
			setState(163);
			match(NAME);
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

	public static class ContainsContext extends ParserRuleContext {
		public TerminalNode CONTAINS() { return getToken(GrammarParser.CONTAINS, 0); }
		public TerminalNode OPEN_BRACKET() { return getToken(GrammarParser.OPEN_BRACKET, 0); }
		public List<TerminalNode> NAME() { return getTokens(GrammarParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(GrammarParser.NAME, i);
		}
		public TerminalNode COMMA() { return getToken(GrammarParser.COMMA, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(GrammarParser.CLOSE_BRACKET, 0); }
		public ContainsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contains; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterContains(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitContains(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitContains(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContainsContext contains() throws RecognitionException {
		ContainsContext _localctx = new ContainsContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_contains);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			match(CONTAINS);
			setState(166);
			match(OPEN_BRACKET);
			setState(167);
			match(NAME);
			setState(168);
			match(COMMA);
			setState(169);
			match(NAME);
			setState(170);
			match(CLOSE_BRACKET);
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

	public static class Is_emptyContext extends ParserRuleContext {
		public TerminalNode IS_EMPTY() { return getToken(GrammarParser.IS_EMPTY, 0); }
		public TerminalNode OPEN_BRACKET() { return getToken(GrammarParser.OPEN_BRACKET, 0); }
		public TerminalNode NAME() { return getToken(GrammarParser.NAME, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(GrammarParser.CLOSE_BRACKET, 0); }
		public Is_emptyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_is_empty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterIs_empty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitIs_empty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitIs_empty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Is_emptyContext is_empty() throws RecognitionException {
		Is_emptyContext _localctx = new Is_emptyContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_is_empty);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			match(IS_EMPTY);
			setState(173);
			match(OPEN_BRACKET);
			setState(174);
			match(NAME);
			setState(175);
			match(CLOSE_BRACKET);
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

	public static class CompareContext extends ParserRuleContext {
		public EqualNamesContext equalNames() {
			return getRuleContext(EqualNamesContext.class,0);
		}
		public ContainsContext contains() {
			return getRuleContext(ContainsContext.class,0);
		}
		public Is_emptyContext is_empty() {
			return getRuleContext(Is_emptyContext.class,0);
		}
		public CompareGEContext compareGE() {
			return getRuleContext(CompareGEContext.class,0);
		}
		public CompareGTContext compareGT() {
			return getRuleContext(CompareGTContext.class,0);
		}
		public CompareLEContext compareLE() {
			return getRuleContext(CompareLEContext.class,0);
		}
		public CompareLTContext compareLT() {
			return getRuleContext(CompareLTContext.class,0);
		}
		public CompareEQContext compareEQ() {
			return getRuleContext(CompareEQContext.class,0);
		}
		public CompareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compare; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterCompare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitCompare(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitCompare(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompareContext compare() throws RecognitionException {
		CompareContext _localctx = new CompareContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_compare);
		try {
			setState(185);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(177);
				equalNames();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(178);
				contains();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(179);
				is_empty();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(180);
				compareGE();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(181);
				compareGT();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(182);
				compareLE();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(183);
				compareLT();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(184);
				compareEQ();
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

	public static class IfBlockContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(GrammarParser.IF, 0); }
		public TerminalNode OPEN_BRACKET() { return getToken(GrammarParser.OPEN_BRACKET, 0); }
		public CompareContext compare() {
			return getRuleContext(CompareContext.class,0);
		}
		public TerminalNode CLOSE_BRACKET() { return getToken(GrammarParser.CLOSE_BRACKET, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ElseBlockContext elseBlock() {
			return getRuleContext(ElseBlockContext.class,0);
		}
		public IfBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterIfBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitIfBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitIfBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfBlockContext ifBlock() throws RecognitionException {
		IfBlockContext _localctx = new IfBlockContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_ifBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			match(IF);
			setState(188);
			match(OPEN_BRACKET);
			setState(189);
			compare();
			setState(190);
			match(CLOSE_BRACKET);
			setState(191);
			block();
			setState(193);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(192);
				elseBlock();
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

	public static class ElseBlockContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(GrammarParser.ELSE, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ElseBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterElseBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitElseBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitElseBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseBlockContext elseBlock() throws RecognitionException {
		ElseBlockContext _localctx = new ElseBlockContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_elseBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			match(ELSE);
			setState(196);
			block();
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

	public static class AddContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(GrammarParser.ADD, 0); }
		public TerminalNode OPEN_BRACKET() { return getToken(GrammarParser.OPEN_BRACKET, 0); }
		public List<TerminalNode> NAME() { return getTokens(GrammarParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(GrammarParser.NAME, i);
		}
		public TerminalNode COMMA() { return getToken(GrammarParser.COMMA, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(GrammarParser.CLOSE_BRACKET, 0); }
		public AddContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_add; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterAdd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitAdd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitAdd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddContext add() throws RecognitionException {
		AddContext _localctx = new AddContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_add);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			match(ADD);
			setState(199);
			match(OPEN_BRACKET);
			setState(200);
			match(NAME);
			setState(201);
			match(COMMA);
			setState(202);
			match(NAME);
			setState(203);
			match(CLOSE_BRACKET);
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

	public static class ClearContext extends ParserRuleContext {
		public TerminalNode CLEAR() { return getToken(GrammarParser.CLEAR, 0); }
		public TerminalNode OPEN_BRACKET() { return getToken(GrammarParser.OPEN_BRACKET, 0); }
		public TerminalNode NAME() { return getToken(GrammarParser.NAME, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(GrammarParser.CLOSE_BRACKET, 0); }
		public ClearContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_clear; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterClear(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitClear(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitClear(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClearContext clear() throws RecognitionException {
		ClearContext _localctx = new ClearContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_clear);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			match(CLEAR);
			setState(206);
			match(OPEN_BRACKET);
			setState(207);
			match(NAME);
			setState(208);
			match(CLOSE_BRACKET);
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

	public static class GetContext extends ParserRuleContext {
		public TerminalNode GET() { return getToken(GrammarParser.GET, 0); }
		public TerminalNode OPEN_BRACKET() { return getToken(GrammarParser.OPEN_BRACKET, 0); }
		public TerminalNode NAME() { return getToken(GrammarParser.NAME, 0); }
		public TerminalNode COMMA() { return getToken(GrammarParser.COMMA, 0); }
		public TerminalNode NUMBER() { return getToken(GrammarParser.NUMBER, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(GrammarParser.CLOSE_BRACKET, 0); }
		public GetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_get; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterGet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitGet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitGet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GetContext get() throws RecognitionException {
		GetContext _localctx = new GetContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_get);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			match(GET);
			setState(211);
			match(OPEN_BRACKET);
			setState(212);
			match(NAME);
			setState(213);
			match(COMMA);
			setState(214);
			match(NUMBER);
			setState(215);
			match(CLOSE_BRACKET);
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

	public static class RemoveContext extends ParserRuleContext {
		public TerminalNode REMOVE() { return getToken(GrammarParser.REMOVE, 0); }
		public TerminalNode OPEN_BRACKET() { return getToken(GrammarParser.OPEN_BRACKET, 0); }
		public List<TerminalNode> NAME() { return getTokens(GrammarParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(GrammarParser.NAME, i);
		}
		public TerminalNode COMMA() { return getToken(GrammarParser.COMMA, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(GrammarParser.CLOSE_BRACKET, 0); }
		public TerminalNode NUMBER() { return getToken(GrammarParser.NUMBER, 0); }
		public RemoveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_remove; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterRemove(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitRemove(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitRemove(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RemoveContext remove() throws RecognitionException {
		RemoveContext _localctx = new RemoveContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_remove);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			match(REMOVE);
			setState(218);
			match(OPEN_BRACKET);
			setState(219);
			match(NAME);
			setState(220);
			match(COMMA);
			setState(221);
			_la = _input.LA(1);
			if ( !(_la==NAME || _la==NUMBER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(222);
			match(CLOSE_BRACKET);
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

	public static class SizeContext extends ParserRuleContext {
		public TerminalNode SIZE() { return getToken(GrammarParser.SIZE, 0); }
		public TerminalNode OPEN_BRACKET() { return getToken(GrammarParser.OPEN_BRACKET, 0); }
		public TerminalNode NAME() { return getToken(GrammarParser.NAME, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(GrammarParser.CLOSE_BRACKET, 0); }
		public SizeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_size; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterSize(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitSize(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitSize(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SizeContext size() throws RecognitionException {
		SizeContext _localctx = new SizeContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_size);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			match(SIZE);
			setState(225);
			match(OPEN_BRACKET);
			setState(226);
			match(NAME);
			setState(227);
			match(CLOSE_BRACKET);
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

	public static class CompareGEContext extends ParserRuleContext {
		public SizeContext size() {
			return getRuleContext(SizeContext.class,0);
		}
		public TerminalNode GE() { return getToken(GrammarParser.GE, 0); }
		public TerminalNode NUMBER() { return getToken(GrammarParser.NUMBER, 0); }
		public CompareGEContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compareGE; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterCompareGE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitCompareGE(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitCompareGE(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompareGEContext compareGE() throws RecognitionException {
		CompareGEContext _localctx = new CompareGEContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_compareGE);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			size();
			setState(230);
			match(GE);
			setState(231);
			match(NUMBER);
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

	public static class CompareGTContext extends ParserRuleContext {
		public SizeContext size() {
			return getRuleContext(SizeContext.class,0);
		}
		public TerminalNode GT() { return getToken(GrammarParser.GT, 0); }
		public TerminalNode NUMBER() { return getToken(GrammarParser.NUMBER, 0); }
		public CompareGTContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compareGT; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterCompareGT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitCompareGT(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitCompareGT(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompareGTContext compareGT() throws RecognitionException {
		CompareGTContext _localctx = new CompareGTContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_compareGT);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			size();
			setState(234);
			match(GT);
			setState(235);
			match(NUMBER);
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

	public static class CompareLEContext extends ParserRuleContext {
		public SizeContext size() {
			return getRuleContext(SizeContext.class,0);
		}
		public TerminalNode LE() { return getToken(GrammarParser.LE, 0); }
		public TerminalNode NUMBER() { return getToken(GrammarParser.NUMBER, 0); }
		public CompareLEContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compareLE; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterCompareLE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitCompareLE(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitCompareLE(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompareLEContext compareLE() throws RecognitionException {
		CompareLEContext _localctx = new CompareLEContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_compareLE);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			size();
			setState(238);
			match(LE);
			setState(239);
			match(NUMBER);
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

	public static class CompareLTContext extends ParserRuleContext {
		public SizeContext size() {
			return getRuleContext(SizeContext.class,0);
		}
		public TerminalNode LT() { return getToken(GrammarParser.LT, 0); }
		public TerminalNode NUMBER() { return getToken(GrammarParser.NUMBER, 0); }
		public CompareLTContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compareLT; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterCompareLT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitCompareLT(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitCompareLT(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompareLTContext compareLT() throws RecognitionException {
		CompareLTContext _localctx = new CompareLTContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_compareLT);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			size();
			setState(242);
			match(LT);
			setState(243);
			match(NUMBER);
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

	public static class CompareEQContext extends ParserRuleContext {
		public SizeContext size() {
			return getRuleContext(SizeContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(GrammarParser.EQUAL, 0); }
		public TerminalNode NUMBER() { return getToken(GrammarParser.NUMBER, 0); }
		public CompareEQContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compareEQ; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterCompareEQ(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitCompareEQ(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitCompareEQ(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompareEQContext compareEQ() throws RecognitionException {
		CompareEQContext _localctx = new CompareEQContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_compareEQ);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			size();
			setState(246);
			match(EQUAL);
			setState(247);
			match(NUMBER);
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

	public static class ConcateContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(GrammarParser.PLUS, 0); }
		public TerminalNode OPEN_BRACKET() { return getToken(GrammarParser.OPEN_BRACKET, 0); }
		public List<TerminalNode> NAME() { return getTokens(GrammarParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(GrammarParser.NAME, i);
		}
		public TerminalNode COMMA() { return getToken(GrammarParser.COMMA, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(GrammarParser.CLOSE_BRACKET, 0); }
		public ConcateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_concate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterConcate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitConcate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitConcate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConcateContext concate() throws RecognitionException {
		ConcateContext _localctx = new ConcateContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_concate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			match(PLUS);
			setState(250);
			match(OPEN_BRACKET);
			setState(251);
			match(NAME);
			setState(252);
			match(COMMA);
			setState(253);
			match(NAME);
			setState(254);
			match(CLOSE_BRACKET);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3#\u0103\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\7\2;\n\2\f\2\16\2>\13\2\3\2\7\2"+
		"A\n\2\f\2\16\2D\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\7\3M\n\3\f\3\16\3P\13"+
		"\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\5\4Y\n\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\5\5g\n\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\7\7t\n\7\f\7\16\7w\13\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\7\b\u0081\n"+
		"\b\f\b\16\b\u0084\13\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\5\n"+
		"\u0091\n\n\3\n\3\n\3\n\3\n\3\n\5\n\u0098\n\n\3\13\3\13\3\13\5\13\u009d"+
		"\n\13\3\13\3\13\3\13\5\13\u00a2\n\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\5\17\u00bc\n\17\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00c4\n\20\3"+
		"\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3"+
		"\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3"+
		"\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\34\3\34\3"+
		"\34\3\34\3\34\3\34\3\34\3\34\2\2\35\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \"$&(*,.\60\62\64\66\2\4\3\2\n\13\3\2\r\16\2\u0105\2<\3\2\2\2\4G\3"+
		"\2\2\2\6S\3\2\2\2\bf\3\2\2\2\nh\3\2\2\2\fj\3\2\2\2\16{\3\2\2\2\20\u0087"+
		"\3\2\2\2\22\u0090\3\2\2\2\24\u00a1\3\2\2\2\26\u00a3\3\2\2\2\30\u00a7\3"+
		"\2\2\2\32\u00ae\3\2\2\2\34\u00bb\3\2\2\2\36\u00bd\3\2\2\2 \u00c5\3\2\2"+
		"\2\"\u00c8\3\2\2\2$\u00cf\3\2\2\2&\u00d4\3\2\2\2(\u00db\3\2\2\2*\u00e2"+
		"\3\2\2\2,\u00e7\3\2\2\2.\u00eb\3\2\2\2\60\u00ef\3\2\2\2\62\u00f3\3\2\2"+
		"\2\64\u00f7\3\2\2\2\66\u00fb\3\2\2\28;\7!\2\29;\5\b\5\2:8\3\2\2\2:9\3"+
		"\2\2\2;>\3\2\2\2<:\3\2\2\2<=\3\2\2\2=B\3\2\2\2><\3\2\2\2?A\5\f\7\2@?\3"+
		"\2\2\2AD\3\2\2\2B@\3\2\2\2BC\3\2\2\2CE\3\2\2\2DB\3\2\2\2EF\7\2\2\3F\3"+
		"\3\2\2\2GH\7!\2\2HN\7\"\2\2IJ\5\b\5\2JK\7!\2\2KM\3\2\2\2LI\3\2\2\2MP\3"+
		"\2\2\2NL\3\2\2\2NO\3\2\2\2OQ\3\2\2\2PN\3\2\2\2QR\7#\2\2R\5\3\2\2\2ST\7"+
		"\b\2\2TX\7\6\2\2UY\7\3\2\2VY\7\r\2\2WY\5*\26\2XU\3\2\2\2XV\3\2\2\2XW\3"+
		"\2\2\2YZ\3\2\2\2Z[\7\7\2\2[\7\3\2\2\2\\g\5\6\4\2]g\5\16\b\2^g\5\20\t\2"+
		"_g\5\22\n\2`g\5\24\13\2ag\5\36\20\2bg\5\"\22\2cg\5$\23\2dg\5(\25\2eg\5"+
		"\66\34\2f\\\3\2\2\2f]\3\2\2\2f^\3\2\2\2f_\3\2\2\2f`\3\2\2\2fa\3\2\2\2"+
		"fb\3\2\2\2fc\3\2\2\2fd\3\2\2\2fe\3\2\2\2g\t\3\2\2\2hi\t\2\2\2i\13\3\2"+
		"\2\2jk\7\t\2\2kl\7\r\2\2lm\7\6\2\2mn\5\n\6\2nu\7\r\2\2op\7\f\2\2pq\5\n"+
		"\6\2qr\7\r\2\2rt\3\2\2\2so\3\2\2\2tw\3\2\2\2us\3\2\2\2uv\3\2\2\2vx\3\2"+
		"\2\2wu\3\2\2\2xy\7\7\2\2yz\5\4\3\2z\r\3\2\2\2{|\7\r\2\2|}\7\6\2\2}\u0082"+
		"\7\r\2\2~\177\7\f\2\2\177\u0081\7\r\2\2\u0080~\3\2\2\2\u0081\u0084\3\2"+
		"\2\2\u0082\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0085\3\2\2\2\u0084"+
		"\u0082\3\2\2\2\u0085\u0086\7\7\2\2\u0086\17\3\2\2\2\u0087\u0088\7\20\2"+
		"\2\u0088\u0089\7\6\2\2\u0089\u008a\7\r\2\2\u008a\u008b\7\f\2\2\u008b\u008c"+
		"\7\r\2\2\u008c\u008d\7\7\2\2\u008d\u008e\5\4\3\2\u008e\21\3\2\2\2\u008f"+
		"\u0091\7\13\2\2\u0090\u008f\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0092\3"+
		"\2\2\2\u0092\u0093\7\r\2\2\u0093\u0097\7\17\2\2\u0094\u0098\7\3\2\2\u0095"+
		"\u0098\7\r\2\2\u0096\u0098\5&\24\2\u0097\u0094\3\2\2\2\u0097\u0095\3\2"+
		"\2\2\u0097\u0096\3\2\2\2\u0098\23\3\2\2\2\u0099\u009a\7\n\2\2\u009a\u00a2"+
		"\7\r\2\2\u009b\u009d\7\n\2\2\u009c\u009b\3\2\2\2\u009c\u009d\3\2\2\2\u009d"+
		"\u009e\3\2\2\2\u009e\u009f\7\r\2\2\u009f\u00a0\7\17\2\2\u00a0\u00a2\7"+
		"\r\2\2\u00a1\u0099\3\2\2\2\u00a1\u009c\3\2\2\2\u00a2\25\3\2\2\2\u00a3"+
		"\u00a4\7\r\2\2\u00a4\u00a5\7\25\2\2\u00a5\u00a6\7\r\2\2\u00a6\27\3\2\2"+
		"\2\u00a7\u00a8\7\22\2\2\u00a8\u00a9\7\6\2\2\u00a9\u00aa\7\r\2\2\u00aa"+
		"\u00ab\7\f\2\2\u00ab\u00ac\7\r\2\2\u00ac\u00ad\7\7\2\2\u00ad\31\3\2\2"+
		"\2\u00ae\u00af\7\21\2\2\u00af\u00b0\7\6\2\2\u00b0\u00b1\7\r\2\2\u00b1"+
		"\u00b2\7\7\2\2\u00b2\33\3\2\2\2\u00b3\u00bc\5\26\f\2\u00b4\u00bc\5\30"+
		"\r\2\u00b5\u00bc\5\32\16\2\u00b6\u00bc\5,\27\2\u00b7\u00bc\5.\30\2\u00b8"+
		"\u00bc\5\60\31\2\u00b9\u00bc\5\62\32\2\u00ba\u00bc\5\64\33\2\u00bb\u00b3"+
		"\3\2\2\2\u00bb\u00b4\3\2\2\2\u00bb\u00b5\3\2\2\2\u00bb\u00b6\3\2\2\2\u00bb"+
		"\u00b7\3\2\2\2\u00bb\u00b8\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bb\u00ba\3\2"+
		"\2\2\u00bc\35\3\2\2\2\u00bd\u00be\7\23\2\2\u00be\u00bf\7\6\2\2\u00bf\u00c0"+
		"\5\34\17\2\u00c0\u00c1\7\7\2\2\u00c1\u00c3\5\4\3\2\u00c2\u00c4\5 \21\2"+
		"\u00c3\u00c2\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\37\3\2\2\2\u00c5\u00c6"+
		"\7\24\2\2\u00c6\u00c7\5\4\3\2\u00c7!\3\2\2\2\u00c8\u00c9\7\27\2\2\u00c9"+
		"\u00ca\7\6\2\2\u00ca\u00cb\7\r\2\2\u00cb\u00cc\7\f\2\2\u00cc\u00cd\7\r"+
		"\2\2\u00cd\u00ce\7\7\2\2\u00ce#\3\2\2\2\u00cf\u00d0\7\26\2\2\u00d0\u00d1"+
		"\7\6\2\2\u00d1\u00d2\7\r\2\2\u00d2\u00d3\7\7\2\2\u00d3%\3\2\2\2\u00d4"+
		"\u00d5\7\30\2\2\u00d5\u00d6\7\6\2\2\u00d6\u00d7\7\r\2\2\u00d7\u00d8\7"+
		"\f\2\2\u00d8\u00d9\7\16\2\2\u00d9\u00da\7\7\2\2\u00da\'\3\2\2\2\u00db"+
		"\u00dc\7\31\2\2\u00dc\u00dd\7\6\2\2\u00dd\u00de\7\r\2\2\u00de\u00df\7"+
		"\f\2\2\u00df\u00e0\t\3\2\2\u00e0\u00e1\7\7\2\2\u00e1)\3\2\2\2\u00e2\u00e3"+
		"\7\32\2\2\u00e3\u00e4\7\6\2\2\u00e4\u00e5\7\r\2\2\u00e5\u00e6\7\7\2\2"+
		"\u00e6+\3\2\2\2\u00e7\u00e8\5*\26\2\u00e8\u00e9\7\33\2\2\u00e9\u00ea\7"+
		"\16\2\2\u00ea-\3\2\2\2\u00eb\u00ec\5*\26\2\u00ec\u00ed\7\34\2\2\u00ed"+
		"\u00ee\7\16\2\2\u00ee/\3\2\2\2\u00ef\u00f0\5*\26\2\u00f0\u00f1\7\35\2"+
		"\2\u00f1\u00f2\7\16\2\2\u00f2\61\3\2\2\2\u00f3\u00f4\5*\26\2\u00f4\u00f5"+
		"\7\36\2\2\u00f5\u00f6\7\16\2\2\u00f6\63\3\2\2\2\u00f7\u00f8\5*\26\2\u00f8"+
		"\u00f9\7\25\2\2\u00f9\u00fa\7\16\2\2\u00fa\65\3\2\2\2\u00fb\u00fc\7\37"+
		"\2\2\u00fc\u00fd\7\6\2\2\u00fd\u00fe\7\r\2\2\u00fe\u00ff\7\f\2\2\u00ff"+
		"\u0100\7\r\2\2\u0100\u0101\7\7\2\2\u0101\67\3\2\2\2\20:<BNXfu\u0082\u0090"+
		"\u0097\u009c\u00a1\u00bb\u00c3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}