package day41_AccessModifiers_OOP.WarmUpTask;

    /*    create a class called ShoppingList
            create 5 objects of Item and store them into ArrayList of Items

            calculate the total cost of all Items in the list
     */

import java.util.ArrayList;
import java.util.Arrays;

public class ShoppingList {

    public static void main(String[] args) {

        ArrayList<Item> items = new ArrayList<>();

        items.addAll(Arrays.asList(new Item("Apple",1.5,4),
                                   new Item("Banana",0.3,6),
                                   new Item("Orange", 2.2,4),
                                   new Item("Watermelon", 5.99,2),
                                   new Item("Pineapple", 4.99, 1)));


        System.out.println(items);

        double total = 0;
        for(Item eachItem : items) {
            total += eachItem.calcCost();
        }

        System.out.println("total = " + total);


    }

}
