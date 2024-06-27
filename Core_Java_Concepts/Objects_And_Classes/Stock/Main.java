package Objects_And_Classes.Stock;

public class Main
{
    public static void main(String[] args)
    {
        // Creates a Stock Object.
        Stock stock = new Stock("ORCL", "Oracle Corporation");

        // Sets the previous price.
        stock.previousClosingPrice = 34.5;

        // Sets the current price.
        stock.currentPrice = 34.35;

        // Displays the Stock's details.
        System.out.println("\n\t\tStock Details");
        System.out.printf("\nStock Name: %s\n", stock.name);
        System.out.printf("\nSymbol: %s\n", stock.symbol);
        System.out.printf("\nPrevious Closing Price: $ %.2f\n", stock.previousClosingPrice);
        System.out.printf("\nCurrent Price: $ %.2f\n", stock.currentPrice);
        System.out.printf("\nPrice Change Percent: %.2f%%\n", stock.getChangePercent());
    }
}
