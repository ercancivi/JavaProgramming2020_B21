package day12_NestedIf.warmUpTasks;

public class AgeGroups3 {

    public static void main(String[] args) {

        /*  2. write a program that can define the age groups of a person
                 age groups are:
                        infant (1 - 2 year)
                        Toddler (3 - 5),
                        Kid (6 - 9),
                        Pre-Teen (10 - 12),
                        Teenager (13 - 17),
                        Young Adult (18 - 20),
                        Adult (21 - 39),
                        Young Middle-Aged Adult (40 - 49),
                        Middle-Aged Adult (50 - 54),
                        Very Young Senior Citizen (55 - 64),
                        Young Senior Citizen (65 - 74),
                        Senior Citizen (75 - 84),
                        Old Senior Citizen (85+)
         */
        int age = 99;
        //with ternary:
        String ageGroups = "";

        /*
        if(age <= 2) {  //it becomes false when age >= 3
            ageGroups = "infant";
        }else if(age <= 5) {    // becomes false when age >= 6
            ageGroups = "Toddler";
        }else if(age <= 9) {    // becomes false when age >= 10
            ageGroups = "Kid";
        }else if(age <= 12) {  // becomes false when age >= 13
            ageGroups = "Pre-Teen";
        }else if(age <= 17) {  // becomes false when age >= 18
            ageGroups = "Teenager";
        }else if(age <= 20) {  // becomes false when age >= 21
            ageGroups = "Young Adult";
        }else if(age <= 39) {  // becomes false when age >= 40
            ageGroups = "Adult";
        }else if(age <= 49) {  // becomes false when age >= 50
            ageGroups = "Young Middle-Aged Adult";
        }else if(age <= 54) {  // becomes false when age >= 55
            ageGroups = "Middle-Aged Adult";
        }else if(age <= 64) {  // becomes false when age >= 65
            ageGroups = "Very Young Senior Citizen";
        }else if(age <= 74) {  // becomes false when age >= 75
            ageGroups = "Young Senior Citizen";
        }else if(age <= 84) {  // becomes false when age >= 85
            ageGroups = "Senior Citizen";
        }else {
            ageGroups = "Old Senior Citizen";
        }

        System.out.println("ageGroups = " + ageGroups);

         */
        String ageGroups1 = (age <= 2) ? "infant" : (age <= 5) ? "Toddler" : (age <= 9) ? "Kid"
                          : (age <= 12) ? "Pre-Teen" : (age <= 17) ? "Teenager" : (age <= 20) ? "Young Adult"
                          : (age <= 39) ? "Adult" : (age <= 49) ? "Young Middle-Aged Adult"
                          : (age <= 54) ? "Middle-Aged Adult" : (age <= 64) ? "Very Young Senior Citizen"
                          : (age <= 74) ? "Young Senior Citizen" : (age <= 84) ? "Senior Citizen" : "Old Senior Citizen";

        System.out.println("ageGroups1 = " + ageGroups1);

    }

}
