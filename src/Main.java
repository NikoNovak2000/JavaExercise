import java.awt.*;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        int result = Math.round(5.3F);
        System.out.println(result);

        int result2 = (int)Math.ceil(5.3F);
        System.out.println(result2);

        int result3 = (int)Math.floor(5.3F);
        System.out.println(result3);

        int result4 = Math.max(1,20);
        System.out.println(result4);

        int result5 = (int) (Math.random() * 100);
        System.out.println(result5);
    }
}