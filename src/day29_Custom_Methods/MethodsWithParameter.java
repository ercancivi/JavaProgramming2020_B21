package day29_Custom_Methods;

public class MethodsWithParameter {

    public static void main(String[] args) {

        int age = 35;
        eligibleToBuyAlcohol(age);

//        eligibleToBuyAlcohol("Muhtar"); // Compile error because of dataType is not match

        eligibleToBuyAlcohol(30);   //this is the how we can enter the parameter directly to method

        calculateAge(2021,2020);
        calculateAge(1974,2020);


    }

    // AccessModifier  specifier   returnTYPE   MethodName (Parameter){ }
    public static void eligibleToBuyAlcohol(int age) {

        if(age >= 21) {
            System.out.println("Eligible");
        }else {
            System.out.println("Not Eligible");
        }

    }


    public static void calculateAge(int birthYear, int currentYear) {
        if(birthYear < currentYear) {
            System.out.println("your age is = " + (currentYear - birthYear));
        }else {
            System.out.println("Invalid Entry");
        }
    }


}
