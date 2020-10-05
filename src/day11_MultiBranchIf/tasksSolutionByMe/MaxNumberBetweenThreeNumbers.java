package day11_MultiBranchIf.tasksSolutionByMe;

public class MaxNumberBetweenThreeNumbers {

    public static void main(String[] args) {

        /*  Task 3:
            write a program that can find the maximum number between three different numbers
            first solution : multi-branch if statement
            second solution : do NOT use any if statement
         */

        int n1 = 10;
        int n2 = 25;
        int n3 = 15;

        System.out.println("======== second solution with multi-branch if statement ========");

        int max = 0;

        boolean n1Max = (n1 > n2 && n1 > n3);
        boolean n2Max = (!n1Max && n2 > n3);
        boolean n3Max = (!n1Max && !n2Max);

        if(n1Max) {
            max = n1;
        }else if(n2Max) {
            max = n2;
        }else {
            max = n3;
        }

        System.out.println("max number is = " + max);


        System.out.println("======== second solution with Ternary ========");


        int max1 = (n1Max) ? n1 : (n2Max) ? n2 :n3;
        System.out.println("max number is = " + max1);



    }

}
