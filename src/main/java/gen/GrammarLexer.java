package gen;// Generated from D:/yapis/ListCompiler1/src/main/java\Grammar.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		STRING=1, OPEN_CURLY_BRACKET=2, CLOSE_CURLY_BRACKET=3, OPEN_BRACKET=4, 
		CLOSE_BRACKET=5, PRINT=6, VOID=7, LIST=8, ELEMENT=9, COMMA=10, NAME=11, 
		NUMBER=12, ASSIGNMENT=13, FOR=14, IS_EMPTY=15, CONTAINS=16, IF=17, ELSE=18, 
		EQUAL=19, CLEAR=20, ADD=21, GET=22, REMOVE=23, SIZE=24, GE=25, GT=26, 
		LE=27, LT=28, PLUS=29, SKIP_=30, NEWLINE=31;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"STRING", "OPEN_CURLY_BRACKET", "CLOSE_CURLY_BRACKET", "OPEN_BRACKET", 
			"CLOSE_BRACKET", "PRINT", "VOID", "LIST", "ELEMENT", "COMMA", "NAME", 
			"NUMBER", "ASSIGNMENT", "FOR", "IS_EMPTY", "CONTAINS", "IF", "ELSE", 
			"EQUAL", "CLEAR", "ADD", "GET", "REMOVE", "SIZE", "GE", "GT", "LE", "LT", 
			"PLUS", "SKIP_", "COMMENT", "LINE_JOINING", "NEWLINE", "SPACES"
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
			"PLUS", "SKIP_", "NEWLINE"
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


	  // A queue where extra tokens are pushed on (see the NEWLINE lexer rule).
	  private java.util.LinkedList<Token> tokens = new java.util.LinkedList<>();
	  // The stack that keeps track of the indentation level.
	  private java.util.Stack<Integer> indents = new java.util.Stack<>();
	  // The amount of opened braces, brackets and parenthesis.
	  private int opened = 0;
	  // The most recently produced token.
	  private Token lastToken = null;
	  @Override
	  public void emit(Token t) {
	    super.setToken(t);
	    tokens.offer(t);
	  }

	  @Override
	  public Token nextToken() {
	    // Check if the end-of-file is ahead and there are still some DEDENTS expected.
	    if (_input.LA(1) == EOF && !this.indents.isEmpty()) {
	      // Remove any trailing EOF tokens from our buffer.
	      for (int i = tokens.size() - 1; i >= 0; i--) {
	        if (tokens.get(i).getType() == EOF) {
	          tokens.remove(i);
	        }
	      }

	      // First emit an extra line break that serves as the end of the statement.
	      this.emit(commonToken(GrammarParser.NEWLINE, "\n"));

	      // Now emit as much DEDENT tokens as needed.
	      while (!indents.isEmpty()) {
	        this.emit(createDedent());
	        indents.pop();
	      }

	      // Put the EOF back on the token stream.
	      this.emit(commonToken(GrammarParser.EOF, "<EOF>"));
	    }

	    Token next = super.nextToken();

	    if (next.getChannel() == Token.DEFAULT_CHANNEL) {
	      // Keep track of the last token on the default channel.
	      this.lastToken = next;
	    }

	    return tokens.isEmpty() ? next : tokens.poll();
	  }

	  private Token createDedent() {
	    CommonToken dedent = commonToken(GrammarParser.DEDENT, "");
	    dedent.setLine(this.lastToken.getLine());
	    return dedent;
	  }

	  private CommonToken commonToken(int type, String text) {
	    int stop = this.getCharIndex() - 1;
	    int start = text.isEmpty() ? stop : stop - text.length() + 1;
	    return new CommonToken(this._tokenFactorySourcePair, type, DEFAULT_TOKEN_CHANNEL, start, stop);
	  }

	  // Calculates the indentation of the provided spaces, taking the
	  // following rules into account:
	  //
	  // "Tabs are replaced (from left to right) by one to eight spaces
	  //  such that the total number of characters up to and including
	  //  the replacement is a multiple of eight [...]"
	  //
	  //  -- https://docs.Grammar.org/3.1/reference/lexical_analysis.html#indentation
	  static int getIndentationCount(String spaces) {
	    int count = 0;
	    for (char ch : spaces.toCharArray()) {
	      switch (ch) {
	        case '\t':
	          count += 8 - (count % 8);
	          break;
	        default:
	          // A normal space char.
	          count++;
	      }
	    }

	    return count;
	  }

	  boolean atStartOfInput() {
	    return super.getCharPositionInLine() == 0 && super.getLine() == 1;
	  }


	public GrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Grammar.g4"; }

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

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 32:
			NEWLINE_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void NEWLINE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:

			     String newLine = getText().replaceAll("[^\r\n\f]+", "");
			     String spaces = getText().replaceAll("[\r\n\f]+", "");
			     int next = _input.LA(1);
			     if (opened > 0 || next == '\r' || next == '\n' || next == '\f' || next == '#') {
			       // If we're inside a list or on a blank line, ignore all indents,
			       // dedents and line breaks.
			       skip();
			     }
			     else {
			       emit(commonToken(NEWLINE, newLine));
			       int indent = getIndentationCount(spaces);
			       int previous = indents.isEmpty() ? 0 : indents.peek();
			       if (indent == previous) {
			         // skip indents of the same size as the present indent-size
			         skip();
			       }
			       else if (indent > previous) {
			         indents.push(indent);
			         emit(commonToken(GrammarParser.INDENT, spaces));
			       }
			       else {
			         // Possibly emit more than 1 DEDENT token.
			         while(!indents.isEmpty() && indents.peek() > indent) {
			           this.emit(createDedent());
			           indents.pop();
			         }
			       }
			     }
			   
			break;
		}
	}
	@Override
	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 32:
			return NEWLINE_sempred((RuleContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean NEWLINE_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return atStartOfInput();
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2!\u00f5\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\3\2\3\2\6\2J\n\2\r\2\16\2K\3\2\3\2\3\3\3\3\3\4\3\4\3"+
		"\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t"+
		"\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f\7\ft\n\f\f"+
		"\f\16\fw\13\f\3\r\6\rz\n\r\r\r\16\r{\3\16\3\16\3\17\3\17\3\17\3\17\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32"+
		"\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3\37\5\37\u00c9"+
		"\n\37\3\37\3\37\3 \3 \3 \3 \7 \u00d1\n \f \16 \u00d4\13 \3!\3!\5!\u00d8"+
		"\n!\3!\5!\u00db\n!\3!\3!\5!\u00df\n!\3\"\3\"\3\"\5\"\u00e4\n\"\3\"\3\""+
		"\5\"\u00e8\n\"\3\"\5\"\u00eb\n\"\5\"\u00ed\n\"\3\"\3\"\3#\6#\u00f2\n#"+
		"\r#\16#\u00f3\3K\2$\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r"+
		"\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33"+
		"\65\34\67\359\36;\37= ?\2A\2C!E\2\3\2\7\3\2c|\5\2\62;C\\c|\3\2\62;\4\2"+
		"\f\f\16\17\4\2\13\13\"\"\2\u00ff\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2"+
		"\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2"+
		"\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2"+
		"\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2"+
		"\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2"+
		"\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2C\3\2\2\2\3G\3\2\2\2"+
		"\5O\3\2\2\2\7Q\3\2\2\2\tS\3\2\2\2\13U\3\2\2\2\rW\3\2\2\2\17]\3\2\2\2\21"+
		"b\3\2\2\2\23g\3\2\2\2\25o\3\2\2\2\27q\3\2\2\2\31y\3\2\2\2\33}\3\2\2\2"+
		"\35\177\3\2\2\2\37\u0083\3\2\2\2!\u008b\3\2\2\2#\u0094\3\2\2\2%\u0097"+
		"\3\2\2\2\'\u009c\3\2\2\2)\u009f\3\2\2\2+\u00a5\3\2\2\2-\u00a9\3\2\2\2"+
		"/\u00ad\3\2\2\2\61\u00b4\3\2\2\2\63\u00b9\3\2\2\2\65\u00bc\3\2\2\2\67"+
		"\u00be\3\2\2\29\u00c1\3\2\2\2;\u00c3\3\2\2\2=\u00c8\3\2\2\2?\u00cc\3\2"+
		"\2\2A\u00d5\3\2\2\2C\u00ec\3\2\2\2E\u00f1\3\2\2\2GI\7$\2\2HJ\13\2\2\2"+
		"IH\3\2\2\2JK\3\2\2\2KL\3\2\2\2KI\3\2\2\2LM\3\2\2\2MN\7$\2\2N\4\3\2\2\2"+
		"OP\7}\2\2P\6\3\2\2\2QR\7\177\2\2R\b\3\2\2\2ST\7*\2\2T\n\3\2\2\2UV\7+\2"+
		"\2V\f\3\2\2\2WX\7R\2\2XY\7t\2\2YZ\7k\2\2Z[\7p\2\2[\\\7v\2\2\\\16\3\2\2"+
		"\2]^\7X\2\2^_\7q\2\2_`\7k\2\2`a\7f\2\2a\20\3\2\2\2bc\7N\2\2cd\7k\2\2d"+
		"e\7u\2\2ef\7v\2\2f\22\3\2\2\2gh\7G\2\2hi\7n\2\2ij\7g\2\2jk\7o\2\2kl\7"+
		"g\2\2lm\7p\2\2mn\7v\2\2n\24\3\2\2\2op\7.\2\2p\26\3\2\2\2qu\t\2\2\2rt\t"+
		"\3\2\2sr\3\2\2\2tw\3\2\2\2us\3\2\2\2uv\3\2\2\2v\30\3\2\2\2wu\3\2\2\2x"+
		"z\t\4\2\2yx\3\2\2\2z{\3\2\2\2{y\3\2\2\2{|\3\2\2\2|\32\3\2\2\2}~\7?\2\2"+
		"~\34\3\2\2\2\177\u0080\7H\2\2\u0080\u0081\7q\2\2\u0081\u0082\7t\2\2\u0082"+
		"\36\3\2\2\2\u0083\u0084\7K\2\2\u0084\u0085\7u\2\2\u0085\u0086\7G\2\2\u0086"+
		"\u0087\7o\2\2\u0087\u0088\7r\2\2\u0088\u0089\7v\2\2\u0089\u008a\7{\2\2"+
		"\u008a \3\2\2\2\u008b\u008c\7E\2\2\u008c\u008d\7q\2\2\u008d\u008e\7p\2"+
		"\2\u008e\u008f\7v\2\2\u008f\u0090\7c\2\2\u0090\u0091\7k\2\2\u0091\u0092"+
		"\7p\2\2\u0092\u0093\7u\2\2\u0093\"\3\2\2\2\u0094\u0095\7K\2\2\u0095\u0096"+
		"\7h\2\2\u0096$\3\2\2\2\u0097\u0098\7G\2\2\u0098\u0099\7n\2\2\u0099\u009a"+
		"\7u\2\2\u009a\u009b\7g\2\2\u009b&\3\2\2\2\u009c\u009d\7?\2\2\u009d\u009e"+
		"\7?\2\2\u009e(\3\2\2\2\u009f\u00a0\7E\2\2\u00a0\u00a1\7n\2\2\u00a1\u00a2"+
		"\7g\2\2\u00a2\u00a3\7c\2\2\u00a3\u00a4\7t\2\2\u00a4*\3\2\2\2\u00a5\u00a6"+
		"\7C\2\2\u00a6\u00a7\7f\2\2\u00a7\u00a8\7f\2\2\u00a8,\3\2\2\2\u00a9\u00aa"+
		"\7I\2\2\u00aa\u00ab\7g\2\2\u00ab\u00ac\7v\2\2\u00ac.\3\2\2\2\u00ad\u00ae"+
		"\7T\2\2\u00ae\u00af\7g\2\2\u00af\u00b0\7o\2\2\u00b0\u00b1\7q\2\2\u00b1"+
		"\u00b2\7x\2\2\u00b2\u00b3\7g\2\2\u00b3\60\3\2\2\2\u00b4\u00b5\7U\2\2\u00b5"+
		"\u00b6\7k\2\2\u00b6\u00b7\7|\2\2\u00b7\u00b8\7g\2\2\u00b8\62\3\2\2\2\u00b9"+
		"\u00ba\7@\2\2\u00ba\u00bb\7?\2\2\u00bb\64\3\2\2\2\u00bc\u00bd\7@\2\2\u00bd"+
		"\66\3\2\2\2\u00be\u00bf\7>\2\2\u00bf\u00c0\7?\2\2\u00c08\3\2\2\2\u00c1"+
		"\u00c2\7>\2\2\u00c2:\3\2\2\2\u00c3\u00c4\7-\2\2\u00c4<\3\2\2\2\u00c5\u00c9"+
		"\5E#\2\u00c6\u00c9\5? \2\u00c7\u00c9\5A!\2\u00c8\u00c5\3\2\2\2\u00c8\u00c6"+
		"\3\2\2\2\u00c8\u00c7\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cb\b\37\2\2"+
		"\u00cb>\3\2\2\2\u00cc\u00cd\7\61\2\2\u00cd\u00ce\7\61\2\2\u00ce\u00d2"+
		"\3\2\2\2\u00cf\u00d1\n\5\2\2\u00d0\u00cf\3\2\2\2\u00d1\u00d4\3\2\2\2\u00d2"+
		"\u00d0\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3@\3\2\2\2\u00d4\u00d2\3\2\2\2"+
		"\u00d5\u00d7\7^\2\2\u00d6\u00d8\5E#\2\u00d7\u00d6\3\2\2\2\u00d7\u00d8"+
		"\3\2\2\2\u00d8\u00de\3\2\2\2\u00d9\u00db\7\17\2\2\u00da\u00d9\3\2\2\2"+
		"\u00da\u00db\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00df\7\f\2\2\u00dd\u00df"+
		"\4\16\17\2\u00de\u00da\3\2\2\2\u00de\u00dd\3\2\2\2\u00dfB\3\2\2\2\u00e0"+
		"\u00e1\6\"\2\2\u00e1\u00ed\5E#\2\u00e2\u00e4\7\17\2\2\u00e3\u00e2\3\2"+
		"\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e8\7\f\2\2\u00e6"+
		"\u00e8\4\16\17\2\u00e7\u00e3\3\2\2\2\u00e7\u00e6\3\2\2\2\u00e8\u00ea\3"+
		"\2\2\2\u00e9\u00eb\5E#\2\u00ea\u00e9\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb"+
		"\u00ed\3\2\2\2\u00ec\u00e0\3\2\2\2\u00ec\u00e7\3\2\2\2\u00ed\u00ee\3\2"+
		"\2\2\u00ee\u00ef\b\"\3\2\u00efD\3\2\2\2\u00f0\u00f2\t\6\2\2\u00f1\u00f0"+
		"\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4"+
		"F\3\2\2\2\20\2Ku{\u00c8\u00d2\u00d7\u00da\u00de\u00e3\u00e7\u00ea\u00ec"+
		"\u00f3\4\2\3\2\3\"\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}