package day46_JavaRecap_Inheritance_And_Exceptions_Practice.carTask;

public class CarMax {

    public static void main(String[] args) {

        Mercedes mercedes = new Mercedes("G Class","yellow",2021,120000);
        Bmw bmw = new Bmw("X6","blue",2022,25000);
        Lexus lexus = new Lexus("RX 350 ","Red",2018,5000);
        Tesla tesla = new Tesla("Model 3","white", 2021, 140000);

//        mercedes.autoPark();
        mercedes.start();
        lexus.start();
        bmw.start();
        tesla.start();

        System.out.println("==============================================");
        mercedes.drive();
        bmw.drive();
        lexus.drive();
        tesla.drive();

        System.out.println("==============================================");
//        mercedes.autoPark();
        tesla.autoPark();
        bmw.autoPilot();

    }

}
