package Abstract_Classes_And_Interfaces.Book;

/**
 * The type Book.
 */
public abstract class Book
{
    // Attributes of a book Object.
    private String title;
    protected double price = 50;

    /**
     * Instantiates a new Book Object.
     *
     * @param title The Book's title.
     */
    public Book(String title)
    {
        this.title = title;
    }

    /**
     * This returns the Book's title.
     *
     * @return The Book's title.
     */
    public String getTitle()
    {
        return this.title;
    }

    /**
     * This returns the Book's price.
     *
     * @return The Book's price.
     */
    public double getPrice()
    {
        return this.price;
    }

    /**
     * Abstract method that sets the Book's price to a given value.
     */
    public abstract void setPrice();
}
