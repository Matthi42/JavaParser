// Generated from C:/Users/matth/IdeaProjects/JavaParser/src/main\java.g4 by ANTLR 4.9.1
package parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link javaParser}.
 */
public interface javaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link javaParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(javaParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(javaParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(javaParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(javaParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#binaryOperator}.
	 * @param ctx the parse tree
	 */
	void enterBinaryOperator(javaParser.BinaryOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#binaryOperator}.
	 * @param ctx the parse tree
	 */
	void exitBinaryOperator(javaParser.BinaryOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#unaryOperator}.
	 * @param ctx the parse tree
	 */
	void enterUnaryOperator(javaParser.UnaryOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#unaryOperator}.
	 * @param ctx the parse tree
	 */
	void exitUnaryOperator(javaParser.UnaryOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(javaParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(javaParser.FileContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#jClass}.
	 * @param ctx the parse tree
	 */
	void enterJClass(javaParser.JClassContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#jClass}.
	 * @param ctx the parse tree
	 */
	void exitJClass(javaParser.JClassContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#attributeOrMethod}.
	 * @param ctx the parse tree
	 */
	void enterAttributeOrMethod(javaParser.AttributeOrMethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#attributeOrMethod}.
	 * @param ctx the parse tree
	 */
	void exitAttributeOrMethod(javaParser.AttributeOrMethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterAttribute(javaParser.AttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitAttribute(javaParser.AttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#statment}.
	 * @param ctx the parse tree
	 */
	void enterStatment(javaParser.StatmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#statment}.
	 * @param ctx the parse tree
	 */
	void exitStatment(javaParser.StatmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(javaParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(javaParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void enterVarDecl(javaParser.VarDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void exitVarDecl(javaParser.VarDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#assinage}.
	 * @param ctx the parse tree
	 */
	void enterAssinage(javaParser.AssinageContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#assinage}.
	 * @param ctx the parse tree
	 */
	void exitAssinage(javaParser.AssinageContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#forLoop}.
	 * @param ctx the parse tree
	 */
	void enterForLoop(javaParser.ForLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#forLoop}.
	 * @param ctx the parse tree
	 */
	void exitForLoop(javaParser.ForLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#whileLoop}.
	 * @param ctx the parse tree
	 */
	void enterWhileLoop(javaParser.WhileLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#whileLoop}.
	 * @param ctx the parse tree
	 */
	void exitWhileLoop(javaParser.WhileLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#elseIfStatment}.
	 * @param ctx the parse tree
	 */
	void enterElseIfStatment(javaParser.ElseIfStatmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#elseIfStatment}.
	 * @param ctx the parse tree
	 */
	void exitElseIfStatment(javaParser.ElseIfStatmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#elseStatment}.
	 * @param ctx the parse tree
	 */
	void enterElseStatment(javaParser.ElseStatmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#elseStatment}.
	 * @param ctx the parse tree
	 */
	void exitElseStatment(javaParser.ElseStatmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(javaParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(javaParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#method}.
	 * @param ctx the parse tree
	 */
	void enterMethod(javaParser.MethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#method}.
	 * @param ctx the parse tree
	 */
	void exitMethod(javaParser.MethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(javaParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(javaParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#modifyer}.
	 * @param ctx the parse tree
	 */
	void enterModifyer(javaParser.ModifyerContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#modifyer}.
	 * @param ctx the parse tree
	 */
	void exitModifyer(javaParser.ModifyerContext ctx);
	/**
	 * Enter a parse tree produced by {@link javaParser#metodType}.
	 * @param ctx the parse tree
	 */
	void enterMetodType(javaParser.MetodTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link javaParser#metodType}.
	 * @param ctx the parse tree
	 */
	void exitMetodType(javaParser.MetodTypeContext ctx);
}