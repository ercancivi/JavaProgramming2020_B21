package day25_ArrayIntro.tasks;

import java.util.Scanner;

public class MyFriends {

    public static void main(String[] args) {

        /*  How many friends you have? 5,4,3,...
            String[] firstName = new String[5]
            String[] lastName = new String[5]
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("How many friends do you have in your group? : ");
        int friendsNumberInGroup = scan.nextInt();

        String[] myFriends = new String[friendsNumberInGroup];

        String[] firstName = new String[friendsNumberInGroup];
        String[] lastName = new String[friendsNumberInGroup];

        for (int i = 0; i < friendsNumberInGroup; i++) {
            System.out.println("Enter your friend firstName: ");
            firstName[i] = scan.next();

            System.out.println("Enter your friend lastName: ");
            lastName[i] = scan.next();
        }

        scan.close();

        for (int i = 0; i < friendsNumberInGroup; i++) {
            System.out.println("firstName = " + firstName[i]);
            System.out.println("lastName = " + lastName[i]);
        }



        for (int i = 0; i < friendsNumberInGroup; i++) {
            myFriends[i] = firstName[i] + " " + lastName[i];
            System.out.println("myFriends = " + myFriends[i]);
        }


    }

}
