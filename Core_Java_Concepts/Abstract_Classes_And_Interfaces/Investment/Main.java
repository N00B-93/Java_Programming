package Abstract_Classes_And_Interfaces.Investment;

import Abstract_Classes_And_Interfaces.Investment.BankAccount.*;
import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        // Create investments
        MutualFunds mutualFunds1 = new MutualFunds("Vanguard Total Stock Market", 150.0, 50);
        MutualFunds mutualFunds2 = new MutualFunds("Fidelity Magellan Fund", 200.0, 30);

        RealEstate realEstate1 = new RealEstate("Luxury Condo", "123 Main St", 500000.0, 550000.0);
        RealEstate realEstate2 = new RealEstate("Rental Property", "456 Elm St", 300000.0, 320000.0);

        Stock stock1 = new Stock("Apple Inc.", 175.0, 100, 1.5);
        Stock stock2 = new Stock("Microsoft Corporation", 210.0, 80, 2.0);

        CheckingAccount checkingAccount = new CheckingAccount("John Doe", "1234567890", 5000.0, 1000.0, 50.0, 3.0);
        SavingsAccount savingsAccount = new SavingsAccount("Jane Smith", "0987654321", 10000.0, 0.75);

        // Create portfolio and add investments
        ArrayList<Investment> investments = new ArrayList<>();
        investments.add(mutualFunds1);
        investments.add(mutualFunds2);
        investments.add(realEstate1);
        investments.add(realEstate2);
        investments.add(stock1);
        investments.add(stock2);
        investments.add(checkingAccount);
        investments.add(savingsAccount);

        // Creates a PortFolio Object.
        PortFolio portfolio = new PortFolio(investments);

        // Display data for each Investment
        System.out.println("Investment Details:");
        for (Investment investment : investments)
        {
            investment.displayData();
            System.out.println();
        }

        // Calculate and display net value of portfolio
        double netValue = portfolio.getNetValue();
        System.out.println("\nNet Value of Portfolio: $" + netValue);
    }
}
