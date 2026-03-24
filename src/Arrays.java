import java.util.Scanner;


public class Arrays {
    static void main(String[] args) {
        int[] numbers = { 1, 9, 2, 8, 3, 5, 4 };
        String[] fruits = {"apple", "orange", "banana"};
        int target = 5;
        boolean isFound = false;
        String targetString;
        boolean isFoundString = false;

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < numbers.length; i++) {
            if (target == numbers[i]) {
                System.out.println("Element found at index: " + i);
                isFound = true;
                break;
            }
        }

        if(!isFound){
                System.out.println("Element not found. Missing from the array.");
        }

        System.out.print("Enter a target fruit: ");
        targetString = scanner.nextLine();

        for (int i = 0; i < fruits.length; i++) {
            if (fruits[i].equals(targetString)) {
                System.out.println("Element found at index: " + i);
                isFoundString = true;
                break;
            }
        }

        if(!isFoundString){
            System.out.println("Element not found. Missing from the array.");
        }

    }
}
