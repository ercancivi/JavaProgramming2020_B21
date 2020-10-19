package day18_Strings_Continue;

import java.util.Scanner;

public class SubStringPractice {

    public static void main(String[] args) {

        /*  Task:
            1. Ask user to enter two words. Print first word without its first character
               then print the second word without its first character.
                            Input:
                                apple
                                banana
                            Output:
                                ppleanana
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two words");
        String str1 =  scan.nextLine();
        String str2 = scan.nextLine();

        String result = str1.substring(1, str1.length()) + str2.substring(1, str2.length()) ;

        System.out.println(result);

    }

}
