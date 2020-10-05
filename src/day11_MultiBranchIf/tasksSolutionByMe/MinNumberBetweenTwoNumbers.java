package day11_MultiBranchIf.tasksSolutionByMe;

public class MinNumberBetweenTwoNumbers {

    public static void main(String[] args) {

        /*  Task 2:
            write a program that can find the minimum number between two different numbers
            first solution : if & else statement
            second solution : do NOT use any if statement
        */

        int n1 = 15;
        int n2 = 10;

        System.out.println("===== first solution : if & else statement =====");

        int min = 0;

        if(n1 < n2) {
            min = n1;
        }else {
            min = n2;
        }
        System.out.println("min number is = " + min);


        System.out.println("===== do NOT use any if statement =====");


        int min1 = (n1 < n2) ? n1 : n2;
        System.out.println("min number is = " + min1);

    }
}
