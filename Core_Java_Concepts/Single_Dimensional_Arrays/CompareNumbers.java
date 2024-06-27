package Single_Dimensional_Arrays;

import java.util.Scanner;

/*
	This is a program that reads 11 integers, compares each 
	integer with the 11th integer, and displays whether the integers are “greater”, 
	“smaller”, or “equal” to the 11th integer.
*/

public class CompareNumbers
{
	public static void main(String... args)
	{
		// Creates a Scanner Object.
		Scanner input = new Scanner(System.in);

		// Creates an array of 11 integers.
		int[] numbers = new int[11];

		// Reads in 11 integers.
		for (int i = 0; i < numbers.length; i++)
		{
			System.out.printf("\nEnter numbers[%d]: ", i + 1);
			numbers[i] = input.nextInt();
		}
		
		// Compares each number in the array with the 11th element.
		compareNumbers(numbers);
	}

	/**
	 * Compares elements in an array of integers with the last element in the array
	 * and displays whether they are less than, equal to or greater than the last element.
	 *
	 * @param numbers The array of integers to be processed.
	 *
	 */
	public static void compareNumbers(int[] numbers)
	{
		for (int i = 0; i < numbers.length - 1; i++)
		{
			if (numbers[i] < numbers[numbers.length - 1])
				System.out.printf("\n%d is less than %d", numbers[i], numbers[numbers.length - 1]);
			else if (numbers[i] == numbers[numbers.length - 1])
				System.out.printf("\n%d is equal to %d", numbers[i], numbers[numbers.length - 1]);
			else if (numbers[i] > numbers[numbers.length - 1])
				System.out.printf("\n%d is greater than %d", numbers[i], numbers[numbers.length - 1]);
		}
		System.out.println();
	}
}

