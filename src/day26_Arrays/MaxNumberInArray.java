package day26_Arrays;

public class MaxNumberInArray {

    public static void main(String[] args) {

        /*  WarmUp Task 2:
            write a program that can return the maximum number from an array of integers
         */

        int[] numbers = {-300, -100, -400,  -50,  -500,  -150, -170};
        //                0    1     2    3    4     5    6

        int max =numbers[0]; //500
        //  -2147483648

        for(int i = 0; i <= numbers.length-1; i++ ){
            if(numbers[i] > max){
                max = numbers[i];
            }
        }


        System.out.println("max = " + max);


    }

}
