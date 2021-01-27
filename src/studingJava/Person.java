package studingJava;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Person {
    private String firstname, lastname, ssn;
    private int birthmonth, birthday, birthyear;


    public Person(String firstname, String lastname, int birthmonth, int birthday, int birthyear, String ssn) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.ssn = ssn;
        this.birthmonth = birthmonth;
        this.birthday = birthday;
        this.birthyear = birthyear;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getBirthday() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate DofB = LocalDate.of(birthyear,birthmonth,birthday);
        String DofBirth = DofB.format(dtf);
        return DofBirth;
    }

    public boolean verifySSN(String ssn) {
        return ssn.equalsIgnoreCase(this.ssn);
    }


}



class test {
    public static void main(String[] args) {
        Person s = new Person("Billy","Bob",10,25,1900,"123-45-6789");
        System.out.println(s.getBirthday());
        System.out.println(s.getLastname());
    }
}
