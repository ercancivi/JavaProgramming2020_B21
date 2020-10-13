package day15_Scanner_Importing;

import java.util.Scanner;

public class EvenOrOdd {

    public static void main(String[] args) {

        /*
	    Ask the user to enter an int number, print if the number is even or odd
        */

        Scanner in = new Scanner(System.in);

        System.out.println("Enter a number");
        int number = in.nextInt();

        if(number % 2 == 0) {
            System.out.println(number + " is even");
        } else {
            System.out.println(number + " is odd");
        }

    }

}
