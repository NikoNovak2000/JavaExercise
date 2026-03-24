import java.sql.SQLOutput;
import java.util.Scanner;

public class BankingProgram {
    public static void main(String []args) {
        Scanner scanner = new Scanner(System.in);
        boolean isRunning = true;
        int choice = 0;
        double balance = 500F;

        seperateStuff();
        System.out.println("BANKING APP");
        seperateStuff();

        while (isRunning) {
            showUserOptions();
            System.out.print("Enter a number(1-4) for the chosen action: ");
            choice = scanner.nextInt();

            switch(choice){
                case 1:
                    seperateStuff();
                    showBalance(balance);
                    seperateStuff();
                    continue;
                case 2:
                    seperateStuff();
                    balance = Deposit(scanner, balance);
                    seperateStuff();
                    continue;
                case 3:
                    seperateStuff();
                    balance = Withdraw(scanner, balance);
                    seperateStuff();
                    continue;
                case 4:
                    isRunning = false;
                    break;
                default:
                    System.out.println("Error. Please choose a number between 1-4:");
            }
        }

        seperateStuff();
        System.out.println("BANKING APP - Thank you and goodbye!");
        scanner.close();
    }

    static void seperateStuff() {
        System.out.println("************");
    }

    static void showUserOptions() {
        System.out.println("1. Show balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");
        seperateStuff();
    }

    static void showBalance(double balance) {
        System.out.println("Your balance is: " + balance);
    }

    static double Deposit(Scanner scanner, double balance){
        System.out.println("Amount of money you want to deposit?");
        double depositAmount = scanner.nextDouble();

        if (depositAmount <= 0) {
            System.out.println("Error. Can not deposit negative or no amount.");
            return balance;
        }

        balance += depositAmount;
        showBalance(balance);

        return balance;
    }

    static double Withdraw (Scanner scanner, double balance) {
        System.out.println("Amount of money you want to withdraw?");
        double withdrawAmount = scanner.nextDouble();

        if (withdrawAmount > balance) {
            System.out.println("Error. Can not withdraw more than you have.");
            return balance;
        }

        balance -= withdrawAmount;
        showBalance(balance);

        return balance;
    }
}


// Declare Variables!
// Display Menu!
// Get and process Users choice!
// showBalance()!
// deposit()!
// withdraw()!
// Exit message!