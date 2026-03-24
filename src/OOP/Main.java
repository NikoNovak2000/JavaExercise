package OOP;

public class Main {
    static void main(String[] args) {

        Car car1 = new Car("Mustang", "Red");
        Car car2 = new Car("Qashqai", "Dark Blue");
        Car car3 = new Car("Charger", "Yellow");

        // Anonymous object Corvette
        Car[] cars = {car1, car2, car3, new Car("Corvette", "Black")};

        for(Car car : cars){
            car.color = "black";
        }

        for(Car car : cars){
            car.drive();
        }
    }
}
