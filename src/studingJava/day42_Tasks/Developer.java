package studingJava.day42_Tasks;

    /*
    Developer:
		name, age, gender, hourlyRate, jobTitle, ID
		Constructor
		eat(), sleep(), work(), code()...
     */

public class Developer extends Employee{

    public Developer(String name, int age, char gender, String jobTitle, String ID, int hourlyRate) {
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

    public void code() {
        System.out.println(name + " is coding");
    }

    @Override
    public String toString() {
        return "Developer{" +
                "jobTitle='" + jobTitle + '\'' +
                ", ID='" + ID + '\'' +
                ", hourlyRate=" + hourlyRate +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
