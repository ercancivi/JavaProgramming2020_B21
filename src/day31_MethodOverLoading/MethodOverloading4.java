package day31_MethodOverLoading;

import java.util.Arrays;

public class MethodOverloading4 {

    /*
        sort: sorts in descending order
            int[]
            double[]
            char[]
            String[]
    */
    public static void main(String[] args) {

        int[] numbers = {5, 3, 9, 4, 12, 7, 1, 21, 6, 7};
        numbers = sort(numbers);
        System.out.println("numbers = " + Arrays.toString(numbers));

        double[] doubleNumbers = {7.5, 12.3, 18.6, 2.8, 8.9, 5.4};
        doubleNumbers = sort(doubleNumbers);
        System.out.println("doubleNumbers = " + Arrays.toString(doubleNumbers));

        char[] chars = {'a', 'c', 'f', 'e', 'd', 'F', 'A', 'E', 'D', 'b', 'C', 'B'};
        chars = sort(chars);
        System.out.println("chars = " + Arrays.toString(chars));

        String[] str = {"Java", "Phyton", "Sql", "JavaScript", "C++", "Ruby", "C#"};
        str = sort(str);
        System.out.println("str = " + Arrays.toString(str));

        int[] arr = {1,4,3,2,7, 0, 10, 11, 9, 8};

        arr = sort(arr);

        System.out.println( Arrays.toString(arr) );

        double[] arr2 = {5.5, 6.5, 10.5, 11.5, 12.5, 3.5, 4.5};
        arr2 = sort(arr2);

        System.out.println( Arrays.toString(arr2));


        char[] arr3 = {'a', 'd', 'b', 'c', 'f'};
        arr3 = sort(arr3);

        System.out.println(Arrays.toString(arr3));


    }


    public static int[] sort(int[] arr){  // {2,1,3}
        Arrays.sort(arr);  // {1,2,3};
        int[] reversedArray = new int[arr.length];  // {3, 2, 1}

        for(int i=arr.length-1, j = 0 ;  i>=0; i--, j++){
            reversedArray[j] = arr[i];
        }

        return reversedArray;
    }


    public static double[] sort(double[] arr){  // {2.0, 1.5, 3.2}
        Arrays.sort(arr);  // {1.5 ,2.0 ,3.2};
        double[] reversedArray = new double[arr.length];  // {3.2 ,2.0 ,1.5}

        for(int i=arr.length-1, j = 0 ;  i>=0; i--, j++){
            reversedArray[j] = arr[i];
        }

        return reversedArray;
    }


    public static char[] sort(char[] arr){  // {2.0, 1.5, 3.2}
        Arrays.sort(arr);  // {1.5 ,2.0 ,3.2};
        char[] reversedArray = new char[arr.length];  // {3.2 ,2.0 ,1.5}

        for(int i=arr.length-1, j = 0 ;  i>=0; i--, j++){
            reversedArray[j] = arr[i];
        }

        return reversedArray;
    }


    public static String[] sort(String[] arr){  // {2.0, 1.5, 3.2}
        Arrays.sort(arr);  // {1.5 ,2.0 ,3.2};
        String[] reversedArray = new String[arr.length];  // {3.2 ,2.0 ,1.5}

        for(int i=arr.length-1, j = 0 ;  i>=0; i--, j++){
            reversedArray[j] = arr[i];
        }

        return reversedArray;
    }


}
