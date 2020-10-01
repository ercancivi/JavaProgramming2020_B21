package day09_IfStatement.warmUpTasksByMyself;

public class IsEligibleToVote {

    public static void main(String[] args) {

        /*  Warm Up Task 2 :
            write a program that can check if the person is eligible to vote for Donald Trump or Joe Biden
                Ex:
                    name = "John"
                    citizenShip = "USA"
                    output:
                        John is eligible to vote for Donald Trump or Joe Biden?
                            true
                    name = "Jimmy"
                    citizenShip = "Korea"
                    output:
                        Jimmy is eligible to vote for Donald Trump or Joe Biden?
                            false
         */

        String name = "John";
        String citizenShip = "USA";

        boolean IsEligibleToVote = citizenShip == "USA";

        System.out.println(name + " is eligible to vote for Donald Trump or Joe Biden? \n\t" + IsEligibleToVote);

        System.out.println("=================================");

        String name1 = "Jimmy";
        String citizenShip1 = "Korea";

        boolean IsEligibleToVote1 = citizenShip1 == "USA";

        System.out.println(name1 + " is eligible to vote for Donald Trump or Joe Biden? \n\t" + IsEligibleToVote1);


    }

}
