package studingJava.day42_Tasks.restaurantTask;

    /*  Create a class called Employee
           Attributes:
                name, title, employeeID, hourlyRate, fullTime(boolean)
           Actions:
                setInfo(), work()
                calcSalary(): returns the salary. (assume that weeklyHours is 40, and there are 52 weeks in a year
                toString(): Returns (String) all the information of a Server
                    -> Extra: For fullTime status, instead of printing a boolean value, print "full-time" or "part-time"
     */

public class Employee {
    public String name, title;
    public int employeeID;
    public double hourlyRate, grossTotalSalary;
    public boolean fullTime;

    public static int weeksInYear, weeklyHours;

    static {
        weeksInYear = 52;
        weeklyHours = 40;
    }

    public void setInfo(String name, String title, int employeeID, int hourlyRate, boolean fullTime) {
        this.name = name;
        this.title = title;
        this.employeeID = employeeID;
        this.hourlyRate = hourlyRate;
        this.fullTime = fullTime;
        grossTotalSalary = calcSalary();
    }

    public void work() {
        System.out.println(name + " is working ");
    }

    public double calcSalary() {
        return hourlyRate * weeklyHours * weeksInYear;
    }

    @Override
    public String toString() {
        String fullTimeOrPartTime = (fullTime)? "full-time" : "part-time";
        return "Employee{" +
                "name='" + name + '\'' +
                ", title='" + title + '\'' +
                ", employeeID='" + employeeID + '\'' +
                ", hourlyRate=" + hourlyRate +
                ", grossTotalSalary=" + grossTotalSalary +
                ", fullTime or PartTime=" + fullTimeOrPartTime +
                '}';
    }





}
