package studingJava.day40_Tasks.task0;

    /*
    Employee
		variables:
				name, age, gender, SSN, salary

		add constructor to initialize all fields

		Methods:
			toString()
     */

public class Employee {

    public String name, SSN;
    public int age;
    public char gender;
    public double salary;

    public Employee(String name, String SSN, int age, char gender, double salary) {
        this.name = name;
        this.SSN = SSN;
        this.age = age;
        this.gender = gender;
        this.salary = salary;
    }
    @Override
    public String toString() {
        return "Employee {" +
                "name = " + name +
                ", SSN = " + SSN +
                ", age = " + age +
                ", gender = " + gender +
                ", salary = " + salary +
                "}";

    }



}
