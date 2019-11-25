// Generated from Blang.g4 by ANTLR 4.3

    package com.lang.blang.config.antlr4;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link BlangParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface BlangVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code replaceNullOrEmptyFunctionCall}
	 * labeled alternative in {@link BlangParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReplaceNullOrEmptyFunctionCall(@NotNull BlangParser.ReplaceNullOrEmptyFunctionCallContext ctx);

	/**
	 * Visit a parse tree produced by {@link BlangParser#elseIfStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseIfStat(@NotNull BlangParser.ElseIfStatContext ctx);

	/**
	 * Visit a parse tree produced by the {@code roundOfFunctionCall}
	 * labeled alternative in {@link BlangParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoundOfFunctionCall(@NotNull BlangParser.RoundOfFunctionCallContext ctx);

	/**
	 * Visit a parse tree produced by {@link BlangParser#criteria}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCriteria(@NotNull BlangParser.CriteriaContext ctx);

	/**
	 * Visit a parse tree produced by the {@code numberExpression}
	 * labeled alternative in {@link BlangParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberExpression(@NotNull BlangParser.NumberExpressionContext ctx);

	/**
	 * Visit a parse tree produced by the {@code nounfilter}
	 * labeled alternative in {@link BlangParser#nounorfunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNounfilter(@NotNull BlangParser.NounfilterContext ctx);

	/**
	 * Visit a parse tree produced by {@link BlangParser#verbStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVerbStatement(@NotNull BlangParser.VerbStatementContext ctx);

	/**
	 * Visit a parse tree produced by the {@code avgFunctionCall}
	 * labeled alternative in {@link BlangParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAvgFunctionCall(@NotNull BlangParser.AvgFunctionCallContext ctx);

	/**
	 * Visit a parse tree produced by the {@code notExpression}
	 * labeled alternative in {@link BlangParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotExpression(@NotNull BlangParser.NotExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link BlangParser#idList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdList(@NotNull BlangParser.IdListContext ctx);

	/**
	 * Visit a parse tree produced by the {@code identifierFunctionCall}
	 * labeled alternative in {@link BlangParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierFunctionCall(@NotNull BlangParser.IdentifierFunctionCallContext ctx);

	/**
	 * Visit a parse tree produced by {@link BlangParser#ds}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDs(@NotNull BlangParser.DsContext ctx);

	/**
	 * Visit a parse tree produced by the {@code tableStringPropertyAssignment}
	 * labeled alternative in {@link BlangParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableStringPropertyAssignment(@NotNull BlangParser.TableStringPropertyAssignmentContext ctx);

	/**
	 * Visit a parse tree produced by the {@code stringExpression}
	 * labeled alternative in {@link BlangParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringExpression(@NotNull BlangParser.StringExpressionContext ctx);

	/**
	 * Visit a parse tree produced by the {@code expressionExpression}
	 * labeled alternative in {@link BlangParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionExpression(@NotNull BlangParser.ExpressionExpressionContext ctx);

	/**
	 * Visit a parse tree produced by the {@code compExpression}
	 * labeled alternative in {@link BlangParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompExpression(@NotNull BlangParser.CompExpressionContext ctx);

	/**
	 * Visit a parse tree produced by the {@code stringAscOrder}
	 * labeled alternative in {@link BlangParser#orderby}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringAscOrder(@NotNull BlangParser.StringAscOrderContext ctx);

	/**
	 * Visit a parse tree produced by the {@code nullExpression}
	 * labeled alternative in {@link BlangParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNullExpression(@NotNull BlangParser.NullExpressionContext ctx);

	/**
	 * Visit a parse tree produced by the {@code replaceNullFunctionCall}
	 * labeled alternative in {@link BlangParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReplaceNullFunctionCall(@NotNull BlangParser.ReplaceNullFunctionCallContext ctx);

	/**
	 * Visit a parse tree produced by the {@code likeExpression}
	 * labeled alternative in {@link BlangParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLikeExpression(@NotNull BlangParser.LikeExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link BlangParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(@NotNull BlangParser.BlockContext ctx);

	/**
	 * Visit a parse tree produced by {@link BlangParser#selectStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectStatement(@NotNull BlangParser.SelectStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link BlangParser#filterCriteria}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilterCriteria(@NotNull BlangParser.FilterCriteriaContext ctx);

	/**
	 * Visit a parse tree produced by the {@code windowFuncNounFilter}
	 * labeled alternative in {@link BlangParser#nounorfunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindowFuncNounFilter(@NotNull BlangParser.WindowFuncNounFilterContext ctx);

	/**
	 * Visit a parse tree produced by the {@code boolExpression}
	 * labeled alternative in {@link BlangParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolExpression(@NotNull BlangParser.BoolExpressionContext ctx);

	/**
	 * Visit a parse tree produced by the {@code copyOfExpression}
	 * labeled alternative in {@link BlangParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCopyOfExpression(@NotNull BlangParser.CopyOfExpressionContext ctx);

	/**
	 * Visit a parse tree produced by the {@code sumFunctionCall}
	 * labeled alternative in {@link BlangParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSumFunctionCall(@NotNull BlangParser.SumFunctionCallContext ctx);

	/**
	 * Visit a parse tree produced by {@link BlangParser#relationStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationStat(@NotNull BlangParser.RelationStatContext ctx);

	/**
	 * Visit a parse tree produced by {@link BlangParser#dateExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDateExpression(@NotNull BlangParser.DateExpressionContext ctx);

	/**
	 * Visit a parse tree produced by the {@code stringDescOrder}
	 * labeled alternative in {@link BlangParser#orderby}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringDescOrder(@NotNull BlangParser.StringDescOrderContext ctx);

	/**
	 * Visit a parse tree produced by {@link BlangParser#fetchStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFetchStatement(@NotNull BlangParser.FetchStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link BlangParser#list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList(@NotNull BlangParser.ListContext ctx);

	/**
	 * Visit a parse tree produced by the {@code aggregateExpression}
	 * labeled alternative in {@link BlangParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggregateExpression(@NotNull BlangParser.AggregateExpressionContext ctx);

	/**
	 * Visit a parse tree produced by the {@code betweenPeriodFilter}
	 * labeled alternative in {@link BlangParser#time_period}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBetweenPeriodFilter(@NotNull BlangParser.BetweenPeriodFilterContext ctx);

	/**
	 * Visit a parse tree produced by the {@code powerExpression}
	 * labeled alternative in {@link BlangParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPowerExpression(@NotNull BlangParser.PowerExpressionContext ctx);

	/**
	 * Visit a parse tree produced by the {@code eqExpression}
	 * labeled alternative in {@link BlangParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqExpression(@NotNull BlangParser.EqExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link BlangParser#forEachStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForEachStatement(@NotNull BlangParser.ForEachStatementContext ctx);

	/**
	 * Visit a parse tree produced by the {@code printlnFunctionCall}
	 * labeled alternative in {@link BlangParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintlnFunctionCall(@NotNull BlangParser.PrintlnFunctionCallContext ctx);

	/**
	 * Visit a parse tree produced by the {@code addExpression}
	 * labeled alternative in {@link BlangParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddExpression(@NotNull BlangParser.AddExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link BlangParser#nounList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNounList(@NotNull BlangParser.NounListContext ctx);

	/**
	 * Visit a parse tree produced by {@link BlangParser#relationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationStatement(@NotNull BlangParser.RelationStatementContext ctx);

	/**
	 * Visit a parse tree produced by the {@code tableRowPropertyExpression}
	 * labeled alternative in {@link BlangParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableRowPropertyExpression(@NotNull BlangParser.TableRowPropertyExpressionContext ctx);

	/**
	 * Visit a parse tree produced by the {@code printFunctionCall}
	 * labeled alternative in {@link BlangParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintFunctionCall(@NotNull BlangParser.PrintFunctionCallContext ctx);

	/**
	 * Visit a parse tree produced by {@link BlangParser#dsBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDsBlock(@NotNull BlangParser.DsBlockContext ctx);

	/**
	 * Visit a parse tree produced by the {@code inputExpression}
	 * labeled alternative in {@link BlangParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInputExpression(@NotNull BlangParser.InputExpressionContext ctx);

	/**
	 * Visit a parse tree produced by the {@code assertFunctionCall}
	 * labeled alternative in {@link BlangParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssertFunctionCall(@NotNull BlangParser.AssertFunctionCallContext ctx);

	/**
	 * Visit a parse tree produced by {@link BlangParser#functionDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDecl(@NotNull BlangParser.FunctionDeclContext ctx);

	/**
	 * Visit a parse tree produced by the {@code descOrder}
	 * labeled alternative in {@link BlangParser#orderby}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescOrder(@NotNull BlangParser.DescOrderContext ctx);

	/**
	 * Visit a parse tree produced by the {@code notLikeExpression}
	 * labeled alternative in {@link BlangParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotLikeExpression(@NotNull BlangParser.NotLikeExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link BlangParser#elseStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseStat(@NotNull BlangParser.ElseStatContext ctx);

	/**
	 * Visit a parse tree produced by the {@code sinceFilter}
	 * labeled alternative in {@link BlangParser#time_period}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSinceFilter(@NotNull BlangParser.SinceFilterContext ctx);

	/**
	 * Visit a parse tree produced by the {@code identifierExpression}
	 * labeled alternative in {@link BlangParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierExpression(@NotNull BlangParser.IdentifierExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link BlangParser#calculateStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCalculateStatement(@NotNull BlangParser.CalculateStatementContext ctx);

	/**
	 * Visit a parse tree produced by the {@code nextRowValueExpression}
	 * labeled alternative in {@link BlangParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNextRowValueExpression(@NotNull BlangParser.NextRowValueExpressionContext ctx);

	/**
	 * Visit a parse tree produced by the {@code andExpression}
	 * labeled alternative in {@link BlangParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpression(@NotNull BlangParser.AndExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link BlangParser#indexes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexes(@NotNull BlangParser.IndexesContext ctx);

	/**
	 * Visit a parse tree produced by {@link BlangParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(@NotNull BlangParser.StatementContext ctx);

	/**
	 * Visit a parse tree produced by the {@code functionCallExpression}
	 * labeled alternative in {@link BlangParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCallExpression(@NotNull BlangParser.FunctionCallExpressionContext ctx);

	/**
	 * Visit a parse tree produced by the {@code multExpression}
	 * labeled alternative in {@link BlangParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultExpression(@NotNull BlangParser.MultExpressionContext ctx);

	/**
	 * Visit a parse tree produced by the {@code varAndArrayAssignment}
	 * labeled alternative in {@link BlangParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarAndArrayAssignment(@NotNull BlangParser.VarAndArrayAssignmentContext ctx);

	/**
	 * Visit a parse tree produced by {@link BlangParser#nouns}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNouns(@NotNull BlangParser.NounsContext ctx);

	/**
	 * Visit a parse tree produced by the {@code listExpression}
	 * labeled alternative in {@link BlangParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListExpression(@NotNull BlangParser.ListExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link BlangParser#ifStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStat(@NotNull BlangParser.IfStatContext ctx);

	/**
	 * Visit a parse tree produced by the {@code ascOrder}
	 * labeled alternative in {@link BlangParser#orderby}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAscOrder(@NotNull BlangParser.AscOrderContext ctx);

	/**
	 * Visit a parse tree produced by the {@code startsWithExpression}
	 * labeled alternative in {@link BlangParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStartsWithExpression(@NotNull BlangParser.StartsWithExpressionContext ctx);

	/**
	 * Visit a parse tree produced by the {@code sizeFunctionCall}
	 * labeled alternative in {@link BlangParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSizeFunctionCall(@NotNull BlangParser.SizeFunctionCallContext ctx);

	/**
	 * Visit a parse tree produced by {@link BlangParser#relationClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationClause(@NotNull BlangParser.RelationClauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link BlangParser#criteriaexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCriteriaexpr(@NotNull BlangParser.CriteriaexprContext ctx);

	/**
	 * Visit a parse tree produced by the {@code tablePropertyAssignment}
	 * labeled alternative in {@link BlangParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTablePropertyAssignment(@NotNull BlangParser.TablePropertyAssignmentContext ctx);

	/**
	 * Visit a parse tree produced by {@link BlangParser#forStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(@NotNull BlangParser.ForStatementContext ctx);

	/**
	 * Visit a parse tree produced by the {@code stringfilter}
	 * labeled alternative in {@link BlangParser#nounorfunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringfilter(@NotNull BlangParser.StringfilterContext ctx);

	/**
	 * Visit a parse tree produced by the {@code lastTimePeriodFilter}
	 * labeled alternative in {@link BlangParser#time_period}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLastTimePeriodFilter(@NotNull BlangParser.LastTimePeriodFilterContext ctx);

	/**
	 * Visit a parse tree produced by {@link BlangParser#parse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParse(@NotNull BlangParser.ParseContext ctx);

	/**
	 * Visit a parse tree produced by {@link BlangParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(@NotNull BlangParser.IfStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link BlangParser#filters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilters(@NotNull BlangParser.FiltersContext ctx);

	/**
	 * Visit a parse tree produced by the {@code dateRuleExpression}
	 * labeled alternative in {@link BlangParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDateRuleExpression(@NotNull BlangParser.DateRuleExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link BlangParser#prepositions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrepositions(@NotNull BlangParser.PrepositionsContext ctx);

	/**
	 * Visit a parse tree produced by {@link BlangParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(@NotNull BlangParser.WhileStatementContext ctx);

	/**
	 * Visit a parse tree produced by the {@code orExpression}
	 * labeled alternative in {@link BlangParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrExpression(@NotNull BlangParser.OrExpressionContext ctx);

	/**
	 * Visit a parse tree produced by the {@code unaryMinusExpression}
	 * labeled alternative in {@link BlangParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryMinusExpression(@NotNull BlangParser.UnaryMinusExpressionContext ctx);

	/**
	 * Visit a parse tree produced by the {@code tablePropertyStringAssignment}
	 * labeled alternative in {@link BlangParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTablePropertyStringAssignment(@NotNull BlangParser.TablePropertyStringAssignmentContext ctx);

	/**
	 * Visit a parse tree produced by the {@code inExpression}
	 * labeled alternative in {@link BlangParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInExpression(@NotNull BlangParser.InExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link BlangParser#setNounStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetNounStatement(@NotNull BlangParser.SetNounStatementContext ctx);

	/**
	 * Visit a parse tree produced by the {@code windowFuncStringFilter}
	 * labeled alternative in {@link BlangParser#nounorfunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindowFuncStringFilter(@NotNull BlangParser.WindowFuncStringFilterContext ctx);

	/**
	 * Visit a parse tree produced by the {@code verbExpression}
	 * labeled alternative in {@link BlangParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVerbExpression(@NotNull BlangParser.VerbExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link BlangParser#exprList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprList(@NotNull BlangParser.ExprListContext ctx);

	/**
	 * Visit a parse tree produced by {@link BlangParser#aggregateFunctionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggregateFunctionCall(@NotNull BlangParser.AggregateFunctionCallContext ctx);

	/**
	 * Visit a parse tree produced by {@link BlangParser#compositeStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompositeStatement(@NotNull BlangParser.CompositeStatementContext ctx);

	/**
	 * Visit a parse tree produced by the {@code absFunctionCall}
	 * labeled alternative in {@link BlangParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbsFunctionCall(@NotNull BlangParser.AbsFunctionCallContext ctx);

	/**
	 * Visit a parse tree produced by the {@code ternaryExpression}
	 * labeled alternative in {@link BlangParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTernaryExpression(@NotNull BlangParser.TernaryExpressionContext ctx);

	/**
	 * Visit a parse tree produced by the {@code endsWithExpression}
	 * labeled alternative in {@link BlangParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEndsWithExpression(@NotNull BlangParser.EndsWithExpressionContext ctx);
}