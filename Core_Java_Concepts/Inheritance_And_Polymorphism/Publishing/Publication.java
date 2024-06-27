package Inheritance_And_Polymorphism.Publishing;

public class Publication implements Comparable<Publication>
{
    // Attributes of a Publication.
    protected String publisher, title;
    protected int numberOfPages;
    protected double price;

    public Publication() {}  // No-arg constructor.

    /**
     * Instantiates a new Publication.
     * @param publisher The name of the publisher of the Publication.
     * @param price The price of the Publication.
     * @param numberOfPages The Publication's number of pages.
     * @param title The Publication's title.
     */
    public Publication(String publisher, double price, int numberOfPages, String title)
    {
        this.publisher = publisher;
        this.price = price;
        this.numberOfPages = numberOfPages;
        this.title = title;
    }

    /**
     * Compares two Publication Objects based on their titles.
     *
     * @param publication The Publication Object to be compared with the current instance.
     * @return .
     */
    @Override
    public int compareTo(Publication publication)
    {
        if (this.title.compareToIgnoreCase(publication.title) > 0)
            return (0);
        else if (this.title.compareToIgnoreCase(publication.title) == 0)
            return (1);
        return (-1);

    }

    /**
     * Displays Information about a Publication.
     */
    public void printDetails()
    {
        System.out.println("\n\t\t" + this.getClass().getSimpleName() + " Details.");
        System.out.printf("\nPublisher: %s\nPrice: $%.2f\nNumber of Pages: %d\nTitle: %s\n", this.publisher, this.price,
                this.numberOfPages, this.title);
    }
}
