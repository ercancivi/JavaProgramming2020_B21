package day21_WhileLoops.warmUpTasks;

import java.util.Scanner;

public class CalculateFactorial {

    public static void main(String[] args) {

        /*  WarmUp Task 2:
            Write a program that can return the factorial number of any given number
			Ex:
				input: 5
				output: 120  ( because: 5! = 5 * 4 * 3 * 2* 1 = 120 )
         */
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a integer number: ");
        int number = scan.nextInt();

        int factorial = 1;

        for(int i = 1; i <= number; i++) {
            factorial *= i;
        }
        System.out.println("factorial = " + factorial);
        scan.close();
    }

}
