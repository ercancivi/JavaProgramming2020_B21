package day10_IfElseStatement_And_Review_Of_Previous_Days.warmUpTasksByMe;

public class MinimumNumber {

    public static void main(String[] args) {

        /*  Task04: MinimumNumber
            write a java program that accepts three numbers and return the minimum number
            (assume that none of them are equal)
         */
        int a = 3;
        int b = 7;
        int c = 5;

        if(a < b && a < c) {
            System.out.println("a = " + a + " is the minimum number");
        }

        if(b < a && b < c) {
            System.out.println("b = " + b + " is the minimum number");
        }

        if(c < a && c < b) {
            System.out.println("c = " + c + " is the minimum number");
        }

    }

}
