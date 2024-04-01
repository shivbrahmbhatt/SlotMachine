import java.util.List;
import java.util.Random;

public class Reel {
    private List<Symbol> symbols;

    public Reel(List<Symbol> symbols)
    {
        this.symbols = symbols;
    }

    public Symbol spin()
    {
        Random random = new Random();
        return symbols.get(random.nextInt(symbols.size()));
    }
}
