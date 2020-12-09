package day38_StaticKeyword_Static_Instance.homeTask;

public class Pizza {

    public String size;
    public int cheeseTopping, peperoniTopping;
    public double tips;


    public void customizeOrder(String size, int cheeseTopping, int peperoniTopping) {
        this.size = size;
        this.cheeseTopping = cheeseTopping;
        this.peperoniTopping = peperoniTopping;
    }


//    public double calcCost() {
//        if(size.equalsIgnoreCase("small")) {
//            return 10 + (1.5 * peperoniTopping) + (1 * cheeseTopping);
//        }else if(size.equalsIgnoreCase("medium")) {
//            return 12 + (1.5 * peperoniTopping) + (1 * cheeseTopping);
//        }else if(size.equalsIgnoreCase("large")) {
//            return 14 + (1.5 * peperoniTopping) + (1 * cheeseTopping);
//        }
//
//    }

//    public String toString() {
//        return "Your Order\n" + "Pizza' size: " + size + " quantity of cheese topping: " + cheeseTopping
//                + " quantity of pepperoni topping: " + peperoniTopping + "\n" + "Your total for this order is: " + calcCost();
//    }



}
