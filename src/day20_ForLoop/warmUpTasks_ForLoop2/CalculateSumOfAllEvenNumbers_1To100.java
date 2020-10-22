package day20_ForLoop.warmUpTasks_ForLoop2;

public class CalculateSumOfAllEvenNumbers_1To100 {

    public static void main(String[] args) {

        /*  WarmUp Task 5:
            write a program that can calculate the sum of all the even numbers between 1 ~ 100
         */
        int sum = 0;

        for(int i = 1; i <= 100; i++) {
            if(i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println("sum = " + sum);

    }

}
