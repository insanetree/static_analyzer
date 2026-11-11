package rs.ac.bg.etf.pa253187m.symbols;

public final class SymbolTable {
  private Scope currentScope = null;

  public SymbolTable() {
    
  }

  public void openScope() {
    Scope newScope = new Scope(currentScope);
    currentScope = newScope;
  }

  public void closeScope() {
    currentScope = currentScope.getEnclosingScope();
  }
}
