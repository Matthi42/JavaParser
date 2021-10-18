package walker;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.misc.Interval;
import org.antlr.v4.runtime.tree.ParseTree;
import parser.javaLexer;
import parser.javaParser;

import java.io.IOException;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("test1");
        parse();
    }

    public static void parse() throws IOException {
        System.out.println("test");
        CharStream input = CharStreams.fromPath(Path.of("src/main/java/TestClass2.java"));
        System.out.println(input.getText(Interval.of(0,1)));
        javaLexer lexer = new javaLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        javaParser parser = new javaParser(tokens);
        javaParser.FileContext tree = parser.file();

        System.out.println(tree);





    }

}
