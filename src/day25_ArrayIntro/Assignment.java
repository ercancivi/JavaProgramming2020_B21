package day25_ArrayIntro;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Assignment {

    public static void main(String[] args) {

        /*  write a program that can find the frequency of each characters from a string
			str = "ababcaa";
					// nonDup =  "abc"  a b c
					  //     frequency: 4 2 1
			output:
				a4b2c1
         */
        
        String str = "ababcaa";
        
        String result = "";
        for (int j = 0; j < str.length(); j++) {
            int frequency = 0;
            char ch = str.charAt(j);

            for (int i = 0; i < str.length(); i++) {

                char eachChar = str.charAt(i);

                if (eachChar == ch) {
                    frequency++;
                }

            }
            if (!result.contains("" + ch)) {
                result += "" + ch + frequency;
            }

        }

        System.out.println("result = " + result);
        








    }

}
