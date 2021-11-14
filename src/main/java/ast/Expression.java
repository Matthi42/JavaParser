package ast;

import syb4j.Case;
import syb4j.Sealed;

@Sealed
public class Expression extends ASTA{
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
    @Case
    static class UnaryExpression {
        UnaryOperator op;
        Expression expr;
    }
    @Case
    static class JThis {}
    @Case
    static class LocalOrFieldVar {
        String identifier;
    }
    @Case
    static class JNull {}


    @Override
    public String toString(){
        return match(
                (BooleanLiteral bl) -> "BooleanLiteral:( " +bl.literal + " )\n",
                (CharLiteral cl) -> "CharLiteral:( " + cl.literal + " )\n",
                (IntLiteral il) -> "IntLiteral:( " + il.literal + " )\n",
                (Identifier id) -> "Identifier:( " + id.identifier + " )\n",
                (binaryExpression be) -> "BinaryExpression:{\n" + "Exp1:{\n\t" + be.first.toString() + "}\nExp2:{\n\t" +
                        be.second.toString() + "}\nOperator:( " + be.op.toString() + " )\n}\n",
                (UnaryExpression ue) -> "UnaryExpression:",
                (JThis) -> "this",
                (LocalOrFieldVar var) -> "localOrFieldVar:" + var.identifier,
                (JNull jNull) -> "null"
        );
    }


}

