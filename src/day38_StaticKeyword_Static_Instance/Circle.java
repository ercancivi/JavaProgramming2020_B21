package day38_StaticKeyword_Static_Instance;

import java.text.DecimalFormat;

public class Circle {

    public double radius, diameter, area, perimeter;


    public void setInfo(double radius) {
       this.radius = radius;
       diameter = 2 * radius;
       area = calculateArea();
       perimeter = calculatePerimeter();
    }

    public double calculateArea() {
//        we can apply DecimalFormat in this method too, if we want . it is the another way
//        DecimalFormat df = new DecimalFormat("0.00");
//        double area = radius * radius * Math.PI;
//        return Double.parseDouble((df.format(area)));
        return area = radius * radius * Math.PI;
    }

    public double calculatePerimeter() {
//        we can apply DecimalFormat in this method too, if we want . it is the another way
        return diameter * Math.PI;
    }

    public boolean equals(Circle circle) {
        return this.radius == circle.radius;
    }


    public String toString() {

        DecimalFormat df = new DecimalFormat("0.00");

        return "Circle{" +
                "radius=" + radius +
                ", diameter=" + diameter +
                ", area=" + df.format(area) +
                ", perimeter=" + df.format(perimeter) +
                '}';
    }


}
