package rs.ac.bg.etf.pa253187m;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.IOException;
import java.nio.file.Path;

public class Main {

  public static void main(String[] args) {

    if (args.length != 1) {
      System.err.println("No parameter supplied");
      System.exit(1);
    }

    Path path = Path.of(args[0]);

    CharStream input = null;
    try {
      input = CharStreams.fromPath(path);
    } catch (IOException e) {
      System.err.println("Error when opening a file " + args[0]);
      System.exit(1);
    }

    KDPLexer lexer = new KDPLexer(input);
    CommonTokenStream tokens = new CommonTokenStream(lexer);

    KDPParser parser = new KDPParser(tokens);
    KDPParser.CompilationUnitContext ctx = parser.compilationUnit();
    System.out.println(ctx.getChildCount());
  }
}
