package day31_MethodOverLoading;

public class WarmUpTasks {

    public static void main(String[] args) {

        /*  warmup tasks:
            Task1:
                1.  write a return method called frequencyOfWord that accepts two parameters: string str and String word, then returns the frequency of word
                        Ex:
                            str = "Java java java python python"
                            word = "java";

                            frequency(str, word) ==>  3


            Task2:
                1. create a method that can find the addition of two numbers
                            method name: additionOf2Numbers

                2. create a method that can find the addition of three numbers
                            method name: additionOf3Numbers

                3. create a method that can find the addition of four numbers
                            method name: additionOf4Numbers
         */
    }


    public static int frequencyOfWord(String sentence, String word) {
        sentence = sentence.toLowerCase();
        word = word.toLowerCase();

        int frequency = 0;

        while(sentence.contains(word)) {
            sentence = sentence.replaceFirst(word, "");
            frequency++;
        }

        return frequency;
    }


    public static int additionOf2Numbers(int a, int b){
        return a+b;
    }


    public static int additionOf3Numbers(int a, int b, int c){
        return additionOf2Numbers(a,b)+c;
    }


    public static int additionOf4Numbers(int a, int b, int c, int d){
        return additionOf2Numbers(a, b) + additionOf2Numbers(c, d);
    }

}
