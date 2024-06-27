package Recursion;

import java.util.Scanner;
import java.util.Locale;
import java.text.NumberFormat;
import java.util.InputMismatchException;

/*
	This is a program that prompts the user to enter an amount to be deposited, the interest rate and the 
	number of years the amount will be invested and then display the amount invested plus the interest accrued using recursion.
*/

public class CompoundInterest
{
	public static void main(String... args)
	{
		// Creates a Scanner Object.
		Scanner input = new Scanner(System.in);

		while (true)
		{
			try
			{
				// Prompts the user to enter the amount to be deposited.
				System.out.print("\nEnter the amount to be invested: $ ");
				double amountToBeDeposited = input.nextDouble();

				// Prompts the user to enter the interest rate.
				System.out.print("\nEnter the interest rate(e.g. 3%): ");
				double interestRate = input.nextDouble();

				// Prompts the user to enter the number of years.
				System.out.print("\nEnter the number of Years: ");
				int numberOfYears = input.nextInt();

				if (amountToBeDeposited < 0 || interestRate < 0 || numberOfYears < 0)
				{
					System.out.println("\nInvalid input!!!\nThe amount to be deposited\nThe interest rate and\nThe number of years\nMust all be positive.");
					continue;
				}
				
				// Creates a NumberFormat Object to format the amount in dollars.
				NumberFormat unitedState = NumberFormat.getCurrencyInstance(Locale.US);

				// Displays the amount deposited plus the interest accrued after the number of years specified.
				System.out.println("\nThe amount after " + numberOfYears +  " years " +  "is: " + unitedState.format(compoundInterest(amountToBeDeposited, interestRate, numberOfYears)));
				break;
			}
			catch (InputMismatchException inputMismatchException)
			{
				System.out.println("\nInvalid input, Try again.");
			}
		}
	}
	
	/**
	 * This return the sum of an amount initially invested and the interest accrued through the investment years.
	 * @param amountDeposited The amount initially deposited.
	 * @param interestRate The interest rate.
	 * @param numberOfYears The number of years the amount is invested.
	 * @return The sum of the amount invested and the interest accrued over the investment years.
	 */
	public static double compoundInterest(double amountDeposited, double interestRate, int numberOfYears)
	{
		if (numberOfYears == 0)
			return amountDeposited;
		else
		{
			double interest = (amountDeposited * interestRate) / 100.0;

			double amount = interest + amountDeposited;
			return compoundInterest(amount, interestRate, --numberOfYears);
		}
	}
}
