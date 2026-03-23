import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        String input = "";

        Scanner scanner = new Scanner(System.in);

        while (!input.equals("quit")){
            System.out.println("Input: ");
            input = scanner.next().toLowerCase();
            if (!input.equals("quit")){
                System.out.println(input);
            }
        }

        do {
            System.out.println("Input: ");
            input = scanner.next().toLowerCase();
            if (input.equals("quit")){
               break;
            }
            System.out.println(input);
        } while (!input.equals("quit"));
    }
}