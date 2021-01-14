package studingJava.office_Hours_Practice_12_23_2020;

public class Tester extends Employee{

    public final static boolean isCool;

    static  {
        isCool = true;
    }

    public Tester(String name, String jobTitle, String ID, char gender, int hourlyRate, int weeklyHours, boolean isFullTime) {
        super(name, jobTitle, ID, gender, hourlyRate, weeklyHours, isFullTime);
    }

    public void foundBug() {
        System.out.println(jobTitle + " " + name + " found bug");
    }


}
