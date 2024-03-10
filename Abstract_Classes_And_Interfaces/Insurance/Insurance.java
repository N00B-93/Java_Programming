package Abstract_Classes_And_Interfaces.Insurance;

public abstract class Insurance
{
    // Attributes of an Insurance Object.
    private String insuranceType;
    private double monthlyPrice;

    /**
     * Instantiates a new Insurance Object.
     *
     * @param insuranceType The insurance type.
     */
    public Insurance(String insuranceType)
    {
        this.insuranceType = insuranceType;
    }

    /**
     * This returns the monthly price.
     *
     * @return The monthly price
     */
    public double getMonthlyPrice()
    {
        return monthlyPrice;
    }

    /**
     * This returns the insurance type.
     *
     * @return The insurance type.
     */
    public String getInsuranceType()
    {
        return insuranceType;
    }

    /**
     * Sets the insurance monthly cost to a specific value.
     */
    public abstract void setCost();

    /**
     * Display information about an Insurance Object.
     */
    public abstract void display();
}
