package studingJava.practice;

    /*
    Attributes:
							PO, BA, SM,
							ArrayList<Tester> testersList = new ArrayList<>(),
							ArrayList<Developer> devopsList = new ArrayList<>(),

							hasSprint, hasMeeting

					Actions:
							setInfo(): sets the names of: PO, BA, SM

							addTester(Tester tester): adds the given tester to the testers arraylist

							addTesters(Tester[] testers): adds the given testers to the testers arraylist

							addDeveloper(Developer developer): adds the given developer to the developers arraylist

							addDevelopers(Developer[] developers): adds the given developers to the developers arraylist

							removeTester(long employeeID): removes the given tester from the testers arraylist

							removeDeveloper(long employeeID): removes the developer from the developers arraylist

							toString(): prints number of tester,& developers,  PO name, SM name, BA name
     */

import library.BA;

import java.util.ArrayList;

public class ScrumTeam {

    public String PO, BA, SM;
    public ArrayList<Tester> testersTeam = new ArrayList<>();
    public ArrayList<Developer> developersTeam = new ArrayList<>();

    public static boolean hasSprint = true, hasMeeting = true;

    public void setInfo(String PO, String BA, String SM) {
        this.PO = PO;
        this.BA = BA;
        this.SM = SM;
    }

    public void addTester(Tester tester) {



    }

}
