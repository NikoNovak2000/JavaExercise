package OOP.TimerTasks;

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class CountdownTimer {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of seconds to countdown from: ");
        int response = scanner.nextInt();

        Timer timer = new Timer();
        TimerTask timerTask = new TimerTask(){

            int countFrom = response;

            @Override
            public void run(){
                System.out.println(countFrom);
                countFrom--;

                if (countFrom < 0){
                    System.out.println("Countdown completed!");
                    timer.cancel();
                }
            }
        };

        timer.scheduleAtFixedRate(timerTask, 0, 1000);

        scanner.close();
    }
}

// Countdown from the int that the user must input
// use Timer and TimerTasks
