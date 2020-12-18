package day42_Inheritance.restaurantTask;

public class Employee {

    public String name, title;
    public int employeeID;
    public double hourlyRate,grossTotalIncome;
    public boolean fullTime;

    public void setInfo(String name, String title, int employeeID, double hourlyRate, boolean fullTime) {
        this.name = name;
        this.title = title;
        this.employeeID = employeeID;
        this.hourlyRate = hourlyRate;
        this.fullTime = fullTime;

        grossTotalIncome = this.hourlyRate * 40 * 52;
    }

    @Override
    public String toString() {
        if(fullTime) {
            System.out.println("full-time");
        }else {
            System.out.println("part-time");
        }
        return "Employee{" +
                "name='" + name + '\'' +
                ", title='" + title + '\'' +
                ", employeeID='" + employeeID + '\'' +
                ", hourlyRate=" + hourlyRate +
                ", grossTotalIncome=" + grossTotalIncome +
                ", fullTime=" + fullTime +
                '}';
    }
}
