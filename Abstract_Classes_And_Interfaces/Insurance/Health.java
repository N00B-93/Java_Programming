package Abstract_Classes_And_Interfaces.Insurance;

/**
 * The type Health.
 */
public class Health extends Insurance
{
    /**
     * Instantiates a new Health Insurance Object.
     */
    public Health()
    {
        super("Health");
        this.setCost();
    }

    /**
     * Sets the Monthly cost of the Health Insurance Object to $ 36.00.
     */
    @Override
    public void setCost()
    {
        this.monthlyPrice = 36.0;
    }

    /**
     * Displays the information of a Health Insurance Object.
     */
    @Override
    public void display()
    {
        System.out.printf("\nInsurance Type: %s\nMonthly Cost: $ %.2f\n", this.getInsuranceType(), this.getMonthlyPrice());
    }
}
