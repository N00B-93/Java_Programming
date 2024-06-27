package Single_Dimensional_Arrays;

import java.util.Scanner;

/*
	The bubble-sort algorithm makes several passes through the array. On each pass, successive neighboring pairs are compared. 
	If a pair is not in order, its values are swapped; otherwise, the values remain unchanged. The technique is called a 
	bubble sort or sinking sort because the smaller values gradually “bubble” their 
	way to the top, and the larger values “sink” to the bottom.
	This program used a method with the header;
			public static void bubbleSort(int... array)
	to sort an array of 10 numbers entered by the user in ascending order.
*/

public class BubbleSort
{
	public static void main(String... args)
	{
		// Creates a Scanner Object.
		Scanner input = new Scanner(System.in);

		// Creates an array of 10 integers.
		int[] array = new int[10];
		
		// Prompts the user to enter 10 integers.
		for (int i = 0; i < array.length; i++)
		{
			System.out.printf("\nEnter array[%d]: ", i);
			array[i] = input.nextInt();
		}
		
		// Sorts the array in ascending order.
		bubbleSort(array);

		// Displays the sorted array.
		System.out.print("\nThe array sorted in ascending order is: ");
		for (int i = 0; i < array.length; i++)
			System.out.printf("%d ", array[i]);
		System.out.println();
	}

	/**
	 * Sorts a list of integers in ascending order using the Bubble Sort Algorithm.
	 *
	 * @param array The array to be sorted.
	 *
	 * @return void.
	 */
	public static void bubbleSort(int... array)
	{
		int tempVar = 0;

		for (int pass = 0; pass < array.length; pass++)
			for (int i = 1; i < array.length; i++)
			{
				if (array[i] < array[i - 1])
				{
					tempVar = array[i];
					array[i] = array[i - 1];
					array[i - 1] = tempVar;
				}
			}
	}
}

