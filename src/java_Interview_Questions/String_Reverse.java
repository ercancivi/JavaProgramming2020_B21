package java_Interview_Questions;

import java.util.Arrays;

public class String_Reverse {

    /*  Write a return method that can reverse  String
        Ex: Reverse("ABCD"); ==> DCBA
    */

    public static void main(String[] args) {

        String str1 = "ABCD";
        String str2 = "1234";
        String str3 = ">@#$";
        String str4 = "//<<";
        System.out.println("reverseString(str1) = " + reverseString1(str1));
        System.out.println("reverseString(str2) by toCharArray= " + reverseString2(str2));
        System.out.println("reverseString3(str3) by StringArray= " + reverseString3(str3));
        System.out.println("reverseString4(str4) by return StringArray= " + Arrays.toString(reverseString4(str4)));

    }
    //Solution1 by
    public static String StrReverse(String str) {

        String reverse="";

        for(int i=str.length()-1; i >= 0; i--)

            reverse += str.toCharArray()[i];



        return  reverse;

    }

    //Solution2 by
    public  static String  Reverse(String str) {

        return new StringBuffer(str).reverse().toString();

    }


    //Solutions by me
    public static String reverseString1(String str) {
        String reversedString = "";
        for(int i=str.length()-1; i >= 0; i--) {
            reversedString += str.charAt(i);
        }

        return reversedString;
    }

    public static String reverseString2(String str) {
        String reversedString = "";
//        char[] charArr = str.toCharArray();
//        for (int i = charArr.length-1; i >= 0; i--) {
        for (int i = str.length()-1; i >= 0; i--) {
//            reversedString += charArr[i];
            reversedString += str.toCharArray()[i];
        }

        return reversedString;
    }

    public static String reverseString3(String str) {
        String reversedString = "";
        String[] strArr = str.split("");

        for(int i = strArr.length-1, j = 0; i >= 0; i--) {
            reversedString += strArr[i];
        }

        return reversedString;
    }

    public static String[] reverseString4(String str) {
        String[] reversedInStringArray = new String[str.length()];
        String[] strArr = str.split("");

//        int j = 0;
        for(int i = strArr.length-1, j = 0; i >= 0; i--) {
            reversedInStringArray[j++] = strArr[i];
        }

        return reversedInStringArray;
    }

}
