package day09_IfStatement;

public class OddEven {

    public static void main(String[] args) {

        /*  Task 1 :
            write a program that can check if the given number is odd or even
                Ex :
                    number = 100;
                    output :
                        100 is even number

                    number = 101
                    output :
                        101 is odd number

         */
        int number = 100;

        boolean even = number % 2 == 0;
//        boolean odd = !even;

        if(even) {
            System.out.println(number + " is even number" );
        }

//        if(odd) {
//            System.out.println(number + " is odd number");
//        }

        if(!even) {
            System.out.println(number + " is odd number");
        }


    }

}
