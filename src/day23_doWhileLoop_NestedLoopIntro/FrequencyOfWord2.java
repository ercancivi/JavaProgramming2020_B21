package day23_doWhileLoop_NestedLoopIntro;

public class FrequencyOfWord2 {

    public static void main(String[] args) {

        // without case sensitivity

        String sentence = "Java Java java java Java java Java java";
        String word = "Java";
        word = word.toLowerCase();

        String temp = sentence.toLowerCase(); //"java java java java"
        int count = 0;

        while(temp.contains(word) ){
            temp = temp.replaceFirst(word, "");
            count++;
        }

        System.out.println(count);

    }

}
