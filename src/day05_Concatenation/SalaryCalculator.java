package day05_Concatenation;

public class SalaryCalculator {

    public static void main(String[] args) {

        /*  Task : SalaryCalculator
            variables : salary, stateTaxRate, federalTaxRate, stataTax, federalTax, totalTax, salaryAfterTax
            output : Your salary is: YourSalary
                     Your State Tax: YourStateTax
                     Your Federal Tax: YourFederalTax
                     Your Total Tax: YourTotalTax
                     Your salary after tax: YourSalaryAfterTax
         */
        int salary = 150_000;
        float stateTaxRate = 0.0625F;
        float federalTaxRate = 0.22F;
        double stateTax = stateTaxRate * salary;
        double federalTax = federalTaxRate * salary;
        double totalTax = stateTax + federalTax;
        double salaryAfterTax = salary - totalTax;

        System.out.println("My salary is: " + salary + "\nMy State Tax: " + stateTax + "\nMy Federal Tax: " + federalTax
                                            + "\nMy Total Tax: " + totalTax + "\nMy salary after tax: " + salaryAfterTax);

    }

}
