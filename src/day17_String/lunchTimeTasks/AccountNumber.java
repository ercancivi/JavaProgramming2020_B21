package day17_String.lunchTimeTasks;

import java.util.Scanner;

public class AccountNumber {

    public static void main(String[] args) {

        /*  Ask the user enter an account number. Check if these account number is valid.
            > If the account number begins with a “2” the account number should be 7 characters long
            > If the account number begins with a “5” the account number should be 10 characters long

            —> If the account number does not begin with a 2 or a 5
                OR the account number lengths do not meet the expected results print “Invalid account number”
         */

        String accountNumber;
        String valid;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter account number");
        accountNumber = scan.next();

        boolean isValid = (accountNumber.startsWith("2") && accountNumber.length() == 7)
                       || (accountNumber.startsWith("5") && accountNumber.length() == 10);

        if(isValid) {
            valid = "Account is valid";
        }else {
            valid = "Account is NOT valid";
        }

        System.out.println(valid);

        scan.close();

    }

}
