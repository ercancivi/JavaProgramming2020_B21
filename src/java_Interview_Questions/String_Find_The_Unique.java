package java_Interview_Questions;

import java.util.Arrays;
import java.util.Collections;

public class String_Find_The_Unique {

    /*  Write a return  method that can find the unique characters from the String
        Ex:  unique("AAABBBCCCDEF")  ==>  "DEF";
     */

    public static void main(String[] args) {

        String str = "AAABBBCCCDEF";
        System.out.println("unique() = " + unique(str));

    }
    //solution1 by
    public static String unique(String str) {

        String[ ] arr=str.split("");

        String unique1="";

        for(int j=0; j<arr.length; j++) {

            int num=0;

            for(int i=0; i<arr.length; i++ ) {

                if(arr[i].equals(arr[j]) )

                    num++;

            }

            if(num==1)

                unique1+=arr[j];

        }

        return unique1;
    }

    //solution2 by
    public static String Unique(String str) {

        String result ="";

        for(String each : str.split(""))

            result +=(  (Collections.frequency(Arrays.asList(str.split("")), each)) ==1 ) ? each : "";



        return result;

    }

    //solution by me
    public static String unique3(String str) {

        String uniques = "";

        for(int j = 0; j < str.length(); j++) {

            char ch = str.charAt(j);
            int frequency = 0;

            for(int i = 0; i < str.length(); i++) {

                if(ch == str.charAt(i)) {
                    frequency++;
                }
            }

            if(frequency == 1) {
                uniques += ch;
            }

        }

        return uniques;
    }

}
