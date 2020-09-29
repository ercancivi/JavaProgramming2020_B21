package day08_Shorthand_Relational;

public class Task_IsValidTriangle {

    public static void main(String[] args) {

        /*  Task 2:
            write a program that can check if the given triangle is valid
                angle1 = 30
                angle2 = 30
                angle3 = 90

                sum = 150 // angle1 + angle2 + angle3 =
                isValid

             output:
                the triangle is valid: false
             */
        int angle1 = 30;
        int angle2 = 30;
        int angle3 = 90;

        int sum = angle1 + angle2 + angle3;
        boolean isValid = sum == 150;

        System.out.println("The triangle is valid: " + isValid);

    }

}
