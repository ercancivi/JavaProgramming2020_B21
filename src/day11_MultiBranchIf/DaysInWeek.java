package day11_MultiBranchIf;

public class DaysInWeek {

    public static void main(String[] args) {

        /*  Task :
            write a program that can print out the name of the day based on the number 1 ~ 7
            number = 1; // 1 ~ 7
            output :
                Monday

            number = 5;
            output :
                Friday
         */

        int number = 1;
        String day = "";

        if(number == 1) {
            day = "Monday";
        }else if(number == 2) {
            day = "Tuesday";
        }else if(number == 3) {
            day = "Wednesday";
        }else if(number == 4) {
            day = "Thursday";
        }else if(number == 5) {
            day = "Friday";
        }else if(number == 6) {
            day = "Saturday";
        }else {
            day = "Sunday";
        }

        System.out.println("Day is " + day);

    }

}
