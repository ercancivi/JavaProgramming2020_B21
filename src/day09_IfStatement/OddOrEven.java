package day09_IfStatement;

public class OddOrEven {

    public static void main(String[] args) {

        int number = 1000;

        boolean even = number % 2 == 0;
        boolean odd = !even; // number % 2 != 0;

        System.out.println(number + " is even number = " + even);
        System.out.println(number + " is odd number = " + odd);

        System.out.println("==========================");

        int n = 200;

        boolean isPositive = n > 0;
        boolean isNegative = n < 0;
        boolean isZero = !isPositive && !isNegative;

        System.out.println(n + " is Positive = " + isPositive);
        System.out.println(n + " is Negative = " + isNegative);
        System.out.println(n + " is Zero = " + isZero);

        System.out.println("==========================");

        System.out.println("false == !true : " + (false == !true));
//                                                false == false ==> true

        System.out.println("false != true && !false == true : " + (false != true && !false == true));
//                                                                      true     &&       true
//                                                                              true

        System.out.println(!false != false);
//                          true  != false ==> true

        System.out.println(!false != false || false); //true
//                           true != false || false
//                               true      || false
//                                        true
        System.out.println(!false != false && false); //false

        System.out.println(true && true && true && false); //false

        System.out.println(false || false || false || false || true); //true

        System.out.println("==========================");

        String weather = "Shinny";
        int degree = 70;

        boolean r1 = !(weather == "Rainy" || degree == 70); //false
//                  !("Shinny" == "Rainy" || 70 == 70);
//                  !(        false       ||   true);
//                  !(                  true);
//                           false
        System.out.println("r1 = " + r1);

        /*
            !no  ==> yes
            !yes ==> no

            !funny ==> not funny
         */

        System.out.println(!!true); //true
        System.out.println(!!!false); //true
        System.out.println(!!!!false); //false

    }

}
