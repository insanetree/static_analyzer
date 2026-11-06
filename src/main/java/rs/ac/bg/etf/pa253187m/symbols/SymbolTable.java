package rs.ac.bg.etf.pa253187m.symbols;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public final class SymbolTable {
    private final SymbolTable enclosingScope;
    private final Map<String, Symbol> symbols = new HashMap<>();

    public SymbolTable() {
        this(null);
    }

    private SymbolTable(SymbolTable enclosingScope) {
        this.enclosingScope = enclosingScope;
    }

    public SymbolTable createChildScope() {
        return new SymbolTable(this);
    }

    public SymbolTable enclosingScope() {
        return enclosingScope;
    }

    public boolean define(String name, Symbol symbol) {
        Objects.requireNonNull(name, "name");
        Objects.requireNonNull(symbol, "symbol");
        return symbols.putIfAbsent(name, symbol) == null;
    }

    public Symbol lookupLocal(String name) {
        return symbols.get(name);
    }

    public Symbol lookup(String name) {
        Symbol symbol = lookupLocal(name);
        if (symbol != null || enclosingScope == null) {
            return symbol;
        }
        return enclosingScope.lookup(name);
    }
}
