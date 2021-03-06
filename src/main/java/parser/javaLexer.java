// Generated from C:/Users/matth/IdeaProjects/JavaParser/src/main\java.g4 by ANTLR 4.9.1
package parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class javaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, INT=6, BOOLEAN=7, CHAR=8, FLOAT=9, 
		VOID=10, CLASS=11, PUBLIC=12, PRIVATE=13, STATIC=14, FINAL=15, DO=16, 
		WHILE=17, IF=18, ELSE=19, FOR=20, THIS=21, SEMICOLON=22, DOT=23, QUOTATIONMARK=24, 
		ASSIGN=25, EQUALS=26, GREATER=27, LESS=28, GREATAEREQUALS=29, LESSEQUALS=30, 
		ADD=31, SUBSTRACT=32, MULTYPLY=33, DIVIDE=34, MOD=35, BITWISEAND=36, BITWISEOR=37, 
		BITWISEXOR=38, SHIFTLEFT=39, SHIFTRIGHT=40, USHIFTRIGHT=41, AND=42, OR=43, 
		ASSINGNGREATER=44, ASSINGNLESS=45, ASSINGNGREATAEREQUALS=46, ASSINGNLESSEQUALS=47, 
		ASSINGNADD=48, ASSINGNSUBSTRACT=49, ASSINGNMULTYPLY=50, ASSINGNDIVIDE=51, 
		ASSINGNMOD=52, ASSINGNBITWISEAND=53, ASSINGNBITWISEOR=54, ASSINGNBITWISEXOR=55, 
		RETURN=56, INCREMENT=57, DECREMENT=58, IntegerLiteral=59, StringLiteral=60, 
		CharLiteral=61, FloatLiteral=62, NullLiteral=63, BooleanLiteral=64, Identifyer=65, 
		CustomType=66, WS=67;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "INT", "BOOLEAN", "CHAR", "FLOAT", 
			"VOID", "CLASS", "PUBLIC", "PRIVATE", "STATIC", "FINAL", "DO", "WHILE", 
			"IF", "ELSE", "FOR", "THIS", "SEMICOLON", "DOT", "QUOTATIONMARK", "ASSIGN", 
			"EQUALS", "GREATER", "LESS", "GREATAEREQUALS", "LESSEQUALS", "ADD", "SUBSTRACT", 
			"MULTYPLY", "DIVIDE", "MOD", "BITWISEAND", "BITWISEOR", "BITWISEXOR", 
			"SHIFTLEFT", "SHIFTRIGHT", "USHIFTRIGHT", "AND", "OR", "ASSINGNGREATER", 
			"ASSINGNLESS", "ASSINGNGREATAEREQUALS", "ASSINGNLESSEQUALS", "ASSINGNADD", 
			"ASSINGNSUBSTRACT", "ASSINGNMULTYPLY", "ASSINGNDIVIDE", "ASSINGNMOD", 
			"ASSINGNBITWISEAND", "ASSINGNBITWISEOR", "ASSINGNBITWISEXOR", "RETURN", 
			"INCREMENT", "DECREMENT", "IntegerLiteral", "StringLiteral", "CharLiteral", 
			"FloatLiteral", "NullLiteral", "BooleanLiteral", "Identifyer", "CustomType", 
			"WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "'}'", "'('", "')'", "','", "'int'", "'boolean'", "'char'", 
			"'float'", "'void'", "'class'", "'public'", "'private'", "'static'", 
			"'final'", "'do'", "'while'", "'if'", "'else'", "'for'", "'this'", "';'", 
			"'.'", "'\"'", "'='", "'=='", "'>'", "'<'", "'>='", "'<='", "'+'", "'-'", 
			"'*'", "'/'", "'%'", "'&'", "'|'", "'^'", "'<<'", "'>>'", "'>>>'", "'&&'", 
			"'||'", null, null, null, null, null, null, null, null, null, null, null, 
			null, "'return'", "'++'", "'--'", null, null, null, null, "'null'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, "INT", "BOOLEAN", "CHAR", "FLOAT", 
			"VOID", "CLASS", "PUBLIC", "PRIVATE", "STATIC", "FINAL", "DO", "WHILE", 
			"IF", "ELSE", "FOR", "THIS", "SEMICOLON", "DOT", "QUOTATIONMARK", "ASSIGN", 
			"EQUALS", "GREATER", "LESS", "GREATAEREQUALS", "LESSEQUALS", "ADD", "SUBSTRACT", 
			"MULTYPLY", "DIVIDE", "MOD", "BITWISEAND", "BITWISEOR", "BITWISEXOR", 
			"SHIFTLEFT", "SHIFTRIGHT", "USHIFTRIGHT", "AND", "OR", "ASSINGNGREATER", 
			"ASSINGNLESS", "ASSINGNGREATAEREQUALS", "ASSINGNLESSEQUALS", "ASSINGNADD", 
			"ASSINGNSUBSTRACT", "ASSINGNMULTYPLY", "ASSINGNDIVIDE", "ASSINGNMOD", 
			"ASSINGNBITWISEAND", "ASSINGNBITWISEOR", "ASSINGNBITWISEXOR", "RETURN", 
			"INCREMENT", "DECREMENT", "IntegerLiteral", "StringLiteral", "CharLiteral", 
			"FloatLiteral", "NullLiteral", "BooleanLiteral", "Identifyer", "CustomType", 
			"WS"
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


	public javaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "java.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2E\u01bc\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\3\2\3\2\3\3\3\3\3\4\3\4\3\5"+
		"\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3"+
		"\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3"+
		"\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3"+
		"\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\35\3"+
		"\35\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3"+
		"%\3&\3&\3\'\3\'\3(\3(\3(\3)\3)\3)\3*\3*\3*\3*\3+\3+\3+\3,\3,\3,\3-\3-"+
		"\3-\3.\3.\3.\3/\3/\3/\3\60\3\60\3\60\3\61\3\61\3\61\3\62\3\62\3\62\3\63"+
		"\3\63\3\63\3\64\3\64\3\64\3\65\3\65\3\65\3\66\3\66\3\66\3\67\3\67\3\67"+
		"\38\38\38\39\39\39\39\39\39\39\3:\3:\3:\3;\3;\3;\3<\6<\u0153\n<\r<\16"+
		"<\u0154\3<\7<\u0158\n<\f<\16<\u015b\13<\3<\5<\u015e\n<\3<\5<\u0161\n<"+
		"\3=\3=\7=\u0165\n=\f=\16=\u0168\13=\3=\3=\3>\3>\3>\3>\3?\5?\u0171\n?\3"+
		"?\6?\u0174\n?\r?\16?\u0175\3?\7?\u0179\n?\f?\16?\u017c\13?\3?\3?\5?\u0180"+
		"\n?\3?\3?\3?\5?\u0185\n?\3?\7?\u0188\n?\f?\16?\u018b\13?\3?\3?\6?\u018f"+
		"\n?\r?\16?\u0190\3?\5?\u0194\n?\5?\u0196\n?\3@\3@\3@\3@\3@\3A\3A\3A\3"+
		"A\3A\3A\3A\3A\3A\5A\u01a6\nA\3B\3B\7B\u01aa\nB\fB\16B\u01ad\13B\3C\3C"+
		"\7C\u01b1\nC\fC\16C\u01b4\13C\3D\6D\u01b7\nD\rD\16D\u01b8\3D\3D\3\u0166"+
		"\2E\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36"+
		";\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67"+
		"m8o9q:s;u<w=y>{?}@\177A\u0081B\u0083C\u0085D\u0087E\3\2\b\3\2\63;\3\2"+
		"\62;\4\2--//\4\2C\\c|\5\2\62;C\\c|\5\2\13\f\17\17\"\"\2\u01ce\2\3\3\2"+
		"\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17"+
		"\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2"+
		"\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3"+
		"\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3"+
		"\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2"+
		"=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3"+
		"\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2"+
		"\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2"+
		"c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3"+
		"\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2"+
		"\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3"+
		"\2\2\2\2\u0087\3\2\2\2\3\u0089\3\2\2\2\5\u008b\3\2\2\2\7\u008d\3\2\2\2"+
		"\t\u008f\3\2\2\2\13\u0091\3\2\2\2\r\u0093\3\2\2\2\17\u0097\3\2\2\2\21"+
		"\u009f\3\2\2\2\23\u00a4\3\2\2\2\25\u00aa\3\2\2\2\27\u00af\3\2\2\2\31\u00b5"+
		"\3\2\2\2\33\u00bc\3\2\2\2\35\u00c4\3\2\2\2\37\u00cb\3\2\2\2!\u00d1\3\2"+
		"\2\2#\u00d4\3\2\2\2%\u00da\3\2\2\2\'\u00dd\3\2\2\2)\u00e2\3\2\2\2+\u00e6"+
		"\3\2\2\2-\u00eb\3\2\2\2/\u00ed\3\2\2\2\61\u00ef\3\2\2\2\63\u00f1\3\2\2"+
		"\2\65\u00f3\3\2\2\2\67\u00f6\3\2\2\29\u00f8\3\2\2\2;\u00fa\3\2\2\2=\u00fd"+
		"\3\2\2\2?\u0100\3\2\2\2A\u0102\3\2\2\2C\u0104\3\2\2\2E\u0106\3\2\2\2G"+
		"\u0108\3\2\2\2I\u010a\3\2\2\2K\u010c\3\2\2\2M\u010e\3\2\2\2O\u0110\3\2"+
		"\2\2Q\u0113\3\2\2\2S\u0116\3\2\2\2U\u011a\3\2\2\2W\u011d\3\2\2\2Y\u0120"+
		"\3\2\2\2[\u0123\3\2\2\2]\u0126\3\2\2\2_\u0129\3\2\2\2a\u012c\3\2\2\2c"+
		"\u012f\3\2\2\2e\u0132\3\2\2\2g\u0135\3\2\2\2i\u0138\3\2\2\2k\u013b\3\2"+
		"\2\2m\u013e\3\2\2\2o\u0141\3\2\2\2q\u0144\3\2\2\2s\u014b\3\2\2\2u\u014e"+
		"\3\2\2\2w\u0160\3\2\2\2y\u0162\3\2\2\2{\u016b\3\2\2\2}\u0195\3\2\2\2\177"+
		"\u0197\3\2\2\2\u0081\u01a5\3\2\2\2\u0083\u01a7\3\2\2\2\u0085\u01ae\3\2"+
		"\2\2\u0087\u01b6\3\2\2\2\u0089\u008a\7}\2\2\u008a\4\3\2\2\2\u008b\u008c"+
		"\7\177\2\2\u008c\6\3\2\2\2\u008d\u008e\7*\2\2\u008e\b\3\2\2\2\u008f\u0090"+
		"\7+\2\2\u0090\n\3\2\2\2\u0091\u0092\7.\2\2\u0092\f\3\2\2\2\u0093\u0094"+
		"\7k\2\2\u0094\u0095\7p\2\2\u0095\u0096\7v\2\2\u0096\16\3\2\2\2\u0097\u0098"+
		"\7d\2\2\u0098\u0099\7q\2\2\u0099\u009a\7q\2\2\u009a\u009b\7n\2\2\u009b"+
		"\u009c\7g\2\2\u009c\u009d\7c\2\2\u009d\u009e\7p\2\2\u009e\20\3\2\2\2\u009f"+
		"\u00a0\7e\2\2\u00a0\u00a1\7j\2\2\u00a1\u00a2\7c\2\2\u00a2\u00a3\7t\2\2"+
		"\u00a3\22\3\2\2\2\u00a4\u00a5\7h\2\2\u00a5\u00a6\7n\2\2\u00a6\u00a7\7"+
		"q\2\2\u00a7\u00a8\7c\2\2\u00a8\u00a9\7v\2\2\u00a9\24\3\2\2\2\u00aa\u00ab"+
		"\7x\2\2\u00ab\u00ac\7q\2\2\u00ac\u00ad\7k\2\2\u00ad\u00ae\7f\2\2\u00ae"+
		"\26\3\2\2\2\u00af\u00b0\7e\2\2\u00b0\u00b1\7n\2\2\u00b1\u00b2\7c\2\2\u00b2"+
		"\u00b3\7u\2\2\u00b3\u00b4\7u\2\2\u00b4\30\3\2\2\2\u00b5\u00b6\7r\2\2\u00b6"+
		"\u00b7\7w\2\2\u00b7\u00b8\7d\2\2\u00b8\u00b9\7n\2\2\u00b9\u00ba\7k\2\2"+
		"\u00ba\u00bb\7e\2\2\u00bb\32\3\2\2\2\u00bc\u00bd\7r\2\2\u00bd\u00be\7"+
		"t\2\2\u00be\u00bf\7k\2\2\u00bf\u00c0\7x\2\2\u00c0\u00c1\7c\2\2\u00c1\u00c2"+
		"\7v\2\2\u00c2\u00c3\7g\2\2\u00c3\34\3\2\2\2\u00c4\u00c5\7u\2\2\u00c5\u00c6"+
		"\7v\2\2\u00c6\u00c7\7c\2\2\u00c7\u00c8\7v\2\2\u00c8\u00c9\7k\2\2\u00c9"+
		"\u00ca\7e\2\2\u00ca\36\3\2\2\2\u00cb\u00cc\7h\2\2\u00cc\u00cd\7k\2\2\u00cd"+
		"\u00ce\7p\2\2\u00ce\u00cf\7c\2\2\u00cf\u00d0\7n\2\2\u00d0 \3\2\2\2\u00d1"+
		"\u00d2\7f\2\2\u00d2\u00d3\7q\2\2\u00d3\"\3\2\2\2\u00d4\u00d5\7y\2\2\u00d5"+
		"\u00d6\7j\2\2\u00d6\u00d7\7k\2\2\u00d7\u00d8\7n\2\2\u00d8\u00d9\7g\2\2"+
		"\u00d9$\3\2\2\2\u00da\u00db\7k\2\2\u00db\u00dc\7h\2\2\u00dc&\3\2\2\2\u00dd"+
		"\u00de\7g\2\2\u00de\u00df\7n\2\2\u00df\u00e0\7u\2\2\u00e0\u00e1\7g\2\2"+
		"\u00e1(\3\2\2\2\u00e2\u00e3\7h\2\2\u00e3\u00e4\7q\2\2\u00e4\u00e5\7t\2"+
		"\2\u00e5*\3\2\2\2\u00e6\u00e7\7v\2\2\u00e7\u00e8\7j\2\2\u00e8\u00e9\7"+
		"k\2\2\u00e9\u00ea\7u\2\2\u00ea,\3\2\2\2\u00eb\u00ec\7=\2\2\u00ec.\3\2"+
		"\2\2\u00ed\u00ee\7\60\2\2\u00ee\60\3\2\2\2\u00ef\u00f0\7$\2\2\u00f0\62"+
		"\3\2\2\2\u00f1\u00f2\7?\2\2\u00f2\64\3\2\2\2\u00f3\u00f4\7?\2\2\u00f4"+
		"\u00f5\7?\2\2\u00f5\66\3\2\2\2\u00f6\u00f7\7@\2\2\u00f78\3\2\2\2\u00f8"+
		"\u00f9\7>\2\2\u00f9:\3\2\2\2\u00fa\u00fb\7@\2\2\u00fb\u00fc\7?\2\2\u00fc"+
		"<\3\2\2\2\u00fd\u00fe\7>\2\2\u00fe\u00ff\7?\2\2\u00ff>\3\2\2\2\u0100\u0101"+
		"\7-\2\2\u0101@\3\2\2\2\u0102\u0103\7/\2\2\u0103B\3\2\2\2\u0104\u0105\7"+
		",\2\2\u0105D\3\2\2\2\u0106\u0107\7\61\2\2\u0107F\3\2\2\2\u0108\u0109\7"+
		"\'\2\2\u0109H\3\2\2\2\u010a\u010b\7(\2\2\u010bJ\3\2\2\2\u010c\u010d\7"+
		"~\2\2\u010dL\3\2\2\2\u010e\u010f\7`\2\2\u010fN\3\2\2\2\u0110\u0111\7>"+
		"\2\2\u0111\u0112\7>\2\2\u0112P\3\2\2\2\u0113\u0114\7@\2\2\u0114\u0115"+
		"\7@\2\2\u0115R\3\2\2\2\u0116\u0117\7@\2\2\u0117\u0118\7@\2\2\u0118\u0119"+
		"\7@\2\2\u0119T\3\2\2\2\u011a\u011b\7(\2\2\u011b\u011c\7(\2\2\u011cV\3"+
		"\2\2\2\u011d\u011e\7~\2\2\u011e\u011f\7~\2\2\u011fX\3\2\2\2\u0120\u0121"+
		"\5\67\34\2\u0121\u0122\5\63\32\2\u0122Z\3\2\2\2\u0123\u0124\59\35\2\u0124"+
		"\u0125\5\63\32\2\u0125\\\3\2\2\2\u0126\u0127\5;\36\2\u0127\u0128\5\63"+
		"\32\2\u0128^\3\2\2\2\u0129\u012a\5=\37\2\u012a\u012b\5\63\32\2\u012b`"+
		"\3\2\2\2\u012c\u012d\5? \2\u012d\u012e\5\63\32\2\u012eb\3\2\2\2\u012f"+
		"\u0130\5A!\2\u0130\u0131\5\63\32\2\u0131d\3\2\2\2\u0132\u0133\5C\"\2\u0133"+
		"\u0134\5\63\32\2\u0134f\3\2\2\2\u0135\u0136\5E#\2\u0136\u0137\5\63\32"+
		"\2\u0137h\3\2\2\2\u0138\u0139\5G$\2\u0139\u013a\5\63\32\2\u013aj\3\2\2"+
		"\2\u013b\u013c\5I%\2\u013c\u013d\5\63\32\2\u013dl\3\2\2\2\u013e\u013f"+
		"\5K&\2\u013f\u0140\5\63\32\2\u0140n\3\2\2\2\u0141\u0142\5M\'\2\u0142\u0143"+
		"\5\63\32\2\u0143p\3\2\2\2\u0144\u0145\7t\2\2\u0145\u0146\7g\2\2\u0146"+
		"\u0147\7v\2\2\u0147\u0148\7w\2\2\u0148\u0149\7t\2\2\u0149\u014a\7p\2\2"+
		"\u014ar\3\2\2\2\u014b\u014c\7-\2\2\u014c\u014d\7-\2\2\u014dt\3\2\2\2\u014e"+
		"\u014f\7/\2\2\u014f\u0150\7/\2\2\u0150v\3\2\2\2\u0151\u0153\t\2\2\2\u0152"+
		"\u0151\3\2\2\2\u0153\u0154\3\2\2\2\u0154\u0152\3\2\2\2\u0154\u0155\3\2"+
		"\2\2\u0155\u0159\3\2\2\2\u0156\u0158\t\3\2\2\u0157\u0156\3\2\2\2\u0158"+
		"\u015b\3\2\2\2\u0159\u0157\3\2\2\2\u0159\u015a\3\2\2\2\u015a\u0161\3\2"+
		"\2\2\u015b\u0159\3\2\2\2\u015c\u015e\t\4\2\2\u015d\u015c\3\2\2\2\u015d"+
		"\u015e\3\2\2\2\u015e\u015f\3\2\2\2\u015f\u0161\7\62\2\2\u0160\u0152\3"+
		"\2\2\2\u0160\u015d\3\2\2\2\u0161x\3\2\2\2\u0162\u0166\5\61\31\2\u0163"+
		"\u0165\13\2\2\2\u0164\u0163\3\2\2\2\u0165\u0168\3\2\2\2\u0166\u0167\3"+
		"\2\2\2\u0166\u0164\3\2\2\2\u0167\u0169\3\2\2\2\u0168\u0166\3\2\2\2\u0169"+
		"\u016a\5\61\31\2\u016az\3\2\2\2\u016b\u016c\7)\2\2\u016c\u016d\13\2\2"+
		"\2\u016d\u016e\7)\2\2\u016e|\3\2\2\2\u016f\u0171\t\4\2\2\u0170\u016f\3"+
		"\2\2\2\u0170\u0171\3\2\2\2\u0171\u0173\3\2\2\2\u0172\u0174\t\2\2\2\u0173"+
		"\u0172\3\2\2\2\u0174\u0175\3\2\2\2\u0175\u0173\3\2\2\2\u0175\u0176\3\2"+
		"\2\2\u0176\u017a\3\2\2\2\u0177\u0179\t\3\2\2\u0178\u0177\3\2\2\2\u0179"+
		"\u017c\3\2\2\2\u017a\u0178\3\2\2\2\u017a\u017b\3\2\2\2\u017b\u017d\3\2"+
		"\2\2\u017c\u017a\3\2\2\2\u017d\u0196\7h\2\2\u017e\u0180\t\4\2\2\u017f"+
		"\u017e\3\2\2\2\u017f\u0180\3\2\2\2\u0180\u0181\3\2\2\2\u0181\u0182\7\62"+
		"\2\2\u0182\u0196\7h\2\2\u0183\u0185\t\4\2\2\u0184\u0183\3\2\2\2\u0184"+
		"\u0185\3\2\2\2\u0185\u0189\3\2\2\2\u0186\u0188\t\3\2\2\u0187\u0186\3\2"+
		"\2\2\u0188\u018b\3\2\2\2\u0189\u0187\3\2\2\2\u0189\u018a\3\2\2\2\u018a"+
		"\u018c\3\2\2\2\u018b\u0189\3\2\2\2\u018c\u018e\7\60\2\2\u018d\u018f\t"+
		"\3\2\2\u018e\u018d\3\2\2\2\u018f\u0190\3\2\2\2\u0190\u018e\3\2\2\2\u0190"+
		"\u0191\3\2\2\2\u0191\u0193\3\2\2\2\u0192\u0194\7h\2\2\u0193\u0192\3\2"+
		"\2\2\u0193\u0194\3\2\2\2\u0194\u0196\3\2\2\2\u0195\u0170\3\2\2\2\u0195"+
		"\u017f\3\2\2\2\u0195\u0184\3\2\2\2\u0196~\3\2\2\2\u0197\u0198\7p\2\2\u0198"+
		"\u0199\7w\2\2\u0199\u019a\7n\2\2\u019a\u019b\7n\2\2\u019b\u0080\3\2\2"+
		"\2\u019c\u019d\7v\2\2\u019d\u019e\7t\2\2\u019e\u019f\7w\2\2\u019f\u01a6"+
		"\7g\2\2\u01a0\u01a1\7h\2\2\u01a1\u01a2\7c\2\2\u01a2\u01a3\7n\2\2\u01a3"+
		"\u01a4\7u\2\2\u01a4\u01a6\7g\2\2\u01a5\u019c\3\2\2\2\u01a5\u01a0\3\2\2"+
		"\2\u01a6\u0082\3\2\2\2\u01a7\u01ab\t\5\2\2\u01a8\u01aa\t\6\2\2\u01a9\u01a8"+
		"\3\2\2\2\u01aa\u01ad\3\2\2\2\u01ab\u01a9\3\2\2\2\u01ab\u01ac\3\2\2\2\u01ac"+
		"\u0084\3\2\2\2\u01ad\u01ab\3\2\2\2\u01ae\u01b2\t\5\2\2\u01af\u01b1\t\6"+
		"\2\2\u01b0\u01af\3\2\2\2\u01b1\u01b4\3\2\2\2\u01b2\u01b0\3\2\2\2\u01b2"+
		"\u01b3\3\2\2\2\u01b3\u0086\3\2\2\2\u01b4\u01b2\3\2\2\2\u01b5\u01b7\t\7"+
		"\2\2\u01b6\u01b5\3\2\2\2\u01b7\u01b8\3\2\2\2\u01b8\u01b6\3\2\2\2\u01b8"+
		"\u01b9\3\2\2\2\u01b9\u01ba\3\2\2\2\u01ba\u01bb\bD\2\2\u01bb\u0088\3\2"+
		"\2\2\25\2\u0154\u0159\u015d\u0160\u0166\u0170\u0175\u017a\u017f\u0184"+
		"\u0189\u0190\u0193\u0195\u01a5\u01ab\u01b2\u01b8\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}