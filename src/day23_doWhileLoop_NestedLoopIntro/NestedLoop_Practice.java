package day23_doWhileLoop_NestedLoopIntro;

public class NestedLoop_Practice {

    public static void main(String[] args) {

        //print rectangle shape with *
        for(int j = 1; j <= 10; j++) {

            for(int i = 1; i <= 7; i++) {
                System.out.print("*");
            }

            System.out.println();
        }

        System.out.println("\n");

        //print triangle with *
        for(int j = 1; j <= 10; j++) {

            System.out.print("\t");

            for(int i = 1; i <= j; i++) {
                System.out.print("*");
            }

            System.out.println();
        }

        System.out.println("\n");

        //print half-diamond with *
        for(int j = 1; j <= 10; j++) {

            System.out.print("\t");

            for(int i = 1; i <= j; i++) {
                System.out.print("*");
            }

            System.out.println();
        }

        for(int j = 10; j >= 1; j--) {

            System.out.print("\t");

            for(int i = j; i >= 1; i--) {
                System.out.print("*");
            }

            System.out.println();
        }



    }

}
