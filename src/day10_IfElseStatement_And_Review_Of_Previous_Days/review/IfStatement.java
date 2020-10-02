package day10_IfElseStatement_And_Review_Of_Previous_Days.review;

public class IfStatement {

    public static void main(String[] args) {

        int score = 45;

        if(score >= 60) {
            System.out.println("Congrats");
        }

        if(score < 60) {
            System.out.println("Keep trying");
        }

        System.out.println("================");

        if(score >= 60) {
            System.out.println("Congrats");
        }else {
            System.out.println("Keep trying");
        }

        System.out.println("================");

        int angle1 = 80;
        int angle2 = 75;
        int angle3 = 65;
        int angle4 = 75;

        boolean isValidRectangle = angle1 == 90 && angle2 == 90 && angle3 == 90 && angle4 == 90;
//                                       false
//                                 if each of angles are equal to 90, then it's valid

        if(isValidRectangle) {
            System.out.println("It is valid Rectangle");
        }

        if(!isValidRectangle) {
            System.out.println("It is NOT valid Rectangle");
        }


        System.out.println("=== with If-Else Statement ===");


        if(isValidRectangle) {
            System.out.println("It is valid Rectangle");
        }else {
            System.out.println("It is NOT valid Rectangle");
        }


        System.out.println("================");

        // assume that a & b are two different numbers
        int a = 5200;
        int b = 3000;

        // what is the maximum number
        int max = 0; // ?

        if(a > b) {
            max = a;
//            System.out.println("max = " + a);
        }else {
            max = b;
//            System.out.println("max = " + b);
        }
        System.out.println("Maximum number is = " + max);



    }

}
