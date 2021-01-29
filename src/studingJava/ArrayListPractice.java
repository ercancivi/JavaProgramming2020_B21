package studingJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListPractice {

    public static void main(String[] args) {
        int number = 1; // 1
        String letters = "abc"; // abc
        System.out.println(number(number));
        letters = letters(letters); // abcd
        System.out.println(number + letters); // 1abcd




        List<String> names = new ArrayList<>(Arrays.asList("Ahmed", "John", "Eric", "Ahmed"));
                List<String> names2 = new ArrayList<>();
        names.forEach(p-> {if(!p.equals("Ahmed")) names2.add(p);}  );
        System.out.println(names2);


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