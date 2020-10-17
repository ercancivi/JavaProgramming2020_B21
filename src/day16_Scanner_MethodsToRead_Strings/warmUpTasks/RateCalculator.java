package day16_Scanner_MethodsToRead_Strings.warmUpTasks;

import java.util.Scanner;

public class RateCalculator {

    public static void main(String[] args) {

        /*  WarmUp Task :
            write a program for a rate calculator: RateCalculator
            1. asks the user to enter a salary (double)
            2. asks the user how many hours he/she works in a week (as int)
            3. print the hourly rate of the employee

            assume that one year has 52 weeks

            hourRate = salary / (weeklyHour * 52)
         */

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your salary : ");
        double salary = input.nextDouble();

        System.out.println("Enter your weekly hours : ");
        int weeklyHours = input.nextInt();

        double hourRate = salary / (weeklyHours * 52);

        System.out.println("Your hour rate is = " + hourRate);

    }

}
