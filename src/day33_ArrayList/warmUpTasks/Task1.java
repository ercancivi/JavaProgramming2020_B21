package day33_ArrayList.warmUpTasks;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Task1 {

    public static void main(String[] args) {

        /* 1. use the LocalDate & Time get the date and time in the following format:
MM
			Tuesday, 1:00 pm, Nov/24/2020
         */
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("EEEE, h:mm a, MMM/dd/yyyy");

        LocalDateTime currentDateAndTime = LocalDateTime.of(2020,12,9,19,53);

        System.out.println("currentDateAndTime = " + currentDateAndTime);

        System.out.println("currentDateAndTime with dtf = " + currentDateAndTime.format(dtf).replaceFirst("PM","pm"));

    }

}
