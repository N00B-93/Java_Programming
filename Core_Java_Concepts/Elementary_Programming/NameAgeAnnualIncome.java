package Elementary_Programming;

import java.util.Scanner;

/*
	This is a program that prompts the user to enter his/her name, age and desired income and then display this
	information in form of a comprehension.
*/

public class NameAgeAnnualIncome
{
	public static void main(String... args)
	{
		// Creates a Scanner Object.
		Scanner input = new Scanner(System.in);

		// Prompts the user to enter his/her name.
		System.out.print("\nEnter Name: ");
		String name = input.nextLine();

		// Prompts the user to enter his/her age.
		System.out.print("\nEnter Age: ");
		int age = input.nextInt();

		// Prompts the user to enter his/her desired annual income.
		System.out.print("\nEnter desired Income: ");
		double desiredIncome = input.nextDouble();
		
		// Displays the user's name, age and desired income.
		System.out.printf("\nMy name is %s, my age is %d and\nI hope to earn $ %.2f per year.\n", name, age, desiredIncome);
	}
}
