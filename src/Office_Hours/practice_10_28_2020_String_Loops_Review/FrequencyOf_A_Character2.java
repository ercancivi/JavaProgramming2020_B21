package Office_Hours.practice_10_28_2020_String_Loops_Review;

public class FrequencyOf_A_Character2 {

    public static void main(String[] args) {

        String str = "abababaaaaaaaaaaaaa";
        //"bababa"
        //"bbaba"
        // "bbba"
        // "bbb"
        String ch = "a";

        int count = 0;

        while( str.contains( ch ) ){
            str = str.replaceFirst(ch , "");
            count++;
        }

        System.out.println(count);

    }

}
