package day04;

public class Variables_Practice2 {

    public static void main(String[] args) {

        /* Rules for Identifiers(Variable or Class Names)
            Variable names should be readable.
            When variable names contain two or more words, use camel case.
            The first character must be one of the letters a-z or A-Z, an underscore( _ ), or a dollar
            After the first character, you may use the letters a-z or A-Z, the digits 0-9, underscores( _ ),
                or dollar sign( $ )
            Identifiers can not include spaces

         */
        int n = 100;
        //int n = 200;

        double salary = 30000;
        double salary2 = 400000;

        int x = 120000;     //Variable names should be readable.
        double y = 0.25;    //Variable names should be readable.

        //double 123Abc = 3000; //The first character must be
                                //one of the letters a-z or A-Z, an underscore( _ ), or a dollar sign( $ )

        double num2 = 50000; //After the first character,
                             //you may use the letters a-z or A-Z, the digits 0-9, underscores( _ ),or dollar sign($)

        int salary_$ = 3000000; //After the first character,
                                //you may use the letters a-z or A-Z, the digits 0-9, underscores( _ ),or dollar sign($)
        int total_tax = 35000;

        //double area% = 3.5;

        double _$Area = 100;

        double Area = 100;

        int Public = 2000;

        int number1 = 100_000_000; // not with comma like this ==> 100,000,000
        System.out.println(number1);







    }

}
