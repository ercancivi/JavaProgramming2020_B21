package day16_Scanner_MethodsToRead_Strings;

import java.util.Scanner;

public class EmployeeInfo {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first name");
        String firstName = input.next();

        System.out.println("Enter your last name");
        String lastName = input.next();

        System.out.println("Are you employed? True or false");
        boolean isEmployed = input.nextBoolean();

        double salary = 0;

        if(isEmployed){
            System.out.println("What is your salary");
            salary = input.nextDouble();
        }

        System.out.println("Full name: " + firstName + " " + lastName);
        System.out.println("Employed: " + isEmployed);
        System.out.println("Salary " + salary);

    }

}
