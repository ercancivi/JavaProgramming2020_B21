package day18_Strings_Continue;

import java.util.Scanner;

public class TaskSolution_CheckingFirstAndLastCharacterEquality {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println(" Enter two words separated by space : ");
        String word = scan.next();

        boolean isEqual = word.substring(0,1).equals(word.substring(word.length()-1));

        String sameOrNotSame = (isEqual) ? "same" : "not same";
        System.out.println(sameOrNotSame);
    }

}
