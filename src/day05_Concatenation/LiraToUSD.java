package day05_Concatenation;

public class LiraToUSD {

    public static void main(String[] args) {

        /*  Task03:
        create a class called LiraToUSD, and write a program that can convert lira to dollars, and print the result
        Ex:
            Lira = 1000;
            output:
                1000 Lira is equal to 160.97 USD
            Lira = 1000000;
            output:
                1000000
         */
        int Lira1 = 1000;
        double USD1 = (160.97 / 1000) * Lira1;
        System.out.println(Lira1 + " Lira is equal to " + USD1 + " USD");

        System.out.println("=====================================");

        int Lira2 = 1_000_000;
        double USD2 = (160.97 / 1000) * Lira2;
        System.out.println(Lira2 + " Lira is equal to " + USD2 + " USD");
    }

}
