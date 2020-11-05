package day27_ForEachLoop;

public class Task1_ByMe {

    public static void main(String[] args) {

        String[] names = {"Adil", "Ahmed", "Irina", "Ramiz", "Olesea", "Justyna", "Asuman", "Courtney", "Guvanch", "Vladyslav", "Altynai"};

        for(String eachName : names) {
            System.out.println(eachName.substring(0,3));
        }

    }

}
