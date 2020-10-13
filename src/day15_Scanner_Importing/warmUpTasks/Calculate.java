package day15_Scanner_Importing.warmUpTasks;

public class Calculate {

    public static void main(String[] args) {

        /*  Given 3 numbers (int) and a boolean calculate a number based on these conditions:

                - If the first number is even, multiple it by 5, but if it's odd, multiple it by 10.

                - If the last number is a multiply of 5 divide it by 5, but if the number is not divide it by 2

                - If the given boolean is true:
                    - add all the numbers together
                    - After adding the numbers if the total value is divisible by 10 evenly then print the number,
                    otherwise print "invalid result"

                - If the given boolean is false:
                    - multiple all the numbers together
                    - After multiplying the numbers, if the number is odd, then print it,
                    otherwise print "invalid result"
         */

        int num1 = 10;
        int num2 = 10;
        int num3 = 10;

        if(num1 % 2 == 0) {
            num1 *= 5;
        }else {
            num1 *= 10;
        }

        if(num3 % 5 == 0) {
            num3 /= 5;
        }else {
            num3 /= 2;
        }

        int sum = num1 + num2 + num3;

        if(sum % 10 == 0) {
            System.out.println(sum);
        }else {
            System.out.println("invalid result");
        }

        int multiply = num1 * num2 * num3;

        if(multiply % 2 != 0) {
            System.out.println(multiply);
        }else {
            System.out.println("invalid result");
        }




    }

}
