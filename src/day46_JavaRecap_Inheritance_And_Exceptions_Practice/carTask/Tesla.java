package day46_JavaRecap_Inheritance_And_Exceptions_Practice.carTask;

public final class Tesla extends Car{

    public Tesla(String model, String color, int year, double price) {
        super("Tesla", model, color, year, price);
    }

    @Override
    public void start() {
        System.out.println("Starting " + brand + " " + model + " by voice control");
    }

    public void autoPark() {
        System.out.println("Self-parking " + brand + " " + model);
    }

}
