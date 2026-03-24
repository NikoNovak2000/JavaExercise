import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    static void main(String[] args) {
        String[] choices = {"rock", "paper", "scissors"};
        String userChoice;
        String computerChoice;
        boolean wantsToPlay = true;
        String userPlayAgain;

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Welcome to the classic game of Rock Paper Scissors!");

        while(wantsToPlay){
            System.out.print("Rock, paper or scissors?: ");

            userChoice = scanner.nextLine().toLowerCase().trim();
            if (!userChoice.equals("rock") &&
                    !userChoice.equals("paper") &&
                    !userChoice.equals("scissors")) {
                System.out.println("Invalid choice.");
                continue;
            }

            computerChoice = choices[random.nextInt(3)];
            System.out.println("Computer chooses the " + computerChoice + "!");

            if (userChoice.equals(computerChoice)) {
                System.out.println("It's a tie!");
            } else if (userChoice.equals("rock") && computerChoice.equals("scissors") ||
                    userChoice.equals("scissors") && computerChoice.equals("paper") ||
                    userChoice.equals("paper") && computerChoice.equals("rock")) {
                System.out.println("You win!");
            } else {
                System.out.println("You lose!");
            }

            System.out.print("Do you want to play again or exit? ");
            userPlayAgain = scanner.nextLine().toLowerCase().trim();

            if(userPlayAgain.equals("yes")){
                continue;
            }
            else {
                System.out.println("Thank you for playing. Goodbye!");
                break;
            }
        }
        scanner.close();
    }
}
// rules
// rock wins scissors, loses to paper
// scissors wins paper, loses to rock
// paper wins rock, loses to scissors