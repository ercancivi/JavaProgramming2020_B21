import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        //WRITE YOUR CODE HERE
        String itemName;
        int itemPrice = 0;
        int balance = 100;

        Scanner scan = new Scanner(System.in);
        itemName = scan.nextLine();
        boolean isValid = true;
        if(itemName.equalsIgnoreCase("Smartphone")) {
            itemPrice = 300;
        }else if(itemName.equalsIgnoreCase("Laptop")) {
            itemPrice = 400;
        }else if(itemName.equalsIgnoreCase("Charger")) {
            itemPrice = 15;
        }else if(itemName.equalsIgnoreCase("USB cable")) {
            itemPrice = 10;
        }else if(itemName.equalsIgnoreCase("Headphones")) {
            itemPrice = 30;
        }else if(itemName.equalsIgnoreCase("Pants")) {
            itemPrice = 50;
        }else if(itemName.equalsIgnoreCase("Hat")) {
            itemPrice = 25;
        }else if(itemName.equalsIgnoreCase("Socks")) {
            itemPrice = 5;
        }else if(itemName.equalsIgnoreCase("Blanket")) {
            itemPrice = 60;
        }else if(itemName.equalsIgnoreCase("Pillow")) {
            itemPrice = 40;
        }else {
            System.out.println("Invalid item!");
            isValid = false;
        }
        balance = (itemPrice <= balance) ? (balance -= itemPrice) : balance;

        if(isValid) {
            if (balance >= 0 && balance < 100) {
                System.out.println("Thank you for your purchase!\nYour current balance is: " + balance + "$");
            } else {
                System.out.println("Sorry, not enough funds on your gift card!");
            }
        }

    }


}
