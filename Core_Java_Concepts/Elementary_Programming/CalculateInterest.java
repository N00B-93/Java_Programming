package Elementary_Programming;

import java.util.Scanner;

/*
    This is a program that reads the balance and the annual percentage interest rate and
    displays the interest for the next month.

    interest = balance * (annualInterestRate/1200)
 */

public class CalculateInterest
{
    public static void main(String[] args)
    {
        // Creates a Scanner Object.
        Scanner input = new Scanner(System.in);

        // Reads in the balance.
        System.out.print("\nEnter the balance: ");
        double balance = input.nextDouble();

        // Reads in the interest rate.
        System.out.print("\nEnter the interest rate in percentage (e.g., 3 for 3%):: ");
        double annualInterestRate = input.nextDouble() / 100;

        // Calculates the interest.
        double interest = balance * annualInterestRate / 12.0;

        // Displays the result.
        System.out.printf("\nThe Interest is %.2f\n", interest);
    }
}
