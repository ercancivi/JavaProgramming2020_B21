package day17_String;

public class StringMutability {

    public static void main(String[] args) {

        String wordOne = "Friday";
        String wordTwo = wordOne;
        String wordThree = "Friday";
        wordOne = "Monday";

        System.out.println(wordTwo);
        System.out.println(wordOne);
        System.out.println(wordOne == wordThree);




    }

}
