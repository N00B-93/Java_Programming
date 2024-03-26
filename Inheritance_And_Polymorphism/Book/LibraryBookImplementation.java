package Inheritance_And_Polymorphism.Book;

import java.util.Date;

/**
 * The type Library book implementation.
 */
public class LibraryBookImplementation implements LibraryBook
{
    // Attributes of a LibraryBookImplementation
    private String author;
    private String title;
    private String ISBN;
    private String currentHolder;
    private Date dueDate;

    /**
     * Instantiates a new LibraryBookImplementation Object.
     *
     * @param author The LibraryBookImplementation author.
     * @param title The LibraryBookImplementation's title.
     * @param ISBN The LibraryBookImplementation's ISBN.
     * @param dueDate The LibraryBookImplementation's due date.
     * @param currentHolder The LibraryBookImplementation's current holder.
     */
    public LibraryBookImplementation(String author, String title, String ISBN, String currentHolder, Date dueDate)
    {
        this.author = author;
        this.title = title;
        this.ISBN = ISBN;
        this.currentHolder = currentHolder;
        this.dueDate = dueDate;
    }

    /**
     * This returns the Book's author.
     *
     * @return The Book's author.
     */
    @Override
    public String getAuthor()
    {
        return this.author;
    }

    /**
     * This returns the Book's title.
     *
     * @return The Book's title
     */
    @Override
    public String getTitle()
    {
        return this.title;
    }

    /**
     * This returns the Book's ISBN.
     *
     * @return The Book's ISBN.
     */
    @Override
    public String getISBN()
    {
        return this.ISBN;
    }

    /**
     * This returns a LibraryBook's due date.
     *
     * @return The due date.
     */
    public Date getDueDate()
    {
        return this.dueDate;
    }

    /**
     * Sets the LibraryBook's due date to the specified value.
     *
     * @param dueDate The due date.
     */
    @Override
    public void setDueDate(Date dueDate)
    {
        this.dueDate = dueDate;
    }

    /**
     * This returns the name of the LibraryBook's current Holder.
     *
     * @return The name of the current holder.
     */
    @Override
    public String getCurrentHolder()
    {
        return this.currentHolder;
    }

    /**
     * Sets the LibraryBook's current holder to the specified value.
     *
     * @param currentHolder The current holder.
     */
    @Override
    public void setCurrentHolder(String currentHolder)
    {
        this.currentHolder = currentHolder;
    }
}
