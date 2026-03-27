package OOP.AnonymousClass;

public class Main {
    public static void main(String[] args){
        Dog dog1 = new Dog();
        Dog dog2 = new Dog(){
            @Override
            void speak(){
                System.out.println("Scooby Doo says run Shaggy!");
            }
        };

        dog1.speak();
        dog2.speak();
    }
}

// Anonymous class = a class that doesn't have a name. Cannot be reused.
// Add custom behavior without having to create a new class.
// Often used for one time uses (TimerTask, Runnable, callbacks)