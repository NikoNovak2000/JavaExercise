package OOP.Generics;

public class Main {
    public static void main(String[] args){

        Box<Integer> box = new Box<>();

        box.setItem(1);

        System.out.println(box.getItem());

        Product<String, Double> product1 = new Product<>("Apple", 0.51);
        Product<String, Integer> product2 = new Product<>("Ticket", 5);

        System.out.println(product2.getPrice());

    }
}

// Generics = A concept where you can write a class, interface or method in a way that is compatible with different data types.
// <T> type parameter (placeholder that gets replace with a real type)
// <String> type argument specifies the type

// more type parameter options are <T, U>