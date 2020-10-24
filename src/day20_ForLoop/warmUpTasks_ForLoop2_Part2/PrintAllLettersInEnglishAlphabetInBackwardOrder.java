package day20_ForLoop.warmUpTasks_ForLoop2_Part2;

public class PrintAllLettersInEnglishAlphabetInBackwardOrder {

    public static void main(String[] args) {

        /*  WarmUp Task 4:
            Write a program that will print out all letters in English alphabet in backwards
         */
        for(char i = 'Z'; i >='A'; i--) {
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println("===================================================");

        for(char i = 'z'; i >='a'; i--) {
            System.out.print(i + " ");
        }

    }

}
