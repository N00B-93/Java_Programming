package Elementary_Programming;

import java.util.Scanner;

/*
	A cookie recipe calls for the following ingredients:
		•	1.5	cups	of	sugar
		• 	1	cup	of	butter
		•	2.75 	cups	of	flour
The recipe produces 48 cookies with these amounts of the ingredients.
	This is program that asks the user how many cookies he or she wants to make, and then displays the number of cups of
	each ingredient needed for the specified number of cookies.
*/

public class IngredientAdjuster
{
	public static void main(String... args)
	{
		// Creates a Scanner Object.
		Scanner input = new Scanner(System.in);

		// Prompts the user to enter the number of cookies he/she wants to make.
		System.out.print("\nEnter the number of cookies to be baked: ");
		int numberOfCookies = input.nextInt();
		
		// Determines the quantity of sugar, butter and flour for one cookie.
		double quantityOfSugarForOneCookie = 1.5 / 48;
		double quantityOfButterForOneCookie = 1.0 / 48;
		double quantityOfFlourForOneCookie = 2.75 / 48;

		// Displays the quantity of ingredients required to bake the numbwr of cookies entered by the user.
		System.out.printf("\nIngredients required to bake %d cookies:", numberOfCookies);
		System.out.printf("\n%.2f cups of sugar", quantityOfSugarForOneCookie * numberOfCookies);
		System.out.printf("\n%.2f cups of butter", quantityOfButterForOneCookie * numberOfCookies);
		System.out.printf("\n%.2f cups of flour\n", quantityOfFlourForOneCookie * numberOfCookies);
	}
}

