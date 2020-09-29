package day08_Shorthand_Relational;

public class RelationalOperators_TheyAlwaysReturnsBoolean {

    public static void main(String[] args) {

        System.out.println("=====  > <  operators  =====");
        // > <

        int num1 = 1000;
        int num2 = 20000;

        boolean r1 = num1 > num2; // is num1 greater than num2 ?
        System.out.println(num1 + " is greater than " + num2 + " : " + r1);

        boolean r2 = num2 > num1; // is num2 greater than num1 ?
        System.out.println(num2 + " is greater than " + num1 + " : " + r2);

        boolean r3 = num1 < num2; // is num1 less than num2 ?
        System.out.println(num1 + " is less than " + num2 + " : " + r3);

        boolean r4 = num2 < num1; // is num2 less than num1 ?
        System.out.println(num2 + " is less than " + num1 + " : " + r4);


        System.out.println("============================");

        System.out.println( 10 > 9 );
        System.out.println( 10 < 9 );


        System.out.println("=====  >= <=  operators  =====");
        // >=, <=
        System.out.println( 10 > 10 ); // false
        System.out.println( 10 >= 10 ); // 10 is greater or equal to 10 ==> true

        System.out.println( 10 < 9 ); // false
        System.out.println( 10 <= 9 ); // 10 is less than or equal to 9 ==> true


        System.out.println("=====  == !=  operators  =====");
        // == !=

        boolean b1 = 10 == 10; // true
        boolean b2 = 10 != 10; //false
        System.out.println("b1 = " + b1);
        System.out.println("b2 = " + b2);

        boolean b3 = "Cybertek" == "Virginia"; //false
        System.out.println("b3 = " + b3);

        boolean b4 = "Virginia" == "virginia"; //false
        System.out.println("b4 = " + b4);

        boolean b5 = "Muhtar" == "Good Guy"; //false
        System.out.println("b5 = " + b5);

        boolean b6 = "Muhtar" != "Good Guy"; //true
        System.out.println("b6 = " + b6);

//        boolean b7 = "Muhtar" == "Muhtar";
//        System.out.println("b7 = " + b7);

        int x = 100;
        boolean isEven = x % 2 == 0; //100 is evenly divisible by 2
        //Even number : if a number can be evenly divisible by 2 with 0 remainder

        boolean isOdd = x % 2 != 0; // opposite of even

//        System.out.println("10" > 9);





    }

}
