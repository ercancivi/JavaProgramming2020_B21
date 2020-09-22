package day04;

public class CalculateAreaAndPerimeterOfCircle {

    public static void main(String[] args) {

        //Task : write a program that can calculate the area & perimeter of the circle that has integer values
        //radius : 4.5
        //PI : 3.14

        double radius = 4.5;
        double PI = 3.14;

        double area = PI * radius * radius;
        System.out.print("Area of Circle is : ");
        System.out.println(area);


        double perimeter = 2 * PI * radius;
        System.out.print("Perimeter of Circle is : ");
        System.out.println(perimeter);

    }

}
