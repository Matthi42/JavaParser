package ast;

import kotlin.Pair;
import one.util.streamex.EntryStream;
import syb4j.Sealed;
import syb4j.Case;

import java.util.List;
import java.util.stream.Collectors;

@Sealed
public class Statement extends ASTA{
    @Case
    static class Block {
        List<Statement> stmts;
    }
    @Case
    static class JReturn {
        Expression expr;
    }
    @Case
    static class JWhile {
        Expression condition;
        Statement block;
    }
    @Case
    static class Assign {
        String identifier;
        Expression expression;
    }
    @Case
    static class JIf {
        Expression condition;
        Statement block, elseBlock;
        List<Pair<Expression,Statement>> elseifBlocks;
    }
    @Case
    static class LocalVarDeclaration {
        String type, Identifier;
    }
    @Case
    static class StatementExpressionC{
        StatementExpression statementExpression;
    }
    @Case
    static class Empty {}

    @Override
    public String toString() {
        return match(
                (Block block) -> block.stmts.stream().map(Statement::toString)
                        .collect(Collectors.joining(";\n", "[\n", "]\n")),
                (JReturn ret) -> ret.expr == null ? "return;" : "return " + ret.expr,
                (JWhile jWhile) -> "WhileStatement"+jWhile.condition.toString() + jWhile.block.toString()+"",
                (Assign as) -> "assignage" + "identifier" + as.identifier + "expression" + as.expression.toString(),
                (JIf i) -> "condition: " + i.condition.toString()
                        + "if-block: " + i.block.toString()
                        + (i.elseifBlocks != null?
                        EntryStream.of(i.elseifBlocks).mapKeyValue((index, pair) ->
                                "else-if-block " + index + ":{\n" + "condition: " + pair.getFirst().toString()
                                + "block: " +pair.getSecond().toString()
                        ).collect(Collectors.joining(", ","elseIfBlocks:[ ","]")) : "" )
                        + "else-block: " + i.elseBlock.toString(),
                (LocalVarDeclaration lvd) -> "localVariableDeclaration: " + lvd.type + " " +lvd.Identifier,
                (StatementExpressionC sec) -> "StatmentExpression: " + sec,
                (Empty e) -> "Empty Statement"
        );
    }



    public static void main(String[] args) {
        Statement block = Block(List.of(
                JReturn(null),
                Assign("i", Expression.IntLiteral(12)),
                Assign("o", Expression
                        .binaryExpression(Expression.IntLiteral(1),Expression.IntLiteral(3), BinaryOperator.PLUS))
        ));
        System.out.println(block);
    }
}

