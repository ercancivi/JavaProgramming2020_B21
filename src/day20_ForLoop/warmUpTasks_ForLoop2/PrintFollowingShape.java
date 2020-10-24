package day20_ForLoop.warmUpTasks_ForLoop2;

public class PrintFollowingShape {

    public static void main(String[] args) {

        /*  WarmUp Task 2:
            print the following shape:
                * * * * * *
                * * * * * *
                * * * * * *
                * * * * * *
                * * * * * *
                * * * * * *
                * * * * * *
                * * * * * *
         */

        for(int i = 1; i <= 8; i++) {
            System.out.println();
            System.out.print("\t");
            for(int j = 1; j <= 6; j++) {
                System.out.print("* ");
            }
        }


    }

}
