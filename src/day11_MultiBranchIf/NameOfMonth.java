package day11_MultiBranchIf;

public class NameOfMonth {

    public static void main(String[] args) {

        /*  Task :
            write a program that can print out the name of the month based on the number 1 ~ 12
            number = 1; // 1 ~ 12

            output :
                January
         */
        int number = 0;
        String month = "";

        if(number == 1) {
            month = "January";
        }else if(number == 2) {
            month = "February";
        }else if(number == 3) {
            month = "March";
        }else if(number == 4) {
            month = "April";
        }else if(number == 5) {
            month = "May";
        }else if(number == 6) {
            month = "June";
        }else if(number == 7) {
            month = "July";
        }else if(number == 8) {
            month = "August";
        }else if(number == 9) {
            month = "September";
        }else if(number == 10) {
            month = "October";
        }else if(number == 11) {
            month = "November";
        }else {
            month = "December";
        }

        System.out.println("Month is " + month);

    }

}
