package studingJava.office_Hours_Practice_12_09_2020.pizzaTask;

public class Pizza {

    public String size;
    public int cheeseTopping, pepperoniTopping, quantity;
    public double priceOfPizza, tips, totalPrice;


    public void customizePizza(String size, int cheeseTopping, int pepperoniTopping, double tips) {
        this.size = size;
        this.cheeseTopping = cheeseTopping;
        this.pepperoniTopping = pepperoniTopping;
        priceOfPizza = calculateCost();
//        tips = tips/100;
        this.tips = (tips/100)*priceOfPizza;
        totalPrice = priceOfPizza + this.tips;
    }

    public double calculateCost() {
        double price = (size.equalsIgnoreCase("medium")) ? 12 :(size.equalsIgnoreCase("large")) ? 14 : 10;

        price += 1*cheeseTopping + 1.5 * pepperoniTopping;
        return price;
    }

    @Override
    public String toString() {
        return "PizzaOrder{" +
                "size='" + size + '\'' +
                ", cheeseTopping=" + cheeseTopping +
                ", pepperoniTopping=" + pepperoniTopping +
                ", priceOfPizza=" + priceOfPizza +
                ", tips=" + tips +
                ", totalPrice=" + totalPrice +
                '}';
    }
}
