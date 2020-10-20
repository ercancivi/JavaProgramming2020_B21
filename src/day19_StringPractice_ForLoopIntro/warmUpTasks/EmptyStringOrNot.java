package day19_StringPractice_ForLoopIntro.warmUpTasks;

import java.util.Scanner;

public class EmptyStringOrNot {

    public static void main(String[] args) {

        /*  Warmup tasks 7:
            write a method that asks user to enter a string.
                if the string is empty, print: string is empty
                if the string has more than 3 characters, print the last three characters
                if the string has less than or equal 3 characters, print the string itself
         */
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a word : ");
        String word = scan.nextLine();

        scan.close();

        String result = "";

        if(word.isEmpty()) {
            System.out.println("string is empty");
        }else if(word.length() <= 3) {
            System.out.println(word);
        }else {
            System.out.println(word.substring(word.length()-3));
        }

    }

}
