package studingJava.office_Hours_Practice_12_23_2020;

import java.util.ArrayList;

public class ScrumMaster extends Employee{

    public ScrumMaster(String name, String ID, char gender, int hourlyRate, int weeklyHours, boolean isFullTime) {
        super(name, "Scrum Master", ID, gender, hourlyRate, weeklyHours, isFullTime);
    }

    public void organizeMeeting() {
        System.out.println(jobTitle + " " + name + " organizing meeting");
    }

}
