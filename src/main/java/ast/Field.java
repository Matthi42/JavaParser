package ast;

import java.util.List;

public class Field extends ASTA{
    List<Modifier> modifiers;
    String type, identifier;
    Expression expression;

    public Field(List<Modifier> modifiers, String identifier, Expression expression, String type) {
        this.modifiers = modifiers;
        this.identifier = identifier;
        this.expression = expression;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Field{" +
                "modifiers=" + modifiers.toString() +'\n' +
                ", identifier='" + identifier + '\'' +'\n' +
                ( expression == null ? ""  : ", expression=" + expression )+
                '}';
    }
}
