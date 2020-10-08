package day13_SwitchStatement;

public class WeekDaysInSwitchStatementByMe {

    public static void main(String[] args) {

        /*  2. Write a program to display days:
                1-Monday
                2-Tuesday
                3-Wednesday
                4-Thursday
                5-Friday
                6-Saturday
                7-Sunday
        */
        int day = 8;
        String result = "";
        switch (day) {
            case 1:
                result = "Monday";
                break;
            case 2:
                result = "Tuesday";
                break;
            case 3:
                result = "Wednesday";
                break;
            case 4:
                result = "Thursday";
                break;
            case 5:
                result = "Friday";
                break;
            case 6:
                result = "Saturday";
                break;
            case 7:
                result = "Sunday";
                break;
            default:
                result = "Invalid day";
                break;
        }

        System.out.println("result = " + result);

    }

}
