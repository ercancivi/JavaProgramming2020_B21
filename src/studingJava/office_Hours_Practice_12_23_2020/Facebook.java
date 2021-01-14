package studingJava.office_Hours_Practice_12_23_2020;

public class Facebook {

    public static void main(String[] args) {

        ProductOwner PO = new ProductOwner("Jon","JS01",'M',80,40,true);
        BusinessAnalyst BA = new BusinessAnalyst("Arya","AS02",'F',75,40,true);
        ScrumMaster SM = new ScrumMaster("Sansa","SS03",'F',70,40,true);

        Tester tester1 = new Tester("Ali","QA","AL01",'M',60,40,true);

        Tester[] testers = {new Tester("Veli","SDET","VE02",'M',65,40,true),
                            new Tester("Ayse","QA","AY03",'F',55,40,true),
                            new Tester("Fatma","SDET","FA04",'F',75,40,true)
        };

        Developer developer1 = new Developer("Emir","Full-Stack Developer","EM01",'M',90,40,true);

        Developer[] developers = {new Developer("Erkan","front-end developer","ER05",'M',80,40,true),
                                  new Developer("Yucel","Game Developer","YU08",'M',70,40,false)
        };


        ScrumTeam scrumTeam = new ScrumTeam(PO,SM,BA);

        scrumTeam.addTester(tester1);
        scrumTeam.addDeveloper(developer1);
        System.out.println("scrumTeam = " + scrumTeam);

        scrumTeam.addTester(testers);
        scrumTeam.addDeveloper(developers);
        System.out.println("scrumTeam = " + scrumTeam);

        scrumTeam.removeTester("AY03");
        scrumTeam.removeDeveloper("YU08");
        System.out.println("scrumTeam = " + scrumTeam);

        for (Tester eachTester : scrumTeam.testers) {
            System.out.println(eachTester.name + " " + eachTester.salary);
        }

        System.out.println("================================");

        for (Developer eachDeveloper : scrumTeam.developers) {
            System.out.println(eachDeveloper.name + " " + eachDeveloper.salary);
        }

        System.out.println("================================");

//        System.out.println(scrumTeam.ProductOwner()); it is private
        System.out.println(scrumTeam.getProductOwner());
//        System.out.println(scrumTeam.BusinessAnalyst()); it is private
        System.out.println(scrumTeam.getBusinessAnalyst());
//        System.out.println(scrumTeam.ScrumMaster()); it is private
        System.out.println(scrumTeam.getScrumMaster());
    }

}
