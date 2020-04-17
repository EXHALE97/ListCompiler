import gen.GrammarLexer;
import gen.GrammarParser;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            ANTLRInputStream input = new ANTLRFileStream("D:\\yapis\\ListCompiler\\src\\test\\file1.txt");
            GrammarLexer lexer = new GrammarLexer(input);
            GrammarParser parser = new GrammarParser(new CommonTokenStream(lexer));
            ParseTree tree = parser.program();
            CompilerVisitor visitor = new CompilerVisitor();
            String output = (String) visitor.visit(tree);

            FileWriter fileWriter = new FileWriter("Program.java");
            fileWriter.write(output);
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}