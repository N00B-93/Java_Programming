package Single_Dimensional_Arrays;

import java.util.Scanner;
import java.util.Arrays;

/*
	This is a program that uses the method with the header;
				public static int[] merge(int[] list1, int[] list2)
	to merge two arrays entered by the user.
 */

public class MergeSortedList
{
	public static void main(String[] args)
	{
		// Creates a Scanner Object.
		Scanner input = new Scanner(System.in);

		// reads in the length of the first array.
		System.out.printf("\nEnter the length of arr1: ");
		int length1 = input.nextInt();

		// Reads in the length of the second array.
		System.out.printf("\nEnter the length of arr2: ");
		int length2 = input.nextInt();

		// Determines the length of the array that will contain the first and second array.
		int length = length1 + length2, count = 0;

		// creates three array Objects.
		int[] arr1 = new int[length1];
		int[] arr2 = new int[length2];
		int[] arr = new int[length];

		// Reads in the elements of the first array.
		for (; count < arr1.length; count++)
		{
			System.out.printf("\nEnter arr1[%d]: ", count);
			arr1[count] = input.nextInt();
		}

		// Reads in the elements of the second array.
		for (count = 0; count < arr2.length; count++)
		{
			System.out.printf("\nEnter arr2[%d]: ", count);
			arr2[count] = input.nextInt();
		}

		// Sorts the first and second array
		Arrays.sort(arr1);
		Arrays.sort(arr2);

		// Merges the two arrays
		arr = merge(arr1, arr2);
		// Sorts the merged array.
		Arrays.sort(arr);

		// Displays the merged array.
		System.out.print("\nThe Merged Array is: ");
		for (count = 0; count < arr.length; count++)
			System.out.printf("%d ", arr[count]);
			System.out.println();
	}


	/**
	 * Merge two integer arrays.
	 *
	 * @param array1 The first array.
	 * @param array2 The second array.
	 * @return An array consisting of the two arrays.
	 */
	public static int[] merge(int[] array1, int[] array2)
	{
		int count = 0;
		int[] container = new int[array1.length + array2.length];

		for (; count < array1.length; count++)
			container[count] = array1[count];

		for (int count1 = 0; count1 < array2.length; count1++, count++)
			container[count] = array2[count1];

		return container;
	}
}
