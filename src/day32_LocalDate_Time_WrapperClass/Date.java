package day32_LocalDate_Time_WrapperClass;

import java.time.LocalDate;

public class Date {

    public static void main(String[] args) {

        LocalDate yesterday = LocalDate.of(2020, 11, 22);

        System.out.println(yesterday);

        //LocalDate d1 = LocalDate.of(2019, 2, 29);
        // System.out.println(d1);

        System.out.println(  yesterday.isLeapYear() ); // Leap ==> true, otherwise ==> false


        LocalDate today = LocalDate.now();

        System.out.println(today);

        // LocalDate DofB


        String[] classMates = {"Ahmed", "Ramiz", "Olesea", "Adil", "Ercan"};
        LocalDate[] classMatesDofB = {LocalDate.of(1983,6,14),
                                      LocalDate.of(1983,03,12),
                                      LocalDate.of(1986,02,07),
                                      LocalDate.of(1999,06,18),
                                      LocalDate.of(1974,03,03)};

        for(int i = 0; i < classMates.length; i++) {
            System.out.println(classMates[i] + "'s birthday is: " + classMatesDofB[i]);
            System.out.println(classMates[i] + " was born on leap year: " + classMatesDofB[i].isLeapYear() + "\n");
        }


        String[] names={"Julia","inna","Anna","Ruslan","Livio"};
        LocalDate[] birthdays = {
                LocalDate.of(1990,11,23),
                LocalDate.of(1995,02,10),
                LocalDate.of(2000,03,15),
                LocalDate.of(2005, 04,20),
                LocalDate.of(2010, 05,25)
        };


        for( int i = 0; i <= names.length-1; i++){
            System.out.println( names[i] + "' birthday is: "+ birthdays[i]);
            System.out.println(names[i] +" was born on leap year: " +  birthdays[i].isLeapYear()+"\n" );

        }



    }

}
