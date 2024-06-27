package Objects_And_Classes.Stock;

public class Stock
{
    // Attributes of a Stock.
    public String symbol, name;
    public double previousClosingPrice, currentPrice;

    /**
     * Instantiates a Stock Object.
     *
     * @param symbol The Stock symbol.
     *
     * @param name The Stock name.
     */
    public Stock(String symbol, String name)
    {
        this.symbol = symbol;
        this.name = name;
    }

    /**
     * This returns the percentage changed from previousClosingPrice to currentPrice.
     *
     * @return The percentage changed from previousClosingPrice to currentPrice.
     */
    public double getChangePercent()
    {
        return Math.abs((this.previousClosingPrice - this.currentPrice) / this.previousClosingPrice) * 100;
    }
}
