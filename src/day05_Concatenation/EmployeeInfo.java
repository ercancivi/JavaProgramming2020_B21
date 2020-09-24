package day05_Concatenation;

public class EmployeeInfo {

    public static void main(String[] args) {

        /*  Warmup tasks:
        1. create a class named EmployeeInfo
                declare the following variables:
                    firstName, lastName, gender, age, companyName, jobTitle, isFullTime, isMarried, salary
            write a program that can display the full info of the employee
                    ex:
                             firstName = John
                             lastName = Daniel
                             gender = M
                             age = 35
                             companyName = CapitalOne
                             jobTitle = SDET
                             isFullTime = true
                             isMarried = false
                             salary = 120000.50
             output:
                        Employee' full name is: John Daniel
                        John Daniel' gender is: M
                        John Daniel' age is: 35 years old
                        John Daniel works at: CapitalOne
                        John Daniel' Job title is: SDET
                        John Daniel' salary is 120000.5 $
                        John Daniel is full time employee: true
                        John Daniel is married: false
         */
        String firstName = "John";  // "" for texts
        String lastName = "Daniel";
        String fullName = firstName + " " + lastName;   // String ==> text
        char gender = 'M';  // '' for single characters
        int age = 35;
        String companyName = "CapitalOne";
        String jobTitle = "SDET";
        boolean isFullTime = true;
        boolean isMarried = false;
        double salary = 120000.50;

        System.out.print("Employee full name is: ");
        System.out.println(fullName);

        System.out.print(fullName);
        System.out.print(" gender is: ");
        System.out.println(gender);

        System.out.print(fullName);
        System.out.print(" age is: ");
        System.out.print(age);
        System.out.println(" years old");

        System.out.print(fullName);
        System.out.print(" works at: ");
        System.out.println(companyName);

        System.out.print(fullName);
        System.out.print(" Job Title is: ");
        System.out.println(jobTitle);

        System.out.print(fullName);
        System.out.print(" salary is: $ ");
        System.out.println(salary);

        System.out.print(fullName);
        System.out.print(" is full time employee: ");
        System.out.println(isFullTime);

        System.out.print(fullName);
        System.out.print(" is married: ");
        System.out.println(isMarried);

        System.out.println("====================================");

        System.out.println("Employee full name is: " + firstName + ' ' + lastName);
        System.out.println(firstName + " " + lastName + " gender is: " + gender);
        System.out.println(firstName + " " + lastName + " age is: " + age + " years old");
        System.out.println(firstName + " " + lastName + " works at: " + companyName);
        System.out.println(firstName + " " + lastName + " Job Title is: " + jobTitle);
        System.out.println(firstName + " " + lastName + " salary is: $ " + salary);
        System.out.println(firstName + " " + lastName + " is full time employee: " + isFullTime);
        System.out.println(firstName + " " + lastName + " is married: " + isMarried);

        System.out.println("====================================");

        System.out.println("Employee full name is: " + fullName);
        System.out.println(fullName + " gender is: " + gender);
        System.out.println(fullName + " age is: " + age + " years old");
        System.out.println(fullName + " works at: " + companyName);
        System.out.println(fullName + " Job Title is: " + jobTitle);
        System.out.println(fullName + " salary is: $ " + salary);
        System.out.println(fullName + " is full time employee: " + isFullTime);
        System.out.println(fullName + " is married: " + isMarried);


    }

}
