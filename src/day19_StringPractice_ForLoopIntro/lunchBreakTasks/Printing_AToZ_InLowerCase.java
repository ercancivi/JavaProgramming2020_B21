package day19_StringPractice_ForLoopIntro.lunchBreakTasks;

public class Printing_AToZ_InLowerCase {

    //write a program that can print a ~ z in same line separated by space

    public static void main(String[] args) {

        for (char i = 'a'; i <= 'z'; i++) {
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println("========== solution 2 ==========");

        for (char i = 97; i <= 122; i++) {
            System.out.print(i + " ");
        }

    }
}
