package day07_UnaryOperators;

public class LeapYearByMuhtar {

    public static void main(String[] args) {

        int year = 2030;
        boolean isLeapYear =   year % 4  < 1; // checks if year is evenly divisible by 4
        //   0  <  1  ===> true

        System.out.println(year + " is leap year: " +isLeapYear);


    }

}
