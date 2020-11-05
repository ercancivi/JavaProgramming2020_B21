package day27_ForEachLoop.assignment_WarmUp_Tasks;

public class FindingDuplicatedNumbersFromIntegerArray {

    public static void main(String[] args) {

        /*  Assignment Tasks 3:
            write a program that can find the duplicated numbers from an integer array
         */
        int[] numbers = {3, 5, 2, 1, 3, 4, 8, 2, 6, 8, 3, 4, 5, 7, 3, 1, 9, 0};

        String duplicatedNumbers = "";

        for(int j = 0; j < numbers.length; j++) {

            int frequency = 0;
            int eachNumber = numbers[j];
            for (int i = 0; i < numbers.length; i++) {
                if (eachNumber == numbers[i]) {
                    frequency++;
                }
            }

            if (frequency != 1 && !duplicatedNumbers.contains("" + eachNumber)) {
                duplicatedNumbers += eachNumber + " ";

            }

        }
        System.out.println(duplicatedNumbers);

    }

}
