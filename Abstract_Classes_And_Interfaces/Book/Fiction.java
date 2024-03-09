package Abstract_Classes_And_Interfaces.Book;

public class Fiction extends Book {
    /**
     * Instantiates a new Fiction Book Object.
     *
     * @param title The Fiction Book title.
     */
    public Fiction(String title) {
        super(title);
        this.setPrice();
    }

    /**
     * Set the price of a Fiction Book Object to 24.99.
     */
    @Override
    public void setPrice() {
        this.price = 24.99;
    }
}
