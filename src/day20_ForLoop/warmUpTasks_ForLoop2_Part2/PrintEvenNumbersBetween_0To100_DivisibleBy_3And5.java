package day20_ForLoop.warmUpTasks_ForLoop2_Part2;

public class PrintEvenNumbersBetween_0To100_DivisibleBy_3And5 {

    public static void main(String[] args) {

        /*  WarmUp Task 2:
            write a program that can print all the EVEN numbers between 0 ~ 100 that can be divisible by 3 & 5
         */
        for(int i = 2; i <=100; i+=2) {
            if(i % 3 == 0 && i % 5 == 0){
                System.out.println("i = " + i);
            }
        }

    }

}
