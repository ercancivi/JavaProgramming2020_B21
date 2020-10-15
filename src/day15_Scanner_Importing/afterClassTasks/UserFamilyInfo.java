package day15_Scanner_Importing.afterClassTasks;

import java.util.Scanner;

public class UserFamilyInfo {

    public static void main(String[] args) {

        /*  Ask the user to enter their zipcode (long),
            the number of people they live with (byte),
            if they are married or not (boolean - true for married/false for not)
            and print the values in the following format:

            "I see you are $marriedOrNot! and
            live with $peopleNum people in your house which is in the $zipcode area! "
                Ex: 31009, 4, false -->
                I see you are not married and live with 4 people in your house which is in the 31009 area!
         */

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your zipcode : ");
        long zipCode = input.nextLong();

        System.out.print("Enter number of people you live with : ");
        byte numOfPeopleLiveWith = input.nextByte();

        System.out.print("Enter your marriage status - Are you married or not? : ");
        boolean isMarried = input.nextBoolean();

        String isMarriedOrNot = (isMarried) ? "married" : "not married";

        String userFamilyInfo = "I see you are " + isMarriedOrNot + " and live with " + numOfPeopleLiveWith
                                + " people in your house which is in the " + zipCode + " zipcode area!";

        System.out.println(userFamilyInfo);


    }

}
