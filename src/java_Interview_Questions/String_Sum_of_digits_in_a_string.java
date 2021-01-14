package java_Interview_Questions;

public class String_Sum_of_digits_in_a_string {

    //Write a method that can return the sum of the digits in a string

    public static void main(String[] args) {

        String str = "a1b2c3d4e5";
        System.out.println("sum() = " + sum(str));

    }

    //solution1 by
    public  static int  sumOfDigits(String s) {

        int total = 0;

        char[] ch =  s.toCharArray();

        for(char each: ch) {

            if(Character.isDigit(each)) {

                total += Integer.valueOf(""+each);

            }

        }

        return total;

    }

    //solution by me
    public static int sum(String str) {

        int sum = 0;
        for(int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if(Character.isDigit(ch)) {
                sum += Integer.parseInt(""+ch);
            }
        }

        return sum;
    }

}
