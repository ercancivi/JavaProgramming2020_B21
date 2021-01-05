package day45_Exceptions.phoneTask;

public class HuaWei extends Phone{

    public HuaWei(String model, double price) {
        super("HuaWei", model, "Chine", price);
    }

    public void spy() {
        System.out.println(brand + " " + model + " is spying");
    }

}
