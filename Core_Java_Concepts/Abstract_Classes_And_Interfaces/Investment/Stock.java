package Abstract_Classes_And_Interfaces.Investment;

public class Stock extends Investment
{
    // Attributes of a Stock.
    protected double pricePerShare, dividend;
    protected int numberOfSharesOwned;
    protected final double DIVIDEND_PERCENT = 0.05;

    /**
     * Instantiates a new Stock Object.
     *
     * @param name The name of a Stock.
     * @param pricePerShare The price per share.
     * @param numberOfSharesOwned The number of available shares owned.
     * @param dividend Percentage of the investment paid annually.
     */
    public Stock(String name, double pricePerShare, int numberOfSharesOwned, double dividend)
    {
        this.name = name;
        this.pricePerShare = pricePerShare;
        this.numberOfSharesOwned = numberOfSharesOwned;
        this.dividend = this.getDividend();
    }

    /**
     * This returns the value of a Stock.
     *
     * @return The value of a Stock.
     */
    @Override
    public double getValue()
    {
        return this.numberOfSharesOwned * this.pricePerShare;
    }

    /**
     * This returns the dividend of a Stock.
     *
     * @return The dividend of a Stock.
     */
    public double getDividend()
    {
        return this.DIVIDEND_PERCENT * getValue();
    }

    /**
     * Displays information about a Stock.
     */
    public void displayData()
    {
        System.out.println("\nName: " + this.name  + "\nPrice Per Share: $" + this.pricePerShare +
                "\nNumber of Shares Owned: " + this.numberOfSharesOwned + "\nDividend: $" + this.dividend +
                "\nValue of Investment: $" + this.getValue());
    }
}
