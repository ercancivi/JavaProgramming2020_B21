package day21_WhileLoops;

import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {

        /*  SumOfNumbers
            Write a program that calculates the sum of numbers entered by the user until user enters a negative number.
                hint: you need an infinite loop
         */

        Scanner scan = new Scanner(System.in);
        int result = 0; // 5 + 10 = 15 + 20 = 35 ...

        for(int i = 0; i < 1; ){

            System.out.println("Enter a number: ");
            int num = scan.nextInt() ; // 5, 10, 20

            if(num<0){ // if the user entered number is negative, it will not be added to teh result.
                break;
            }

            result += num;

        }

        scan.close();

        System.out.println("result = " + result);





    }

}
