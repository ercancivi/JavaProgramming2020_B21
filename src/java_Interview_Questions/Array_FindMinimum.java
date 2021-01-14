package java_Interview_Questions;

import java.util.Arrays;

public class Array_FindMinimum {

    //Write a method that can find the maximum number from an int Array

    public static void main(String[] args) {

        int[] numbers = {5,8,3,0,1,9,12,4,7,2};
        System.out.println("min() = " + min(numbers));


    }

    //solution1 by
    public static int maxValue1( int[]  n ) {

        int min = Integer.MAX_VALUE;

        for(int each: n)

            if(each < min)

                min = each;



        return min;

    }

    //solution2 by
    public static int maxValue2( int[]  n ) {

        Arrays.sort( n );

        return  n [ 0 ];

    }

    //solution by me
    public static int min(int[] numbers) {
        //int min = numbers[0];
        int min = Integer.MAX_VALUE;

        for (int each : numbers) {

            if(min > each) {
                min = each;
            }

        }

        return min;
    }



}
