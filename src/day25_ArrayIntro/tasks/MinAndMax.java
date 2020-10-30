package day25_ArrayIntro.tasks;

import java.util.Scanner;

public class MinAndMax {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] numbers = new int[6];

        for(int i = 0; i <= numbers.length -1; i++) {
            System.out.println("Enter a number: ");
            numbers[i] = scan.nextInt();
        }

        System.out.print("Numbers you are entered: ");
        for(int i = 0; i <= numbers.length -1; i++) {
            System.out.print(numbers[i] + " ");
        }

        System.out.println();

        int max = numbers[0];
        for(int i = 0; i < numbers.length; i++) {
            if(numbers[i]>max) {
                max = numbers[i];
            }
        }
        System.out.println("max = " + max);


        int min = numbers[0];
        for(int i = 0; i < numbers.length; i++) {
            if(numbers[i] < min) {
                min = numbers[i];
            }
        }
        System.out.println("min = " + min);


    }

}
