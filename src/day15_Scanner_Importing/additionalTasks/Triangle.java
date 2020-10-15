package day15_Scanner_Importing.additionalTasks;

import java.util.Scanner;

public class Triangle {

    public static void main(String[] args) {

        /*  Ask the user to enter two angle values (double).
            Find out what the third angle of the triangle is (Triangles have 180 degrees total).
            If the two angle values given exceed 180 already print "Invalid angles"
         */
        Scanner input = new Scanner(System.in);

        System.out.print("Enter two angle values separated by space : ");
        double angle1 = input.nextDouble();
        double angle2 = input.nextDouble();

        double sum = angle1 + angle2;
        double angle3 = 0;

        if(sum >= 180 || sum <= 0) {
            System.out.println("Invalid angles");
        }else {
            angle3 = 180 - sum;
            System.out.println("angle3 = " + angle3);
        }



    }

}
