package OOP.DatesAndTimes;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args){

        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        LocalDateTime localDateTime = LocalDateTime.now();
        Instant utcTimeStamp = Instant.now();

        System.out.println(date);
        System.out.println(time);
        System.out.println(localDateTime);
        System.out.println(utcTimeStamp);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String newDateTime = localDateTime.format(formatter);
        System.out.println(newDateTime);

        LocalDateTime date2 = LocalDateTime.of(2024, 12, 25, 12, 0, 0);
        System.out.println(date2);

        if(date2.isBefore(localDateTime)){
            System.out.println(date2 + " is earlier than " + localDateTime);
        }
        else if(date2.isAfter(localDateTime)){
            System.out.println(date2 + " is later than " + localDateTime);
        }
        else if(date2.isEqual(localDateTime)){
            System.out.println(date2 + " is equal to: " + localDateTime);
        }
    }
}

// How to work with Dates & Times
// LocalDate, LocalTime, LocalDateTime, UTC timestamp
