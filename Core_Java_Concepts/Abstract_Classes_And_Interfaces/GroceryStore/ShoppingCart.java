package Core_Java_Concepts.Abstract_Classes_And_Interfaces.GroceryStore;

import java.util.ArrayList;

public class ShoppingCart
{
    // Attribute of a ShoppingCart.
    protected ArrayList<Item> items;

    /**
     * Instantiates a new ShoppingCart.
     *
     * @param items An ArrayList representing Items in the ShoppingCart.
     */
    public ShoppingCart(ArrayList<Item> items)
    {
        this.items = items;
    }

    /**
     * This returns a list of Items in the ShoppingCart.
     *
     * @return The list of Items in the ShoppingCart.
     */
    public ArrayList<Item> getItems()
    {
        return this.items;
    }

    public void clearCart()
    {
        double totalAmount = 0.0;

        for (Item item: this.items)
            totalAmount += item.cost();

        System.out.printf("\nThe total cost of all Items in the cart: $%.2f\n", totalAmount);
    }
}
