package OOP.Abstraction;

public class Main {
    static void main(String[] args){

        Circle circle = new Circle(3);
        Triangle triangle = new Triangle(4,5);
        Rectangle rectangle = new Rectangle(5,6);


        System.out.println(circle.area());
        System.out.println(triangle.area());
        System.out.println(rectangle.area());
    }
}

// abstract = used to define abstract classes and methods. Abstraction process of hiding implementation details and showing only the essential features.
// Abstract classes CAN'T be instantiated directly. They can contain 'abstract' methods (which must be implemented)
// They can contain 'concrete' methods (which are inherited)