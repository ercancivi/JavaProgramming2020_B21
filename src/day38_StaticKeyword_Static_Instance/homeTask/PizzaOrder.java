package day38_StaticKeyword_Static_Instance.homeTask;

public class PizzaOrder {

    public static void main(String[] args) {

        Pizza myOrder = new Pizza();

        myOrder.customizeOrder("medium",3,3);

        System.out.println("myOrder = " + myOrder);

    }

}
