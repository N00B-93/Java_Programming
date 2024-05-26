package Exception_Handling_And_Text_IO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
	This is a program that calculates grades for a course. The program prompts the user for the name 
	of a file that stores exam scores. Each line of the file has the following format:
		LastName:FirstName:Exam1:Exam2:Exam3
	The exams are to be weighted 25% for the first exam, 30% for the second exam, and 45% for the 
	third exam. Based on that, a final grade is to be assigned: A if the total is at least 90, B if
	it is at last 80, C if it is at least 70, D if it is at least 60, and F otherwise. The highest 
	grade based on the total points is always assigned. The program then outputs to the terminal a 
	list of students with the letter grade, as follows:
		LastName FirstName LetterGrade
	The program also output to a file, whose name is provided by the user, lines of the form
		LastName FirstName Exam1 Exam2 Exam3 TotalPoints LetterGrade.
*/

public class ExamScoresAndGrades
{
    public static void main(String[] args)
    {
	// Creates a Scanner Object to take input from the user.
	Scanner console1 = new Scanner(System.in);

	// Reads in a file name where the names and scores would be read from the user.
	System.out.print("\nEnter the path of a file containing names and scores: ");
	String inputFile = console1.nextLine();

	// Reads in a file name where the names and calculated grades of the students will be outputted to.
	System.out.print("\nEnter a file name where the student names and calculated grades will be stored: ");
	String outputFile = console1.nextLine();
	
	// Closes the console1
	console1.close();

	//Creates two file Objects; one input file and the output file where names, scores and grades will be written to.
        File namesAndScoresFile = new File(inputFile);
        File namesAndScoresAndGrades = new File(outputFile);
	// Informs the user that the output file already exists and will be overwritten.
	if (namesAndScoresAndGrades.exists())
	{
		System.out.printf("\nWARNING: '%s' already exists and will be overwritten, Try again with a new file name.\n", outputFile);
		System.exit(2);
	}

	// Creates a StringBuilder Object to hold student names and score to be displayed on the screen.
	StringBuilder namesAndGrades = new StringBuilder();
	
	// try with resoures block.
        try (Scanner console2 = new Scanner(namesAndScoresFile);
        PrintWriter pWriter = new PrintWriter(namesAndScoresAndGrades.getName()))
        {
	    // Displays an error message if the file name entered by the user doesn't exists and terminates the program.
            if (!namesAndScoresFile.exists())
            {
                System.out.printf("\n'%s' Containing Names and scores not found!!!", namesAndScoresFile.getName());
                System.exit(1);
            }

            while (console2.hasNext())
            {
		// Reads out a line of text from the input file and converts it to an array of Strings.
                String[] line = console2.nextLine().split(":");

		// Extracts 3 scores from the array of student data.
                double exam1Score = Double.parseDouble(line[2]);
                double exam2Score = Double.parseDouble(line[3]);
                double exam3Score = Double.parseDouble(line[4]);

		// Determines the total score of a student.
                double totalScore = 0.25 * exam1Score + 0.3 * exam2Score + 0.45 * exam3Score;
		
		// Determines the grade of a student.
                char grade = getGrade(totalScore);

		// Appends the student's names and grades to the StringBuilder.
		namesAndGrades.append("\n" + line[0] + " " + line[1] + " " + String.valueOf(grade));
		
		// Writes the student's names, scores, total score and grade to an output file.
                pWriter.printf("%s %s %.2f %.2f %.2f %.2f %c\n", line[0], line[1], exam1Score, exam2Score, exam3Score, totalScore, grade);
            }

	    System.out.printf("\nStudents names, scores, total scores and grades successfully written to '%s'\n", outputFile);
	    
	    // Display all students names and grades.
	    System.out.println("\n\t\tNames And Grades:");
	    System.out.println(namesAndGrades);
        }
        catch (FileNotFoundException ex)
        {
            System.out.println(ex.getMessage());
        }
	catch (Exception ex)
	{
		System.out.println(ex.getMessage());
	}
    }
    
    /**
     * This determines the grade of a specified score.
     *
     * @param score The score whose grade is to be determined.
     * @return The grade corresponding to a specified score.
     */
    public static char getGrade(double score)
    {
        if (score >= 90 && score <= 100)
            return 'A';
        else if (score >= 80 && score < 90)
            return 'B';
        else if (score >= 70 && score < 80)
            return 'C';
        else if (score >= 60 && score < 70)
            return 'D';

        return 'F';
    }
}
