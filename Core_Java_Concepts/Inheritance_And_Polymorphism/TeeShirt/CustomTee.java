package Inheritance_And_Polymorphism.TeeShirt;

/**
 * The type Custom tee.
 */
public class CustomTee extends TeeShirt
{
    protected String slogan;

    /**
     * Instantiates a new CustomTee Object.
     *
     * @param orderNumber The order number.
     * @param size The CustomTee size.
     * @param colour The CustomTee colour.
     * @param slogan The CustomTee slogan
     */
    public CustomTee(int orderNumber, String size, String colour, String slogan)
    {
        super(orderNumber, size, colour);
        this.slogan = slogan;
    }

    /**
     * The returns the CustomTee's slogan.
     *
     * @return The slogan
     */
    public String getSlogan()
    {
        return slogan;
    }

    /**
     * Sets the CustomTee's slogan to the given value.
     *
     * @param slogan The slogan.
     */
    public void setSlogan(String slogan)
    {
        this.slogan = slogan;
    }
}
