// Generated from Blang.g4 by ANTLR 4.3

    package com.lang.blang.config.antlr4;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class BlangParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__6=1, T__5=2, T__4=3, T__3=4, T__2=5, T__1=6, T__0=7, Conjunctions=8, 
		CurrentYear=9, CurrentTime=10, CurrentDate=11, Println=12, Print=13, Input=14, 
		Assert=15, Size=16, Def=17, If=18, Else=19, Return=20, For=21, While=22, 
		To=23, Do=24, End=25, In=26, Notin=27, Null=28, Each=29, As=30, Or=31, 
		And=32, Equals=33, NEquals=34, GTEquals=35, LTEquals=36, Pow=37, Excl=38, 
		GT=39, LT=40, Add=41, Subtract=42, Multiply=43, Divide=44, Modulus=45, 
		OBrace=46, CBrace=47, OBracket=48, CBracket=49, OParen=50, CParen=51, 
		SColon=52, Assign=53, Comma=54, QMark=55, Colon=56, Get=57, From=58, Of=59, 
		Where=60, Between=61, Last=62, First=63, Years=64, Relations=65, Set=66, 
		Noun=67, Create=68, Composite=69, Calculate=70, RoundOf=71, ReplaceNull=72, 
		ReplaceNullOrEmpty=73, StartsWith=74, Like=75, EndsWith=76, Select=77, 
		Sum=78, Avg=79, Copyof=80, By=81, Abs=82, NotLike=83, Next=84, Bool=85, 
		Number=86, Since=87, Identifier=88, String=89, StringLines=90, Comment=91, 
		Space=92;
	public static final String[] tokenNames = {
		"<INVALID>", "'||'", "'by desc('", "'&&'", "'.'", "'->'", "'by asc('", 
		"').'", "Conjunctions", "'current year'", "'current time'", "'current date'", 
		"'println'", "'print'", "'input'", "'assert'", "'size'", "'def'", "'if'", 
		"'else'", "'return'", "'for'", "'while'", "'to'", "'do'", "'end'", "'in'", 
		"'not in'", "'null'", "'each'", "'as'", "Or", "And", "'=='", "'!='", "'>='", 
		"'<='", "'^'", "'!'", "'>'", "'<'", "'+'", "'-'", "'*'", "'/'", "'%'", 
		"'{'", "'}'", "'['", "']'", "'('", "')'", "';'", "'='", "','", "'?'", 
		"':'", "Get", "'from'", "'of'", "'where'", "'between'", "'last'", "'first'", 
		"Years", "Relations", "'set'", "'noun'", "'create'", "'composite'", "'calculate'", 
		"'roundof'", "'replacenull'", "'replacenullorempty'", "'starts with'", 
		"'like'", "'ends with'", "'select'", "'sum'", "'avg'", "'copyof'", "'by'", 
		"'abs'", "'not like'", "'next'", "Bool", "Number", "Since", "Identifier", 
		"String", "StringLines", "Comment", "Space"
	};
	public static final int
		RULE_parse = 0, RULE_block = 1, RULE_statement = 2, RULE_assignment = 3, 
		RULE_functionCall = 4, RULE_ifStatement = 5, RULE_ifStat = 6, RULE_elseIfStat = 7, 
		RULE_elseStat = 8, RULE_functionDecl = 9, RULE_forStatement = 10, RULE_forEachStatement = 11, 
		RULE_whileStatement = 12, RULE_verbStatement = 13, RULE_selectStatement = 14, 
		RULE_ds = 15, RULE_nouns = 16, RULE_nounorfunction = 17, RULE_filters = 18, 
		RULE_orderby = 19, RULE_criteriaexpr = 20, RULE_relationStatement = 21, 
		RULE_relationStat = 22, RULE_relationClause = 23, RULE_setNounStatement = 24, 
		RULE_fetchStatement = 25, RULE_calculateStatement = 26, RULE_compositeStatement = 27, 
		RULE_dsBlock = 28, RULE_filterCriteria = 29, RULE_criteria = 30, RULE_time_period = 31, 
		RULE_prepositions = 32, RULE_nounList = 33, RULE_idList = 34, RULE_exprList = 35, 
		RULE_expression = 36, RULE_list = 37, RULE_aggregateFunctionCall = 38, 
		RULE_indexes = 39, RULE_dateExpression = 40;
	public static final String[] ruleNames = {
		"parse", "block", "statement", "assignment", "functionCall", "ifStatement", 
		"ifStat", "elseIfStat", "elseStat", "functionDecl", "forStatement", "forEachStatement", 
		"whileStatement", "verbStatement", "selectStatement", "ds", "nouns", "nounorfunction", 
		"filters", "orderby", "criteriaexpr", "relationStatement", "relationStat", 
		"relationClause", "setNounStatement", "fetchStatement", "calculateStatement", 
		"compositeStatement", "dsBlock", "filterCriteria", "criteria", "time_period", 
		"prepositions", "nounList", "idList", "exprList", "expression", "list", 
		"aggregateFunctionCall", "indexes", "dateExpression"
	};

	@Override
	public String getGrammarFileName() { return "Blang.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public BlangParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ParseContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(BlangParser.EOF, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ParseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlangListener ) ((BlangListener)listener).enterParse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlangListener ) ((BlangListener)listener).exitParse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlangVisitor ) return ((BlangVisitor<? extends T>)visitor).visitParse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParseContext parse() throws RecognitionException {
		ParseContext _localctx = new ParseContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_parse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82); block();
			setState(83); match(EOF);
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
		public FunctionDeclContext functionDecl(int i) {
			return getRuleContext(FunctionDeclContext.class,i);
		}
		public List<FunctionDeclContext> functionDecl() {
			return getRuleContexts(FunctionDeclContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public TerminalNode Return() { return getToken(BlangParser.Return, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlangListener ) ((BlangListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlangListener ) ((BlangListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlangVisitor ) return ((BlangVisitor<? extends T>)visitor).visitBlock(this);
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
			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Println) | (1L << Print) | (1L << Assert) | (1L << Size) | (1L << Def) | (1L << If) | (1L << For) | (1L << While) | (1L << Get))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (Relations - 65)) | (1L << (Set - 65)) | (1L << (Create - 65)) | (1L << (Calculate - 65)) | (1L << (RoundOf - 65)) | (1L << (ReplaceNull - 65)) | (1L << (ReplaceNullOrEmpty - 65)) | (1L << (Select - 65)) | (1L << (Sum - 65)) | (1L << (Avg - 65)) | (1L << (Abs - 65)) | (1L << (Identifier - 65)) | (1L << (String - 65)))) != 0)) {
				{
				setState(87);
				switch (_input.LA(1)) {
				case Println:
				case Print:
				case Assert:
				case Size:
				case If:
				case For:
				case While:
				case Get:
				case Relations:
				case Set:
				case Create:
				case Calculate:
				case RoundOf:
				case ReplaceNull:
				case ReplaceNullOrEmpty:
				case Select:
				case Sum:
				case Avg:
				case Abs:
				case Identifier:
				case String:
					{
					setState(85); statement();
					}
					break;
				case Def:
					{
					setState(86); functionDecl();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(91);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(96);
			_la = _input.LA(1);
			if (_la==Return) {
				{
				setState(92); match(Return);
				setState(93); expression(0);
				setState(94); match(SColon);
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

	public static class StatementContext extends ParserRuleContext {
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public SetNounStatementContext setNounStatement() {
			return getRuleContext(SetNounStatementContext.class,0);
		}
		public RelationStatementContext relationStatement() {
			return getRuleContext(RelationStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public CompositeStatementContext compositeStatement() {
			return getRuleContext(CompositeStatementContext.class,0);
		}
		public ForEachStatementContext forEachStatement() {
			return getRuleContext(ForEachStatementContext.class,0);
		}
		public VerbStatementContext verbStatement() {
			return getRuleContext(VerbStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlangListener ) ((BlangListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlangListener ) ((BlangListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlangVisitor ) return ((BlangVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		try {
			setState(116);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(98); assignment();
				setState(99); match(SColon);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(101); functionCall();
				setState(102); match(SColon);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(104); ifStatement();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(105); forStatement();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(106); forEachStatement();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(107); whileStatement();
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(108); verbStatement();
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(109); relationStatement();
				setState(110); match(SColon);
				}
				break;

			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(112); setNounStatement();
				setState(113); match(SColon);
				}
				break;

			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(115); compositeStatement();
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

	public static class AssignmentContext extends ParserRuleContext {
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
	 
		public AssignmentContext() { }
		public void copyFrom(AssignmentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TableStringPropertyAssignmentContext extends AssignmentContext {
		public TerminalNode String() { return getToken(BlangParser.String, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TableStringPropertyAssignmentContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlangListener ) ((BlangListener)listener).enterTableStringPropertyAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlangListener ) ((BlangListener)listener).exitTableStringPropertyAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlangVisitor ) return ((BlangVisitor<? extends T>)visitor).visitTableStringPropertyAssignment(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TablePropertyStringAssignmentContext extends AssignmentContext {
		public TerminalNode Identifier() { return getToken(BlangParser.Identifier, 0); }
		public TerminalNode String() { return getToken(BlangParser.String, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TablePropertyStringAssignmentContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlangListener ) ((BlangListener)listener).enterTablePropertyStringAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlangListener ) ((BlangListener)listener).exitTablePropertyStringAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlangVisitor ) return ((BlangVisitor<? extends T>)visitor).visitTablePropertyStringAssignment(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TablePropertyAssignmentContext extends AssignmentContext {
		public List<TerminalNode> Identifier() { return getTokens(BlangParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(BlangParser.Identifier, i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TablePropertyAssignmentContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlangListener ) ((BlangListener)listener).enterTablePropertyAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlangListener ) ((BlangListener)listener).exitTablePropertyAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlangVisitor ) return ((BlangVisitor<? extends T>)visitor).visitTablePropertyAssignment(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VarAndArrayAssignmentContext extends AssignmentContext {
		public IndexesContext indexes() {
			return getRuleContext(IndexesContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(BlangParser.Identifier, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VarAndArrayAssignmentContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlangListener ) ((BlangListener)listener).enterVarAndArrayAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlangListener ) ((BlangListener)listener).exitVarAndArrayAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlangVisitor ) return ((BlangVisitor<? extends T>)visitor).visitVarAndArrayAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_assignment);
		int _la;
		try {
			setState(142);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new VarAndArrayAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(118); match(Identifier);
				setState(120);
				_la = _input.LA(1);
				if (_la==OBracket) {
					{
					setState(119); indexes();
					}
				}

				setState(122); match(Assign);
				setState(123); expression(0);
				}
				break;

			case 2:
				_localctx = new TablePropertyAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(124); match(Identifier);
				setState(127); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(125); match(T__3);
					setState(126); match(Identifier);
					}
					}
					setState(129); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__3 );
				setState(131); match(Assign);
				setState(132); expression(0);
				}
				break;

			case 3:
				_localctx = new TablePropertyStringAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(133); match(Identifier);
				{
				setState(134); match(T__3);
				setState(135); match(String);
				}
				setState(137); match(Assign);
				setState(138); expression(0);
				}
				break;

			case 4:
				_localctx = new TableStringPropertyAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(139); match(String);
				setState(140); match(Assign);
				setState(141); expression(0);
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

	public static class FunctionCallContext extends ParserRuleContext {
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
	 
		public FunctionCallContext() { }
		public void copyFrom(FunctionCallContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AssertFunctionCallContext extends FunctionCallContext {
		public TerminalNode Assert() { return getToken(BlangParser.Assert, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssertFunctionCallContext(FunctionCallContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlangListener ) ((BlangListener)listener).enterAssertFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlangListener ) ((BlangListener)listener).exitAssertFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlangVisitor ) return ((BlangVisitor<? extends T>)visitor).visitAssertFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ReplaceNullOrEmptyFunctionCallContext extends FunctionCallContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode ReplaceNullOrEmpty() { return getToken(BlangParser.ReplaceNullOrEmpty, 0); }
		public ReplaceNullOrEmptyFunctionCallContext(FunctionCallContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlangListener ) ((BlangListener)listener).enterReplaceNullOrEmptyFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlangListener ) ((BlangListener)listener).exitReplaceNullOrEmptyFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlangVisitor ) return ((BlangVisitor<? extends T>)visitor).visitReplaceNullOrEmptyFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SizeFunctionCallContext extends FunctionCallContext {
		public TerminalNode Size() { return getToken(BlangParser.Size, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SizeFunctionCallContext(FunctionCallContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlangListener ) ((BlangListener)listener).enterSizeFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlangListener ) ((BlangListener)listener).exitSizeFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlangVisitor ) return ((BlangVisitor<? extends T>)visitor).visitSizeFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RoundOfFunctionCallContext extends FunctionCallContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode RoundOf() { return getToken(BlangParser.RoundOf, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public RoundOfFunctionCallContext(FunctionCallContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlangListener ) ((BlangListener)listener).enterRoundOfFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlangListener ) ((BlangListener)listener).exitRoundOfFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlangVisitor ) return ((BlangVisitor<? extends T>)visitor).visitRoundOfFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrintlnFunctionCallContext extends FunctionCallContext {
		public TerminalNode Println() { return getToken(BlangParser.Println, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PrintlnFunctionCallContext(FunctionCallContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlangListener ) ((BlangListener)listener).enterPrintlnFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlangListener ) ((BlangListener)listener).exitPrintlnFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlangVisitor ) return ((BlangVisitor<? extends T>)visitor).visitPrintlnFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SumFunctionCallContext extends FunctionCallContext {
		public TerminalNode Sum() { return getToken(BlangParser.Sum, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SumFunctionCallContext(FunctionCallContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlangListener ) ((BlangListener)listener).enterSumFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlangListener ) ((BlangListener)listener).exitSumFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlangVisitor ) return ((BlangVisitor<? extends T>)visitor).visitSumFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ReplaceNullFunctionCallContext extends FunctionCallContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ReplaceNull() { return getToken(BlangParser.ReplaceNull, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ReplaceNullFunctionCallContext(FunctionCallContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlangListener ) ((BlangListener)listener).enterReplaceNullFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlangListener ) ((BlangListener)listener).exitReplaceNullFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlangVisitor ) return ((BlangVisitor<? extends T>)visitor).visitReplaceNullFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AvgFunctionCallContext extends FunctionCallContext {
		public TerminalNode Avg() { return getToken(BlangParser.Avg, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AvgFunctionCallContext(FunctionCallContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlangListener ) ((BlangListener)listener).enterAvgFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlangListener ) ((BlangListener)listener).exitAvgFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlangVisitor ) return ((BlangVisitor<? extends T>)visitor).visitAvgFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AbsFunctionCallContext extends FunctionCallContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Abs() { return getToken(BlangParser.Abs, 0); }
		public AbsFunctionCallContext(FunctionCallContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlangListener ) ((BlangListener)listener).enterAbsFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlangListener ) ((BlangListener)listener).exitAbsFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlangVisitor ) return ((BlangVisitor<? extends T>)visitor).visitAbsFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdentifierFunctionCallContext extends FunctionCallContext {
		public ExprListContext exprList() {
			return getRuleContext(ExprListContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(BlangParser.Identifier, 0); }
		public IdentifierFunctionCallContext(FunctionCallContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlangListener ) ((BlangListener)listener).enterIdentifierFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlangListener ) ((BlangListener)listener).exitIdentifierFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlangVisitor ) return ((BlangVisitor<? extends T>)visitor).visitIdentifierFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrintFunctionCallContext extends FunctionCallContext {
		public TerminalNode Print() { return getToken(BlangParser.Print, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PrintFunctionCallContext(FunctionCallContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlangListener ) ((BlangListener)listener).enterPrintFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlangListener ) ((BlangListener)listener).exitPrintFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlangVisitor ) return ((BlangVisitor<? extends T>)visitor).visitPrintFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_functionCall);
		int _la;
		try {
			setState(210);
			switch (_input.LA(1)) {
			case Identifier:
				_localctx = new IdentifierFunctionCallContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(144); match(Identifier);
				setState(145); match(OParen);
				setState(147);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CurrentYear) | (1L << CurrentTime) | (1L << CurrentDate) | (1L << Println) | (1L << Print) | (1L << Input) | (1L << Assert) | (1L << Size) | (1L << Null) | (1L << Excl) | (1L << Subtract) | (1L << OBracket) | (1L << OParen) | (1L << Get))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (Calculate - 70)) | (1L << (RoundOf - 70)) | (1L << (ReplaceNull - 70)) | (1L << (ReplaceNullOrEmpty - 70)) | (1L << (Select - 70)) | (1L << (Sum - 70)) | (1L << (Avg - 70)) | (1L << (Copyof - 70)) | (1L << (Abs - 70)) | (1L << (Next - 70)) | (1L << (Bool - 70)) | (1L << (Number - 70)) | (1L << (Identifier - 70)) | (1L << (String - 70)))) != 0)) {
					{
					setState(146); exprList();
					}
				}

				setState(149); match(CParen);
				}
				break;
			case Println:
				_localctx = new PrintlnFunctionCallContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(150); match(Println);
				setState(151); match(OParen);
				setState(153);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CurrentYear) | (1L << CurrentTime) | (1L << CurrentDate) | (1L << Println) | (1L << Print) | (1L << Input) | (1L << Assert) | (1L << Size) | (1L << Null) | (1L << Excl) | (1L << Subtract) | (1L << OBracket) | (1L << OParen) | (1L << Get))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (Calculate - 70)) | (1L << (RoundOf - 70)) | (1L << (ReplaceNull - 70)) | (1L << (ReplaceNullOrEmpty - 70)) | (1L << (Select - 70)) | (1L << (Sum - 70)) | (1L << (Avg - 70)) | (1L << (Copyof - 70)) | (1L << (Abs - 70)) | (1L << (Next - 70)) | (1L << (Bool - 70)) | (1L << (Number - 70)) | (1L << (Identifier - 70)) | (1L << (String - 70)))) != 0)) {
					{
					setState(152); expression(0);
					}
				}

				setState(155); match(CParen);
				}
				break;
			case Print:
				_localctx = new PrintFunctionCallContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(156); match(Print);
				setState(157); match(OParen);
				setState(158); expression(0);
				setState(159); match(CParen);
				}
				break;
			case Assert:
				_localctx = new AssertFunctionCallContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(161); match(Assert);
				setState(162); match(OParen);
				setState(163); expression(0);
				setState(164); match(CParen);
				}
				break;
			case Size:
				_localctx = new SizeFunctionCallContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(166); match(Size);
				setState(167); match(OParen);
				setState(168); expression(0);
				setState(169); match(CParen);
				}
				break;
			case RoundOf:
				_localctx = new RoundOfFunctionCallContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(171); match(RoundOf);
				setState(172); match(OParen);
				setState(173); expression(0);
				{
				setState(174); match(Comma);
				setState(175); expression(0);
				}
				setState(177); match(CParen);
				}
				break;
			case ReplaceNull:
				_localctx = new ReplaceNullFunctionCallContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(179); match(ReplaceNull);
				setState(180); match(OParen);
				setState(181); expression(0);
				{
				setState(182); match(Comma);
				setState(183); expression(0);
				}
				setState(185); match(CParen);
				}
				break;
			case ReplaceNullOrEmpty:
				_localctx = new ReplaceNullOrEmptyFunctionCallContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(187); match(ReplaceNullOrEmpty);
				setState(188); match(OParen);
				setState(189); expression(0);
				{
				setState(190); match(Comma);
				setState(191); expression(0);
				}
				setState(193); match(CParen);
				}
				break;
			case Sum:
				_localctx = new SumFunctionCallContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(195); match(Sum);
				setState(196); match(OParen);
				setState(197); expression(0);
				setState(198); match(CParen);
				}
				break;
			case Avg:
				_localctx = new AvgFunctionCallContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(200); match(Avg);
				setState(201); match(OParen);
				setState(202); expression(0);
				setState(203); match(CParen);
				}
				break;
			case Abs:
				_localctx = new AbsFunctionCallContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(205); match(Abs);
				setState(206); match(OParen);
				setState(207); expression(0);
				setState(208); match(CParen);
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

	public static class IfStatementContext extends ParserRuleContext {
		public IfStatContext ifStat() {
			return getRuleContext(IfStatContext.class,0);
		}
		public TerminalNode End() { return getToken(BlangParser.End, 0); }
		public ElseIfStatContext elseIfStat(int i) {
			return getRuleContext(ElseIfStatContext.class,i);
		}
		public List<ElseIfStatContext> elseIfStat() {
			return getRuleContexts(ElseIfStatContext.class);
		}
		public ElseStatContext elseStat() {
			return getRuleContext(ElseStatContext.class,0);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlangListener ) ((BlangListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlangListener ) ((BlangListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlangVisitor ) return ((BlangVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_ifStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(212); ifStat();
			setState(216);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(213); elseIfStat();
					}
					} 
				}
				setState(218);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			setState(220);
			_la = _input.LA(1);
			if (_la==Else) {
				{
				setState(219); elseStat();
				}
			}

			setState(222); match(End);
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

	public static class IfStatContext extends ParserRuleContext {
		public TerminalNode Do() { return getToken(BlangParser.Do, 0); }
		public TerminalNode If() { return getToken(BlangParser.If, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public IfStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlangListener ) ((BlangListener)listener).enterIfStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlangListener ) ((BlangListener)listener).exitIfStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlangVisitor ) return ((BlangVisitor<? extends T>)visitor).visitIfStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatContext ifStat() throws RecognitionException {
		IfStatContext _localctx = new IfStatContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_ifStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224); match(If);
			setState(225); expression(0);
			setState(226); match(Do);
			setState(227); block();
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

	public static class ElseIfStatContext extends ParserRuleContext {
		public TerminalNode Do() { return getToken(BlangParser.Do, 0); }
		public TerminalNode Else() { return getToken(BlangParser.Else, 0); }
		public TerminalNode If() { return getToken(BlangParser.If, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ElseIfStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseIfStat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlangListener ) ((BlangListener)listener).enterElseIfStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlangListener ) ((BlangListener)listener).exitElseIfStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlangVisitor ) return ((BlangVisitor<? extends T>)visitor).visitElseIfStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseIfStatContext elseIfStat() throws RecognitionException {
		ElseIfStatContext _localctx = new ElseIfStatContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_elseIfStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229); match(Else);
			setState(230); match(If);
			setState(231); expression(0);
			setState(232); match(Do);
			setState(233); block();
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

	public static class ElseStatContext extends ParserRuleContext {
		public TerminalNode Do() { return getToken(BlangParser.Do, 0); }
		public TerminalNode Else() { return getToken(BlangParser.Else, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ElseStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseStat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlangListener ) ((BlangListener)listener).enterElseStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlangListener ) ((BlangListener)listener).exitElseStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlangVisitor ) return ((BlangVisitor<? extends T>)visitor).visitElseStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseStatContext elseStat() throws RecognitionException {
		ElseStatContext _localctx = new ElseStatContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_elseStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235); match(Else);
			setState(236); match(Do);
			setState(237); block();
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

	public static class FunctionDeclContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(BlangParser.Identifier, 0); }
		public TerminalNode Def() { return getToken(BlangParser.Def, 0); }
		public TerminalNode End() { return getToken(BlangParser.End, 0); }
		public IdListContext idList() {
			return getRuleContext(IdListContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FunctionDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlangListener ) ((BlangListener)listener).enterFunctionDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlangListener ) ((BlangListener)listener).exitFunctionDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlangVisitor ) return ((BlangVisitor<? extends T>)visitor).visitFunctionDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDeclContext functionDecl() throws RecognitionException {
		FunctionDeclContext _localctx = new FunctionDeclContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_functionDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239); match(Def);
			setState(240); match(Identifier);
			setState(241); match(OParen);
			setState(243);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(242); idList();
				}
			}

			setState(245); match(CParen);
			setState(246); block();
			setState(247); match(End);
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

	public static class ForStatementContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(BlangParser.Identifier, 0); }
		public TerminalNode To() { return getToken(BlangParser.To, 0); }
		public TerminalNode End() { return getToken(BlangParser.End, 0); }
		public TerminalNode Do() { return getToken(BlangParser.Do, 0); }
		public TerminalNode For() { return getToken(BlangParser.For, 0); }
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlangListener ) ((BlangListener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlangListener ) ((BlangListener)listener).exitForStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlangVisitor ) return ((BlangVisitor<? extends T>)visitor).visitForStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_forStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249); match(For);
			setState(250); match(Identifier);
			setState(251); match(Assign);
			setState(252); expression(0);
			setState(253); match(To);
			setState(254); expression(0);
			setState(255); match(Do);
			setState(256); block();
			setState(257); match(End);
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

	public static class ForEachStatementContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(BlangParser.Identifier, 0); }
		public TerminalNode End() { return getToken(BlangParser.End, 0); }
		public TerminalNode Do() { return getToken(BlangParser.Do, 0); }
		public TerminalNode In() { return getToken(BlangParser.In, 0); }
		public TerminalNode For() { return getToken(BlangParser.For, 0); }
		public TerminalNode Each() { return getToken(BlangParser.Each, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ForEachStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forEachStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlangListener ) ((BlangListener)listener).enterForEachStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlangListener ) ((BlangListener)listener).exitForEachStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlangVisitor ) return ((BlangVisitor<? extends T>)visitor).visitForEachStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForEachStatementContext forEachStatement() throws RecognitionException {
		ForEachStatementContext _localctx = new ForEachStatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_forEachStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259); match(For);
			setState(260); match(Each);
			setState(261); match(Identifier);
			setState(262); match(In);
			setState(263); expression(0);
			setState(264); match(Do);
			setState(265); block();
			setState(266); match(End);
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

	public static class WhileStatementContext extends ParserRuleContext {
		public TerminalNode While() { return getToken(BlangParser.While, 0); }
		public TerminalNode End() { return getToken(BlangParser.End, 0); }
		public TerminalNode Do() { return getToken(BlangParser.Do, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlangListener ) ((BlangListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlangListener ) ((BlangListener)listener).exitWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlangVisitor ) return ((BlangVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268); match(While);
			setState(269); expression(0);
			setState(270); match(Do);
			setState(271); block();
			setState(272); match(End);
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

	public static class VerbStatementContext extends ParserRuleContext {
		public FetchStatementContext fetchStatement() {
			return getRuleContext(FetchStatementContext.class,0);
		}
		public SelectStatementContext selectStatement() {
			return getRuleContext(SelectStatementContext.class,0);
		}
		public CalculateStatementContext calculateStatement() {
			return getRuleContext(CalculateStatementContext.class,0);
		}
		public VerbStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_verbStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlangListener ) ((BlangListener)listener).enterVerbStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlangListener ) ((BlangListener)listener).exitVerbStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlangVisitor ) return ((BlangVisitor<? extends T>)visitor).visitVerbStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VerbStatementContext verbStatement() throws RecognitionException {
		VerbStatementContext _localctx = new VerbStatementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_verbStatement);
		try {
			setState(281);
			switch (_input.LA(1)) {
			case Get:
				enterOuterAlt(_localctx, 1);
				{
				setState(274); fetchStatement();
				setState(275); match(SColon);
				}
				break;
			case Calculate:
				enterOuterAlt(_localctx, 2);
				{
				setState(277); calculateStatement();
				setState(278); match(SColon);
				}
				break;
			case Select:
				enterOuterAlt(_localctx, 3);
				{
				setState(280); selectStatement();
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

	public static class SelectStatementContext extends ParserRuleContext {
		public TerminalNode Conjunctions(int i) {
			return getToken(BlangParser.Conjunctions, i);
		}
		public DsContext ds() {
			return getRuleContext(DsContext.class,0);
		}
		public List<TerminalNode> Conjunctions() { return getTokens(BlangParser.Conjunctions); }
		public OrderbyContext orderby() {
			return getRuleContext(OrderbyContext.class,0);
		}
		public List<FiltersContext> filters() {
			return getRuleContexts(FiltersContext.class);
		}
		public TerminalNode Select() { return getToken(BlangParser.Select, 0); }
		public PrepositionsContext prepositions() {
			return getRuleContext(PrepositionsContext.class,0);
		}
		public FiltersContext filters(int i) {
			return getRuleContext(FiltersContext.class,i);
		}
		public NounsContext nouns() {
			return getRuleContext(NounsContext.class,0);
		}
		public SelectStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlangListener ) ((BlangListener)listener).enterSelectStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlangListener ) ((BlangListener)listener).exitSelectStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlangVisitor ) return ((BlangVisitor<? extends T>)visitor).visitSelectStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectStatementContext selectStatement() throws RecognitionException {
		SelectStatementContext _localctx = new SelectStatementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_selectStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(283); match(Select);
			setState(285);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(284); nouns();
				}
				break;
			}
			setState(288);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(287); ds();
				}
				break;
			}
			setState(291);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Of) | (1L << Where) | (1L << Between))) != 0)) {
				{
				setState(290); prepositions();
				}
			}

			setState(294);
			_la = _input.LA(1);
			if (_la==Identifier || _la==String) {
				{
				setState(293); filters();
				}
			}

			setState(300);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Conjunctions) {
				{
				{
				setState(296); match(Conjunctions);
				setState(297); filters();
				}
				}
				setState(302);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(304);
			_la = _input.LA(1);
			if (_la==T__5 || _la==T__1) {
				{
				setState(303); orderby();
				}
			}

			setState(306); match(SColon);
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

	public static class DsContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(BlangParser.Identifier, 0); }
		public TerminalNode Of() { return getToken(BlangParser.Of, 0); }
		public TerminalNode From() { return getToken(BlangParser.From, 0); }
		public DsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ds; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlangListener ) ((BlangListener)listener).enterDs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlangListener ) ((BlangListener)listener).exitDs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlangVisitor ) return ((BlangVisitor<? extends T>)visitor).visitDs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DsContext ds() throws RecognitionException {
		DsContext _localctx = new DsContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_ds);
		int _la;
		try {
			setState(316);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(309);
				_la = _input.LA(1);
				if (_la==From) {
					{
					setState(308); match(From);
					}
				}

				setState(311); match(Identifier);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(313);
				_la = _input.LA(1);
				if (_la==Of) {
					{
					setState(312); match(Of);
					}
				}

				setState(315); match(Identifier);
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

	public static class NounsContext extends ParserRuleContext {
		public NounorfunctionContext nounorfunction(int i) {
			return getRuleContext(NounorfunctionContext.class,i);
		}
		public List<NounorfunctionContext> nounorfunction() {
			return getRuleContexts(NounorfunctionContext.class);
		}
		public NounsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nouns; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlangListener ) ((BlangListener)listener).enterNouns(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlangListener ) ((BlangListener)listener).exitNouns(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlangVisitor ) return ((BlangVisitor<? extends T>)visitor).visitNouns(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NounsContext nouns() throws RecognitionException {
		NounsContext _localctx = new NounsContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_nouns);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(318); nounorfunction();
			setState(323);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(319); match(Comma);
				setState(320); nounorfunction();
				}
				}
				setState(325);
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

	public static class NounorfunctionContext extends ParserRuleContext {
		public NounorfunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nounorfunction; }
	 
		public NounorfunctionContext() { }
		public void copyFrom(NounorfunctionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class WindowFuncNounFilterContext extends NounorfunctionContext {
		public List<TerminalNode> Identifier() { return getTokens(BlangParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(BlangParser.Identifier, i);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public WindowFuncNounFilterContext(NounorfunctionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlangListener ) ((BlangListener)listener).enterWindowFuncNounFilter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlangListener ) ((BlangListener)listener).exitWindowFuncNounFilter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlangVisitor ) return ((BlangVisitor<? extends T>)visitor).visitWindowFuncNounFilter(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WindowFuncStringFilterContext extends NounorfunctionContext {
		public TerminalNode Identifier() { return getToken(BlangParser.Identifier, 0); }
		public TerminalNode String() { return getToken(BlangParser.String, 0); }
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public WindowFuncStringFilterContext(NounorfunctionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlangListener ) ((BlangListener)listener).enterWindowFuncStringFilter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlangListener ) ((BlangListener)listener).exitWindowFuncStringFilter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlangVisitor ) return ((BlangVisitor<? extends T>)visitor).visitWindowFuncStringFilter(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NounfilterContext extends NounorfunctionContext {
		public TerminalNode Identifier() { return getToken(BlangParser.Identifier, 0); }
		public NounfilterContext(NounorfunctionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlangListener ) ((BlangListener)listener).enterNounfilter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlangListener ) ((BlangListener)listener).exitNounfilter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlangVisitor ) return ((BlangVisitor<? extends T>)visitor).visitNounfilter(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringfilterContext extends NounorfunctionContext {
		public TerminalNode String() { return getToken(BlangParser.String, 0); }
		public StringfilterContext(NounorfunctionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlangListener ) ((BlangListener)listener).enterStringfilter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlangListener ) ((BlangListener)listener).exitStringfilter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlangVisitor ) return ((BlangVisitor<? extends T>)visitor).visitStringfilter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NounorfunctionContext nounorfunction() throws RecognitionException {
		NounorfunctionContext _localctx = new NounorfunctionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_nounorfunction);
		int _la;
		try {
			setState(350);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				_localctx = new NounfilterContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(326); match(Identifier);
				}
				break;

			case 2:
				_localctx = new StringfilterContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(327); match(String);
				}
				break;

			case 3:
				_localctx = new WindowFuncNounFilterContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(328); match(Identifier);
				setState(329); match(OParen);
				setState(330); match(Identifier);
				setState(335);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(331); match(Comma);
					setState(332); expression(0);
					}
					}
					setState(337);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(338); match(CParen);
				}
				break;

			case 4:
				_localctx = new WindowFuncStringFilterContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(339); match(Identifier);
				setState(340); match(OParen);
				setState(341); match(String);
				setState(346);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(342); match(Comma);
					setState(343); expression(0);
					}
					}
					setState(348);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(349); match(CParen);
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

	public static class FiltersContext extends ParserRuleContext {
		public CriteriaexprContext criteriaexpr(int i) {
			return getRuleContext(CriteriaexprContext.class,i);
		}
		public List<CriteriaexprContext> criteriaexpr() {
			return getRuleContexts(CriteriaexprContext.class);
		}
		public NounorfunctionContext nounorfunction() {
			return getRuleContext(NounorfunctionContext.class,0);
		}
		public FiltersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlangListener ) ((BlangListener)listener).enterFilters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlangListener ) ((BlangListener)listener).exitFilters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlangVisitor ) return ((BlangVisitor<? extends T>)visitor).visitFilters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FiltersContext filters() throws RecognitionException {
		FiltersContext _localctx = new FiltersContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_filters);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(352); nounorfunction();
			setState(356);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(353); criteriaexpr();
					}
					} 
				}
				setState(358);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
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

	public static class OrderbyContext extends ParserRuleContext {
		public OrderbyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderby; }
	 
		public OrderbyContext() { }
		public void copyFrom(OrderbyContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DescOrderContext extends OrderbyContext {
		public List<TerminalNode> Identifier() { return getTokens(BlangParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(BlangParser.Identifier, i);
		}
		public DescOrderContext(OrderbyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlangListener ) ((BlangListener)listener).enterDescOrder(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlangListener ) ((BlangListener)listener).exitDescOrder(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlangVisitor ) return ((BlangVisitor<? extends T>)visitor).visitDescOrder(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AscOrderContext extends OrderbyContext {
		public List<TerminalNode> Identifier() { return getTokens(BlangParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(BlangParser.Identifier, i);
		}
		public AscOrderContext(OrderbyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlangListener ) ((BlangListener)listener).enterAscOrder(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlangListener ) ((BlangListener)listener).exitAscOrder(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlangVisitor ) return ((BlangVisitor<? extends T>)visitor).visitAscOrder(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringAscOrderContext extends OrderbyContext {
		public List<TerminalNode> String() { return getTokens(BlangParser.String); }
		public TerminalNode String(int i) {
			return getToken(BlangParser.String, i);
		}
		public StringAscOrderContext(OrderbyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlangListener ) ((BlangListener)listener).enterStringAscOrder(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlangListener ) ((BlangListener)listener).exitStringAscOrder(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlangVisitor ) return ((BlangVisitor<? extends T>)visitor).visitStringAscOrder(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringDescOrderContext extends OrderbyContext {
		public List<TerminalNode> String() { return getTokens(BlangParser.String); }
		public TerminalNode String(int i) {
			return getToken(BlangParser.String, i);
		}
		public StringDescOrderContext(OrderbyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlangListener ) ((BlangListener)listener).enterStringDescOrder(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlangListener ) ((BlangListener)listener).exitStringDescOrder(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlangVisitor ) return ((BlangVisitor<? extends T>)visitor).visitStringDescOrder(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderbyContext orderby() throws RecognitionException {
		OrderbyContext _localctx = new OrderbyContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_orderby);
		int _la;
		try {
			setState(399);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				_localctx = new AscOrderContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(359); match(T__1);
				setState(360); match(Identifier);
				setState(365);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(361); match(Comma);
					setState(362); match(Identifier);
					}
					}
					setState(367);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(368); match(CParen);
				}
				break;

			case 2:
				_localctx = new DescOrderContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(369); match(T__5);
				setState(370); match(Identifier);
				setState(375);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(371); match(Comma);
					setState(372); match(Identifier);
					}
					}
					setState(377);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(378); match(CParen);
				}
				break;

			case 3:
				_localctx = new StringAscOrderContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(379); match(T__1);
				setState(380); match(String);
				setState(385);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(381); match(Comma);
					setState(382); match(String);
					}
					}
					setState(387);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(388); match(CParen);
				}
				break;

			case 4:
				_localctx = new StringDescOrderContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(389); match(T__5);
				setState(390); match(String);
				setState(395);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(391); match(Comma);
					setState(392); match(String);
					}
					}
					setState(397);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(398); match(CParen);
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

	public static class CriteriaexprContext extends ParserRuleContext {
		public Token op;
		public TerminalNode NEquals() { return getToken(BlangParser.NEquals, 0); }
		public TerminalNode Conjunctions() { return getToken(BlangParser.Conjunctions, 0); }
		public TerminalNode GTEquals() { return getToken(BlangParser.GTEquals, 0); }
		public TerminalNode LT() { return getToken(BlangParser.LT, 0); }
		public TerminalNode GT() { return getToken(BlangParser.GT, 0); }
		public TerminalNode In() { return getToken(BlangParser.In, 0); }
		public TerminalNode LTEquals() { return getToken(BlangParser.LTEquals, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Equals() { return getToken(BlangParser.Equals, 0); }
		public TerminalNode Notin() { return getToken(BlangParser.Notin, 0); }
		public CriteriaexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_criteriaexpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlangListener ) ((BlangListener)listener).enterCriteriaexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlangListener ) ((BlangListener)listener).exitCriteriaexpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlangVisitor ) return ((BlangVisitor<? extends T>)visitor).visitCriteriaexpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CriteriaexprContext criteriaexpr() throws RecognitionException {
		CriteriaexprContext _localctx = new CriteriaexprContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_criteriaexpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(402);
			_la = _input.LA(1);
			if (_la==Conjunctions) {
				{
				setState(401); match(Conjunctions);
				}
			}

			setState(404);
			((CriteriaexprContext)_localctx).op = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << In) | (1L << Notin) | (1L << Equals) | (1L << NEquals) | (1L << GTEquals) | (1L << LTEquals) | (1L << GT) | (1L << LT))) != 0)) ) {
				((CriteriaexprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
			}
			consume();
			setState(405); expression(0);
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

	public static class RelationStatementContext extends ParserRuleContext {
		public RelationStatContext relationStat() {
			return getRuleContext(RelationStatContext.class,0);
		}
		public TerminalNode Relations() { return getToken(BlangParser.Relations, 0); }
		public RelationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlangListener ) ((BlangListener)listener).enterRelationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlangListener ) ((BlangListener)listener).exitRelationStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlangVisitor ) return ((BlangVisitor<? extends T>)visitor).visitRelationStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationStatementContext relationStatement() throws RecognitionException {
		RelationStatementContext _localctx = new RelationStatementContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_relationStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(407); match(Relations);
			setState(408); match(OBracket);
			setState(410);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(409); relationStat();
				}
			}

			setState(412); match(CBracket);
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

	public static class RelationStatContext extends ParserRuleContext {
		public List<RelationClauseContext> relationClause() {
			return getRuleContexts(RelationClauseContext.class);
		}
		public RelationClauseContext relationClause(int i) {
			return getRuleContext(RelationClauseContext.class,i);
		}
		public RelationStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationStat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlangListener ) ((BlangListener)listener).enterRelationStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlangListener ) ((BlangListener)listener).exitRelationStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlangVisitor ) return ((BlangVisitor<? extends T>)visitor).visitRelationStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationStatContext relationStat() throws RecognitionException {
		RelationStatContext _localctx = new RelationStatContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_relationStat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(414); relationClause();
			setState(419);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(415); match(Comma);
				setState(416); relationClause();
				}
				}
				setState(421);
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

	public static class RelationClauseContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(BlangParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(BlangParser.Identifier, i);
		}
		public RelationClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlangListener ) ((BlangListener)listener).enterRelationClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlangListener ) ((BlangListener)listener).exitRelationClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlangVisitor ) return ((BlangVisitor<? extends T>)visitor).visitRelationClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationClauseContext relationClause() throws RecognitionException {
		RelationClauseContext _localctx = new RelationClauseContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_relationClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(422); match(Identifier);
			setState(423);
			matchWildcard();
			setState(424); match(Identifier);
			setState(429);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(425); match(T__2);
				setState(426); match(Identifier);
				setState(427);
				matchWildcard();
				setState(428); match(Identifier);
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

	public static class SetNounStatementContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(BlangParser.Identifier, 0); }
		public TerminalNode Set() { return getToken(BlangParser.Set, 0); }
		public TerminalNode Noun() { return getToken(BlangParser.Noun, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SetNounStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setNounStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlangListener ) ((BlangListener)listener).enterSetNounStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlangListener ) ((BlangListener)listener).exitSetNounStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlangVisitor ) return ((BlangVisitor<? extends T>)visitor).visitSetNounStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetNounStatementContext setNounStatement() throws RecognitionException {
		SetNounStatementContext _localctx = new SetNounStatementContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_setNounStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(431); match(Set);
			setState(432); match(Noun);
			setState(433); match(Identifier);
			setState(434); match(Assign);
			setState(435); expression(0);
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

	public static class FetchStatementContext extends ParserRuleContext {
		public DsBlockContext dsBlock() {
			return getRuleContext(DsBlockContext.class,0);
		}
		public FilterCriteriaContext filterCriteria() {
			return getRuleContext(FilterCriteriaContext.class,0);
		}
		public TerminalNode Get() { return getToken(BlangParser.Get, 0); }
		public NounListContext nounList() {
			return getRuleContext(NounListContext.class,0);
		}
		public PrepositionsContext prepositions() {
			return getRuleContext(PrepositionsContext.class,0);
		}
		public FetchStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fetchStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlangListener ) ((BlangListener)listener).enterFetchStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlangListener ) ((BlangListener)listener).exitFetchStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlangVisitor ) return ((BlangVisitor<? extends T>)visitor).visitFetchStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FetchStatementContext fetchStatement() throws RecognitionException {
		FetchStatementContext _localctx = new FetchStatementContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_fetchStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(437); match(Get);
			setState(438); nounList();
			setState(440);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				{
				setState(439); dsBlock();
				}
				break;
			}
			setState(443);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Of) | (1L << Where) | (1L << Between))) != 0)) {
				{
				setState(442); prepositions();
				}
			}

			setState(446);
			_la = _input.LA(1);
			if (_la==String) {
				{
				setState(445); filterCriteria(0);
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

	public static class CalculateStatementContext extends ParserRuleContext {
		public TerminalNode Calculate() { return getToken(BlangParser.Calculate, 0); }
		public TerminalNode Identifier() { return getToken(BlangParser.Identifier, 0); }
		public CalculateStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_calculateStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlangListener ) ((BlangListener)listener).enterCalculateStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlangListener ) ((BlangListener)listener).exitCalculateStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlangVisitor ) return ((BlangVisitor<? extends T>)visitor).visitCalculateStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CalculateStatementContext calculateStatement() throws RecognitionException {
		CalculateStatementContext _localctx = new CalculateStatementContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_calculateStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(448); match(Calculate);
			setState(449); match(Identifier);
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

	public static class CompositeStatementContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(BlangParser.Identifier, 0); }
		public TerminalNode As() { return getToken(BlangParser.As, 0); }
		public TerminalNode Composite() { return getToken(BlangParser.Composite, 0); }
		public TerminalNode Create() { return getToken(BlangParser.Create, 0); }
		public TerminalNode StringLines() { return getToken(BlangParser.StringLines, 0); }
		public CompositeStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compositeStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlangListener ) ((BlangListener)listener).enterCompositeStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlangListener ) ((BlangListener)listener).exitCompositeStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlangVisitor ) return ((BlangVisitor<? extends T>)visitor).visitCompositeStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompositeStatementContext compositeStatement() throws RecognitionException {
		CompositeStatementContext _localctx = new CompositeStatementContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_compositeStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(451); match(Create);
			setState(452); match(Composite);
			setState(453); match(OParen);
			setState(454); match(StringLines);
			setState(455); match(CParen);
			setState(456); match(As);
			setState(457); match(Identifier);
			setState(458); match(SColon);
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

	public static class DsBlockContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(BlangParser.Identifier, 0); }
		public TerminalNode Of() { return getToken(BlangParser.Of, 0); }
		public TerminalNode From() { return getToken(BlangParser.From, 0); }
		public DsBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dsBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlangListener ) ((BlangListener)listener).enterDsBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlangListener ) ((BlangListener)listener).exitDsBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlangVisitor ) return ((BlangVisitor<? extends T>)visitor).visitDsBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DsBlockContext dsBlock() throws RecognitionException {
		DsBlockContext _localctx = new DsBlockContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_dsBlock);
		int _la;
		try {
			setState(468);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(461);
				_la = _input.LA(1);
				if (_la==From) {
					{
					setState(460); match(From);
					}
				}

				setState(463); match(Identifier);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(465);
				_la = _input.LA(1);
				if (_la==Of) {
					{
					setState(464); match(Of);
					}
				}

				setState(467); match(Identifier);
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

	public static class FilterCriteriaContext extends ParserRuleContext {
		public List<FilterCriteriaContext> filterCriteria() {
			return getRuleContexts(FilterCriteriaContext.class);
		}
		public TerminalNode Conjunctions() { return getToken(BlangParser.Conjunctions, 0); }
		public NounListContext nounList() {
			return getRuleContext(NounListContext.class,0);
		}
		public CriteriaContext criteria(int i) {
			return getRuleContext(CriteriaContext.class,i);
		}
		public List<CriteriaContext> criteria() {
			return getRuleContexts(CriteriaContext.class);
		}
		public FilterCriteriaContext filterCriteria(int i) {
			return getRuleContext(FilterCriteriaContext.class,i);
		}
		public FilterCriteriaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filterCriteria; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlangListener ) ((BlangListener)listener).enterFilterCriteria(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlangListener ) ((BlangListener)listener).exitFilterCriteria(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlangVisitor ) return ((BlangVisitor<? extends T>)visitor).visitFilterCriteria(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FilterCriteriaContext filterCriteria() throws RecognitionException {
		return filterCriteria(0);
	}

	private FilterCriteriaContext filterCriteria(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		FilterCriteriaContext _localctx = new FilterCriteriaContext(_ctx, _parentState);
		FilterCriteriaContext _prevctx = _localctx;
		int _startState = 58;
		enterRecursionRule(_localctx, 58, RULE_filterCriteria, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(471); nounList();
			setState(475);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(472); criteria();
					}
					} 
				}
				setState(477);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
			}
			}
			_ctx.stop = _input.LT(-1);
			setState(483);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new FilterCriteriaContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_filterCriteria);
					setState(478);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(479); match(Conjunctions);
					setState(480); filterCriteria(2);
					}
					} 
				}
				setState(485);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
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

	public static class CriteriaContext extends ParserRuleContext {
		public Token op;
		public TerminalNode NEquals() { return getToken(BlangParser.NEquals, 0); }
		public TerminalNode Conjunctions() { return getToken(BlangParser.Conjunctions, 0); }
		public TerminalNode GTEquals() { return getToken(BlangParser.GTEquals, 0); }
		public TerminalNode LT() { return getToken(BlangParser.LT, 0); }
		public TerminalNode GT() { return getToken(BlangParser.GT, 0); }
		public TerminalNode In() { return getToken(BlangParser.In, 0); }
		public TerminalNode LTEquals() { return getToken(BlangParser.LTEquals, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Equals() { return getToken(BlangParser.Equals, 0); }
		public TerminalNode Notin() { return getToken(BlangParser.Notin, 0); }
		public CriteriaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_criteria; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlangListener ) ((BlangListener)listener).enterCriteria(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlangListener ) ((BlangListener)listener).exitCriteria(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlangVisitor ) return ((BlangVisitor<? extends T>)visitor).visitCriteria(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CriteriaContext criteria() throws RecognitionException {
		CriteriaContext _localctx = new CriteriaContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_criteria);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(487);
			_la = _input.LA(1);
			if (_la==Conjunctions) {
				{
				setState(486); match(Conjunctions);
				}
			}

			setState(489);
			((CriteriaContext)_localctx).op = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << In) | (1L << Notin) | (1L << Equals) | (1L << NEquals) | (1L << GTEquals) | (1L << LTEquals) | (1L << GT) | (1L << LT))) != 0)) ) {
				((CriteriaContext)_localctx).op = (Token)_errHandler.recoverInline(this);
			}
			consume();
			setState(490); expression(0);
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

	public static class Time_periodContext extends ParserRuleContext {
		public Time_periodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_time_period; }
	 
		public Time_periodContext() { }
		public void copyFrom(Time_periodContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BetweenPeriodFilterContext extends Time_periodContext {
		public TerminalNode To() { return getToken(BlangParser.To, 0); }
		public TerminalNode Between() { return getToken(BlangParser.Between, 0); }
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public BetweenPeriodFilterContext(Time_periodContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlangListener ) ((BlangListener)listener).enterBetweenPeriodFilter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlangListener ) ((BlangListener)listener).exitBetweenPeriodFilter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlangVisitor ) return ((BlangVisitor<? extends T>)visitor).visitBetweenPeriodFilter(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SinceFilterContext extends Time_periodContext {
		public TerminalNode Since() { return getToken(BlangParser.Since, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SinceFilterContext(Time_periodContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlangListener ) ((BlangListener)listener).enterSinceFilter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlangListener ) ((BlangListener)listener).exitSinceFilter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlangVisitor ) return ((BlangVisitor<? extends T>)visitor).visitSinceFilter(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LastTimePeriodFilterContext extends Time_periodContext {
		public Token op;
		public TerminalNode First() { return getToken(BlangParser.First, 0); }
		public TerminalNode Years() { return getToken(BlangParser.Years, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Last() { return getToken(BlangParser.Last, 0); }
		public LastTimePeriodFilterContext(Time_periodContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlangListener ) ((BlangListener)listener).enterLastTimePeriodFilter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlangListener ) ((BlangListener)listener).exitLastTimePeriodFilter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlangVisitor ) return ((BlangVisitor<? extends T>)visitor).visitLastTimePeriodFilter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Time_periodContext time_period() throws RecognitionException {
		Time_periodContext _localctx = new Time_periodContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_time_period);
		int _la;
		try {
			setState(503);
			switch (_input.LA(1)) {
			case Last:
			case First:
				_localctx = new LastTimePeriodFilterContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(492);
				((LastTimePeriodFilterContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==Last || _la==First) ) {
					((LastTimePeriodFilterContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(493); expression(0);
				setState(494); match(Years);
				}
				break;
			case Between:
				_localctx = new BetweenPeriodFilterContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(496); match(Between);
				setState(497); expression(0);
				setState(498); match(To);
				setState(499); expression(0);
				}
				break;
			case Since:
				_localctx = new SinceFilterContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(501); match(Since);
				setState(502); expression(0);
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

	public static class PrepositionsContext extends ParserRuleContext {
		public TerminalNode Of() { return getToken(BlangParser.Of, 0); }
		public TerminalNode Between() { return getToken(BlangParser.Between, 0); }
		public TerminalNode Where() { return getToken(BlangParser.Where, 0); }
		public PrepositionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prepositions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlangListener ) ((BlangListener)listener).enterPrepositions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlangListener ) ((BlangListener)listener).exitPrepositions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlangVisitor ) return ((BlangVisitor<? extends T>)visitor).visitPrepositions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrepositionsContext prepositions() throws RecognitionException {
		PrepositionsContext _localctx = new PrepositionsContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_prepositions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(505);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Of) | (1L << Where) | (1L << Between))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class NounListContext extends ParserRuleContext {
		public List<TerminalNode> String() { return getTokens(BlangParser.String); }
		public TerminalNode String(int i) {
			return getToken(BlangParser.String, i);
		}
		public NounListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nounList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlangListener ) ((BlangListener)listener).enterNounList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlangListener ) ((BlangListener)listener).exitNounList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlangVisitor ) return ((BlangVisitor<? extends T>)visitor).visitNounList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NounListContext nounList() throws RecognitionException {
		NounListContext _localctx = new NounListContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_nounList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(507); match(String);
			setState(512);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(508); match(Comma);
					setState(509); match(String);
					}
					} 
				}
				setState(514);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
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

	public static class IdListContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(BlangParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(BlangParser.Identifier, i);
		}
		public IdListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlangListener ) ((BlangListener)listener).enterIdList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlangListener ) ((BlangListener)listener).exitIdList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlangVisitor ) return ((BlangVisitor<? extends T>)visitor).visitIdList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdListContext idList() throws RecognitionException {
		IdListContext _localctx = new IdListContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_idList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(515); match(Identifier);
			setState(520);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(516); match(Comma);
				setState(517); match(Identifier);
				}
				}
				setState(522);
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

	public static class ExprListContext extends ParserRuleContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExprListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlangListener ) ((BlangListener)listener).enterExprList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlangListener ) ((BlangListener)listener).exitExprList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlangVisitor ) return ((BlangVisitor<? extends T>)visitor).visitExprList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprListContext exprList() throws RecognitionException {
		ExprListContext _localctx = new ExprListContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_exprList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(523); expression(0);
			setState(528);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(524); match(Comma);
				setState(525); expression(0);
				}
				}
				setState(530);
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
	public static class NotLikeExpressionContext extends ExpressionContext {
		public TerminalNode NotLike() { return getToken(BlangParser.NotLike, 0); }
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public NotLikeExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlangListener ) ((BlangListener)listener).enterNotLikeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlangListener ) ((BlangListener)listener).exitNotLikeExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlangVisitor ) return ((BlangVisitor<? extends T>)visitor).visitNotLikeExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumberExpressionContext extends ExpressionContext {
		public TerminalNode Number() { return getToken(BlangParser.Number, 0); }
		public NumberExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlangListener ) ((BlangListener)listener).enterNumberExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlangListener ) ((BlangListener)listener).exitNumberExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlangVisitor ) return ((BlangVisitor<? extends T>)visitor).visitNumberExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdentifierExpressionContext extends ExpressionContext {
		public IndexesContext indexes() {
			return getRuleContext(IndexesContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(BlangParser.Identifier, 0); }
		public IdentifierExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlangListener ) ((BlangListener)listener).enterIdentifierExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlangListener ) ((BlangListener)listener).exitIdentifierExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlangVisitor ) return ((BlangVisitor<? extends T>)visitor).visitIdentifierExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NotExpressionContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NotExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlangListener ) ((BlangListener)listener).enterNotExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlangListener ) ((BlangListener)listener).exitNotExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlangVisitor ) return ((BlangVisitor<? extends T>)visitor).visitNotExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NextRowValueExpressionContext extends ExpressionContext {
		public TerminalNode String() { return getToken(BlangParser.String, 0); }
		public TerminalNode Next() { return getToken(BlangParser.Next, 0); }
		public NextRowValueExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlangListener ) ((BlangListener)listener).enterNextRowValueExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlangListener ) ((BlangListener)listener).exitNextRowValueExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlangVisitor ) return ((BlangVisitor<? extends T>)visitor).visitNextRowValueExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AndExpressionContext extends ExpressionContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public AndExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlangListener ) ((BlangListener)listener).enterAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlangListener ) ((BlangListener)listener).exitAndExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlangVisitor ) return ((BlangVisitor<? extends T>)visitor).visitAndExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringExpressionContext extends ExpressionContext {
		public IndexesContext indexes() {
			return getRuleContext(IndexesContext.class,0);
		}
		public TerminalNode String() { return getToken(BlangParser.String, 0); }
		public StringExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlangListener ) ((BlangListener)listener).enterStringExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlangListener ) ((BlangListener)listener).exitStringExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlangVisitor ) return ((BlangVisitor<? extends T>)visitor).visitStringExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpressionExpressionContext extends ExpressionContext {
		public IndexesContext indexes() {
			return getRuleContext(IndexesContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlangListener ) ((BlangListener)listener).enterExpressionExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlangListener ) ((BlangListener)listener).exitExpressionExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlangVisitor ) return ((BlangVisitor<? extends T>)visitor).visitExpressionExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CompExpressionContext extends ExpressionContext {
		public Token op;
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public CompExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlangListener ) ((BlangListener)listener).enterCompExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlangListener ) ((BlangListener)listener).exitCompExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlangVisitor ) return ((BlangVisitor<? extends T>)visitor).visitCompExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NullExpressionContext extends ExpressionContext {
		public TerminalNode Null() { return getToken(BlangParser.Null, 0); }
		public NullExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlangListener ) ((BlangListener)listener).enterNullExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlangListener ) ((BlangListener)listener).exitNullExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlangVisitor ) return ((BlangVisitor<? extends T>)visitor).visitNullExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunctionCallExpressionContext extends ExpressionContext {
		public IndexesContext indexes() {
			return getRuleContext(IndexesContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public FunctionCallExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlangListener ) ((BlangListener)listener).enterFunctionCallExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlangListener ) ((BlangListener)listener).exitFunctionCallExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlangVisitor ) return ((BlangVisitor<? extends T>)visitor).visitFunctionCallExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultExpressionContext extends ExpressionContext {
		public Token op;
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public MultExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlangListener ) ((BlangListener)listener).enterMultExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlangListener ) ((BlangListener)listener).exitMultExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlangVisitor ) return ((BlangVisitor<? extends T>)visitor).visitMultExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LikeExpressionContext extends ExpressionContext {
		public TerminalNode Like() { return getToken(BlangParser.Like, 0); }
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public LikeExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlangListener ) ((BlangListener)listener).enterLikeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlangListener ) ((BlangListener)listener).exitLikeExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlangVisitor ) return ((BlangVisitor<? extends T>)visitor).visitLikeExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ListExpressionContext extends ExpressionContext {
		public IndexesContext indexes() {
			return getRuleContext(IndexesContext.class,0);
		}
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public ListExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlangListener ) ((BlangListener)listener).enterListExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlangListener ) ((BlangListener)listener).exitListExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlangVisitor ) return ((BlangVisitor<? extends T>)visitor).visitListExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StartsWithExpressionContext extends ExpressionContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode StartsWith() { return getToken(BlangParser.StartsWith, 0); }
		public StartsWithExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlangListener ) ((BlangListener)listener).enterStartsWithExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlangListener ) ((BlangListener)listener).exitStartsWithExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlangVisitor ) return ((BlangVisitor<? extends T>)visitor).visitStartsWithExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolExpressionContext extends ExpressionContext {
		public TerminalNode Bool() { return getToken(BlangParser.Bool, 0); }
		public BoolExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlangListener ) ((BlangListener)listener).enterBoolExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlangListener ) ((BlangListener)listener).exitBoolExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlangVisitor ) return ((BlangVisitor<? extends T>)visitor).visitBoolExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CopyOfExpressionContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Copyof() { return getToken(BlangParser.Copyof, 0); }
		public CopyOfExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlangListener ) ((BlangListener)listener).enterCopyOfExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlangListener ) ((BlangListener)listener).exitCopyOfExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlangVisitor ) return ((BlangVisitor<? extends T>)visitor).visitCopyOfExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DateRuleExpressionContext extends ExpressionContext {
		public DateExpressionContext dateExpression() {
			return getRuleContext(DateExpressionContext.class,0);
		}
		public DateRuleExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlangListener ) ((BlangListener)listener).enterDateRuleExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlangListener ) ((BlangListener)listener).exitDateRuleExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlangVisitor ) return ((BlangVisitor<? extends T>)visitor).visitDateRuleExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AggregateExpressionContext extends ExpressionContext {
		public AggregateFunctionCallContext aggregateFunctionCall() {
			return getRuleContext(AggregateFunctionCallContext.class,0);
		}
		public AggregateExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlangListener ) ((BlangListener)listener).enterAggregateExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlangListener ) ((BlangListener)listener).exitAggregateExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlangVisitor ) return ((BlangVisitor<? extends T>)visitor).visitAggregateExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OrExpressionContext extends ExpressionContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public OrExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlangListener ) ((BlangListener)listener).enterOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlangListener ) ((BlangListener)listener).exitOrExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlangVisitor ) return ((BlangVisitor<? extends T>)visitor).visitOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnaryMinusExpressionContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public UnaryMinusExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlangListener ) ((BlangListener)listener).enterUnaryMinusExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlangListener ) ((BlangListener)listener).exitUnaryMinusExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlangVisitor ) return ((BlangVisitor<? extends T>)visitor).visitUnaryMinusExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PowerExpressionContext extends ExpressionContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public PowerExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlangListener ) ((BlangListener)listener).enterPowerExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlangListener ) ((BlangListener)listener).exitPowerExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlangVisitor ) return ((BlangVisitor<? extends T>)visitor).visitPowerExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EqExpressionContext extends ExpressionContext {
		public Token op;
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public EqExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlangListener ) ((BlangListener)listener).enterEqExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlangListener ) ((BlangListener)listener).exitEqExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlangVisitor ) return ((BlangVisitor<? extends T>)visitor).visitEqExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InExpressionContext extends ExpressionContext {
		public TerminalNode In() { return getToken(BlangParser.In, 0); }
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public InExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlangListener ) ((BlangListener)listener).enterInExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlangListener ) ((BlangListener)listener).exitInExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlangVisitor ) return ((BlangVisitor<? extends T>)visitor).visitInExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddExpressionContext extends ExpressionContext {
		public Token op;
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public AddExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlangListener ) ((BlangListener)listener).enterAddExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlangListener ) ((BlangListener)listener).exitAddExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlangVisitor ) return ((BlangVisitor<? extends T>)visitor).visitAddExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VerbExpressionContext extends ExpressionContext {
		public VerbStatementContext verbStatement() {
			return getRuleContext(VerbStatementContext.class,0);
		}
		public VerbExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlangListener ) ((BlangListener)listener).enterVerbExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlangListener ) ((BlangListener)listener).exitVerbExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlangVisitor ) return ((BlangVisitor<? extends T>)visitor).visitVerbExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TableRowPropertyExpressionContext extends ExpressionContext {
		public TerminalNode Identifier() { return getToken(BlangParser.Identifier, 0); }
		public TerminalNode String() { return getToken(BlangParser.String, 0); }
		public TableRowPropertyExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlangListener ) ((BlangListener)listener).enterTableRowPropertyExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlangListener ) ((BlangListener)listener).exitTableRowPropertyExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlangVisitor ) return ((BlangVisitor<? extends T>)visitor).visitTableRowPropertyExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TernaryExpressionContext extends ExpressionContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TernaryExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlangListener ) ((BlangListener)listener).enterTernaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlangListener ) ((BlangListener)listener).exitTernaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlangVisitor ) return ((BlangVisitor<? extends T>)visitor).visitTernaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InputExpressionContext extends ExpressionContext {
		public TerminalNode String() { return getToken(BlangParser.String, 0); }
		public TerminalNode Input() { return getToken(BlangParser.Input, 0); }
		public InputExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlangListener ) ((BlangListener)listener).enterInputExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlangListener ) ((BlangListener)listener).exitInputExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlangVisitor ) return ((BlangVisitor<? extends T>)visitor).visitInputExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EndsWithExpressionContext extends ExpressionContext {
		public TerminalNode EndsWith() { return getToken(BlangParser.EndsWith, 0); }
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public EndsWithExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlangListener ) ((BlangListener)listener).enterEndsWithExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlangListener ) ((BlangListener)listener).exitEndsWithExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlangVisitor ) return ((BlangVisitor<? extends T>)visitor).visitEndsWithExpression(this);
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
		int _startState = 72;
		enterRecursionRule(_localctx, 72, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(582);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				{
				_localctx = new UnaryMinusExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(532); match(Subtract);
				setState(533); expression(30);
				}
				break;

			case 2:
				{
				_localctx = new NotExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(534); match(Excl);
				setState(535); expression(29);
				}
				break;

			case 3:
				{
				_localctx = new NumberExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(536); match(Number);
				}
				break;

			case 4:
				{
				_localctx = new BoolExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(537); match(Bool);
				}
				break;

			case 5:
				{
				_localctx = new NullExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(538); match(Null);
				}
				break;

			case 6:
				{
				_localctx = new FunctionCallExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(539); functionCall();
				setState(541);
				switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
				case 1:
					{
					setState(540); indexes();
					}
					break;
				}
				}
				break;

			case 7:
				{
				_localctx = new ListExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(543); list();
				setState(545);
				switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
				case 1:
					{
					setState(544); indexes();
					}
					break;
				}
				}
				break;

			case 8:
				{
				_localctx = new IdentifierExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(547); match(Identifier);
				setState(549);
				switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
				case 1:
					{
					setState(548); indexes();
					}
					break;
				}
				}
				break;

			case 9:
				{
				_localctx = new StringExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(551); match(String);
				setState(553);
				switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
				case 1:
					{
					setState(552); indexes();
					}
					break;
				}
				}
				break;

			case 10:
				{
				_localctx = new ExpressionExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(555); match(OParen);
				setState(556); expression(0);
				setState(557); match(CParen);
				setState(559);
				switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
				case 1:
					{
					setState(558); indexes();
					}
					break;
				}
				}
				break;

			case 11:
				{
				_localctx = new InputExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(561); match(Input);
				setState(562); match(OParen);
				setState(564);
				_la = _input.LA(1);
				if (_la==String) {
					{
					setState(563); match(String);
					}
				}

				setState(566); match(CParen);
				}
				break;

			case 12:
				{
				_localctx = new VerbExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(567); verbStatement();
				}
				break;

			case 13:
				{
				_localctx = new TableRowPropertyExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(568); match(Identifier);
				setState(569); match(T__3);
				setState(570); match(String);
				}
				break;

			case 14:
				{
				_localctx = new DateRuleExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(571); dateExpression();
				}
				break;

			case 15:
				{
				_localctx = new CopyOfExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(572); match(Copyof);
				setState(573); match(OParen);
				setState(574); expression(0);
				setState(575); match(CParen);
				}
				break;

			case 16:
				{
				_localctx = new AggregateExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(577); aggregateFunctionCall();
				}
				break;

			case 17:
				{
				_localctx = new NextRowValueExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(578); match(Next);
				setState(579); match(OParen);
				setState(580); match(T__0);
				setState(581); match(String);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(628);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(626);
					switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
					case 1:
						{
						_localctx = new PowerExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(584);
						if (!(precpred(_ctx, 28))) throw new FailedPredicateException(this, "precpred(_ctx, 28)");
						setState(585); match(Pow);
						setState(586); expression(28);
						}
						break;

					case 2:
						{
						_localctx = new MultExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(587);
						if (!(precpred(_ctx, 27))) throw new FailedPredicateException(this, "precpred(_ctx, 27)");
						setState(588);
						((MultExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Multiply) | (1L << Divide) | (1L << Modulus))) != 0)) ) {
							((MultExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(589); expression(28);
						}
						break;

					case 3:
						{
						_localctx = new AddExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(590);
						if (!(precpred(_ctx, 26))) throw new FailedPredicateException(this, "precpred(_ctx, 26)");
						setState(591);
						((AddExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==Add || _la==Subtract) ) {
							((AddExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(592); expression(27);
						}
						break;

					case 4:
						{
						_localctx = new CompExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(593);
						if (!(precpred(_ctx, 25))) throw new FailedPredicateException(this, "precpred(_ctx, 25)");
						setState(594);
						((CompExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GTEquals) | (1L << LTEquals) | (1L << GT) | (1L << LT))) != 0)) ) {
							((CompExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(595); expression(26);
						}
						break;

					case 5:
						{
						_localctx = new EqExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(596);
						if (!(precpred(_ctx, 24))) throw new FailedPredicateException(this, "precpred(_ctx, 24)");
						setState(597);
						((EqExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==Equals || _la==NEquals) ) {
							((EqExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(598); expression(25);
						}
						break;

					case 6:
						{
						_localctx = new AndExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(599);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(600); match(T__4);
						setState(601); expression(24);
						}
						break;

					case 7:
						{
						_localctx = new OrExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(602);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(603); match(T__6);
						setState(604); expression(23);
						}
						break;

					case 8:
						{
						_localctx = new TernaryExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(605);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(606); match(QMark);
						setState(607); expression(0);
						setState(608); match(Colon);
						setState(609); expression(22);
						}
						break;

					case 9:
						{
						_localctx = new InExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(611);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(612); match(In);
						setState(613); expression(21);
						}
						break;

					case 10:
						{
						_localctx = new StartsWithExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(614);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(615); match(StartsWith);
						setState(616); expression(20);
						}
						break;

					case 11:
						{
						_localctx = new LikeExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(617);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(618); match(Like);
						setState(619); expression(19);
						}
						break;

					case 12:
						{
						_localctx = new NotLikeExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(620);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(621); match(NotLike);
						setState(622); expression(18);
						}
						break;

					case 13:
						{
						_localctx = new EndsWithExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(623);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(624); match(EndsWith);
						setState(625); expression(17);
						}
						break;
					}
					} 
				}
				setState(630);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
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

	public static class ListContext extends ParserRuleContext {
		public ExprListContext exprList() {
			return getRuleContext(ExprListContext.class,0);
		}
		public ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlangListener ) ((BlangListener)listener).enterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlangListener ) ((BlangListener)listener).exitList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlangVisitor ) return ((BlangVisitor<? extends T>)visitor).visitList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(631); match(OBracket);
			setState(633);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CurrentYear) | (1L << CurrentTime) | (1L << CurrentDate) | (1L << Println) | (1L << Print) | (1L << Input) | (1L << Assert) | (1L << Size) | (1L << Null) | (1L << Excl) | (1L << Subtract) | (1L << OBracket) | (1L << OParen) | (1L << Get))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (Calculate - 70)) | (1L << (RoundOf - 70)) | (1L << (ReplaceNull - 70)) | (1L << (ReplaceNullOrEmpty - 70)) | (1L << (Select - 70)) | (1L << (Sum - 70)) | (1L << (Avg - 70)) | (1L << (Copyof - 70)) | (1L << (Abs - 70)) | (1L << (Next - 70)) | (1L << (Bool - 70)) | (1L << (Number - 70)) | (1L << (Identifier - 70)) | (1L << (String - 70)))) != 0)) {
				{
				setState(632); exprList();
				}
			}

			setState(635); match(CBracket);
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

	public static class AggregateFunctionCallContext extends ParserRuleContext {
		public TerminalNode Sum() { return getToken(BlangParser.Sum, 0); }
		public TerminalNode By() { return getToken(BlangParser.By, 0); }
		public DsContext ds() {
			return getRuleContext(DsContext.class,0);
		}
		public OrderbyContext orderby() {
			return getRuleContext(OrderbyContext.class,0);
		}
		public List<TerminalNode> String() { return getTokens(BlangParser.String); }
		public TerminalNode String(int i) {
			return getToken(BlangParser.String, i);
		}
		public AggregateFunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggregateFunctionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlangListener ) ((BlangListener)listener).enterAggregateFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlangListener ) ((BlangListener)listener).exitAggregateFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlangVisitor ) return ((BlangVisitor<? extends T>)visitor).visitAggregateFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AggregateFunctionCallContext aggregateFunctionCall() throws RecognitionException {
		AggregateFunctionCallContext _localctx = new AggregateFunctionCallContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_aggregateFunctionCall);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(637); match(Sum);
			setState(638); match(OParen);
			setState(639); match(String);
			setState(640); match(CParen);
			setState(642);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				{
				setState(641); ds();
				}
				break;
			}
			setState(645);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				{
				setState(644); orderby();
				}
				break;
			}
			setState(649);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				{
				setState(647); match(By);
				setState(648); match(String);
				}
				break;
			}
			setState(655);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(651); match(Comma);
					setState(652); match(String);
					}
					} 
				}
				setState(657);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
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

	public static class IndexesContext extends ParserRuleContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public IndexesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlangListener ) ((BlangListener)listener).enterIndexes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlangListener ) ((BlangListener)listener).exitIndexes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlangVisitor ) return ((BlangVisitor<? extends T>)visitor).visitIndexes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IndexesContext indexes() throws RecognitionException {
		IndexesContext _localctx = new IndexesContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_indexes);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(662); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(658); match(OBracket);
					setState(659); expression(0);
					setState(660); match(CBracket);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(664); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class DateExpressionContext extends ParserRuleContext {
		public TerminalNode CurrentDate() { return getToken(BlangParser.CurrentDate, 0); }
		public TerminalNode CurrentYear() { return getToken(BlangParser.CurrentYear, 0); }
		public TerminalNode CurrentTime() { return getToken(BlangParser.CurrentTime, 0); }
		public DateExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dateExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BlangListener ) ((BlangListener)listener).enterDateExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BlangListener ) ((BlangListener)listener).exitDateExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BlangVisitor ) return ((BlangVisitor<? extends T>)visitor).visitDateExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DateExpressionContext dateExpression() throws RecognitionException {
		DateExpressionContext _localctx = new DateExpressionContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_dateExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(666);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CurrentYear) | (1L << CurrentTime) | (1L << CurrentDate))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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
		case 29: return filterCriteria_sempred((FilterCriteriaContext)_localctx, predIndex);

		case 36: return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean filterCriteria_sempred(FilterCriteriaContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1: return precpred(_ctx, 28);

		case 2: return precpred(_ctx, 27);

		case 3: return precpred(_ctx, 26);

		case 4: return precpred(_ctx, 25);

		case 5: return precpred(_ctx, 24);

		case 6: return precpred(_ctx, 23);

		case 7: return precpred(_ctx, 22);

		case 8: return precpred(_ctx, 21);

		case 9: return precpred(_ctx, 20);

		case 10: return precpred(_ctx, 19);

		case 11: return precpred(_ctx, 18);

		case 12: return precpred(_ctx, 17);

		case 13: return precpred(_ctx, 16);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3^\u029f\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\3\2\3\2"+
		"\3\2\3\3\3\3\7\3Z\n\3\f\3\16\3]\13\3\3\3\3\3\3\3\3\3\5\3c\n\3\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4w"+
		"\n\4\3\5\3\5\5\5{\n\5\3\5\3\5\3\5\3\5\3\5\6\5\u0082\n\5\r\5\16\5\u0083"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u0091\n\5\3\6\3\6\3\6"+
		"\5\6\u0096\n\6\3\6\3\6\3\6\3\6\5\6\u009c\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u00d5\n\6\3"+
		"\7\3\7\7\7\u00d9\n\7\f\7\16\7\u00dc\13\7\3\7\5\7\u00df\n\7\3\7\3\7\3\b"+
		"\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13"+
		"\3\13\5\13\u00f6\n\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u011c\n\17\3\20\3\20"+
		"\5\20\u0120\n\20\3\20\5\20\u0123\n\20\3\20\5\20\u0126\n\20\3\20\5\20\u0129"+
		"\n\20\3\20\3\20\7\20\u012d\n\20\f\20\16\20\u0130\13\20\3\20\5\20\u0133"+
		"\n\20\3\20\3\20\3\21\5\21\u0138\n\21\3\21\3\21\5\21\u013c\n\21\3\21\5"+
		"\21\u013f\n\21\3\22\3\22\3\22\7\22\u0144\n\22\f\22\16\22\u0147\13\22\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u0150\n\23\f\23\16\23\u0153\13"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u015b\n\23\f\23\16\23\u015e\13"+
		"\23\3\23\5\23\u0161\n\23\3\24\3\24\7\24\u0165\n\24\f\24\16\24\u0168\13"+
		"\24\3\25\3\25\3\25\3\25\7\25\u016e\n\25\f\25\16\25\u0171\13\25\3\25\3"+
		"\25\3\25\3\25\3\25\7\25\u0178\n\25\f\25\16\25\u017b\13\25\3\25\3\25\3"+
		"\25\3\25\3\25\7\25\u0182\n\25\f\25\16\25\u0185\13\25\3\25\3\25\3\25\3"+
		"\25\3\25\7\25\u018c\n\25\f\25\16\25\u018f\13\25\3\25\5\25\u0192\n\25\3"+
		"\26\5\26\u0195\n\26\3\26\3\26\3\26\3\27\3\27\3\27\5\27\u019d\n\27\3\27"+
		"\3\27\3\30\3\30\3\30\7\30\u01a4\n\30\f\30\16\30\u01a7\13\30\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\5\31\u01b0\n\31\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\33\3\33\3\33\5\33\u01bb\n\33\3\33\5\33\u01be\n\33\3\33\5\33\u01c1\n"+
		"\33\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\5"+
		"\36\u01d0\n\36\3\36\3\36\5\36\u01d4\n\36\3\36\5\36\u01d7\n\36\3\37\3\37"+
		"\3\37\7\37\u01dc\n\37\f\37\16\37\u01df\13\37\3\37\3\37\3\37\7\37\u01e4"+
		"\n\37\f\37\16\37\u01e7\13\37\3 \5 \u01ea\n \3 \3 \3 \3!\3!\3!\3!\3!\3"+
		"!\3!\3!\3!\3!\3!\5!\u01fa\n!\3\"\3\"\3#\3#\3#\7#\u0201\n#\f#\16#\u0204"+
		"\13#\3$\3$\3$\7$\u0209\n$\f$\16$\u020c\13$\3%\3%\3%\7%\u0211\n%\f%\16"+
		"%\u0214\13%\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\5&\u0220\n&\3&\3&\5&\u0224\n"+
		"&\3&\3&\5&\u0228\n&\3&\3&\5&\u022c\n&\3&\3&\3&\3&\5&\u0232\n&\3&\3&\3"+
		"&\5&\u0237\n&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\5&\u0249"+
		"\n&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&"+
		"\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\7&\u0275"+
		"\n&\f&\16&\u0278\13&\3\'\3\'\5\'\u027c\n\'\3\'\3\'\3(\3(\3(\3(\3(\5(\u0285"+
		"\n(\3(\5(\u0288\n(\3(\3(\5(\u028c\n(\3(\3(\7(\u0290\n(\f(\16(\u0293\13"+
		"(\3)\3)\3)\3)\6)\u0299\n)\r)\16)\u029a\3*\3*\3*\2\4<J+\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPR\2\n\5\2\34"+
		"\35#&)*\3\2@A\3\2=?\3\2-/\3\2+,\4\2%&)*\3\2#$\3\2\13\r\u02e9\2T\3\2\2"+
		"\2\4[\3\2\2\2\6v\3\2\2\2\b\u0090\3\2\2\2\n\u00d4\3\2\2\2\f\u00d6\3\2\2"+
		"\2\16\u00e2\3\2\2\2\20\u00e7\3\2\2\2\22\u00ed\3\2\2\2\24\u00f1\3\2\2\2"+
		"\26\u00fb\3\2\2\2\30\u0105\3\2\2\2\32\u010e\3\2\2\2\34\u011b\3\2\2\2\36"+
		"\u011d\3\2\2\2 \u013e\3\2\2\2\"\u0140\3\2\2\2$\u0160\3\2\2\2&\u0162\3"+
		"\2\2\2(\u0191\3\2\2\2*\u0194\3\2\2\2,\u0199\3\2\2\2.\u01a0\3\2\2\2\60"+
		"\u01a8\3\2\2\2\62\u01b1\3\2\2\2\64\u01b7\3\2\2\2\66\u01c2\3\2\2\28\u01c5"+
		"\3\2\2\2:\u01d6\3\2\2\2<\u01d8\3\2\2\2>\u01e9\3\2\2\2@\u01f9\3\2\2\2B"+
		"\u01fb\3\2\2\2D\u01fd\3\2\2\2F\u0205\3\2\2\2H\u020d\3\2\2\2J\u0248\3\2"+
		"\2\2L\u0279\3\2\2\2N\u027f\3\2\2\2P\u0298\3\2\2\2R\u029c\3\2\2\2TU\5\4"+
		"\3\2UV\7\2\2\3V\3\3\2\2\2WZ\5\6\4\2XZ\5\24\13\2YW\3\2\2\2YX\3\2\2\2Z]"+
		"\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\b\3\2\2\2][\3\2\2\2^_\7\26\2\2_`\5J&\2"+
		"`a\7\66\2\2ac\3\2\2\2b^\3\2\2\2bc\3\2\2\2c\5\3\2\2\2de\5\b\5\2ef\7\66"+
		"\2\2fw\3\2\2\2gh\5\n\6\2hi\7\66\2\2iw\3\2\2\2jw\5\f\7\2kw\5\26\f\2lw\5"+
		"\30\r\2mw\5\32\16\2nw\5\34\17\2op\5,\27\2pq\7\66\2\2qw\3\2\2\2rs\5\62"+
		"\32\2st\7\66\2\2tw\3\2\2\2uw\58\35\2vd\3\2\2\2vg\3\2\2\2vj\3\2\2\2vk\3"+
		"\2\2\2vl\3\2\2\2vm\3\2\2\2vn\3\2\2\2vo\3\2\2\2vr\3\2\2\2vu\3\2\2\2w\7"+
		"\3\2\2\2xz\7Z\2\2y{\5P)\2zy\3\2\2\2z{\3\2\2\2{|\3\2\2\2|}\7\67\2\2}\u0091"+
		"\5J&\2~\u0081\7Z\2\2\177\u0080\7\6\2\2\u0080\u0082\7Z\2\2\u0081\177\3"+
		"\2\2\2\u0082\u0083\3\2\2\2\u0083\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084"+
		"\u0085\3\2\2\2\u0085\u0086\7\67\2\2\u0086\u0091\5J&\2\u0087\u0088\7Z\2"+
		"\2\u0088\u0089\7\6\2\2\u0089\u008a\7[\2\2\u008a\u008b\3\2\2\2\u008b\u008c"+
		"\7\67\2\2\u008c\u0091\5J&\2\u008d\u008e\7[\2\2\u008e\u008f\7\67\2\2\u008f"+
		"\u0091\5J&\2\u0090x\3\2\2\2\u0090~\3\2\2\2\u0090\u0087\3\2\2\2\u0090\u008d"+
		"\3\2\2\2\u0091\t\3\2\2\2\u0092\u0093\7Z\2\2\u0093\u0095\7\64\2\2\u0094"+
		"\u0096\5H%\2\u0095\u0094\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0097\3\2\2"+
		"\2\u0097\u00d5\7\65\2\2\u0098\u0099\7\16\2\2\u0099\u009b\7\64\2\2\u009a"+
		"\u009c\5J&\2\u009b\u009a\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009d\3\2\2"+
		"\2\u009d\u00d5\7\65\2\2\u009e\u009f\7\17\2\2\u009f\u00a0\7\64\2\2\u00a0"+
		"\u00a1\5J&\2\u00a1\u00a2\7\65\2\2\u00a2\u00d5\3\2\2\2\u00a3\u00a4\7\21"+
		"\2\2\u00a4\u00a5\7\64\2\2\u00a5\u00a6\5J&\2\u00a6\u00a7\7\65\2\2\u00a7"+
		"\u00d5\3\2\2\2\u00a8\u00a9\7\22\2\2\u00a9\u00aa\7\64\2\2\u00aa\u00ab\5"+
		"J&\2\u00ab\u00ac\7\65\2\2\u00ac\u00d5\3\2\2\2\u00ad\u00ae\7I\2\2\u00ae"+
		"\u00af\7\64\2\2\u00af\u00b0\5J&\2\u00b0\u00b1\78\2\2\u00b1\u00b2\5J&\2"+
		"\u00b2\u00b3\3\2\2\2\u00b3\u00b4\7\65\2\2\u00b4\u00d5\3\2\2\2\u00b5\u00b6"+
		"\7J\2\2\u00b6\u00b7\7\64\2\2\u00b7\u00b8\5J&\2\u00b8\u00b9\78\2\2\u00b9"+
		"\u00ba\5J&\2\u00ba\u00bb\3\2\2\2\u00bb\u00bc\7\65\2\2\u00bc\u00d5\3\2"+
		"\2\2\u00bd\u00be\7K\2\2\u00be\u00bf\7\64\2\2\u00bf\u00c0\5J&\2\u00c0\u00c1"+
		"\78\2\2\u00c1\u00c2\5J&\2\u00c2\u00c3\3\2\2\2\u00c3\u00c4\7\65\2\2\u00c4"+
		"\u00d5\3\2\2\2\u00c5\u00c6\7P\2\2\u00c6\u00c7\7\64\2\2\u00c7\u00c8\5J"+
		"&\2\u00c8\u00c9\7\65\2\2\u00c9\u00d5\3\2\2\2\u00ca\u00cb\7Q\2\2\u00cb"+
		"\u00cc\7\64\2\2\u00cc\u00cd\5J&\2\u00cd\u00ce\7\65\2\2\u00ce\u00d5\3\2"+
		"\2\2\u00cf\u00d0\7T\2\2\u00d0\u00d1\7\64\2\2\u00d1\u00d2\5J&\2\u00d2\u00d3"+
		"\7\65\2\2\u00d3\u00d5\3\2\2\2\u00d4\u0092\3\2\2\2\u00d4\u0098\3\2\2\2"+
		"\u00d4\u009e\3\2\2\2\u00d4\u00a3\3\2\2\2\u00d4\u00a8\3\2\2\2\u00d4\u00ad"+
		"\3\2\2\2\u00d4\u00b5\3\2\2\2\u00d4\u00bd\3\2\2\2\u00d4\u00c5\3\2\2\2\u00d4"+
		"\u00ca\3\2\2\2\u00d4\u00cf\3\2\2\2\u00d5\13\3\2\2\2\u00d6\u00da\5\16\b"+
		"\2\u00d7\u00d9\5\20\t\2\u00d8\u00d7\3\2\2\2\u00d9\u00dc\3\2\2\2\u00da"+
		"\u00d8\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00de\3\2\2\2\u00dc\u00da\3\2"+
		"\2\2\u00dd\u00df\5\22\n\2\u00de\u00dd\3\2\2\2\u00de\u00df\3\2\2\2\u00df"+
		"\u00e0\3\2\2\2\u00e0\u00e1\7\33\2\2\u00e1\r\3\2\2\2\u00e2\u00e3\7\24\2"+
		"\2\u00e3\u00e4\5J&\2\u00e4\u00e5\7\32\2\2\u00e5\u00e6\5\4\3\2\u00e6\17"+
		"\3\2\2\2\u00e7\u00e8\7\25\2\2\u00e8\u00e9\7\24\2\2\u00e9\u00ea\5J&\2\u00ea"+
		"\u00eb\7\32\2\2\u00eb\u00ec\5\4\3\2\u00ec\21\3\2\2\2\u00ed\u00ee\7\25"+
		"\2\2\u00ee\u00ef\7\32\2\2\u00ef\u00f0\5\4\3\2\u00f0\23\3\2\2\2\u00f1\u00f2"+
		"\7\23\2\2\u00f2\u00f3\7Z\2\2\u00f3\u00f5\7\64\2\2\u00f4\u00f6\5F$\2\u00f5"+
		"\u00f4\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00f8\7\65"+
		"\2\2\u00f8\u00f9\5\4\3\2\u00f9\u00fa\7\33\2\2\u00fa\25\3\2\2\2\u00fb\u00fc"+
		"\7\27\2\2\u00fc\u00fd\7Z\2\2\u00fd\u00fe\7\67\2\2\u00fe\u00ff\5J&\2\u00ff"+
		"\u0100\7\31\2\2\u0100\u0101\5J&\2\u0101\u0102\7\32\2\2\u0102\u0103\5\4"+
		"\3\2\u0103\u0104\7\33\2\2\u0104\27\3\2\2\2\u0105\u0106\7\27\2\2\u0106"+
		"\u0107\7\37\2\2\u0107\u0108\7Z\2\2\u0108\u0109\7\34\2\2\u0109\u010a\5"+
		"J&\2\u010a\u010b\7\32\2\2\u010b\u010c\5\4\3\2\u010c\u010d\7\33\2\2\u010d"+
		"\31\3\2\2\2\u010e\u010f\7\30\2\2\u010f\u0110\5J&\2\u0110\u0111\7\32\2"+
		"\2\u0111\u0112\5\4\3\2\u0112\u0113\7\33\2\2\u0113\33\3\2\2\2\u0114\u0115"+
		"\5\64\33\2\u0115\u0116\7\66\2\2\u0116\u011c\3\2\2\2\u0117\u0118\5\66\34"+
		"\2\u0118\u0119\7\66\2\2\u0119\u011c\3\2\2\2\u011a\u011c\5\36\20\2\u011b"+
		"\u0114\3\2\2\2\u011b\u0117\3\2\2\2\u011b\u011a\3\2\2\2\u011c\35\3\2\2"+
		"\2\u011d\u011f\7O\2\2\u011e\u0120\5\"\22\2\u011f\u011e\3\2\2\2\u011f\u0120"+
		"\3\2\2\2\u0120\u0122\3\2\2\2\u0121\u0123\5 \21\2\u0122\u0121\3\2\2\2\u0122"+
		"\u0123\3\2\2\2\u0123\u0125\3\2\2\2\u0124\u0126\5B\"\2\u0125\u0124\3\2"+
		"\2\2\u0125\u0126\3\2\2\2\u0126\u0128\3\2\2\2\u0127\u0129\5&\24\2\u0128"+
		"\u0127\3\2\2\2\u0128\u0129\3\2\2\2\u0129\u012e\3\2\2\2\u012a\u012b\7\n"+
		"\2\2\u012b\u012d\5&\24\2\u012c\u012a\3\2\2\2\u012d\u0130\3\2\2\2\u012e"+
		"\u012c\3\2\2\2\u012e\u012f\3\2\2\2\u012f\u0132\3\2\2\2\u0130\u012e\3\2"+
		"\2\2\u0131\u0133\5(\25\2\u0132\u0131\3\2\2\2\u0132\u0133\3\2\2\2\u0133"+
		"\u0134\3\2\2\2\u0134\u0135\7\66\2\2\u0135\37\3\2\2\2\u0136\u0138\7<\2"+
		"\2\u0137\u0136\3\2\2\2\u0137\u0138\3\2\2\2\u0138\u0139\3\2\2\2\u0139\u013f"+
		"\7Z\2\2\u013a\u013c\7=\2\2\u013b\u013a\3\2\2\2\u013b\u013c\3\2\2\2\u013c"+
		"\u013d\3\2\2\2\u013d\u013f\7Z\2\2\u013e\u0137\3\2\2\2\u013e\u013b\3\2"+
		"\2\2\u013f!\3\2\2\2\u0140\u0145\5$\23\2\u0141\u0142\78\2\2\u0142\u0144"+
		"\5$\23\2\u0143\u0141\3\2\2\2\u0144\u0147\3\2\2\2\u0145\u0143\3\2\2\2\u0145"+
		"\u0146\3\2\2\2\u0146#\3\2\2\2\u0147\u0145\3\2\2\2\u0148\u0161\7Z\2\2\u0149"+
		"\u0161\7[\2\2\u014a\u014b\7Z\2\2\u014b\u014c\7\64\2\2\u014c\u0151\7Z\2"+
		"\2\u014d\u014e\78\2\2\u014e\u0150\5J&\2\u014f\u014d\3\2\2\2\u0150\u0153"+
		"\3\2\2\2\u0151\u014f\3\2\2\2\u0151\u0152\3\2\2\2\u0152\u0154\3\2\2\2\u0153"+
		"\u0151\3\2\2\2\u0154\u0161\7\65\2\2\u0155\u0156\7Z\2\2\u0156\u0157\7\64"+
		"\2\2\u0157\u015c\7[\2\2\u0158\u0159\78\2\2\u0159\u015b\5J&\2\u015a\u0158"+
		"\3\2\2\2\u015b\u015e\3\2\2\2\u015c\u015a\3\2\2\2\u015c\u015d\3\2\2\2\u015d"+
		"\u015f\3\2\2\2\u015e\u015c\3\2\2\2\u015f\u0161\7\65\2\2\u0160\u0148\3"+
		"\2\2\2\u0160\u0149\3\2\2\2\u0160\u014a\3\2\2\2\u0160\u0155\3\2\2\2\u0161"+
		"%\3\2\2\2\u0162\u0166\5$\23\2\u0163\u0165\5*\26\2\u0164\u0163\3\2\2\2"+
		"\u0165\u0168\3\2\2\2\u0166\u0164\3\2\2\2\u0166\u0167\3\2\2\2\u0167\'\3"+
		"\2\2\2\u0168\u0166\3\2\2\2\u0169\u016a\7\b\2\2\u016a\u016f\7Z\2\2\u016b"+
		"\u016c\78\2\2\u016c\u016e\7Z\2\2\u016d\u016b\3\2\2\2\u016e\u0171\3\2\2"+
		"\2\u016f\u016d\3\2\2\2\u016f\u0170\3\2\2\2\u0170\u0172\3\2\2\2\u0171\u016f"+
		"\3\2\2\2\u0172\u0192\7\65\2\2\u0173\u0174\7\4\2\2\u0174\u0179\7Z\2\2\u0175"+
		"\u0176\78\2\2\u0176\u0178\7Z\2\2\u0177\u0175\3\2\2\2\u0178\u017b\3\2\2"+
		"\2\u0179\u0177\3\2\2\2\u0179\u017a\3\2\2\2\u017a\u017c\3\2\2\2\u017b\u0179"+
		"\3\2\2\2\u017c\u0192\7\65\2\2\u017d\u017e\7\b\2\2\u017e\u0183\7[\2\2\u017f"+
		"\u0180\78\2\2\u0180\u0182\7[\2\2\u0181\u017f\3\2\2\2\u0182\u0185\3\2\2"+
		"\2\u0183\u0181\3\2\2\2\u0183\u0184\3\2\2\2\u0184\u0186\3\2\2\2\u0185\u0183"+
		"\3\2\2\2\u0186\u0192\7\65\2\2\u0187\u0188\7\4\2\2\u0188\u018d\7[\2\2\u0189"+
		"\u018a\78\2\2\u018a\u018c\7[\2\2\u018b\u0189\3\2\2\2\u018c\u018f\3\2\2"+
		"\2\u018d\u018b\3\2\2\2\u018d\u018e\3\2\2\2\u018e\u0190\3\2\2\2\u018f\u018d"+
		"\3\2\2\2\u0190\u0192\7\65\2\2\u0191\u0169\3\2\2\2\u0191\u0173\3\2\2\2"+
		"\u0191\u017d\3\2\2\2\u0191\u0187\3\2\2\2\u0192)\3\2\2\2\u0193\u0195\7"+
		"\n\2\2\u0194\u0193\3\2\2\2\u0194\u0195\3\2\2\2\u0195\u0196\3\2\2\2\u0196"+
		"\u0197\t\2\2\2\u0197\u0198\5J&\2\u0198+\3\2\2\2\u0199\u019a\7C\2\2\u019a"+
		"\u019c\7\62\2\2\u019b\u019d\5.\30\2\u019c\u019b\3\2\2\2\u019c\u019d\3"+
		"\2\2\2\u019d\u019e\3\2\2\2\u019e\u019f\7\63\2\2\u019f-\3\2\2\2\u01a0\u01a5"+
		"\5\60\31\2\u01a1\u01a2\78\2\2\u01a2\u01a4\5\60\31\2\u01a3\u01a1\3\2\2"+
		"\2\u01a4\u01a7\3\2\2\2\u01a5\u01a3\3\2\2\2\u01a5\u01a6\3\2\2\2\u01a6/"+
		"\3\2\2\2\u01a7\u01a5\3\2\2\2\u01a8\u01a9\7Z\2\2\u01a9\u01aa\13\2\2\2\u01aa"+
		"\u01af\7Z\2\2\u01ab\u01ac\7\7\2\2\u01ac\u01ad\7Z\2\2\u01ad\u01ae\13\2"+
		"\2\2\u01ae\u01b0\7Z\2\2\u01af\u01ab\3\2\2\2\u01af\u01b0\3\2\2\2\u01b0"+
		"\61\3\2\2\2\u01b1\u01b2\7D\2\2\u01b2\u01b3\7E\2\2\u01b3\u01b4\7Z\2\2\u01b4"+
		"\u01b5\7\67\2\2\u01b5\u01b6\5J&\2\u01b6\63\3\2\2\2\u01b7\u01b8\7;\2\2"+
		"\u01b8\u01ba\5D#\2\u01b9\u01bb\5:\36\2\u01ba\u01b9\3\2\2\2\u01ba\u01bb"+
		"\3\2\2\2\u01bb\u01bd\3\2\2\2\u01bc\u01be\5B\"\2\u01bd\u01bc\3\2\2\2\u01bd"+
		"\u01be\3\2\2\2\u01be\u01c0\3\2\2\2\u01bf\u01c1\5<\37\2\u01c0\u01bf\3\2"+
		"\2\2\u01c0\u01c1\3\2\2\2\u01c1\65\3\2\2\2\u01c2\u01c3\7H\2\2\u01c3\u01c4"+
		"\7Z\2\2\u01c4\67\3\2\2\2\u01c5\u01c6\7F\2\2\u01c6\u01c7\7G\2\2\u01c7\u01c8"+
		"\7\64\2\2\u01c8\u01c9\7\\\2\2\u01c9\u01ca\7\65\2\2\u01ca\u01cb\7 \2\2"+
		"\u01cb\u01cc\7Z\2\2\u01cc\u01cd\7\66\2\2\u01cd9\3\2\2\2\u01ce\u01d0\7"+
		"<\2\2\u01cf\u01ce\3\2\2\2\u01cf\u01d0\3\2\2\2\u01d0\u01d1\3\2\2\2\u01d1"+
		"\u01d7\7Z\2\2\u01d2\u01d4\7=\2\2\u01d3\u01d2\3\2\2\2\u01d3\u01d4\3\2\2"+
		"\2\u01d4\u01d5\3\2\2\2\u01d5\u01d7\7Z\2\2\u01d6\u01cf\3\2\2\2\u01d6\u01d3"+
		"\3\2\2\2\u01d7;\3\2\2\2\u01d8\u01d9\b\37\1\2\u01d9\u01dd\5D#\2\u01da\u01dc"+
		"\5> \2\u01db\u01da\3\2\2\2\u01dc\u01df\3\2\2\2\u01dd\u01db\3\2\2\2\u01dd"+
		"\u01de\3\2\2\2\u01de\u01e5\3\2\2\2\u01df\u01dd\3\2\2\2\u01e0\u01e1\f\3"+
		"\2\2\u01e1\u01e2\7\n\2\2\u01e2\u01e4\5<\37\4\u01e3\u01e0\3\2\2\2\u01e4"+
		"\u01e7\3\2\2\2\u01e5\u01e3\3\2\2\2\u01e5\u01e6\3\2\2\2\u01e6=\3\2\2\2"+
		"\u01e7\u01e5\3\2\2\2\u01e8\u01ea\7\n\2\2\u01e9\u01e8\3\2\2\2\u01e9\u01ea"+
		"\3\2\2\2\u01ea\u01eb\3\2\2\2\u01eb\u01ec\t\2\2\2\u01ec\u01ed\5J&\2\u01ed"+
		"?\3\2\2\2\u01ee\u01ef\t\3\2\2\u01ef\u01f0\5J&\2\u01f0\u01f1\7B\2\2\u01f1"+
		"\u01fa\3\2\2\2\u01f2\u01f3\7?\2\2\u01f3\u01f4\5J&\2\u01f4\u01f5\7\31\2"+
		"\2\u01f5\u01f6\5J&\2\u01f6\u01fa\3\2\2\2\u01f7\u01f8\7Y\2\2\u01f8\u01fa"+
		"\5J&\2\u01f9\u01ee\3\2\2\2\u01f9\u01f2\3\2\2\2\u01f9\u01f7\3\2\2\2\u01fa"+
		"A\3\2\2\2\u01fb\u01fc\t\4\2\2\u01fcC\3\2\2\2\u01fd\u0202\7[\2\2\u01fe"+
		"\u01ff\78\2\2\u01ff\u0201\7[\2\2\u0200\u01fe\3\2\2\2\u0201\u0204\3\2\2"+
		"\2\u0202\u0200\3\2\2\2\u0202\u0203\3\2\2\2\u0203E\3\2\2\2\u0204\u0202"+
		"\3\2\2\2\u0205\u020a\7Z\2\2\u0206\u0207\78\2\2\u0207\u0209\7Z\2\2\u0208"+
		"\u0206\3\2\2\2\u0209\u020c\3\2\2\2\u020a\u0208\3\2\2\2\u020a\u020b\3\2"+
		"\2\2\u020bG\3\2\2\2\u020c\u020a\3\2\2\2\u020d\u0212\5J&\2\u020e\u020f"+
		"\78\2\2\u020f\u0211\5J&\2\u0210\u020e\3\2\2\2\u0211\u0214\3\2\2\2\u0212"+
		"\u0210\3\2\2\2\u0212\u0213\3\2\2\2\u0213I\3\2\2\2\u0214\u0212\3\2\2\2"+
		"\u0215\u0216\b&\1\2\u0216\u0217\7,\2\2\u0217\u0249\5J& \u0218\u0219\7"+
		"(\2\2\u0219\u0249\5J&\37\u021a\u0249\7X\2\2\u021b\u0249\7W\2\2\u021c\u0249"+
		"\7\36\2\2\u021d\u021f\5\n\6\2\u021e\u0220\5P)\2\u021f\u021e\3\2\2\2\u021f"+
		"\u0220\3\2\2\2\u0220\u0249\3\2\2\2\u0221\u0223\5L\'\2\u0222\u0224\5P)"+
		"\2\u0223\u0222\3\2\2\2\u0223\u0224\3\2\2\2\u0224\u0249\3\2\2\2\u0225\u0227"+
		"\7Z\2\2\u0226\u0228\5P)\2\u0227\u0226\3\2\2\2\u0227\u0228\3\2\2\2\u0228"+
		"\u0249\3\2\2\2\u0229\u022b\7[\2\2\u022a\u022c\5P)\2\u022b\u022a\3\2\2"+
		"\2\u022b\u022c\3\2\2\2\u022c\u0249\3\2\2\2\u022d\u022e\7\64\2\2\u022e"+
		"\u022f\5J&\2\u022f\u0231\7\65\2\2\u0230\u0232\5P)\2\u0231\u0230\3\2\2"+
		"\2\u0231\u0232\3\2\2\2\u0232\u0249\3\2\2\2\u0233\u0234\7\20\2\2\u0234"+
		"\u0236\7\64\2\2\u0235\u0237\7[\2\2\u0236\u0235\3\2\2\2\u0236\u0237\3\2"+
		"\2\2\u0237\u0238\3\2\2\2\u0238\u0249\7\65\2\2\u0239\u0249\5\34\17\2\u023a"+
		"\u023b\7Z\2\2\u023b\u023c\7\6\2\2\u023c\u0249\7[\2\2\u023d\u0249\5R*\2"+
		"\u023e\u023f\7R\2\2\u023f\u0240\7\64\2\2\u0240\u0241\5J&\2\u0241\u0242"+
		"\7\65\2\2\u0242\u0249\3\2\2\2\u0243\u0249\5N(\2\u0244\u0245\7V\2\2\u0245"+
		"\u0246\7\64\2\2\u0246\u0247\7\t\2\2\u0247\u0249\7[\2\2\u0248\u0215\3\2"+
		"\2\2\u0248\u0218\3\2\2\2\u0248\u021a\3\2\2\2\u0248\u021b\3\2\2\2\u0248"+
		"\u021c\3\2\2\2\u0248\u021d\3\2\2\2\u0248\u0221\3\2\2\2\u0248\u0225\3\2"+
		"\2\2\u0248\u0229\3\2\2\2\u0248\u022d\3\2\2\2\u0248\u0233\3\2\2\2\u0248"+
		"\u0239\3\2\2\2\u0248\u023a\3\2\2\2\u0248\u023d\3\2\2\2\u0248\u023e\3\2"+
		"\2\2\u0248\u0243\3\2\2\2\u0248\u0244\3\2\2\2\u0249\u0276\3\2\2\2\u024a"+
		"\u024b\f\36\2\2\u024b\u024c\7\'\2\2\u024c\u0275\5J&\36\u024d\u024e\f\35"+
		"\2\2\u024e\u024f\t\5\2\2\u024f\u0275\5J&\36\u0250\u0251\f\34\2\2\u0251"+
		"\u0252\t\6\2\2\u0252\u0275\5J&\35\u0253\u0254\f\33\2\2\u0254\u0255\t\7"+
		"\2\2\u0255\u0275\5J&\34\u0256\u0257\f\32\2\2\u0257\u0258\t\b\2\2\u0258"+
		"\u0275\5J&\33\u0259\u025a\f\31\2\2\u025a\u025b\7\5\2\2\u025b\u0275\5J"+
		"&\32\u025c\u025d\f\30\2\2\u025d\u025e\7\3\2\2\u025e\u0275\5J&\31\u025f"+
		"\u0260\f\27\2\2\u0260\u0261\79\2\2\u0261\u0262\5J&\2\u0262\u0263\7:\2"+
		"\2\u0263\u0264\5J&\30\u0264\u0275\3\2\2\2\u0265\u0266\f\26\2\2\u0266\u0267"+
		"\7\34\2\2\u0267\u0275\5J&\27\u0268\u0269\f\25\2\2\u0269\u026a\7L\2\2\u026a"+
		"\u0275\5J&\26\u026b\u026c\f\24\2\2\u026c\u026d\7M\2\2\u026d\u0275\5J&"+
		"\25\u026e\u026f\f\23\2\2\u026f\u0270\7U\2\2\u0270\u0275\5J&\24\u0271\u0272"+
		"\f\22\2\2\u0272\u0273\7N\2\2\u0273\u0275\5J&\23\u0274\u024a\3\2\2\2\u0274"+
		"\u024d\3\2\2\2\u0274\u0250\3\2\2\2\u0274\u0253\3\2\2\2\u0274\u0256\3\2"+
		"\2\2\u0274\u0259\3\2\2\2\u0274\u025c\3\2\2\2\u0274\u025f\3\2\2\2\u0274"+
		"\u0265\3\2\2\2\u0274\u0268\3\2\2\2\u0274\u026b\3\2\2\2\u0274\u026e\3\2"+
		"\2\2\u0274\u0271\3\2\2\2\u0275\u0278\3\2\2\2\u0276\u0274\3\2\2\2\u0276"+
		"\u0277\3\2\2\2\u0277K\3\2\2\2\u0278\u0276\3\2\2\2\u0279\u027b\7\62\2\2"+
		"\u027a\u027c\5H%\2\u027b\u027a\3\2\2\2\u027b\u027c\3\2\2\2\u027c\u027d"+
		"\3\2\2\2\u027d\u027e\7\63\2\2\u027eM\3\2\2\2\u027f\u0280\7P\2\2\u0280"+
		"\u0281\7\64\2\2\u0281\u0282\7[\2\2\u0282\u0284\7\65\2\2\u0283\u0285\5"+
		" \21\2\u0284\u0283\3\2\2\2\u0284\u0285\3\2\2\2\u0285\u0287\3\2\2\2\u0286"+
		"\u0288\5(\25\2\u0287\u0286\3\2\2\2\u0287\u0288\3\2\2\2\u0288\u028b\3\2"+
		"\2\2\u0289\u028a\7S\2\2\u028a\u028c\7[\2\2\u028b\u0289\3\2\2\2\u028b\u028c"+
		"\3\2\2\2\u028c\u0291\3\2\2\2\u028d\u028e\78\2\2\u028e\u0290\7[\2\2\u028f"+
		"\u028d\3\2\2\2\u0290\u0293\3\2\2\2\u0291\u028f\3\2\2\2\u0291\u0292\3\2"+
		"\2\2\u0292O\3\2\2\2\u0293\u0291\3\2\2\2\u0294\u0295\7\62\2\2\u0295\u0296"+
		"\5J&\2\u0296\u0297\7\63\2\2\u0297\u0299\3\2\2\2\u0298\u0294\3\2\2\2\u0299"+
		"\u029a\3\2\2\2\u029a\u0298\3\2\2\2\u029a\u029b\3\2\2\2\u029bQ\3\2\2\2"+
		"\u029c\u029d\t\t\2\2\u029dS\3\2\2\2CY[bvz\u0083\u0090\u0095\u009b\u00d4"+
		"\u00da\u00de\u00f5\u011b\u011f\u0122\u0125\u0128\u012e\u0132\u0137\u013b"+
		"\u013e\u0145\u0151\u015c\u0160\u0166\u016f\u0179\u0183\u018d\u0191\u0194"+
		"\u019c\u01a5\u01af\u01ba\u01bd\u01c0\u01cf\u01d3\u01d6\u01dd\u01e5\u01e9"+
		"\u01f9\u0202\u020a\u0212\u021f\u0223\u0227\u022b\u0231\u0236\u0248\u0274"+
		"\u0276\u027b\u0284\u0287\u028b\u0291\u029a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}