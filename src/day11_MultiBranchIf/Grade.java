package day11_MultiBranchIf;

public class Grade {

    public static void main(String[] args) {

        /*  The marks obtained by a student in 3 different subjects are input by the user. Your
            program should calculate the average of subjects. The student gets a grade as per the
            following rules:
                AVERAGE GRADE
                90-100 A
                80-89 B
                70-79 C
                60-69 D
                0-59 F
         */

        double score = 90; // 0 ~ 100
        String grade = "";

        if( score >= 90){// becomes false when score < 90
            grade = "A";

        }else if(score >= 80 && score < 90 ){ // becomes false when score < 80
            grade = "B";

        }else if(score >= 70 && score < 80){ // become false when score < 70
            grade = "C";

        }else if(score>=60 && score < 70){ // become false when score < 60
            grade = "D";

        }else{
            grade ="F";

        }

        System.out.println("Your grade is: "+grade);


    }

}
