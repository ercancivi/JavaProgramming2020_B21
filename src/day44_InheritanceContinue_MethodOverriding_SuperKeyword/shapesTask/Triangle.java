package day44_InheritanceContinue_MethodOverriding_SuperKeyword.shapesTask;

public final class Triangle  extends Shape{

    public double height, base, side;

    public Triangle( double height, double base, double side) {
        super("Triangle");
        this.height = height;
        this.base = base;
        this.side = side;
    }

    @Override
    public double calcArea() {
        return base * height * 0.5;
    }

    @Override
    public double calcPerimeter() {
        return base + side * 2;
    }

}
