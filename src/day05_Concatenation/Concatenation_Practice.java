package day05_Concatenation;

public class Concatenation_Practice {

    public static void main(String[] args) {

        int houseNumber = 7925;
        String streetName = "Johns Branch Dr";
        String cityName = "McLean";
        String state = "VA";
        int zipCode = 22000;

        String fullAddress = houseNumber + " " + streetName + "\n" + cityName + ", " + state + " " + zipCode; //concatenation
        System.out.println(fullAddress);

        System.out.println("===============================");

        String brand = "Toyota";
        String model = "Camry";
        int year = 2010;
        int mileage = 55000;
        double price = 18000;
        String color = "Red";

        // Output : 2010 Toyota Camry, 55000 miles, Red, $18000

        String carInfo = year + " " + brand + " " + model + ", " + mileage + " miles, " + color + ", $" + price; //concatenation
        System.out.println(carInfo);


    }

}
