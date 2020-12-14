package day41_AccessModifiers_OOP;

public class LogIn {

    public static void main(String[] args) {

        Credentials obj = new Credentials();

        // System.out.println( obj.userName );
        //  obj.userName = "ABC";
        // System.out.println( obj.userName );

        System.out.println( obj.getUserName()  );

        System.out.println( obj.getPassWord() );

        //  obj.getPassWord() = 1233456;  Read ONLY

        //  obj.userName = "HI";



    }

}
