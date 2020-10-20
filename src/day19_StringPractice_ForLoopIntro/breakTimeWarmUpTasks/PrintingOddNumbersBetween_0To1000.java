package day19_StringPractice_ForLoopIntro.breakTimeWarmUpTasks;

public class PrintingOddNumbersBetween_0To1000 {

    public static void main(String[] args) {

        for(int i = 0; i <= 1000; i++) {
            if(i % 2 != 0) {
                System.out.println("it is a odd number = " + i);
            }
        }

    }

}
