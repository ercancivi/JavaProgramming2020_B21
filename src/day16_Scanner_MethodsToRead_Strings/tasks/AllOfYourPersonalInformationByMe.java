package day16_Scanner_MethodsToRead_Strings.tasks;

import java.util.Scanner;

public class AllOfYourPersonalInformationByMe {

    public static void main(String[] args) {

         /*  Task:
            Count up some points based on the users input:
            Ask the user how many people they live with?
                if user lives with Less than 2 people: add one point
                if the user lives with 3 - 6 people: add two points
                if the user lives with more than 6 people: add three points
            Ask the user what city they live in?
            Ask the user if the live in downtown ("yes or no")
                if you live downtown, ask them have you thought about moving to the suburbs? ("yes or no")
                    if they have thought about it, add one point
                    if no, minus one point
            Ask the user their favorite animal?
            Ask the user how many pets they want?
            Ask SSN?
            Print everything and points
         */
        Scanner input = new Scanner(System.in);

        System.out.println("How many people do you live with");
        byte numberOfPeopleLiveWith = input.nextByte();

        int point = 0;

        if (numberOfPeopleLiveWith > 0 && numberOfPeopleLiveWith <= 12) {
            if (numberOfPeopleLiveWith <= 2) {
                point++;
            } else if(numberOfPeopleLiveWith < 7) {
                point += 2;
            } else {
                point +=3;
            }
        } else {
            System.err.println("Not a valid number of people");
        }

        input.nextLine();

        System.out.println("what city do you live in? : ");
        String city = input.nextLine();

        System.out.println("Do you live in downtown (\"yes or no\")");
        String yesOrNo = input.next();

        if(yesOrNo.equals("yes")) {
            System.out.println("Have you thought about moving to the suburbs? (\"yes or no\")");
            yesOrNo = input.next();

            if(yesOrNo.equals("yes")) {
                point++;
            }else {
                point--;
            }
        }

        System.out.println("what is your favorite animal? ");
        String favoriteAnimal = input.next();

        System.out.println("how many pets do you want? ");
        int quantityOfPets = input.nextInt();

        System.out.println("Enter your SSN?");
        int ssn = input.nextInt();

        System.out.println("I see, you live in \"" + city + "\" with " + numberOfPeopleLiveWith + " peoples. Your SSN is "
                + ssn + ". Your favorite animal is '" + favoriteAnimal + "' and you want " + quantityOfPets
                + " pets. You got total : \"" + point + "\" points.");

    }
}
