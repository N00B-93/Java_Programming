package Single_Dimensional_Arrays;

/*
	This is a program that implements the Binary search Algorithm to search for
	a key in an array.
 */

public class BinarySearch
{
	public static void main(String[] args)
	{
		// creates an array of integers.
		int[] array = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};

		// displays the index of a specified key in the array.
		System.out.printf("\nThe key is found at index: %d\n", binarySearch(array, 100));
	}

	/**
	 * Searches for an element in an array using the Binary Search Algorithm.
	 *
	 * @param array The array containing the numbers.
	 * @param key The key to search for in the array.
	 * @return The index of the key if found in the array, else if the key is not found, the position where it should be
	 * located is returned.
	 */
	public static int binarySearch(int[] array, int key)
	{
		int low = 0, high = array.length - 1;
		while (high >= low)
		{
			int mid = (low + high) / 2;
			if (array[mid] > key)
				high = mid - 1;
			else if (key == array[mid])
				return (mid);
			else
				low = mid + 1;
		}
		return (-low -1);
	}
}
