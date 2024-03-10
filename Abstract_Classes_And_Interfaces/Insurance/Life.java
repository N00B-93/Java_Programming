package Abstract_Classes_And_Interfaces.Insurance;

/**
 * The type Life.
 */
public class Life extends Insurance
{
    public Life()
    {
        super("Life");
        this.setCost();
    }

    /**
     * Sets the Monthly cost of the Health Insurance Object to $ 196.00.
     */
    @Override
    public void setCost()
    {
        this.monthlyPrice = 196.0;
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
