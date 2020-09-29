package day07_UnaryOperators;

public class PostPre {

    public static void main(String[] args) {

        System.out.println("=====Task1:=====");
        //Task1:
        int x = 2;
        int y = x++; //post increment : first passes current value 2
        System.out.println("x = " + x); //3
        System.out.println("y = " + y); //2

        System.out.println("=====Task2:=====");
        //Task2:
        int x2 = 2;
        System.out.println("x2++ = " + x2++); //2
        System.out.println("x2 = " + x2); //3

        System.out.println("=====Task3:=====");
        //Task3:
        int x3 = 2;
        System.out.println("--x3 = " + --x3); //1
        System.out.println("x3 = " + x3); //1

        System.out.println("=====Task4:=====");
        //Task4:
        int x4 = 8;
        int y4 = x4--; //y4 = 8
        System.out.println("y4 = " + y4); //8
        System.out.println("x4 = " + x4); //7

        System.out.println("=====Task5:=====");
        //Task5:
        int a = 1;
        int b = -a-- + a++ / -a-- * --a;
        //      -1   + 0   / -1   * -1
        //      -1   +    0       * -1
        //      -1   +        0
        //            -1
        System.out.println("b = " + b);
        System.out.println("a = " + a);

        System.out.println("=====Task6:=====");
        //Task6:
        int a1 = 50;
        int b1 = --a1 + a1++ + a1-- + a1++;
        //        49  + 49   + 50   + 49
        System.out.println("b1 = " + b1);
        System.out.println("a1 = " + a1);

        System.out.println("=====Task7:=====");
        //Task7:
        int m = 4;
        int n = m * 4 - m++;
        //      4 * 4 - 4
        System.out.println("n = " + n);
        System.out.println("m = " + m);

        System.out.println("=====Task8:=====");
        //Task8:
        int t = 100;
        int p = - ++t * -t-- / t++ + --t;
        //      - 101 * -101 / 100 + 100
        //           10201   / 100 + 100
        //                102      + 100 // ==> 10201 / 100 is not 102.01 because of int/int = int. it doesn't take decimal part
        //                      202.01
        System.out.println("p = " + p);
        System.out.println("t = " + t);

        System.out.println("=====Task9:=====");
        //Task9:
        int r = 20;
        int w = -r-- + -r++ + --r * r-- % 2;
        //      -20  + -19  + 19  * 19  % 2
        //      -20  + -19  +    361    % 2
        //      -20  + -19  +      1
        //          -39     +      1
        //                 -38
        System.out.println("w = " + w);
        System.out.println("r = " + r);

        System.out.println("=====Task10:=====");
        //Task10:
        int k = 300;
        int l = 400;

        int i = ++k + l++ - k-- % 2 + --l % 2;
        //      301 + 400 - 301 % 2 + 400 % 2
        //      301 + 400 -     1   +     0
        //               701
        System.out.println("i = " + i);

        int j = k + l - k * l + k / l;
        //      300 + 400 - 300 * 400 + 300 / 400
        //      300 + 400 -   120000  +     0
        //         700    -   120000
        //             -119300

        System.out.println("j = " + j);

    }

}
