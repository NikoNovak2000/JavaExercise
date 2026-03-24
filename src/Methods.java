import java.sql.SQLOutput;
import java.util.Scanner;

public class Methods {
    static void main(String[] args) {
        String name = "Schmidt";
        int age = 30;
        int newAge = 0;

        Scanner scanner = new Scanner(System.in);

        singHappyBirthday(name, age);

        System.out.println(square(3));
        System.out.println(square(age));

        System.out.println(cube(3));

        String newName = getInfo(scanner, "What is your first name?");
        String newSurname = getInfo(scanner, "What is your last name?");

        String fullName = getFullName(newName, newSurname);

        System.out.println("What is your age " + fullName + "?");
        newAge = scanner.nextInt();
        if(ageCheck(newAge)) {
            System.out.println("Congrats " + fullName + " you are eligible for a credit card.");
        }
        else {
            System.out.println("You must be 18+ to sign up!");
        }
    }
    static void singHappyBirthday(String name, int age){
        System.out.println("Happy birthday to you!");
        System.out.printf("Happy birthday dear %s!\n", name);
        System.out.printf("You are %d years old!\n", age);
        System.out.println("Happy birthday to you!");
    }

    static double square (double number) {
        return number * number;
    }

    static double cube(double number) {
        return number * number * number;
    }

    static String getFullName(String first, String last) {
        return first + " " + last;
    }

    static boolean ageCheck(int age){
        if(age >= 18){
            return true;
        }
        else {
            return false;
        }
    }

    static String getInfo(Scanner scanner, String question){
        System.out.println(question);
        return scanner.nextLine().trim();
    }
}