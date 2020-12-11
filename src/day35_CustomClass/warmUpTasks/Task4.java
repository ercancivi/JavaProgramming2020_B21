package day35_CustomClass.warmUpTasks;

import java.util.ArrayList;

public class Task4 {

    public static void main(String[] args) {

        /*  task04:
            Given a list of Integers 1, 2, 3, 4, 5, 6 ....etc. remove all values greater than 100.
                    solution 1: use lambda
                    solution 2: do not use lambda
         */

        ArrayList<Integer> numbers = new ArrayList<>();

        for(int i=1; i < 250; i+=2) {
            numbers.add(i);
        }

        System.out.println("numbers before removes = " + numbers);

        //solution 1:

        numbers.removeIf(p-> p>100);

        System.out.println("numbers after remove = " + numbers);

        numbers.clear();
        System.out.println("numbers after clear method= " + numbers);

        //solution 2:

        for(int i=1; i < 250; i+=5) {
            numbers.add(i);
        }

        System.out.println("numbers before remove = " + numbers);

        ArrayList<Integer> temp = new ArrayList<>();

        for(int each : numbers) {
            if(each < 100) {
                temp.add(each);
            }
        }
        numbers =temp;

        System.out.println("numbers after remove with loop = " + numbers);



    }

}
