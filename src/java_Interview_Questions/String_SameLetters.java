package java_Interview_Questions;

import java.util.Arrays;

public class String_SameLetters {

    /*  Write a return method that check if a string is build out of the same letters as another string.
        Ex:  same("abc",  "cab"); -> true
        same("abc",  "abb"); -> false:
     */

    public static void main(String[] args) {

        String str1 = "abc";
        String str2 = "cab";
        System.out.println("isSame() = " + isSame(str1,str2));

        String str3 = "abc";
        String str4 = "abb";
        System.out.println("isSame() = " + isSame(str3,str4));

    }

    //solution1 by
    public static boolean same(String a, String b) {

        char[] ch1 = a.toCharArray();

        char[]  ch2 = b.toCharArray();

        Arrays.sort(ch1);

        Arrays.sort(ch2);

        String a1="", a2="";

        for(char each: ch1)

            a1 +=each;


        for(char each: ch2)

            a2 +=each;


        return  a1.equals(a2) ;

    }

    //solution by me
    public static boolean isSame(String str1, String str2) {

        boolean isSame = false;

        if(str1.length() == str2.length()) {
            for(int i = 0; i < str1.length(); i++) {

                char ch = str1.charAt(i);
                if(str2.contains("" + ch)) {
                    isSame = true;
                }else {
                    isSame = false;
                }
            }

        } else {
            isSame = false;
        }

        return isSame;
    }

}
