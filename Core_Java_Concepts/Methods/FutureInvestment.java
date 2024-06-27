package Methods;

import java.util.Scanner;

/*
    This is a program that prompts the user to enter investment amount (e.g.,
    1000) and the interest rate (e.g., 9%) and prints a table that displays future value
    for the years from 1 to 30 using a method with the header;
                public static double futureInvestmentValue(double investmentAmount,
                double monthlyInterestRate, int years)
    which computes future investment value at a given interest rate for a specified number
    of years to
 */

public class FutureInvestment
{
    public static void main(String[] args)
    {
        // Creates a Scanner Object.
        Scanner input = new Scanner(System.in);

        // Reads in the investment amount.
        System.out.printf("\nEnter an amount to be invested $: ");
        double investmentAmount = input.nextDouble();

        // Reads in the investment rate.
        System.out.print("\nEnter the interest rate(e.g., 9%): ");
        double interestRate = input.nextDouble() / 100;

        // Calculates the monthly interest rate.
        double monthlyInterestRate = interestRate / 12;

        // Calculates the future investment value and displays the result in a tabular form.
        System.out.println("\nYear\tFuture Value");
        for (int year = 1; year <= 30; year++)
            System.out.printf("%d\t\t%.2f\n", year, futureInvestmentValue(investmentAmount, monthlyInterestRate, year));
    }

    /**
     * Calculates the future investment value for a specified investment amount, monthly interest rate and year.
     *
     * @param investmentAmount The amount to be invested.
     * @param monthlyInterestRate The monthly interest rate.
     * @param years The number of years in which a specified amount is invested.
     *
     * @return The future investment value.
     */
    public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years)
    {
        return investmentAmount * Math.pow(1 + monthlyInterestRate, 12 * years);

    }
}
