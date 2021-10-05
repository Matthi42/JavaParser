package ast;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class AST implements Node{
    private ArrayList<Class> classes;

    public AST(ArrayList<Class> classes) {
        this.classes = classes;
    }

    public ArrayList<Class> getClasses() {
        return classes;
    }

    public void setClasses(ArrayList<Class> classes) {
        this.classes = classes;
    }

    @Override
    public String toString(){
        return "File{" +
                this.classes.stream().map(aClass -> aClass.toString() + "; ").collect(Collectors.joining());
    }
}
