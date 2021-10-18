package ast;

import org.junit.jupiter.api.Test;

import java.util.List;

import static ast.Statement.*;


class StatementTest {

    @Test
    public void asd() {
        Statement block = Block(List.of(
                JReturn(null)
        ));

        System.out.println(block);

    }
}