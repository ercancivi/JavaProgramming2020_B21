package day23_DoWhileLoop_NestedLoopIntro;

public class Print_Half_Diamond_WithStars {

    public static void main(String[] args) {

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
