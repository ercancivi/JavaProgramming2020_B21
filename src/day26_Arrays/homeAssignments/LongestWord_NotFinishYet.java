package day26_Arrays.homeAssignments;

import java.util.Arrays;

public class LongestWord_NotFinishYet {

    public static void main(String[] args) {

        /*  print out the longest words from an array of String

			String[] words = {"Monday", "Apple", "Banana", "Strawberry", "Blackberry"};

			output:
				Strawberry Blackberry
         */

        String[] words = {"Monday", "Apple", "Banana", "Strawberry", "Blackberry"};

        String result = ""; // Strawberry Blackberry

        Arrays.sort(words);

        for(int j = 0; j < words.length; j++) {
            String word = words[j];

            for (int i = 1; i < words.length; i++) {
                String eachWord = words[i];

                if(word.length() > eachWord.length() && !result.contains(word)) {
                    result += word + " ";
                }

            }

        }
        System.out.println("result = " + result);

    }

}
