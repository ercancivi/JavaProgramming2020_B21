package day29_Custom_Methods;

public class MethodsWithoutParameters2 {
    /*
        void method without parameter
        void method with parameter
        return methods with or without parameters
        method overloading


     */

    public static void main(String[] args) {

        printOddNumbers1to100();
        System.out.println("Hello");
        printEvenNumbers1to100();
        MethodsWithoutParameters.printHello5Times();


    }

    // AccessModifier  specifier   returnTYPE   MethodName (Parameter){ }
    public static void printOddNumbers1to100() {

        for(int i = 1; i < 100; i++){
            if(i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

    }


    public static void printEvenNumbers1to100() {

        for(int i = 1; i <= 100; i++){
            if(i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

    }




}
