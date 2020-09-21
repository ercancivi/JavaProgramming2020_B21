package day03_Variables;

public class CalculateAreaAndPerimeterOfRectangle {

    public static void main(String[] args) {

        //Task : write a program that can calculate the area & perimeter of any rectangle that has integer number
        //width : 10
        //length : 20

        int width = 10;
        int length = 20;

        System.out.println("Area of Rectangle is : ");
        System.out.println(width * length);

        int area = width * length;
        System.out.print("Area of Rectangle is : ");
        System.out.println(area);

        System.out.println("==============");

        System.out.println("Perimeter of Rectangle is : ");
        System.out.println(2 * (width + length));

        int perimeter = 2 * (width + length);   //or int perimeter = width * 2 + length * 2;
        System.out.print("Perimeter of Rectangle is : ");
        System.out.print(perimeter);


    }

}
