package day25_ArrayIntro;

public class ArrayIntro {

    public static void main(String[] args) {

//        int number = 12, 23;  // it is just a regular variable and it can not store more than 1 data
//        String name = "Cybertek", "Muhtar";   // it is just a regular variable and it can not store more than 1 data

        /*
        String name1 = "Azad";
        String name2 = "Ayse";
        String name3 = "Inna";
        String name4 = "Erjon";
        String name5 = "Aysel";

         */

        String[] names = {"Azad", "Ayse", "Inna", "Erjon", "Aysel", "Aliya", "Marwan", "Mustafa", "Oguzhan"};
        //index num:         0       1       2       3        4        5        6          7         8

        //retrieve data from array:
        System.out.println("names[2] = " + names[2]);

        String str1 = names[0];
        System.out.println("str1 = " + str1);

        int[] score = {80, 85, 90, 70, 75, 77, 87, 97, 88};
        //index:        0   1   2   3   4   5   6   7   8

        //Erjon : 70

        /*
        System.out.println("names[0]: score[0] = " + names[0] + ": " + score[0]);
        System.out.println("names[1]: score[1] = " + names[1] + ": " + score[1]);
        System.out.println("names[2]: score[1] = " + names[2] + ": " + score[2]);
        System.out.println("names[3]: score[3] = " + names[3] + ": " + score[3]);
        System.out.println("names[4]: score[4] = " + names[4] + ": " + score[4]);
        */

//        for(int i = 0; i <= 4; i++) {
//            System.out.println("names[" + i + "]: score[" + i + "] = " + names[i] + ": " + score[i]);
//        }

                     //i < 9 is same with i <= 9-1
        for(int i = 0; i <= names.length -1; i++) { //i: 0, 1, 2, 3, 4, 5, 6, 7, 8
            System.out.println(names[i] + ": " + score[i]);
        }



    }

}
