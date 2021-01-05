package studingJava.day42_Tasks.restaurantTask;

    /*  Create a class called Restaurant

            Attributes:
                OwnerName, Location, numberOfStars
                Servers (ArrayList of Server objects)
                Chefs (ArrayList of Chef objects)

                Add A constructor that can set the owner, location, and number of stars

            Actions: (all void methods)
                hireServer(Server server): accepts a server object and adds it to the Servers ArrayList

                hireServer(Server [] servers): accepts an array of Server objects and adds all of them to the Servers ArrayList

                hireChef(Chef chef): accepts a chef object and adds it to the Chefs ArrayList

                hireChef(Chef [] chefs): accepts an array of Chef objects and adds all of them to the Chef ArrayList

                toString(): Return (String) of all the information of a Restaurant object. No need to print the whole list of Servers or Chefs. Print the number of Servers and Chefs along side the other information

        - Extra optional tasks
                terminateServer(int employeeID): removes the server with the matching ID  from the arraylist
                terminateChef(int employeeID): removes the chef with the matching ID  from the arraylist
     */

import java.util.ArrayList;
import java.util.Arrays;

public class Restaurant {

   public String ownerName, location;
   public int numberOfStars;
   public ArrayList<Server> Servers = new ArrayList<>();
   public ArrayList<Chef> Chefs = new ArrayList<>();

   public Restaurant(String ownerName, String location, int numberOfStars) {
       this.ownerName = ownerName;
       this.location = location;
       this.numberOfStars = numberOfStars;
   }

   public void hireServer(Server server) {
       Servers.add(server);
   }

   public void hireServer(Server[] servers) {
       Servers.addAll(Arrays.asList(servers));
   }

   public void hireChef(Chef chef) {
       Chefs.add(chef);
   }

   public void hireChef(Chef[] chefs) {
       Chefs.addAll(Arrays.asList(chefs));
   }

   public void terminateServer(int employeeID) {
        for(Server each : Servers) {
            if(employeeID == each.employeeID) {
                Servers.remove(each);
            }
        }
   }

   public void terminateChef(int employeeID) {

   }

    @Override
    public String toString() {
        return "Restaurant{" +
                "ownerName='" + ownerName + '\'' +
                ", location='" + location + '\'' +
                ", numberOfStars=" + numberOfStars +
                ", Servers=" + Servers.size() +
                ", Chefs=" + Chefs.size() +
                '}';
    }
}
