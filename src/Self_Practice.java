import org.omg.PortableServer.SERVANT_RETENTION_POLICY_ID;
import org.omg.PortableServer.ServantRetentionPolicy;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Scanner;

public class Self_Practice {

    public static void main(String[] args) {
//        int digit=0;
//        Scanner scan = new Scanner(System.in);
//        int num = scan.nextInt();
//
//        int j = 10000;
//        int i = 1;
//        while(num > 0) {
//
//            digit = num / j;
//            num = num % j;
//
//            System.out.println("digit" + i + ": " + digit);
//
//            j /= 10;
//            i++;
//        }

//        Scanner scan = new Scanner(System.in);
//        int k = 0;
//        double total = 0;
//        double avgTemp = 0;
//        double[] temps = { scan.nextDouble(), scan.nextDouble(), scan.nextDouble(), scan.nextDouble(),
//                scan.nextDouble(), scan.nextDouble(), scan.nextDouble() , scan.nextDouble()  };
//
//        for(k=0; k < temps.length; k++) {
//            total += temps[k];
//        }
//
//        System.out.println(total/k);

//        Scanner input = new Scanner(System.in);
//        float[] score = new float[7];
//        //WRITE YOUR CODE HERE
//
//
//        float sum = 0;
//        float total = 0;
//
//        for(int i = 0; i < score.length; i++) {
//
//            System.out.println("Enter score for judge " + (i + 1) + ":");
//            score[i] = input.nextFloat();
//            sum += score[i];
//        }
//        float max = score[0];
//        float min = score[0];
//
//        for(int i = 0; i < score.length; i++) {
//            if (max < score[i]) {
//                max = score[i];
//            }
//
//            if (min > score[i]) {
//                min = score[i];
//            }
//        }
//
//
//        System.out.println("min = " + min);
//        System.out.println("max = " + max);
//        sum -= (min + max);
//        System.out.println("sum = " + sum);
//
//        System.out.println("Enter difficulty:");
//        float difficulty = input.nextFloat();
//
//        total = sum * difficulty * 0.6f;
//
//        // FINAL OUTPUT
//        System.out.printf("Total: %.2f", total);


//        Scanner scan = new Scanner(System.in);
//        int size = scan.nextInt();
//        int[] num = new int[size];
//        for(int i =0; i < size; i++) {
//            num[i] = scan.nextInt();
//        }
//        //WRITE YOUR CODE HERE
//
//        String numStr = "";
//
//        if(num.length > 1) {
//
//            for(int i = 0; i < 2; i++) {
//                numStr += num[i];
//            }
//
//            String[] numStrArr = numStr.split(" ");
//            System.out.println(Arrays.toString(numStrArr));
//        }



//        System.out.println("1)sunset\n2)earth\n3)desert");


//        String[] words = {"hello", "why", "by", "apple" , "note"};
//        String firstAndLast = "";
//        for(int i = 0; i < words.length; i++) {
//            firstAndLast += "" + words[i].charAt(0) + words[i].charAt(words[i].length()-1) + " ";
//        }
//        System.out.println("firstAndLast = " + firstAndLast);
//
//        String[] firstAndLastInArr = firstAndLast.trim().split(" ");
//
//        System.out.println(Arrays.toString(firstAndLastInArr));


//        int[] nums = {1, 5, 4, 1, 5};
//        boolean is55 = false;
//
//        for(int i = 0; i < nums.length-1; i++) {
//
//            if(nums[i] != 5) {
//
//                continue;
//
//            }else {
//
//                if(nums[i] == nums[i+1]) {
//                    is55 = true;
//                }
//
//            }
//
//        }
//
//        System.out.println(is55);



//        int [][] multiplicationTable = new int[10][10];
//
//        //TODO: type your code below
//
//        for(int i = 0; i < 10; i++) {
//
//            for(int j = 0; j < 10; j++) {
//                multiplicationTable[i][j] = (i+1)*(j+1);
//
//            }
//
//        }
//
//
//        //Do not modify below line it will be used to test your code. And
//        //Can be used by you while developing your code
//        System.out.println(Arrays.deepToString(multiplicationTable) ) ;

//        Scanner input = new Scanner(System.in);
//
//        int decimal = input.nextInt();
//        int[] binary = new int[8];
//
//        //TODO: Write your code below.
//
//        for(int i = 0,j = 128; i < binary.length; i++, j/=2) {
//
//            binary[i] = decimal/j;
//            decimal = decimal%j;
//
//        }
//
//        System.out.println(Arrays.toString(binary));

//        String e = "JDK";
//        String f = new String("JDK");
//        System.out.println(e == f); // False comparing by location / address
//        System.out.println(e.equals(f)); //True comparing by value
//
//        int i = 0;
//        i++;
//        System.out.println("i = " + i);
//
//        String str = "Cybertek";
//
//        System.out.println(str.concat(" School"));
//        System.out.println(str.toLowerCase());
//        str.toUpperCase();
//        System.out.println(str);
//
//        int j = -5;
//        System.out.println(++j);
//
//        String a = "Java is fun";
//        String b = 5 + 4 + a;
//        System.out.println(b);
//
//        int c= a.charAt(4);
//        System.out.println(c);
//        if(c==' '){
//            System.out.println("b");
//        }
//        a.substring(2);
//        System.out.println("a = " + a);
//        String a2 = a.substring(1);
//        System.out.println(a2);
//        int i2 = a2.indexOf("Java");
//        System.out.println(i2);
//        a=a.substring(1,13);
//        System.out.println(a);

//        String x = "cybertek";
//        for(int i=0; i <=x.length(); i+=2) {
//            System.out.println(x.charAt(i));
//        }


//        boolean[] bool = {true, false, true};
//        System.out.println("bool = " + Arrays.toString(bool));


//            Scanner input = new Scanner(System.in);
//            float[] score = new float[7];
//            //WRITE YOUR CODE HERE
//
//
//            float sum = 0;
//            float total = 0;
//
//            for(int i = 0; i < score.length; i++) {
//
//                System.out.println("Enter score for judge " + (i+1) + ":");
//                score[i] = input.nextFloat();
//
//                sum += score[i];
//            }
//
//            float max = score[0];
//            float min = score[0];
//
//            for(int i = 0; i < score.length; i++) {
//                if(max < score[i]) {
//                    max = score[i];
//                }
//
//                if(min > score[i]) {
//                    min = score[i];
//                }
//
//            }
//
//            sum -= (min + max);
//
//            System.out.println("Enter difficulty:");
//            float difficulty = input.nextFloat();
//
//            total = sum * difficulty * 0.6f;
//
//            // FINAL OUTPUT
//            System.out.printf("Total: %.2f", total);


//        int[] addElement = {1,3,5,7,9};
//        int n = 11;
//
//        int[] newArray = new int[addElement.length + 1];
//
//        for(int i=0; i<addElement.length; i++) {
//            newArray[i] = addElement[i];
//        }
//
//        newArray[newArray.length-1] = n;
//
//        System.out.println(Arrays.toString(newArray));
//
//        int[] newArray2 = new int[newArray.length+1];
//        int m = 13;
//
//        int j =0;
//
//        for (int each: newArray) {
//            newArray2[j++] = each;
//            System.out.print(each+" ");
//        }
//
//        newArray2[j] = m;
//
//        System.out.println();
//        System.out.println(Arrays.toString(newArray2));



//        import java.time.
//        LocalDate:11/24/2020
//
//        LocalTime:5:22:00 PM
//
//        LocalDateTime: year month day hour minute second



//        LocalDate yesterday = LocalDate.of(2020,11,23);
//        System.out.println("yesterday = " + yesterday);
//
//
//        LocalDate date = LocalDate.of(2020,2,29);
//        System.out.println("date = " + date);
//
//        System.out.println("date.isLeapYear() = " + date.isLeapYear());
//
//        LocalDate today = LocalDate.now();
//
//        System.out.println("today = " + today);
//




//        String[] names = {"Ercan", "Aylin", "Gizem", "Emir"};
//        LocalDate[] DofB = {LocalDate.of(1974,3,3),
//                            LocalDate.of(1969,5,10),
//                            LocalDate.of(1991,9,30),
//                            LocalDate.of(2007,7,19)};
//
//        for(int i=0; i < names.length; i++) {
//            System.out.println(names[i] + ": " + DofB[i]);
//        }
//
//        for(LocalDate each: DofB) {
//            if(LocalDate.of(1974,3,3).equals(each)) {
//                System.out.println("HAPPY BIRTHDAY TO YOU!!!");
//
//            }
//
//        }
//
//        if(DofB[0].isBefore(DofB[1])) {
//            System.out.println(names[0] + " is older");
//        }else if(DofB[1].isBefore(DofB[0])) {
//            System.out.println(names[1] + " is older");
//        }else {
//            System.out.println("Same age");
//        }
//
//        System.out.println("DofB[0].plusYears(30) = " + DofB[0].plusYears(30));
//
//
//        int age =0;
//        int agePlus15Years = 0;
//        int ageMinus10years = 0;
//
//        for(int i =0; i< names.length; i++) {
////            age = LocalDate.now().getYear()-LocalDate.of(1974,3,3).getYear();
//            age = LocalDate.now().getYear() - DofB[i].getYear();
//            System.out.println(names[i] +" is "+ age + " years old");
//
//            agePlus15Years = LocalDate.now().plusYears(15).getYear() - DofB[i].getYear();
//            System.out.println(names[i] +" is "+ agePlus15Years + " years old");
//
//        }
//
//        System.out.println("=============");
//
//        DateTimeFormatter birthDayFormat = DateTimeFormatter.ofPattern("MMMM/dd/yyyy, EEEE");
//
//        for(int i =0; i< names.length; i++) {
//            age = LocalDate.now().minusYears(DofB[i].getYear()).getYear();
//
//            System.out.println(names[i] +" is "+ age + " years old");
//
//            ageMinus10years= LocalDate.now().minusYears(10).getYear() - DofB[i].getYear();
//            System.out.println(names[i] +" is "+ ageMinus10years + " years old");
//
//            if(age >= 21) {
//                System.out.println(names[i] + "is eligible to vote");
//            }else {
//                System.out.println("You were born on : " + DofB[i].format(birthDayFormat));
//                LocalDate eligible = LocalDate.of(LocalDate.now().plusYears(21- age).getYear(),DofB[i].getMonthValue(),DofB[i].getDayOfMonth());
//                System.out.println("You will be eligible to vote on : " + eligible);
//                System.out.println((eligible.getYear() - LocalDate.now().getYear()) + " years later from now");
//            }
//
//        }
//
//        System.out.println("====================================");
//
//        LocalDate dOfB = LocalDate.of(2007,7,9);
//        System.out.println("dOfB.plusDays(10) = " + dOfB.plusDays(10));
//
//        System.out.println("dOfB.plusYears(20) = " + dOfB.plusYears(20));
//
//
//        LocalTime time = LocalTime.of(23,45,12);
//        System.out.println("time = " + time);
//
//        LocalTime now = LocalTime.now();
//        System.out.println("now = " + now);
//
//
//        LocalDateTime dateTime = LocalDateTime.of(2020,11,24,6,11,20);
//        System.out.println("dateTime = " + dateTime);
//
//
//        DateTimeFormatter dt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//
//        LocalDate today = LocalDate.now();
//        System.out.println("today = " + today);
//        System.out.println("today.format(dt) = " + today.format(dt));
//
//        DateTimeFormatter dt1 = DateTimeFormatter.ofPattern("dd/MMM/yyyy");
//        System.out.println("today.format(dt1) = " + today.format(dt1));
//
//        DateTimeFormatter dt2 = DateTimeFormatter.ofPattern("dd/MMM/yy");
//        System.out.println("today.format(dt2) = " + today.format(dt2));
//
//        DateTimeFormatter dt3 = DateTimeFormatter.ofPattern("E dd/MMM/yyyy");
//        System.out.println("today.format(dt3) = " + today.format(dt3));
//
//        DateTimeFormatter dt4 = DateTimeFormatter.ofPattern("EEEE dd/MMMM/yyyy");
//        System.out.println("today.format(dt4) = " + today.format(dt4));
//
//        DateTimeFormatter dt10 = DateTimeFormatter.ofPattern("dd/MM/yyyy E");
//        System.out.println("today.format(dt10) = " + today.format(dt10));
//
//        DateTimeFormatter timeFormat = DateTimeFormatter.ofPattern("hh:mm:ss a");
//        LocalTime currentTime = LocalTime.now();
//        System.out.println("currentTime = " + currentTime);
//        System.out.println("currentTime.format() = " + currentTime.format(timeFormat));
//
//
//        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("EEEE, hh:mm a, MMM/dd/yyyy");
//
//        LocalDateTime dtfVer = LocalDateTime.now();
//
//        System.out.println("dtfVer.format(dtf) = " + dtfVer.format(dtf).replace("PM","pm"));


//        String s = "02:55:00PM";
//
//        String[] sArr = s.split(":");
//
//        int hour = Integer.parseInt(sArr[0]);
//        int minute = Integer.parseInt(sArr[1]);
//        int second = Integer.parseInt(sArr[2].substring(0,2));
//        String amPm = sArr[2].substring(2);
//
//        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
//
//        LocalTime time = LocalTime.of(hour,minute,second);
//
//        if(amPm.toLowerCase().equals("pm")) {
//
//            if(hour >=1 && hour < 12) {
//                hour += 12;
//            }
//            time = LocalTime.of(hour,minute,second);
//
//        }else {
//            if(hour == 12) {
//                hour = 0;
//            }
//            time = LocalTime.of(hour,minute,second);
//        }
//
//        System.out.println(time.format(dtf));




//        int[] nums = {2, 5, 5, 6, 3, 6, 9, 34, 3};
//
//        int counter = 0;
//
//        for(int eachElement : nums) {
//
//            for(int eachNumber : nums) {
//
//                if(eachElement == eachNumber) {
//                    counter++;
//                }
//            }
//
//            if(counter ==1) {
//                System.out.println(eachElement);
//            }
//
//        }
//        String one = "12345";
//        String two ="abcde";
//        String[] oneArr = one.split("");
//        String[] twoArr = two.split("");
//        String merged = "";
//
//        for(int i=0; i<oneArr.length; i++) {
//            merged +=oneArr[i]+twoArr[i];
//        }
//        System.out.println("merged = " + merged);
//
//        char[] x = two.toCharArray();


        System.out.println(clean("he said bla bla bla", "bla"));
        System.out.println(clean("one two three","two"));
        System.out.println(limit("abcd",2));

        System.out.println(at3("longword","foo"));


    }

    public static String clean (String text ,String badWord) {

        String[] textArray = text.split(" ");

        String result = "";

        for(String eachText : textArray) {

            if(eachText.equals(badWord)) {

                continue;

            }

            result += eachText + " ";

        }

        result = result.trim();

        return result;

    }



    public static String limit(String text, int maxLength)
    {
        char[] textChar = text.toCharArray();
        String result = "";

        for(int i = 0; i <= maxLength; i++) {

            result += textChar[i];

        }

        return result;

    }


    public static String at3(String target,String word)
    {
        String result = target.substring(0,3)+word+target.substring(3);
        return result;
    }


}
