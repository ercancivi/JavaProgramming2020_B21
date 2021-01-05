package studingJava;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;

public class Employee {

    public String name, ID, jobTitle, companyName;
    public char gender;
    public double salary;
    public LocalDate hireDate;





    public void setInfo(String name, String ID, String jobTitle, String companyName, char gender, double salary, LocalDate hireDate) {
        this.name = name;
        this.ID = ID;
        this.jobTitle = jobTitle;
        this.companyName = companyName;
        this.gender = gender;
        this.salary = salary;
        this.hireDate = hireDate;
    }

    public void getInfo() {
        DateTimeFormatter df = DateTimeFormatter.ofPattern("MMM/dd/yyyy");
        DecimalFormat decimal = new DecimalFormat("0.00");
        System.out.println("Name: " + name + " ID: " + ID + " Job title: " + jobTitle + " Company name: " + companyName
                + " Gender: " + gender + " Salary: " + decimal.format(salary) + " Hire date: " + hireDate.format(df));
        System.out.println();
    }

    public void attendMeeting() {
        System.out.println(name + " is attending to meeting");
    }

    public void working() {
        System.out.println(name + " is working");
    }


}

class BankOfCybertek {

    public static void main(String[] args) {

        Employee employee1 = new Employee();
        employee1.setInfo("Arya","A01", "QA","CyberTek", 'F', 120000, LocalDate.of(2000,8,15));

        employee1.getInfo();

        employee1.attendMeeting();

        employee1.working();

        System.out.println();

        Employee employee2 = new Employee();
        employee2.setInfo("Jon","J02","Developer","Cybertek",'M',130000,LocalDate.of(1999,7,2));

        employee2.getInfo();

        employee2.attendMeeting();

        employee2.working();

        Employee employee3 = new Employee();
        employee3.setInfo("Sansa","S03","Developer","Cybertek",'M',130000,LocalDate.of(2001,7,2));

        employee3.getInfo();

        employee3.attendMeeting();

        employee3.working();


        Employee employee4 = new Employee();
        employee4.setInfo("Bran","B04","SDET","Cybertek",'M',200000,LocalDate.of(2006,7,2));

        employee4.getInfo();

        employee4.attendMeeting();

        employee4.working();


        Employee employee5 = new Employee();
        employee5.setInfo("Rickon","R05","Manual Tester","Cybertek",'M',10000,LocalDate.of(2008,7,2));

        employee5.getInfo();

        employee5.attendMeeting();

        employee5.working();


        Employee[] employees = new Employee[5];

        employees[0] = employee1;
        employees[1] = employee2;
        employees[2] = employee3;
        employees[3] = employee4;
        employees[4] = employee5;


        System.out.println();

        employees[3].getInfo();

        System.out.println();

        for (Employee each: employees) {
            each.getInfo();
        }

        ArrayList<Employee> employeeList = new ArrayList<>(Arrays.asList(employees));
        employeeList.addAll(Arrays.asList(employees));

        System.out.println("employeeList = " + employeeList);

        ArrayList<Employee> sdetAndDeveloper = new ArrayList<>();
        sdetAndDeveloper.addAll(Arrays.asList(employees));

        sdetAndDeveloper.removeIf(p->!(p.jobTitle.equalsIgnoreCase("sdet") || p.jobTitle.equalsIgnoreCase("developer")));

//        System.out.println("sdetAndDeveloper = " + sdetAndDeveloper);
        System.out.println();

        for (Employee each: sdetAndDeveloper) {
            System.out.println();
            each.getInfo();
            System.out.println((each.name + " " + each.salary + " " + each.jobTitle));
        }


        System.out.println();
        System.out.println();

        ArrayList<Employee> richPeople = new ArrayList<>();
//        richPeople.addAll(Arrays.asList(employees));
        for(Employee each: employees) richPeople.add(each);

        richPeople.removeIf(p->p.salary<200000);

        for(Employee each: richPeople) {
            System.out.println(each.name +" " +each.salary+ " " + each.hireDate);
            each.getInfo();
        }


        double maxSalary = employees[0].salary;
        String name = "";

        for(Employee each : employees) {
//            maxSalary = Math.max(maxSalary,each.salary);

            if(each.salary > maxSalary) {
                maxSalary = each.salary;
                name = each.name;
            }
        }

        System.out.println(name + " has : " + maxSalary);



    }



}
