package day20_ForLoop.warmUpTasks_ForLoop2_Part2;

public class PrintAllLettersInEnglishAlphabetInAscendingOrder {

    public static void main(String[] args) {

        /*  WarmUp Task 3:
            Write a program that will print out all letters in English alphabet in ascending order
         */
        for(char i = 'A'; i <='Z'; i++) {
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println("===================================================");

        for(char i = 'a'; i <='z'; i++) {
            System.out.print(i + " ");
        }

    }

}
