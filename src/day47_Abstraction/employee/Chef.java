package day47_Abstraction.employee;

public final class Chef extends Employee{


    public Chef(String name, int age, char gender, String jobTitle, String ID, double salary) {
        super(name, age, gender, jobTitle, ID, salary);
    }

    @Override
    void work() {
        System.out.println("Chefs are starting to work in the early morning");
    }

    @Override
    protected void sleep() {
        System.out.println("Chefs are sleeping till early in the morning");
    }

    @Override
    public String toString() {
        return "Chef{" +
                "jobTitle='" + jobTitle + '\'' +
                ", ID='" + ID + '\'' +
                ", salary=" + salary +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
