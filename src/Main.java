import java.awt.*;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Implicit casting happens when there is no chance of a data loss, byte > short > int > long > float > double
       short x = 1;
       int y = x + 2;
       System.out.println(y);

       // Explicit casting can happen only between compatible types
        double z = 1.1;
        int h = (int)z + 2;
        System.out.println(h);

        String string = "1.1";
        double k = Double.parseDouble(string) + 2;
        System.out.println(k);
    }
}