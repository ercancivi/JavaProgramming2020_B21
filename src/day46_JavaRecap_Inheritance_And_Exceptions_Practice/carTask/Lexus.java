package day46_JavaRecap_Inheritance_And_Exceptions_Practice.carTask;

public final class Lexus extends Car{

    public Lexus(String model, String color, int year, double price) {
        super("Lexus", model, color, year, price);
    }
    @Override
    public void start() {
        System.out.println("Starting " + brand + " " + " by inserting the key");
    }

}
