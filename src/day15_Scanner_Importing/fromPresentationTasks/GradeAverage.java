package day15_Scanner_Importing.fromPresentationTasks;

import java.util.Scanner;

public class GradeAverage {

    public static void main(String[] args) {

        /*  The marks obtained by a student in 3 different subjects are input by the user.
            Your program should calculate the average of subjects.
            The student gets a grade as per the following rules:
                90-100	A
                80-89	B
                70-79	C
                60-69	D
                0-59	F

                Ex: 86, 74, 90 -> B
         */

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your 3 different score :");
        double score1 = input.nextDouble();
        double score2 = input.nextDouble();
        double score3 = input.nextDouble();

        double sum = score1 + score2 + score3;
        double average = sum / 3;
        String grade = "";

        if(average > 100 || average < 0) {
            grade = "invalid value";
        }else if(average >= 90) {
            grade = "A";
        }else if(average >= 80) {
            grade = "B";
        }else if(average >= 70) {
            grade = "C";
        }else if(average >= 60) {
            grade = "D";
        }else {
            grade = "F";
        }
        System.out.println("grade = " + grade);

    }

}
