package Core_Java_Concepts.Elementary_Programming;

import java.util.Scanner;

/*
	This program prompts the user to enter a meal charge and then computes the tax(6.75% of meal charge), tip(20% of the sum of meal charge and tax), 
	and the total bill(meal charge plus tax plus tip), then displays the receipt on the screen.
*/

public class RestaurantBill
{
	public static void main(String... args)
	{
		// Creates a Scanner Object.
		Scanner input = new Scanner(System.in);

		// Variables representing the tax and tip percentage.
		double taxPercent = 0.0675;
		double tipPercent = 0.2;

		// Prompts the user to enter the meal charge.
		System.out.print("\nEnter meal charge: $ ");
		double mealCharge = input.nextDouble();

		// Calculates the tax.
		double tax = taxPercent * mealCharge;

		// Computes the mealCharge with tax.
		double mealChargeAndTax = tax + mealCharge;

		// Calculates the tip.
		double tip = tipPercent * mealChargeAndTax;

		// Computes the total Bill.
		double totalBill = mealChargeAndTax + tip;

		// Displays the result.
		System.out.println("\n########################## Restaurant Bill ##########################");
		System.out.printf("\n\t\tMeal Charge: $ %.2f\n", mealCharge);
		System.out.printf("\n\t\tTax: $ %.2f\n", tax);
		System.out.printf("\n\t\tTip: $ %.2f\n", tip);
		System.out.printf("\n\t\tTotal Bill: $ %.2f\n", totalBill);
		System.out.println("##################################################################");
	}
}
