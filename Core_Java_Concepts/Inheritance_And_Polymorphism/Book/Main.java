package Inheritance_And_Polymorphism.Book;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Date;

public class Main
{
    public static void main(String[] args)
    {
        // Creates a Scanner Object.
        Scanner input = new Scanner(System.in);

        // creates a Library Object.
        Library library = new Library();

        System.out.println("\n\t\t\tWelcome to $N00B's Library.");

        while (true)
        {
            // Displays a menu o the user.
            System.out.printf("\nWhat would you like to do?\n");
            System.out.print("""
                    \n1. Add Book
                    \n2. Borrow Book
                    \n3. Display all Books
                    \n4. Exit
                    """);

            // Prompts the user to enter an option.
            System.out.printf("\nEnter an Option: ");
            String option = input.nextLine();

            switch (option)
            {
                case "1":
                    // Prompts the user to the author's name.
                    System.out.printf("\nEnter Author's Name: ");
                    String authorName = input.nextLine();

                    // Prompts the user to enter the title.
                    System.out.printf("\nEnter the Book's Title: ");
                    String bookTitle = input.nextLine();

                    // Prompts the user to enter the book's ISBN-10.
                    System.out.printf("\nEnter the Book's ISBN-10: ");
                    String ISBN10 = input.nextLine();

                    // Continues to prompt the user to enter a valid ISBN-10 number if length of user input is not 10.
                    while (ISBN10.length() != 10)
                    {
                        System.out.println("\nInvalid ISBN-10, ISBN-10 must be 10 digits long.");
                        System.out.printf("\nEnter the Book's ISBN-10: ");
                        ISBN10 = input.nextLine();
                    }

                    // Create a LibraryBookImplementation Object.
                    LibraryBookImplementation libraryBookImplementation = new LibraryBookImplementation(authorName,
                            bookTitle, ISBN10);
                    System.out.println("\nBook Successfully Added!!!");
                    break;
                case "2":
                    // Prompts the user to enter the ISBN-10 number of the book to be borrowed.
                    System.out.printf("\nEnter the book's ISBN-10: ");
                    ISBN10 = input.nextLine();

                    // Continues to prompt the user to enter a valid ISBN-10 number if length of user input is not 10.
                    while (ISBN10.length() != 10)
                    {
                        System.out.println("\nInvalid ISBN-10, ISBN-10 must be 10 digits long.");
                        System.out.printf("\nEnter the Book's ISBN-10: ");
                        ISBN10 = input.nextLine();
                    }

                    // Prompts the user to enter his/her name.
                    System.out.printf("\nEnter your Name: ");
                    String name = input.nextLine();

                    // Creates a Date Object.
                    Date returnDate = new Date();

                    try
                    {
                        // Prompts the user to specify the date the book will be returned.
                        System.out.printf("\nEnter the year the book will be returned: ");
                        int year = input.nextInt();

                        // Prompts the user to specify the month of the year the book will be returned.
                        System.out.printf("\nEnter the month of the year the book will be returned(1 - 12): ");
                        int month = input.nextInt();

                        // Prompts the user to specify the day of the week the book will be returned.
                        System.out.printf("\nEnter the day of the month the book will be returned(1 - 31): ");
                        int day = input.nextInt();


                        returnDate.setYear(year);
                        returnDate.setMonth(month - 1);
                        returnDate.setDate(day);

                        // Lends the user the book.
                        library.checkOut(ISBN10, name, returnDate);

                        // Informs the user that he/she has been lent the book.
                        System.out.println("\nYou have successfully lent " );
                    }
                    catch (InputMismatchException inputMismatchException)
                    {
                        System.out.println(inputMismatchException.getMessage());
                        System.out.println("\nBook Lending Unsuccessful.");
                        input.nextLine();
                    }



            }
        }
    }
}
