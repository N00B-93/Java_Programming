package Elementary_Programming;

import java.util.Scanner;

/*
	This program prompts the user to enter a meal charge and then computes the tax(6.75% of meal charge), tip(20% of the sum of meal charge and tax), 
	and the total bill(meal charge plus tax plus tip), then displays the receipt on the screen.
*/

public class ResturantBill
{
	public static void main(String... args)
	{
		// Creates a Scanner Object.
		Scanner input = new Scanner(System.in);

		// Prompts the user to enter the meal charge.
		System.out.print("\nEnter meal charge: $ ");
		double mealCharge = input.nextDouble();

		// Calculates the tax.
		double tax = 0.0675 * mealCharge;

		// Computes the mealCharge with tax.
		double mealChargeAndTax = tax + mealCharge;

		// Calculates the tip.
		double tip = 0.2 * mealChargeAndTax;

		// Computes the total Bill.
		double totalBill = mealChargeAndTax + tip;

		// Displays the result.
		System.out.println("##########################Resturant Bill##########################");
		System.out.printf("\n\t\tMeal Charge: $ %.2f\n", mealCharge);
		System.out.printf("\n\t\tTax: $ %.2f\n", tax);
		System.out.printf("\n\t\tTip: $ %.2f\n", tip);
		System.out.printf("\n\t\tTotal Bill: $ %.2f\n", totalBill);
		System.out.println("##################################################################");
	}
}

