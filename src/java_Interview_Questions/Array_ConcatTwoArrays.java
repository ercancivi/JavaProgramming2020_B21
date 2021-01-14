package java_Interview_Questions;

import java.util.Arrays;

public class Array_ConcatTwoArrays {

    //Write a return method that can concate two arrays

    public static void main(String[] args) {

        int[] num1 = {1,2,3,4,5};
        int[] num2 = {6,7,8,9};
        System.out.println("concatenation() = " + Arrays.toString(concatenation(num1,num2)));


    }

    //solution1 by
    public static int[] concatTwoArrays(int[] arr1 , int[] arr2) {

        int[] result = new int[arr1.length + arr2.length];

        int i = 0;

        for(int each: arr1) {

            result[i] = each;

            i++;

        }

        for(int each: arr2) {

            result[i] =each;

            i++;

        }

        return result;

    }

    //solution by me
    public static int[] concatenation(int[] num1, int[] num2) {

        int[] numbers = new int[num1.length + num2.length];

        int j = 0;

        for(int i = 0; i < num1.length; i++) {
            numbers[j++] = num1[i];
        }

        for(int i = 0; i < num2.length; i++) {
            numbers[j++] = num2[i];
        }

        return numbers;
    }


}
