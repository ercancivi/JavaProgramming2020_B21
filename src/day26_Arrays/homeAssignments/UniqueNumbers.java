package day26_Arrays.homeAssignments;

public class UniqueNumbers {

    public static void main(String[] args) {

        /*  write a program that can find the unique numbers from an integer array

			int[] arr ={1,2,3,1,2,4}

			output:
				3 4
         */

        int[] arr ={1,2,3,1,2,4};

        String uniqueNumbers = ""; //3 4

        for(int j = 0; j< arr.length; j++) {
            int number = arr[j];

            int frequency = 0;

            for (int i = 0; i < arr.length; i++) {
                int tempNumber = arr[i];

                if (tempNumber == number) {
                    frequency++;
                }
            }

            if (frequency == 1) {
                uniqueNumbers += number + " ";
            }

        }
        System.out.println("result = " + uniqueNumbers);


    }


}
