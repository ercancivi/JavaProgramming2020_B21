import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Deneme {
    public static void main(String[] args) {

//        String str1 = "java";
//        String str2 = "java";
//        String str3 = str1;
//
//        String str4 = new String("java");
////        str2 = str4;
//
//        String str5 = new String("java");
//
//        System.out.println("str1 == str2 = " + str1 == str2);
//                         //"str1 == str2 = java" == str2
//
//        System.out.println("str1 == str2x = " + (str1 == str2));
//
//        System.out.println("str2 == str3 = " + (str2 == str3));
//
//        System.out.println("str2 == str4 = " + (str2 == str4));
//
//        System.out.println("str5 == str4 = " + (str5 == str4));

//        for(int i= 0; i<=4; ){
//            i++;
//            System.out.print(i + " ");
//        }


//        int a = 10;
//        a = --a + a++ + a-- + a++;
//        System.out.println("a = " + a);



//        String[] arr = {"apple", "banana","kiwi", "grape","milk","soda"};
//        for(int i = 0; i < arr.length; i++) {
//            if(i <= arr.length-3) {
//                for (int j = i; j <= i + 2; j++) {
//
//                    if(j < i + 2) {
//                        System.out.print(arr[j] + " , ");
//                    }else {
//                        System.out.print(arr[j]);
//                    }
//                }
//            }
//            System.out.println();
//        }




//        int[] r = {9,8,7,6,5,4};
//
//        int n = 3;
//        add_to_r(r,n);
//
//        add_to_r(new int{1,5,77,8}  ,2);



//        int[] num1 = new int[3];
//        int[] num2 = {1,2,3,4,5};
//
//        num1 = num2;
//
//        for(int i=0;i<num1.length;i++){
//            System.out.println(num1[i]);
//        }








//        int[] nums = {2, 5, 5, 6, 3, 6, 9, 34, 3};


//        for(int eachOuter : nums) {
//            int count = 0;
//            for(int eachInner : nums) {
//                if(eachOuter == eachInner) {
//                    count++;
//                }
//            }
//
//            if(count == 1) {
//                System.out.println(eachOuter);
//            }
//        }

//        System.out.println(combineRs(["f","o","o"],[" b","a","r"]));

        ArrayList<Integer> x = new ArrayList<>();
        x.add(1);
        x.add(5);
        x.add(3);
        x.add(7);

        System.out.println(twoTimes(x));


    }

//    public static void add_to_r(int[] r,int n) {
//        int[] new_r = new int[r.length + 1];
//
//        int i = 0;
//
//        for(int j = 0; j < r.length; j++) {
//            new_r[i++] = r[j];
//        }
//
//        new_r[i] = n;
//
//        System.out.println(Arrays.toString(new_r));
//    }


//    public static String combineRs(String[] r1,String[] r2)
//    {
//        ArrayList<String> list = new ArrayList<>();
//
//        for(String each : r1) {
//            list.add(each);
//        }
//
//        for(String each : r2) {
//            list.add(each);
//        }
//
//        String str = "";
//        for(String each : list) {
//           str += each;
//        }
//
//        return str;
//
//    }


    public static ArrayList<Integer> twoTimes(ArrayList<Integer> nums) {

        ArrayList<Integer> list = new ArrayList<>();

        for(int each : nums) {

            list.add(each);
            list.add(each);
        }

        return list;
    }






}
