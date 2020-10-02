package day10_IfElseStatement_And_Review_Of_Previous_Days.warmUpTasksByMe;

public class MaximumNumber {

    public static void main(String[] args) {

        /*  Task03: MaximumNumber
            write a java program that accepts three numbers and return the maximum number
            (assume that none of them are equal)
         */
        int a = 13;
        int b = 7;
        int c = 15;

        if(a > b && a > c) {
            System.out.println("a = " + a + " is the maximum number");
        }

        if(b > a && b > c) {
            System.out.println("b = " + b + " is the maximum number");
        }

        if(c > a && c > b) {
            System.out.println("c = " + c + " is the maximum number");
        }


    }

}
