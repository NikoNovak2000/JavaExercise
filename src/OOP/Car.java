package OOP;

public class Car {
    String make = "Honda";
    String model = "Civic";
    int year = 2009;
    double price = 5000;
    boolean isRunning = false;

    void start(){
        System.out.println("You start the engine!");
        isRunning = true;
    }
    void stop(){
        System.out.println("You stop the engine!");
        isRunning = false;
    }
    void drive() {
        System.out.println("You drive the " + make);
    }
    void brake(){
        System.out.println("You brake the " + make);
    }
}
