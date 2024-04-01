import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Symbol cherry = new Symbol("\uD83C\uDF52", 5);
        Symbol bell = new Symbol("\uD83D\uDD14", 10);

        Reel reel1 = new Reel(Arrays.asList(cherry, bell));
        Reel reel2 = new Reel(Arrays.asList(cherry, bell));
        Reel reel3 = new Reel(Arrays.asList(cherry, bell));

        List<Reel> reels = Arrays.asList(reel1, reel2, reel3);
        SlotMachine slotMachine = new SlotMachine(reels, 100);

        Scanner scanner = new Scanner(System.in);
        while(true)
        {
            System.out.println("Enter 'spin' to spin the reels, or 'exit' to quit:");
            String input = scanner.nextLine();

            if(input.equalsIgnoreCase("spin"))
            {
                slotMachine.spin();
            } else if (input.equalsIgnoreCase("exit"))
            {
                System.out.println("Exiting game. Thanks for playing!");
                break;
            }else
            {
                System.out.println("Invalid input. Please try again.");
            }
        }
        scanner.close();
    }
}