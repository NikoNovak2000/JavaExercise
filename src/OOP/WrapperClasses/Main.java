package OOP.WrapperClasses;

public class Main {
    static void main(String[] args){
        //Integer a = new Integer(123);
        //Double b = new Double(25.252525);
        //Character c = new Character('h');
        //Boolean d = new Boolean(true);

        // Autoboxing - wrapping a primitive to an object
        Integer f = 123;
        Character l = '%';

        // Unboxing - setting it back to its primitive type
        int x = f;
        char z = l;

        String j = Integer.toString(123);
        String k = Double.toString(3.51);
        String m = Character.toString('/');
        String n = Boolean.toString(true);

        String y = j + k + m + n;
        System.out.println(y);


        // Parsing
        int a = Integer.parseInt("123");
        double b = Double.parseDouble("3.14");
        char c = "Pizza".charAt(0);
        boolean d = Boolean.parseBoolean("true");
    }
}

// Wrapper classes = Allow primitive values ( int, char, double, boolean ) to be used as objects. "Wraps them in an object".
// Generally, don't wrap primitives unless you need an object.
// Allows use of Collections Framework and static Utility Methods.