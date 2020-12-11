package day38_StaticKeyword_Static_Instance.homeTask;

    /*
    1. create a custom class for Pizza that should contain the following:
			variables:
					size (either small, medium, large)
					number of cheese topping
					number of pepperoni topping
					tips

			methods:
					customizeOrder(): allows user to set the size and toppings of Pizza
					calcCost(): returns the total cost  as double
					toString(): get the full information and total cost of Pizza


			Pizza cost is determined by:
						Small: $10 + $1.5 per pepperoni topping + 1$ per cheese topping
						Medium: $12 + $1.5 per pepperoni topping + 1$ per cheese topping
						Large: $14 + $1.5 per pepperoni topping + 1$ per cheese topping

     */

public class Pizza {

    public String size;
    public int cheeseTopping, peperoniTopping;
    public double tips;
    public double totalCoast;


    public void customizeOrder(String size, int cheeseTopping, int peperoniTopping) {
        this.size = size;
        this.cheeseTopping = cheeseTopping;
        this.peperoniTopping = peperoniTopping;
    }


    public double calcCost() {
        double totalCoast = 0;
        totalCoast = (size.equalsIgnoreCase("small")) ? 10
                   : (size.equalsIgnoreCase("medium")) ? 12 : 14;

        totalCoast += (1 * cheeseTopping);
        totalCoast += (1.5 * peperoniTopping);

        return totalCoast;
    }

    public String toString() {
        return "!!!Your Order!!!\n" + "Pizza' size: " + size
                + "\nquantity of cheese topping: " + cheeseTopping
                + "\nquantity of pepperoni topping: " + peperoniTopping
                + "\nYour total for this order is: " + calcCost();
    }



}
