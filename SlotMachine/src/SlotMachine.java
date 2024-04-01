import java.util.List;

public class SlotMachine {
    private List<Reel> reels;
    private int balance;

    public SlotMachine(List<Reel> reels, int initialBalance)
    {
        this.reels = reels;
        this.balance = initialBalance;
    }

    public void spin()
    {
        if(hasSufficientFunds(1))
        {
            deductFromBalance(1);
            Symbol[] result = new Symbol[reels.size()];

            for(int i = 0; i < reels.size(); i++)
            {
                result[i] = reels.get(i).spin();
            }
            displayResult(result);
        }else
        {
            System.out.println("Insufficient funds. Please add credits.");
        }
    }

    public boolean hasSufficientFunds(int betAmount)
    {
        return balance >= betAmount;
    }

    public void deductFromBalance(int amount)
    {
        balance -= amount;
    }

    public void displayResult(Symbol[] result)
    {
        StringBuilder sb = new StringBuilder("Result: ");
        for(Symbol symbol : result)
        {
            sb.append(symbol.getName()).append(" ");
        }

        System.out.println(sb.toString());
    }
}
