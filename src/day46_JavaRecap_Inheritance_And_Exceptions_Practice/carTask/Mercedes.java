package day46_JavaRecap_Inheritance_And_Exceptions_Practice.carTask;

public final class Mercedes extends Car{

    public Mercedes(String model, String color, int year, double price) {
        super("Mercedes", model, color, year, price);
    }

    @Override
    public void start() {
        System.out.println("Starting " + brand + " " + model + " by pushing start button");
    }




}
