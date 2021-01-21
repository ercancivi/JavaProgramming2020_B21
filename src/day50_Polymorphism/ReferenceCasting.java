package day50_Polymorphism;

import day42_Inheritance.animalTask.Animal;
import day42_Inheritance.animalTask.Cat;
import day42_Inheritance.animalTask.Dog;
import day47_Abstraction.shapeTasks.Circle;
import day47_Abstraction.shapeTasks.Shape;
import day49_Recap_Abstraction_Interface.remoteDriverTask.ChromeDriver;
import day49_Recap_Abstraction_Interface.remoteDriverTask.WebDriver;

public class ReferenceCasting {

    public static void main(String[] args) {
        // implicit casting: smaller to larger. done automatically
        int a = 10;
        double b =a;

        // explicit casting: larger to smaller. MUST be done manually
        double d = 10.5;
        int c = (int)d;


        System.out.println("======================================");
        // up casting: smaller reference type to larger reference type
        Circle circle = new Circle(3);
        Shape shape = (Shape)circle;

        WebDriver driver = new ChromeDriver();


        // down casting: larger reference type to the smaller
        Animal animal =  new Dog("Lucy", "Husky", 'M',12, "White", "Small");  // upcasting
        Dog dog = (Dog)animal;
        dog.bark();

        Animal animal2 = new Cat("Lucy", "Husky", 'M',12, "White", "Small");
        //  ( (Cat)animal2  ).meow();
        ( (Cat) animal2 ).meow();

        System.out.println("================================================");




    }

}
