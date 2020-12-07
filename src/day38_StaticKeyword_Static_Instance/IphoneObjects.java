package day38_StaticKeyword_Static_Instance;

public class IphoneObjects {

    public static void main(String[] args) {

        Iphone phone1 = new Iphone();

        Iphone phone2 = new Iphone();

        Iphone phone3 = new Iphone();

        Iphone phone4 = new Iphone();

        System.out.println(phone1.OS);//This is NOT preferred way to call static member
        System.out.println(phone2.OS);//This is NOT preferred way to call static member
        System.out.println(phone3.OS);//This is NOT preferred way to call static member
        System.out.println(phone4.OS);//This is NOT preferred way to call static member

        phone1.OS = "Android";//if we reassign static variable, it will effect all the others object

        System.out.println(phone1.OS);//This is NOT preferred way to call static member
        System.out.println(phone2.OS);//This is NOT preferred way to call static member
        System.out.println(phone3.OS);//This is NOT preferred way to call static member
        System.out.println(phone4.OS);//This is NOT preferred way to call static member

        System.out.println("=========================================");

        Iphone.getInfo();//This is the preferred way to call static member!!!!!!



    }

}
