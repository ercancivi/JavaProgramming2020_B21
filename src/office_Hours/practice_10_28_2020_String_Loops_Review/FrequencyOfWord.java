package office_Hours.practice_10_28_2020_String_Loops_Review;

public class FrequencyOfWord {

    public static void main(String[] args) {
        String sentence = "Cat Cat Cat Cat Cat";
        String word = "Cat";

        int count = 0 ;

        while(sentence.contains(word)){
            sentence = sentence.replaceFirst(word, "");
            count++;
        }

        System.out.println(count);


    }

}
