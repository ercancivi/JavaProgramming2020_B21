package day50_Polymorphism;

import day42_Inheritance.animalTask.Animal;
import day42_Inheritance.animalTask.Cat;
import day43_InheritanceReview_ProtectedAccessModifier.carTask.Car;
import day43_InheritanceReview_ProtectedAccessModifier.carTask.Toyota;
import day45_Exceptions.phoneTask.Phone;
import day45_Exceptions.phoneTask.Samsung;
import day49_Recap_Abstraction_Interface.remoteDriverTask.*;
import day49_Recap_Abstraction_Interface.shapeTask.Circle;
import day49_Recap_Abstraction_Interface.shapeTask.Cube;
import day49_Recap_Abstraction_Interface.shapeTask.Cylinder;
import day49_Recap_Abstraction_Interface.shapeTask.Shape;

public class DownCasting {
    public static void main(String[] args) {
        Shape shape = new Cylinder(3, 5);
        //  Cylinder cylinder = (Cylinder) shape;
        //  System.out.println( cylinder.volume()  );


        double volume =  ((Cylinder) shape).volume();

        System.out.println(volume);

        System.out.println("=================================");

        Animal animal = new Cat("Lucy", "Husky", 'M',12, "White", "Small");
        // ( (Dog)animal ) .bark();

        Car car = new Toyota("Camry", "White", 2020, 45000, 35000);
        //  ((BMW)car).race();

        System.out.println("=======================================");

        Phone phone = new Samsung("S20", 2000);
        // ((Iphone)phone).faceTime(123456);

        System.out.println("=======================================");
        WebDriver driver = new ChromeDriver();
        ( (TakeScreenShot)driver ).TakeScreenShot("pic");
        ( (JavaScriptExecuter)driver).executeScript("");


        System.out.println("===================================");
        Shape shape2 = new Circle(3);
        ( (Cube)shape2 ).volume();

        System.out.println("===================================");
        ((TakeScreenShot) driver).TakeScreenShot("");
        ((JavaScriptExecuter) driver).executeScript("");


        RemoteDriver dr1 =new FireFoxDriver(); // up casting
        JavaScriptExecuter js = new FireFoxDriver();
        TakeScreenShot ts = new FireFoxDriver();


        System.out.println("=======================================");
        boolean isChrome = driver instanceof ChromeDriver;

        // Assert.assertTrue(isChrome);



    }
}
