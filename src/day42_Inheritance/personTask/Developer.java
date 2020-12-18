package day42_Inheritance.personTask;

public class Developer extends Employee{

    public Developer(String name, int age, char gender, double hourlyRate,String jobTitle, String ID) {
        setInfo(name, age, gender, hourlyRate, jobTitle, ID);
    }

    public void eat() {
        super.eat();
    }

    public void sleep() {
        super.sleep();
    }

    public void work() {
        super.work();
    }

    public void code() {
        System.out.println(name + " is coding");
    }

    public String toString() {
        return "Developer{" +
                "hourlyRate= $" + hourlyRate +
                ", jobTitle='" + jobTitle + '\'' +
                ", ID='" + ID + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
