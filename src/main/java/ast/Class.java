package ast;

public class Class implements Node{
    private String identifier;

    public Class(String identifier) {
        this.identifier = identifier;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    @Override
    public String toString() {
        return "Class{" +
                "identifier='" + identifier + '\'' +
                '}';
    }
}
