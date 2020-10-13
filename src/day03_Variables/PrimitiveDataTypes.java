package day03_Variables;
    /*
        declare variable :
            DataType name = Data;
     */

public class PrimitiveDataTypes {

    public static void main(String[] args) {

        //score is 85
        byte score = 85;
        short score1 = 85;
        int score2 = 85;
        long score3 = 85;
        float score4 =85;
        double score5 = 85;

        System.out.println(score);
        System.out.println("score");

        //long number0 = 9999999999;   //int is preferred, compiler takes it as an int,
                                       // and the number 9999999999 is out of int' range
        long number1 = 9999999999L;    //long number1 = 9999999999l; uppercase(L) or lowercase(l) both is fine

        double decimal1 = 0.5;
        //float float1 = 0.5;    //double is preferred for decimals, compiler takes it as double,
                               // and double' range is greater than float
        float float2 = 0.5F;   //float float2 = 0.5f; uppercase(F) or lowercase(f) both is fine

        System.out.println(float2); //0.5

        /*
            in the future :
                    for integers : int
                    for decimals : double
         */

        /*
            A simple way to remember the Java primitive data types is by using this mnemonic aid:
            Be Careful, Bears Shouldn't Ingest Large Furry Dogs.
         */




    }

}
