package day22_StringPractice_LoopPractice_DoWhileLoop_System_Exit.warmUpTasks;

import java.util.Scanner;

public class MaxNumberInFiveNumbers {

    public static void main(String[] args) {

        /*  WarmUp Task 1:
            write a program that asks user to enter 5 numbers and returns the maximum number
         */

        Scanner scan = new Scanner(System.in);

        int max = -2_147_483_648;   //this is the valid range for int numbers on negative side
        for(int i = 1; i <= 5; i++) {
            System.out.println("Enter a number : ");
            int num = scan.nextInt();
            max = (num > max) ? num : max;
        }
        System.out.println("max = " + max);

        scan.close();


    }

}
