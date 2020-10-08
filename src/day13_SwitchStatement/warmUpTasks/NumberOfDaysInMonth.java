package day13_SwitchStatement.warmUpTasks;

public class NumberOfDaysInMonth {

    public static void main(String[] args) {

        /* Task 2 :
           write a program that can find the number of days in a month

            Note: MUST USE NESTED IF

         */
        int month = 3;
        boolean has28Days = month == 2;
        boolean has30Days = month == 4 || month == 6 || month == 9 || month == 11;
        int numberOfDays = 0;
        String invalid = "It is Invalid Number";

        if (month >= 1 && month <= 12) {

            if (month == 2) {
                numberOfDays = 28;

            } else if (has30Days) {
                numberOfDays = 30;

            } else {
                numberOfDays = 31;
            }

            System.out.println("numberOfDays = " + numberOfDays);

        } else {
            System.out.println(invalid);
        }


        System.out.println("\n==== with Ternary ====\n");


        String numberOfDays1 = !(month >= 1 && month <= 12) ? "It is Invalid Number"
                : (month == 4 || month == 6 || month == 9 || month == 11) ? "30"
                : (month == 2) ? "28" : "31";

        System.out.println("numberOfDays1 = " + numberOfDays1);

    }

}
