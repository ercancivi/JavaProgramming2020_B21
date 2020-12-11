package day35_CustomClass.warmUpTasks;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;

public class Task2 {

    public static void main(String[] args) {

        /*      1. create an Array of LocalDate
                2. write a program that can remove all the dates before August-15-2016
         */

        LocalDate[] dates = {LocalDate.of(2020,7,12),
                             LocalDate.of(2012,12,9),
                             LocalDate.of(2008,8,3),
                             LocalDate.of(2019,6,23),
                             LocalDate.of(2011,9,17),
                             LocalDate.of(2003,11,7),
                             LocalDate.of(2015,4,27),
                             LocalDate.of(2016,9,17),
                             LocalDate.of(2013,11,7),
                             LocalDate.of(2018,4,27)};

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MMMM-dd-yyyy");

        for(LocalDate each : dates) {
            System.out.println("each = " + each);
        }

        ArrayList<LocalDate> datesList = new ArrayList<>();
        datesList.addAll(Arrays.asList(dates));

        System.out.println("datesList before remove = " + datesList);

        datesList.removeIf(p->p.isBefore(LocalDate.of(2016,8,15)));

        System.out.println("datesList after remove = " + datesList);


    }

}
