package day12_NestedIf.warmUpTasks;

public class EqualityOfNumbers {

    public static void main(String[] args) {

        /*  1.  write a program that can check the equality of the three given numbers
                declare 3 numbers n1, n2, n3
                if n1 and n2 are equal  => n1&n2 are equal
                if n2 and n3 are equal ==> n2&n3 are equal
                if n3 and n1 are equal ==>n3&n1 are equal
                if all equal ==> all equal
                if none of them are equal ==> none of them are equal
         */
        int n1 = 1;
        int n2 = 10;
        int n3 = 100;

        // for n1 & n2 are equal ==> n1 == n2 && n1 != n3
        // for n2 & n3 are equal ==> n2 == n3 && n2 != n1
        // for n1 & n3 are equal ==> n1 == n3 && n1 != n2
        // for all equal         ==> n1 == n2 && n2 == n3
        // for none of them are equal ==> n1 != n2 && n2 != n3 && n1 != n3


        String result = "";

        if(n1 == n2 && n2 ==n3) { // becomes if not all of them are equal
            result = "all equal";
        }else if(n1 == n2) { // if not all off them are equal but n1 & n2 are equal
            result = "n1&n2 are equal";
        }else if(n2 == n3) {
            result = "n2&n3 are equal";
        }else if(n3 == n1) {
            result = "n3&n1 are equal";
        }else {
            result = "none of them are equal";
        }

        System.out.println("result = " + result);

        System.out.println("======= with Ternary =======");

        String result2 = (n1 == n2 && n2 ==n3) ? "all equal" : (n1 == n2) ? "n1&n2 are equal"
                       : (n2 == n3) ? "n2&n3 are equal" : (n3 == n1) ? "n3&n1 are equal" : "none of them are equal";
        System.out.println("result2 = " + result2);


    }

}
