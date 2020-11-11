package office_Hours.practice_11_04_2020_String_Loops_Review2;

public class SliceNumbers2 {

    /*  5. Slice Numbers (repl.it)
            -Display prompt: Enter your number:
                12345
                -Display prompt: 1
                -Display prompt: 2
                -Display prompt: 3
                -Display prompt: 4
                -Display prompt: 5
                Use / and % operators
     */

    public static void main(String[] args) {
        int number = 987654321;

        String str = ""+number ;  // "12345"

        for(int i = 0, j=1  ; i <= str.length()-1; i++, j++  ) {
            System.out.println("digit "+j+": "   + str.charAt(i));
        }


    }


}
