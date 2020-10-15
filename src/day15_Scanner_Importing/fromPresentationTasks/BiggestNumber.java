package day15_Scanner_Importing.fromPresentationTasks;

import java.util.Scanner;

public class BiggestNumber {

    public static void main(String[] args) {

        /*  Ask user to enter three numbers. Print the biggest number from the entered numbers
            Ex:
            Input: 3,6,4
            Output: The biggest number from 3,6, 4 is 6
         */

        Scanner input = new Scanner(System.in);

        System.out.print("Enter three numbers separated by space : ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();

        boolean num1IsMax = num1 > num2 && num1 > num3;
        boolean num2IsMax = !num1IsMax && num2 > num3;
        boolean num3IsMax = !num1IsMax && !num2IsMax;

        int biggestNumber = 0;

        if(num1IsMax) {
            biggestNumber = num1;
        }else if(num2IsMax) {
            biggestNumber = num2;
        }else {
            biggestNumber = num3;
        }

        System.out.println("biggestNumber is = " + biggestNumber);



    }

}
