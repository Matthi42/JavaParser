// Generated from C:/Users/matth/IdeaProjects/JavaParser/src/main\java.g4 by ANTLR 4.9.1
package parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class javaParser extends Parser {
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
	public static final int
		RULE_type = 0, RULE_literal = 1, RULE_binaryOperator = 2, RULE_unaryOperator = 3, 
		RULE_file = 4, RULE_jClass = 5, RULE_attributeOrMethod = 6, RULE_attribute = 7, 
		RULE_statment = 8, RULE_block = 9, RULE_varDecl = 10, RULE_assinage = 11, 
		RULE_forLoop = 12, RULE_whileLoop = 13, RULE_elseIfStatment = 14, RULE_elseStatment = 15, 
		RULE_expression = 16, RULE_method = 17, RULE_parameter = 18, RULE_modifyer = 19, 
		RULE_metodType = 20;
	private static String[] makeRuleNames() {
		return new String[] {
			"type", "literal", "binaryOperator", "unaryOperator", "file", "jClass", 
			"attributeOrMethod", "attribute", "statment", "block", "varDecl", "assinage", 
			"forLoop", "whileLoop", "elseIfStatment", "elseStatment", "expression", 
			"method", "parameter", "modifyer", "metodType"
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

	@Override
	public String getGrammarFileName() { return "java.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public javaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(javaParser.INT, 0); }
		public TerminalNode BOOLEAN() { return getToken(javaParser.BOOLEAN, 0); }
		public TerminalNode FLOAT() { return getToken(javaParser.FLOAT, 0); }
		public TerminalNode CHAR() { return getToken(javaParser.CHAR, 0); }
		public TerminalNode CustomType() { return getToken(javaParser.CustomType, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			_la = _input.LA(1);
			if ( !(((((_la - 6)) & ~0x3f) == 0 && ((1L << (_la - 6)) & ((1L << (INT - 6)) | (1L << (BOOLEAN - 6)) | (1L << (CHAR - 6)) | (1L << (FLOAT - 6)) | (1L << (CustomType - 6)))) != 0)) ) {
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

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode IntegerLiteral() { return getToken(javaParser.IntegerLiteral, 0); }
		public TerminalNode FloatLiteral() { return getToken(javaParser.FloatLiteral, 0); }
		public TerminalNode CharLiteral() { return getToken(javaParser.CharLiteral, 0); }
		public TerminalNode BooleanLiteral() { return getToken(javaParser.BooleanLiteral, 0); }
		public TerminalNode NullLiteral() { return getToken(javaParser.NullLiteral, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			_la = _input.LA(1);
			if ( !(((((_la - 59)) & ~0x3f) == 0 && ((1L << (_la - 59)) & ((1L << (IntegerLiteral - 59)) | (1L << (CharLiteral - 59)) | (1L << (FloatLiteral - 59)) | (1L << (NullLiteral - 59)) | (1L << (BooleanLiteral - 59)))) != 0)) ) {
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

	public static class BinaryOperatorContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(javaParser.ADD, 0); }
		public TerminalNode SUBSTRACT() { return getToken(javaParser.SUBSTRACT, 0); }
		public TerminalNode MULTYPLY() { return getToken(javaParser.MULTYPLY, 0); }
		public TerminalNode DIVIDE() { return getToken(javaParser.DIVIDE, 0); }
		public TerminalNode EQUALS() { return getToken(javaParser.EQUALS, 0); }
		public TerminalNode GREATER() { return getToken(javaParser.GREATER, 0); }
		public TerminalNode LESS() { return getToken(javaParser.LESS, 0); }
		public TerminalNode GREATAEREQUALS() { return getToken(javaParser.GREATAEREQUALS, 0); }
		public TerminalNode LESSEQUALS() { return getToken(javaParser.LESSEQUALS, 0); }
		public TerminalNode AND() { return getToken(javaParser.AND, 0); }
		public TerminalNode OR() { return getToken(javaParser.OR, 0); }
		public TerminalNode MOD() { return getToken(javaParser.MOD, 0); }
		public TerminalNode BITWISEAND() { return getToken(javaParser.BITWISEAND, 0); }
		public TerminalNode BITWISEOR() { return getToken(javaParser.BITWISEOR, 0); }
		public TerminalNode BITWISEXOR() { return getToken(javaParser.BITWISEXOR, 0); }
		public TerminalNode SHIFTLEFT() { return getToken(javaParser.SHIFTLEFT, 0); }
		public TerminalNode SHIFTRIGHT() { return getToken(javaParser.SHIFTRIGHT, 0); }
		public TerminalNode USHIFTRIGHT() { return getToken(javaParser.USHIFTRIGHT, 0); }
		public BinaryOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binaryOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterBinaryOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitBinaryOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitBinaryOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BinaryOperatorContext binaryOperator() throws RecognitionException {
		BinaryOperatorContext _localctx = new BinaryOperatorContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_binaryOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUALS) | (1L << GREATER) | (1L << LESS) | (1L << GREATAEREQUALS) | (1L << LESSEQUALS) | (1L << ADD) | (1L << SUBSTRACT) | (1L << MULTYPLY) | (1L << DIVIDE) | (1L << MOD) | (1L << BITWISEAND) | (1L << BITWISEOR) | (1L << BITWISEXOR) | (1L << SHIFTLEFT) | (1L << SHIFTRIGHT) | (1L << USHIFTRIGHT) | (1L << AND) | (1L << OR))) != 0)) ) {
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

	public static class UnaryOperatorContext extends ParserRuleContext {
		public TerminalNode INCREMENT() { return getToken(javaParser.INCREMENT, 0); }
		public TerminalNode DECREMENT() { return getToken(javaParser.DECREMENT, 0); }
		public TerminalNode ADD() { return getToken(javaParser.ADD, 0); }
		public TerminalNode SUBSTRACT() { return getToken(javaParser.SUBSTRACT, 0); }
		public UnaryOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterUnaryOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitUnaryOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitUnaryOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryOperatorContext unaryOperator() throws RecognitionException {
		UnaryOperatorContext _localctx = new UnaryOperatorContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_unaryOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << SUBSTRACT) | (1L << INCREMENT) | (1L << DECREMENT))) != 0)) ) {
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

	public static class FileContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(javaParser.EOF, 0); }
		public List<JClassContext> jClass() {
			return getRuleContexts(JClassContext.class);
		}
		public JClassContext jClass(int i) {
			return getRuleContext(JClassContext.class,i);
		}
		public FileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitFile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitFile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FileContext file() throws RecognitionException {
		FileContext _localctx = new FileContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_file);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(50);
				jClass();
				}
				}
				setState(53); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CLASS) | (1L << PUBLIC) | (1L << PRIVATE) | (1L << STATIC))) != 0) );
			setState(55);
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

	public static class JClassContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(javaParser.CLASS, 0); }
		public TerminalNode Identifyer() { return getToken(javaParser.Identifyer, 0); }
		public ModifyerContext modifyer() {
			return getRuleContext(ModifyerContext.class,0);
		}
		public List<AttributeOrMethodContext> attributeOrMethod() {
			return getRuleContexts(AttributeOrMethodContext.class);
		}
		public AttributeOrMethodContext attributeOrMethod(int i) {
			return getRuleContext(AttributeOrMethodContext.class,i);
		}
		public JClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jClass; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterJClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitJClass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitJClass(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JClassContext jClass() throws RecognitionException {
		JClassContext _localctx = new JClassContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_jClass);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PUBLIC) | (1L << PRIVATE) | (1L << STATIC))) != 0)) {
				{
				setState(57);
				modifyer();
				}
			}

			setState(60);
			match(CLASS);
			setState(61);
			match(Identifyer);
			setState(62);
			match(T__0);
			setState(66);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 6)) & ~0x3f) == 0 && ((1L << (_la - 6)) & ((1L << (INT - 6)) | (1L << (BOOLEAN - 6)) | (1L << (CHAR - 6)) | (1L << (FLOAT - 6)) | (1L << (VOID - 6)) | (1L << (PUBLIC - 6)) | (1L << (PRIVATE - 6)) | (1L << (STATIC - 6)) | (1L << (CustomType - 6)))) != 0)) {
				{
				{
				setState(63);
				attributeOrMethod();
				}
				}
				setState(68);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(69);
			match(T__1);
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

	public static class AttributeOrMethodContext extends ParserRuleContext {
		public AttributeContext attribute() {
			return getRuleContext(AttributeContext.class,0);
		}
		public MethodContext method() {
			return getRuleContext(MethodContext.class,0);
		}
		public AttributeOrMethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeOrMethod; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterAttributeOrMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitAttributeOrMethod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitAttributeOrMethod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeOrMethodContext attributeOrMethod() throws RecognitionException {
		AttributeOrMethodContext _localctx = new AttributeOrMethodContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_attributeOrMethod);
		try {
			setState(73);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(71);
				attribute();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(72);
				method();
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

	public static class AttributeContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode Identifyer() { return getToken(javaParser.Identifyer, 0); }
		public TerminalNode SEMICOLON() { return getToken(javaParser.SEMICOLON, 0); }
		public ModifyerContext modifyer() {
			return getRuleContext(ModifyerContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(javaParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeContext attribute() throws RecognitionException {
		AttributeContext _localctx = new AttributeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_attribute);
		int _la;
		try {
			setState(91);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(76);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PUBLIC) | (1L << PRIVATE) | (1L << STATIC))) != 0)) {
					{
					setState(75);
					modifyer();
					}
				}

				setState(78);
				type();
				setState(79);
				match(Identifyer);
				setState(80);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(83);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PUBLIC) | (1L << PRIVATE) | (1L << STATIC))) != 0)) {
					{
					setState(82);
					modifyer();
					}
				}

				setState(85);
				type();
				setState(86);
				match(Identifyer);
				setState(87);
				match(ASSIGN);
				setState(88);
				expression(0);
				setState(89);
				match(SEMICOLON);
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

	public static class StatmentContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(javaParser.RETURN, 0); }
		public TerminalNode SEMICOLON() { return getToken(javaParser.SEMICOLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode WHILE() { return getToken(javaParser.WHILE, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public WhileLoopContext whileLoop() {
			return getRuleContext(WhileLoopContext.class,0);
		}
		public TerminalNode IF() { return getToken(javaParser.IF, 0); }
		public StatmentContext statment() {
			return getRuleContext(StatmentContext.class,0);
		}
		public List<ElseIfStatmentContext> elseIfStatment() {
			return getRuleContexts(ElseIfStatmentContext.class);
		}
		public ElseIfStatmentContext elseIfStatment(int i) {
			return getRuleContext(ElseIfStatmentContext.class,i);
		}
		public ElseStatmentContext elseStatment() {
			return getRuleContext(ElseStatmentContext.class,0);
		}
		public AssinageContext assinage() {
			return getRuleContext(AssinageContext.class,0);
		}
		public VarDeclContext varDecl() {
			return getRuleContext(VarDeclContext.class,0);
		}
		public TerminalNode Identifyer() { return getToken(javaParser.Identifyer, 0); }
		public UnaryOperatorContext unaryOperator() {
			return getRuleContext(UnaryOperatorContext.class,0);
		}
		public StatmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterStatment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitStatment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitStatment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatmentContext statment() throws RecognitionException {
		StatmentContext _localctx = new StatmentContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_statment);
		int _la;
		try {
			int _alt;
			setState(125);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(93);
				match(RETURN);
				setState(95);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 3)) & ~0x3f) == 0 && ((1L << (_la - 3)) & ((1L << (T__2 - 3)) | (1L << (THIS - 3)) | (1L << (ADD - 3)) | (1L << (SUBSTRACT - 3)) | (1L << (INCREMENT - 3)) | (1L << (DECREMENT - 3)) | (1L << (IntegerLiteral - 3)) | (1L << (CharLiteral - 3)) | (1L << (FloatLiteral - 3)) | (1L << (NullLiteral - 3)) | (1L << (BooleanLiteral - 3)) | (1L << (Identifyer - 3)))) != 0)) {
					{
					setState(94);
					expression(0);
					}
				}

				setState(97);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(98);
				match(WHILE);
				setState(99);
				match(T__2);
				setState(100);
				expression(0);
				setState(101);
				match(T__3);
				setState(102);
				block();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(104);
				whileLoop();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(105);
				match(IF);
				setState(106);
				match(T__2);
				setState(107);
				expression(0);
				setState(108);
				match(T__3);
				setState(109);
				statment();
				setState(113);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(110);
						elseIfStatment();
						}
						} 
					}
					setState(115);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				}
				setState(117);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(116);
					elseStatment();
					}
					break;
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(119);
				block();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(120);
				assinage();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(121);
				varDecl();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(122);
				match(Identifyer);
				setState(123);
				unaryOperator();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(124);
				match(SEMICOLON);
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

	public static class BlockContext extends ParserRuleContext {
		public List<StatmentContext> statment() {
			return getRuleContexts(StatmentContext.class);
		}
		public StatmentContext statment(int i) {
			return getRuleContext(StatmentContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			match(T__0);
			setState(131);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << INT) | (1L << BOOLEAN) | (1L << CHAR) | (1L << FLOAT) | (1L << WHILE) | (1L << IF) | (1L << SEMICOLON) | (1L << RETURN))) != 0) || _la==Identifyer || _la==CustomType) {
				{
				{
				setState(128);
				statment();
				}
				}
				setState(133);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(134);
			match(T__1);
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

	public static class VarDeclContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode Identifyer() { return getToken(javaParser.Identifyer, 0); }
		public AssinageContext assinage() {
			return getRuleContext(AssinageContext.class,0);
		}
		public VarDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterVarDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitVarDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitVarDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDeclContext varDecl() throws RecognitionException {
		VarDeclContext _localctx = new VarDeclContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_varDecl);
		try {
			setState(142);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(136);
				type();
				setState(137);
				match(Identifyer);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(139);
				type();
				setState(140);
				assinage();
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

	public static class AssinageContext extends ParserRuleContext {
		public TerminalNode Identifyer() { return getToken(javaParser.Identifyer, 0); }
		public TerminalNode ASSIGN() { return getToken(javaParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssinageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assinage; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterAssinage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitAssinage(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitAssinage(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssinageContext assinage() throws RecognitionException {
		AssinageContext _localctx = new AssinageContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_assinage);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			match(Identifyer);
			setState(145);
			match(ASSIGN);
			setState(146);
			expression(0);
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

	public static class ForLoopContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(javaParser.FOR, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(javaParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(javaParser.SEMICOLON, i);
		}
		public StatmentContext statment() {
			return getRuleContext(StatmentContext.class,0);
		}
		public ForLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forLoop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterForLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitForLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitForLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForLoopContext forLoop() throws RecognitionException {
		ForLoopContext _localctx = new ForLoopContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_forLoop);
		try {
			setState(159);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(148);
				match(FOR);
				setState(149);
				match(T__2);
				setState(150);
				expression(0);
				setState(151);
				match(SEMICOLON);
				setState(152);
				expression(0);
				setState(153);
				match(SEMICOLON);
				setState(154);
				expression(0);
				setState(155);
				match(T__3);
				setState(156);
				statment();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(158);
				match(FOR);
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

	public static class WhileLoopContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(javaParser.WHILE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatmentContext statment() {
			return getRuleContext(StatmentContext.class,0);
		}
		public WhileLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileLoop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterWhileLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitWhileLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitWhileLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileLoopContext whileLoop() throws RecognitionException {
		WhileLoopContext _localctx = new WhileLoopContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_whileLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			match(WHILE);
			setState(162);
			match(T__2);
			setState(163);
			expression(0);
			setState(164);
			match(T__3);
			setState(165);
			statment();
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

	public static class ElseIfStatmentContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(javaParser.ELSE, 0); }
		public TerminalNode IF() { return getToken(javaParser.IF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatmentContext statment() {
			return getRuleContext(StatmentContext.class,0);
		}
		public ElseIfStatmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseIfStatment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterElseIfStatment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitElseIfStatment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitElseIfStatment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseIfStatmentContext elseIfStatment() throws RecognitionException {
		ElseIfStatmentContext _localctx = new ElseIfStatmentContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_elseIfStatment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			match(ELSE);
			setState(168);
			match(IF);
			setState(169);
			match(T__2);
			setState(170);
			expression(0);
			setState(171);
			match(T__3);
			setState(172);
			statment();
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

	public static class ElseStatmentContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(javaParser.ELSE, 0); }
		public StatmentContext statment() {
			return getRuleContext(StatmentContext.class,0);
		}
		public ElseStatmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseStatment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterElseStatment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitElseStatment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitElseStatment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseStatmentContext elseStatment() throws RecognitionException {
		ElseStatmentContext _localctx = new ElseStatmentContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_elseStatment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			match(ELSE);
			setState(175);
			statment();
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
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public UnaryOperatorContext unaryOperator() {
			return getRuleContext(UnaryOperatorContext.class,0);
		}
		public TerminalNode Identifyer() { return getToken(javaParser.Identifyer, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode THIS() { return getToken(javaParser.THIS, 0); }
		public BinaryOperatorContext binaryOperator() {
			return getRuleContext(BinaryOperatorContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				{
				setState(178);
				match(T__2);
				setState(179);
				expression(0);
				setState(180);
				match(T__3);
				}
				break;
			case ADD:
			case SUBSTRACT:
			case INCREMENT:
			case DECREMENT:
				{
				setState(182);
				unaryOperator();
				setState(183);
				expression(5);
				}
				break;
			case Identifyer:
				{
				setState(185);
				match(Identifyer);
				}
				break;
			case IntegerLiteral:
			case CharLiteral:
			case FloatLiteral:
			case NullLiteral:
			case BooleanLiteral:
				{
				setState(186);
				literal();
				}
				break;
			case THIS:
				{
				setState(187);
				match(THIS);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(196);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expression);
					setState(190);
					if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
					setState(191);
					binaryOperator();
					setState(192);
					expression(5);
					}
					} 
				}
				setState(198);
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

	public static class MethodContext extends ParserRuleContext {
		public MetodTypeContext metodType() {
			return getRuleContext(MetodTypeContext.class,0);
		}
		public TerminalNode Identifyer() { return getToken(javaParser.Identifyer, 0); }
		public ModifyerContext modifyer() {
			return getRuleContext(ModifyerContext.class,0);
		}
		public ParameterContext parameter() {
			return getRuleContext(ParameterContext.class,0);
		}
		public List<StatmentContext> statment() {
			return getRuleContexts(StatmentContext.class);
		}
		public StatmentContext statment(int i) {
			return getRuleContext(StatmentContext.class,i);
		}
		public TerminalNode SEMICOLON() { return getToken(javaParser.SEMICOLON, 0); }
		public MethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitMethod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitMethod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodContext method() throws RecognitionException {
		MethodContext _localctx = new MethodContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_method);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PUBLIC) | (1L << PRIVATE) | (1L << STATIC))) != 0)) {
				{
				setState(199);
				modifyer();
				}
			}

			setState(202);
			metodType();
			setState(203);
			match(Identifyer);
			setState(204);
			match(T__2);
			setState(206);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 6)) & ~0x3f) == 0 && ((1L << (_la - 6)) & ((1L << (INT - 6)) | (1L << (BOOLEAN - 6)) | (1L << (CHAR - 6)) | (1L << (FLOAT - 6)) | (1L << (CustomType - 6)))) != 0)) {
				{
				setState(205);
				parameter(0);
				}
			}

			setState(208);
			match(T__3);
			setState(209);
			match(T__0);
			setState(213);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << INT) | (1L << BOOLEAN) | (1L << CHAR) | (1L << FLOAT) | (1L << WHILE) | (1L << IF) | (1L << SEMICOLON) | (1L << RETURN))) != 0) || _la==Identifyer || _la==CustomType) {
				{
				{
				setState(210);
				statment();
				}
				}
				setState(215);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(216);
			match(T__1);
			setState(218);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(217);
				match(SEMICOLON);
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

	public static class ParameterContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode Identifyer() { return getToken(javaParser.Identifyer, 0); }
		public ParameterContext parameter() {
			return getRuleContext(ParameterContext.class,0);
		}
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		return parameter(0);
	}

	private ParameterContext parameter(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ParameterContext _localctx = new ParameterContext(_ctx, _parentState);
		ParameterContext _prevctx = _localctx;
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_parameter, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(221);
			type();
			setState(222);
			match(Identifyer);
			}
			_ctx.stop = _input.LT(-1);
			setState(231);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ParameterContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_parameter);
					setState(224);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(225);
					match(T__4);
					setState(226);
					type();
					setState(227);
					match(Identifyer);
					}
					} 
				}
				setState(233);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
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

	public static class ModifyerContext extends ParserRuleContext {
		public TerminalNode PRIVATE() { return getToken(javaParser.PRIVATE, 0); }
		public TerminalNode PUBLIC() { return getToken(javaParser.PUBLIC, 0); }
		public TerminalNode STATIC() { return getToken(javaParser.STATIC, 0); }
		public ModifyerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifyer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterModifyer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitModifyer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitModifyer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModifyerContext modifyer() throws RecognitionException {
		ModifyerContext _localctx = new ModifyerContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_modifyer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PUBLIC) | (1L << PRIVATE) | (1L << STATIC))) != 0)) ) {
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

	public static class MetodTypeContext extends ParserRuleContext {
		public TerminalNode VOID() { return getToken(javaParser.VOID, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public MetodTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_metodType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).enterMetodType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof javaListener ) ((javaListener)listener).exitMetodType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof javaVisitor ) return ((javaVisitor<? extends T>)visitor).visitMetodType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MetodTypeContext metodType() throws RecognitionException {
		MetodTypeContext _localctx = new MetodTypeContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_metodType);
		try {
			setState(238);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VOID:
				enterOuterAlt(_localctx, 1);
				{
				setState(236);
				match(VOID);
				}
				break;
			case INT:
			case BOOLEAN:
			case CHAR:
			case FLOAT:
			case CustomType:
				enterOuterAlt(_localctx, 2);
				{
				setState(237);
				type();
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 16:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 18:
			return parameter_sempred((ParameterContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		}
		return true;
	}
	private boolean parameter_sempred(ParameterContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3E\u00f3\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3"+
		"\5\3\6\6\6\66\n\6\r\6\16\6\67\3\6\3\6\3\7\5\7=\n\7\3\7\3\7\3\7\3\7\7\7"+
		"C\n\7\f\7\16\7F\13\7\3\7\3\7\3\b\3\b\5\bL\n\b\3\t\5\tO\n\t\3\t\3\t\3\t"+
		"\3\t\3\t\5\tV\n\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t^\n\t\3\n\3\n\5\nb\n\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\nr\n\n\f\n\16"+
		"\nu\13\n\3\n\5\nx\n\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0080\n\n\3\13\3\13"+
		"\7\13\u0084\n\13\f\13\16\13\u0087\13\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\5\f\u0091\n\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\5\16\u00a2\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00bf\n\22\3\22\3\22\3\22\3\22\7\22"+
		"\u00c5\n\22\f\22\16\22\u00c8\13\22\3\23\5\23\u00cb\n\23\3\23\3\23\3\23"+
		"\3\23\5\23\u00d1\n\23\3\23\3\23\3\23\7\23\u00d6\n\23\f\23\16\23\u00d9"+
		"\13\23\3\23\3\23\5\23\u00dd\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3"+
		"\24\3\24\7\24\u00e8\n\24\f\24\16\24\u00eb\13\24\3\25\3\25\3\26\3\26\5"+
		"\26\u00f1\n\26\3\26\2\4\"&\27\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 "+
		"\"$&(*\2\7\4\2\b\13DD\4\2==?B\3\2\34-\4\2!\";<\3\2\16\20\2\u00fd\2,\3"+
		"\2\2\2\4.\3\2\2\2\6\60\3\2\2\2\b\62\3\2\2\2\n\65\3\2\2\2\f<\3\2\2\2\16"+
		"K\3\2\2\2\20]\3\2\2\2\22\177\3\2\2\2\24\u0081\3\2\2\2\26\u0090\3\2\2\2"+
		"\30\u0092\3\2\2\2\32\u00a1\3\2\2\2\34\u00a3\3\2\2\2\36\u00a9\3\2\2\2 "+
		"\u00b0\3\2\2\2\"\u00be\3\2\2\2$\u00ca\3\2\2\2&\u00de\3\2\2\2(\u00ec\3"+
		"\2\2\2*\u00f0\3\2\2\2,-\t\2\2\2-\3\3\2\2\2./\t\3\2\2/\5\3\2\2\2\60\61"+
		"\t\4\2\2\61\7\3\2\2\2\62\63\t\5\2\2\63\t\3\2\2\2\64\66\5\f\7\2\65\64\3"+
		"\2\2\2\66\67\3\2\2\2\67\65\3\2\2\2\678\3\2\2\289\3\2\2\29:\7\2\2\3:\13"+
		"\3\2\2\2;=\5(\25\2<;\3\2\2\2<=\3\2\2\2=>\3\2\2\2>?\7\r\2\2?@\7C\2\2@D"+
		"\7\3\2\2AC\5\16\b\2BA\3\2\2\2CF\3\2\2\2DB\3\2\2\2DE\3\2\2\2EG\3\2\2\2"+
		"FD\3\2\2\2GH\7\4\2\2H\r\3\2\2\2IL\5\20\t\2JL\5$\23\2KI\3\2\2\2KJ\3\2\2"+
		"\2L\17\3\2\2\2MO\5(\25\2NM\3\2\2\2NO\3\2\2\2OP\3\2\2\2PQ\5\2\2\2QR\7C"+
		"\2\2RS\7\30\2\2S^\3\2\2\2TV\5(\25\2UT\3\2\2\2UV\3\2\2\2VW\3\2\2\2WX\5"+
		"\2\2\2XY\7C\2\2YZ\7\33\2\2Z[\5\"\22\2[\\\7\30\2\2\\^\3\2\2\2]N\3\2\2\2"+
		"]U\3\2\2\2^\21\3\2\2\2_a\7:\2\2`b\5\"\22\2a`\3\2\2\2ab\3\2\2\2bc\3\2\2"+
		"\2c\u0080\7\30\2\2de\7\23\2\2ef\7\5\2\2fg\5\"\22\2gh\7\6\2\2hi\5\24\13"+
		"\2i\u0080\3\2\2\2j\u0080\5\34\17\2kl\7\24\2\2lm\7\5\2\2mn\5\"\22\2no\7"+
		"\6\2\2os\5\22\n\2pr\5\36\20\2qp\3\2\2\2ru\3\2\2\2sq\3\2\2\2st\3\2\2\2"+
		"tw\3\2\2\2us\3\2\2\2vx\5 \21\2wv\3\2\2\2wx\3\2\2\2x\u0080\3\2\2\2y\u0080"+
		"\5\24\13\2z\u0080\5\30\r\2{\u0080\5\26\f\2|}\7C\2\2}\u0080\5\b\5\2~\u0080"+
		"\7\30\2\2\177_\3\2\2\2\177d\3\2\2\2\177j\3\2\2\2\177k\3\2\2\2\177y\3\2"+
		"\2\2\177z\3\2\2\2\177{\3\2\2\2\177|\3\2\2\2\177~\3\2\2\2\u0080\23\3\2"+
		"\2\2\u0081\u0085\7\3\2\2\u0082\u0084\5\22\n\2\u0083\u0082\3\2\2\2\u0084"+
		"\u0087\3\2\2\2\u0085\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0088\3\2"+
		"\2\2\u0087\u0085\3\2\2\2\u0088\u0089\7\4\2\2\u0089\25\3\2\2\2\u008a\u008b"+
		"\5\2\2\2\u008b\u008c\7C\2\2\u008c\u0091\3\2\2\2\u008d\u008e\5\2\2\2\u008e"+
		"\u008f\5\30\r\2\u008f\u0091\3\2\2\2\u0090\u008a\3\2\2\2\u0090\u008d\3"+
		"\2\2\2\u0091\27\3\2\2\2\u0092\u0093\7C\2\2\u0093\u0094\7\33\2\2\u0094"+
		"\u0095\5\"\22\2\u0095\31\3\2\2\2\u0096\u0097\7\26\2\2\u0097\u0098\7\5"+
		"\2\2\u0098\u0099\5\"\22\2\u0099\u009a\7\30\2\2\u009a\u009b\5\"\22\2\u009b"+
		"\u009c\7\30\2\2\u009c\u009d\5\"\22\2\u009d\u009e\7\6\2\2\u009e\u009f\5"+
		"\22\n\2\u009f\u00a2\3\2\2\2\u00a0\u00a2\7\26\2\2\u00a1\u0096\3\2\2\2\u00a1"+
		"\u00a0\3\2\2\2\u00a2\33\3\2\2\2\u00a3\u00a4\7\23\2\2\u00a4\u00a5\7\5\2"+
		"\2\u00a5\u00a6\5\"\22\2\u00a6\u00a7\7\6\2\2\u00a7\u00a8\5\22\n\2\u00a8"+
		"\35\3\2\2\2\u00a9\u00aa\7\25\2\2\u00aa\u00ab\7\24\2\2\u00ab\u00ac\7\5"+
		"\2\2\u00ac\u00ad\5\"\22\2\u00ad\u00ae\7\6\2\2\u00ae\u00af\5\22\n\2\u00af"+
		"\37\3\2\2\2\u00b0\u00b1\7\25\2\2\u00b1\u00b2\5\22\n\2\u00b2!\3\2\2\2\u00b3"+
		"\u00b4\b\22\1\2\u00b4\u00b5\7\5\2\2\u00b5\u00b6\5\"\22\2\u00b6\u00b7\7"+
		"\6\2\2\u00b7\u00bf\3\2\2\2\u00b8\u00b9\5\b\5\2\u00b9\u00ba\5\"\22\7\u00ba"+
		"\u00bf\3\2\2\2\u00bb\u00bf\7C\2\2\u00bc\u00bf\5\4\3\2\u00bd\u00bf\7\27"+
		"\2\2\u00be\u00b3\3\2\2\2\u00be\u00b8\3\2\2\2\u00be\u00bb\3\2\2\2\u00be"+
		"\u00bc\3\2\2\2\u00be\u00bd\3\2\2\2\u00bf\u00c6\3\2\2\2\u00c0\u00c1\f\6"+
		"\2\2\u00c1\u00c2\5\6\4\2\u00c2\u00c3\5\"\22\7\u00c3\u00c5\3\2\2\2\u00c4"+
		"\u00c0\3\2\2\2\u00c5\u00c8\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c6\u00c7\3\2"+
		"\2\2\u00c7#\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c9\u00cb\5(\25\2\u00ca\u00c9"+
		"\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00cd\5*\26\2\u00cd"+
		"\u00ce\7C\2\2\u00ce\u00d0\7\5\2\2\u00cf\u00d1\5&\24\2\u00d0\u00cf\3\2"+
		"\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d3\7\6\2\2\u00d3"+
		"\u00d7\7\3\2\2\u00d4\u00d6\5\22\n\2\u00d5\u00d4\3\2\2\2\u00d6\u00d9\3"+
		"\2\2\2\u00d7\u00d5\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00da\3\2\2\2\u00d9"+
		"\u00d7\3\2\2\2\u00da\u00dc\7\4\2\2\u00db\u00dd\7\30\2\2\u00dc\u00db\3"+
		"\2\2\2\u00dc\u00dd\3\2\2\2\u00dd%\3\2\2\2\u00de\u00df\b\24\1\2\u00df\u00e0"+
		"\5\2\2\2\u00e0\u00e1\7C\2\2\u00e1\u00e9\3\2\2\2\u00e2\u00e3\f\3\2\2\u00e3"+
		"\u00e4\7\7\2\2\u00e4\u00e5\5\2\2\2\u00e5\u00e6\7C\2\2\u00e6\u00e8\3\2"+
		"\2\2\u00e7\u00e2\3\2\2\2\u00e8\u00eb\3\2\2\2\u00e9\u00e7\3\2\2\2\u00e9"+
		"\u00ea\3\2\2\2\u00ea\'\3\2\2\2\u00eb\u00e9\3\2\2\2\u00ec\u00ed\t\6\2\2"+
		"\u00ed)\3\2\2\2\u00ee\u00f1\7\f\2\2\u00ef\u00f1\5\2\2\2\u00f0\u00ee\3"+
		"\2\2\2\u00f0\u00ef\3\2\2\2\u00f1+\3\2\2\2\30\67<DKNU]asw\177\u0085\u0090"+
		"\u00a1\u00be\u00c6\u00ca\u00d0\u00d7\u00dc\u00e9\u00f0";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}