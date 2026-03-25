package OOP.Interface;

public class Main {
    static void main(String[] args){

        Rabbit rabbit = new Rabbit();
        Hawk hawk = new Hawk();
        Fish fish = new Fish();

        rabbit.flee();
        hawk.hunt();
        fish.hunt();
        fish.flee();


    }
}

// Interface = A blueprint for a class that specifies a set of abstract methods that implementing classes MUST define.
// Supports multiple inheritance-like behavior. When talking about inheritance class can only have a single parent.
// When using an Interface a class can have more of them as "Parents" from which they inherit methods/attributes.
// In this example fish can be both a prey and predator and inherits one method from prey and one method from predator.