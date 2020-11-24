package day33_ArrayList;

import java.util.ArrayList;

public class ListPractice1 {

    public static void main(String[] args) {

        ArrayList<Integer>  odd =  new ArrayList<>();
        ArrayList<Integer>  even =  new ArrayList<>();

        for(int i = 0; i <= 100; i++){
            if(i%2 == 0){
                even.add(i);
            }else {
                odd.add(i);
            }
        }

        System.out.println("Odd: "+odd);
        System.out.println("Even: "+even);

        System.out.println("Last odd Number: "+ odd.get( odd.size() - 1 )  );

        System.out.println( "Last Even Number: "+ even.get( even.size()-1 ));

        System.out.println("===========================================================");

        int[] arr1 = {1,2,3,4,5,6};
        int[] arr2= {1,2,3,4,5,6,7,8,9};
        ArrayList<Integer> list1 = new ArrayList<>();
        for (int each :arr1) {
            list1.add(each);
        }
        for (int each : arr2) {
            list1.add(each);
        }
        System.out.println("list1 = " + list1);

        System.out.println("============================================================");

        int[] arr3 = {1,2,3,4,5,6};
        int[] arr4 = {1,2,3,4,5,6,7,8,9,10};
        int[] arr5 = {90, 80, 70, 60};
        int[] arr6 = {40, 35, 45, 65, 7, 5};
        int[] arr7 = {35, 54, 67, 89, 98, 89, 76};

        int[][] arr2D = { arr3, arr4, arr5 , arr6, arr7};

        ArrayList<Integer> list2 = new ArrayList<>();

        for(int[] each1D : arr2D ){
            for(int eachElement : each1D ){
                list2.add(eachElement);
            }
        }


        System.out.println("list2 = " + list2);


    }

}
