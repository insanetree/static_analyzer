package rs.ac.bg.etf.pa253187m.symbols;

public class Symbol {
    public enum SymbolType {
        PROCESS,
        LOCK
    }

    private final SymbolType type;
    private final String name;
    private final int id;
    private static int nextId = 0;
    
    public Symbol(SymbolType type, String name) {
        this.type = type;
        this.name = name;
        this.id = ++nextId;
    }
    
    public SymbolType getType() {
        return type;
    }
    
    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Symbol symbol = (Symbol) obj;
        return id == symbol.id && type == symbol.type && name.equals(symbol.name);
    }
    
    public int getId() {
        return id;
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(type, name);
    }
    
    @Override
    public String toString() {
        return "Symbol{" +
                "type=" + type +
                ", name='" + name + '\'' +
                '}';
    }
}
