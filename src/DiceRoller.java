import java.util.Random;
import java.util.Scanner;

public class DiceRoller {
    static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        Random random = new Random();

        int numOfDiceRolls;
        int sumOfDiceRolls = 0;

        System.out.print("Enter the number of dice rolls: ");
        numOfDiceRolls = scanner.nextInt();

        if (numOfDiceRolls > 0) {

            for (int i = 0; i < numOfDiceRolls; i++){
                int roll = random.nextInt(1, 7);
                printDice(roll);
                System.out.println("You rolled: " + roll);
                sumOfDiceRolls += roll;
            }
            System.out.println("Total of all the dice rolls: " + sumOfDiceRolls);
        }
        else {
            System.out.println("Error. Number of dice must be greater than 0.");
        }
        scanner.close();
    }

    static void printDice(int roll){
        String dice1 = """
                 -------
                |       |
                |   ●   |
                |       |
                 -------
                """;

        String dice2 = """
                 -------
                | ●     |
                |       |
                |     ● |
                 -------
                """;

        String dice3 = """
                 -------
                | ●     |
                |   ●   |
                |     ● |
                 -------
                """;

        String dice4 = """
                 -------
                | ●   ● |
                |       |
                | ●   ● |
                 -------
                """;

        String dice5 = """
                 -------
                | ●   ● |
                |   ●   |
                | ●   ● |
                 -------
                """;

        String dice6 = """
                 -------
                | ●   ● |
                | ●   ● |
                | ●   ● |
                 -------
                """;

        switch(roll) {
            case 1 -> System.out.print(dice1);
            case 2 -> System.out.print(dice2);
            case 3 -> System.out.print(dice3);
            case 4 -> System.out.print(dice4);
            case 5 -> System.out.print(dice5);
            case 6 -> System.out.print(dice6);
            default -> System.out.println("Invalid.");
        }
    }
}

// Declare variables!
// Get number of dice from the user!
// Check if number of dice > 0!
// Roll all the dice!
// Display the sum!
// Display ASCII art of dice!