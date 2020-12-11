package day33_ArrayList.warmUpTasks;

import java.util.ArrayList;

public class Task3 {

    public static void main(String[] args) {

        /*   3. write a program that can return the sum of all the digits from a string
                    ex:
                        input: "a1b2c3"
                        output: 6
                            (1+2+3= 6)

                        input: "Today's date is 04/27/2020"
                        output: 17
                            (0+4+2+7+2+0+2+0=17)
         */

        String str = "a1b2c3";

        int sum = 0;
        for(char each : str.toCharArray()) {
            if(Character.isDigit(each)) {
                sum += Integer.parseInt(""+each);
            }
        }
        System.out.println("sum = " + sum);





    }

}
