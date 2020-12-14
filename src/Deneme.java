import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
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

//        ArrayList<Integer> x = new ArrayList<>();
//        x.add(1);
//        x.add(5);
//        x.add(3);
//        x.add(7);
//
//        System.out.println(twoTimes(x));
//
//        String[] str = {"1","2","aa","1", "aa"};
//
//        String s1 = "12345";
//        String s2 = "abcdefg";
//
//        System.out.println(mergeStrings(s1,s2));


        ArrayList<String>  arr = new ArrayList<String>();
        arr.add("2");
        arr.add("6");
        arr.add("foo bar");
        arr.add("abc");


        System.out.println(search(arr,"foo"));

        Carpet c  = new Carpet();
        System.out.println(c.totalPrice);

//        System.out.println(appearsTwice("laptop", "I would like to buy a new laptop, because my laptop is too old."));
//        appearsTwice("java", "java is fun!");

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


    public static String search(ArrayList<String> r, String find)
    {
        String result = "";
        for(String element : r) {

            if(element.contains(find)) {

                result = element;
                if(!result.isEmpty()) {
                    return element;
                }


            }else {

                result = "search failed";

            }

        }
        return result;
    }

    public static boolean isError(String line)
    {
        return line.startsWith("error");
    }

//    public static boolean appearsTwice(String target, String sentence) {
//        //write your codes here:
//        int frequency = 0;
//        for(String word: sentence.split(" ")) {
//
//
//
//            if(word.contains(target)) {
//                frequency++;
//            }
//
//        }
//
//        if(frequency == 2) {
//            return true;
//        }
//
//        return false;
//    }

//    public static boolean appearsTwice(String target, String sentence) {
//        int count = 0;
//        while (sentence.contains(target)) {
//            count++;
//            sentence.replaceFirst(target, "");
//
//        }
//        if (count == 2) {
//            return true;
//        } else {
//            return false;
//        }
//
//
//    }

}

class Carpet {

    //do not change -- Start
    public double width,length,unitPrice,totalPrice;
    public boolean isPersian;
    //do not change -- End

    //Add constructors below

    public Carpet() {
        this.unitPrice = 0;
        this.width = width;
        this.length = length;
        this.totalPrice = 200;
    }

    public Carpet(double width, double length, double unitPrice, boolean isPersian) {
        this.width = width;
        this.length = length;
        this.unitPrice = unitPrice;
        this.isPersian = isPersian;
        totalPrice = totalPrice();
    }

    public double totalPrice() {
        totalPrice += (width + length)*unitPrice;
        return  (isPersian) ? totalPrice += 200 : totalPrice;
    }

    @Override
    public String toString() {
        return "Carpet{" +
                "width=" + width +
                ", length=" + length +
                ", unitPrice=" + unitPrice +
                ", totalPrice=" + totalPrice() +
                ", isPersian=" + isPersian +
                '}';
    }




    }
