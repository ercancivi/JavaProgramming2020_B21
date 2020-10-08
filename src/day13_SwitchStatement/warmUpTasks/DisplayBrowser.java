package day13_SwitchStatement.warmUpTasks;

public class DisplayBrowser {

    public static void main(String[] args) {

        /*  Task 4.
            write a program that can display the selected browser
                1. declare a String variable called browserName
                2. Assume that the valid browsers are: chrome, firefox, opera, safari.
                3. if the browser name does not match with the valid browsers' names,
                out put should be: Invalid Browser Name
             Ex:
                browserName = "chrome";
                output:
                    Chrome Browser is Selected
                browserName =   "Cybertek";
                output:
                    Invalid Browser Name
         */
        String browserName = "Cybertek";
        boolean isValidBrowser = browserName == "Chrome" || browserName == "Firefox"
                || browserName == "Opera" || browserName == "Safari";
        String result = "";

        if (isValidBrowser) {

            if (browserName == "Chrome") {
                result = "Chrome Browser is Selected";
            } else if (browserName == "Firefox") {
                result = "Firefox Browser is Selected";
            } else if (browserName == "Opera") {
                result = "Opera Browser is Selected";
            } else {
                result = "Safari Browser is Selected";
            }

        } else {
            result = "Invalid Browser Name";
        }

        System.out.println("result = " + result);


        System.out.println("\n===== with Ternary =====\n");


        String result1 = !(isValidBrowser) ? "Invalid Browser Name"
                : (browserName == "Chrome") ? "Chrome Browser is Selected"
                : (browserName == "Firefox") ? "Firefox Browser is Selected"
                : (browserName == "Opera") ? "Opera Browser is Selected" : "Safari Browser is Selected";

        System.out.println("result1 = " + result1);

    }

}
