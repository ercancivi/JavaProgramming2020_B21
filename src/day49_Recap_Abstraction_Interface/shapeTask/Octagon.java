package day49_Recap_Abstraction_Interface.shapeTask;

public class Octagon extends Shape  {
    public double n, a;

    public Octagon(double a, double n) {
        super("Octagon");
        this.a = a;
        this.n = n;
    }

    @Override
    public double area() {
        return 0;
    }



    @Override
    public double perimeter() {
        return 0;
    }
}
