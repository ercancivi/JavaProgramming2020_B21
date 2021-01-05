package studingJava.day42_Tasks.restaurantTask;

    /*  Create a sub class of Employee called  Chef

                Add a constructor that sets all of the instance variables

            Actions: (all void methods)
                makeOrder(): chef's name + "is making an order"
                washDishes(): chef's name + "is washing the dishes"
     */

public class Chef extends Employee{

    public Chef(String name, String title, int employeeID, int hourlyRate, boolean fullTime) {
        setInfo(name, title, employeeID, hourlyRate, fullTime);
    }

    public void makeOrder() {
        System.out.println(name + "is making an order");
    }

    public void washDishes() {
        System.out.println(name + "is washing the dishes");
    }


}
