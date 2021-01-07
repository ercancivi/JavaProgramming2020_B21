package studingJava;

public class ArrayListPractice {

    public static void main(String[] args) {
        int number = 1; // 1
        String letters = "abc"; // abc
        System.out.println(number(number));
        letters = letters(letters); // abcd
        System.out.println(number + letters); // 1abcd
    }

    public static int number(int number) {
        number++;
        return number;
    }

    public static String letters(String letters) {
        letters += "d";
        return letters;


    }
}