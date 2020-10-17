package day17_String.practiceTasks;

import java.util.Scanner;

public class StockMarket {

    public static void main(String[] args) {

        /*  - Ask the user how many total shares they have already? (int)
		    -> If the user gives 0 or give a negative number none of the rest condition should be executed

            - Ask the user how much their total value in the stock market is (double)
            - Ask the user to enter the name of the company they have the most shares in (String, multiple words)
            - Ask the user the value of those shares (double)
            - Calculate and print the difference of the user's total stock market valued with the biggest share value
            - Print in the following format:
                "Your total stock market holding is $totalValue which is made up of $totalShareNumber.
                $companyName is the largest company holdings you have of $companyValue between $companyShares."
         */
        int totalShares;
        double totalValue, valueOfMostShares, differenceOfBothValues;
        String companyNameOfMostShares;

        Scanner input = new Scanner(System.in);

        System.out.println("How many total shares you have already? :");
        totalShares = input.nextInt();

        if(totalShares > 0) {

            System.out.println("How much their total value in the stock market is: ");
            totalValue = input.nextDouble();

            input.nextLine();

            System.out.println("Enter the name of the company you have the most shares in : ");
            companyNameOfMostShares = input.nextLine();

            System.out.println("Enter the value of those shares");
            valueOfMostShares = input.nextDouble();

            differenceOfBothValues = totalValue - valueOfMostShares;

            System.out.println("Your total stock market holding is $" + totalValue + " which is made up of "
                    + totalShares + ".\n" + companyNameOfMostShares + " is the largest company holdings you have of $"
                    + valueOfMostShares + " between $" + totalValue + ".");


        }else {
            System.out.println("you don't have enough share");
        }

    }

}
