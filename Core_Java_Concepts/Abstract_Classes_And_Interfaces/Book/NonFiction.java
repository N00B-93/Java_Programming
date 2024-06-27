package Abstract_Classes_And_Interfaces.Book;

public class NonFiction extends Book
{
    /**
     * Instantiates a new NonFiction Book Object.
     *
     * @param title The NonFiction Book title.
     */
    public NonFiction(String title)
    {
        super(title);
        this.setPrice();
    }

    /**
     * Sets the price of a NonFiction Book Object to 37.99.
     */
    @Override
    public void setPrice()
    {
        this.price = 37.99;
    }
}
