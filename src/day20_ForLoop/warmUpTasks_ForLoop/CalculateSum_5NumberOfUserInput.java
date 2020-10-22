package day20_ForLoop.warmUpTasks_ForLoop;

import java.util.Scanner;

public class CalculateSum_5NumberOfUserInput {

    public static void main(String[] args) {

        /*  WarmUp Task 3:
            write a program that can calculate the sum of 5 user entered input
         */
        Scanner scan = new Scanner(System.in);

        int sum = 0;

        for(int i = 1; i <= 5; i++) {
            System.out.println("Enter a number : ");
            int number = scan.nextInt();
            sum += i;
        }
        System.out.println("sum = " + sum);

        scan.close();
    }

}
