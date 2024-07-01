package Core_Java_Concepts.Abstract_Classes_And_Interfaces.GroceryStore;

public abstract class Item
{
    // Attributes of the Item class.
    protected  String itemName;
    protected double unitPrice;

    /**
     * Instantiates a new Item
     *
     * @param itemName The name of the Item.
     * @param unitPrice The unit price of the Item.
     */
    public Item(String itemName, double unitPrice)
    {
        this.itemName = itemName;
        this.unitPrice = unitPrice;
    }

    /**
     * This returns the name of the Item.
     *
     * @return The name of the Item.
     */
    public String getItemName()
    {
        return this.itemName;
    }

    /**
     * Sets the Item's name to the specified value.
     *
     * @param itemName The new Item name.
     */
    public void setItemName(String itemName)
    {
        this.itemName = itemName;
    }

    /**
     * This returns the unit price of the Item.
     *
     * @return The unit price of the Item.
     */
    public double getUnitPrice()
    {
        return this.unitPrice;
    }

    /**
     * Sets the Item's unit price to the specified value.
     *
     * @param unitPrice The new Item unit price.
     */
    public void setUnitPrice(double unitPrice)
    {
        this.unitPrice = unitPrice;
    }

    // Abstract method that determines the cost of an Item.
    public abstract double cost();
}
