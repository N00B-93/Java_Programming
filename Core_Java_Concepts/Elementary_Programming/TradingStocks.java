package Core_Java_Concepts.Elementary_Programming;

import java.util.Locale;
import java.util.Scanner;
import java.text.NumberFormat;

/**
    This is a program that allows a user to input the number of shares sold, the purchase price of each share, and the selling
    price of each share. The program outputs the amount invested, the total service charges, amount gained or lost, and the amount received after selling the stock.
    NB: Service charge is 1.5% of each transaction.
 */

public class TradingStocks
{
    public static void main(String[] args)
    {
        // Creates a NumberFormat Object to format currency in $.
        NumberFormat currency = NumberFormat.getCurrencyInstance(Locale.US);

        // Creates a Scanner Object.
        Scanner console = new Scanner(System.in);

        // The service charge.
        final double SERVICE_CHARGE_PERCENTAGE = 0.015;

        // Prompts the user to enter the number of shares sold.
        System.out.print("\nEnter the number of shares sold: ");
        double numberOfSharesSold = console.nextDouble();

        // Prompts the user to enter the selling price of each share.
        System.out.print("\nEnter the price of each share: $ ");
        double priceOfEachShare = console.nextDouble();

        // Prompts the user to enter the selling price of each share.
        System.out.print("\nEnter the selling price of each share: $ ");
        double sellingPrice = console.nextDouble();

        // Closes the Scanner Object.
        console.close();

        // Calculates the amount invested.
        double amountInvested = numberOfSharesSold * priceOfEachShare;

        // Calculates the service charge.
        double serviceCharge = SERVICE_CHARGE_PERCENTAGE * amountInvested;

        // Calculate the profit or loss.
        double profitOrLoss = (numberOfSharesSold * sellingPrice) - amountInvested;

        // Calculates the amount received.
        double amountReceived = numberOfSharesSold * sellingPrice - serviceCharge;

        // Displays the amount invested.
        System.out.println("\nAmount Invested: " + currency.format(amountInvested));

        // Displays the total service charge.
        System.out.println("Total Service Charge: " + currency.format(serviceCharge));

        // Displays the profit or loss.
        System.out.println("Profit or Loss: " + currency.format(profitOrLoss));

        // Displays the amount received by the user after the sale.
        System.out.println("Amount Received: " + currency.format(amountReceived));
    }   
}
