package java_Interview_Questions;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;

public class String_FrequencyOfCharacters {

    /*  Write a return method that can find the frequency of characters
        Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
     */

    public static void main(String[] args) {

        String str = "AAABBCDD";
        System.out.println("frequencyOfChars() = " + frequencyOfChars(str));

    }

    //solution1 by
    public static String FrequencyOfChars1(String str) {

        String nonDup = "";

        for(int i=0; i < str.length(); i++)

            if(!nonDup.contains(""+str.charAt(i)))

                nonDup+= ""+str.charAt(i);



        String expectedResult = "";

        for( int j=0;j < nonDup.length(); j++) {

            int count = 0;

            for(int i=0; i < str.length(); i++) {

                if(str.charAt(i) == nonDup.charAt(j))

                    count++;

            }

            expectedResult +=nonDup.charAt(j)+"" + count;

        }

        return expectedResult;

    }

    //solution2 by
    public  static  String  FrequencyOfChars2(String str) {

        String expectedResult = "";

        while (!str.isEmpty()) {

            int count = 0;

            for(int i=0; i < str.length(); i++) {

                if(str.charAt(i) == str.charAt(0)) {

                    count++;

                }

            }

            expectedResult +=str.charAt(0)+"" + count;

            str = str.replace(""+str.charAt(0) ,  "" );

        }

        return expectedResult;

    }

    //solution3 by
    public  static  String  FrequencyOfChars3(String str) {

        String b=new LinkedHashSet<>(Arrays.asList(str.split(""))).toString();

        b = b.replace(", ","").replace("[","").replace("]","");

        String result="";

        for(int j=0; j<b.length();j++) {

            int count=0;

            for(int i=0; i<str.length(); i++){

                if(str.substring(i, i+1).equals(""+str.charAt(j)))

                    count++;

            }

            result+=b.substring(j, j+1)+count;

        }

        return result;

    }

    //solution4 by
    public static String frequency(String str) {

        String nonDup="", result="";

        for(int i=0; i < str.length(); i++)

            if(! nonDup.contains(""+str.charAt(i)))

                nonDup += ""+str.charAt(i);



        for(int i=0; i < nonDup.length(); i++) {

            int num = Collections.frequency( Arrays.asList(str.split("") ) ,    ""+nonDup.charAt( i ) );

            result += ""+nonDup.charAt(i) + num;

        }



        return result;

    }

    //solution by me
    public static String frequencyOfChars(String str) {

        String result = "";

        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int frequency = 0;

            for(int j = 0; j < str.length(); j++) {

                if(ch == str.charAt(j)) {
                    frequency++;
                }

            }

            if(!result.contains("" + ch)) {
                result += ch + "" + frequency;
            }
        }

        return result;
    }

}
