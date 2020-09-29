package day07_UnaryOperators;

public class UnaryOperators {

    public static void main(String[] args) {

        int a = -100;
        boolean isPositive = a > 0; //verify if a is positive
        boolean isNegative = a < 0; //verify if a is negative

        System.out.println(a + " isPositive = " + isPositive);
        System.out.println(a + " isNegative = " + isNegative);

        int b = -100 -20; //-120
        System.out.println("b = " + b);

        int c = 10 - -20; //30
        System.out.println("c = " + c);

        int d = 10 * 4;   // 40
        int e = -10 * 4;  //-40
        int f = 10 * -4;  //-40
        int g = -10 * -4; // 40

        System.out.println("======================================");
        int x = 100;
        ++x; //increase the value by 1, ==> 100 + 1 = 101
        System.out.println("x = " + x);

        int y = 100;
        --y; //decrease the value by 1, ==> 100 - 1 = 99
        System.out.println("y = " + y);

        int z = 100;
        System.out.println(--z); //99

        int x2 = 100;
        System.out.println(++x2); //101

        System.out.println("======================================");
        //POST :
        int a2 = 100;
        System.out.println(a2++); //100
        System.out.println("a2 = " + a2); //101

        int b2 = 100;
        System.out.println(b2--); //100
        System.out.println("b2 = " + b2); //99


    }

}
