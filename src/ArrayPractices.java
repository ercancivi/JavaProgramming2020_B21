import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractices {

    public static void main(String[] args) {

//        String name = "CyberTek"; //this for only one data what about if we want to keep more than one data
//
//        String[] names = {"Azad", "Ayse", "Inna", "Erjon", "Aysel"};
//        //index number:     0       1       2        3        4
//
//        //retrieve data from array:
//
//        System.out.println(names[2]);
//
//        String str1 = names[0];
//        System.out.println(str1);
//
//        int[] score = {80,85,90,70,75};
        //index nums:   0  1  2  3  4

        //Erjon : 70

//        System.out.println(names[0] + " " + score[0]);
//        System.out.println(names[1] + " " + score[1]);
//        System.out.println(names[2] + " " + score[2]);

//        for(int i = 0; i < names.length; i++) {
//            System.out.println(names[i] + ": " + score[i]);
//        }
//
//        String[] students = new String[5];
//
//        students[0] = "Emir";
//        students[1] = "Gizem";
//        students[2] = "Aylin";
//        students[3] = "Ercan";
//        students[4] = "Volkan";
//
//        for(int i = 0; i < students.length; i++) {
//            System.out.println(students[i]);
//        }
//
//        Scanner scan = new Scanner(System.in);
//        System.out.println("How many friends");
//        int number = scan.nextInt();
//
//        String[] firstName = new String[number];
//        String[] lastName = new String[number];
//
//        for(int i=0; i<number; i++) {
//            System.out.println("Enter first name: ");
//            firstName[i] = scan.next();
//
//            System.out.println("Enter last name: ");
//            lastName[i] = scan.next();
//        }
//
//        String[] fullName = new String[number];
//
//        for(int i=0; i<number; i++) {
//            fullName[i] = firstName[i] + " " + lastName[i];
//            System.out.println(fullName);
//        }




//        int[] nums = {25,-3,18,2,-20,90,12,-6,70,-14,26,13,8,-45};
//        int max = nums[0];
//        int min = nums[0];
//        for(int i=0; i<nums.length; i++) {
//            max= (max < nums[i]) ? nums[i] : max;
//            min= (min > nums[i]) ? nums[i] : min;
//        }
//        System.out.println("max = " + max);
//        System.out.println("min = " + min);





//        String[] months = {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
//
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter number of month : ");
//        int numberOfMonth= input.nextInt();
//
//        System.out.println(months[numberOfMonth-1]);





//        boolean isTrue = true;
//        while(isTrue){
//
//            System.out.println("Enter math operator: ");
//            char operator = input.next().charAt(0);
//
//            if(operator == '/' || operator == '%') {
//                System.out.println("Please make sure denominator can't be zero=0");
//            }
//            System.out.println("Enter first number: ");
//            double firstNumber = input.nextDouble();
//
//            System.out.println("Enter second number: ");
//            double secondNumber = input.nextDouble();
//
//            switch (operator) {
//                case '+':
//                    System.out.println(firstNumber+secondNumber);
//                    break;
//                case '-':
//                    System.out.println(firstNumber-secondNumber);
//                    break;
//                case '*':
//                    System.out.println(firstNumber*secondNumber);
//                    break;
//                case '/':
//                    if(firstNumber>secondNumber){
//                        System.out.println(firstNumber/secondNumber);
//                    }else {
//                        System.err.println("I told you!!! denominator can't be zero=0");
//                    }
//                    break;
//                case '%':
//                    if(firstNumber>secondNumber){
//                        System.out.println(firstNumber%secondNumber);
//                    }else {
//                        System.err.println("I told you!!! denominator can't be zero=0");
//                    }
//                    break;
//                default:
//                    System.err.println("Invalid data");
//                    break;
//            }
//            input.nextLine();
//            System.out.println("would you like to continue if yes press y but press n: ");
//            String answer = input.nextLine().toLowerCase();
//
//            while(!(answer.equals("y") || answer.equals("n"))) {
//
//                System.out.println("Invalid answer, Please Re-Enter");
//                System.out.println("would you like to continue if yes press y but press n: ");
//                answer = input.next().toLowerCase();
//            }
//
//            if(answer.equals("n")) {
//                isTrue = false;
//            }
//
//
//
//
//        }


//        //unique characters
//        String str = "abcababe";
//        String result = "";
//
//        for(int i=0; i<str.length();i++) {
//            int frequency = 0;
//            char ch = str.charAt(i);
//
//            for(int j=0; j<str.length(); j++) {
//
//                if(ch == str.charAt(j)) {
//
//                    frequency++;
//
//                }
//
//            }
//
//
//            if(frequency == 1) {
//
//                result += ch;
//
//            }
//
//        }
//        System.out.print(result);


//        //removeUniqueChars
//        String str = "abcabd";
//        String result = ""; //abab
//
//        for(int j=0; j<str.length(); j++){
//            char ch = str.charAt(j);
//            int frequency= 0;
//
//            for(int i=0; i<str.length(); i++) {
//                char eachChar= str.charAt(i);
//                if(ch == eachChar) {
//                    frequency++;
//                }
//            }
//
//            if(frequency > 1) {
//                result += ch;
//            }
//
//        }
//
//        System.out.println("result = " + result);
//
//
//
//
//        //removeDuplicated
//        String str1 = "abcabd";
//        String result1 = ""; //abcd
//
//        for(int j=0; j<str1.length();j++) {
//            char ch1 = str1.charAt(j);
//
//            for(int i=0; i<str1.length();i++) {
//                if(!result1.contains("" + ch1)){
//                    result1 += ch1;
//                }
//            }
//        }
//        System.out.println("result1 = " + result1);
//
//
//        //removeUniqueChars and removeDuplicated
//        String str2 = "abcabd";
//        String result2 = ""; //ab
//
//        for(int j=0; j<str2.length();j++) {
//            char ch2 = str1.charAt(j);
//            int frequency =0;
//
//            for(int i=0; i<str2.length();i++) {
//                if(ch2 == str2.charAt(i)) {
//                    frequency++;
//                }
//            }
//
//            if(frequency > 1 && !result2.contains("" + ch2)){
//                result2 += ch2;
//            }
//        }
//        System.out.println("result2 = " + result2);



//        if(!result.contains("" + ch)) {
//            result += ch;
//        }


//            int[] arr = {1,2,6,5,3,7,1,2,6,1,2,5,7,3,5,1};
//            int sum = 0;
//            for(int i=0; i < arr.length; i++){
//                if(arr[i] == 6) {
//                    for(int j=i+1; j < arr.length; j++ ){
//                        if(!(arr[j] == 7)){
//                            continue;
//                        }else{
//                            i=j;
//                            break;
//                        }
//                    }
//                }else {
//                    sum += arr[i];
//                }
//
//            }
//
//        System.out.println("sum = " + sum);


//        int[] numbers = {85,23,15,1,70,12,45,36,68,150,-3,19,54,-9,5,28};
//
//        int max = numbers[0];
//        int min = numbers[0];
//        for(int i=0; i<numbers.length; i++) {
//            max = (numbers[i]>max)?numbers[i] : max;
//            min = (numbers[i]<min)?numbers[i] : min;
//        }
//        System.out.println("min = " + min);
//        System.out.println("max = " + max);


//        String[] months = {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
//
//        Scanner scan = new Scanner(System.in);
//
//        System.out.println("enter month's number");
//        int numberOfMonth = scan.nextInt();
//
//        System.out.println(months[numberOfMonth-1]);


//        Must be fix
//        while(true) {
//            System.out.println("Enter first number");
//            int num1 = scan.nextInt();
//
//            System.out.println("Enter Math Operator");
//            String mathOperator = scan.next();
//
//            while(mathOperator.length() > 1) {
//                System.out.println("Enter Math Operator");
//                mathOperator = scan.next();
//            }
//
//            char operator = mathOperator.charAt(0);
//
//            while(!(operator == '+' || operator == '-' || operator == '*' ||  operator == '/' || operator == '%')) {
//                System.out.println("Enter Math Operator");
//                operator = scan.next().charAt(0);
//            }
//
//            if(operator=='/' || operator=='%') {
//                System.out.println("second number cannot be zero");
//            }
//            System.out.println("Enter second number");
//            int num2 = scan.nextInt();
//            int result = 0;
//            switch(operator) {
//                case '+':
//                    result = num1+num2;
//                    break;
//                case '-':
//                    result = num1-num2;
//                    break;
//                case '*':
//                    result = num1*num2;
//                    break;
//                case '/':
//                    if(num2>0) {
//                        result = num1 / num2;
//                    }else {
//                        System.err.println("invalid data");
//                        System.err.println("second number Cannot be zero");
//                    }
//                    break;
//                case '%':
//                    if(num2>0) {
//                        result = num1 % num2;
//                    }else {
//                        System.err.println("invalid data");
//                        System.err.println("second number Cannot be zero");
//                    }
//                    break;
//                default :
//                    System.err.println("invalid data");
//                    break;
//            }
//
//            if((operator=='/' || operator=='%') && (num2>0)){
//                System.out.println("result = " + result);
//            }
//
//
//            System.out.println("Would you like to continue?");
//            String answer = scan.next().toLowerCase();
//
//            while(!(answer.equals("yes") || answer.equals("no"))) {
//                System.out.println("invalid data");
//                System.out.println("Would you like to continue?");
//                answer = scan.next().toLowerCase();
//            }
//
//            if(answer.equals("no")) {
//                break;
//            }
//
//
//        }


//        String str = "ababcaa";
////        String result = "a4b2c1";
//
//
//        String result = "";
//
//        for(int j= 0; j<str.length(); j++) {
//            char ch = str.charAt(j);
//            int count = 0;
//
//            for(int i=0; i<str.length(); i++) {
//                if(ch == str.charAt(i)) {
//                    count++;
//                }
//            }
//
//            if(!result.contains("" + ch)) {
//                result += "" + ch + count;
//            }
//
//        }
//        System.out.println("result = " + result);



//        int[] nums = {6,9,3,1,7,-5,8,4,2,5};
//
//        Arrays.sort(nums);
//        int[] descendingArray = new int[nums.length];
//
//        for(int i = nums.length-1, j=0; i>=0; i--,j++) {
//            System.out.print(nums[i] + " ");
//            descendingArray[j]= nums[i];
//        }
//        System.out.println();
//        System.out.println(Arrays.toString(descendingArray));









    }


}
