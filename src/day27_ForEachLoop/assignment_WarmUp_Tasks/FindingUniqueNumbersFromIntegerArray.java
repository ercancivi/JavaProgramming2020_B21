package day27_ForEachLoop.assignment_WarmUp_Tasks;

public class FindingUniqueNumbersFromIntegerArray {

    public static void main(String[] args) {

        /*  Assignment Tasks 1:
            write a program that can find the unique numbers from an integer array
															==
         */
        int[] numbers = {3, 5, 2, 1, 3, 4, 8, 2, 6, 8, 3, 4, 5, 7, 3, 1, 9, 0};

        String uniqueNumbers = "";

        for(int j = 0; j < numbers.length; j++) {
            int tempNumber = numbers[j];
            int frequency = 0;

            for (int i = 0; i < numbers.length; i++) {

                if (tempNumber == numbers[i]) {
                    frequency++;
                }
            }
            if (frequency == 1) {
                uniqueNumbers += tempNumber + " ";
            }

        }
        System.out.println(uniqueNumbers);




    }

}
