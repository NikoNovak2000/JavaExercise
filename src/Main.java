import java.awt.*;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        String message = "  Hello World  " + "!!";
        boolean endsWithExclamation = message.endsWith("!!");
        System.out.println(endsWithExclamation);
        System.out.println(message.length());
        System.out.println(message.indexOf("l"));
        System.out.println(message.replace("!", "?"));
        System.out.println(message.toLowerCase());
        System.out.println(message.trim());
        System.out.println(message);
    }
}