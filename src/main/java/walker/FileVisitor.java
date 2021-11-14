package walker;

import ast.*;
import parser.javaBaseVisitor;
import parser.javaParser;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class FileVisitor extends javaBaseVisitor<ASTA> {
    @Override
    public AST visitFile(javaParser.FileContext ctx) {
        return  new AST(ctx.jClass().stream().map(this::visitJClass).collect(Collectors.toList()));
    }

    @Override
    public JClass visitJClass(javaParser.JClassContext ctx) {

        javaParser.ModifyerContext modifyerContext = ctx.modifyer();
        List<Modifier> modifiers=new ArrayList<>();
        if(modifyerContext.PUBLIC() != null)
            modifiers.add(Modifier.PUBLIC);
        if(modifyerContext.PRIVATE() != null)
            modifiers.add(Modifier.PRIVATE);
        if(modifyerContext.STATIC() != null)
            modifiers.add(Modifier.STATIC);
        visitModifyer(ctx.modifyer());

        return new JClass(
                modifiers,
                ctx.Identifyer().getText(),
                ctx.attributeOrMethod().stream().map(aom -> visitAttribute(aom.attribute())).filter(Objects::nonNull)
                        .collect(Collectors.toList()),
                ctx.attributeOrMethod().stream().map(aom -> visitMethod(aom.method())).filter(Objects::nonNull)
                        .collect(Collectors.toList())
        );
    }

    @Override
    public Field visitAttribute(javaParser.AttributeContext ctx) {
        if(ctx == null)
            return null;

        String type = null;
        if(ctx.type().BOOLEAN() != null)
            type = "boolean";
        if(ctx.type().CHAR() != null)
            type = "char";
        if(ctx.type().FLOAT() != null)
            type = "float";
        if(ctx.type().CustomType() != null)
            type = ctx.type().CustomType().getText();
        if(ctx.type().INT() != null)
            type = "int";

        javaParser.ModifyerContext modifyerContext = ctx.modifyer();
        List<Modifier> modifiers=new ArrayList<>();
        if(modifyerContext.PUBLIC() != null)
            modifiers.add(Modifier.PUBLIC);
        if(modifyerContext.PRIVATE() != null)
            modifiers.add(Modifier.PRIVATE);
        if(modifyerContext.STATIC() != null)
            modifiers.add(Modifier.STATIC);
        visitModifyer(ctx.modifyer());

        return new Field(
                modifiers,
                ctx.Identifyer().getText(),
                visitExpression(ctx.expression()),
                type
        );
    }

    @Override
    public Method visitMethod(javaParser.MethodContext ctx) {
        if(ctx == null)
            return null;

        String type = null;
        if(ctx.metodType().VOID() != null)
            type = "void";
        else{
            if(ctx.metodType().type().BOOLEAN() != null)
                type = "boolean";
            if(ctx.metodType().type().CHAR() != null)
                type = "char";
            if(ctx.metodType().type().FLOAT() != null)
                type = "float";
            if(ctx.metodType().type().CustomType() != null)
                type = ctx.metodType().type().CustomType().getText();
            if(ctx.metodType().type().INT() != null)
                type = "int";
        }

        javaParser.ModifyerContext modifyerContext = ctx.modifyer();
        List<Modifier> modifiers=new ArrayList<>();
        if(modifyerContext.PUBLIC() != null)
            modifiers.add(Modifier.PUBLIC);
        if(modifyerContext.PRIVATE() != null)
            modifiers.add(Modifier.PRIVATE);
        if(modifyerContext.STATIC() != null)
            modifiers.add(Modifier.STATIC);
        visitModifyer(ctx.modifyer());

        return new Method(
                ctx.Identifyer().getText(),
                type,
                modifiers,
                new ArrayList<>(),
                Statement.Empty()
        );
    }

    @Override
    public Expression visitExpression(javaParser.ExpressionContext ctx) {
        if(ctx == null)
            return null;
        if(ctx.Identifyer() != null)
            return Expression.Identifier(ctx.Identifyer().getText());
        if(ctx.binaryOperator() != null)
            if(ctx.literal().CharLiteral() != null)
                ctx.literal().BooleanLiteral();
        ctx.literal().FloatLiteral();
        ctx.literal().NullLiteral();

        return Expression.CharLiteral('c');
    }
}
