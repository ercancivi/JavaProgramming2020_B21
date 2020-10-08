package day13_SwitchStatement;

public class DisplayBrowsersWithSwitchStatementByMe {

    public static void main(String[] args) {

        /*  Task 4.
            write a program that can display the selected browser
                1. declare a String variable called browserName
                2. Assume that the valid browsers are: chrome, firefox, opera, safari, edge, ie.
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
        String browser = "cybertek";
        String selectedBrowser = "";

        switch (browser) {
            case "Chrome" :
                selectedBrowser = "CHROME BROWSER";
                break;
            case "firefox" :
                selectedBrowser = "FIREFOX BROWSER";
                break;
            case "opera" :
                selectedBrowser = "OPERA BROWSER";
                break;
            case "safari" :
                selectedBrowser = "SAFARI BROWSER";
                break;
            case "edge" :
                selectedBrowser = "EDGE BROWSER";
                break;
            case "ie" :
                selectedBrowser = "INTERNET EXPLORER BROWSER";
                break;
            default   :
                selectedBrowser = "NO SUCH A BROWSER";
                break;
        }
        System.out.println("selectedBrowser = " + selectedBrowser);

    }


}
