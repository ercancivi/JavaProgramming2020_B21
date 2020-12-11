package day34_11_30_2020_ArrayListContinue_CollectionUtility_BulkOperators_removeIf_lambda.warmUpTasks;

import java.util.ArrayList;

public class Task3 {

    public static void main(String[] args) {

        /*
            3. grades
         */

        int[] scores = {65, 75, 77, 85, 68, 88, 82, 72, 95, 99, 98, 94, 93, 96, 97, 71, 70, 72, 72, 73, 55};

        ArrayList<Integer> AList = new ArrayList<>();
        ArrayList<Integer> BList = new ArrayList<>();
        ArrayList<Integer> CList = new ArrayList<>();
        ArrayList<Integer> DList = new ArrayList<>();
        ArrayList<Integer> FList = new ArrayList<>();

        for(int each : scores) {
            if(each >= 90){
                AList.add(each);
            }else if(each >= 80) {
                BList.add(each);
            }else if(each >= 70) {
                CList.add(each);
            }else if(each >= 60) {
                DList.add(each);
            }else {
                FList.add(each);
            }
        }

        System.out.println("total of AList = " + AList.size() + ", 'A' : " + AList);
        System.out.println("total of BList = " + BList.size() + ", 'B' : " + BList);
        System.out.println("total of CList = " + CList.size() + ", 'C' : " + CList);
        System.out.println("total of DList = " + DList.size() + ", 'D' : " + DList);
        System.out.println("total of FList = " + FList.size() + ", 'F' : " + FList);


    }

}
