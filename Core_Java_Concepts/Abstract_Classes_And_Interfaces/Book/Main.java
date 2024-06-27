package Abstract_Classes_And_Interfaces.Book;

import java.util.Scanner;

/*
    This is a program that prompts the user to enter the title of a Fiction and a NonFiction Book,
    Creates a Fiction and a NonFiction Book Object and then displays the title and the prices of each Book.
 */

public class Main
{
    public static void main(String[] args)
    {
        // Creates a Scanner Object.
        Scanner keyBoard = new Scanner(System.in);

        // Prompts the user to enter the title of a Fiction Book.
        System.out.printf("\nEnter the Title of a Fiction Book: ");
        String title = keyBoard.nextLine();

        // Creates a Fiction Book Object.
        Fiction fictionBook = new Fiction(title);

        // Prompts the user to enter the title of a NonFiction Book.
        System.out.printf("\nEnter the Title of a NonFiction Book: ");
        title = keyBoard.nextLine();

        // Creates a NonFiction Book Object.
        NonFiction nonFictionBook = new NonFiction(title);

        // Displays the Fiction Book Details.
        System.out.println("\nFiction Book Details: ");
        System.out.printf("\nBook Title: %s\nBook Price: $ %.2f\n", fictionBook.getTitle(), fictionBook.getPrice());

        // Displays the Non-Fiction Book details.
        System.out.println("\nNonFiction Book Details: ");
        System.out.printf("\nBook Title: %s\nBook Price: $ %.2f\n", nonFictionBook.getTitle(), nonFictionBook.getPrice());
    }
}
