package day21_WhileLoops;

public class DivisibleBy3WithContinue {

    public static void main(String[] args) {

        /*  BreakTime Task 3:
            print numbers between 1 to 50 that are evenly divisible by 3 (MUST use continue statement)
         */
        for(int i = 1; i <= 50; i++) {
            if(i % 3 != 0) {
                continue;
            }
            System.out.print(i + " ");
        }

    }

}
