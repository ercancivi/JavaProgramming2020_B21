package day15_Scanner_Importing.afterClassTasks;

import java.util.Scanner;

public class Birthday {

    public static void main(String[] args) {

        /*  Ask the user to enter the year, month number,
            and day (pick any datatype for the values)
            they were born and print in the following format:
                " $month / $day / $year is your birthday "
         */

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your birthday year : ");
        short year = input.nextShort();

        System.out.print("Enter your birthday month : ");
        byte month = input.nextByte();

        System.out.print("Enter your birthday day : ");
        byte day = input.nextByte();

        String yourBirthday = " is your birthday";
        System.out.println(month + " / " + day + " / " + year + yourBirthday);

        System.out.println("========================================");

        System.out.print("Enter your birthday year, month and day separated by space : ");
        short year1 = input.nextShort();
        byte month1 = input.nextByte();
        byte day1 = input.nextByte();
        String yourBirthday1 = " is your birthday";
        System.out.println(month1 + " / " + day1 + " / " + year1 + yourBirthday1);


    }

}
