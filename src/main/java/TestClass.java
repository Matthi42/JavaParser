import ast.AST;
import ast.Class;
import ast.Node;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestClass {

    int i = 0;
    float iugjg = 1.f;
    private char d;

    public static void main(String[] args) {

        Node ast = new AST(new ArrayList<>(List.of(new Class("hi"),new Class("otherClass"))));
        System.out.println(ast);

        //System.out.println(4.5f&2.3f);
    }



    void ah(int d, int s){
        while(d >10)
            for (int a = 0, j = 0; j < 30; j++,a--)
                if(true)
                    i*=8;

    }
}
