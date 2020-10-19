package day18_Strings_Continue;

public class TaskSolution_ReplaceMethod {

    public static void main(String[] args) {

        String a = "Yesterday was Monday, Today is Monday, Tomorrow is gonna be Monday";
        System.out.println("a = " + a);

        //"Yesterday was Sunday, Today is Monday, Tomorrow is gonna be Tuesday";

        a = a.replaceFirst("Monday", "Sunday").replaceFirst("be Monday", "be Tuesday");
        System.out.println("a = " + a);
    }
}
