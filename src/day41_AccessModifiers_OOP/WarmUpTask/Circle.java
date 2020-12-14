package day41_AccessModifiers_OOP.WarmUpTask;

import java.text.DecimalFormat;

    /*  create a custom class called Circle
            private variables:
                radius, diameter, area, perimeter
            add a constructor to set all fields
            generate getter for all private fields
            private methods:
                calculateArea, calculatePerimeter
            public methods:
                toString
                equals(): accepts a circle object and returns true if the given argument circle is equal to the current circle object
     */

public class Circle {

    private double radius, diameter, area,perimeter;


    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius () {
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
        return Math.PI*radius*radius;
    }

    private double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    public String toString() {
        DecimalFormat df = new DecimalFormat("0.00");
        return "Circle{ radius: " + radius + ", diameter: " + diameter
                + ", area: " + df.format(calculateArea()) + ", perimeter: " + df.format(calculatePerimeter());
    }

    public boolean equals(Circle circle) {
        return this.radius == circle.radius;
    }


}
