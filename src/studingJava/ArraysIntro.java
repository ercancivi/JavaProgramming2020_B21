package studingJava;

import java.util.Scanner;

public class ArraysIntro {

    public static void main(String[] args) {

        /*  Arrays : The reason why we need arrays because it is a data structure

            Data Structures : 1 - Array
                              2 - Collection
                              3 - Map

            Why we need the data structure?
                to use (manage) the data efficiently and organize the data


            variable : it can only store the single (one) data
                       DataType  name = data;
                          int  number = 100;


            Array variable : it is a variable that can have (store) multiple data in same type of data
                             An Array is an Object that store the collection of values

                  declare array :
                       DataType[] arrayName = {data1, data2, data3, ....};

                  initializing the size only :
                       DataType[] arrayName = new DataType[ (size<==>length) ];

                       String[]  student  =  new  String[10];

                       ARRAY'S SIZE IS FIXED ==> IT MEANS NOT CHANGEABLE






         */

//        String names = "Cybertek", "Muhtar";

        String[] names = {"Aylin", "Ercan", "Gizem", "Emir"};
        //index number =     0        1        2        3
        int[]  scores  = {   85,      90,      95,     100};

        //retrieve data from array

        System.out.println(names[0]);  //if we will print only one element in one-dimension array

        String str = names[3];
        System.out.println("str = " + str);

        System.out.println(scores[2]);

        int num = scores[2];
        System.out.println("num = " + num);


        System.out.println(names[3] + " " + scores[3]);

        System.out.println("=========");

        for(int i = 0; i < names.length; i++) {
            System.out.println(names[i] + " " + scores[i]);
        }

        System.out.println("====================================");

        String[] students = new String[5];

        students[0] = "Aylin";
        students[1] = "Ercan";
        students[2] = "Gizem";
        students[3] = "Emir";
        students[4] = "Volkan";

        System.out.println(students[0]);
        System.out.println(students[1]);
        System.out.println(students[2]);
        System.out.println(students[3]);
        System.out.println(students[4]);
//        System.out.println(students[5]);  //on this line == ArrayIndexOutOfBoundsException === array's size is fixed

        System.out.println("========");

        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }

        System.out.println("==================");

        //how many friends you have?
        //first name
        //last name
        //print full name

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter friend count ");
        int friendsCount = scan.nextInt();

        String[] myFriends = new String[friendsCount];

        String[] firstName = new String[myFriends.length];
        String[] lastName = new String[myFriends.length];
        String[] fullName = new String[myFriends.length];

        for(int i=0; i < friendsCount; i++) {
            System.out.println("Enter firstName");
            firstName[i] = scan.next();

            System.out.println("Enter lastName");
            lastName[i] = scan.next();

        }

       for(int i=0; i<friendsCount; i++) {
           fullName[i] = firstName[i] +  " " + lastName[i];
           System.out.println("fullName = " + fullName[i]);
       }














    }

}
