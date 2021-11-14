package ast;

import kotlin.Pair;
import one.util.streamex.EntryStream;

import java.util.List;
import java.util.stream.Collectors;

public class Method extends ASTA{
    String identifier, type;
    List<Modifier> modifiers;
    List<Pair<String,String>> parameters;
    Statement statement;

    public Method(String identifier, String type, List<Modifier> modifiers, List<Pair<String, String>> parameters, Statement statement) {
        this.identifier = identifier;
        this.type = type;
        this.modifiers = modifiers;
        this.parameters = parameters;
        this.statement = statement;
    }

    @Override
    public String toString(){
        return "Method: {"
                + "Identifier: '" + this.identifier + "'"
                + "Type: '" + this.type +"'"
                + this.modifiers.stream().map(Modifier::toString)
                    .collect(Collectors.joining(", ","Modifiers: '","'\n"))
                + (this.parameters.size() == 0 ? "no Parameters" : EntryStream.of(this.parameters).mapKeyValue((index, parameter) ->
                        "parameter " + index + ": {type :" + parameter.getFirst() + ", name:" +parameter.getSecond() + "}")
                    .collect(Collectors.joining("","","")))
                + this.statement.toString()
                + "}\n";
    }
}
