package Core_Java_Concepts.Single_Dimensional_Arrays;

/*
	This is a program that creates an array of integers from 1 to 100,000,000 in ascending order and then
	calculates the execution time for invoking the methods;
				public static int linearSearch(int key, int... array)
			and
				public static int binarySearch(int key, int... array)
	to search for the numbers;
				0; 25,000,000; 50,000,000; 75,000,000; 100,000,000.
*/

public class ExecutionTime
{
	public static void main(String... args)
	{
		// Creates an array of 100000000 integers.
		int[] array = new int[100000001];
		
		// Fills up the array with values from 1 to 100000000
		for (int i = 0; i < array.length; i++)
			array[i] = i;

		// Searches for specified keys using Linear search Algorithm.
		System.out.println("\n\t\tUsing Linear Search");
		for (int key = 0; key <= 100000001; key += 25000000)
		{
			long startTime = System.nanoTime();
			int index = linearSearch(key, array);
			long endTime = System.nanoTime();
			long executionTime = endTime - startTime;

			System.out.printf("Key = %d\nIndex Found = %d\nExecution time = %dns\n\n", key, index, executionTime);
		}

		// searches for a specified key using Binary Search Algorithm.
		System.out.println("\n\t\tUsing Binary Search");
		for (int key = 0; key <= 100000001; key += 25000000)
		{
			long startTime = System.nanoTime();
			int index = binarySearch(key, array);
			long endTime = System.nanoTime();
			long executionTime = endTime - startTime;

			System.out.printf("Key = %d\nIndex Found = %d\nExecution time = %dns\n\n", key, index, executionTime);
		}
	}

	/**
	 * Searches for a value in an array using the Linear Search Algorithm.
	 *
	 * @param array The array containing values.
	 * @param key The value to search for
	 *
	 * @return The index where the key was found, else return -1.
	 */
	public static int linearSearch(int key, int... array)
	{
		for (int i = 0; i < array.length; i++)
		{
			if (array[i] == key)
				return i;
		}
		return -1;
	}

	/**
	 * Searches for a value in a sorted array using the Binary Search Algorithm.
	 *
	 * @param array The array containing values.
	 * @param key The value to be searched for.
	 *
	 * @return The index where the key was found, else returns the position the key should be located.
	 */
	public static int binarySearch(int key, int... array)
	{
		int low = 0, high = array.length - 1;

		while (low <= high)
		{
			int mid = (high + low) / 2;
			if (key < array[mid])
				high = mid - 1;
			else if (key == array[mid])
				return mid;
			else
				low = mid + 1;
		}
		return -low -1;
	}
}
