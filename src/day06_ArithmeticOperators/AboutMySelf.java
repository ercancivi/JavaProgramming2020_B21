package day06_ArithmeticOperators;

public class AboutMySelf {

    public static void main(String[] args) {

        /*  Task01: AboutMyself
        variables: firstName, lastName, fullName, from, favoriteBook, favoriteShow
        output:
            Full name is: YourFullName
            From: YourCountryName
            Favorite Book is: "YourFavoriteBook"
            Favorite Show is: "YourFavoriteShow"
         */
        String firstName = "Ercan";
        String lastName = "Civi";
        String fullName = firstName + " " + lastName;
        String from = "USA";
        String favoriteBook = "Data Structures in Java";
        String favoriteShow = "Game of Thrones";

        System.out.println("Full name is: " + fullName + "\nFrom: " + from + "\nFavorite Book is: \"" + favoriteBook
                                                       + "\"\nFavorite Show is: \"" + favoriteShow + "\"");

    }

}
