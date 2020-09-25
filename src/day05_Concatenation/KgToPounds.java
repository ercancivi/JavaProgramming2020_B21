package day05_Concatenation;

public class KgToPounds {

    public static void main(String[] args) {

        /*  Task01:
        create a class called KgToPounds, and write a program that can convert Kg to pound and print the result
            Ex:
                kg = 10;
                output:
                    10 kg equal to 22.0462 pounds
                kg = 20
                output:
                    20 kg equal to 44.0924 pounds
                ....
            Hint: 1kg = 2.20462 pounds
         */

        int kg1 = 10;
        double pound1 = 2.20462 * kg1;
        System.out.println(kg1 + " kg equal to " + pound1 + " pounds");

        System.out.println("=============================");

        int kg2 = 20;
        double pound2 = 2.20462 * kg2;
        System.out.println(kg2 + " kg equal to " + pound2 + " pounds");

    }

}
