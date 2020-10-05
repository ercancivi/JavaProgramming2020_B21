package day11_MultiBranchIf;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class TernaryPractice {

    public static void main(String[] args) {

        int n = 100;
        String result1 = "";

        if(n % 2 == 0) {
            result1 = "Even";
        }else {
            result1 = "Odd";
        }

        System.out.println("result1 = " + result1);

        System.out.println("====== with Ternary ======");

        String result2 = (n % 2 == 0) ? "Even" : "Odd";
        System.out.println("result2 = " + result2);

        System.out.println("==========================");

        int age = 25;
        String citizen = "USA";

        String eligibleToVote = (age >= 18 && citizen == "USA") ? "Yes, Eligible to Vote" : "No, Not Eligible to Vote";
        System.out.println("eligible To Vote? = " + eligibleToVote);

        System.out.println("==========================");

        int personAge = 18;

        String buyAlcohol = (personAge >= 21) ? "Yes, Eligible to Buy Alcohol" : "No, Not Eligible to Buy Alcohol";
        System.out.println("buyAlcohol = " + buyAlcohol);

        System.out.println("==========================");

        int number = 1000;
        String s1 = "";

        if(number > 0) {
            s1 = "Positive";
        }else if(number < 0) {
            s1 = "Negative";
        }else {
            s1 = "Zero";
        }

        System.out.println("s1 = " + s1);

        System.out.println("====== with Ternary ======");

        String s2 = (number > 0) ? "Positive" : (number < 0) ? "Negative" : "Zero";
        System.out.println("s2 = " + s2);


    }

}
