package studingJava.office_Hours_Practice_12_23_2020;

import java.util.ArrayList;
import java.util.Arrays;

public class ScrumTeam {

    public static boolean hasMeetings, hasSprint;
    private ProductOwner productOwner;
    private ScrumMaster scrumMaster;
    private BusinessAnalyst businessAnalyst;

    public ArrayList<Tester> testers = new ArrayList<>();
    public ArrayList<Developer> developers  = new ArrayList<>();

    static {
        hasMeetings = true;
        hasSprint = true;
    }

    public ScrumTeam(ProductOwner productOwner) {
        setProductOwner(productOwner);
    }

    public ScrumTeam(ProductOwner productOwner, ScrumMaster scrumMaster) {
        this(productOwner);
        setScrumMaster(scrumMaster);
    }

    public ScrumTeam(ProductOwner productOwner, ScrumMaster scrumMaster, BusinessAnalyst businessAnalyst) {
        this(productOwner,scrumMaster);
        setBusinessAnalyst(businessAnalyst);
    }

    public ProductOwner getProductOwner() {
        return productOwner;
    }

    public void setProductOwner(ProductOwner productOwner) {
        this.productOwner = productOwner;
    }

    public ScrumMaster getScrumMaster() {
        return scrumMaster;
    }

    public void setScrumMaster(ScrumMaster scrumMaster) {
        this.scrumMaster = scrumMaster;
    }

    public BusinessAnalyst getBusinessAnalyst() {
        return businessAnalyst;
    }

    public void setBusinessAnalyst(BusinessAnalyst businessAnalyst) {
        this.businessAnalyst = businessAnalyst;
    }

    public void addTester(Tester tester) {
        testers.add(tester);
    }

    public void addTester(Tester[] testers) {
        this.testers.addAll(Arrays.asList(testers));
//        for (Tester eachTester : testers) {
//            addTester(eachTester);
//        }

    }

    public void addDeveloper(Developer developer) {
        developers.add(developer);
    }

    public void addDeveloper(Developer[] developers) {
        this.developers.addAll(Arrays.asList(developers));
//        for (Developer eachDeveloper : developers) {
//            addDeveloper(eachDeveloper);
//        }
    }

    public void removeTester(String ID) {
        testers.removeIf(p->p.ID.equals(ID));
    }

    public void removeDeveloper(String ID) {
        developers.removeIf(p->p.ID.equals(ID));
    }

    @Override
    public String toString() {
        return "ScrumTeam{" +
                "productOwner=" + productOwner.name +
                ", scrumMaster=" + scrumMaster.name +
                ", businessAnalyst=" + businessAnalyst.name +
                ", testers=" + testers.size() +
                ", developers=" + developers.size() +
                '}';
    }
}
