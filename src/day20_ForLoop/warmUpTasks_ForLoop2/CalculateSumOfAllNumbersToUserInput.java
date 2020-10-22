package day20_ForLoop.warmUpTasks_ForLoop2;

import java.util.Scanner;

public class CalculateSumOfAllNumbersToUserInput {

    public static void main(String[] args) {

        /*  WarmUp Task 7:
            write a program that can calculate the sum of all numbers between 1 to any given number
         */
        Scanner scan = new Scanner(System.in);

        int sum = 0;

        System.out.println("Enter a number : ");
        int number = scan.nextInt();

        scan.close();

        for(int i = 0; i <= number; i++) {
            sum += i;
        }
        System.out.println("sum = " + sum);

    }

}
