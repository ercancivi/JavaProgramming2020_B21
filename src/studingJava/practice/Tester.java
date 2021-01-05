package studingJava.practice;
    /*
    Attributes:
						name, employeeID, JobTitle, Salary
						isHuman, isCybertekStudent

					Actions:
						setInfo(), smokeTesting(),  creatingTicket(), toString()
     */

public class Tester {

    public String name, employeeID, jobTitle, companyName;
    public double salary;
    public char gender;

    public static boolean isHuman = true, isCybertekStudent = true;

    public void setInfo(String name, String employeeID, String jobTitle, String companyName, double salary, char gender) {
        this.name = name;
        this.employeeID = employeeID;
        this.jobTitle = jobTitle;
        this.companyName = companyName;
        this.salary = salary;
        this.gender = gender;
    }

    public void smokeTesting() {
        System.out.println(name + " do smoke testing every day before office hours");
    }

    public void creatingTicket() {
        System.out.println(name + " is creating ticket for each bug");
    }

    @Override
    public String toString() {
        return "Tester{" +
                "name='" + name + '\'' +
                ", employeeID='" + employeeID + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }
}
