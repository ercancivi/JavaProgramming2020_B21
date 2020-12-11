package day34_11_30_2020_ArrayListContinue_CollectionUtility_BulkOperators_removeIf_lambda.warmUpTasks;

import java.util.ArrayList;

public class Task2 {

    public static void main(String[] args) {

        /*   2. write a program that can multiply each odd number by 2
                        ex:
                            list = [1,2,3,4,5];
                            output: [2,2,6,4,10]
         */

        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println("list = " + list);

        for(int i = 0; i < list.size(); i++) {

            int eachNumber = list.get(i);
            if(eachNumber % 2 != 0) {
                list.set(i, eachNumber * 2);
            }

        }
        System.out.println("list = " + list);
    }

}
