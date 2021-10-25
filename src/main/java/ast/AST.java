package ast;

import java.util.List;
import java.util.stream.Collectors;

public class AST {
    List<JClass> classes;

    public AST(List<JClass> classes){
        this.classes=classes;
    }

    @Override
    public String toString(){
        return classes.stream().map(JClass::toString).collect(Collectors
                .joining(";\n", "Java File:[\n", "]\n"));
    }
}
