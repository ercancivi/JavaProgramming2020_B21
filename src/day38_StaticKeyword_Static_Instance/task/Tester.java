package day38_StaticKeyword_Static_Instance.task;

    /*    create a class called Tester
                    Attributes:
                        name, employeeID, JobTitle, Salary
                        isHuman, isCybertekStudent
                    Actions:
                        setInfo(), smokeTesting(),  creatingTicket(), toString()
     */

public class Tester {


    public String name, ID, jobTitle, companyName;
    public double salary;
    public char gender;

    public static boolean isHuman = true, isCybertekStudent = true;
//    public static boolean isCybertekStudent = true; // we add this line above for shortest way


    public void setInfo(String name, String ID, String jobTitle, String companyName, double salary, char gender) {
        this.name = name;
        this.ID = ID;
        this.jobTitle = jobTitle;
        this.companyName = companyName;
        this.salary = salary;
        this.gender = gender;
    }

    public void smokeTesting() {
        System.out.println(name + " is performing smoke testing");
    }

    public void creatingTicket() {
        System.out.println(name + "  is creating ticket in Jira");
    }

    public String toString() {
        return "Tester{" +
                "name='" + name + '\'' +
                ", employeeID='" + ID + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary= $" + salary +
                ", isHuman=" + isHuman +
                ", isCybertekStudent=" + isCybertekStudent +
                '}';
    }

}
