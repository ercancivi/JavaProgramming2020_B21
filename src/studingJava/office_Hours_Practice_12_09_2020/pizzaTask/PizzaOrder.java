package studingJava.office_Hours_Practice_12_09_2020.pizzaTask;

import java.util.ArrayList;
import java.util.Arrays;

public class PizzaOrder {

    public static void main(String[] args) {

        Pizza pizza1 = new Pizza();

        pizza1.customizePizza("Large",3,2,15);

        System.out.println("pizza1 = " + pizza1);

        Pizza[] cybertekPizza = new Pizza[175];

        Pizza pizza = new Pizza();
        pizza.customizePizza("Medium", 2,3,18);

        for(int i = 0; i <= cybertekPizza.length-1; i++) {
            pizza.customizePizza("Medium", 2,3,18);
            cybertekPizza[i] = pizza;
        }

        double total = 0;
        for(Pizza each : cybertekPizza) {

            total += each.totalPrice;
        }

        System.out.println("total = " + total);


        ArrayList<Pizza> pizzas = new ArrayList<>();

        for(int i=1; i<=60; i++) {
            Pizza medium = new Pizza();
            medium.customizePizza("Medium", 2,3,18);

            Pizza large = new Pizza();
            large.customizePizza("Large", 3,4,18);

            Pizza small = new Pizza();
            small.customizePizza("Small", 1,2,18);

            pizzas.addAll(Arrays.asList(small, medium, large));
        }

        System.out.println("number of pizza: " + pizzas.size());

        double sum = 0;

        for (Pizza each : pizzas) {
            sum += each.totalPrice;

        }

        System.out.println("sum = " + sum);

    }

}
