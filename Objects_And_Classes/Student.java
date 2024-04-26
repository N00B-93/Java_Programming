package Objects_And_Classes;

import java.util.Scanner;

/*
	This is a program that creates the Object of a Student class, prompts the user to enter the name, roll number, and
	 scores of the student, then determines the average marks and grade of student and finally displays the
	 student's details.
 */

public class Student
{
	// Student class attributes.
	String fullName;
	int rollNo;
	double[] marks = new double[3];
	double averageScore;

	/**
	 * Returns the average of a given array of marks.
	 *
	 * @param marks The array containing the marks.
	 * @return The average mark.
	 */
	public static double average(double[] marks)
	{
		double sum = 0;

		for (int count = 0; count < marks.length; count++)
		{
			sum = sum + marks[count];
		}
		return sum / marks.length;
	}

	/**
	 * Returns the corresponding grade for a given score.
	 *
	 * @param score The score whose grade equivalent is required.
	 * @return The grade that represents the score.
	 */
	public static char grade(double score)
	{
		if (score >= 70 && score <= 100)
			return 'A';
		else if (score >= 60 && score <= 69)
			return 'B';
		else if (score >= 50 && score <= 59)
			return 'C';
		else if (score>= 45 && score <= 49)
			return 'D';
		else
			return 'F';
	}

	/**
	 * Displays the details of a Student Object.
	 *
	 * @param name The name
	 * @param rollNo The roll no
	 * @param studentAverage The student average
	 * @param studentGrade The student grade
	 */
	public static void getDetails(String name, int rollNo, double studentAverage, char studentGrade)
	{
		System.out.printf("\nStudent Name: %s\n\nRoll No: 0%d\n\nAverage Mark: %.2f percent\n\nGrade: '%c'\n\n", name,
				rollNo, studentAverage, studentGrade);
	}

	public static void main(String[] args)
	{
		// Creates a Scanner Object;
		Scanner input = new Scanner(System.in);

		// Creates a Student Object.
		Student student = new Student();

		// Reads in Student's name.
		System.out.print("\nEnter your name: ");
		student.fullName = input.nextLine();

		// Reads in Student's roll number.
		System.out.print("\nEnter your Roll No: ");
		student.rollNo = input.nextInt();

		// Reads in Student's scores.
		for (int count = 0; count < (student.marks).length; count++)
		{
			System.out.printf("\nEnter mark[%d]: ", count);
			student.marks[count] = input.nextDouble();
		}

		// Closes the Scanner.
		input.close();

		// Determines the student's grade.
		double studentAverage = average(student.marks);
		char studentGrade = grade(studentAverage);

		// Displays the Student's details.
		System.out.print("\n\t\tStudent's Details\n");
		Student.getDetails(student.fullName, student.rollNo, studentAverage, studentGrade);
	}
}
