package studingJava.office_Hours_Practice_12_23_2020;

public class BusinessAnalyst extends Employee{

    public BusinessAnalyst(String name, String ID, char gender, int hourlyRate, int weeklyHours, boolean isFullTime) {
        super(name, "Business Analyst", ID, gender, hourlyRate, weeklyHours, isFullTime);
    }

    public void talkToClients() {
        System.out.println(jobTitle + " " + name + " is talking to the clients");
    }

}
