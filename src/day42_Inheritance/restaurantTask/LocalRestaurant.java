package day42_Inheritance.restaurantTask;

import java.util.ArrayList;

public class LocalRestaurant {

    public static void main(String[] args) {

        Restaurant restaurant1 = new Restaurant("Cybertek", "Houston", 5);

        ArrayList<Server> serversList = new ArrayList<>();

        serversList.add(new Server("ahmed","SDET",10,40,true));

        System.out.println("serversList = " + serversList);

        restaurant1.hireServer(new Server("Guvanch","Server",9,45,true));


        ArrayList<Chef> chefsList = new ArrayList<>();
        chefsList.add(new Chef("Ramiz","SDET",11,40,false));

        System.out.println("chefsList = " + chefsList);

        restaurant1.hireChef(new Chef("Irina","Baker",12,45,true));



        System.out.println("restaurant1 = " + restaurant1);


    }

}
