package day09_IfStatement.warmUpTasksByMyself;

public class WithoutTemporaryVariable {

    public static void main(String[] args) {

        /*  Warm Up Task 4 :
            write a program that can swipe two variables' value without using a temporary variable
                Ex:
                    a =10;
                    b= 15;
                output:
                    a is 15
                    b is 10
                    Hint: you will need to use some Arithmetical Operators
         */

        int a = 10;
        int b = 15;

            a = a + b; // ==> same with ==> a += b; ==> now a is == 25
            b = a - b; // ==> same with ==> b += -(b-a); ==> now b is == 10
            a = a - b; // ==> same with ==> a -= b; ==> now a is == 15

        System.out.println("a is " + a);
        System.out.println("b is " + b);

    }

}
