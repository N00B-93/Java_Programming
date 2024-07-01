package Core_Java_Concepts.Abstract_Classes_And_Interfaces.GroceryStore;

public class UnitItem extends Item
{
    // Attribute of a UnitItem.
    protected int quantity;

    /**
     * Instantiates a new UnitItem.
     *
     * @param itemName The name of the UnitItem
     * @param unitPrice The unit price of the UnitItem.
     * @param quantity The number of available units of a UnitItem.
     */
    public UnitItem(String itemName, double unitPrice, int quantity)
    {
        super(itemName, unitPrice);
        this.quantity = quantity;
    }

    /**
     * This returns the available quantity of a UnitItem.
     *
     * @return The available quantity of a UnitItem.
     */
    public int getQuantity()
    {
        return quantity;
    }

    /**
     * Sets the UnitItem's quantity to the specified value.
     *
     * @param quantity The new quantity of the UnitItem.
     */
    public void setQuantity(int quantity)
    {
        this.quantity = quantity;
    }

    /**
     * This returns the cost of purchasing a certain quantity of a UnitItem.
     *
     * @return The cost of purchasing a certain quantity of a UnitItem.
     */
    public double cost()
    {
        return this.unitPrice * this.quantity;
    }
}
