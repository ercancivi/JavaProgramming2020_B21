package studingJava.day40_Tasks.task0;

    /*
    Item:
		variables:
			name, unitPrice, quantity

		add constructor to initialize all fields of Item

		methods:
			calcCost(): returns the total cost
						hint:  total cost is = quantity * unitPrice
			toString()
     */

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

    @Override
    public String toString() {
        return "Item {"
                + "name = " + name
                + ", unit price = $" + unitPrice
                + ", quantity = " + quantity
                + ", total cost = $" + totalCost
                + "}";
    }

}
