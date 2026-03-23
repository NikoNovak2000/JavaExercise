import java.util.Scanner;

public class FizzBuzz {
    public static void main(String []args) {
        int number;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        number = scanner.nextInt();

        if (number % 5 == 0 && number % 3 == 0){
            System.out.println("FizzBuzz");
        }
        else if (number % 5 == 0){
            System.out.println("Fizz");
        }
        else if (number % 3 == 0){
            System.out.println("Buzz");
        }
        else {
            System.out.println(number);
        }
    }
}

// Enter a number
// if it is divisible by 5 --> Fizz
// if it is divisible by 3 --> Buzz
// if it is divisible by 5 and 3 --> FizzBuzz
// if it is not divisible by 5 or 3 --> get back the number