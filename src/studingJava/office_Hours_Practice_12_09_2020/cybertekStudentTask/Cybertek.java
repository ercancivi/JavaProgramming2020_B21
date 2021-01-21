package studingJava.office_Hours_Practice_12_09_2020.cybertekStudentTask;

public class Cybertek {

    public static void main(String[] args) {

        CybertekStudent student1 = new CybertekStudent();

        student1.setInfo("Ali",21,'M');
        System.out.println("student1 = " + student1);

        System.out.println("student1.name = " + student1.name);
        System.out.println("student1.getName() = " + student1.getName());

        System.out.println("student1.age = " + student1.age);
        System.out.println("student1.getAge() = " + student1.getAge());

        System.out.println("student1.gender = " + student1.gender);
        System.out.println("student1.getGender() = " + student1.getGender());

        CybertekStudent.schoolName = "MIT";
        CybertekStudent.hasReplit = false;
        CybertekStudent.hasFlipGrid = false;

        System.out.println("student1 = " + student1);


    }

}
