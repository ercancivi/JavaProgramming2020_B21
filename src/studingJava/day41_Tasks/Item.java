package studingJava.day41_Tasks;

    /*
    create a class called Item
			instance variables:
				name, unitPrice, quantity

			add a constructor that can initialize the fields

			instance methods:
				calcCost(): returns the total cost as double
							hint: totalCost = quantity * unitPrice

				toString(): returns the name, unit price, quantity and total cost info as calculated by calcCost()

	create a class called ShoppingList
			create 5 objects of Item and store them into ArrayList of Items

			calculate the total cost of all Items in the list
     */

import java.util.ArrayList;
import java.util.Arrays;

public class Item {

    public String name;
    public double unitPrice, totalCost;
    public int quantity;

    public Item(String name, double unitPrice, int quantity) {
        this.name = name;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
        totalCost = calcCost();
    }

    public double calcCost() {
        totalCost = quantity * unitPrice;
        return totalCost;
    }

    public String toString() {
        return "Item {" +
                "name = " + name +
                ", unit price = $" + unitPrice +
                ", quantity = " + quantity +
                ", total cost = $" + calcCost() +
                "}";
    }

}


class ShoppingList {

    public static void main(String[] args) {

        Item item1 = new Item("Tomato",1.50,4);
        Item item2 = new Item("Potato", 1.00,5);
        Item item3 = new Item("Bell Pepper",1.25, 4);
        Item item4 = new Item("Egg",0.10,10);
        Item item5 = new Item("Baklava",1,12);

//        ArrayList<Item> itemsList = new ArrayList<>();
        /* solution 1:
        itemsList.add(item1);
        itemsList.add(item2);
        itemsList.add(item3);
        itemsList.add(item4);
        itemsList.add(item5);
         */

        /*
        solution 2:
        Item[] items = {item1,item2,item3,item4,item5};
        itemsList.addAll(Arrays.asList(items));
         */

//        solution 3:
        ArrayList<Item> itemsList = new ArrayList<>(Arrays.asList(item1,item2,item3,item4,item5));

        for(Item each : itemsList) {
            System.out.print("each.name = " + each.name);
            System.out.println(", each.totalCost = " + each.totalCost);
        }

        double totalCostOfShoppingList = 0;
        for(Item each : itemsList) {
            totalCostOfShoppingList += each.totalCost;
        }

        System.out.println("totalCostOfShoppingList = " + totalCostOfShoppingList);

    }

}