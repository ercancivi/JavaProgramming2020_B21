package day15_Scanner_Importing.fromPresentationTasks;

import java.util.Scanner;

public class CalculateSum {

    public static void main(String[] args) {

        /*  Write a program that ask user to enter 3 numbers and shows the sum of the numbers.
	        Part 2: Ask the user to enter 3 numbers and calculate the sum of the numbers,
	                but only include positive numbers in the total
         */

        Scanner input = new Scanner(System.in);

        System.out.print("Enter three numbers separated by space : ");
        int numOne = input.nextInt();
        int numTwo = input.nextInt();
        int numThree = input.nextInt();

        int sum = numOne + numTwo + numThree;
        System.out.println("sum = " + sum);

        System.out.println("====== Part 2 ======");

        System.out.print("Enter three numbers separated by space : ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();

        boolean isAllPositive = num1 > 0 && num2 > 0 && num3 > 0;

        boolean num1AndNum2Negative = num1 < 0 && num2 < 0 && num3 > 0;
        boolean num1AndNum3Negative = num1 < 0 && num2 > 0 && num3 < 0;
        boolean num2AndNum3Negative = num1 > 0 && num2 < 0 && num3 < 0;

        boolean num1Negative = num1 < 0 && num2 > 0 && num3 > 0;
        boolean num2Negative = num1 > 0 && num2 < 0 && num3 > 0;
        boolean num3Negative = num1 > 0 && num2 > 0 && num3 < 0;


        int sum1 = 0;

        if(isAllPositive) {
            sum1 = num1 + num2 +num3;
        }else if(num1AndNum2Negative) {
            sum1 = num3;
        }else if(num1AndNum3Negative) {
            sum1 = num2;
        }else if(num2AndNum3Negative) {
            sum1 = num1;
        }else if(num1Negative) {
            sum1 = num2 + num3;
        }else if(num2Negative) {
            sum1 = num1 + num3;
        }else if(num3Negative) {
            sum1 = num1 + num2;
        }else {
            sum1 = 0;
        }
        System.out.println("sum1 = " + sum1);


    }

}
