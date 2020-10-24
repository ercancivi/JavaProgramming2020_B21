package day21_WhileLoops;

public class OddNumberWithContinue {

    public static void main(String[] args) {

        /*  BreakTime Task 1:
            print odd number between 1 to 50 (MUST use continue statement)
         */
        for(int i = 1; i <= 50; i++) {
            if(i % 2 == 0) {
                continue;
            }
            System.out.print(i + " ");
        }

    }

}
