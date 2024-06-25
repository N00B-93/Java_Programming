package Abstract_Classes_And_Interfaces;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException;

/**
	This is a program that prompts the user to enter a list of numbers, adds them to an ArrayList
	and determines the average of the numbers by using a method with the header;
			public static double getAverage(ArrayList<Integer> numbers);
*/

public class AverageOfArrayList
{
	public static void main(String... doYourBest)
	{
		// Creates a Scanner Object.
		Scanner console = new Scanner(System.in);

		// Creates an ArrayList to Store integers.
		ArrayList<Integer> numbers = new ArrayList<>();

		while (true)
		{
			try
			{
				// Prompts the user to enter an integer.
				System.out.print("\nEnter an Integer: ");
			
				numbers.add(console.nextInt());

				// Prompts the user to choose either to add more integers or exit.
				System.out.print("\nWould you like to add more numbers('y', 'n')? ");
				if (console.next().charAt(0) == 'y')
					continue;
				else
					break;
			}
			catch (InputMismatchException ex)
			{
				System.out.println("\nError: Use Integers only, Try again.");
				console.nextLine();
				continue;
			}
		}
			// Displays the average of the integers in the list.
			System.out.printf("\nAverage = %.2f\n", getAverage(numbers));
	}

	/**
 	* Determines the average of an ArrayList of integers.
 	*
 	* @param numbers An ArrayList of numbers.
 	* @return The average of numbers in an ArrayList.
 	*/
	public static double getAverage(ArrayList<Integer> numbers)
	{
		int sumOfNumbers = 0;

		for (int number: numbers)
			sumOfNumbers += number;

		return sumOfNumbers / (double) numbers.size();
	}
}

