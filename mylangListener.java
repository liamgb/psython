// Generated from parser/mylang.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link mylangParser}.
 */
public interface mylangListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link mylangParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(mylangParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link mylangParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(mylangParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link mylangParser#explist}.
	 * @param ctx the parse tree
	 */
	void enterExplist(mylangParser.ExplistContext ctx);
	/**
	 * Exit a parse tree produced by {@link mylangParser#explist}.
	 * @param ctx the parse tree
	 */
	void exitExplist(mylangParser.ExplistContext ctx);
	/**
	 * Enter a parse tree produced by {@link mylangParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(mylangParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link mylangParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(mylangParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link mylangParser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call(mylangParser.Function_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link mylangParser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call(mylangParser.Function_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link mylangParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(mylangParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link mylangParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(mylangParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link mylangParser#return}.
	 * @param ctx the parse tree
	 */
	void enterReturn(mylangParser.ReturnContext ctx);
	/**
	 * Exit a parse tree produced by {@link mylangParser#return}.
	 * @param ctx the parse tree
	 */
	void exitReturn(mylangParser.ReturnContext ctx);
	/**
	 * Enter a parse tree produced by {@link mylangParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterArgument(mylangParser.ArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link mylangParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitArgument(mylangParser.ArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link mylangParser#arglist}.
	 * @param ctx the parse tree
	 */
	void enterArglist(mylangParser.ArglistContext ctx);
	/**
	 * Exit a parse tree produced by {@link mylangParser#arglist}.
	 * @param ctx the parse tree
	 */
	void exitArglist(mylangParser.ArglistContext ctx);
	/**
	 * Enter a parse tree produced by {@link mylangParser#idlist}.
	 * @param ctx the parse tree
	 */
	void enterIdlist(mylangParser.IdlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link mylangParser#idlist}.
	 * @param ctx the parse tree
	 */
	void exitIdlist(mylangParser.IdlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link mylangParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(mylangParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link mylangParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(mylangParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link mylangParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(mylangParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link mylangParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(mylangParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link mylangParser#arithmetic}.
	 * @param ctx the parse tree
	 */
	void enterArithmetic(mylangParser.ArithmeticContext ctx);
	/**
	 * Exit a parse tree produced by {@link mylangParser#arithmetic}.
	 * @param ctx the parse tree
	 */
	void exitArithmetic(mylangParser.ArithmeticContext ctx);
	/**
	 * Enter a parse tree produced by {@link mylangParser#relational}.
	 * @param ctx the parse tree
	 */
	void enterRelational(mylangParser.RelationalContext ctx);
	/**
	 * Exit a parse tree produced by {@link mylangParser#relational}.
	 * @param ctx the parse tree
	 */
	void exitRelational(mylangParser.RelationalContext ctx);
	/**
	 * Enter a parse tree produced by {@link mylangParser#logical}.
	 * @param ctx the parse tree
	 */
	void enterLogical(mylangParser.LogicalContext ctx);
	/**
	 * Exit a parse tree produced by {@link mylangParser#logical}.
	 * @param ctx the parse tree
	 */
	void exitLogical(mylangParser.LogicalContext ctx);
	/**
	 * Enter a parse tree produced by {@link mylangParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(mylangParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link mylangParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(mylangParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link mylangParser#if_then_else}.
	 * @param ctx the parse tree
	 */
	void enterIf_then_else(mylangParser.If_then_elseContext ctx);
	/**
	 * Exit a parse tree produced by {@link mylangParser#if_then_else}.
	 * @param ctx the parse tree
	 */
	void exitIf_then_else(mylangParser.If_then_elseContext ctx);
	/**
	 * Enter a parse tree produced by {@link mylangParser#while}.
	 * @param ctx the parse tree
	 */
	void enterWhile(mylangParser.WhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link mylangParser#while}.
	 * @param ctx the parse tree
	 */
	void exitWhile(mylangParser.WhileContext ctx);
	/**
	 * Enter a parse tree produced by {@link mylangParser#truth_val}.
	 * @param ctx the parse tree
	 */
	void enterTruth_val(mylangParser.Truth_valContext ctx);
	/**
	 * Exit a parse tree produced by {@link mylangParser#truth_val}.
	 * @param ctx the parse tree
	 */
	void exitTruth_val(mylangParser.Truth_valContext ctx);
	/**
	 * Enter a parse tree produced by {@link mylangParser#tabs}.
	 * @param ctx the parse tree
	 */
	void enterTabs(mylangParser.TabsContext ctx);
	/**
	 * Exit a parse tree produced by {@link mylangParser#tabs}.
	 * @param ctx the parse tree
	 */
	void exitTabs(mylangParser.TabsContext ctx);
	/**
	 * Enter a parse tree produced by {@link mylangParser#endls}.
	 * @param ctx the parse tree
	 */
	void enterEndls(mylangParser.EndlsContext ctx);
	/**
	 * Exit a parse tree produced by {@link mylangParser#endls}.
	 * @param ctx the parse tree
	 */
	void exitEndls(mylangParser.EndlsContext ctx);
}