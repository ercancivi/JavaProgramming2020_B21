package day17_String.lunchTimeTasks;

import java.util.Scanner;

public class InitialsOfFirstAndLastName {

    public static void main(String[] args) {

        /*  write a program to ask use to enter first name and last name
			then print the initials (first letter of first name + first letter of last name)
         */

        String firstName, lastName, initials;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your first name and last name separated by space : ");
        firstName = scan.next();
        lastName = scan.next();

        initials = firstName.charAt(0) + "" + lastName.charAt(0);

        System.out.println("initials = " + initials);

        scan.close();
    }

}
