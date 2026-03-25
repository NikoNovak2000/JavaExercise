package OOP.GetterAndSetter;

public class Main {
    static void main(String[] args) {

        Car car = new Car("Charger", "Yellow", 10_000);

        //car.color = "Blue";
        car.setColor("Blue");

        //car.price = 5000;
        car.setPrice(-250);

        System.out.println(car.getColor() + " " + car.getModel() + " " + car.getPrice());

    }
}

// They help protect object data and add rules for accessing or modifying them.
// Getters = Methods that make a field READABLE.
// Setters = Methods that make a field WRITEABLE.