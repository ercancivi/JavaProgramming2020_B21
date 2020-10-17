package day17_String.practiceTasks;

import java.util.Scanner;

public class DoctorAppointment {

    public static void main(String[] args) {

        /*- Ask the user how many days they have sick(byte)
            > If they have been sick for 1-3 days print "Drink water and get some rest, but we can schedule an appointment for next week"
            > If they have been sick for 4-7 days print "We can schedule an appointment for two days"
            > If they have been sick for more than 7 days print "Come in immediately"

        - Ask the user if they are taking any medicine (String - yes or no)
            > If they are taking medicine ask them what kind of medicine they are taking (String, multiple words)
            > If they are not, ask them if they think they need any (String - yes or no)
                > If they say yes print "We can prescribe medicine after the appointment"
                > If they say no print "Eat some soup"

        - Ask the user if they have insurance (boolean)
            > If they have insurance(true) print "Okay see you at the appointment"
            > If they don't have insurance (false) print "Okay we can discuss payment after the appointment"
         */

        Scanner input = new Scanner(System.in);

        System.out.println("How many days you have sick : ");
        byte daysInSick = input.nextByte();

        String appointment = "";

        if(daysInSick > 0 && daysInSick <= 12) {
            if(daysInSick > 7) {
                appointment = "Come in immediately";
            }else if(daysInSick >= 4) {
                appointment = "We can schedule an appointment for two days";
            }else {
                appointment = "Drink water and get some rest, but we can schedule an appointment for next week";
            }
        }else {
            appointment = "You entered invalid value for number of the days for being sick";
        }
        System.out.println(appointment);


        System.out.println("\nAre you taking any medicine : ");
        String yesOrNo = input.next();

        input.nextLine();

        if(yesOrNo.equals("yes")) {
            System.out.println("What kind of medicine they are taking : ");
            String medicine = input.nextLine();
            System.out.println("medicine = " + medicine);
        }else {
            System.out.println("Do you think you need any : ");
            yesOrNo = input.next();
            if(yesOrNo.equals("yes")) {
                System.out.println("We can prescribe medicine after the appointment ");
            }else {
                System.out.println("Eat some soup");
            }
        }


        System.out.println("\nDo you have insurance : ");
        boolean haveInsurance = input.nextBoolean();

        if(haveInsurance) {
            System.out.println("Okay see you at the appointment");
        }else {
            System.out.println("Okay we can discuss payment after the appointment");
        }


    }

}
