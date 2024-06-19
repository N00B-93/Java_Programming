package Abstract_Classes_And_Interfaces.Investment;

public class RealEstate extends Investment
{
    // Attributes of a RealEstate.
    protected double purchasePrice, currentAssessedValue;
    protected String addressOfProperty;

    /**
     * Instantiates a new RealEstate.
     *
     * @param name The type of investment.
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
}

