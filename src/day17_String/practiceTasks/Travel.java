package day17_String.practiceTasks;

import java.util.Scanner;

public class Travel {

    public static void main(String[] args) {

        /*- Make a cost variable to calculate how much the person will owe after everything:
          - Ask the user if they have a valid passport (boolean)
              > if the user enters true:
                  The base cost of the ticket should be set to: 1000
                  Ask the user the country they to travel to (String, multiple word)
                  Ask the user how many bags they will take with them (byte)
                      > Each bag will add 50 to the cost
                  Ask the user how many people they will travel with (short)
                      > For each person the cost is reduced by 100. Up to a limit of 300.
                  Ask the user to Enter the name of the people they will travel with in one line,
                      separating each name with a comma (String, multiple word)
                  Print: "Your ticket is booked to $countryName. We have charged extra for the $numberOfBags bags
                         but you are traveling with $peopleYouTravelWith so we are giving a discount.
                         Your total cost is $costAmount"
              > if the user enters false:
                  The base cost of the passport renewal is: 200
                  Ask the user when their passport expired(int)
                      > Each year it was expired adds 75 to the cost
                  Ask the user which countries they plan to travel it, written in one line,
                      separating each country with a comma
                  Ask the user if they will be traveling in the next year (String - yes or no)
                      > If yes: add 100 to the cost
                      > If no: subtract 50 from the cost
                  Print: "Looks like your passport has been expired for $years,
                         but not to worry we will get it ready for you to travel to $allCountries.
                         Your total cost has come out to $costAmount."
         */
        double cost = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("Do you have a valid passport");
        boolean isValidPassport = input.nextBoolean();

        input.nextLine();

        if(isValidPassport) {
            cost = 1000;
            System.out.println("Which country do you want to travel : ");
            String country = input.nextLine();

            System.out.println("How many bags you will take with them : ");
            byte numberOfBags = input.nextByte();
            cost += (numberOfBags * 50);

            System.out.println("How many people you will travel with");
            short peopleYouTravelWith = input.nextShort();

            if(peopleYouTravelWith >= 3) {
                cost -= 300;
            }else {
                cost -= (peopleYouTravelWith * 100);
            }

            input.nextLine();

            System.out.println("Enter the name of the people they will travel with in one line,\n"
                             + "separating each name with a comma");
            String nameOfPeople = input.nextLine();

            System.out.println("Your ticket is booked to " + country + ". We have charged extra for the " + numberOfBags
                            + " bags but you are traveling with " + peopleYouTravelWith
                            + " so we are giving a discount. Your total cost is $" + cost + ".");

        }else {
            cost = 200;
            System.out.println("How many years your passport has been expired : ");
            int numberOfYearExpired = input.nextInt();
            cost += (numberOfYearExpired * 75);

            input.nextLine();

            System.out.println("which countries you plan to travel it, written in one line,\n"
                             + "separating each country with a comma");
            String namesOfCountries = input.nextLine();

            System.out.println("Will you be traveling in the next year : ");
            String yesOrNo = input.next();

            if(yesOrNo.equals("yes")) {
                cost += 100;
            }else {
                cost -= 50;
            }

            System.out.println("Looks like your passport has been expired for " + numberOfYearExpired
                    + "years,\nbut not to worry we will get it ready for you to travel to " + namesOfCountries
                    + ".\nYour total cost has come out to $" + cost + ".");

        }

    }

}
