package day17_String.lunchTimeTasks;

import java.util.Scanner;

public class TwoStringConcatenation {

    public static void main(String[] args) {

        /*  ask the user to enter two words. then add them together and print
			ex:
				input:
					one
					eight

				output:
					oneeight

					DO NOT use + operator
         */

        String word1, word2, concatenationBothWords;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter two words : ");
        word1 = scan.next();
        word2 = scan.next();

        concatenationBothWords = word1.concat(word2);
        System.out.println("concatBothWords = " + concatenationBothWords);

        scan.close();

    }

}
