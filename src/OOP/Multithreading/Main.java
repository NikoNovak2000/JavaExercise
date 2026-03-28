package OOP.Multithreading;

public class Main {
    public static void main(String[] args){

        // MyRunnable myRunnable = new MyRunnable();
        // Thread thread1 = new Thread(myRunnable);
        // thread1.start();

        Thread thread1 = new Thread(new MyRunnable("PING")); // anonymous object
        Thread thread2 = new Thread(new MyRunnable("PONG"));

        System.out.println("GAME START!");

        thread1.start();
        thread2.start();

        try {
            thread1.join(); // with join we say we want to wait for our threads to finish before going further with the main thread
            thread2.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted!");
        }

        System.out.println("GAME OVER!");

    }
}

// Multithreading = enables a program to run multiple threads concurrently
// Thread = a set of instructions that run independently
// Useful for background tasks or time-consuming operations

// 1. Extend Threat Class
// 2. Implement a Runnable interface