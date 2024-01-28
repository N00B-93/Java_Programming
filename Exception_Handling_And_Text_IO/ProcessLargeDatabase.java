package Exception_Handling_And_Text_IO;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/*
	This is a program that reads professors details	from a file 'Salary.txt' and displays the total salary
	for assistant professors, associate professors, and full professors respectively, and also displays
	the average salary for assistant professors, associate professors, and full professors, respectively
*/

public class ProcessLargeDatabase
{
	public static void main(String... args)
	{
		try
		{
			// Creates a file Object.
			File file = new File("Salary.txt");

			// Creates a Scanner Object.
			Scanner input = new Scanner(file);

			// Creates an array to hold the detail of each professor.
			String[] details = new String[4];

			// Initializes variables to hold professor salaries.
			double associateSalary = 0, assistantSalary = 0, fullProfessorSalary = 0;

			// Initializes variables to count types of professors.
			int assistantCounter = 0, associateCounter = 0, fullTimeCounter = 0;

			// Reads data from the Salary.txt file, calculate the sum of professors salaries,
			// and count the number of professors in the salaries database.
			while (input.hasNext())
			{
				details = input.nextLine().split(" ");
				if (details[2].equals("assistant"))
				{
					assistantSalary += Double.valueOf(details[3]);
					assistantCounter++;
				}
				else if (details[2].equals("associate"))
				{
					associateSalary += Double.valueOf(details[3]);
					associateCounter++;
				}
				else if (details[2]. equals("full"))
				{
					fullProfessorSalary += Double.valueOf(details[3]);
					fullTimeCounter++;
				}
			}

			// Display the total and average salaries for each category of professors.
			System.out.printf("\nTotal Salaries of Assistant Professors = $ %.2f", assistantSalary);
			System.out.printf("\nTotal Salaries of Associate Professors = $ %.2f", associateSalary);
			System.out.printf("\nTotal Salaries of Full-time Professors = $ %.2f\n\n", fullProfessorSalary);
			System.out.printf("\nAverage Salary for Assistant Professor = $ %.2f", assistantSalary / assistantCounter);
			System.out.printf("\nAverage Salary for Associate Professor = $ %.2f", associateSalary / associateCounter);
			System.out.printf("\nAverage Salary for Full-time Professor = $ %.2f\n", fullProfessorSalary / fullTimeCounter);
		}
		catch (IOException ex)
		{
			System.out.println(ex.getMessage());
		}
	}
}
