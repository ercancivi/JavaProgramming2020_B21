package day08_Shorthand_Relational;

public class ShortHandOperators {

    public static void main(String[] args) {

        //Assignment Operator : =
        int a = 10;
        System.out.println("a = " + a); //10

            a = 30;
        System.out.println("a = " + a); //30


        String schoolName = "Cybertek";
            schoolName = "MIT";
        System.out.println("schoolName = " + schoolName); //MIT


        //Subtraction Assignment Operator: -=
        int x = 100;
            x -= 62; // x = x - 62; ==> 38
        System.out.println("x = " + x);


        double salary = 100000;
               salary -= salary * 0.28; //this is salary After Tax
        //     salary -= 28000;
        //     salary -= salary - 28000;
        //     salary -= 100000 - 28000;
        //     salary -= 72000;
        System.out.println("salary = " + salary);


        int x2 = 999999;
            x2 -= 25;
        System.out.println("x2 = " + x2);


        double balance = 2000;
        //withdrawing 450
            balance -= 450; // balance = balance - 450;
        System.out.println("balance = " + balance);

        //withdrawing 1000
            balance -= 1000;
        System.out.println("balance = " + balance);


        //Addition Assignment Operator: +=
        //depositing 5000
            balance += 5000;
        System.out.println("balance = " + balance);

        int y2 = 400;
            y2 += 10000 * 0.1;
        //  y2 += 1000;
        //  y2 = 1400;
        System.out.println("y2 = " + y2);

        //If we apply addition assignment operator to String it means we are concatenating them
        String name = "Cybertek";
            name += " School ";
        //  name = name + " School";
        System.out.println("name = " + name);


        //Multiplication Assignment Operator: *=
        double totalTax = 100000;
               totalTax *= 0.28; // totalTax = 100000 * 0.28;
        System.out.println("totalTax = " + totalTax);


        int bonus = 5000;
            bonus *= 2+1; // bonus = bonus * 3;
        System.out.println("bonus = " + bonus);


        //Division Assignment Operator: /=
        int y3 = 10;
            y3 /= 5; //y3 = y3 / 5;
                     //y3 = 10 / 5; ==> 2
        System.out.println("y3 = " + y3);


        int house = 500000;
        int month = 240;

        double monthlyPayment = 500000;
               monthlyPayment /= month; //monthlyPayment = monthlyPayment / month;
                                      //monthlyPayment = 500000 / 240; ==> 2083.3333333333335
        System.out.println("monthlyPayment = " + monthlyPayment);


        //Remainder(Modulus) Assignment Operator: %=
        //100 / 3; ==> 33.333333 ==> remainder : 1
        int a2 = 100;
            a2 %= 3; // a2 = a2 % 3;
                     // a2 = 100 % 3; ==> 1
        System.out.println("a2 = " + a2);


        int a3 = 2000;
            a3 %= 2; // a3 = a3 % 2;
                     // a3 = 2000 % 2; ==> 0
        System.out.println("a3 = " + a3);








    }

}
