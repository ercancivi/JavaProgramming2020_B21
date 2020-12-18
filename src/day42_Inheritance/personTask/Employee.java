package day42_Inheritance.personTask;

public class Employee extends Person{

    public double hourlyRate;
    public String jobTitle, ID;

    public void setInfo(String name, int age, char gender, double hourlyRate,String jobTitle, String ID) {
        setInfo(name, age, gender);
        this.hourlyRate = hourlyRate;
        this.jobTitle = jobTitle;
        this.ID = ID;

    }

    public void eat() {
        super.eat();
    }

    public void sleep() {
        super.sleep();
    }

    public void work() {
        System.out.println(name + "is working");
    }

    public String toString() {
        return "Employee{" +
                "hourlyRate= $" + hourlyRate +
                ", jobTitle='" + jobTitle + '\'' +
                ", ID='" + ID + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
