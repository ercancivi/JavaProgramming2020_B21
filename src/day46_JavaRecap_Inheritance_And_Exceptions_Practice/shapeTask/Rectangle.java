package day46_JavaRecap_Inheritance_And_Exceptions_Practice.shapeTask;

    /*    3. create a class called Rectangle:
                Attributes: name, l, w
                Add a constructor that can set the instances of the Rectangle:
                        if the length or width of the rectangle is 0 or negative,
                        throw an exception with a message of: "No Such a Rectangle with a length and width of: l & w "
                        replace l & w with given length and width
                methods:
                    area(): returns the area of the rectangle
                    perimeter(): returns the perimeter of the rectangle
     */

import java.util.InputMismatchException;

public final class Rectangle extends Shape{

    private String name;
    private double length, width;

    public Rectangle(double length, double width) {
        super("Rectangle");
        if(length <= 0 || width <= 0) {
            throw new InputMismatchException("No Such a Rectangle with a length and width of: " + length + " and " + width);
        }
        setLength(length);
        setWidth(width);
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double area() {
        return length * width;
    }

    @Override
    public double perimeter() {
        return 2 * (length + width);
    }
}
