package day04;

public class KgToPounds {

    public static void main(String[] args) {

        /* Task02:
            create a class called KgToPounds,
            and write a program that can convert the given Kg to pound and print the result
                Ex:
                   if kg = 10;
                        output: 22.0462

                    if kg = 20
                        output: 44.0925
         */
        int weightInKg1 = 10;
        double weightInPound1= 2.20462 * weightInKg1;

        System.out.print("output1 is = ");
        System.out.println(weightInPound1);


        int weightInKg2 = 20;
        double weightInPound2= 2.20462 * weightInKg2;

        System.out.print("output2 is = ");
        System.out.println(weightInPound2);

    }

}
