package day46_JavaRecap_Inheritance_And_Exceptions_Practice.shapeTask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;

    /*    1. create a class called Shape:
                Attributes: name
                add a constructor that can set the name of the shape:
                        if shape' name is set to be empty, throw an exception with a message of: "Shape Name cannot be empty"
                        if name contains a character that is not letter, throw an exception with a message of: "No such a Shape"
                methods:
                    area(): returns the area of the shape
                    perimeter(): returns the perimeter of the shape
                    toString(): prints the shape' Name, Area and Perimeter
     */

public class Shape {

    public String name;

    public Shape(String name) {
        if(name.isEmpty()) {
            throw new InputMismatchException("Shape Name cannot be empty");
        }

//        second solution
//        if(name.isEmpty()) {
//            throw new RuntimeException("Shape Name cannot be empty");
//        }

        for (char each:name.toCharArray()){
            if (!Character.isLetter(each)){
                throw new InputMismatchException("No such a shape");
            }
        }
//        second solution
//        for (int i = 0; i < name.length(); i++) {
//            if (!Character.isLetter(name.charAt(i))) {
//                throw new InputMismatchException("No such a Shape");
//            }
//        }

//        third solution
//        char[] arr = name.toCharArray();
//        for (Character each : arr) {
//            if (!Character.isLetter(each)) {
//                throw new InputMismatchException("No such a Shape");
//            }
//        }

        this.name = name;
    }

    public double area() {
        return 0;
    }

    public double perimeter() {
        return 0;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "name='" + name + '\'' +
                ", area='" + area() + " square cm" + '\'' +
                ", perimeter='" + perimeter() + " cm " + '\'' +
                '}';
    }
}
