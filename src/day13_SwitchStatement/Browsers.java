package day13_SwitchStatement;

public class Browsers {

    public static void main(String[] args) {
        String browserName = "firefox";

        boolean valid = browserName == "chrome" || browserName == "firefox" || browserName == "opera"
                || browserName == "safari" || browserName == "edge" || browserName == "ie";

        String selectedBrowser = "";

        if (valid) {

            if (browserName == "chrome") {
                selectedBrowser = "CHROME BROWSER";
            } else if (browserName == "firefox") {
                selectedBrowser = "FIREFOX BROWSE";
            } else if (browserName == "opera") {
                selectedBrowser = "OPERA BROWSER";
            } else if (browserName == "safari") {
                selectedBrowser = "SAFARI BROWSER";
            } else if (browserName == "edge") {
                selectedBrowser = "EDGE BROWSER";
            } else {
                selectedBrowser = "INTERNET EXPLORE";
            }

        } else {
            System.out.println("No such a browser");
        }


        System.out.println(selectedBrowser);


    }


}
