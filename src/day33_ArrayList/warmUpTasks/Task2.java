package day33_ArrayList.warmUpTasks;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

public class Task2 {

    public static void main(String[] args) {

        /*  2. create an array of LocalDate and store the next 10 day's dates,
               use for each loop to print each Date in the following format:
                        MonthName/Day, Name

                        ex:
                            November/25, Wednesday
         */

        LocalDate[] next10Days = new LocalDate[10];

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MMM/dd, EEEE");

        for(int i = 0; i < next10Days.length; i++) {
            next10Days[i] = LocalDate.now().plusDays(i+1);
        }

        System.out.println("next10Days = " + Arrays.toString(next10Days));

        for(LocalDate eachDate : next10Days) {
            System.out.println(eachDate.format(dtf));
        }

    }



}
