package day43_InheritanceReview_ProtectedAccessModifier.restaurantTask;

import day43_InheritanceReview_ProtectedAccessModifier.personTask.Employee;

public class Chef extends Employee {

    /*  inherited:
            variables: name, age, gender, hourlyRate, jobTitle, ID
            methods: work, setInfo, setInfo, toString, eat, sleep, calcSalary()
     */

    public Chef(String name, int age, char gender, double hourlyRate, String jobTitle, String ID){
        setInfo(name, age, gender, hourlyRate, jobTitle, ID);
    }

    public void makeOrder(){
        System.out.println(jobTitle+" "+name+" is making order");
    }

    public void cooking(){
        System.out.println(jobTitle+" "+name+" is cooking");
    }

}
