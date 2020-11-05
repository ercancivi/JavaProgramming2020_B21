package day27_ForEachLoop.assignment_WarmUp_Tasks;

public class FindingDuplicatedStringsFromStringArray {

    public static void main(String[] args) {

        /*  Assignment Tasks 4:
            write a program that can find the duplicated strings from string array
         */
        String[] strArrays = {"zero","one","six","two","three","four","two","five","nine","six","four","seven","eight","nine"};

        String duplicatedStrings = "";

        for(int j = 0; j < strArrays.length; j++) {

            String eachString = strArrays[j];
            int frequency = 0;

            for (int i = 0; i < strArrays.length; i++) {

                if (eachString.equals(strArrays[i])) {
                    frequency++;
                }
            }

            if (frequency != 1 && !duplicatedStrings.contains(eachString)) {
                duplicatedStrings += eachString + ", ";
            }

        }
        System.out.println("duplicatedStrings = " + duplicatedStrings);

    }

}
