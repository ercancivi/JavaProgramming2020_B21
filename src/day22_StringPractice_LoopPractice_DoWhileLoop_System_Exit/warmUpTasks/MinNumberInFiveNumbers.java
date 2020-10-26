package day22_StringPractice_LoopPractice_DoWhileLoop_System_Exit.warmUpTasks;

import java.util.Scanner;

public class MinNumberInFiveNumbers {

    public static void main(String[] args) {

        /*  WarmUp Task 2:
            write a program that asks user to enter 5 numbers and returns the minimum number
         */
        Scanner scan = new Scanner(System.in);

        int min = 2_147_483_647;    ////this is the valid range for int numbers on positive side
        for(int i = 1; i <= 5; i++) {
            System.out.println("Enter a number : ");
            int num = scan.nextInt();
            min = (num < min) ? num : min;
        }
        System.out.println("min = " + min);

        scan.close();

    }

}
