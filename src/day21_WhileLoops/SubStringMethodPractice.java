package day21_WhileLoops;

public class SubStringMethodPractice {

    public static void main(String[] args) {

        /*
            lastName_firstName@companyName.com
         */

        String email = "Alexander_Tsegaye@Apple.com";

        int indexOf_ = email.indexOf("_");
        int indexOfAt = email.lastIndexOf("@");

        String lastName = email.substring(0,  indexOf_ );

        String firstName = email.substring(indexOf_+1,  indexOfAt);

        String domain = email.substring(indexOfAt + 1, email.lastIndexOf(".") );

        String fullName = firstName+" "+lastName;

        System.out.println("lastName = " + lastName);
        System.out.println("firstName = " + firstName);
        System.out.println("fullName = " + fullName);
        System.out.println("domain = " + domain);


    }


}
