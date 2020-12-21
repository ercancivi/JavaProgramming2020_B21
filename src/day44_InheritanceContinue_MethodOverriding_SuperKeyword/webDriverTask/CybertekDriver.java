package day44_InheritanceContinue_MethodOverriding_SuperKeyword.webDriverTask;

public class CybertekDriver extends WebDriver {

    public CybertekDriver(){
        super("Cybertek Browser", "V75.0.1");
    }

    @Override
    public void get(String URL) {
        System.out.println("Opening "+URL+" from cybertek driver");
    }

    @Override
    public void close() {
        System.out.println("Closing Cybertek Driver");
    }

    @Override
    public void maximize() {
        System.out.println("Maximizing Cybertek Driver");
    }
}
