package day19_StringPractice_ForLoopIntro.warmUpTasks;

import java.util.Scanner;

public class LongestString {

    public static void main(String[] args) {

        /*  Warmup tasks 1:
            write a program that can return the longest string from two user inputs
         */
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter two words separated by space : ");
        String word1 = scan.next().trim();  //this will change original word whatever user enter
        String word2 = scan.next().trim();  //this will change original word whatever user enter

        scan.close();

        String longestWord = "";
        if(word1.length() != word2.length()) {

            if(word1.length() > word2.length()) {
                longestWord = word1;
            }else {
                longestWord = word2;
            }
        }else{
            longestWord = "Both words are equal";
        }
        System.out.println("Longest Word is = " + longestWord);

    }

}
