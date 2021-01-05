package studingJava;

import java.text.DecimalFormat;

public class Circle {

    public double radius, diameter, area, perimeter;

    public static double PI = Math.PI;

    public void setInfo(double radius) {
        this.radius = radius;
        diameter = 2* radius;
        area = calculateArea();
        perimeter =calculatePerimeter();
    }

    public double calculateArea() {
//        DecimalFormat df = new DecimalFormat("0.00");
//        double area = PI*radius*radius;
//        return Double.parseDouble(df.format(area));
        return PI*radius*radius;
    }

    public double calculatePerimeter() {
//        DecimalFormat df = new DecimalFormat("0.00");
//        double perimeter = 2*PI*radius;
//        return Double.parseDouble(df.format(perimeter));
        return 2*PI*radius;
    }

    public boolean equals(Circle circle) {
        return circle.radius == this.radius;
    }

    public String toString() {
        DecimalFormat df = new DecimalFormat("0.00");

        return "radius: " + radius
                + ", area: " + df.format(area)
                + ", perimeter: " + df.format(perimeter);
    }

}

class CircleObject{

    public static void main(String[] args) {

        Circle c1 = new Circle();
        c1.setInfo(3.0);
        System.out.println(c1.calculatePerimeter());
        System.out.println(c1.calculateArea());

        System.out.println(c1);

        c1.radius = 5.0; //why it doesn't effect area and perimeter
        System.out.println(c1.calculateArea());
        System.out.println(c1.calculatePerimeter());

        System.out.println(c1);
        c1.radius = 3.0;

        Circle c2 = new Circle();
        c2.setInfo(3.0);

        System.out.println(c2);

        System.out.println(c1 == c2);
        System.out.println(c1.equals(c2));


    }

}

