package day09_IfStatement;

public class MaximumMinimum {

    public static void main(String[] args) {

        /* Task 2 :
           write a program that can print out the maximum number between two numbers
            Ex:
                num1 = 20;
                num2 = 30;
                output:
                    30 is the maximum number
                num1 = 20;
                num2 = 20;
                output:
                    both numbers are equal
            Task 3 :
            write a program that can print out the minimum number between two numbers
            Ex:
                num1 = 20;
                num2 = 30;
                output:
                    20 is the minimum number
         */

        System.out.println("=========== Task 2 ============");

        int n1 = 300;
        int n2 = 4;

        //maximum
        boolean n1IsMax = n1 > n2; //n1 to be the maximum number
        boolean n2IsMAx = n2 > n1; //n2 to be the maximum number

        if(n1IsMax) {
            System.out.println("n1 = " + n1 + " is maximum");
        }

        if(n2IsMAx) {
            System.out.println("n2 = " + n2 + " is maximum");
        }


        //equal
        boolean equal = !n1IsMax && !n2IsMAx; //n1 == n2 ==> n1 is equal to n2

        if(equal) {
            System.out.println("n1 = " + n1 + " and n2 = " + n2 + " both are equal");
        }

        System.out.println("=========== Task 3 ============");

        //minimum
        boolean n1IsMin = n1 < n2; //n1 to be the minimum number
        boolean n2IsMin = n2 < n1; //n2 to be the minimum number

        if(n1IsMin) {
            System.out.println("n1 = " + n1 + " is minimum");
        }

        if(n2IsMin) {
            System.out.println("n2 = " + n2 + " is minimum");
        }


    }

}
