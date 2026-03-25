package OOP.ToStringMethod;

public class Main {
    static void main(String[] args){

        Car car1 = new Car("Ford", "Fiat",  2020, "Brown");
        Car car2= new Car("Honda", "Civic",  2015, "Blue");

        System.out.println(car1);

        System.out.println(car1.toString());
        System.out.println(car2.toString());
    }
}

// .toString() = Method inherited from the Object class.
//               Used to return a string representation of an object.
//               By default, it returns a hash code as a unique identifier.
//               It can be overridden to provide meaningful details.