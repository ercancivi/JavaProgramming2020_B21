package day26_Arrays.homeAssignments;

public class UniqueWord {

    public static void main(String[] args) {

        /*  print the unique words from an array of String

			String[] words = {"C#", "Java", "C#", "Python", "Python", "Ruby", "Swift", "C++", "Swift"}

			output:
				Java Ruby C++
         */

        String[] words = {"C#", "Java", "C#", "Python", "Python", "Ruby", "Swift", "C++", "Swift"};

        String result = ""; // Java, Ruby, C++

        for(int j = 0; j < words.length; j++) {

            String eachWord = words[j];
            int count = 0;
            for (int i = 0; i < words.length; i++) {
                String tempWord = words[i];
                if (tempWord.equals(eachWord)) {
                    count++;
                }

            }

            if (count == 1) {
                result += eachWord + " ";
            }

        }

        System.out.println("result = " + result);

    }

}
