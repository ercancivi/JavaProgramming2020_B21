package day10_IfElseStatement_And_Review_Of_Previous_Days.warmUpTasksByMe;

public class ValidTriangle {

    public static void main(String[] args) {

        /*  Task02: ValidTriangle
            A triangle is valid if the sum of all the three angles is equal to 180 degrees.
            Write a program that declares three integers as angles and check whether a triangle is valid or not.
         */

        int angle1 = 10;
        int angle2 = 90;
        int angle3 = 80;

        boolean isValid = angle1 + angle2 + angle3 == 180;
//                        if sum of three angles equal to 180, then it's valid triangle ==> true
//                        otherwise ==> false

        if (isValid && angle1 != 0 && angle2 != 0 && angle3 != 0) {
            System.out.println("it is valid");
        }

        if (!isValid || angle1 == 0 || angle2 == 0 || angle3 == 0) {
            System.out.println("it is not valid");
        }

//        if it's valid triangle, then check if it's a right triangle(it means one of the angle must be 90 degree)

    }

}
