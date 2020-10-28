package Office_Hours.practice_10_28_2020_String_Loops;

public class FrequencyOf_A_Character {

    public static void main(String[] args) {

        String str = "abaacaaaaaaaaaaaaaaaaaaaaaaaaaaaaabbbbbbb";
        // "abaac"

        char ch = 'b';

        int count = 0; // 1 + 1 + 1 = 3
        for(int i=0; i < str.length(); i++ ){

            char eachChar = str.charAt(i); // a, b, a, a, c

            if(eachChar == ch){
                // a
                count++;
            }

        }

        System.out.println(count);


    }

}
