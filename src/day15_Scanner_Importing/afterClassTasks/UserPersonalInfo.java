package day15_Scanner_Importing.afterClassTasks;

import java.util.Scanner;

public class UserPersonalInfo {

    public static void main(String[] args) {

        /*  Ask the user to enter their height (double), shoe size (byte),
            and if they like to wear hats (boolean).
            Print out the information
         */

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your height : ");   //System.out.print("Enter your height : ");
        double height = input.nextDouble();

        System.out.print("Enter your shoe size : ");    //System.out.print("Enter your shoe size : ");
        byte shoeSize = input.nextByte();

        System.out.print("Do you want to wear hat : "); //System.out.print("Do you want to wear hat : ");
        boolean wantToWearHat = input.nextBoolean();

        String userPersonalInfo = "User's height is " + height + "feet, shoe size is " + shoeSize
                                        + " and is user want to wear hat ? : " + wantToWearHat;

        System.out.println(userPersonalInfo);


    }

}
