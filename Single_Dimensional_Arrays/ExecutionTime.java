package Single_Dimensional_Arrays;

/*
*/

public class ExecutionTime
{
	public static void main(String... args)
	{
		// Creates an array of 100000000 integers.
		int[] array = new int[100000001];
		
		// Fills up the array with values from 1 to 100000000
		for (int i = 0; i < array.length; i++)
			array[i] = i + 1;


		long startTime = System.nanoTime();
		int index = linearSearch(1, array);
		long endTime = System.nanoTime();
		long executionTime = endTime - startTime;


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
	 * @return The index where the key was found, else returns the postion the key should be located.
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

