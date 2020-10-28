package day23_doWhileLoop_NestedLoopIntro;

import java.util.Scanner;

public class Credentials {

    public static void main(String[] args) {

        /*  credentials:
                cybertek
                cybertek12345
             */

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your username");
        String username = scan.next();

        System.out.println("Enter your password");
        String password = scan.next();

        //if the credentials are valid, user will be able to login
        if(username.equals("cybertek") && password.equals("cybertek12345")) {
            System.out.println("Logged In");

        }else{ // condition for invalid username and password

            for(int i =1; i <= 3; i++) {    //i: 1, 2, 3

                if(i == 3){     // if the attempt is already 3, the account should be locked
                    System.err.println("Your account is locked");
                    System.exit(0); //terminates the program
                }

                System.out.println("Invalid username or password, please re enter");
                System.out.println("Enter your username");
                username = scan.next();

                System.out.println("Enter your password");
                password = scan.next();

                if(username.equals("cybertek") && password.equals("cybertek12345")){
                    System.out.println("Logged In");
                    break;
                }

            }

        }

        System.out.println("Hello World");

    }

}
