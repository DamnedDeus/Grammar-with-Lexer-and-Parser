// Generated from G:/IAPIS_1/src/antlr4\Gramma.g4 by ANTLR 4.9.1
package gen;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GrammaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, PT=22, NUM=23, TYPE=24, MULT=25, 
		DIV=26, PLUS=27, MINUS=28, LOGIC=29, COMPARE=30, UNARY_OPERATOR=31, MAIN_FUNCTION_ID=32, 
		NAME=33, Whitespace=34;
	public static final int
		RULE_parametr = 0, RULE_identifier = 1, RULE_unary_operator = 2, RULE_expression = 3, 
		RULE_function = 4, RULE_mainFunction = 5, RULE_function_call = 6, RULE_return_rule = 7, 
		RULE_if_rule = 8, RULE_else_rule = 9, RULE_while_rule = 10, RULE_for_rule = 11, 
		RULE_break_rule = 12, RULE_continue_rule = 13, RULE_statement_rules = 14, 
		RULE_statement = 15, RULE_program = 16;
	private static String[] makeRuleNames() {
		return new String[] {
			"parametr", "identifier", "unary_operator", "expression", "function", 
			"mainFunction", "function_call", "return_rule", "if_rule", "else_rule", 
			"while_rule", "for_rule", "break_rule", "continue_rule", "statement_rules", 
			"statement", "program"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'('", "')'", "'^'", "'!'", "'find('", "','", "'update'", 
			"'delete'", "'new'", "'{'", "'}'", "'()'", "'return'", "'if'", "'else'", 
			"'while'", "'for'", "';'", "'break'", "'continue'", "'.'", null, null, 
			"'*'", "'/'", "'+'", "'-'", null, null, null, "'main'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, "PT", "NUM", 
			"TYPE", "MULT", "DIV", "PLUS", "MINUS", "LOGIC", "COMPARE", "UNARY_OPERATOR", 
			"MAIN_FUNCTION_ID", "NAME", "Whitespace"
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
	public String getGrammarFileName() { return "Gramma.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GrammaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ParametrContext extends ParserRuleContext {
		public TerminalNode TYPE() { return getToken(GrammaParser.TYPE, 0); }
		public TerminalNode NAME() { return getToken(GrammaParser.NAME, 0); }
		public TerminalNode NUM() { return getToken(GrammaParser.NUM, 0); }
		public ParametrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaListener) ((GrammaListener)listener).enterParametr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaListener) ((GrammaListener)listener).exitParametr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaVisitor) return ((GrammaVisitor<? extends T>)visitor).visitParametr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametrContext parametr() throws RecognitionException {
		ParametrContext _localctx = new ParametrContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_parametr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TYPE:
				{
				setState(34);
				match(TYPE);
				setState(35);
				match(NAME);
				}
				break;
			case NUM:
				{
				setState(36);
				match(NUM);
				}
				break;
			case NAME:
				{
				setState(37);
				match(NAME);
				}
				break;
			case T__2:
			case T__6:
				break;
			default:
				break;
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

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(GrammaParser.NAME, 0); }
		public TerminalNode NUM() { return getToken(GrammaParser.NUM, 0); }
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaListener) ((GrammaListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaListener) ((GrammaListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaVisitor) return ((GrammaVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			match(NAME);
			setState(41);
			match(T__0);
			setState(44);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM:
				{
				setState(42);
				match(NUM);
				}
				break;
			case NAME:
				{
				setState(43);
				function_call();
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

	public static class Unary_operatorContext extends ParserRuleContext {
		public Unary_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_operator; }

		public Unary_operatorContext() { }
		public void copyFrom(Unary_operatorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RigthContext extends Unary_operatorContext {
		public TerminalNode UNARY_OPERATOR() { return getToken(GrammaParser.UNARY_OPERATOR, 0); }
		public TerminalNode NAME() { return getToken(GrammaParser.NAME, 0); }
		public RigthContext(Unary_operatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaListener) ((GrammaListener)listener).enterRigth(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaListener) ((GrammaListener)listener).exitRigth(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaVisitor) return ((GrammaVisitor<? extends T>)visitor).visitRigth(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LeftContext extends Unary_operatorContext {
		public TerminalNode NAME() { return getToken(GrammaParser.NAME, 0); }
		public TerminalNode UNARY_OPERATOR() { return getToken(GrammaParser.UNARY_OPERATOR, 0); }
		public LeftContext(Unary_operatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaListener) ((GrammaListener)listener).enterLeft(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaListener) ((GrammaListener)listener).exitLeft(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaVisitor) return ((GrammaVisitor<? extends T>)visitor).visitLeft(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Unary_operatorContext unary_operator() throws RecognitionException {
		Unary_operatorContext _localctx = new Unary_operatorContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_unary_operator);
		try {
			setState(50);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME:
				_localctx = new LeftContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(46);
				match(NAME);
				setState(47);
				match(UNARY_OPERATOR);
				}
				break;
			case UNARY_OPERATOR:
				_localctx = new RigthContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(48);
				match(UNARY_OPERATOR);
				setState(49);
				match(NAME);
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

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }

		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ParensContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParensContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaListener) ((GrammaListener)listener).enterParens(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaListener) ((GrammaListener)listener).exitParens(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaVisitor) return ((GrammaVisitor<? extends T>)visitor).visitParens(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PlusMinusContext extends ExpressionContext {
		public Token operation;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(GrammaParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(GrammaParser.MINUS, 0); }
		public PlusMinusContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaListener) ((GrammaListener)listener).enterPlusMinus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaListener) ((GrammaListener)listener).exitPlusMinus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaVisitor) return ((GrammaVisitor<? extends T>)visitor).visitPlusMinus(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CompareContext extends ExpressionContext {
		public Token operation;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode COMPARE() { return getToken(GrammaParser.COMPARE, 0); }
		public CompareContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaListener) ((GrammaListener)listener).enterCompare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaListener) ((GrammaListener)listener).exitCompare(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaVisitor) return ((GrammaVisitor<? extends T>)visitor).visitCompare(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnaryOperatorContext extends ExpressionContext {
		public Unary_operatorContext unary_operator() {
			return getRuleContext(Unary_operatorContext.class,0);
		}
		public UnaryOperatorContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaListener) ((GrammaListener)listener).enterUnaryOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaListener) ((GrammaListener)listener).exitUnaryOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaVisitor) return ((GrammaVisitor<? extends T>)visitor).visitUnaryOperator(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumContext extends ExpressionContext {
		public TerminalNode NUM() { return getToken(GrammaParser.NUM, 0); }
		public NumContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaListener) ((GrammaListener)listener).enterNum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaListener) ((GrammaListener)listener).exitNum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaVisitor) return ((GrammaVisitor<? extends T>)visitor).visitNum(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UpdateContext extends ExpressionContext {
		public TerminalNode NAME() { return getToken(GrammaParser.NAME, 0); }
		public TerminalNode PT() { return getToken(GrammaParser.PT, 0); }
		public List<ParametrContext> parametr() {
			return getRuleContexts(ParametrContext.class);
		}
		public ParametrContext parametr(int i) {
			return getRuleContext(ParametrContext.class,i);
		}
		public UpdateContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaListener) ((GrammaListener)listener).enterUpdate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaListener) ((GrammaListener)listener).exitUpdate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaVisitor) return ((GrammaVisitor<? extends T>)visitor).visitUpdate(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DeleteContext extends ExpressionContext {
		public TerminalNode NAME() { return getToken(GrammaParser.NAME, 0); }
		public TerminalNode PT() { return getToken(GrammaParser.PT, 0); }
		public ParametrContext parametr() {
			return getRuleContext(ParametrContext.class,0);
		}
		public DeleteContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaListener) ((GrammaListener)listener).enterDelete(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaListener) ((GrammaListener)listener).exitDelete(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaVisitor) return ((GrammaVisitor<? extends T>)visitor).visitDelete(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MulDivContext extends ExpressionContext {
		public Token operation;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode MULT() { return getToken(GrammaParser.MULT, 0); }
		public TerminalNode DIV() { return getToken(GrammaParser.DIV, 0); }
		public MulDivContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaListener) ((GrammaListener)listener).enterMulDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaListener) ((GrammaListener)listener).exitMulDiv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaVisitor) return ((GrammaVisitor<? extends T>)visitor).visitMulDiv(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TypeConverterContext extends ExpressionContext {
		public TerminalNode TYPE() { return getToken(GrammaParser.TYPE, 0); }
		public TerminalNode NUM() { return getToken(GrammaParser.NUM, 0); }
		public TerminalNode NAME() { return getToken(GrammaParser.NAME, 0); }
		public TypeConverterContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaListener) ((GrammaListener)listener).enterTypeConverter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaListener) ((GrammaListener)listener).exitTypeConverter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaVisitor) return ((GrammaVisitor<? extends T>)visitor).visitTypeConverter(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdkContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public IdkContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaListener) ((GrammaListener)listener).enterIdk(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaListener) ((GrammaListener)listener).exitIdk(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaVisitor) return ((GrammaVisitor<? extends T>)visitor).visitIdk(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NotContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NotContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaListener) ((GrammaListener)listener).enterNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaListener) ((GrammaListener)listener).exitNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaVisitor) return ((GrammaVisitor<? extends T>)visitor).visitNot(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VarEqlsFuncContext extends ExpressionContext {
		public TerminalNode NAME() { return getToken(GrammaParser.NAME, 0); }
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VarEqlsFuncContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaListener) ((GrammaListener)listener).enterVarEqlsFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaListener) ((GrammaListener)listener).exitVarEqlsFunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaVisitor) return ((GrammaVisitor<? extends T>)visitor).visitVarEqlsFunc(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FindContext extends ExpressionContext {
		public TerminalNode NAME() { return getToken(GrammaParser.NAME, 0); }
		public TerminalNode PT() { return getToken(GrammaParser.PT, 0); }
		public List<ParametrContext> parametr() {
			return getRuleContexts(ParametrContext.class);
		}
		public ParametrContext parametr(int i) {
			return getRuleContext(ParametrContext.class,i);
		}
		public FindContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaListener) ((GrammaListener)listener).enterFind(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaListener) ((GrammaListener)listener).exitFind(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaVisitor) return ((GrammaVisitor<? extends T>)visitor).visitFind(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NameContext extends ExpressionContext {
		public TerminalNode NAME() { return getToken(GrammaParser.NAME, 0); }
		public NameContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaListener) ((GrammaListener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaListener) ((GrammaListener)listener).exitName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaVisitor) return ((GrammaVisitor<? extends T>)visitor).visitName(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateContext extends ExpressionContext {
		public TerminalNode TYPE() { return getToken(GrammaParser.TYPE, 0); }
		public List<ParametrContext> parametr() {
			return getRuleContexts(ParametrContext.class);
		}
		public ParametrContext parametr(int i) {
			return getRuleContext(ParametrContext.class,i);
		}
		public CreateContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaListener) ((GrammaListener)listener).enterCreate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaListener) ((GrammaListener)listener).exitCreate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaVisitor) return ((GrammaVisitor<? extends T>)visitor).visitCreate(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DefineVarContext extends ExpressionContext {
		public TerminalNode TYPE() { return getToken(GrammaParser.TYPE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode NAME() { return getToken(GrammaParser.NAME, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DefineVarContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaListener) ((GrammaListener)listener).enterDefineVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaListener) ((GrammaListener)listener).exitDefineVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaVisitor) return ((GrammaVisitor<? extends T>)visitor).visitDefineVar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdContext extends ExpressionContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public IdContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaListener) ((GrammaListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaListener) ((GrammaListener)listener).exitId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaVisitor) return ((GrammaVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LogicContext extends ExpressionContext {
		public Token operation;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode LOGIC() { return getToken(GrammaParser.LOGIC, 0); }
		public LogicContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaListener) ((GrammaListener)listener).enterLogic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaListener) ((GrammaListener)listener).exitLogic(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaVisitor) return ((GrammaVisitor<? extends T>)visitor).visitLogic(this);
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
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				_localctx = new UnaryOperatorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(53);
				unary_operator();
				}
				break;
			case 2:
				{
				_localctx = new DefineVarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(54);
				match(TYPE);
				setState(59);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(55);
					identifier();
					}
					break;
				case 2:
					{
					{
					setState(56);
					match(NAME);
					setState(57);
					match(T__0);
					setState(58);
					expression(0);
					}
					}
					break;
				}
				}
				break;
			case 3:
				{
				_localctx = new ParensContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(61);
				match(T__1);
				setState(62);
				expression(0);
				setState(63);
				match(T__2);
				}
				break;
			case 4:
				{
				_localctx = new NotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(65);
				match(T__4);
				setState(66);
				expression(10);
				}
				break;
			case 5:
				{
				_localctx = new VarEqlsFuncContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(67);
				match(NAME);
				setState(68);
				match(T__0);
				setState(71);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(69);
					function_call();
					}
					break;
				case 2:
					{
					setState(70);
					expression(0);
					}
					break;
				}
				}
				break;
			case 6:
				{
				_localctx = new NumContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(73);
				match(NUM);
				}
				break;
			case 7:
				{
				_localctx = new NameContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(74);
				match(NAME);
				}
				break;
			case 8:
				{
				_localctx = new TypeConverterContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(75);
				match(T__1);
				setState(76);
				match(TYPE);
				setState(77);
				match(T__2);
				setState(78);
				_la = _input.LA(1);
				if ( !(_la==NUM || _la==NAME) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 9:
				{
				_localctx = new IdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(79);
				identifier();
				}
				break;
			case 10:
				{
				_localctx = new FindContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(80);
				match(NAME);
				setState(81);
				match(PT);
				setState(82);
				match(T__5);
				setState(83);
				parametr();
				setState(88);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__6) {
					{
					{
					setState(84);
					match(T__6);
					setState(85);
					parametr();
					}
					}
					setState(90);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(91);
				match(T__2);
				}
				break;
			case 11:
				{
				_localctx = new UpdateContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(93);
				match(NAME);
				setState(94);
				match(PT);
				setState(95);
				match(T__7);
				setState(96);
				match(T__1);
				setState(97);
				parametr();
				setState(102);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__6) {
					{
					{
					setState(98);
					match(T__6);
					setState(99);
					parametr();
					}
					}
					setState(104);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(105);
				match(T__2);
				}
				break;
			case 12:
				{
				_localctx = new DeleteContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(107);
				match(NAME);
				setState(108);
				match(PT);
				setState(109);
				match(T__8);
				setState(110);
				match(T__1);
				setState(111);
				parametr();
				setState(112);
				match(T__2);
				}
				break;
			case 13:
				{
				_localctx = new CreateContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(114);
				match(T__9);
				setState(115);
				match(TYPE);
				setState(116);
				match(T__1);
				setState(118);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(117);
					parametr();
					}
					break;
				}
				setState(124);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__6) {
					{
					{
					setState(120);
					match(T__6);
					setState(121);
					parametr();
					}
					}
					setState(126);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(127);
				match(T__2);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(147);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(145);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						_localctx = new MulDivContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(130);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(131);
						((MulDivContext)_localctx).operation = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==MULT || _la==DIV) ) {
							((MulDivContext)_localctx).operation = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(132);
						expression(16);
						}
						break;
					case 2:
						{
						_localctx = new PlusMinusContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(133);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(134);
						((PlusMinusContext)_localctx).operation = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
							((PlusMinusContext)_localctx).operation = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(135);
						expression(15);
						}
						break;
					case 3:
						{
						_localctx = new CompareContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(136);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(137);
						((CompareContext)_localctx).operation = match(COMPARE);
						setState(138);
						expression(14);
						}
						break;
					case 4:
						{
						_localctx = new LogicContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(139);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(140);
						((LogicContext)_localctx).operation = match(LOGIC);
						setState(141);
						expression(13);
						}
						break;
					case 5:
						{
						_localctx = new IdkContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(142);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(143);
						match(T__3);
						setState(144);
						expression(12);
						}
						break;
					}
					}
				}
				setState(149);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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

	public static class FunctionContext extends ParserRuleContext {
		public TerminalNode TYPE() { return getToken(GrammaParser.TYPE, 0); }
		public TerminalNode NAME() { return getToken(GrammaParser.NAME, 0); }
		public Return_ruleContext return_rule() {
			return getRuleContext(Return_ruleContext.class,0);
		}
		public List<ParametrContext> parametr() {
			return getRuleContexts(ParametrContext.class);
		}
		public ParametrContext parametr(int i) {
			return getRuleContext(ParametrContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaListener) ((GrammaListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaListener) ((GrammaListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaVisitor) return ((GrammaVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			match(TYPE);
			setState(151);
			match(NAME);
			setState(152);
			match(T__1);
			setState(161);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(153);
				parametr();
				setState(158);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__6) {
					{
					{
					setState(154);
					match(T__6);
					setState(155);
					parametr();
					}
					}
					setState(160);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(163);
			match(T__2);
			setState(164);
			match(T__10);
			setState(168);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__4) | (1L << T__9) | (1L << T__14) | (1L << T__16) | (1L << T__17) | (1L << T__19) | (1L << T__20) | (1L << NUM) | (1L << TYPE) | (1L << UNARY_OPERATOR) | (1L << NAME))) != 0)) {
				{
				{
				setState(165);
				statement();
				}
				}
				setState(170);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(171);
			return_rule();
			setState(172);
			match(T__11);
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

	public static class MainFunctionContext extends ParserRuleContext {
		public TerminalNode MAIN_FUNCTION_ID() { return getToken(GrammaParser.MAIN_FUNCTION_ID, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public MainFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaListener) ((GrammaListener)listener).enterMainFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaListener) ((GrammaListener)listener).exitMainFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaVisitor) return ((GrammaVisitor<? extends T>)visitor).visitMainFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainFunctionContext mainFunction() throws RecognitionException {
		MainFunctionContext _localctx = new MainFunctionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_mainFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			match(MAIN_FUNCTION_ID);
			setState(175);
			match(T__12);
			setState(176);
			match(T__10);
			setState(180);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__4) | (1L << T__9) | (1L << T__14) | (1L << T__16) | (1L << T__17) | (1L << T__19) | (1L << T__20) | (1L << NUM) | (1L << TYPE) | (1L << UNARY_OPERATOR) | (1L << NAME))) != 0)) {
				{
				{
				setState(177);
				statement();
				}
				}
				setState(182);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(183);
			match(T__11);
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

	public static class Function_callContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(GrammaParser.NAME, 0); }
		public List<ParametrContext> parametr() {
			return getRuleContexts(ParametrContext.class);
		}
		public ParametrContext parametr(int i) {
			return getRuleContext(ParametrContext.class,i);
		}
		public Function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaListener) ((GrammaListener)listener).enterFunction_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaListener) ((GrammaListener)listener).exitFunction_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaVisitor) return ((GrammaVisitor<? extends T>)visitor).visitFunction_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_function_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			match(NAME);
			setState(186);
			match(T__1);
			{
			setState(187);
			parametr();
			}
			setState(192);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(188);
				match(T__6);
				setState(189);
				parametr();
				}
				}
				setState(194);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(195);
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

	public static class Return_ruleContext extends ParserRuleContext {
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Return_ruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_rule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaListener) ((GrammaListener)listener).enterReturn_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaListener) ((GrammaListener)listener).exitReturn_rule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaVisitor) return ((GrammaVisitor<? extends T>)visitor).visitReturn_rule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_ruleContext return_rule() throws RecognitionException {
		Return_ruleContext _localctx = new Return_ruleContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_return_rule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			match(T__13);
			setState(200);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				{
				setState(198);
				expression(0);
				}
				}
				break;
			case 2:
				{
				setState(199);
				function_call();
				}
				break;
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

	public static class If_ruleContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public Else_ruleContext else_rule() {
			return getRuleContext(Else_ruleContext.class,0);
		}
		public If_ruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_rule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaListener) ((GrammaListener)listener).enterIf_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaListener) ((GrammaListener)listener).exitIf_rule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaVisitor) return ((GrammaVisitor<? extends T>)visitor).visitIf_rule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_ruleContext if_rule() throws RecognitionException {
		If_ruleContext _localctx = new If_ruleContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_if_rule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			match(T__14);
			setState(203);
			match(T__1);
			setState(204);
			expression(0);
			setState(205);
			match(T__2);
			setState(206);
			match(T__10);
			setState(210);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__4) | (1L << T__9) | (1L << T__14) | (1L << T__16) | (1L << T__17) | (1L << T__19) | (1L << T__20) | (1L << NUM) | (1L << TYPE) | (1L << UNARY_OPERATOR) | (1L << NAME))) != 0)) {
				{
				{
				setState(207);
				statement();
				}
				}
				setState(212);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(213);
			match(T__11);
			setState(215);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__15) {
				{
				setState(214);
				else_rule();
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

	public static class Else_ruleContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public Else_ruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_rule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaListener) ((GrammaListener)listener).enterElse_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaListener) ((GrammaListener)listener).exitElse_rule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaVisitor) return ((GrammaVisitor<? extends T>)visitor).visitElse_rule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Else_ruleContext else_rule() throws RecognitionException {
		Else_ruleContext _localctx = new Else_ruleContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_else_rule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(217);
			match(T__15);
			setState(218);
			match(T__10);
			setState(220);
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(219);
				statement();
				}
				}
				setState(222);
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__4) | (1L << T__9) | (1L << T__14) | (1L << T__16) | (1L << T__17) | (1L << T__19) | (1L << T__20) | (1L << NUM) | (1L << TYPE) | (1L << UNARY_OPERATOR) | (1L << NAME))) != 0) );
			setState(224);
			match(T__11);
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

	public static class While_ruleContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public While_ruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_rule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaListener) ((GrammaListener)listener).enterWhile_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaListener) ((GrammaListener)listener).exitWhile_rule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaVisitor) return ((GrammaVisitor<? extends T>)visitor).visitWhile_rule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_ruleContext while_rule() throws RecognitionException {
		While_ruleContext _localctx = new While_ruleContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_while_rule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			match(T__16);
			setState(227);
			match(T__1);
			setState(228);
			expression(0);
			setState(229);
			match(T__2);
			setState(230);
			match(T__10);
			setState(234);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__4) | (1L << T__9) | (1L << T__14) | (1L << T__16) | (1L << T__17) | (1L << T__19) | (1L << T__20) | (1L << NUM) | (1L << TYPE) | (1L << UNARY_OPERATOR) | (1L << NAME))) != 0)) {
				{
				{
				setState(231);
				statement();
				}
				}
				setState(236);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(237);
			match(T__11);
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

	public static class For_ruleContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public For_ruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_rule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaListener) ((GrammaListener)listener).enterFor_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaListener) ((GrammaListener)listener).exitFor_rule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaVisitor) return ((GrammaVisitor<? extends T>)visitor).visitFor_rule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_ruleContext for_rule() throws RecognitionException {
		For_ruleContext _localctx = new For_ruleContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_for_rule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			match(T__17);
			setState(240);
			match(T__1);
			setState(241);
			expression(0);
			setState(242);
			match(T__18);
			setState(243);
			expression(0);
			setState(244);
			match(T__18);
			setState(245);
			expression(0);
			setState(246);
			match(T__2);
			setState(247);
			match(T__10);
			setState(251);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__4) | (1L << T__9) | (1L << T__14) | (1L << T__16) | (1L << T__17) | (1L << T__19) | (1L << T__20) | (1L << NUM) | (1L << TYPE) | (1L << UNARY_OPERATOR) | (1L << NAME))) != 0)) {
				{
				{
				setState(248);
				statement();
				}
				}
				setState(253);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(254);
			match(T__11);
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

	public static class Break_ruleContext extends ParserRuleContext {
		public Break_ruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_break_rule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaListener) ((GrammaListener)listener).enterBreak_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaListener) ((GrammaListener)listener).exitBreak_rule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaVisitor) return ((GrammaVisitor<? extends T>)visitor).visitBreak_rule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Break_ruleContext break_rule() throws RecognitionException {
		Break_ruleContext _localctx = new Break_ruleContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_break_rule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			match(T__19);
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

	public static class Continue_ruleContext extends ParserRuleContext {
		public Continue_ruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continue_rule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaListener) ((GrammaListener)listener).enterContinue_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaListener) ((GrammaListener)listener).exitContinue_rule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaVisitor) return ((GrammaVisitor<? extends T>)visitor).visitContinue_rule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Continue_ruleContext continue_rule() throws RecognitionException {
		Continue_ruleContext _localctx = new Continue_ruleContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_continue_rule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			match(T__20);
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

	public static class Statement_rulesContext extends ParserRuleContext {
		public If_ruleContext if_rule() {
			return getRuleContext(If_ruleContext.class,0);
		}
		public While_ruleContext while_rule() {
			return getRuleContext(While_ruleContext.class,0);
		}
		public For_ruleContext for_rule() {
			return getRuleContext(For_ruleContext.class,0);
		}
		public Break_ruleContext break_rule() {
			return getRuleContext(Break_ruleContext.class,0);
		}
		public Continue_ruleContext continue_rule() {
			return getRuleContext(Continue_ruleContext.class,0);
		}
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Statement_rulesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement_rules; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaListener) ((GrammaListener)listener).enterStatement_rules(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaListener) ((GrammaListener)listener).exitStatement_rules(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaVisitor) return ((GrammaVisitor<? extends T>)visitor).visitStatement_rules(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Statement_rulesContext statement_rules() throws RecognitionException {
		Statement_rulesContext _localctx = new Statement_rulesContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_statement_rules);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(260);
				if_rule();
				}
				break;
			case 2:
				{
				setState(261);
				while_rule();
				}
				break;
			case 3:
				{
				setState(262);
				for_rule();
				}
				break;
			case 4:
				{
				setState(263);
				break_rule();
				}
				break;
			case 5:
				{
				setState(264);
				continue_rule();
				}
				break;
			case 6:
				{
				setState(266);
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(265);
						expression(0);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(268);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
				} while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 7:
				{
				setState(270);
				function_call();
				}
				break;
			case 8:
				{
				setState(271);
				function();
				}
				break;
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

	public static class StatementContext extends ParserRuleContext {
		public List<Statement_rulesContext> statement_rules() {
			return getRuleContexts(Statement_rulesContext.class);
		}
		public Statement_rulesContext statement_rules(int i) {
			return getRuleContext(Statement_rulesContext.class,i);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaListener) ((GrammaListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaListener) ((GrammaListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaVisitor) return ((GrammaVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_statement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(274);
					statement_rules();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(277);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			} while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER );
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

	public static class ProgramContext extends ParserRuleContext {
		public MainFunctionContext mainFunction() {
			return getRuleContext(MainFunctionContext.class,0);
		}
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaListener) ((GrammaListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammaListener) ((GrammaListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammaVisitor) return ((GrammaVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TYPE) {
				{
				{
				setState(279);
				function();
				}
				}
				setState(284);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(285);
			mainFunction();
			setState(289);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TYPE) {
				{
				{
				setState(286);
				function();
				}
				}
				setState(291);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 3:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 15);
		case 1:
			return precpred(_ctx, 14);
		case 2:
			return precpred(_ctx, 13);
		case 3:
			return precpred(_ctx, 12);
		case 4:
			return precpred(_ctx, 11);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3$\u0127\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\3\2\3\2\3\2\5\2)\n\2\3\3\3\3\3\3\3\3\5\3/\n\3\3\4\3\4\3\4\3\4\5\4"+
		"\65\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5>\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\5\5J\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\7\5Y\n\5\f\5\16\5\\\13\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7"+
		"\5g\n\5\f\5\16\5j\13\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\5\5y\n\5\3\5\3\5\7\5}\n\5\f\5\16\5\u0080\13\5\3\5\5\5\u0083\n\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5\u0094\n"+
		"\5\f\5\16\5\u0097\13\5\3\6\3\6\3\6\3\6\3\6\3\6\7\6\u009f\n\6\f\6\16\6"+
		"\u00a2\13\6\5\6\u00a4\n\6\3\6\3\6\3\6\7\6\u00a9\n\6\f\6\16\6\u00ac\13"+
		"\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\7\7\u00b5\n\7\f\7\16\7\u00b8\13\7\3\7\3"+
		"\7\3\b\3\b\3\b\3\b\3\b\7\b\u00c1\n\b\f\b\16\b\u00c4\13\b\3\b\3\b\3\t\3"+
		"\t\3\t\5\t\u00cb\n\t\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u00d3\n\n\f\n\16\n\u00d6"+
		"\13\n\3\n\3\n\5\n\u00da\n\n\3\13\3\13\3\13\6\13\u00df\n\13\r\13\16\13"+
		"\u00e0\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u00eb\n\f\f\f\16\f\u00ee"+
		"\13\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u00fc\n\r\f"+
		"\r\16\r\u00ff\13\r\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\6\20\u010d\n\20\r\20\16\20\u010e\3\20\3\20\5\20\u0113\n\20\3\21"+
		"\6\21\u0116\n\21\r\21\16\21\u0117\3\22\7\22\u011b\n\22\f\22\16\22\u011e"+
		"\13\22\3\22\3\22\7\22\u0122\n\22\f\22\16\22\u0125\13\22\3\22\2\3\b\23"+
		"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"\2\5\4\2\31\31##\3\2\33\34\3"+
		"\2\35\36\2\u0147\2(\3\2\2\2\4*\3\2\2\2\6\64\3\2\2\2\b\u0082\3\2\2\2\n"+
		"\u0098\3\2\2\2\f\u00b0\3\2\2\2\16\u00bb\3\2\2\2\20\u00c7\3\2\2\2\22\u00cc"+
		"\3\2\2\2\24\u00db\3\2\2\2\26\u00e4\3\2\2\2\30\u00f1\3\2\2\2\32\u0102\3"+
		"\2\2\2\34\u0104\3\2\2\2\36\u0112\3\2\2\2 \u0115\3\2\2\2\"\u011c\3\2\2"+
		"\2$%\7\32\2\2%)\7#\2\2&)\7\31\2\2\')\7#\2\2($\3\2\2\2(&\3\2\2\2(\'\3\2"+
		"\2\2()\3\2\2\2)\3\3\2\2\2*+\7#\2\2+.\7\3\2\2,/\7\31\2\2-/\5\16\b\2.,\3"+
		"\2\2\2.-\3\2\2\2/\5\3\2\2\2\60\61\7#\2\2\61\65\7!\2\2\62\63\7!\2\2\63"+
		"\65\7#\2\2\64\60\3\2\2\2\64\62\3\2\2\2\65\7\3\2\2\2\66\67\b\5\1\2\67\u0083"+
		"\5\6\4\28=\7\32\2\29>\5\4\3\2:;\7#\2\2;<\7\3\2\2<>\5\b\5\2=9\3\2\2\2="+
		":\3\2\2\2>\u0083\3\2\2\2?@\7\4\2\2@A\5\b\5\2AB\7\5\2\2B\u0083\3\2\2\2"+
		"CD\7\7\2\2D\u0083\5\b\5\fEF\7#\2\2FI\7\3\2\2GJ\5\16\b\2HJ\5\b\5\2IG\3"+
		"\2\2\2IH\3\2\2\2J\u0083\3\2\2\2K\u0083\7\31\2\2L\u0083\7#\2\2MN\7\4\2"+
		"\2NO\7\32\2\2OP\7\5\2\2P\u0083\t\2\2\2Q\u0083\5\4\3\2RS\7#\2\2ST\7\30"+
		"\2\2TU\7\b\2\2UZ\5\2\2\2VW\7\t\2\2WY\5\2\2\2XV\3\2\2\2Y\\\3\2\2\2ZX\3"+
		"\2\2\2Z[\3\2\2\2[]\3\2\2\2\\Z\3\2\2\2]^\7\5\2\2^\u0083\3\2\2\2_`\7#\2"+
		"\2`a\7\30\2\2ab\7\n\2\2bc\7\4\2\2ch\5\2\2\2de\7\t\2\2eg\5\2\2\2fd\3\2"+
		"\2\2gj\3\2\2\2hf\3\2\2\2hi\3\2\2\2ik\3\2\2\2jh\3\2\2\2kl\7\5\2\2l\u0083"+
		"\3\2\2\2mn\7#\2\2no\7\30\2\2op\7\13\2\2pq\7\4\2\2qr\5\2\2\2rs\7\5\2\2"+
		"s\u0083\3\2\2\2tu\7\f\2\2uv\7\32\2\2vx\7\4\2\2wy\5\2\2\2xw\3\2\2\2xy\3"+
		"\2\2\2y~\3\2\2\2z{\7\t\2\2{}\5\2\2\2|z\3\2\2\2}\u0080\3\2\2\2~|\3\2\2"+
		"\2~\177\3\2\2\2\177\u0081\3\2\2\2\u0080~\3\2\2\2\u0081\u0083\7\5\2\2\u0082"+
		"\66\3\2\2\2\u00828\3\2\2\2\u0082?\3\2\2\2\u0082C\3\2\2\2\u0082E\3\2\2"+
		"\2\u0082K\3\2\2\2\u0082L\3\2\2\2\u0082M\3\2\2\2\u0082Q\3\2\2\2\u0082R"+
		"\3\2\2\2\u0082_\3\2\2\2\u0082m\3\2\2\2\u0082t\3\2\2\2\u0083\u0095\3\2"+
		"\2\2\u0084\u0085\f\21\2\2\u0085\u0086\t\3\2\2\u0086\u0094\5\b\5\22\u0087"+
		"\u0088\f\20\2\2\u0088\u0089\t\4\2\2\u0089\u0094\5\b\5\21\u008a\u008b\f"+
		"\17\2\2\u008b\u008c\7 \2\2\u008c\u0094\5\b\5\20\u008d\u008e\f\16\2\2\u008e"+
		"\u008f\7\37\2\2\u008f\u0094\5\b\5\17\u0090\u0091\f\r\2\2\u0091\u0092\7"+
		"\6\2\2\u0092\u0094\5\b\5\16\u0093\u0084\3\2\2\2\u0093\u0087\3\2\2\2\u0093"+
		"\u008a\3\2\2\2\u0093\u008d\3\2\2\2\u0093\u0090\3\2\2\2\u0094\u0097\3\2"+
		"\2\2\u0095\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096\t\3\2\2\2\u0097\u0095"+
		"\3\2\2\2\u0098\u0099\7\32\2\2\u0099\u009a\7#\2\2\u009a\u00a3\7\4\2\2\u009b"+
		"\u00a0\5\2\2\2\u009c\u009d\7\t\2\2\u009d\u009f\5\2\2\2\u009e\u009c\3\2"+
		"\2\2\u009f\u00a2\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1"+
		"\u00a4\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a3\u009b\3\2\2\2\u00a3\u00a4\3\2"+
		"\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a6\7\5\2\2\u00a6\u00aa\7\r\2\2\u00a7"+
		"\u00a9\5 \21\2\u00a8\u00a7\3\2\2\2\u00a9\u00ac\3\2\2\2\u00aa\u00a8\3\2"+
		"\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ad\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ad"+
		"\u00ae\5\20\t\2\u00ae\u00af\7\16\2\2\u00af\13\3\2\2\2\u00b0\u00b1\7\""+
		"\2\2\u00b1\u00b2\7\17\2\2\u00b2\u00b6\7\r\2\2\u00b3\u00b5\5 \21\2\u00b4"+
		"\u00b3\3\2\2\2\u00b5\u00b8\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b6\u00b7\3\2"+
		"\2\2\u00b7\u00b9\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b9\u00ba\7\16\2\2\u00ba"+
		"\r\3\2\2\2\u00bb\u00bc\7#\2\2\u00bc\u00bd\7\4\2\2\u00bd\u00c2\5\2\2\2"+
		"\u00be\u00bf\7\t\2\2\u00bf\u00c1\5\2\2\2\u00c0\u00be\3\2\2\2\u00c1\u00c4"+
		"\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c5\3\2\2\2\u00c4"+
		"\u00c2\3\2\2\2\u00c5\u00c6\7\5\2\2\u00c6\17\3\2\2\2\u00c7\u00ca\7\20\2"+
		"\2\u00c8\u00cb\5\b\5\2\u00c9\u00cb\5\16\b\2\u00ca\u00c8\3\2\2\2\u00ca"+
		"\u00c9\3\2\2\2\u00cb\21\3\2\2\2\u00cc\u00cd\7\21\2\2\u00cd\u00ce\7\4\2"+
		"\2\u00ce\u00cf\5\b\5\2\u00cf\u00d0\7\5\2\2\u00d0\u00d4\7\r\2\2\u00d1\u00d3"+
		"\5 \21\2\u00d2\u00d1\3\2\2\2\u00d3\u00d6\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d4"+
		"\u00d5\3\2\2\2\u00d5\u00d7\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d7\u00d9\7\16"+
		"\2\2\u00d8\u00da\5\24\13\2\u00d9\u00d8\3\2\2\2\u00d9\u00da\3\2\2\2\u00da"+
		"\23\3\2\2\2\u00db\u00dc\7\22\2\2\u00dc\u00de\7\r\2\2\u00dd\u00df\5 \21"+
		"\2\u00de\u00dd\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00de\3\2\2\2\u00e0\u00e1"+
		"\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e3\7\16\2\2\u00e3\25\3\2\2\2\u00e4"+
		"\u00e5\7\23\2\2\u00e5\u00e6\7\4\2\2\u00e6\u00e7\5\b\5\2\u00e7\u00e8\7"+
		"\5\2\2\u00e8\u00ec\7\r\2\2\u00e9\u00eb\5 \21\2\u00ea\u00e9\3\2\2\2\u00eb"+
		"\u00ee\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00ef\3\2"+
		"\2\2\u00ee\u00ec\3\2\2\2\u00ef\u00f0\7\16\2\2\u00f0\27\3\2\2\2\u00f1\u00f2"+
		"\7\24\2\2\u00f2\u00f3\7\4\2\2\u00f3\u00f4\5\b\5\2\u00f4\u00f5\7\25\2\2"+
		"\u00f5\u00f6\5\b\5\2\u00f6\u00f7\7\25\2\2\u00f7\u00f8\5\b\5\2\u00f8\u00f9"+
		"\7\5\2\2\u00f9\u00fd\7\r\2\2\u00fa\u00fc\5 \21\2\u00fb\u00fa\3\2\2\2\u00fc"+
		"\u00ff\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\u0100\3\2"+
		"\2\2\u00ff\u00fd\3\2\2\2\u0100\u0101\7\16\2\2\u0101\31\3\2\2\2\u0102\u0103"+
		"\7\26\2\2\u0103\33\3\2\2\2\u0104\u0105\7\27\2\2\u0105\35\3\2\2\2\u0106"+
		"\u0113\5\22\n\2\u0107\u0113\5\26\f\2\u0108\u0113\5\30\r\2\u0109\u0113"+
		"\5\32\16\2\u010a\u0113\5\34\17\2\u010b\u010d\5\b\5\2\u010c\u010b\3\2\2"+
		"\2\u010d\u010e\3\2\2\2\u010e\u010c\3\2\2\2\u010e\u010f\3\2\2\2\u010f\u0113"+
		"\3\2\2\2\u0110\u0113\5\16\b\2\u0111\u0113\5\n\6\2\u0112\u0106\3\2\2\2"+
		"\u0112\u0107\3\2\2\2\u0112\u0108\3\2\2\2\u0112\u0109\3\2\2\2\u0112\u010a"+
		"\3\2\2\2\u0112\u010c\3\2\2\2\u0112\u0110\3\2\2\2\u0112\u0111\3\2\2\2\u0113"+
		"\37\3\2\2\2\u0114\u0116\5\36\20\2\u0115\u0114\3\2\2\2\u0116\u0117\3\2"+
		"\2\2\u0117\u0115\3\2\2\2\u0117\u0118\3\2\2\2\u0118!\3\2\2\2\u0119\u011b"+
		"\5\n\6\2\u011a\u0119\3\2\2\2\u011b\u011e\3\2\2\2\u011c\u011a\3\2\2\2\u011c"+
		"\u011d\3\2\2\2\u011d\u011f\3\2\2\2\u011e\u011c\3\2\2\2\u011f\u0123\5\f"+
		"\7\2\u0120\u0122\5\n\6\2\u0121\u0120\3\2\2\2\u0122\u0125\3\2\2\2\u0123"+
		"\u0121\3\2\2\2\u0123\u0124\3\2\2\2\u0124#\3\2\2\2\u0125\u0123\3\2\2\2"+
		"\36(.\64=IZhx~\u0082\u0093\u0095\u00a0\u00a3\u00aa\u00b6\u00c2\u00ca\u00d4"+
		"\u00d9\u00e0\u00ec\u00fd\u010e\u0112\u0117\u011c\u0123";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}