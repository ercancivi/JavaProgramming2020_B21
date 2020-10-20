package day19_StringPractice_ForLoopIntro.warmUpTasks;

import java.util.Scanner;

public class CheckWords {

    public static void main(String[] args) {

        /*  Warmup tasks 6:
            Write a program  for CheckWords:
               Program accepts 3 words and :
              - if they are same length:      print "All words are same length"
              - if some same length and others not:    print "Not Same nor Different lengths"
              - if all different length :  print "All different length"

         */
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first word : ");
        String word1 = scan.nextLine();

        System.out.println("Enter second word : ");
        String word2 = scan.nextLine();

        System.out.println("Enter third word : ");
        String word3 = scan.nextLine();

        scan.close();

        String result = "";

        if(word1.length() == word2.length() && word1.length() == word3.length()) {
            result = "All words are same length";
        }else if(word1.length() != word2.length() && word1.length() != word3.length()) {
            result = "All different length";
        }else {
            result = "Not Same nor Different lengths";
        }
        System.out.println(result);


    }

}
