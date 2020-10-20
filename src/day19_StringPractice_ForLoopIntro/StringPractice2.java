package day19_StringPractice_ForLoopIntro;

import java.util.Scanner;

public class StringPractice2 {

    public static void main(String[] args) {

        /*  ask the user to enter a word.
            if the word ends with "ly", print "really???" ,  otherwise, print "never mind"
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = scan.next();

        System.out.println(  (word.endsWith("ly")) ? "really??" : "Never mind"  );

    }

}
