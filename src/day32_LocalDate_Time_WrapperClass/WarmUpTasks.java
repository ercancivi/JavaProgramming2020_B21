package day32_LocalDate_Time_WrapperClass;

import java.util.Arrays;

public class WarmUpTasks {

    public static void main(String[] args) {

        /*  warmup task:
            1. create a return method called addElements that can add an Integer  after the  last index of an integer array
            2. create a return method called addElements that can add a double after the last index of a double array
            3. create a return method called addElements that can add a String after the last index of a String array
            4. create a return method called addElements that can add a char after last index of a char array
         */

        int[] arr = {1,2,3,4,5,6};
        arr = addElement(arr, 7);

        System.out.println(Arrays.toString(arr));


        double[] arr2 = {1.5, 2.5, 3.5, 4.5};
        arr2 = addElement(arr2, 5.5);

        System.out.println(Arrays.toString(arr2));

    }

    //                             {1,2,3,4,5}     6
    public static int[] addElement(int[] array, int element){
        int[] result = new int[array.length + 1];

        for(int i = 0; i <= array.length-1; i++ ){
            result[i]  = array[i];
        }

        result[result.length-1] = element;

        return result;
    }


    public static double[] addElement(double[] array, double element){
        double[] result = new double[array.length + 1];

        for(int i = 0; i <= array.length-1; i++ ){
            result[i]  = array[i];
        }

        result[result.length-1] = element;

        return result;
    }


    public static char[] addElement(char[] array, char element){
        char[] result = new char[array.length + 1];

        for(int i = 0; i <= array.length-1; i++ ){
            result[i]  = array[i];
        }

        result[result.length-1] = element;

        return result;
    }


    public static String[] addElement(String[] array, String element){
        String[] result = new String[array.length + 1];

        for(int i = 0; i <= array.length-1; i++ ){
            result[i]  = array[i];
        }

        result[result.length-1] = element;

        return result;
    }


}
