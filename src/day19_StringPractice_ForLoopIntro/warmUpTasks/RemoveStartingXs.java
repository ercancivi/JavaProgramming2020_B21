package day19_StringPractice_ForLoopIntro.warmUpTasks;

import java.util.Scanner;

public class RemoveStartingXs {

    public static void main(String[] args) {

        /*  Warmup tasks 3:
            Ask user to enter a word.
                If the first or second or both letter of the word is x, print the word without x(s).
                If x is the third letter it should be printed. If the first and second are x, both should be ignored.
                            Input:
                                xxode
                            Output:
                                ode

                            Input:
                                oxidex
                            Output:
                                oidex
         */
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a word : ");
        String word = scan.next().trim().toLowerCase();

        scan.close();

        if(word.substring(0,2).contains("x")) {
             word = word.substring(0,2).replace("x", "")+ word.substring(2);
        }else {
            word = "the word does not contain letter x in its first two characters";
        }
        System.out.println(word);

    }

}
