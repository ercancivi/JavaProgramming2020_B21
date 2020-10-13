package day15_Scanner_Importing.warmUpTasks;

public class UppercaseOrLowercase {

    public static void main(String[] args) {

        /*  Given a letter (char) determine if the character is an uppercase letter or lowercase letter
                Ex: 'b'  --> lowercase
                    'G'  --> uppercase
                    'O'  --> uppercase
         */
        char letter = '5';
        String result = "";

        if(letter >= 'a' && letter <= 'z') {
            result = " is lowercase";
        }else if(letter >= 'A' && letter <= 'Z') {
            result = " is uppercase";
        }else {
            result = " is not a letter";
        }

        System.out.println(letter + result);

    }

}
