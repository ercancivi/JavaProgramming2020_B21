package day17_String.lunchTimeTasks;

import java.util.Scanner;

public class LongestString_BetweenTwoStrings {

    public static void main(String[] args) {

        /*  write a program that asks user to enter two string
			then print the longest string
         */

        String stringOne, stringTwo, longestString;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your two String separated by space : ");
        stringOne = scan.next();
        stringTwo = scan.next();

        if(stringOne.length() > stringTwo.length()) {
            longestString = stringOne;
        }else if(stringTwo.length() > stringOne.length()) {
            longestString = stringTwo;
        }else {
            longestString = "Strings are equals";
        }

        System.out.println("Longest String is = " + longestString);


        System.out.println("===== with nextLine =====");

        scan.nextLine(); //we use scan.next() method above that is why we put scan.nextLine(); here

        String firstString, secondString, longestString1;

        System.out.println("Enter your first String : ");
        firstString = scan.nextLine();

        System.out.println("Enter your first String : ");
        secondString = scan.nextLine();

        if(firstString.length() > secondString.length()) {
            longestString1 = firstString;
        }else if(secondString.length() > firstString.length()) {
            longestString1 = secondString;
        }else {
            longestString1 = "Strings are equals";
        }

        System.out.println("Longest String is = " + longestString1);

        scan.close();

    }

}
