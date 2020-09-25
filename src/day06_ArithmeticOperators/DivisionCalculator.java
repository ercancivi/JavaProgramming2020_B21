package day06_ArithmeticOperators;

public class DivisionCalculator {

    public static void main(String[] args) {

        /*  Task : DivisionCalculator
            write a program that can calculate first number divided by second number, and print out the result
            num1 = 10;
            num2 = 3;
                output :
                    10 divide by 3 is equal to 3 with a remainder of 1

            num1 = 20;
            num2 = 6;
                output :
                    20 divide by 6 is equal to 3 with a remainder of 2

            num1 = 100;
            num2 = 20;
                output :
                    100 divide by 20 is equal to 5 with a remainder of 0
         */
        int num1 = 10;
        int num2 = 3;
        int result1 = num1 / num2;
        int remainder1 = num1 % num2;
        String finalResult1 = num1 + " divide by " + num2 + " is equal to " + result1 + " with a remainder of " + remainder1;
        System.out.println(finalResult1);

        System.out.println("====================================================");

        int num3 = 20;
        int num4 = 6;
        int result3 = num3 / num4;
        int remainder3 = num3 % num4;
        String finalResult3 = num3 + " divide by " + num4 + " is equal to " + result3 + " with a remainder of " + remainder3;
        System.out.println(finalResult3);

        System.out.println("====================================================");

        int num5 = 100;
        int num6 = 20;
        int result5 = num5 / num6;
        int remainder5 = num5 % num6;
        String finalResult5 = num5 + " divide by " + num6 + " is equal to " + result5 + " with a remainder of " + remainder5;
        System.out.println(finalResult5);

    }

}
