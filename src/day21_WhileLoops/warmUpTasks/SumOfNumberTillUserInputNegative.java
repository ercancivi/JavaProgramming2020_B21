package day21_WhileLoops.warmUpTasks;

import java.util.Scanner;

public class SumOfNumberTillUserInputNegative {

    public static void main(String[] args) {

        /*  WarmUp Task 1:
            Write a program that calculates the sum of numbers entered by the user until user enters a negative number.
			hint: you need an infinite loop
         */

        Scanner scan = new Scanner(System.in);

        int sum = 0;

        for(int i = 0; i >= 0; ) {
            System.out.println("Enter a integer number: ");
            int number = scan.nextInt();
            if(number < 0) {
                break;
            }
            sum += number;
        }
        System.out.println("sum = " + sum);
        scan.close();
    }

}
