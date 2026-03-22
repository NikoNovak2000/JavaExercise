import java.awt.*;
import java.sql.SQLOutput;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        NumberFormat currencyInstance = NumberFormat.getCurrencyInstance();
        String result = currencyInstance.format(1234567.891);
        System.out.println(result);

        String result2 = NumberFormat.getPercentInstance().format(0.32);;
        System.out.println(result2);
    }
}