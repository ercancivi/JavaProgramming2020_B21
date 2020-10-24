package day20_ForLoop.warmUpTasks_ForLoop2;

public class PrintFollowingShape2 {

    public static void main(String[] args) {

        /*  WarmUp Task 3:
            print the following shape:
                    * * * * * *
                    *         *
                    *         *
                    *         *
                    *         *
                    *         *
                    *         *
                    *         *
                    *         *
                    * * * * * *
            Hint: in the loop body , only place the statements that you need to repeat
         */
        for(int i = 1; i <= 10; i++) {

            System.out.println();
            System.out.print("\t");
            if(i == 1 || i == 10) {
                for (int j = 1; j <= 6; j++) {
                    System.out.print("* ");
                }
            }

            if(i > 1 && i < 10) {
                System.out.print("*         *");
            }

        }

    }

}
