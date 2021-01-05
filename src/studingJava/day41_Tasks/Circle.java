package studingJava.day41_Tasks;

    /*
    create a custom class called Circle
		private variables:
			radius, diameter, PI, area, perimeter

		add a constructor to set all fields

		generate getter for all private fields

		private methods:
			calculateArea, calculatePerimeter

		public methods:
			toString
			equals(): accepts a circle object and returns true if the given argument circle is equal to the current circle object
     */

import java.text.DecimalFormat;

public class Circle {

    private double radius, diameter, area, perimeter;

    private static double PI;

    static {
        PI = Math.PI;
    }

    public Circle(double radius) {
        this.radius = radius;
        diameter = 2 * radius;
        area = calculateArea();
        perimeter = calculatePerimeter();
    }

    public double getRadius() {
        return radius;
    }

    public double getDiameter() {
        return diameter;
    }

    public double getArea() {
        return area;
    }

    public double getPerimeter() {
        return perimeter;
    }

    private double calculateArea() {
        return radius * radius * PI;
    }

    private double calculatePerimeter() {
        return 2 * radius * PI;
    }

    public boolean equals(Circle circle) {
        return this.radius == circle.radius;
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("0,00");
        return "Circle{" +
                "radius=" + radius +
                ", diameter=" + diameter +
                ", area=" + df.format(area) +
                ", perimeter=" + df.format(perimeter) +
                '}';
    }
}

class TestCircle {

    public static void main(String[] args) {

        Circle circle1 = new Circle(10);
        System.out.println("circle1.getRadius() = " + circle1.getRadius());
        System.out.println("circle1.getDiameter() = " + circle1.getDiameter());
        System.out.println("circle1.getPerimeter() = " + circle1.getPerimeter());
        System.out.println("circle1.getArea() = " + circle1.getArea());
        System.out.println(circle1);

        System.out.println("=============================");

        Circle circle2 = new Circle(12);
        System.out.println("circle2.getRadius() = " + circle2.getRadius());
        System.out.println("circle2.getDiameter() = " + circle2.getDiameter());
        System.out.println("circle2.getPerimeter() = " + circle2.getPerimeter());
        System.out.println("circle2.getArea() = " + circle2.getArea());
        System.out.println(circle2);

        System.out.println("=============================");

        Circle circle3 = new Circle(12);
        System.out.println("circle3.getRadius() = " + circle3.getRadius());
        System.out.println("circle3.getDiameter() = " + circle3.getDiameter());
        System.out.println("circle3.getPerimeter() = " + circle3.getPerimeter());
        System.out.println("circle3.getArea() = " + circle3.getArea());
        System.out.println(circle3);

        System.out.println("=============================");

        System.out.println("circle1.equals(circle2) = " + circle1.equals(circle2));
        System.out.println("circle1.equals(circle3) = " + circle1.equals(circle3));
        System.out.println("circle2.equals(circle3) = " + circle2.equals(circle3));


    }

}
