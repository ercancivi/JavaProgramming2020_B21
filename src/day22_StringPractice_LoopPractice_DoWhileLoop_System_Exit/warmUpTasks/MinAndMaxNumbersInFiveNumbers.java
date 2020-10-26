package day22_StringPractice_LoopPractice_DoWhileLoop_System_Exit.warmUpTasks;

import java.util.Scanner;

public class MinAndMaxNumbersInFiveNumbers {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int min = 2147483647;
        int max = -2147483648;

        for(int i = 1; i <= 5; i++) {
            System.out.println("Enter a number : ");
            int num = scan.nextInt();

            if(num < min) {
                min = num;
            }

            if(num > max){
                max = num;
            }

        }

        scan.close();

        System.out.println("min = " + min);
        System.out.println("max = " + max);

    }

}
