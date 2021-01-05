package day33_ArrayList;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

public class WarmUpTasks {

    public static void main(String[] args) {

        /*  WarmUpTasks:
            1. use the LocalDate & Time get the date and time in the following format:

			Tuesday, 1:00 pm, Nov/24/2020

            2. create an array of LocalDate and store the next 10 day's dates,
               use for each loop to print each Date in the following format:
                        MonthName/Day, Name

                        ex:
                            November/25, Wednesday

            3. write a program that can return the sum of all the digits from a string
                    ex:
                        input: "a1b2c3"
                        output: 6
                            (1+2+3= 6)

                        input: "Today's date is 04/27/2020"
                        output: 17
                            (0+4+2+7+2+0+2+0=17)

            4- create an array of string and store 5 of your friend's names
               create an array of LocalDate
         */

        /*  1. use the LocalDate & Time get the date and time in the following format:
			    Tuesday, 1:00 pm, Nov/24/2020
         */
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("EEEE, h:mm a, MMM/dd/yyyy");

        LocalDateTime d1 = LocalDateTime.of(2020,11,24,13,0);
        System.out.println(d1.format(dtf));

        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("E, hh:mm a, MMMM/dd/yyyy");
        System.out.println(d1.format(dtf1).replaceFirst("PM","pm"));



        /*  2. create an array of LocalDate and store the next 10 day's dates,
               use for each loop to print each Date in the following format:
                        MonthName/Day, Name
                        ex:
                            November/25, Wednesday
         */
        DateTimeFormatter dt = DateTimeFormatter.ofPattern("MMM-dd, E");
        LocalDate[] days = new LocalDate[10];

        for(int i = 0; i <= days.length-1; i++) {
            days[i] = LocalDate.now().plusDays(i+1);
        }

        System.out.println(Arrays.toString(days));

        for(LocalDate each : days) {
            System.out.println(each.format(dt));
        }



        /*  3. write a program that can return the sum of all the digits from a string
                 ex:
                     input: "a1b2c3"
                     output: 6
                            (1+2+3= 6)

                     input: "Today's date is 04/27/2020"
                     output: 17
                            (0+4+2+7+2+0+2+0=17)
         */
        String str = "a1b2c3d4";  // 1: 49,  2: 50, 3: 51
        int sum = 0 ;

        for(char each : str.toCharArray() ){
            if(Character.isDigit(each)){
                sum += Integer.parseInt( ""+each );  // each digits need to be converted to integer and added to the sum
            }
        }


        System.out.println("sum = " + sum);




        /*  4- create an array of string and store 5 of your friend's names
               create an array of LocalDate
         */
        String[] friends = {"Ahmed", "Ramiz", "Olesea", "Adil", "Ercan"};
        LocalDate[] dOfB = {LocalDate.of(1983,6,14),
                            LocalDate.of(1983,3,12),
                            LocalDate.of(1986,2,7),
                            LocalDate.of(1999,6,18),
                            LocalDate.of(1974,3,3)};

        String nameOfOlder = friends[0];
        LocalDate older = dOfB[0];

        String nameOfYoungest = friends[0];
        LocalDate youngest = dOfB[0];

        for(int i = 0; i <= dOfB.length-1; i++) {
            if(dOfB[i].isBefore(older)) {
                older = dOfB[i];
                nameOfOlder = friends[i];
            }

            if(dOfB[i].isAfter(youngest)) {
                youngest = dOfB[i];
                nameOfYoungest = friends[i];
            }
        }

        System.out.println(nameOfOlder +": " + older);
        System.out.println(nameOfYoungest + ": " + youngest);



    }

}
