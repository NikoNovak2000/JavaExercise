package OOP.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    static void main(String[] args){

        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Coconut");
        fruits.add("Orange");
        fruits.add("Banana");

        //fruits.remove(0);
        //fruits.set(0, "Pineapple");

        //System.out.println(fruits.get(2));
        System.out.println(fruits.size());

        Collections.sort(fruits);

        System.out.println(fruits);

        for(String fruit : fruits){
            System.out.println(fruit);
        }


        Scanner scanner = new Scanner(System.in);

        ArrayList<String> foods = new ArrayList<>();

        System.out.println("Enter the number of food you wan to store?");
        int numberOfFood = scanner.nextInt();
        scanner.nextLine();

        for (int i = 1; i <= numberOfFood; i++){
            System.out.print("Enter food number " + i + ": ");
            String food = scanner.nextLine();
            foods.add(food);
        }

        System.out.println(foods);

        scanner.close();
    }
}

// ArrayList =  A resizeable array that stores objects (autoboxing).
// Arrays are fixed in size, but ArrayLists can change.