package day40_Constructor.homeTasks;

    /*    1. class Name: Employee
			instance variables:
					name, jobTitle, ID, salary

			1st constructor: initialize the name of the employee

			2d constructor: initialize the name, jobTitle of the employee
							(MUST apply constructor Call)

			3rd Constructor: initialize the name, jobTitle, ID of the employee
							(MUST apply constructor Call)

			4th Constructor: initialize all the instance of the employee
								(MUST apply constructor Call)

			Instance methods:
				toString()
     */

import com.sun.xml.internal.bind.v2.model.core.ID;

public class Employee {

    public String name, jobTitle, ID;
    public double salary;

    public Employee(String name) {
        this.name = name;
    }

    public Employee(String name, String jobTitle) {
        this(name);
        this.jobTitle = jobTitle;
    }

    public Employee(String name, String jobTitle, String ID) {
        this(name,jobTitle);
        this.ID = ID;
    }

    public Employee(String name, String jobTitle, String ID, double salary) {
        this(name,jobTitle,ID);
        this.salary = salary;
    }

    public String toString() {
        return "Employee name: " + name + ", Job title: " + jobTitle + ", ID: " + ID + ", salary: $" + salary;
    }

}


class EmployeeObject{
    public static void main(String[] args) {
        Employee emp = new Employee("John","sdet","007",90000);
        System.out.println("emp = " + emp);
    }
}
