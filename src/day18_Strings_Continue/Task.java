package day18_Strings_Continue;

import java.util.Scanner;

public class Task {

    public static void main(String[] args) {

        /*  Ask user to enter two words.
        Print first word without its first character
        then print the second word without its first character
            Input  : apple
                     banana
            Output : ppleanana
        */

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter two words");
        String word1 = scan.next();
        String word2 = scan.next();

        word1 = word1.substring(1, word1.length());  //word1 = word1.substring(1);
        word2 = word2.substring(1, word2.length());  //word2 = word2.substring(1);

        String word1Word2 = word1.concat(word2);
        System.out.println("word1Word2 = " + word1Word2);

    }

}
