package Elementary_Programming;

import java.util.Scanner;

/*
	This is a program that reads in investment amount, annual interest rate, 
	and number of years, and displays the future investment value.
*/

public class FutureInvestmentValue
{
	public static void main(String... args)
	{
		// Creates a Scanner Object.
		Scanner input = new Scanner(System.in);

		// Reads in the investment amount.
		System.out.print("\nEnter investment amount: ");
		double investmentAmount = input.nextDouble();
		
		// Reads in the annual interest rate.
		System.out.print("\nEnter annual interest rate in percentage (e.g. 3 %): ");
		double annualInterestRate = input.nextDouble() / 100.0;
		
		// Calculates the monthly interest rate.
		double monthlyInterestRate = annualInterestRate / 12.0;
		
		// Reads in the number of years.
		System.out.print("\nEnter the number of years: ");
		int years = input.nextInt();
		
		// Calculates the future investment value.
		double futureInvestmentValue = investmentAmount * Math.pow(1 + monthlyInterestRate, years * 12);

		// Displays the result.
		System.out.printf("\nAccumulated value is: $ %.2f\n", futureInvestmentValue);
	}
}

