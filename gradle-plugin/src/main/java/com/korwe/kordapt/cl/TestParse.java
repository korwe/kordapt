package com.korwe.kordapt.cl;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.apache.tools.ant.filters.StringInputStream;

import java.io.IOException;

/**
 * @author <a href="mailto:tjad.clark@korwe.com>Tjad Clark</a>
 */
public class TestParse {


    public static void main(String[] args) throws IOException {
        ANTLRInputStream stream = new ANTLRInputStream(new StringInputStream("myService Integer:myFunction(Hello world, String param) Boolean:secondFunction() void:thirdFunction() java.util.List<my.local.List<my.local.String>>:genericFunction()"));

        KordaptCLLexer lexer = new KordaptCLLexer(stream);

        org.antlr.v4.runtime.CommonTokenStream tokens =  new org.antlr.v4.runtime.CommonTokenStream(lexer);
        KordaptCLParser parser = new KordaptCLParser(tokens);
        ParseTreeWalker walker = new ParseTreeWalker();
        KordaptCLImpl impl = new KordaptCLImpl();
        walker.walk(impl, parser.service());

    }
}
