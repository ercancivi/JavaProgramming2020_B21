package day11_MultiBranchIf.tasksSolutionByMe;

public class TaskForStudentGrades {

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
        int score = 95;

        String grade = "";

        if(score < 60) {
            grade = "F";
        }else if(score >= 60 && score < 70) {
            grade = "D";
        }else if(score >= 70 && score < 80) {
            grade = "C";
        }else if(score >= 80 && score < 90) {
            grade = "B";
        }else { //score >= 90 && score <= 100
            grade = "A";
        }

        System.out.println("grade = " + grade);

    }

}
