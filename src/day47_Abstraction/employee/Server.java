package day47_Abstraction.employee;

public final class Server extends Employee{


    public Server(String name, int age, char gender, String jobTitle, String ID, double salary) {
        super(name, age, gender, jobTitle, ID, salary);
    }

    @Override
    void work() {
        System.out.println("Servers are starting to work in the early morning");
    }

    @Override
    protected void sleep() {
        System.out.println("Servers are sleeping till in the morning");
    }

    @Override
    public String toString() {
        return "Server{" +
                "jobTitle='" + jobTitle + '\'' +
                ", ID='" + ID + '\'' +
                ", salary=" + salary +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
