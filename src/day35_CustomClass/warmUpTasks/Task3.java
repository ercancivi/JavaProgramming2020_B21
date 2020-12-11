package day35_CustomClass.warmUpTasks;

import java.util.ArrayList;
import java.util.Arrays;

public class Task3 {

    public static void main(String[] args) {

        /*  task03:
                1. create an Array of String called jobTitles
                2. write a program that only keeps the jobTitles that are: SDET and QA
         */

        String[] jobTitles = {"SDET", "Scrum Master", "QA", "Developer", "PO", "BA", "CEO", "SDET", "QA", "Developer", "SDET"};

        for(String each : jobTitles) {
            System.out.println("each = " + each);
        }

        ArrayList<String> jobTitleList = new ArrayList<>();
        jobTitleList.addAll(Arrays.asList(jobTitles));

        System.out.println("jobTitleList before = " + jobTitleList);

//        jobTitleList.retainAll(    Arrays.asList( "SDET", "QA" )  );
        jobTitleList.removeIf(p-> !(p.equalsIgnoreCase("SDET") || p.equalsIgnoreCase("QA")));
//        jobTitleList.removeIf( p ->  !p.equals("SDET") && !p.equals("QA")   );

        System.out.println("jobTitleList after = " + jobTitleList);




    }

}
