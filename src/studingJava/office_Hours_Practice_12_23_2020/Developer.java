package studingJava.office_Hours_Practice_12_23_2020;

public class Developer extends Employee{

    public Developer(String name, String jobTitle, String ID, char gender, int hourlyRate, int weeklyHours, boolean isFullTime) {
        super(name, jobTitle, ID, gender, hourlyRate, weeklyHours, isFullTime);
    }

    public void fixingBug() {
        System.out.println(jobTitle + " " + name + " fixing bug");
    }

}
