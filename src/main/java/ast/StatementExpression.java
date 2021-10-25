package ast;

import syb4j.Case;
import syb4j.Sealed;

import java.util.List;
import java.util.stream.Collectors;

@Sealed
public class StatementExpression {
    @Case
    static class Assign{
        Expression assignee, assignige;
    }
    @Case
    static class JNew{
        String jClass;
        List<Expression> parameters;
    }
    @Case
    static class MethodCall{
        Expression object;
        String methodName;
        List<Expression> parameters;
    }

    @Override
    public String toString(){
        return match(
                (Assign a) -> a.assignee.toString() + a.assignige.toString(),
                (JNew n) -> n.jClass + n.parameters.stream().map(Expression::toString)
                        .collect(Collectors.joining(",\n","Parameters:{\n","}\n")),
                (MethodCall mc) -> mc.methodName + mc.object.toString() + mc.parameters.stream().map(Expression::toString)
                        .collect(Collectors.joining(",\n","Parameters:{\n","}\n"))
        );
    }
}
