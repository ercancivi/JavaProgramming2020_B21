package day46_JavaRecap_Inheritance_And_Exceptions_Practice.shapeTask;

    /*    2. create a class called Circle
                Attributes: name, r, d, PI
                Add a constructor that can set the instances of the Circle:
                        if the radius of the circle is 0 or negative, throw an exception with a message of: "No Such a Circle with a radius of: r"  replace the r with given radius
                methods:
                    area(): returns the area of the circle
                    perimeter(): returns the perimeter of the circle
     */

public class Circle extends Shape{
    //we didn't declare name because we will get name from super class
    private final static double PI = 3.14;  //this is for internal use only
    private double r, d;

    public Circle(double r) {
//        super("Circle*/+");   // if we use special character or numbers in name it will throw exception when we create object
        super("Circle");    // we set the name directly to fixed name for each Shape as Circle. because of this we didn't add String name as parameter

        if(r <= 0) {    //if radius of Circle is invalid
            throw new RuntimeException("No Such a Circle with a radius of: " + r);
        }
//        this.r = r;   instead of this line we use setR(r); at below line
        setR(r);
//        d = 2 * r;    instead of this line we use setD(r * 2); at below line
        setD(r * 2);
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getD() {
        return d;
    }

    public void setD(double d) {
        this.d = d;
    }

    @Override
    public double area() {
        return r * r * PI;
    }

    @Override
    public double perimeter() {
        return 2 * PI * r;
    }
}
