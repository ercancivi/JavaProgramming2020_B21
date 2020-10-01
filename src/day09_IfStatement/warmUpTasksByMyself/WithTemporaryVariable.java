package day09_IfStatement.warmUpTasksByMyself;

public class WithTemporaryVariable {

    public static void main(String[] args) {

        /*  Warm Up Task 3 :
            write a program that can swipe two variables' value by using a temporary variable
                Ex:
                    a =10;
                    b= 15;
                output:
                    a is 15
                    b is 10
         */

        int a =10;
        int b= 15;

        int temp = a;
            a = b;
            b = temp;

        System.out.println("a is " + a);
        System.out.println("b is " + b);


    }

}
