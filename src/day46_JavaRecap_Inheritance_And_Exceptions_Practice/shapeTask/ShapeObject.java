package day46_JavaRecap_Inheritance_And_Exceptions_Practice.shapeTask;

public class ShapeObject {

    public static void main(String[] args) {

//        Circle circle1 = new Circle(-3);
        Circle circle1 = new Circle(3);
        System.out.println(circle1);
        System.out.println(circle1.getR());
        System.out.println(circle1.getD());

        System.out.println("===================");

        Rectangle rectangle1 = new Rectangle(3,4);
        System.out.println(rectangle1);
        System.out.println(rectangle1.getLength());
        System.out.println(rectangle1.getWidth());

    }

}
