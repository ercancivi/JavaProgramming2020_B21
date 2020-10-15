package day15_Scanner_Importing.additionalTasks;

import java.util.Scanner;

public class NumberOfDaysInMonth {

    public static void main(String[] args) {

        /*  Recreate the task which tells the user how many days are in a given month (day 13).
            Accept a month (number) and year from the console and print how many days are in that specific month.
            Handle leap years. Try to redo this ask without looking at the previous code.
         */

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a year : ");
        int year = input.nextInt();
        System.out.print("Enter a number of month : ");
        int numberOfMonth = input.nextInt();

        String numberOfDays = "";

        switch(numberOfMonth) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                numberOfDays = "31 days";
                break;
            case 2:
                numberOfDays = (year % 4 == 0) ? "29 days" : "28 days";
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                numberOfDays = "30 days";
                break;
            default:
                numberOfDays = "no such a month";
                break;
        }
        System.out.println("numberOfDays = " + numberOfDays);

    }

}
