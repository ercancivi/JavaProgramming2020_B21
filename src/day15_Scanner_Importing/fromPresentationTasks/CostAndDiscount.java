package day15_Scanner_Importing.fromPresentationTasks;

import java.util.Scanner;

public class CostAndDiscount {

    public static void main(String[] args) {

        /*  Cost can be calculated as the selling price of the product times the quantity sold,
            i.e. Cost price × quantity.
            Write a program that asks the user to enter product price and quantity and then calculate the Cost.
            If the Cost is more than 5000 a discount is 10% offered.
            Program should display the discount and discounted Cost.
                Ex: 100, 3 -> 300 --> Cost: 300, Discount: 0%
                Ex: 100, 60 -> 6000 -> Cost: 5400, Discount: 10%
         */

        Scanner input = new Scanner(System.in);

        System.out.println("Enter product price : ");
        double productPrice = input.nextDouble();
        System.out.println("Enter quantity : ");
        double quantity = input.nextDouble();

        double cost = productPrice * quantity;
        double discountPercentage = 0;

        String finalCostAndDiscount = "";

        if(cost >= 5000) {
            discountPercentage = 10;
            cost -= (cost * (discountPercentage) / 100);
        }
        finalCostAndDiscount = "Cost : " + cost + ", Discount : " + discountPercentage + "%";
        System.out.println("finalCostAndDiscount = " + finalCostAndDiscount);


    }

}
