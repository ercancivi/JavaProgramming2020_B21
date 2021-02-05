package day47_Abstraction.carTask;

public class Bmw extends Car{

    public Bmw( String model, String color, int year, double price) {
        super("BMW", model, color, year, price);
    }


    @Override
    public void start() {
        System.out.println("call mechanic: oil change, jump start, ask your friends to push");
    }

}
