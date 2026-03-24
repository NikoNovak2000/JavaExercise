import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        String pizza = bakePizza("Mexicana", "mozzarella ", "prosciutto ");
        System.out.println(pizza);
    }

    // overloaded methods = methods with the same name, but different parameters signature
    static double add(double a, double b){
        return a + b;
    }
    static double add(double a, double b, double c){
        return a + b + c;
    }
    static double add(double a, double b, double c, double d) {
        return a + b + c + d;
    }

    static String bakePizza(String typePizza){
        return "pizza " + typePizza;
    }

    static String bakePizza(String typePizza, String cheese){
        return "pizza " + cheese + typePizza;
    }

    static String bakePizza(String typePizza, String cheese, String topping){
        return "pizza " + cheese + topping + typePizza;
    }
}