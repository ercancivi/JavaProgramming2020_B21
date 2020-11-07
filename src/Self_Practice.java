import java.util.Arrays;
import java.util.Scanner;

public class Self_Practice {

    public static void main(String[] args) {
        int digit=0;
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        int j = 10000;
        int i = 1;
        while(num > 0) {

            digit = num / j;
            num = num % j;

            System.out.println("digit" + i + ": " + digit);

            j /= 10;
            i++;
        }




    }


}
