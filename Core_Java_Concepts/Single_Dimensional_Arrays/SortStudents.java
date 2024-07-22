package Core_Java_Concepts.Single_Dimensional_Arrays;

import java.util.Scanner;

/*
	This is a program that prompts the user to enter the number of students,
	the students’ names, and their scores, and prints student names and scores in decreasing
	order of their scores.
 */

public class SortStudents
{
	public static void main(String[] args)
	{
		// Creates a Scanner Object.
		Scanner input = new Scanner(System.in);

		// Variable to temporary store student's name.
		String tempName;

		// Reads in the number of student's to be processed.
		System.out.print("\nEnter the number of students: ");
		int numOfStudents = input.nextInt();

		// Creates two arrays to store scores and names.
		int[] scores = new int[numOfStudents];
		String[] names = new String[numOfStudents];

		// reads in student's names and scores.
		for (int count = 0; count < numOfStudents; count++)
		{
			System.out.printf("\nEnter scores[%d]: ", count);
			scores[count] = input.nextInt();
			input.nextLine();

			System.out.printf("\nEnter names[%d]: ", count);
			names[count] = input.nextLine();
		}

		// Sorts the students names and scores in descending order.
		for (int pass = 0; pass < numOfStudents - 1; pass++)
		{
			for (int i = 0; i < numOfStudents - 1; i++)
			{
				if (scores[i + 1] > scores[i])
				{
					int temp = scores[i + 1];
					scores[i + 1] = scores[i];
					scores[i] = temp;

					tempName = names[i + 1];
					names[i + 1] = names[i];
					names[i] = tempName;
				}
			}
		}

		// Displays the student's names and scores in descending order.
		System.out.print("\nNames\t\t\tScores\n");
		for (int j = 0; j < numOfStudents; j++)
			System.out.printf("\n%-15s%7d\n", names[j], scores[j]);

		System.out.println("\n");
	}
}
