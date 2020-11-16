package day30_ReturnMethods_JavaRecap.warmUpTasks;

public class MinMaxWithReturnMethod {

    public static void main(String[] args) {

        int[] arr1 = {3,8,1,9,21,6,2,-8,7,0,5,4};

        int minNumber = minNumberInArray(arr1);
        System.out.println("minNumber = " + minNumber);

        int maxNumber = maxNumberInArray(arr1);
        System.out.println("maxNumber = " + maxNumber);

    }


    public static int minNumberInArray(int[] arr) {

        int min = arr[0];
        for(int each : arr) {
            min = (min > each)? min=each : min;
        }
        return min;
    }


    public static int maxNumberInArray(int[] arr) {
        int max = arr[0];
        for(int each : arr) {
            max = (max < each)? max=each : max;
        }
        return max;

    }

}
