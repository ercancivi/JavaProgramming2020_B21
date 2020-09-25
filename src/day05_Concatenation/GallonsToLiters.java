package day05_Concatenation;

public class GallonsToLiters {

    public static void main(String[] args) {

        /*  Task02:
        create a class called GallonsToLiters, and write a program that can convert the gallons to liters
            Ex:
                gallon = 10;
                output:
                    10 gallons equal to 37.8541 liters
                gallon = 20
                 output:
                    20 gallons equal to 75.7082 liters
            Hint: 1 gallon = 3.78541 liters
         */
        int gallon1 = 10;
        double liter1 = 3.78541 * gallon1;
        System.out.println(gallon1 + " gallons equal to " + liter1 + " liters");

        System.out.println("==================================");

        int gallon2 = 20;
        double liter2 = 3.78541 * gallon2;
        System.out.println(gallon2 + " gallons equal to " + liter2 + " liters");

    }

}
