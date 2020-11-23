package day32_LocalDate_Time_WrapperClass;

import javax.lang.model.SourceVersion;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.zip.DataFormatException;

public class TimeFormat {

    /*  LocalDate:
            year: yyyy
            month: MM (number), MMM(three letters of month), MMMM(full name)
            days: dd
            name of day: E(three letters) , EEEE (full name)
            Month/ Day / Year
     */

    public static void main(String[] args) {

        DateTimeFormatter df = DateTimeFormatter.ofPattern("MM/dd/yyyy");

        LocalDate today = LocalDate.now();

        System.out.println("today is: " + today);

        System.out.println(today.format(df));

        System.out.println("===========================================\n");

        DateTimeFormatter tf = DateTimeFormatter.ofPattern("hh:mm:ss a");
        LocalTime now = LocalTime.now();
        System.out.println("now = " + now);
        System.out.println( now.format(tf) );

        LocalTime t1 = LocalTime.of(23,35,55);
        System.out.println("t1 = " + t1);
        System.out.println(t1.format(tf));

        System.out.println("===========================================\n");

        //Monday,12:40 pm  Nov/23/2020
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("EEEE, hh:mm a MMM/dd/yyyy");

        LocalDateTime dt1 = LocalDateTime.of(2020,11,23,12,40);
        System.out.println("dt1 = " + dt1);
        System.out.println(dt1.format(dtf));


        //Mon, 12:40 PM November/23/2020
        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("EEE, hh:mm a MMMM/dd/yyyy");
        System.out.println("dt1 = " + dt1);
        System.out.println(dt1.format(dtf2));


        //task:
        LocalDate tomorrow = LocalDate.of(2020,11,24);
        System.out.println(tomorrow.format(df));

        boolean r1 = today.isBefore(tomorrow);  //true
        boolean r2 = today.isAfter(tomorrow);   //false

        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);

        //calculate the age
                        // 2020-11-23       2020
        int currentYear = LocalDate.now().getYear();
        System.out.println("currentYear = " + currentYear);

        LocalDate DofB = LocalDate.of(2000,5,19);

        int age = currentYear - DofB.getYear();
        System.out.println("age = " + age);


        //plusDays()
        LocalDate rightNow = LocalDate.now();
        LocalDate holidayBreak = rightNow.plusDays(2);
        System.out.println("Holiday Break starts = " + holidayBreak);


        //plusMinutes()
        LocalTime time = LocalTime.now();
        LocalTime lunchBreak = time.plusMinutes(15);
        System.out.println("lunchBreak starts " + lunchBreak.format(tf));


        LocalTime classStarts = LocalTime.of(10,0);
        LocalTime firstBreak = classStarts.plusMinutes(45);
        System.out.println("first Break starts " + firstBreak);

        LocalTime secondBreak = firstBreak.plusMinutes(15).plusMinutes(45);
//        LocalTime secondBreak = firstBreak.plusHours(1);
        System.out.println("second Break starts " + secondBreak);

        LocalTime thirdBreak = secondBreak.plusHours(1).plusMinutes(15);
//        LocalTime thirdBreak = secondBreak.plusMinutes(15).plusMinutes(45);
        System.out.println("third Break starts " + thirdBreak);

        LocalTime afternoonClass = thirdBreak.plusHours(1).plusMinutes(15);
        System.out.println("afternoon Class starts " + afternoonClass);



        System.out.println("===========================================\n");


        DateTimeFormatter df2 = DateTimeFormatter.ofPattern("MMMM/dd/yyyy");

        LocalDate today2 = LocalDate.now();

        System.out.println("today2 is: " + today2);

        System.out.println(today2.format(df2));

        System.out.println("===========================================\n");


        DateTimeFormatter df3 = DateTimeFormatter.ofPattern("MM/dd/yyyy E");

        LocalDate today3 = LocalDate.now();

        System.out.println("today3 is: " + today3);

        System.out.println(today3.format(df3));

        System.out.println("===========================================\n");


        DateTimeFormatter df4 = DateTimeFormatter.ofPattern("MM/dd/yyyy EEEE");

        LocalDate today4 = LocalDate.now();

        System.out.println("today4 is: " + today4);

        System.out.println(today4.format(df4));


    }

}
