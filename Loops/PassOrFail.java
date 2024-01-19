//package Loops;

import java.util.Scanner;

/*	This is a program that prompts a student to enter a score. If the 
	score is greater or equal to 60 and less than or equal to 100, display “you pass the exam”; otherwise, display “you don’t pass the exam”. Your program ends with input -1.
*/

public class PassOrFail
{
	public static void main(String... args)
	{
		// Creates a Scanner Object.
		Scanner input = new Scanner(System.in);
		
		// Reads in a score.
		System.out.print("\nEnter a score: ");
		double score = input.nextDouble();
		
		// Loop that terminates when user enters -1.
		while (score != -1) 
		{
			
			// Checks whether the score is >= 60 and <= 100.
			if (score >= 60 && score <= 100)
				System.out.println("\nYou passed the exam!");
			// Checks whether the score is less than 60.
			else if (score < 60)
				System.out.println("\nYou failed the exam!");
			// Informs the user to enter score between 1 to 100 if score > 100.
			else if (score > 100)
				System.out.println("\nEnter a score from 1 to 100.");

			// Reads in a Score.
			System.out.print("\nEnter a score: ");
			score = input.nextDouble();
		}
	}
}

