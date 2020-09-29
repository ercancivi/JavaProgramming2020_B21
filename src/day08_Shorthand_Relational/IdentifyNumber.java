package day08_Shorthand_Relational;

public class IdentifyNumber {

    public static void main(String[] args) {

        /*  Task 1:
            number = 100

            output :
                100 is positive number : true
                100 is negative number : false
                100 is zero : false
         */
        int number = 1500;

        boolean isPositive = number > 0; // if number is greater than zero then it is positive
        boolean isNegative = number < 0; // if number is less than zero the it is negative
        boolean isZero = number == 0; // if number is equal to zero then it is zero

        System.out.println( number + " is positive number: " + isPositive);
        System.out.println( number + " is negative number: " + isNegative);
        System.out.println( number + " is zero: " + isZero);





    }

}
