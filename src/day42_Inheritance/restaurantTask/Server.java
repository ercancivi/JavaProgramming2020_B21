package day42_Inheritance.restaurantTask;

public class Server extends Employee{

    public Server(String name, String title, int employeeID, double hourlyRate, boolean fullTime) {
        setInfo(name, title, employeeID, hourlyRate, fullTime);
    }

    public void takeOrder() {
        System.out.println("Server's " + name + "is taking an order");
    }

    public void cleanTable() {
        System.out.println("Server's " + name + "is cleaning the table");
    }

}
