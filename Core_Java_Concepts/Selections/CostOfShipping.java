package Core_Java_Concepts.Selections;

import java.util.Scanner;

/*
 	This is a program that prompts the user to enter the weight of a package and displays the cost of shipping.
	The cost of shipping depends on the weight of the package as shown below;
			2.5, if 0 < w <= 2
		c(w) =	4.5, if 2 < w <= 4
			7.5, if 4 < w <= 10
			10 5, if 10 < w <= 20
	 If the weight is greater than 20, display a message “the package cannot be shipped.”
*/

public class CostOfShipping
{
	public static void main(String... args)
	{
		// Creates a Scanner Object.
		Scanner input = new Scanner(System.in);

		double shippingCost = 0.0;

		// Prompts the user to enter the weight of the package to be shipped.
		System.out.print("\nEnter the weight of the package to be shipped: ");
		double weight = input.nextDouble();

		// Displays an error message and terminates the program if the user input is less than 0.
		if (weight < 0)
		{
			System.out.println("\nWeight must be greater than 1!!!");
			System.exit(1);
		}
		else if (weight > 20)  // Terminates the program if package weight is > 20.
		{
			System.out.println("\nThe package cannot be shipped.");
			System.exit(2);
		}

		else if (weight > 0 && weight <= 2)  // Displays cost of shipping a package > 0 and <= 2.
		{
			shippingCost = 2.50;
			System.out.printf("\nAmount to ship package weighing %.2f Kg is: $ %.2f\n", weight, shippingCost);
		}
		else if (weight > 2 && weight <= 4)  // Displays cost of shipping a package > 2 and <= 4.
		{
			shippingCost = 4.5;
			System.out.printf("\nAmount to ship package weighing %.2f Kg is: $ %.2f\n", weight, shippingCost);
		}
		else if (weight > 4 && weight <= 10)  // Displays cost of shipping a package > 4 and <= 10.
		{
			shippingCost = 7.5;
			System.out.printf("\nAmount to ship package weighing %.2f Kg is: $ %.2f\n", weight, shippingCost);
		}
		else if (weight > 10 && weight <= 20)  // Displays cost of shipping a package > 10 and <= 20.
		{
			shippingCost = 10.5;
			System.out.printf("\nAmount to ship package weighing %.2f Kg is: $ %.2f\n", weight, shippingCost);
		}
	}
}

