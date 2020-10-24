package day20_ForLoop;

import java.util.Scanner;

public class Calculator_With_Infinite_ForLoop {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        for(int i =0; i==0; ){

            double result = 0;
            boolean isValid = true;
            System.out.println("Enter two numbers: ");
            int n1 = scan.nextInt();
            int n2 = scan.nextInt();

            System.out.println("Enter a arithmetic operator ");
            char operator = scan.next().charAt(0);

            switch(operator) {
                case '+':
                    result = n1 + n2;
                    break;
                case '-':
                    result = n1 - n2;
                    break;
                case '*':
                    result = n1 * n2;
                    break;
                case '/':
                    if(n2 != 0) {
                        result = n1 / n2;
                    }else {
                        System.err.println("Denominator can Not be zero!!!");
                        isValid = false;
                    }
                    break;
                case '%':
                    if(n2 != 0) {
                        result = n1 % n2;
                    }else {
                        System.err.println("Denominator can Not be zero!!!");
                        isValid = false;
                    }
                    break;
                default:
                    System.err.println("Invalid Operator!!!!");
                    isValid = false;
                    break;
            }
            if(isValid) {
                System.out.println("result = " + result);
            }

            System.out.println("would you like to continue? Yes, No");
            String answer = scan.next();

            if(answer.equalsIgnoreCase("no")){
                System.out.println("Thank you for using our calculator");
                break;

            }else if(answer.equalsIgnoreCase("yes")) {
                System.out.println("then let's start");

            }else {
                System.err.println("Invalid answer!!!!");
                System.out.println("would you like to continue? Yes, No");
                answer = scan.next();
                for(String x = answer; !answer.equalsIgnoreCase("Yes");) {
                    System.out.println("would you like to continue? Yes, No");
                    answer = scan.next();
                    if(answer.equalsIgnoreCase("Yes")) {
                        break;
                    }else if(answer.equalsIgnoreCase("No")) {
                        break;
                    }
                }
            }
            if(answer.equalsIgnoreCase("no")) {
                System.out.println("Thank you for using our calculator");
                break;
            }
        }

    }

}
