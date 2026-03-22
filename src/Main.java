import java.awt.*;
import java.sql.SQLOutput;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // c:\Windows\...
        String message = "Hello \"World\"";
        String path = "c:\\Windows\\Desktop\\...";
        String newLine = "c:\nWindows\nDesktop\n";
        String tabLine = "c:\tWindows\tDesktop\t";
        System.out.println(message);
        System.out.println(path);
        System.out.println(newLine);
        System.out.println(tabLine);
    }
}