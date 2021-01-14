package java_Interview_Questions;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class String_RemoveDuplicates {

    /*  Write a return method that can remove the duplicated values from String
        Ex:  removeDup("AAABBBCCC")  ==> ABC
     */

    public static void main(String[] args) {

        String str = "AAABBBCCC";
        System.out.println("removeDuplicates(str) = " + removeDuplicates(str));

        String str1 = "AAABBBCCCDEF";
        System.out.println("removeDuplicates(str1) = " + removeDuplicates2(str1));

        String str2 = "aabbccddeeff";
        System.out.println("removeDuplicates(str2) = " + removeDuplicates2(str2));

    }

    // solution1 by
    public static  String  removeDup1( String  str) {

        String result = "";

        for (int i = 0; i < str.length(); i++)

            if (!result.contains("" + str.charAt(i)))

                result += "" + str.charAt(i);



        return result;

    }

    // solution2 by
    public static String removeDup2(String str) {

        str = new LinkedHashSet<String>(Arrays.asList(str.split(""))).toString();

        str = str.replace(", " ,  "" ).replace("[","").replace("]","");

        return  str;

    }

    //solutions by me
    public static String removeDuplicates(String str) {

        String removedDuplicates = "";

        for(int j = 0; j < str.length(); j++) {

            char ch = str.charAt(j);
            int frequency = 0;

            for(int i = 0; i < str.length(); i++) {

                if(ch == str.charAt(i)){
                    frequency++;
                }
            }

            if(frequency >= 1 && !removedDuplicates.contains(""+ch)) {
                removedDuplicates += ch;
            }
        }

        return removedDuplicates;
    }

    public static String removeDuplicates2(String str) {

        String result = "";

        for(int i = 0; i < str.length(); i++) {

            if(!result.contains("" + str.charAt(i))) {
                result += str.charAt(i);
            }
        }
        return result;
    }

}
