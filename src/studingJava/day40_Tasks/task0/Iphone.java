package studingJava.day40_Tasks.task0;

    /*
    Phone:
		variables:
			brand, model, price, size, hasScreen,

		add a constructor to initialize the fields

		methods:
			toString
     */

public class Iphone {

    public String brand, model, size;
    public double price;

    public static boolean hasScreen;

    static {
        hasScreen = true;
    }

    public Iphone(String brand, String model, String size, double price) {
        this.brand = brand;
        this.model = model;
        this.size = size;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Iphone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", price=" + price +
                ", has screen=" + hasScreen +
                '}';
    }
}
