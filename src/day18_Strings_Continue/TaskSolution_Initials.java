package day18_Strings_Continue;

import java.util.Scanner;

public class TaskSolution_Initials {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println(" Enter two words separated by space : ");
        String word1 = scan.next();
        String word2 = scan.next();

        String initials = word1.substring(0,1) + "." + word2.substring(0,1);
        System.out.println("initials = " + initials);
    }
}
