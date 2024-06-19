package Abstract_Classes_And_Interfaces.Investment;

public class MutualFunds extends Investment
{
    // Attributes of a MutualFund
    protected double pricePerShare, numberOfSharesOwned;

    /**
     * Instantiates a new MutualFund.
     *
     * @param name The name of the MutualFund.
     * @param pricePerShare The price per unit share.
     * @param numberOfSharesOwned The number of shares owned.
     */
    public MutualFunds(String name, double pricePerShare, int numberOfSharesOwned)
    {
        this.name = name;
        this.pricePerShare = pricePerShare;
        this.numberOfSharesOwned = numberOfSharesOwned;
    }

    /**
     * This returns the value of a MutualFund.
     *
     * @return The value of a MutualFund.
     */
    @Override
    public double getValue()
    {
        return this.numberOfSharesOwned * this.pricePerShare;
    }
}
