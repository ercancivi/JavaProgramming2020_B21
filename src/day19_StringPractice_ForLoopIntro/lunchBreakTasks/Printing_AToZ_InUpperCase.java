package day19_StringPractice_ForLoopIntro.lunchBreakTasks;

public class Printing_AToZ_InUpperCase {

    public static void main(String[] args) {

        //write a program that can print A ~ Z in same line separated by space

        for (char i = 'A'; i <= 'Z'; i++){
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println("========== solution 2 ==========");

        for (char i = 65; i <= 90; i++) {
            System.out.print(i + " ");
        }

    }

}
