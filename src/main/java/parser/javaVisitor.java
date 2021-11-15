// Generated from C:/Users/matth/IdeaProjects/JavaParser/src/main\java.g4 by ANTLR 4.9.1
package parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link javaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface javaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link javaParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(javaParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(javaParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#binaryOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryOperator(javaParser.BinaryOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#unaryOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryOperator(javaParser.UnaryOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#file}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile(javaParser.FileContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#jClass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJClass(javaParser.JClassContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#attributeOrMethod}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributeOrMethod(javaParser.AttributeOrMethodContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute(javaParser.AttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#statment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatment(javaParser.StatmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(javaParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#varDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDecl(javaParser.VarDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#assinage}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssinage(javaParser.AssinageContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#forLoop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForLoop(javaParser.ForLoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#whileLoop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileLoop(javaParser.WhileLoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#elseIfStatment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseIfStatment(javaParser.ElseIfStatmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#elseStatment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseStatment(javaParser.ElseStatmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(javaParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#method}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod(javaParser.MethodContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(javaParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#modifyer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModifyer(javaParser.ModifyerContext ctx);
	/**
	 * Visit a parse tree produced by {@link javaParser#metodType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMetodType(javaParser.MetodTypeContext ctx);
}