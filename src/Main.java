import java.awt.*;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        int[][] numbers = new int[2][3];
        numbers[0][0] = 1;
        System.out.println(Arrays.deepToString(numbers));

        int[][] moreNumbers = { {1, 2, 3}, { 4, 5, 6} };
        System.out.println(Arrays.deepToString(moreNumbers));
    }
}