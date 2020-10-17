package day17_String.practiceTasks;

import java.util.Scanner;

public class PlaceAnOrder {

    public static void main(String[] args) {

        /*  - Ask the user the enter the product name (String, multiple words)
            - Ask the user to enter the price (double)
            - Ask the user to enter the quantity(int)
            - Ask the user to enter their first name (String, single word)
            - Print in the following format:
                "$firstName, your order for $quantity $productName has been placed.
                Your total is $totalCost(price * quantity)."
            Ex:
                Input: "Apples" , 1.5, 5. "Luke"
                Output: Luke, your order for 5 Apples has been places. Your total is 7.5.
         */
        String productName, firstName;
        double price;
        int quantity;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the product name : ");
        productName = input.nextLine();

        System.out.println("Enter the price : ");
        price = input.nextDouble();

        System.out.println("Enter the quantity : ");
        quantity = input.nextInt();

        System.out.println("Enter your first name : ");
        firstName = input.next();

        System.out.println(firstName + ", your order for " + quantity + " " + productName
                + " has been places. Your total is " + (price * quantity) + ".");

    }

}
