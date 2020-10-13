package day15_Scanner_Importing.warmUpTasks;

public class Digits {

    public static void main(String[] args) {

        /*  Given a number(long) determine and print how many digits it has.

                - Condition: The number has to be between 1 and 100000, if it is not print "Invalid number"

                Ex: 124 --> 3 digits
                    13213 --> 5 digits
                    883218 --> Invalid number
                    23 --> 2 digits
         */
        long number = 100000;
        String result = "";

        if( number >= 1 && number <= 100000) {
            if(number / 10 != 0) {

                if (number / 100 != 0) {

                    if(number / 1000 != 0 ) {

                        if(number / 10000 != 0) {

                            if(number / 100000 != 0) {
                                result = "6 digits";
                            }else {
                                result = "5 digits";
                            }
                        }else {
                            result = "4 digits";
                        }
                    }else {
                        result = "3 digits";
                    }
                }else {
                    result = " 2 digits";
                }
            }else {
                result = "1 digit";
            }
        }else {
            result = "Invalid number";
        }

        System.out.println("result = " + result);

    }

}
