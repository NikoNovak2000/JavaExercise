package OOP;

public class Main {
    static void main(String[] args) {

        Car car = new Car();

        System.out.println(car.make);
        System.out.println(car.model);
        System.out.println(car.year);
        System.out.println(car.price);
        System.out.println(car.isRunning);

        System.out.println(car.isRunning);
        car.start();
        System.out.println(car.isRunning);
        car.stop();
        System.out.println(car.isRunning);

        car.drive();
        car.brake();

        Car car2 = new Car();
        System.out.println(car2.model);
    }
}

// object = entity that holds data (attributes) and can perform actions (methods)
// reference data type