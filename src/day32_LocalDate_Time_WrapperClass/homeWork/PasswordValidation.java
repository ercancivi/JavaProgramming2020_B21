package day32_LocalDate_Time_WrapperClass.homeWork;

public class PasswordValidation {

    /*  HomeWork:
            Password validation
                1. 8 character at least
                2. there must be a digit            (isUpper   isLowercase)
                3. there must be a letter (at least one upper case & one lower case)
                4. there must be special character
         */

    public static void main(String[] args) {

        String password = "(PassWord123)";

        boolean isValid = false;

        String digits = "";
        String upperCase = "";
        String lowerCase = "";
        String specialCharacter = "";

        if (password.length() >= 8) {
            for (char eachChar : password.toCharArray()) {
                if (Character.isDigit(eachChar)) {
                    digits += eachChar;
                } else if (Character.isUpperCase(eachChar)) {
                    upperCase += eachChar;
                } else if (Character.isLowerCase(eachChar)) {
                    lowerCase += eachChar;
                } else {
                    specialCharacter += eachChar;
                }

            }
        }

        isValid = (password.length() >= 8 && digits.length() > 0 && upperCase.length() > 0
                && lowerCase.length() > 0 && specialCharacter.length() > 0);

        System.out.println("Password is Valid? = " + isValid);

    }

}
