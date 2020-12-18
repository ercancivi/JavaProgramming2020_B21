package day42_Inheritance.restaurantTask;

public class Chef extends Employee{

    public Chef(String name, String title, int employeeID, double hourlyRate, boolean fullTime) {
        setInfo(name, title, employeeID, hourlyRate, fullTime);
    }


    public void makeOrder() {
        System.out.println("chef's " + name + "is making an order");
    }

    public void washDishes() {
        System.out.println("chef's " + name + "is washing the dishes");
    }

}
