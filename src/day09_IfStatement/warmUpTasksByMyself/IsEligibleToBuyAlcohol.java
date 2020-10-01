package day09_IfStatement.warmUpTasksByMyself;

public class IsEligibleToBuyAlcohol {

    public static void main(String[] args) {

        /*  Warm Up Task 1 :
            write a program that can check if the person is eligible to buy alcohol
                Ex:
                    name = "James"
                    age = 19
                    output:
                        James is eligible to buy alcohol?
                            false
                    name = "Aaron"
                    age = 39
                    output:
                        Aaron is eligible to buy alcohol?
                            true
         */

        String name = "James";
        int age = 19;

        boolean isEligibleToBuyAlcohol = age >= 21;

        System.out.println(name + " is eligible to buy alcohol? \n\t" + isEligibleToBuyAlcohol);

        System.out.println("=================================");

        String name1 = "Aaron";
        int age1 = 39;

        boolean isEligibleToBuyAlcohol1 = age1 >= 21;

        System.out.println(name1 + " is eligible to buy alcohol? \n\t" + isEligibleToBuyAlcohol1);


    }

}
