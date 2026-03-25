package OOP.ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static void main(String[] args){

        try(Scanner scanner = new Scanner(System.in)){
            System.out.println("Enter a number: ");
            int number = scanner.nextInt();
            System.out.println(number);
        }
        catch(ArithmeticException arithmeticException){
            System.out.println("You can't divide by zero!!! " + arithmeticException);
        }
        catch(InputMismatchException inputMismatchException){
            System.out.println("You can't enter words, try numbers instead!!! " + inputMismatchException);
        }
        catch(Exception e){
            System.out.println("Something went wrong!");
        }
        finally{ // optional, block of code inside finally executes no matter what at the end
            System.out.println("Always executes");
        }

    }
}

// Exception = An event that interrupts the normal flow of a program
// Dividing by zero, file not found, mismatch input type
// Surround any dangerous code with a try{} block
// try{}, catch{}, finally{}