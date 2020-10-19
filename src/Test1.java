import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        //WRITE YOUR CODE HERE
        String itemName;
        int itemPrice = 0;
        int balance = 100;

        Scanner scan = new Scanner(System.in);
        itemName = scan.nextLine();

        boolean isValid = true;
        if(itemName.equalsIgnoreCase("Smartphone") || itemName.equalsIgnoreCase("Laptop")) {
            itemPrice = itemName.equalsIgnoreCase("Smartphone") ? 300 : 400;

        }else if(itemName.equalsIgnoreCase("Charger") || itemName.equalsIgnoreCase("USB cable")) {
            itemPrice = (itemName.equalsIgnoreCase("Charger")) ? 15 : 10;

        }else if(itemName.equalsIgnoreCase("Headphones") || itemName.equalsIgnoreCase("Pants")) {
            itemPrice = (itemName.equalsIgnoreCase("Headphones")) ? 30 : 50;

        }else if(itemName.equalsIgnoreCase("Hat") || itemName.equalsIgnoreCase("Socks")) {
            itemPrice = (itemName.equalsIgnoreCase("Hat")) ? 25 : 5;

        }else if(itemName.equalsIgnoreCase("Blanket") || itemName.equalsIgnoreCase("Pillow")) {
            itemPrice = (itemName.equalsIgnoreCase("Blanket")) ? 60 : 40;

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
