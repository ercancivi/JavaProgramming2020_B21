package day10_IfElseStatement_And_Review_Of_Previous_Days.warmUpTasksByMe;

public class TasksFromSlide {

    public static void main(String[] args) {

        int b = 2;
        boolean res = ++b == 2 || --b == 2 && --b == 2;
//                     3  == 2 ||  2  == 2 &&  1  == 2;
//                      false  ||    true  &&   false;
//                            true         &&   false;
//                                      false

        System.out.println("res = " + res);

        System.out.println("================");

        boolean x = true, z = true;
        int y = 20;
        x = (y != 10) || (z = false);
//           true     ||  false
//                   true

        System.out.println("x = " + x);

        System.out.println("================");

        /*  1. Create a double variable with the value 20
            2. Create a second variable of type double with the value 80
            3. Add both numbers up and multiply by 25
            4. Use the remainder operator to figure out the remainder from the sum of #3 divided by 40
            5. Print remaining total (#4) is equal to 20 or less : true/false
         */
        double d1 = 20;
        double d2 = 80;

        double d3 = (d1 + d2) * 25;

        double d4 = d3 % 40;

        boolean d5 = d4 <= 20;
        System.out.println("d5 = " + d5);





    }

}
