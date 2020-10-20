package day19_StringPractice_ForLoopIntro.warmUpTasks;

import java.util.Scanner;

public class ReturningDomain {

    public static void main(String[] args) {

        /*  Warmup tasks 5:
            write a program that will return the domain of an email address:
                    Ex:
                        input: test@gmail.com
                        output: the domain of the email is: gmail
                        inputL: Cybertek@yahoo.com
                        output: the domain of the email is: yahoo
         */
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a email address : ");
        String word = scan.next();

        scan.close();

        String domain = word.substring(word.indexOf("@") + 1,word.indexOf(".com"));
        System.out.println("domain name is = " + domain);

    }

}
