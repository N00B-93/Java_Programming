package Inheritance_And_Polymorphism.Publishing;

public class Book extends Publication
{
    // Attribute of a Book.
    protected String author;

    public Book() {}  // No-arg constructor.

    /**
     * Instantiates a new Book.
     *
     * @param publisher The name of the Book's publisher.
     * @param price The Book's price.
     * @param numberOfPages The number of pages in the Book.
     * @param title The Book's title.
     * @param author The author of the Book.
     */
    public Book(String publisher, double price, int numberOfPages, String title, String author)
    {
        super(publisher, price, numberOfPages, title);
        this.author = author;
    }

    /**
     * Displays Information about a Book.
     */
    @Override
    public void printDetails()
    {
        super.printDetails();
        System.out.printf("Author: %s\n", this.author);
    }
}
