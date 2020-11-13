package day29_Custom_Methods.tasksSolutions;

public class MinMaxUniqueNumbersInArrayWithMethod {

    public static void main(String[] args) {

        int[] arr = {2, 1, 9, 3, -10, 2, 9, 0, 2, 0};
        maxNumberInArray(arr);
        minNumberInArray(arr);
        uniqueNumberInArray(arr);

    }

    //task 1 : create a function that can print out the maximum number from any given integer array
    public static void maxNumberInArray(int[] arr) {
        int max = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println("max number in this array is = " + max);
    }

    //task 2 : create a function that can print out the minimum number from any given integer array
    public static void minNumberInArray(int[] arr) {
        int min = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println("min number in this array is = " + min);
    }


    //task 3 : create a function that can print the unique elements from the array
    public static void uniqueNumberInArray(int[] arr) {

        String uniqueNumbers = "";

        for(int j = 0; j < arr.length; j++) {
            int number = arr[j];
            int frequency = 0;

            for (int i = 0; i < arr.length; i++) {

                if (number == arr[i]) {
                    frequency++;
                }

            }

            if(frequency == 1) {
                uniqueNumbers += number + " ";
            }

        }
        System.out.println(uniqueNumbers);
    }

}
