package OOP.Threading;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        thread.setDaemon(true); // daemon thread ends as soon as our main thread is finished
        thread.start();

        System.out.println("You have 10 seconds to enter your name");
        System.out.print("Enter your name: ");
        String name = scanner.nextLine().trim();
        System.out.println("Hello " + name);

        scanner.close();
    }
}

// Threading = allows a program to run multiple tasks simultaneously
// Helps improve performance with time-consuming operations
// File I/O, network comms, or any background tasks)

// How to create a Thread
// Option 1. Extend the Thread class (simpler, but limited)
// Option 2. Implement the Runnable interface (better)