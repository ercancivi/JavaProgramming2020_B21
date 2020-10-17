package day17_String.lunchTimeTasks;

import java.util.Scanner;

public class FullNameToUpperCase {

    public static void main(String[] args) {

        /*  write a program to ask user to enter first name and last name
			then print the full name in all upper case
         */

        String firstName, lastName, fullName;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your first name and last name separated by space : ");
        firstName = scan.next();
        lastName = scan.next();
        fullName = firstName + " " + lastName;

        fullName = fullName.toUpperCase();
        System.out.println("fullName = " + fullName);

        scan.close();

    }

}
