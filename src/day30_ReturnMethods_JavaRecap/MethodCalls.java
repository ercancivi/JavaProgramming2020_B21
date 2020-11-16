package day30_ReturnMethods_JavaRecap;

import library.ArraysUtility;
import library.StringUtility;

import java.util.Arrays;

public class MethodCalls {


    public static void main(String[] args) {

        String str = "Level";

        String reversedName = StringUtility.reverse(str);
        System.out.println(str.equalsIgnoreCase(reversedName));

        String str2 = "aaabbbbbccccccdddddeeeeee";
        String removedDuplicated = StringUtility.removeDuplicates(str2);
        System.out.println(removedDuplicated);

        String str3 = "aabcccdeee";
        String uniqueChars = StringUtility.unique(str3);
        System.out.println(uniqueChars);

        System.out.println("====================================");

        int[] array = {1, 0,-2, 30, 40, 500, -20, -50};

        int[] descending = ArraysUtility.sort(array);
        System.out.println(Arrays.toString(descending));
        System.out.println(ArraysUtility.printArray(descending));

        System.out.println("====================================");

        String s1 = "ccccccccccbbbbbbbbbbbbbbaaaaaaaaaaaa";
        String s2 = "bbbbbbbbbbbbaaaaaaaaacd";

        boolean r1 = StringUtility.isAnagram(s1, s2);

        System.out.println(r1);



    }

}
