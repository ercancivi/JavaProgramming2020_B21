package day20_ForLoop.warmUpTasks_ForLoop2;

public class CalculateSumOfAllNumbers_1To100 {

    public static void main(String[] args) {

        /*  WarmUp Task 4:
            write a program that can calculate the sum of all numbers between 1 to 100
         */
        int sum = 0;

        for(int i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.println("sum = " + sum);

    }

}
