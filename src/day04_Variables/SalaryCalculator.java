package day04_Variables;

public class SalaryCalculator {

    public static void main(String[] args) {

        /*  Task04 :
            write a program that can calculate the salary after tax based on the salary and tax rate
                Ex:
                    if salary = 100000
                    tax = 0.28

                    salary after tax = 72000
         */
        float taxRate = 0.28F;
        int salary = 100000;

        double salaryAfterTax = salary - (salary * taxRate);

        System.out.println("Salary after tax is = ");
        System.out.println(salaryAfterTax);

    }

}
