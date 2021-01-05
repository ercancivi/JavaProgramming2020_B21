package studingJava.day42_Tasks.restaurantTask;

    /*  Create a sub class of Employee called Server

                Add a constructor that sets all of the instance variables

            Actions:
                takeOrder(): server's name + "is taking an order"
                cleanTable(): server's name + "is cleaning the table"
     */

public class Server extends Employee{

    public Server (String name, String title, int employeeID, int hourlyRate, boolean fullTime) {
        setInfo(name, title, employeeID, hourlyRate, fullTime);
    }

    public void takeOrder() {
        System.out.println(name + " is taking an order");
    }

    public void cleanTable() {
        System.out.println(name + "is cleaning the table");
    }

}
