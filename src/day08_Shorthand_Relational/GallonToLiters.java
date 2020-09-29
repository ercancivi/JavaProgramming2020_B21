package day08_Shorthand_Relational;

public class GallonToLiters {

    public static void main(String[] args) {

        /*  Warm Up Task 1 :
            write a program that converts the given number of gallons to liters.
                    Note: MUST return integer result
                    Ex:
                        gallons: 100
                        output:
                            100 gallons equal to 378 liters
                    Hint: 1 gallon = 3.785 liters
         */

        int gallon = 100;
        int liters = (int) (gallon * 3.78541);

        System.out.println(gallon+" gallons equal to " + liters+" liters" );
    }

}
