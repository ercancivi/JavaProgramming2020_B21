package studingJava.day42_Tasks;

    /*
    Employee
		name, age, gender, hourlyRate, jobTitle, ID
		setInfo, eat(), sleep(), work()
     */

class Employee extends Person{

    public String jobTitle, ID;
    public int hourlyRate;


    public void setInfo(String name, int age, char gender, String jobTitle, String ID, int hourlyRate) {
        setInfo(name, age, gender);
        this.jobTitle = jobTitle;
        this.ID = ID;
        this.hourlyRate = hourlyRate;
    }

    public void eat() {
        super.eat();
    }

    public void sleep() {
        super.sleep();
    }

    public void work() {
        System.out.println(name + " is working");
    }

    @Override
    public String toString() {
        return "Employee{" +
                "jobTitle='" + jobTitle + '\'' +
                ", ID='" + ID + '\'' +
                ", hourlyRate=" + hourlyRate +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
