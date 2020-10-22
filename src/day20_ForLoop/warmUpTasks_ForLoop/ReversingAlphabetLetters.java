package day20_ForLoop.warmUpTasks_ForLoop;

public class ReversingAlphabetLetters {

    public static void main(String[] args) {

        /*  WarmUp Task 2:
            Write a program that will print out all alphabet letters in backwards
         */
        char alphabetLetter = ' ';
        for(char i = 'Z'; i >= 'A'; i--) {
            System.out.print(i + " ");
        }
    }
}
