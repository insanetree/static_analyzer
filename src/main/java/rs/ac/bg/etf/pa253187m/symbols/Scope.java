package rs.ac.bg.etf.pa253187m.symbols;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

public class Scope {
  private Map<String, Symbol> hashTable = new LinkedHashMap<>();
  private final Scope enclosingScope;

  public Scope(Scope enclosingScope) {
    this.enclosingScope = enclosingScope;
  }

  public void define(String name, Symbol sym) {
    Objects.requireNonNull(name, "name");
    Objects.requireNonNull(sym, "sym");
    hashTable.put(name, sym);
  }

  public Symbol lookupLocal(String name) {
    return hashTable.get(name);
  }

  public Symbol lookup(String name) {
    Symbol local = lookupLocal(name);
    if (local != null || enclosingScope == null) {
      return local;
    }
    return enclosingScope.lookup(name);
  }

}
