package day15_Scanner_Importing.fromPresentationTasks;

import java.util.Scanner;

public class EqualityCheck {

    public static void main(String[] args) {

        /*
            Write a program that will accept two numbers and check if two numbers are equal or not.
         */

        Scanner input = new Scanner(System.in);

        System.out.print("Enter two numbers separated by space : ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        boolean isEqual = num1 == num2;
        String equalityOfTwoNumbers = "is " + num1 + " equal to " + num2 + " : " + isEqual;
        System.out.println(equalityOfTwoNumbers);

    }

}
