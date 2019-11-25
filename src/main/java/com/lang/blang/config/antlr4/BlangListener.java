// Generated from Blang.g4 by ANTLR 4.3

    package com.lang.blang.config.antlr4;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link BlangParser}.
 */
public interface BlangListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code replaceNullOrEmptyFunctionCall}
	 * labeled alternative in {@link BlangParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterReplaceNullOrEmptyFunctionCall(@NotNull BlangParser.ReplaceNullOrEmptyFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code replaceNullOrEmptyFunctionCall}
	 * labeled alternative in {@link BlangParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitReplaceNullOrEmptyFunctionCall(@NotNull BlangParser.ReplaceNullOrEmptyFunctionCallContext ctx);

	/**
	 * Enter a parse tree produced by {@link BlangParser#elseIfStat}.
	 * @param ctx the parse tree
	 */
	void enterElseIfStat(@NotNull BlangParser.ElseIfStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link BlangParser#elseIfStat}.
	 * @param ctx the parse tree
	 */
	void exitElseIfStat(@NotNull BlangParser.ElseIfStatContext ctx);

	/**
	 * Enter a parse tree produced by the {@code roundOfFunctionCall}
	 * labeled alternative in {@link BlangParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterRoundOfFunctionCall(@NotNull BlangParser.RoundOfFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code roundOfFunctionCall}
	 * labeled alternative in {@link BlangParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitRoundOfFunctionCall(@NotNull BlangParser.RoundOfFunctionCallContext ctx);

	/**
	 * Enter a parse tree produced by {@link BlangParser#criteria}.
	 * @param ctx the parse tree
	 */
	void enterCriteria(@NotNull BlangParser.CriteriaContext ctx);
	/**
	 * Exit a parse tree produced by {@link BlangParser#criteria}.
	 * @param ctx the parse tree
	 */
	void exitCriteria(@NotNull BlangParser.CriteriaContext ctx);

	/**
	 * Enter a parse tree produced by the {@code numberExpression}
	 * labeled alternative in {@link BlangParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNumberExpression(@NotNull BlangParser.NumberExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numberExpression}
	 * labeled alternative in {@link BlangParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNumberExpression(@NotNull BlangParser.NumberExpressionContext ctx);

	/**
	 * Enter a parse tree produced by the {@code nounfilter}
	 * labeled alternative in {@link BlangParser#nounorfunction}.
	 * @param ctx the parse tree
	 */
	void enterNounfilter(@NotNull BlangParser.NounfilterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nounfilter}
	 * labeled alternative in {@link BlangParser#nounorfunction}.
	 * @param ctx the parse tree
	 */
	void exitNounfilter(@NotNull BlangParser.NounfilterContext ctx);

	/**
	 * Enter a parse tree produced by {@link BlangParser#verbStatement}.
	 * @param ctx the parse tree
	 */
	void enterVerbStatement(@NotNull BlangParser.VerbStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link BlangParser#verbStatement}.
	 * @param ctx the parse tree
	 */
	void exitVerbStatement(@NotNull BlangParser.VerbStatementContext ctx);

	/**
	 * Enter a parse tree produced by the {@code avgFunctionCall}
	 * labeled alternative in {@link BlangParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterAvgFunctionCall(@NotNull BlangParser.AvgFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code avgFunctionCall}
	 * labeled alternative in {@link BlangParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitAvgFunctionCall(@NotNull BlangParser.AvgFunctionCallContext ctx);

	/**
	 * Enter a parse tree produced by the {@code notExpression}
	 * labeled alternative in {@link BlangParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNotExpression(@NotNull BlangParser.NotExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notExpression}
	 * labeled alternative in {@link BlangParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNotExpression(@NotNull BlangParser.NotExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link BlangParser#idList}.
	 * @param ctx the parse tree
	 */
	void enterIdList(@NotNull BlangParser.IdListContext ctx);
	/**
	 * Exit a parse tree produced by {@link BlangParser#idList}.
	 * @param ctx the parse tree
	 */
	void exitIdList(@NotNull BlangParser.IdListContext ctx);

	/**
	 * Enter a parse tree produced by the {@code identifierFunctionCall}
	 * labeled alternative in {@link BlangParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierFunctionCall(@NotNull BlangParser.IdentifierFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code identifierFunctionCall}
	 * labeled alternative in {@link BlangParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierFunctionCall(@NotNull BlangParser.IdentifierFunctionCallContext ctx);

	/**
	 * Enter a parse tree produced by {@link BlangParser#ds}.
	 * @param ctx the parse tree
	 */
	void enterDs(@NotNull BlangParser.DsContext ctx);
	/**
	 * Exit a parse tree produced by {@link BlangParser#ds}.
	 * @param ctx the parse tree
	 */
	void exitDs(@NotNull BlangParser.DsContext ctx);

	/**
	 * Enter a parse tree produced by the {@code tableStringPropertyAssignment}
	 * labeled alternative in {@link BlangParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterTableStringPropertyAssignment(@NotNull BlangParser.TableStringPropertyAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableStringPropertyAssignment}
	 * labeled alternative in {@link BlangParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitTableStringPropertyAssignment(@NotNull BlangParser.TableStringPropertyAssignmentContext ctx);

	/**
	 * Enter a parse tree produced by the {@code stringExpression}
	 * labeled alternative in {@link BlangParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterStringExpression(@NotNull BlangParser.StringExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringExpression}
	 * labeled alternative in {@link BlangParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitStringExpression(@NotNull BlangParser.StringExpressionContext ctx);

	/**
	 * Enter a parse tree produced by the {@code expressionExpression}
	 * labeled alternative in {@link BlangParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionExpression(@NotNull BlangParser.ExpressionExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionExpression}
	 * labeled alternative in {@link BlangParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionExpression(@NotNull BlangParser.ExpressionExpressionContext ctx);

	/**
	 * Enter a parse tree produced by the {@code compExpression}
	 * labeled alternative in {@link BlangParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterCompExpression(@NotNull BlangParser.CompExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code compExpression}
	 * labeled alternative in {@link BlangParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitCompExpression(@NotNull BlangParser.CompExpressionContext ctx);

	/**
	 * Enter a parse tree produced by the {@code stringAscOrder}
	 * labeled alternative in {@link BlangParser#orderby}.
	 * @param ctx the parse tree
	 */
	void enterStringAscOrder(@NotNull BlangParser.StringAscOrderContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringAscOrder}
	 * labeled alternative in {@link BlangParser#orderby}.
	 * @param ctx the parse tree
	 */
	void exitStringAscOrder(@NotNull BlangParser.StringAscOrderContext ctx);

	/**
	 * Enter a parse tree produced by the {@code nullExpression}
	 * labeled alternative in {@link BlangParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNullExpression(@NotNull BlangParser.NullExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nullExpression}
	 * labeled alternative in {@link BlangParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNullExpression(@NotNull BlangParser.NullExpressionContext ctx);

	/**
	 * Enter a parse tree produced by the {@code replaceNullFunctionCall}
	 * labeled alternative in {@link BlangParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterReplaceNullFunctionCall(@NotNull BlangParser.ReplaceNullFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code replaceNullFunctionCall}
	 * labeled alternative in {@link BlangParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitReplaceNullFunctionCall(@NotNull BlangParser.ReplaceNullFunctionCallContext ctx);

	/**
	 * Enter a parse tree produced by the {@code likeExpression}
	 * labeled alternative in {@link BlangParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLikeExpression(@NotNull BlangParser.LikeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code likeExpression}
	 * labeled alternative in {@link BlangParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLikeExpression(@NotNull BlangParser.LikeExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link BlangParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(@NotNull BlangParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link BlangParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(@NotNull BlangParser.BlockContext ctx);

	/**
	 * Enter a parse tree produced by {@link BlangParser#selectStatement}.
	 * @param ctx the parse tree
	 */
	void enterSelectStatement(@NotNull BlangParser.SelectStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link BlangParser#selectStatement}.
	 * @param ctx the parse tree
	 */
	void exitSelectStatement(@NotNull BlangParser.SelectStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link BlangParser#filterCriteria}.
	 * @param ctx the parse tree
	 */
	void enterFilterCriteria(@NotNull BlangParser.FilterCriteriaContext ctx);
	/**
	 * Exit a parse tree produced by {@link BlangParser#filterCriteria}.
	 * @param ctx the parse tree
	 */
	void exitFilterCriteria(@NotNull BlangParser.FilterCriteriaContext ctx);

	/**
	 * Enter a parse tree produced by the {@code windowFuncNounFilter}
	 * labeled alternative in {@link BlangParser#nounorfunction}.
	 * @param ctx the parse tree
	 */
	void enterWindowFuncNounFilter(@NotNull BlangParser.WindowFuncNounFilterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code windowFuncNounFilter}
	 * labeled alternative in {@link BlangParser#nounorfunction}.
	 * @param ctx the parse tree
	 */
	void exitWindowFuncNounFilter(@NotNull BlangParser.WindowFuncNounFilterContext ctx);

	/**
	 * Enter a parse tree produced by the {@code boolExpression}
	 * labeled alternative in {@link BlangParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBoolExpression(@NotNull BlangParser.BoolExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolExpression}
	 * labeled alternative in {@link BlangParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBoolExpression(@NotNull BlangParser.BoolExpressionContext ctx);

	/**
	 * Enter a parse tree produced by the {@code copyOfExpression}
	 * labeled alternative in {@link BlangParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterCopyOfExpression(@NotNull BlangParser.CopyOfExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code copyOfExpression}
	 * labeled alternative in {@link BlangParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitCopyOfExpression(@NotNull BlangParser.CopyOfExpressionContext ctx);

	/**
	 * Enter a parse tree produced by the {@code sumFunctionCall}
	 * labeled alternative in {@link BlangParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterSumFunctionCall(@NotNull BlangParser.SumFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sumFunctionCall}
	 * labeled alternative in {@link BlangParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitSumFunctionCall(@NotNull BlangParser.SumFunctionCallContext ctx);

	/**
	 * Enter a parse tree produced by {@link BlangParser#relationStat}.
	 * @param ctx the parse tree
	 */
	void enterRelationStat(@NotNull BlangParser.RelationStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link BlangParser#relationStat}.
	 * @param ctx the parse tree
	 */
	void exitRelationStat(@NotNull BlangParser.RelationStatContext ctx);

	/**
	 * Enter a parse tree produced by {@link BlangParser#dateExpression}.
	 * @param ctx the parse tree
	 */
	void enterDateExpression(@NotNull BlangParser.DateExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BlangParser#dateExpression}.
	 * @param ctx the parse tree
	 */
	void exitDateExpression(@NotNull BlangParser.DateExpressionContext ctx);

	/**
	 * Enter a parse tree produced by the {@code stringDescOrder}
	 * labeled alternative in {@link BlangParser#orderby}.
	 * @param ctx the parse tree
	 */
	void enterStringDescOrder(@NotNull BlangParser.StringDescOrderContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringDescOrder}
	 * labeled alternative in {@link BlangParser#orderby}.
	 * @param ctx the parse tree
	 */
	void exitStringDescOrder(@NotNull BlangParser.StringDescOrderContext ctx);

	/**
	 * Enter a parse tree produced by {@link BlangParser#fetchStatement}.
	 * @param ctx the parse tree
	 */
	void enterFetchStatement(@NotNull BlangParser.FetchStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link BlangParser#fetchStatement}.
	 * @param ctx the parse tree
	 */
	void exitFetchStatement(@NotNull BlangParser.FetchStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link BlangParser#list}.
	 * @param ctx the parse tree
	 */
	void enterList(@NotNull BlangParser.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link BlangParser#list}.
	 * @param ctx the parse tree
	 */
	void exitList(@NotNull BlangParser.ListContext ctx);

	/**
	 * Enter a parse tree produced by the {@code aggregateExpression}
	 * labeled alternative in {@link BlangParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAggregateExpression(@NotNull BlangParser.AggregateExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code aggregateExpression}
	 * labeled alternative in {@link BlangParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAggregateExpression(@NotNull BlangParser.AggregateExpressionContext ctx);

	/**
	 * Enter a parse tree produced by the {@code betweenPeriodFilter}
	 * labeled alternative in {@link BlangParser#time_period}.
	 * @param ctx the parse tree
	 */
	void enterBetweenPeriodFilter(@NotNull BlangParser.BetweenPeriodFilterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code betweenPeriodFilter}
	 * labeled alternative in {@link BlangParser#time_period}.
	 * @param ctx the parse tree
	 */
	void exitBetweenPeriodFilter(@NotNull BlangParser.BetweenPeriodFilterContext ctx);

	/**
	 * Enter a parse tree produced by the {@code powerExpression}
	 * labeled alternative in {@link BlangParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPowerExpression(@NotNull BlangParser.PowerExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code powerExpression}
	 * labeled alternative in {@link BlangParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPowerExpression(@NotNull BlangParser.PowerExpressionContext ctx);

	/**
	 * Enter a parse tree produced by the {@code eqExpression}
	 * labeled alternative in {@link BlangParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterEqExpression(@NotNull BlangParser.EqExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code eqExpression}
	 * labeled alternative in {@link BlangParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitEqExpression(@NotNull BlangParser.EqExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link BlangParser#forEachStatement}.
	 * @param ctx the parse tree
	 */
	void enterForEachStatement(@NotNull BlangParser.ForEachStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link BlangParser#forEachStatement}.
	 * @param ctx the parse tree
	 */
	void exitForEachStatement(@NotNull BlangParser.ForEachStatementContext ctx);

	/**
	 * Enter a parse tree produced by the {@code printlnFunctionCall}
	 * labeled alternative in {@link BlangParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterPrintlnFunctionCall(@NotNull BlangParser.PrintlnFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code printlnFunctionCall}
	 * labeled alternative in {@link BlangParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitPrintlnFunctionCall(@NotNull BlangParser.PrintlnFunctionCallContext ctx);

	/**
	 * Enter a parse tree produced by the {@code addExpression}
	 * labeled alternative in {@link BlangParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAddExpression(@NotNull BlangParser.AddExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addExpression}
	 * labeled alternative in {@link BlangParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAddExpression(@NotNull BlangParser.AddExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link BlangParser#nounList}.
	 * @param ctx the parse tree
	 */
	void enterNounList(@NotNull BlangParser.NounListContext ctx);
	/**
	 * Exit a parse tree produced by {@link BlangParser#nounList}.
	 * @param ctx the parse tree
	 */
	void exitNounList(@NotNull BlangParser.NounListContext ctx);

	/**
	 * Enter a parse tree produced by {@link BlangParser#relationStatement}.
	 * @param ctx the parse tree
	 */
	void enterRelationStatement(@NotNull BlangParser.RelationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link BlangParser#relationStatement}.
	 * @param ctx the parse tree
	 */
	void exitRelationStatement(@NotNull BlangParser.RelationStatementContext ctx);

	/**
	 * Enter a parse tree produced by the {@code tableRowPropertyExpression}
	 * labeled alternative in {@link BlangParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterTableRowPropertyExpression(@NotNull BlangParser.TableRowPropertyExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableRowPropertyExpression}
	 * labeled alternative in {@link BlangParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitTableRowPropertyExpression(@NotNull BlangParser.TableRowPropertyExpressionContext ctx);

	/**
	 * Enter a parse tree produced by the {@code printFunctionCall}
	 * labeled alternative in {@link BlangParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterPrintFunctionCall(@NotNull BlangParser.PrintFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code printFunctionCall}
	 * labeled alternative in {@link BlangParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitPrintFunctionCall(@NotNull BlangParser.PrintFunctionCallContext ctx);

	/**
	 * Enter a parse tree produced by {@link BlangParser#dsBlock}.
	 * @param ctx the parse tree
	 */
	void enterDsBlock(@NotNull BlangParser.DsBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link BlangParser#dsBlock}.
	 * @param ctx the parse tree
	 */
	void exitDsBlock(@NotNull BlangParser.DsBlockContext ctx);

	/**
	 * Enter a parse tree produced by the {@code inputExpression}
	 * labeled alternative in {@link BlangParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterInputExpression(@NotNull BlangParser.InputExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code inputExpression}
	 * labeled alternative in {@link BlangParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitInputExpression(@NotNull BlangParser.InputExpressionContext ctx);

	/**
	 * Enter a parse tree produced by the {@code assertFunctionCall}
	 * labeled alternative in {@link BlangParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterAssertFunctionCall(@NotNull BlangParser.AssertFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assertFunctionCall}
	 * labeled alternative in {@link BlangParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitAssertFunctionCall(@NotNull BlangParser.AssertFunctionCallContext ctx);

	/**
	 * Enter a parse tree produced by {@link BlangParser#functionDecl}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDecl(@NotNull BlangParser.FunctionDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link BlangParser#functionDecl}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDecl(@NotNull BlangParser.FunctionDeclContext ctx);

	/**
	 * Enter a parse tree produced by the {@code descOrder}
	 * labeled alternative in {@link BlangParser#orderby}.
	 * @param ctx the parse tree
	 */
	void enterDescOrder(@NotNull BlangParser.DescOrderContext ctx);
	/**
	 * Exit a parse tree produced by the {@code descOrder}
	 * labeled alternative in {@link BlangParser#orderby}.
	 * @param ctx the parse tree
	 */
	void exitDescOrder(@NotNull BlangParser.DescOrderContext ctx);

	/**
	 * Enter a parse tree produced by the {@code notLikeExpression}
	 * labeled alternative in {@link BlangParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNotLikeExpression(@NotNull BlangParser.NotLikeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notLikeExpression}
	 * labeled alternative in {@link BlangParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNotLikeExpression(@NotNull BlangParser.NotLikeExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link BlangParser#elseStat}.
	 * @param ctx the parse tree
	 */
	void enterElseStat(@NotNull BlangParser.ElseStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link BlangParser#elseStat}.
	 * @param ctx the parse tree
	 */
	void exitElseStat(@NotNull BlangParser.ElseStatContext ctx);

	/**
	 * Enter a parse tree produced by the {@code sinceFilter}
	 * labeled alternative in {@link BlangParser#time_period}.
	 * @param ctx the parse tree
	 */
	void enterSinceFilter(@NotNull BlangParser.SinceFilterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sinceFilter}
	 * labeled alternative in {@link BlangParser#time_period}.
	 * @param ctx the parse tree
	 */
	void exitSinceFilter(@NotNull BlangParser.SinceFilterContext ctx);

	/**
	 * Enter a parse tree produced by the {@code identifierExpression}
	 * labeled alternative in {@link BlangParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierExpression(@NotNull BlangParser.IdentifierExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code identifierExpression}
	 * labeled alternative in {@link BlangParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierExpression(@NotNull BlangParser.IdentifierExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link BlangParser#calculateStatement}.
	 * @param ctx the parse tree
	 */
	void enterCalculateStatement(@NotNull BlangParser.CalculateStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link BlangParser#calculateStatement}.
	 * @param ctx the parse tree
	 */
	void exitCalculateStatement(@NotNull BlangParser.CalculateStatementContext ctx);

	/**
	 * Enter a parse tree produced by the {@code nextRowValueExpression}
	 * labeled alternative in {@link BlangParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNextRowValueExpression(@NotNull BlangParser.NextRowValueExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nextRowValueExpression}
	 * labeled alternative in {@link BlangParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNextRowValueExpression(@NotNull BlangParser.NextRowValueExpressionContext ctx);

	/**
	 * Enter a parse tree produced by the {@code andExpression}
	 * labeled alternative in {@link BlangParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAndExpression(@NotNull BlangParser.AndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code andExpression}
	 * labeled alternative in {@link BlangParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAndExpression(@NotNull BlangParser.AndExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link BlangParser#indexes}.
	 * @param ctx the parse tree
	 */
	void enterIndexes(@NotNull BlangParser.IndexesContext ctx);
	/**
	 * Exit a parse tree produced by {@link BlangParser#indexes}.
	 * @param ctx the parse tree
	 */
	void exitIndexes(@NotNull BlangParser.IndexesContext ctx);

	/**
	 * Enter a parse tree produced by {@link BlangParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(@NotNull BlangParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link BlangParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(@NotNull BlangParser.StatementContext ctx);

	/**
	 * Enter a parse tree produced by the {@code functionCallExpression}
	 * labeled alternative in {@link BlangParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCallExpression(@NotNull BlangParser.FunctionCallExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionCallExpression}
	 * labeled alternative in {@link BlangParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCallExpression(@NotNull BlangParser.FunctionCallExpressionContext ctx);

	/**
	 * Enter a parse tree produced by the {@code multExpression}
	 * labeled alternative in {@link BlangParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMultExpression(@NotNull BlangParser.MultExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multExpression}
	 * labeled alternative in {@link BlangParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMultExpression(@NotNull BlangParser.MultExpressionContext ctx);

	/**
	 * Enter a parse tree produced by the {@code varAndArrayAssignment}
	 * labeled alternative in {@link BlangParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterVarAndArrayAssignment(@NotNull BlangParser.VarAndArrayAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varAndArrayAssignment}
	 * labeled alternative in {@link BlangParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitVarAndArrayAssignment(@NotNull BlangParser.VarAndArrayAssignmentContext ctx);

	/**
	 * Enter a parse tree produced by {@link BlangParser#nouns}.
	 * @param ctx the parse tree
	 */
	void enterNouns(@NotNull BlangParser.NounsContext ctx);
	/**
	 * Exit a parse tree produced by {@link BlangParser#nouns}.
	 * @param ctx the parse tree
	 */
	void exitNouns(@NotNull BlangParser.NounsContext ctx);

	/**
	 * Enter a parse tree produced by the {@code listExpression}
	 * labeled alternative in {@link BlangParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterListExpression(@NotNull BlangParser.ListExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code listExpression}
	 * labeled alternative in {@link BlangParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitListExpression(@NotNull BlangParser.ListExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link BlangParser#ifStat}.
	 * @param ctx the parse tree
	 */
	void enterIfStat(@NotNull BlangParser.IfStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link BlangParser#ifStat}.
	 * @param ctx the parse tree
	 */
	void exitIfStat(@NotNull BlangParser.IfStatContext ctx);

	/**
	 * Enter a parse tree produced by the {@code ascOrder}
	 * labeled alternative in {@link BlangParser#orderby}.
	 * @param ctx the parse tree
	 */
	void enterAscOrder(@NotNull BlangParser.AscOrderContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ascOrder}
	 * labeled alternative in {@link BlangParser#orderby}.
	 * @param ctx the parse tree
	 */
	void exitAscOrder(@NotNull BlangParser.AscOrderContext ctx);

	/**
	 * Enter a parse tree produced by the {@code startsWithExpression}
	 * labeled alternative in {@link BlangParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterStartsWithExpression(@NotNull BlangParser.StartsWithExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code startsWithExpression}
	 * labeled alternative in {@link BlangParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitStartsWithExpression(@NotNull BlangParser.StartsWithExpressionContext ctx);

	/**
	 * Enter a parse tree produced by the {@code sizeFunctionCall}
	 * labeled alternative in {@link BlangParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterSizeFunctionCall(@NotNull BlangParser.SizeFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sizeFunctionCall}
	 * labeled alternative in {@link BlangParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitSizeFunctionCall(@NotNull BlangParser.SizeFunctionCallContext ctx);

	/**
	 * Enter a parse tree produced by {@link BlangParser#relationClause}.
	 * @param ctx the parse tree
	 */
	void enterRelationClause(@NotNull BlangParser.RelationClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link BlangParser#relationClause}.
	 * @param ctx the parse tree
	 */
	void exitRelationClause(@NotNull BlangParser.RelationClauseContext ctx);

	/**
	 * Enter a parse tree produced by {@link BlangParser#criteriaexpr}.
	 * @param ctx the parse tree
	 */
	void enterCriteriaexpr(@NotNull BlangParser.CriteriaexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link BlangParser#criteriaexpr}.
	 * @param ctx the parse tree
	 */
	void exitCriteriaexpr(@NotNull BlangParser.CriteriaexprContext ctx);

	/**
	 * Enter a parse tree produced by the {@code tablePropertyAssignment}
	 * labeled alternative in {@link BlangParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterTablePropertyAssignment(@NotNull BlangParser.TablePropertyAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tablePropertyAssignment}
	 * labeled alternative in {@link BlangParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitTablePropertyAssignment(@NotNull BlangParser.TablePropertyAssignmentContext ctx);

	/**
	 * Enter a parse tree produced by {@link BlangParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(@NotNull BlangParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link BlangParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(@NotNull BlangParser.ForStatementContext ctx);

	/**
	 * Enter a parse tree produced by the {@code stringfilter}
	 * labeled alternative in {@link BlangParser#nounorfunction}.
	 * @param ctx the parse tree
	 */
	void enterStringfilter(@NotNull BlangParser.StringfilterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringfilter}
	 * labeled alternative in {@link BlangParser#nounorfunction}.
	 * @param ctx the parse tree
	 */
	void exitStringfilter(@NotNull BlangParser.StringfilterContext ctx);

	/**
	 * Enter a parse tree produced by the {@code lastTimePeriodFilter}
	 * labeled alternative in {@link BlangParser#time_period}.
	 * @param ctx the parse tree
	 */
	void enterLastTimePeriodFilter(@NotNull BlangParser.LastTimePeriodFilterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lastTimePeriodFilter}
	 * labeled alternative in {@link BlangParser#time_period}.
	 * @param ctx the parse tree
	 */
	void exitLastTimePeriodFilter(@NotNull BlangParser.LastTimePeriodFilterContext ctx);

	/**
	 * Enter a parse tree produced by {@link BlangParser#parse}.
	 * @param ctx the parse tree
	 */
	void enterParse(@NotNull BlangParser.ParseContext ctx);
	/**
	 * Exit a parse tree produced by {@link BlangParser#parse}.
	 * @param ctx the parse tree
	 */
	void exitParse(@NotNull BlangParser.ParseContext ctx);

	/**
	 * Enter a parse tree produced by {@link BlangParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(@NotNull BlangParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link BlangParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(@NotNull BlangParser.IfStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link BlangParser#filters}.
	 * @param ctx the parse tree
	 */
	void enterFilters(@NotNull BlangParser.FiltersContext ctx);
	/**
	 * Exit a parse tree produced by {@link BlangParser#filters}.
	 * @param ctx the parse tree
	 */
	void exitFilters(@NotNull BlangParser.FiltersContext ctx);

	/**
	 * Enter a parse tree produced by the {@code dateRuleExpression}
	 * labeled alternative in {@link BlangParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterDateRuleExpression(@NotNull BlangParser.DateRuleExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dateRuleExpression}
	 * labeled alternative in {@link BlangParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitDateRuleExpression(@NotNull BlangParser.DateRuleExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link BlangParser#prepositions}.
	 * @param ctx the parse tree
	 */
	void enterPrepositions(@NotNull BlangParser.PrepositionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link BlangParser#prepositions}.
	 * @param ctx the parse tree
	 */
	void exitPrepositions(@NotNull BlangParser.PrepositionsContext ctx);

	/**
	 * Enter a parse tree produced by {@link BlangParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(@NotNull BlangParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link BlangParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(@NotNull BlangParser.WhileStatementContext ctx);

	/**
	 * Enter a parse tree produced by the {@code orExpression}
	 * labeled alternative in {@link BlangParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterOrExpression(@NotNull BlangParser.OrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code orExpression}
	 * labeled alternative in {@link BlangParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitOrExpression(@NotNull BlangParser.OrExpressionContext ctx);

	/**
	 * Enter a parse tree produced by the {@code unaryMinusExpression}
	 * labeled alternative in {@link BlangParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryMinusExpression(@NotNull BlangParser.UnaryMinusExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unaryMinusExpression}
	 * labeled alternative in {@link BlangParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryMinusExpression(@NotNull BlangParser.UnaryMinusExpressionContext ctx);

	/**
	 * Enter a parse tree produced by the {@code tablePropertyStringAssignment}
	 * labeled alternative in {@link BlangParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterTablePropertyStringAssignment(@NotNull BlangParser.TablePropertyStringAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tablePropertyStringAssignment}
	 * labeled alternative in {@link BlangParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitTablePropertyStringAssignment(@NotNull BlangParser.TablePropertyStringAssignmentContext ctx);

	/**
	 * Enter a parse tree produced by the {@code inExpression}
	 * labeled alternative in {@link BlangParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterInExpression(@NotNull BlangParser.InExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code inExpression}
	 * labeled alternative in {@link BlangParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitInExpression(@NotNull BlangParser.InExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link BlangParser#setNounStatement}.
	 * @param ctx the parse tree
	 */
	void enterSetNounStatement(@NotNull BlangParser.SetNounStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link BlangParser#setNounStatement}.
	 * @param ctx the parse tree
	 */
	void exitSetNounStatement(@NotNull BlangParser.SetNounStatementContext ctx);

	/**
	 * Enter a parse tree produced by the {@code windowFuncStringFilter}
	 * labeled alternative in {@link BlangParser#nounorfunction}.
	 * @param ctx the parse tree
	 */
	void enterWindowFuncStringFilter(@NotNull BlangParser.WindowFuncStringFilterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code windowFuncStringFilter}
	 * labeled alternative in {@link BlangParser#nounorfunction}.
	 * @param ctx the parse tree
	 */
	void exitWindowFuncStringFilter(@NotNull BlangParser.WindowFuncStringFilterContext ctx);

	/**
	 * Enter a parse tree produced by the {@code verbExpression}
	 * labeled alternative in {@link BlangParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterVerbExpression(@NotNull BlangParser.VerbExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code verbExpression}
	 * labeled alternative in {@link BlangParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitVerbExpression(@NotNull BlangParser.VerbExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link BlangParser#exprList}.
	 * @param ctx the parse tree
	 */
	void enterExprList(@NotNull BlangParser.ExprListContext ctx);
	/**
	 * Exit a parse tree produced by {@link BlangParser#exprList}.
	 * @param ctx the parse tree
	 */
	void exitExprList(@NotNull BlangParser.ExprListContext ctx);

	/**
	 * Enter a parse tree produced by {@link BlangParser#aggregateFunctionCall}.
	 * @param ctx the parse tree
	 */
	void enterAggregateFunctionCall(@NotNull BlangParser.AggregateFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link BlangParser#aggregateFunctionCall}.
	 * @param ctx the parse tree
	 */
	void exitAggregateFunctionCall(@NotNull BlangParser.AggregateFunctionCallContext ctx);

	/**
	 * Enter a parse tree produced by {@link BlangParser#compositeStatement}.
	 * @param ctx the parse tree
	 */
	void enterCompositeStatement(@NotNull BlangParser.CompositeStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link BlangParser#compositeStatement}.
	 * @param ctx the parse tree
	 */
	void exitCompositeStatement(@NotNull BlangParser.CompositeStatementContext ctx);

	/**
	 * Enter a parse tree produced by the {@code absFunctionCall}
	 * labeled alternative in {@link BlangParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterAbsFunctionCall(@NotNull BlangParser.AbsFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code absFunctionCall}
	 * labeled alternative in {@link BlangParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitAbsFunctionCall(@NotNull BlangParser.AbsFunctionCallContext ctx);

	/**
	 * Enter a parse tree produced by the {@code ternaryExpression}
	 * labeled alternative in {@link BlangParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterTernaryExpression(@NotNull BlangParser.TernaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ternaryExpression}
	 * labeled alternative in {@link BlangParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitTernaryExpression(@NotNull BlangParser.TernaryExpressionContext ctx);

	/**
	 * Enter a parse tree produced by the {@code endsWithExpression}
	 * labeled alternative in {@link BlangParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterEndsWithExpression(@NotNull BlangParser.EndsWithExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code endsWithExpression}
	 * labeled alternative in {@link BlangParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitEndsWithExpression(@NotNull BlangParser.EndsWithExpressionContext ctx);
}