package studingJava.day42_Tasks;

    /*
    Tester:
		name, age, gender, hourlyRate, jobTitle, ID
		Constructor
		eat(), sleep(), work(), testing(),...
     */

import com.sun.xml.internal.bind.v2.model.core.ID;

public class Tester extends Employee{

    public Tester(String name, int age, char gender, String jobTitle, String ID, int hourlyRate) {
        setInfo(name,age,gender,jobTitle,ID,hourlyRate);
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

    public void testing() {
        System.out.println(name + " is testing");
    }

    @Override
    public String toString() {
        return "Tester{" +
                "jobTitle='" + jobTitle + '\'' +
                ", ID='" + ID + '\'' +
                ", hourlyRate=" + hourlyRate +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
