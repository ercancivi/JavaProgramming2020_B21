package day46_JavaRecap_Inheritance_And_Exceptions_Practice.carTask;

public final class Bmw extends Car{

   public Bmw(String model, String color, int year, double price) {
       super("BMW", model, color, year, price);
   }

    @Override
    public void start() {
        System.out.println("Starting " + brand + " " + model + " by calling mechanic");
    }

    public void autoPilot() {
        System.out.println("Self-driving " + brand + " " + model);
    }
}
