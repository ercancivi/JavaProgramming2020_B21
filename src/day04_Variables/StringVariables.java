package day04_Variables;

public class StringVariables {

    public static void main(String[] args) {

        //firstName, lastName, yourAddress
        String firstName = "Cybertek";
        String lastName = "School";
        String yourAddress = "Mclean, Virginia";

        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println(yourAddress);

        String fullName = firstName + ' ' + lastName; //or with double quote ==> String fullName = firstName + " " + lastName;
        System.out.println(fullName);


    }

}
