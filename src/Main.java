import java.awt.*;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        numbers[0] = 1;
        numbers[1] = 2;
        System.out.println(Arrays.toString(numbers));

        int[] otherNumbers = { 2, 3, 5, 1, 4};
        System.out.println(otherNumbers.length);
        Arrays.sort(otherNumbers);
        System.out.println(Arrays.toString(otherNumbers));
    }
}