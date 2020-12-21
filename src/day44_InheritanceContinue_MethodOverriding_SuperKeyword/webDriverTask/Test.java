package day44_InheritanceContinue_MethodOverriding_SuperKeyword.webDriverTask;

public class Test {

    public static void main(String[] args) {
        // ChromeDriver driver = new ChromeDriver();
        //  FireFoxDriver driver = new FireFoxDriver();
        CybertekDriver driver = new CybertekDriver();

        driver.get("Apple.com");

        driver.maximize();

        driver.close();



    }

}
