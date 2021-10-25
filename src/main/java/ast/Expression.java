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
        BinaryOperator op;
    }

    @Override
    public String toString(){
        return match(
                (StringLiteral sl) -> "StringLiteral:( " + sl.literal + " )\n",
                (BooleanLiteral bl) -> "BooleanLiteral:( " +bl.literal + " )\n",
                (CharLiteral cl) -> "CharLiteral:( " + cl.literal + " )\n",
                (IntLiteral il) -> "IntLiteral:( " + il.literal + " )\n",
                (Identifier id) -> "Identifier:( " + id.identifier + " )\n",
                (binaryExpression be) -> "BinaryExpression:{\n" + "Exp1:{\n\t" + be.first.toString() + "}\nExp2:{\n\t" +
                        be.second.toString() + "}\nOperator:( " + be.op.toString() + " )\n}\n"
        );
    }


}

