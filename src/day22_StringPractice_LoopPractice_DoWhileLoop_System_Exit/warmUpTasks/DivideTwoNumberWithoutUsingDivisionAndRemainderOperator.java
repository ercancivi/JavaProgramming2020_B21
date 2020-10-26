package day22_StringPractice_LoopPractice_DoWhileLoop_System_Exit.warmUpTasks;

import java.util.Scanner;

public class DivideTwoNumberWithoutUsingDivisionAndRemainderOperator {

    public static void main(String[] args) {

        /*  WarmUp Task 3:
            write a program that can divide two numbers without using / & % operators 
            and returns the division and remainder
			ex:
				input:  10
						3

				0utput:
						3 with a remainder of 1
         */
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter numerator number : ");
        int num1 = scan.nextInt();

        System.out.println("Enter denominator number : ");
        int num2 = scan.nextInt();
        int division = 0;
        int remaining = 0;
        for(int i = 0; i == 0;) {
            division++;
            num1 -= num2;

            if(num1 < num2){
                remaining = num1;
                break;
            }
        }
        System.out.println(division + " with a remainder of " + remaining);

        scan.close();

    }

}
