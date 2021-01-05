package day33_ArrayList.warmUpTasks;

import java.time.LocalDate;

public class Task4 {

    public static void main(String[] args) {

        /*  4- create an array of string and store 5 of your friend's names
               create an array of LocalDate
         */

        String[] myFriends = {"Ahmet","Olesea","Ramiz","Adil","Guvanch"};
        LocalDate[] DofB = {LocalDate.of(1983,6,14),
                            LocalDate.of(1986,2,7),
                            LocalDate.of(1983,3,12),
                            LocalDate.of(1999,6,18),
                            LocalDate.of(1979,5,20)};

        for(int i = 0; i < myFriends.length; i++) {
            System.out.println(myFriends[i] + "' birthday is: " + DofB[i]);
        }

        String nameOfOlder = myFriends[0];
        LocalDate older = DofB[0];

        for(int i = 0; i < DofB.length; i++) {
            if(DofB[i].isBefore(older)) {
                older = DofB[i];
                nameOfOlder = myFriends[i];
            }
        }

        String nameOfYounger = myFriends[0];
        LocalDate younger = DofB[0];

        for(int i =0; i < DofB.length; i++) {
            if(DofB[i].isAfter(younger)) {
                younger = DofB[i];
                nameOfYounger = myFriends[i];
            }
        }

        System.out.println(nameOfOlder + " is older and birthday: " + older);
        System.out.println(nameOfYounger + " is younger and birthday: " + younger);

    }

}
