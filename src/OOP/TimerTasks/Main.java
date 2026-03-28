package OOP.TimerTasks;

import java.util.Timer;
import java.util.TimerTask;

public class Main {
    public static void main(String[] args){

        Timer timer = new Timer();
        TimerTask timerTask = new TimerTask(){

            int count = 3;

          @Override
          public void run(){
              System.out.println("Hello bro!");
              count--;
              if(count <= 0){
                  System.out.println("TASK COMPLETE!");
                  timer.cancel();
              }
          }
        };

        timer.schedule(timerTask, 0, 1000);


    }
}

// Timer = Class that schedules tasks at a specific time or periodically
// Useful for sending notifications, scheduled updates, repetitive actions

// TimerTask = Represents a task that will be executed by the Timer
// You will need to extend the TimerTask class to define your task
// Create a subclass of TimerTask and @Override run()