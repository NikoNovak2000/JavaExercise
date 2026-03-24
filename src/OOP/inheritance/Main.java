package OOP.inheritance;

public class Main {
    static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();

        Cat cat = new Cat();
        cat.eat();

        Plant plant = new Plant();

        System.out.println(dog.lives);
        System.out.println(cat.lives);

        dog.speak();
        cat.speak();

        System.out.println(dog.isAlive);
        System.out.println(cat.isAlive);

        plant.photosynthesize();
        System.out.println(plant.isAlive);
    }
}
