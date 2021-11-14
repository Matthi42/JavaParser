package walker;

import ast.ASTA;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import parser.javaLexer;
import parser.javaParser;

import java.io.IOException;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) throws IOException {
        parse();
    }

    public static void parse() throws IOException {
        CharStream input = CharStreams.fromPath(Path.of("src/main/java/FieldAndMethod.java"));
        javaLexer lexer = new javaLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        javaParser parser = new javaParser(tokens);
        javaParser.FileContext tree = parser.file();

        FileVisitor fv = new FileVisitor();
        ASTA parseTree = fv.visitFile(tree);
        System.out.println(parseTree);



        System.out.println("test");


    }

}
