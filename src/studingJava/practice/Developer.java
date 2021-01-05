package studingJava.practice;

    /*
    Attributes:
						name, employeeID, JobTitle, Salary
						hasCodingSkills,

					Actions:
						setInfo(), coding(),  fixingBug(), toString()
     */

public class Developer {

    public String name, employeeID, jobTitle, companyName;
    public double salary;
    public char gender;

    public static boolean hasCodingSkills = true;

    public void setInfo(String name, String employeeID, String jobTitle, String companyName, double salary, char gender) {
        this.name = name;
        this.employeeID = employeeID;
        this.jobTitle = jobTitle;
        this.companyName = companyName;
        this.salary = salary;
        this.gender = gender;
    }

    public void coding() {
        System.out.println(name + " is coding");
    }

    public void fixingBug() {
        System.out.println(name + " is fixing bug");
    }

    @Override
    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", employeeID='" + employeeID + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", companyName='" + companyName + '\'' +
                ", salary=" + salary +
                ", gender=" + gender +
                '}';
    }
}
