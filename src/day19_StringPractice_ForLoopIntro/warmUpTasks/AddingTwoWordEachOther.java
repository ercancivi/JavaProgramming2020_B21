package day19_StringPractice_ForLoopIntro.warmUpTasks;

import java.util.Scanner;

public class AddingTwoWordEachOther {

    public static void main(String[] args) {

        /*  Warmup tasks 4:
            Ask user to enter two words. Then add them together and print.
            But if the last letter if the first word and the first letter of the last letter is the same,
            print that character once.
                            Input:
                                one
                                eight
                            Output:
                                oneight
         */
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter two words separated by space : ");
        String word1 = scan.next().trim().toLowerCase();
        String word2 = scan.next().trim().toLowerCase();

        String word = "";
        if(word1.charAt(word1.length()-1) == word2.charAt(0)) {
            word = word1.concat(word2.substring(1));
        }else {
            word = "words are invalid";
        }
        System.out.println(word);

        System.out.println("========== solution 2 ==========");


        System.out.println("Enter two words separated by space : ");
        String word3 = scan.next().trim().toLowerCase();
        String word4 = scan.next().trim().toLowerCase();

        String newWord = "";
        if(word3.substring(word3.length()-1).equals(word4.substring(0, 1))) {
            newWord = word3.substring(0, word1.length()-1) + word4;
        }else {
            newWord = "words are invalid";
        }
        System.out.println(newWord);

        scan.close();
    }

}
