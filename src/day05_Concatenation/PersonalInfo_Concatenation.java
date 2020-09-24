package day05_Concatenation;

public class PersonalInfo_Concatenation {

    public static void main(String[] args) {

        /*  Task : PersonalInfo
            variables : firstName, lastName, fullName, age, gender, phoneNumber, SSN
            output: Full name is: YourFullName
                    Age is: YourAge years old
                    Gender is: YourGender
                    Phone Number is: YourPhoneNumber
                    SSN is: YourSSN
               please use concatenation, do not use more than 5 print statements
         */
        String firstName = "Ercan";
        String lastName = "Civi";
        String fullName = firstName + " " + lastName;
        int age = 46;
        char gender = 'M';
        long phoneNumber = 7130000000L;
        int SSN = 111223333;

        System.out.println("Full name is: " + fullName + "\nAge is: " + age + " years old\nGender is: " + gender
                                                       + "\nPhone Number is: " + phoneNumber + "\nSSN is: " + SSN);


    }

}
