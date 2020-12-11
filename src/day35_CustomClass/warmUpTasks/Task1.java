package day35_CustomClass.warmUpTasks;

import java.util.ArrayList;
import java.util.Arrays;

public class Task1 {

    public static void main(String[] args) {

        /*  task01:
                1. create an Array of string called country names
                2. write a program that can remove all the country names that have length of 10 or greater
         */

        String[] countryNames = {"Turkey", "Turkmenistan", "Finland", "Switzerland", "Slovakia", "Norway",
                                 "Kyrgyzstan", "Montenegro", "Liechtenstein", "United States"};


        ArrayList<String> countryList = new ArrayList<>(Arrays.asList(countryNames));

        System.out.println("countryList before remove = " + countryList);

        countryList.removeIf(p->p.length() > 10);

        System.out.println("countryList after remove = " + countryList);

    }

}
