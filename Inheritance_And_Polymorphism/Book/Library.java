package Inheritance_And_Polymorphism.Book;

import java.util.ArrayList;
import java.util.Date;

/**
 * The type Library.
 */
public class Library
{
    // Attribute of a Library.
    ArrayList<LibraryBookImplementation> libraryBooks = new ArrayList<>();

    /**
     * Adds a book to the Library's shelf.
     *
     * @param libraryBook The book to be added.
     */
    public void addLibraryBook(LibraryBookImplementation libraryBook)
    {
        this.libraryBooks.add(libraryBook);
    }

    /**
     * Checks out a book.
     *
     * @param ISBN The ISBN of the book to be checked out.
     * @param currentHolder The current holder of the book.
     * @param dueDate The book's due date.
     */
    public void checkOut(String ISBN, String currentHolder, Date dueDate)
    {
        for (LibraryBookImplementation book: this.libraryBooks)
        {
            if (book.getISBN().equals(ISBN))
            {
                book.setCurrentHolder(currentHolder);
                book.setDueDate(dueDate);
                return;
            }
        }
        System.out.printf("\nBook with ISBN %s not Found!!!\n", ISBN);
    }

    /**
     * This returns the current holder of a book.
     *
     * @param ISBN The book's ISBN.
     * @return The current holder of the book.
     */
    public String getCurrentHolder(String ISBN)
    {
        for (LibraryBookImplementation book : libraryBooks)
        {
            if (book.getISBN().equals(ISBN))
            {
                return book.getCurrentHolder();
            }
        }
        return "Book with ISBN " + ISBN + " not found.";
    }
}
