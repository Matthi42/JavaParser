package ast;

import java.util.List;
import java.util.stream.Collectors;


public class JClass{
    List<Modifier> modifiers;
    String identifier;
    List<Field> fields;
    List<Method> methods;

    public JClass(List<Modifier> modifiers, String identifier, List<Field> fields, List<Method> methods) {
        this.modifiers = modifiers;
        this.identifier = identifier;
        this.fields = fields;
        this.methods = methods;
    }

    @Override
    public String toString() {
        return "Class{\n" +
                "identifier: ( " + identifier + " )\n"
                + modifiers.stream().map(Modifier::toString)
                .collect(Collectors.joining(", ","modifiers:[ "," ]\n"))
                + fields.stream().map(Field::toString)
                .collect(Collectors.joining("","",""))
                + methods.stream().map(Method::toString)
                .collect(Collectors.joining("","",""))
                + '}';
    }
}
