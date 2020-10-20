package day19_StringPractice_ForLoopIntro.warmUpTasks;

import java.util.Scanner;

public class IsWordEndsWith_Ly {

    public static void main(String[] args) {

        /*  Warmup tasks 8:
            ask the user to enter a word.
                if the word ends with "ly", print "really???"
                otherwise, print "never mind"
         */
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a word : ");
        String word = scan.nextLine();

        scan.close();

        if(word.endsWith("ly")) {
            System.out.println("really???");
        }else {
            System.out.println("never mind");
        }

        System.out.println("====== second solution ======");

        if(word.substring(word.length()-2).equalsIgnoreCase("ly")) {
            System.out.println("really???");
        }else {
            System.out.println("never mind");
        }

    }

}
