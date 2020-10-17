package day17_String.lunchTimeTasks;

import java.util.Scanner;

public class FirstAndLastCharacters {

    public static void main(String[] args) {

        /*  write a program that ask user to enter sentence.
		    then print out the first and last characters
         */
        String sentence;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a sentence");
        sentence = scan.nextLine();

        System.out.println("" + sentence.charAt(0) + sentence.charAt(sentence.length() - 1));

        scan.close();
    }

}
