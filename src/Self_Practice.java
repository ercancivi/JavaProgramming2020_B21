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









    }


}
