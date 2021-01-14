package studingJava.office_Hours_Practice_12_23_2020;

public class ProductOwner extends Employee{

    public ProductOwner(String name, String ID, char gender, int hourlyRate, int weeklyHours, boolean isFullTime) {
        super(name, "Product Owner", ID, gender, hourlyRate, weeklyHours, isFullTime);
    }

    public void acceptProduct() {
        System.out.println(jobTitle + " " + name + " is accepting product");
    }

    public void rejectProduct() {
        System.out.println(jobTitle + " " + name + " is rejecting product");
    }

    public void writingUserStory() {
        System.out.println(jobTitle + " " + name + " is writing user story");
    }

}
