package day27_ForEachLoop.assignment_WarmUp_Tasks;

public class FindingUniqueStringsFromStringArray {

    public static void main(String[] args) {

        /*  Assignment Tasks 2:
            write a program that can find the unique strings from string array
											.equals
         */
        String[] strArrays = {"zero","one","six","two","three","four","two","five","nine","six","four","seven","eight","nine"};

        String uniqueStrings = "";


        for(int j = 0; j < strArrays.length; j++) {
            String eachString = strArrays[j];
            int frequency = 0;
            for (int i = 0; i < strArrays.length; i++) {

                if (eachString.equals(strArrays[i])) {
                    frequency++;
                }
            }

            if (frequency == 1) {
                uniqueStrings += eachString + " ";
//                System.out.print(eachString + " ");   // We can print them here too
            }

        }
//        System.out.println();     //we add this line for additional line if we can print both way together
        System.out.println("uniqueStrings = " + uniqueStrings);






    }

}
