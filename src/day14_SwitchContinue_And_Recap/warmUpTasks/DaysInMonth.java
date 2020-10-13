package day14_SwitchContinue_And_Recap.warmUpTasks;

public class DaysInMonth {

    public static void main(String[] args) {

        /*  warmup task
            1. use switch statement to write a program that can return the number of days based on the name of the month
            Ex:
                year = 2020;
                month = Mar;
                output:
                    30 days
                year = 2020;
                month = Feb;
                output:
                    29  days
         */

        int year = 2020;
        String month = "February"; // 1 ~ 12

        String result = "";

        switch (month) {

            case "January" :
                result = "31 Days";
                break;
            case "February" :
                result = (year % 4 == 0) ? "29 Days" : "28 Days";
                break;
            case "March" :
                result = "31 Days";
                break;
            case "April" :
                result = "30 Days";
                break;
            case "May" :
                result = "31 Days";
                break;
            case "June" :
                result = "30 Days";
                break;
            case "July" :
                result = "31 Days";
                break;
            case "August" :
                result = "31 Days";
                break;
            case "September" :
                result = "30 Days";
                break;
            case "October" :
                result = "31 Days";
                break;
            case "November" :
                result = "30 Days";
                break;
            case "December" :
                result = "31 Days";
                break;
            default:
                result = "No such a month";
        }
        System.out.println("result = " + result);

    }

}
