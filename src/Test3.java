import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        //WRITE YOUR CODE HERE

        String itemName;
        int itemPrice = 0;
        int balance = 100;

        Scanner scan = new Scanner(System.in);

        itemName = scan.nextLine();

        boolean isItemInList = itemName.equalsIgnoreCase("Smartphone") || itemName.equalsIgnoreCase("Laptop")
                || itemName.equalsIgnoreCase("Charger")    || itemName.equalsIgnoreCase("USB cable")
                || itemName.equalsIgnoreCase("Headphones") || itemName.equalsIgnoreCase("Pants")
                || itemName.equalsIgnoreCase("Hat")        || itemName.equalsIgnoreCase("Socks")
                || itemName.equalsIgnoreCase("Blanket")    || itemName.equalsIgnoreCase("Pillow");

        if(isItemInList) {
            if(itemName.equalsIgnoreCase("Smartphone")) {

                itemPrice = 300;

                if(itemPrice <= balance) {
                    balance -= itemPrice;

                }else {
                    System.out.println("Sorry, not enough funds on your gift card!");
                }

            }else if(itemName.equalsIgnoreCase("Laptop")) {

                itemPrice = 400;

                if(itemPrice <= balance) {
                    balance -= itemPrice;

                }else {
                    System.out.println("Sorry, not enough funds on your gift card!");
                }

            }else if(itemName.equalsIgnoreCase("Charger")) {

                itemPrice = 15;

                if(itemPrice <= balance) {
                    balance -= itemPrice;

                }else {
                    System.out.println("Sorry, not enough funds on your gift card!");
                }

            }else if(itemName.equalsIgnoreCase("USB cable")) {

                itemPrice = 10;

                if(itemPrice <= balance) {
                    balance -= itemPrice;

                }else {
                    System.out.println("Sorry, not enough funds on your gift card!");
                }

            }else if(itemName.equalsIgnoreCase("Headphones")) {

                itemPrice = 30;

                if(itemPrice <= balance) {
                    balance -= itemPrice;

                }else {
                    System.out.println("Sorry, not enough funds on your gift card!");
                }

            }else if(itemName.equalsIgnoreCase("Pants")) {

                itemPrice = 50;

                if(itemPrice <= balance) {
                    balance -= itemPrice;

                }else {
                    System.out.println("Sorry, not enough funds on your gift card!");
                }

            }else if(itemName.equalsIgnoreCase("Hat")) {

                itemPrice = 25;

                if(itemPrice <= balance) {
                    balance -= itemPrice;

                }else {
                    System.out.println("Sorry, not enough funds on your gift card!");
                }

            }else if(itemName.equalsIgnoreCase("Socks")) {

                itemPrice = 5;

                if(itemPrice <= balance) {
                    balance -= itemPrice;

                }else {
                    System.out.println("Sorry, not enough funds on your gift card!");
                }

            }else if(itemName.equalsIgnoreCase("Blanket")) {

                itemPrice = 60;

                if(itemPrice <= balance) {
                    balance -= itemPrice;

                }else {
                    System.out.println("Sorry, not enough funds on your gift card!");
                }

            }else {

                itemPrice = 40;

                if(itemPrice <= balance) {
                    balance -= itemPrice;

                }else {
                    System.out.println("Sorry, not enough funds on your gift card!");
                }
            }

        }else {
            System.out.println("Invalid item!");
        }

        if(balance >= 0 && balance < 100) {
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + balance + "$");
        }

    }
}
