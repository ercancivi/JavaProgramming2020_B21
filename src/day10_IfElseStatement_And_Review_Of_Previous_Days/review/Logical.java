package day10_IfElseStatement_And_Review_Of_Previous_Days.review;

public class Logical {

    public static void main(String[] args) {

        //  || : returns false if all expressions are false,

        boolean r1 = 10 < 9 || 20 != 20;
//                   false  ||  false
//                         false
        System.out.println("r1 = " + r1);

        System.out.println("=================");

        boolean r2 = "Muhtar" == "Good guy" || "Muhtar" != "Bad guy";
//                           false          ||         true
//                                         true
        System.out.println("r2 = " + r2);

        System.out.println("=================");

        boolean r3 = 'a' != 'A' || 'B' == 'B';
//                      true    ||    true
//                             true
        System.out.println("r3 = " + r3);


        //  && : returns true only if all expressions are true

        boolean r4 = 200 > 100 && 200 < 300;
//                      true   &&    true
//                            true
        System.out.println("r4 = " + r4);

        System.out.println("=================");

        boolean r5 = true && false;
//                       false
        System.out.println("r5 = " + r5);


        //  ! : returns the opposite of the boolean

        System.out.println(!true); // false
        System.out.println(!false); // true





    }

}
