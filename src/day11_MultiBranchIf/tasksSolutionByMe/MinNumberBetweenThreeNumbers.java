package day11_MultiBranchIf.tasksSolutionByMe;

public class MinNumberBetweenThreeNumbers {

    public static void main(String[] args) {

        /*  Task 4:
            write a program that can find the minimum number between three different numbers
            first solution : multi-branch if statement
            second solution : do NOT use any if statement
         */

        int n1 = 10;
        int n2 = 25;
        int n3 = 15;

        System.out.println("======== second solution with multi-branch if statement ========");

        int min = 0;

        boolean n1Min = (n1 < n2 && n1 < n3);
        boolean n2Min = (!n1Min && n2 < n3);
        boolean n3Min = (!n1Min && !n2Min);

        if(n1Min) {
            min = n1;
        }else if(n2Min) {
            min = n2;
        }else {
            min = n3;
        }

        System.out.println("Minimum number is = " + min);


        System.out.println("======== second solution with Ternary ========");


        int min1 = (n1Min) ? n1 : (n2Min) ? n2 :n3;
        System.out.println("Minimum number is = " + min1);

    }

}
