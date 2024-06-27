package Objects_And_Classes.Sandwich;

public class Sandwich
{
    // Attributes of a Sandwich.
    private String mainIngredient;  // The main ingredient in a Sandwich, e.g, Tuna.
    private String breadType;  // The type of bread used to make a Sandwich, e.g., Wheat.
    private double price;  // The price of a Sandwich.

    // No-arg constructor.
    public Sandwich(){}

    /**
     * Instantiates a new Sandwich.
     *
     * @param mainIngredient The main ingredient in a Sandwich, e.g, Tuna.
     * @param breadType The type of bread used to make a Sandwich, e.g., Wheat.
     * @param price The price of a Sandwich.
     */
    public Sandwich(String mainIngredient, String breadType, double price)
    {
        this.mainIngredient = mainIngredient;
        this.breadType = breadType;
        this.price = price;
   }

    /**
     * This returns the main ingredient in a Sandwich.
     *
     * @return A Sandwich's main ingredient.
     */
    public String getMainIngredient()
    {
        return this.mainIngredient;
    }

    /**
     * Sets a Sandwich's main ingredient to the specified value.
     *
     * @param mainIngredient The Sandwich's new main ingredient.
     */
    public void setMainIngredient(String mainIngredient)
    {
        this.mainIngredient = mainIngredient;
    }

    /**
     * This returns the type of bread used to make a Sandwich.
     *
     * @return The type of bread used to make a Sandwich.
     */
    public String getBreadType()
    {
        return this.breadType;
    }

    /**
     * Sets a Sandwich's bread type to the specified value.
     *
     * @param breadType The Sandwich's new bread type.
     */
    public void setBreadType(String breadType)
    {
        this.breadType = breadType;
    }

    /**
     * This returns a Sandwich's price.
     *
     * @return A Sandwich's price.
     */
    public double getPrice()
    {
        return this.price;
    }

    /**
     * Sets a Sandwich's price to the specified value.
     *
     * @param price The Sandwich's new price.
     */
    public void setPrice(double price)
    {
        this.price = price;
    }
}
