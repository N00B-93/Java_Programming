package Single_Dimensional_Arrays;

import java.util.Scanner;

/*
	This is a program that reads student scores, gets the best score,
	and then assigns grades based on the following scheme:
		Grade is A if score is >= best - 10
		Grade is B if score is >= best - 20;
		Grade is C if score is >= best - 30;
		Grade is D if score is >= best - 40;
		Grade is F otherwise
 */

public class StudentScores
{
	public static void main(String[] args)
	{
		// Creates a Scanner Object.
		Scanner input = new Scanner(System.in);

		// Prompts the user to enter the number of student's scores to be processed.
		System.out.print("\nEnter the number of students to process: ");
		int num = input.nextInt();

		// Array to store scores.
		double[] score = new double[num];

		// Reads in score into the score array.
		for (int count = 0; count < score.length; count++)
		{
			System.out.printf("\nEnter score of Student[%d]: ", count);
			score[count] = input.nextDouble();
		}

		// Determines the best score.
		double bestScore = getBest(score);

		// Displays each student's score and grade.
		for (int count = 0; count < score.length; count++)
		{
			System.out.printf("\nThe Score of student[%d] is: %.2f and grade is: %c\n", count, score[count],
					printGrade(score[count], bestScore));
		}

	}

	/**
	 * Returns the best score given a list of score.
	 *
	 * @param arr The array containing the scores
	 * @return The maximum score.
	 */
	public static double getBest(double[] arr)
	{
		double max = arr[0];

		for (int count = 0; count < arr.length; count++)
		{
			if (arr[count] > max)
				max = arr[count];
		}
		return (max);
	}

	/**
	 * Prints a grade for a given score..
	 *
	 * @param score The score whose grade is to be printed.
	 * @param best The best score
	 * @return The grade for a given score.
	 */
	public static char printGrade(double score, double best)
	{
		if (score >= (best - 10))
			return ('A');
		else if (score >= (best - 20))
			return ('B');
		else if (score >= (best - 30))
			return ('C');
		else if (score >= (best - 40))
			return ('D');
		else
			return ('F');
	}
}
