package day07_UnaryOperators;

public class Divisibility_by_2_3_5 {

    public static void main(String[] args) {

        /*  Warm Up Task 2 : Divisibility
            Divisibility, write a program that can check if a number is evenly divisible by 2, 3, 5,
            Ex:
                number = 65;  ==> int
                divisibleBy2 ==> true/false
                divisibleBy3 ==> true/false
                divisibleBy5 ==> true/false
            output:
                65 is divisible by 2: false
                65 is divisible by 3: false
                65 is divisible by 5: true
                number = 80;
            output:
                80 is divisible by 2: true
                80 is divisible by 3: false
                80 is divisible by 5: true
         */
        int number = 65;

        boolean isDivisibleBy2 = number % 2 == 0;
        boolean isDivisibleBy3 = number % 3 == 0;
        boolean isDivisibleBy5 = number % 5 == 0;

        System.out.println(number + " is divisible by 2: " + isDivisibleBy2);
        System.out.println(number + " is divisible by 3: " + isDivisibleBy3);
        System.out.println(number + " is divisible by 5: " + isDivisibleBy5);

        System.out.println("============================");

        int number1 = 80;

        boolean isDivisibleBy_2 = number1 % 2 == 0;
        boolean isDivisibleBy_3 = number1 % 3 == 0;
        boolean isDivisibleBy_5 = number1 % 5 == 0;

        System.out.println(number1 + " is divisible by 2: " + isDivisibleBy_2);
        System.out.println(number1 + " is divisible by 3: " + isDivisibleBy_3);
        System.out.println(number1 + " is divisible by 5: " + isDivisibleBy_5);

    }

}
