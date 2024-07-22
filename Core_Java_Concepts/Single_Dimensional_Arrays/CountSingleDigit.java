package Core_Java_Concepts.Single_Dimensional_Arrays;

public class CountSingleDigit
{
	public static void main(String[] args)
	{
		// Creates an array that can store 100 integers
		int[] num = new int[100];

		// Creates an array used to store the frequency of numbers.
		int[] frequency = new int[10];

		// Randomly generates 100 integers and store them in the array.
		for (int count = 0; count < num.length; count++)
		{
			num[count] = (int) (Math.random() * 10);
			++frequency[num[count]];
		}

		// Displays each number and the frequency of its occurrence.
		System.out.print("\nNumber\t\t\tFrequency\n");
		for (int count = 0; count < 10; count++)
			System.out.printf("%6d\t\t\t%9d\n", count, frequency[count]);
	}
}
