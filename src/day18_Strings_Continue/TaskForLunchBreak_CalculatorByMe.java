package day18_Strings_Continue;

import java.util.Scanner;

public class TaskForLunchBreak_CalculatorByMe {

    public static void main(String[] args) {

        /*  task for lunch break:
            1. write a program to ask the user to enter two numbers and a math operator,
            the program should be able to return the calculation of those two numbers
                ex:
                    num1 = 10;
                    num2 = 20;
                    operator = *
                    output:
                            200
                    num1 = 30
                    num2 = 5
                    operator = /
                    output:
                            6

                pre condition:
                        valid math operators are *, /, -, +, %
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter two numbers and a math operator separated by space : ");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        String operator = scan.next();
        int result = 0;
        boolean isValid = true;

        switch(operator) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                if(num2 != 0) {
                    result = num1 / num2;
                }else {
                    System.err.println("denominator can not be equal to zero");
                    isValid = false;
                }
                break;
            case "%":
                if(num2 != 0) {
                    result = num1 % num2;
                }else {
                    System.err.println("denominator can not be equal to zero");
                    isValid = false;
                }
                break;
            default:
                System.err.println("Invalid operator");
                break;

        }
        if(isValid) {
            if(operator.equals("+")) {
                int sum = result;
                System.out.println("sum = " + sum);
            }else if(operator.equals("-")) {
                int sub = result;
                System.out.println("sub = " + sub);
            }else if(operator.equals("*")) {
                int mul = result;
                System.out.println("mul = " + mul);
            }else if(operator.equals("/")) {
                int div = result;
                System.out.println("div = " + div);
            }else {
                int mod = result;
                System.out.println("mod = " + mod);
            }


        }


    }

}
