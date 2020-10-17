package day17_String.lunchTimeTasks;

import java.util.Scanner;

public class NewAge {

    public static void main(String[] args) {

        /*  write a program to ask the user their age. Add 5 to their age and print:
            In 5 years you will be $newAge years old
         */

        int age, newAge;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your age");
        age = scan.nextInt();
        newAge = age + 5;

        System.out.println("In 5 years you will be " + newAge + " years old");

        scan.close();

    }

}
