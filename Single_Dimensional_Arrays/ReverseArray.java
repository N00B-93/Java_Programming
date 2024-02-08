package Single_Dimensional_Arrays;

import java.util.Scanner;

/*
	This is a program that prompts the user to enter 10 integer elements for an array and then
	reverses the array.
 */

public class ReverseArray
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int[] numbers = new int[10];

		for (int count = 0; count < numbers.length; count++)
		{
			System.out.printf("\nEnter number[%d]: ", count);
			numbers[count] = input.nextInt();
		}


		System.out.print("\nArray before: ");
		for (int count = 0; count < numbers.length; count++)
			System.out.printf("%d ", numbers[count]);


		System.out.print("\nArray After: ");
		for (int count = numbers.length - 1; count >= 0; count--)
			System.out.printf("%d ", numbers[count]);
		
		System.out.print("\n\n");
	}
}
