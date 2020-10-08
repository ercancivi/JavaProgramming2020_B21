package day13_SwitchStatement.warmUpTasks;

public class ConvertNumbersToWords {

    public static void main(String[] args) {

        /*  Task 1 :
            write a java program that can convert numbers between 0 ~ 9 to words,
            if the number is greater than 9 or less than zero, out put should be "Invalid".

            Note: MUST USE NESTED IF
         */
        int number = 10;
        String word = "";

        if (number >= 0 && number <= 9) {

            if (number == 0) {
                word = "zero";
            } else if (number == 1) {
                word = "one";
            } else if (number == 2) {
                word = "two";
            } else if (number == 3) {
                word = "three";
            } else if (number == 4) {
                word = "four";
            } else if (number == 5) {
                word = "five";
            } else if (number == 6) {
                word = "six";
            } else if (number == 7) {
                word = "seven";
            } else if (number == 8) {
                word = "eight";
            } else {
                word = "nine";
            }

        } else {
            word = "Invalid";
        }

        System.out.println("word = " + word);


        System.out.println("\n===== with Ternary =====\n");


        String word1 = !(number >= 0 && number <= 9) ? "Invalid" : (number == 0) ? "zero" : (number == 1) ? "one"
                : (number == 2) ? "two" : (number == 3) ? "three" : (number == 4) ? "four" : (number == 5) ? "five"
                : (number == 6) ? "six" : (number == 7) ? "seven" : (number == 8) ? "eight" : "nine";

        System.out.println("word1 = " + word1);


    }

}
