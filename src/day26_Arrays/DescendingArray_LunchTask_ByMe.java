package day26_Arrays;

import java.util.Arrays;

public class DescendingArray_LunchTask_ByMe {

    public static void main(String[] args) {

        /*  Lunch Task:
            write a program that can sort an array of integers in descending
                    int[] arr = {5,1,2,6,7, 0};
                    output:
                        7 6 5 2 1 0
                        output:
                            [7, 6, 5, 2, 1, 0]
         */

        int[] arr = {5,1,2,6,7,0};
        String descendingArr = "";
        System.out.println("arr before sort = " + Arrays.toString(arr));

        Arrays.toString(arr);
        Arrays.sort(arr);

        System.out.println("arr after sort = " + Arrays.toString(arr));

        for(int i = arr.length-1; i >= 0;i--) {
           descendingArr += arr[i] + " ";
        }
        System.out.println("descendingArr = " + descendingArr);


        int[] descendingArrInArray = new int[arr.length];

        for(int i = arr.length-1; i >= 0; i--) {
            descendingArrInArray[(arr.length-1)-i] += arr[i];
        }
        System.out.println("descendingArrInArray = " + Arrays.toString(descendingArrInArray));


    }

}
