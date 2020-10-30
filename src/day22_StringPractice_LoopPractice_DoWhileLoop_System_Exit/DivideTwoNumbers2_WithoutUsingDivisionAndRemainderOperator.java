package day22_StringPractice_LoopPractice_DoWhileLoop_System_Exit;

import java.util.Scanner;

public class DivideTwoNumbers2_WithoutUsingDivisionAndRemainderOperator {

    public static void main(String[] args) {

        /*  WarmUp Task 4:
            write a program that can divide two numbers without using / & % operators and retuns the devision and remainder
			ex:
				input:  10
						3
				0utput:
						3 with a remainder of 1
				10 / 3 = 3.3333....
				10 - 3 = 7
				7 - 3 = 4
				4 - 3 = 1
				3 times subtraction, numerator at the end is 1
				19 / 2
				19 - 2 = 17;
				17 - 2 = 15;
				15 - 2 = 13;
				13 - 2 = 11;
				11 - 2 = 9;
				9 - 2 = 7;
				7 - 2 = 5;
				5 > 2 = 3
				3 - 2 = 1;
				9 times execution, numerator is 1
				result: 9 with a remainder of 1
         */

        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        scan.close();

        int count =0;

        for( count = 0; a >= b; count++ ){
            a -= b;
        }

        System.out.println(count+" with a remainder of "+a);

    }

}