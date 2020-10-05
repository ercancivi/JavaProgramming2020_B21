package day11_MultiBranchIf.warmUpTasks;

public class DaysInMonth {

    public static void main(String[] args) {

        /* Warmup tasks:
           1. write a program that can find the number of days in a month
              (Assume that Feb has 28 days)
                  Ex:
                  month = 3
                  output:
                      31 days
                  month = 9
                  output:
                      30 days
              Hints: it cannot be done with if&else statement, you will need single if statements
        */
        int month = 2; // 1 to 12

        boolean has28Days = month == 2;
        boolean has30Days = month == 4 || month == 6 || month == 9 || month == 11;
//        boolean has31Days = month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12;
        boolean has31Days = !has28Days && !has30Days;

        int days = 0;

        if(has28Days) {
            days = 28;
        }

        if(has30Days) {
            days = 30;
        }

        if(has31Days) {
            days = 31;
        }
        System.out.println(days + " days");



    }

}
