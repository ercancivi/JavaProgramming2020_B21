package day15_Scanner_Importing.warmUpTasks;

public class GradeLevel {

    public static void main(String[] args) {

        /*  Given a number(byte) grade level determine and print which school type someone is in.
                1-5: Elementary school
                6-8: Middle school
                9-12: High school
                13-16: College
                17-18: Grad School
                Other: Invalid grade level given
         */
        byte number = 18;
        String gradeLevel = "";

        if(number >= 1 && number <= 18) {
            if(number >= 17) {
                gradeLevel = "Grad School";
            }else if(number >= 13) {
                gradeLevel = "College";
            }else if(number >= 9) {
                gradeLevel = "High school";
            }else if(number >= 6) {
                gradeLevel = "Middle school";
            }else {
                gradeLevel = "Elementary school";
            }
        }else {
            gradeLevel = "Invalid grade level given";
        }
        System.out.println("gradeLevel = " + gradeLevel);


    }

}
