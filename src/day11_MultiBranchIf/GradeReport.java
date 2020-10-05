package day11_MultiBranchIf;

public class GradeReport {

    public static void main(String[] args) {

        /*  2. Write a Java Program for the following logic:
              If marks < 60, then print “Fail”
              If marks >= 60, but less than 90, then print “Pass”
              If marks >= 90, then print “Passed with Distinction”
         */

        int score = 70; // 0 ~ 100

        String result = "";

        if(score < 60) {
            result = "Failed";
        }else if(score >= 60 && score < 90) {
            result = "Passed";
        }else { //score >= 90
            result = "Passed with Distinction";
        }

        System.out.println("result = " + result);

    }

}
