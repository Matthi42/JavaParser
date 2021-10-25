package ast;

import java.util.List;

public class Field {
    List<Modifier> modifiers;
    String identifier;
    Expression expression;

    public Field(List<Modifier> modifiers, String identifier, Expression expression) {
        this.modifiers = modifiers;
        this.identifier = identifier;
        this.expression = expression;
    }

    @Override
    public String toString() {
        return "Field{" +
                "modifiers=" + modifiers.toString() +'\n' +
                ", identifier='" + identifier + '\'' +'\n' +
                ", expression=" + expression.toString() +
                '}';
    }
}
