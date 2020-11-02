import java.util.Scanner;

public class ShortCuts {

    public static void main(String[] args) {

        /*  pic                     ===> package, import, class
            Reformat Code           ===> Ctrl + Alt + L
            Println                 ===> soutv + enter
            Main                    ===> main + enter/tab   or psvm + enter/tab
            System.err.println();   ===> serr + enter/tab

            \r                      ===> replace


            String from             ===> java.lang package ===> import java.lang.String
            Scanner from            ===> java.util package ===> import java.util.Scanner
         */

        String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Now", "Dec"};

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter number of month");
        int numOfMonth = scan.nextInt();

        System.out.println(months[numOfMonth-1]);


        String[] days = {"Mon", "Tue", "Wed","Thu", "Fri", "Sat", "Sun"};

        System.out.println("Enter number of day");
        int numOfDay = scan.nextInt();

        System.out.println(days[numOfDay-1]);

        scan.close();

        int[] nums = {50,-25,30,12,-35,100, -85, 23,-3};

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i = 0; i < nums.length; i++) {
            if(max < nums[i]) {
                max = nums[i];
            }

            if(min > nums[i]) {
                min = nums[i];
            }
        }

        System.out.println("min = " + min + "\nmax = " + max);




    }
}
