package day13_SwitchStatement.warmUpTasks;

public class AgeGroups {

    public static void main(String[] args) {

        /*  Task 3 :
            write a program that can define the age groups of a person
            age groups are:
                    Teenager (< 21)
                    Adult   (>=21 && <55 )
                    Senior  ( > 55 )

                Hint:  age cannot be negative or greater than 150

                  NOTE: MUST APPLY NESTED IF
         */
        int age = 158;
        String ageCategory = "";

        if (age > 0 && age < 150) {

            if (age >= 55) {
                ageCategory = "Senior";
            } else if (age >= 21) {
                ageCategory = "Adult";
            } else {
                ageCategory = "Teenager";
            }

        } else {
            ageCategory = "Invalid age category";
        }

        System.out.println("ageCategory = " + ageCategory);


        System.out.println("\n===== with Ternary =====\n");


        String ageCategory1 = !(age > 0 && age < 150) ? "Invalid age category"
                : (age >= 55) ? "Senior" : (age >= 21) ? "Adult" : "Teenager";

        System.out.println("ageCategory1 = " + ageCategory1);

    }

}
