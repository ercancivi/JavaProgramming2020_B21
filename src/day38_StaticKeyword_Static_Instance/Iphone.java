package day38_StaticKeyword_Static_Instance;

public class Iphone {

    public String model, color, storage;
    public double price;


    public static String brand = "Apple", OS = "IOS", madeIn = "China";
//    public static String OS = "IOS"; we group it under String type on above line


    public void call(long phoneNumber) {
        System.out.println("Iphone " + model + " is calling " + phoneNumber);
    }

    public static void getInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Operating System: " + OS);
        System.out.println("Made in: " + madeIn);
    }

    public String toString() {
        return "Brand: " + brand + " Model: " + model + " Color: " + color + " Price: " + price + " Operating System: " + OS;
    }



}
