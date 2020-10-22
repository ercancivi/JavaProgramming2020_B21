package day20_ForLoop.warmUpTasks_ForLoop;

import java.util.Scanner;

public class PalindromeString {

    public static void main(String[] args) {

        /*  WarmUp Task 6:
            write a program that can verify if the user entered String is palindrome
			ex:
				input: Level
				output: Level is palindrome

				input: java
				output: java is not palindrome
         */
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a word : ");
        String word = scan.next();

        scan.close();

        String reversedWord = "";
        for(int i = word.length() - 1; i >= 0; i--) {
            reversedWord += word.charAt(i);
        }

        if(reversedWord.toLowerCase().equals(word)) {
            System.out.println(word + " is palindrome");
        }else {
            System.out.println(word + " is not palindrome");
        }

    }

}
