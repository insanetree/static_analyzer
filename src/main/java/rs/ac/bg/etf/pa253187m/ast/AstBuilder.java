package rs.ac.bg.etf.pa253187m.ast;

import rs.ac.bg.etf.pa253187m.symbols.*;
import rs.ac.bg.etf.pa253187m.KDPParser;
import rs.ac.bg.etf.pa253187m.KDPParserBaseListener;

public class AstBuilder extends KDPParserBaseListener {
    private SymbolTable symbolTable = new SymbolTable();
    @Override 
    public void enterCompilationUnit(KDPParser.CompilationUnitContext ctx) {
        System.out.println("Enter: " + ctx.getText());
    }
    @Override 
    public void exitCompilationUnit(KDPParser.CompilationUnitContext ctx) {
        System.out.println("Exit: " + ctx.getText());
    }
}
