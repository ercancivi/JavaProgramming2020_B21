package java_Interview_Questions;

import java.util.Arrays;

public class Array_FindMaximum {

    //  Write a method that can find the maximum number from an int Array

    public static void main(String[] args) {

        int[] numbers = {5,8,3,0,1,9,12,4,7,2};
        System.out.println("max() = " + max(numbers));

    }

    //solution1 by
    public static int maxValue1( int[]  n ) {

        int max = Integer.MIN_VALUE;

        for(int each: n)

            if(each > max)

                max = each;



        return max;

    }

    //solution2 by
    public static int maxValue2( int[]  n ) {

        Arrays.sort( n );

        return  n [ n.length-1 ];

    }

    //solution by me
    public static int max(int[] numbers) {

        int max = numbers[0];

        for (int each : numbers) {

            if(max < each) {
                max = each;
            }

        }

        return max;
    }

}
