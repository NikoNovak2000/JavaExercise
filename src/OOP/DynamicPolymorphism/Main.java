package OOP.DynamicPolymorphism;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Animal animal;
        int choice;

        System.out.print("Would you like a dog or a cat sound? (1 = dog, 2 = cat): ");
        choice = scanner.nextInt();

        if(choice == 1){
            animal = new Dog();
            animal.speak();
        }
        else if (choice == 2) {
            animal = new Cat();
            animal.speak();
        }
        else {
            System.out.println("Error. Invalid choice.");
        }
    }
}

// Runtime/Dynamic Polymorphism = When the method that gets executed is decided at runtime based on the actual type of the object.