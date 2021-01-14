package studingJava.office_Hours_Practice_12_23_2020;

public class Employee {

    public String name, jobTitle, ID;
    public double salary;
    int hourlyRate, weeklyHours;
    public final char gender;
    public boolean isFullTime;

    public Employee(String name, String jobTitle, String ID, char gender, int hourlyRate, int weeklyHours, boolean isFullTime) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.ID = ID;
        this.gender = gender;
        this.hourlyRate = hourlyRate;
        this.weeklyHours = weeklyHours;
        salary = calculateSalary();
        this.isFullTime = isFullTime;
    }

    public double calculateSalary() {
        int totalGrossSalary = hourlyRate * weeklyHours * 52;
        return totalGrossSalary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", ID='" + ID + '\'' +
                ", salary=" + calculateSalary() +
                ", hourlyRate=" + hourlyRate +
                ", weeklyHours=" + weeklyHours +
                ", gender=" + gender +
                ", isFullTime=" + isFullTime +
                '}';
    }
}
