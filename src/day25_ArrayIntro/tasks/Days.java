package day25_ArrayIntro.tasks;

import java.util.Scanner;

public class Days {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String[] days = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};

        System.out.println("Enter number of day: ");
        int numOfDay = scan.nextInt();

        System.out.println(days[numOfDay-1]);

    }

}
