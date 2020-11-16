package day30_ReturnMethods_JavaRecap.warmUpTasks;

import java.util.Arrays;

public class WarmUpTasks {

    public static void main(String[] args) {

        /*  Warmup tasks:
            1. create a function that can check if the given integer is positive, negative or zero

            2. create a function that can calculate the grade of the student

            3. create a function that can print out the combination of two integer arrays

            4. create a function that can print a string without the duplicated characters

            5.  write a method that can print out the full name of a person in regular format
                    ex:
                       fullName("cYbErTeK", "SCHOOL");
                        output:
                            "Cybertek School"
         */

        positiveNegativeZero(-1);
        positiveNegativeZero(0);
        positiveNegativeZero(10);

        System.out.println("===================");

        int[] numbers = {1,2,3,4,-5,-6,-7,-8,10,11,0};

        for(int each : numbers) {
            positiveNegativeZero(each);
        }

        //with for-each loop
        for(int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        gradeCalculator(70);
        gradeCalculator(50);
        gradeCalculator(90);
        gradeCalculator(-100);
        gradeCalculator(120);

        int[] arr1 = {-5, -4, -3, -2, -1};
        int[] arr2 = {0, 1, 2, 3, 4, 5};
        combineTwoArrays(arr1, arr2);

        int[] a1 = {10,20,30,40};
        int[] a2 = {80,90,100};
        combineTwoArrays(a1,a2);

        removeDuplicates("abbcdddeffffghhhhh");

        String str = "SDIWTJLSDOSDWTJVESDWTJYOUSDWTJASDWTJYSDWTJLSDWTJISDWTJN";
        removeDuplicates(str);

        formattedFullName("ErCAn", "cIVi");
        formattedFullName("cYbErTeK", "SCHOOL");

        printUniqueChars("abbcdddeffffghhhhh");
        printUniqueChars("SDIWTJLSDOSDWTJVESDWTJYOUSDWTJASDWTJYSDWTJLSDWTJISDWTJN");


    }

    //1. create a function that can check if the given integer is positive, negative or zero
    public static void positiveNegativeZero(int number) {

        String result = (number > 0)? "Positive" : (number < 0)? "Negative" : "Zero";
        System.out.println(number + " is " + result);

//        //same solution with if-else
//        if(number > 0) {
//            System.out.println("It is a positive number");
//        }else if(number < 0) {
//            System.out.println("It is a negative number");
//        }else {
//            System.out.println("It is zero");
//        }

    }


    //2. create a function that can calculate the grade of the student
    public static void gradeCalculator(int score) {
        //we can NOT apply switch-case because switch-case doesn't accept boolean condition as (score >= 90)
        if(score >= 0 && score <= 100) { //This is pre-condition that is why we start if-else instead of ternary

            //with ternary
            System.out.println((score >= 90)? 'A' :(score >= 80)? 'B' :(score >= 70)? 'C' :(score >= 60)? 'D' : 'F');

            //with if-else
            if(score >= 90) {
                System.out.println('A');
            }else if(score >= 80) {
                System.out.println('B');
            }else if(score >= 70) {
                System.out.println('C');
            }else if(score >= 60) {
                System.out.println('D');
            }else {
                System.out.println('F');
            }

        }else {
            System.out.println("Invalid Score");
        }

    }


    //3. create a function that can print out the combination of two integer arrays
    public static void combineTwoArrays(int[] arr1, int[] arr2) {
        int[] arr = new int[arr1.length + arr2.length];
        int i = 0;

        for(int j = 0; j < arr1.length; j++) {
            arr[i++] = arr1[j];
        }

        for(int j = 0; j < arr2.length; j++) {
            arr[i++] = arr2[j];
        }

        System.out.println(Arrays.toString(arr));

        //with for-each loop
        int[] newArr = new int[arr1.length + arr2.length];
        int j = 0;
        for(int each : arr1) {
           newArr[j++] = each;
        }

        for(int each : arr2) {
            newArr[j++] = each;
        }

        System.out.println(Arrays.toString(newArr));

    }


    //4. create a function that can print a string without the duplicated characters "aabccb"
    public static void removeDuplicates(String str) {
        String result = "";  //"abc"

        //with contains method
        for( int i = 0; i <= str.length()-1; i++  ){
            if(!result.contains( ""+str.charAt(i) )){
                result += str.charAt(i);
            }
        }

        System.out.println( result);

        //with toCharArray method
        for(char each : str.toCharArray() ){  //each: [a, a, b, c, c, b]
            if(!result.contains( ""+each )){
                result += each;
            }
        }

        System.out.println( result);

    }


    //5.  write a method that can print out the full name of a person in regular format
    //       ex: fullName("cYbErTeK", "SCHOOL");
    //             output: "Cybertek School"
    public static void formattedFullName(String firstName, String lastName) {
        //with charAt() + substring()
        String formattedFirstName = "" + firstName.toUpperCase().charAt(0) + firstName.substring(1).toLowerCase();
        String formattedLastName = "" + lastName.toUpperCase().charAt(0) + lastName.substring(1).toLowerCase();

        String formattedFullName = formattedFirstName + " " + formattedLastName;

        System.out.println("fullName = " + formattedFullName);

        //with only substring()
        firstName = firstName.substring(0,1).toUpperCase() + firstName.substring(1).toLowerCase() ;     //"Cybertek"
        lastName = lastName.substring(0,1).toUpperCase() + lastName.substring(1).toLowerCase() ;   // School

        String fullName = firstName + " " + lastName;

        System.out.println(fullName);

    }


    public static void printUniqueChars(String str) {
        String uniqueChars = "";

        for(int i = 0; i < str.length(); i++) {

            int frequency = 0;
            for(int j = 0; j < str.length(); j++) {
                if(str.charAt(i) == str.charAt(j)) {
                    frequency++;
                }
            }

            if(frequency == 1) {
                uniqueChars += str.charAt(i);
            }
        }
        System.out.println("uniqueChars = " + uniqueChars);
    }


}
