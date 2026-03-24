import java.util.Scanner;


public class Arrays {
    static void main(String[] args) {
        String[] fruits = { "apple", "banana", "cherry", "coconut" };

        fruits[2] = "pear";
        int numOfFruits = fruits.length;

        System.out.println(numOfFruits);

        for (int i = 0; i < fruits.length; i++){
            System.out.println(fruits[i]);
        }
        // Arrays.fill(fruits, "pineapple"); fill everything with pineapple

        // Enhanced for loop
        for (String fruit : fruits){
            System.out.println(fruit);
        }
        System.out.println("*******************************");

        Scanner scanner = new Scanner(System.in);
        String[] foods;
        int size;

        System.out.print("What number of food do you want to store?");
        size = scanner.nextInt();
        scanner.nextLine();

        foods = new String[size];

        for(int i = 0; i < foods.length; i++){
            System.out.print("Enter a food:");
            foods[i] = scanner.nextLine();
        }

        for (String food : foods){
            System.out.println(food);
        }
    }
}
