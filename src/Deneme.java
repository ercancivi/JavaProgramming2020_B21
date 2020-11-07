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



        String[] arr = {"apple", "banana","kiwi", "grape","milk","soda"};
        for(int i = 0; i < arr.length; i++) {
            if(i <= arr.length-3) {
                for (int j = i; j <= i + 2; j++) {

                    if(j < i + 2) {
                        System.out.print(arr[j] + " , ");
                    }else {
                        System.out.print(arr[j]);
                    }
                }
            }
            System.out.println();
        }



    }

}
