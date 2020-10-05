package day11_MultiBranchIf.tasksSolutionByMe;

public class LargestNumberByMe {

    public static void main(String[] args) {

        /*  Task 1  :
            • Declare 3 numbers
            • Program should display which one is largest
         */

        int n1 = 100;
        int n2 = 300;
        int n3 = 400;

        boolean isN1Max = n1 > n2 && n1 > n3;
        boolean isN2Max = !isN1Max && n2 > n3;
        boolean isN3Max = !isN1Max && !isN2Max;

        String isMax = " is the maximum number";

        if(isN1Max) {
            System.out.println(n1 + isMax);
        }else if(isN2Max) {
            System.out.println(n2 + isMax);
        }else {
            System.out.println(n3 + isMax);
        }

    }

}
