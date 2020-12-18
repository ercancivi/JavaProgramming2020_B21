package day42_Inheritance.personTask;

public class Tester extends Employee{



    public Tester(String name, int age, char gender, double hourlyRate,String jobTitle, String ID) {
       setInfo(name, age, gender, hourlyRate, jobTitle, ID);
    }

    public void eat() {
        super.eat();
    }

    public void work() {
        super.work();
    }

    public void testing() {
        System.out.println(name + " is testing");
    }

    public String toString() {
        return "Tester{" +
                "hourlyRate= $" + hourlyRate +
                ", jobTitle='" + jobTitle + '\'' +
                ", ID='" + ID + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
