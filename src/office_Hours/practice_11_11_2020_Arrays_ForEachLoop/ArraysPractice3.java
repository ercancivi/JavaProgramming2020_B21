package office_Hours.practice_11_11_2020_Arrays_ForEachLoop;

import java.util.Arrays;

public class ArraysPractice3 {

    public static void main(String[] args) {

        // anagram task

        String str1 = "abc";
        String str2 = "fed";

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        String[] arr1 = str1.split("");
        String[] arr2 = str2.split("");

        Arrays.sort(arr1);
        Arrays.sort((arr2));

        System.out.println(Arrays.toString(arr1)  );
        System.out.println(  Arrays.toString(arr2) );

        boolean isAnagram = Arrays.equals(arr1, arr2);

        System.out.println(isAnagram);

    }

}
