package Core_Java_Concepts.Abstract_Classes_And_Interfaces.GroceryStore;

import java.util.Random;

public class WeightItem extends Item
{
    // Attributes of a WeightItem.
    protected double weight;

    /**
     * Instantiates a new WeightItem.
     *
     * @param itemName The name of the WeightItem
     * @param unitPrice The price per pound of the WeightItem.
     */
    public WeightItem(String itemName, double unitPrice)
    {
        super(itemName, unitPrice);

        Random random = new Random();
        this.weight = scale();
    }

    /**
     * Generate weight for a WeightItem.
     *
     * @return The weight of a WeightItem.
     */
    private double scale()
    {
        Random random = new Random();

        double scaledWeight = random.nextDouble() * (4.00 - 0.01) + 0.01;

        return Math.round(scaledWeight * 100.0) / 100.0;
    }

    /**
     * This returns the cost of purchasing a certain amount of a WeightItem.
     *
     * @return The cost of purchasing a certain quantity of a WeightItem.
     */
    public double cost()
    {
        return this.weight * this.unitPrice;
    }
}
