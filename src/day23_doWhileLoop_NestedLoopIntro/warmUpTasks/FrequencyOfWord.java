package day23_doWhileLoop_NestedLoopIntro.warmUpTasks;

public class FrequencyOfWord {

    public static void main(String[] args) {

        /*  WarmUp Task 1:
            write a program that can return the frequency of the a word from the sentence
                Ex:
                    sentence = "Java is a programming language, I like to learn Java";
                    word = "Java";

                    output:
                        2
         */
        String sentence = "Java is a programming language, I like to learn Java";
                        //"     is a programming language, I like to learn Java"
                        //"     is a programming language, I like to learn "
        String word = "Java";

        int count = 0;

        while(sentence.contains(word)) {
            sentence = sentence.replaceFirst(word,""); //we need to remove one at a time to count
            count++;
        }
        System.out.println("count = " + count);
        System.out.println("sentence = " + sentence);

    }

}
