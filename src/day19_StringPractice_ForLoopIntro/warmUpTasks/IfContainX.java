package day19_StringPractice_ForLoopIntro.warmUpTasks;

import java.util.Scanner;

public class IfContainX {

    public static void main(String[] args) {

        /*  Warmup tasks 2:
            Ask user to enter a word. If the work contains starts with x, print the word without x.
                            Input:
                                xcode
                            Output:
                                code
         */
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a word : ");
        String word = scan.next().trim().toLowerCase(); //this will change original word whatever user enter


        if(word.startsWith("x")) {
            word = word.substring(1);   //this will change original word whatever user enter
        }else {
            word = "the word does not start with letter x"; //this will change original word whatever user enter
        }
        System.out.println(word);


        System.out.println("========== solution 2 ==========");


        System.out.println("Enter a word : ");
        String word1 = scan.next().trim().toLowerCase(); //this will change original word whatever user enter

        if(word1.charAt(0) == 'x') {
            word1 = word1.replace("x", ""); //this will change original word whatever user enter
        }else {
            word1 = "the word does not start with letter x";    //this will change original word whatever user enter
        }
        System.out.println(word1);

        scan.close();
    }

}
