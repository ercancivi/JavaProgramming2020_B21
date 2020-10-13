package day14_SwitchContinue_And_Recap;

public class SalaryCalculator {

    public static void main(String[] args) {

        /*  write a program for the salary calculator
			given info:
					hourlyRate $ 45
					weeklyHours 35
					numberOfWeeks 52
			pre conditions: hourlyRate cannot be negative
							weekly hours cannot be negative (less than 1) or more than 65
							numberOfWeeks cannot be more than 52 weeks or less than 1
			hint : salary = hourlyRate * weeklyHours * numberOfWeeks
         */

        int hourlyRate = 35;
        int weeklyHours = 40;
        int numberOfWeeks = 50;

        int salary = 0;

        if (hourlyRate > 0) {
            if (weeklyHours > 1 && weeklyHours <= 65) {
                if (numberOfWeeks > 1 && numberOfWeeks <= 52) {

                    salary = hourlyRate * weeklyHours * numberOfWeeks;
                    System.out.println("Your salary is = " + salary);

                } else {
                    System.out.println("Number of Weeks CANNOT be less than 1 or greater than 52");
                    System.err.println("Number of Weeks CANNOT be less than 1 or greater than 52");
                }
            } else {
                System.out.println("Weekly Hours CANNOT be less than 1 or greater than 65");
                System.err.println("Weekly Hours CANNOT be less than 1 or greater than 65");
            }
        } else {
            System.out.println("Hourly Rate CANNOT be Negative or 0");
            System.err.println("Hourly Rate CANNOT be Negative or 0");
        }


        if (salary != 0) {
            System.out.println("Your salary is = " + salary);
        }


    }

}
