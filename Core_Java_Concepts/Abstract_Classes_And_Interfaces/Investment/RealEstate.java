package Core_Java_Concepts.Abstract_Classes_And_Interfaces.Investment;

public class RealEstate extends Investment
{
    // Attributes of a RealEstate.
    protected double purchasePrice, currentAssessedValue;
    protected String addressOfProperty;

    /**
     * Instantiates a new RealEstate.
     *
     * @param name The name of the Investment.
     * @param addressOfProperty The address of a Property.
     * @param purchasePrice The amount at which a property was purchased.
     * @param currentAssessedValue The current value of a Property.
     */
    public RealEstate(String name, String addressOfProperty, double purchasePrice, double currentAssessedValue)
    {
        this.name = name;
        this.purchasePrice = purchasePrice;
        this.currentAssessedValue = currentAssessedValue;
        this.addressOfProperty = addressOfProperty;
    }

    /**
     * This returns the value of a RealEstate.
     *
     * @return The value of a RealEstate.
     */
    @Override
    public double getValue()
    {
        return this.currentAssessedValue;
    }

    /**
     * Displays the Information about a RealEstate Object.
     */
    public void displayData()
    {
        System.out.println("Investment Name: " + this.name + "\nAddress Of Property: " + this.addressOfProperty +
                "\nPurchased Price: $" + this.purchasePrice + "\nCurrent Assessed Value: $" + this.currentAssessedValue);
    }
}

