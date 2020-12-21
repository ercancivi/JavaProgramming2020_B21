package day44_InheritanceContinue_MethodOverriding_SuperKeyword.shapesTask;

public final class Square extends Shape {

    /*
     variables: 4 ( 1 ins, 3 sta)
     methods: 4 (4 ins)
  */
    public double side;

    public Square(double side){
        super("Square");
        this.side = side;

    }

    @Override
    public double calcArea() {
        return side * side;
    }

    @Override
    public double calcPerimeter() {
        return side * 4;
    }

}
