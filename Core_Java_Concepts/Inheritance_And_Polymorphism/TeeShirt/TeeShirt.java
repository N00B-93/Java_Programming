package Inheritance_And_Polymorphism.TeeShirt;

/**
 * The type Tee shirt.
 */
public class TeeShirt
{
    // Attributes of a TeeShirt Object.
    protected int orderNumber;
    protected String size, colour;
    protected double price;

    // No-arg Constructor.
    public TeeShirt(){}

    /**
     * Instantiates a new TeeShirt Object.
     *
     * @param orderNumber The order number.
     * @param size The TeeShirt size.
     * @param colour The TeeShirt colour.
     */
    public TeeShirt(int orderNumber, String size, String colour)
    {
        this.orderNumber = orderNumber;
        this.size = size;
        this.colour = colour;

        if (this.size.equals("XXL") || this.size.equals("XXXL"))
            this.price = 22.99;
        else
            this.price = 19.99;
    }

    /**
     * Sets the orderNumber to the specified value
     *
     * @param orderNumber The order number.
     */
    public void setOrderNumber(int orderNumber)
    {
        this.orderNumber = orderNumber;
    }

    /**
     * Sets the TeeShirt size to the specified value.
     *
     * @param size The size of the TeeShirt.
     */
    public void setSize(String size)
    {
        this.size = size;
    }

    /**
     * Sets the TeeShirt's colour to the given value.
     *
     * @param colour The colour of the TeeShirt.
     */
    public void setColour(String colour)
    {
        this.colour = colour;
    }

    /**
     * This returns the orderNumber of the TeeShirt.
     *
     * @return The orderNumber.
     */
    public int getOrderNumber()
    {
        return orderNumber;
    }

    /**
     * This returns the size of the TeeShirt.
     *
     * @return The size.
     */
    public String getSize()
    {
        return size;
    }

    /**
     * This returns the colour of the TeeShirt.
     *
     * @return The colour.
     */
    public String getColour()
    {
        return colour;
    }

    /**
     * This returns the price of the TeeShirt.
     *
     * @return The price.
     */
    public double getPrice()
    {
        return price;
    }
}
