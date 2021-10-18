package ast;

import syb4j.Case;
import syb4j.Sealed;

@Sealed
public class Expression {
    @Case
    static class StringLiteral {
        String literal;
    }
    @Case
    static class BooleanLiteral {
        boolean literal;
    }
    @Case
    static class CharLiteral {
        char literal;
    }
    @Case
    static class  IntLiteral {
        int literal;
    }
    @Case
    static class Identifier{
        String identifier;
    }
    @Case
    static class binaryExpression {
        Expression first, second;
        Operator op;
    }

    @Override
    public String toString(){
        return match(
                (StringLiteral sl) -> "StringLiteral: " + sl.literal,
                (BooleanLiteral bl) -> "BooleanLiteral: " +bl.literal,
                (CharLiteral cl) -> "CharLiteral: " + cl.literal,
                (IntLiteral il) -> "IntLiteral: " + il.literal,
                (Identifier id) -> "Identifier: " + id.identifier,
                (binaryExpression be) -> "BinaryExpression" + "first: " + be.first.toString() + "second: " +
                        be.second.toString() + "Operator" + be.op.toString()
        );
    }


}

