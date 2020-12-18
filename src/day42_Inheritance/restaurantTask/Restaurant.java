package day42_Inheritance.restaurantTask;

import java.util.ArrayList;
import java.util.Arrays;

public class Restaurant {

    public String ownerName;
    public String location;
    public int numberOfStars;
    public ArrayList<Server> servers = new ArrayList<>();
    public ArrayList<Chef> Chefs = new ArrayList<>();


    public Restaurant(String ownerName, String location, int numberOfStars) {
        this.ownerName = ownerName;
        this.location = location;
        this.numberOfStars = numberOfStars;
    }

    public void hireServer(Server server) {
        servers.add(server);
    }

    public void hireServer(Server[] servers) {
        this.servers.addAll(Arrays.asList(servers));
    }

    public void hireChef(Chef chef) {
        Chefs.add(chef);
    }

    public void hireChef(Chef [] chefs) {
        Chefs.addAll(Arrays.asList(chefs));
    }

    public void terminateServer(int employeeID) {
        for(Server each: servers) {
            if(employeeID == each.employeeID) {
                servers.remove(employeeID);
            }
        }
    }

    public void terminateChef(int employeeID) {
        for(Chef each: Chefs){
            if(employeeID == each.employeeID) {
                Chefs.remove(employeeID);
            }
        }
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "ownerName='" + ownerName + '\'' +
                ", location=" + location +
                ", numberOfStars=" + numberOfStars +
                ", Servers=" + servers.size() +
                ", Chefs=" + Chefs.size() +
                '}';
    }
}