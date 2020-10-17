package day17_String.lunchTimeTasks;

import java.util.Scanner;

public class NumberOfBabies {

    public static void main(String[] args) {

        /*  write a program that asked the user to enter the number of babies they are having and print a message:
                0: "Sorry"
                1: "Congratulations"
                2: "Wow Twins"
                3: "Wow. Triplets!"
                4, 5, 6: "Unbelievable, $umberOfBabies babies!"
                Any other: "I don't believe you"
         */

        int numberOfBabies;
        String message;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter number Of Babies");
        numberOfBabies = scan.nextInt();

        switch(numberOfBabies) {
            case 0:
                message = "Sorry";
                break;
            case 1:
                message = "Congratulations";
                break;
            case 2:
                message = "Wow Twins";
                break;
            case 3:
                message = "Wow. Triplets!";
                break;
            case 4:
            case 5:
            case 6:
                message = "Unbelievable, " + numberOfBabies + " babies!";
                break;
            default:
                message = "I don't believe you";
                break;
        }

        System.out.println(message);

        scan.close();

    }

}
