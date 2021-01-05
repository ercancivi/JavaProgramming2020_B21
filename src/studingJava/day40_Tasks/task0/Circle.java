package studingJava.day40_Tasks.task0;

    /*
    Circle
		variables:
				radius, PI, diameter, area, perimeter

		add a constructor to initialize the instances
     */

public class Circle {

    public double radius,diameter, area, perimeter;

    public static double PI;

    static{
        PI = Math.PI;
    }

    public Circle(double radius) {
        this.radius = radius;
        diameter = 2 * radius;
        area = calculateArea();
        perimeter = calculatePerimeter();

    }

    public double calculateArea() {
        return radius * radius * PI;
    }

    public double calculatePerimeter() {
        return 2 * radius * PI;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", diameter=" + diameter +
                ", area=" + area +
                ", perimeter=" + perimeter +
                '}';
    }
}
