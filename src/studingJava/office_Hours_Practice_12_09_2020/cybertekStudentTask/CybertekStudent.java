package studingJava.office_Hours_Practice_12_09_2020.cybertekStudentTask;

public class CybertekStudent {

    public String name;
    public int age;
    public char gender;

    public static String schoolName, dreamJob;
    public static boolean hasReplit, hasFlipGrid;

    static {
        schoolName = "Cybertek School";
        dreamJob = "SDET";
        hasReplit = true;
        hasFlipGrid = true;
    }

    public void setInfo(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender() {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return  age;
    }

    public char getGender() {
        return gender;
    }

    public String toString() { // we need the toString method to print object
        return "name: " + name + ", age: " + age + ", gender: " + gender +
               ", school name: " + schoolName + ", dream job: " + dreamJob +
               ", has repl.it: " + hasReplit + ", has flip grid: " + hasFlipGrid;
    }




}
