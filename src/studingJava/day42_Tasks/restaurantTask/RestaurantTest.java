package studingJava.day42_Tasks.restaurantTask;

public class RestaurantTest {

    /*
    Resturant Task:
------------------------------------------------------------------
        Create a class called Employee
            Attributes:
                name, title, employeeID, hourlyRate, fullTime(boolean)

           Actions:
                setInfo(), work()
                calcSalary(): returns the salary. (assume that weeklyHours is 40, and there are 52 weeks in a year
                toString(): Returns (String) all the information of a Server
                    -> Extra: For fullTime status, instead of printing a boolean value, print "full-time" or "part-time"

------------------------------------------------------------------
        Create a sub class of Employee called Server


                Add a constructor that sets all of the instance variables

            Actions:
                takeOrder(): server's name + "is taking an order"
                cleanTable(): server's name + "is cleaning the table"

------------------------------------------------------------------
        Create a sub class of Employee called  Chef

                Add a constructor that sets all of the instance variables

            Actions: (all void methods)
                makeOrder(): chef's name + "is making an order"
                washDishes(): chef's name + "is washing the dishes"

------------------------------------------------------------------
        Create a class called Restaurant

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

------------------------------------------------------------------

        Create a class LocalRestaurant that has a main method with the following:
            - Make a Restaurant object
            - Create an array of servers with their information set. Add those initial servers to the ArrayList of the Restaurant object
            - Create an array of chefs with their information set. Add those initial chefs to the ArrayList of the Restaurant object
            - Print your whole restaurants information


        - Extra optional tasks (Should still be done in the LocalRestaurant main method)
            - Find out the cost of all the employees (servers + chefs) by checking all of their salaries

            - Make two new ArrayLists that will separate all the employees (servers + chefs) by full time and part time. Their position of server or chef does not matter for these ArrayList, only their employment status

            - Make sure the Restaurant is staffed enough for the level of stars.it is using the following requirements:
                5 stars: need at least 6 chefs and 10 servers
                4 stars: need at least 3 chefs and 7 servers
                3 stars: need at least 1 chefs and 4 servers

                - if the restaurant does not have the correct number of chefs or servers based on their number of stars you should print a message: "Need to hire more $chefs or $servers (maybe both). Otherwise you can print: "Up to standard"
-----------------------------------------------------------------

     */
}
