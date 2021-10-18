package ast;

import syb4j.Sealed;
import syb4j.Case;

import java.util.List;
import java.util.stream.Collectors;

@Sealed
public class Statement {
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
    static class Assing {
        String identifier;
        Expression expression;
    }
/*
    @Case
    static class JIf {
        Expression condition;
        Statement block, elseBlock;
    }*/

    @Override
    public String toString() {
        return match(
                (Block block) -> block.stmts.stream().map(Statement::toString)
                        .collect(Collectors.joining(";\n", "{\n", "}\n")),
                (JReturn ret) -> ret.expr == null ? "return;" : "return " + ret.expr.toString(),
                (JWhile jWhile) -> "WhileStatement"+jWhile.condition.toString() + jWhile.block.toString()+"",
                (Assing as) -> "assignage" + "identifier" + as.identifier + "expression" + as.expression.toString()
        );
    }



    public static void main(String[] args) {
        Statement block = Block(List.of(
                JReturn(null),
                Assing("i", Expression.IntLiteral(12)),
                Assing("o", Expression.binaryExpression(Expression.IntLiteral(1),Expression.IntLiteral(3),Operator.PLUS))
        ));

        System.out.println(block);
    }
}

