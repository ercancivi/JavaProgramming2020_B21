package day20_ForLoop.warmUpTasks_ForLoop;

import java.util.Scanner;

public class ReversingString {

    public static void main(String[] args) {

        /*  WarmUp Task 5:
            write a program that can reverse any given string
			ex:
				input: abcd
				output: dcba

				input: Cybertek
				output: ketrebyC
         */
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a word : ");
        String word = scan.next();

        scan.close();

        for(int i = word.length() - 1; i >= 0; i--) {
            System.out.print(word.charAt(i));
        }

    }

}
