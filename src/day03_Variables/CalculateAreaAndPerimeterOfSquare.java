package day03_Variables;

public class CalculateAreaAndPerimeterOfSquare {

    public static void main(String[] args) {

        //Task : write a program that can calculate the area & perimeter of the square that has integer values
        //side : 10
        int side = 10;  //to make it reusable

        int area = side * side; //another info that we gained by using side, //to make it reusable
        System.out.print("Area of Square is : ");
        System.out.print(area);

        System.out.println();

        int perimeter = 4 * side; //another info that we gained by using side, //to make it reusable
        System.out.print("Perimeter of Square is : ");
        System.out.print(perimeter);

    }

}
