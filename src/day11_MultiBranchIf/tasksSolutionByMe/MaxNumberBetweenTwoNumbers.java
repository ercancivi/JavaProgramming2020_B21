package day11_MultiBranchIf.tasksSolutionByMe;

public class MaxNumberBetweenTwoNumbers {

    public static void main(String[] args) {

        /*  Task 1:
            write a program that can find the maximum number between two different numbers
            first solution : if & else statement
            second solution : do NOT use any if statement
        */

        int n1 = 10;
        int n2 = 7;

        System.out.println("===== first solution : if & else statement =====");

        int max = 0;

        if(n1 > n2) {
            max = n1;
        }else {
            max = n2;
        }
        System.out.println("max number is = " + max);


        System.out.println("===== do NOT use any if statement =====");


        int max1 = (n1 > n2) ? n1 : n2;
        System.out.println("max number is = " + max1);
    }
}
