package ast;

import kotlin.Pair;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import ast.Expression;

class ExpressionTest {
    @Test
    public void ex(){
        Expression ex_1 = Expression.BooleanLiteral(false);
        Expression ex_2 =
                Expression.binaryExpression(
                        Expression.IntLiteral(1),
                        Expression.Identifier("a"),
                        BinaryOperator.MINUS);
        Expression ex_3 =
                Expression.binaryExpression(
                        Expression.IntLiteral(1),
                        Expression.binaryExpression(
                                Expression.IntLiteral(1),
                                Expression.IntLiteral(42),
                                BinaryOperator.MINUS
                        ),
                        BinaryOperator.MINUS);


        System.out.println(ex_1);
        System.out.println(ex_2);
        System.out.println(ex_3);

    }

}