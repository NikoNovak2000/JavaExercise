import java.awt.*;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        double result = (double)10 / (double)3;
        System.out.println(result);
        int x = 1;
        int y = x++;
        int z = ++x;
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

        x -= 2;
        System.out.println(x);
    }
}