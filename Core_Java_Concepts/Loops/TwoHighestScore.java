package Core_Java_Concepts.Loops;

import java.util.Scanner;

/*
    This is a program that prompts the user to enter the
    number of students and each student’s name and score, and finally displays the
    student with the highest score and the student with the second-highest score.
 */

public class TwoHighestScore
{
    public static void main(String[] args)
    {
        // Creates a Scanner Object.
        Scanner input = new Scanner(System.in);

        // Reads in the number of students.
        System.out.printf("\nEnter the number of students: ");
        int numberOfStudents = input.nextInt();

        // Initializes two variables representing student with the highest score and student with the second-highest
        // score with empty strings.
        String studentWithHighestScore = "", studentWithSecondHighestScore = "";

        // Initializes the highestScore and secondHighestScore variables with o.
        int highestScore = 0, secondHighestScore = 0;

        for (int i = 1; i <= numberOfStudents; i++)
        {
            // Reads in the first score.
            System.out.printf("\nEnter student %d's score: ", i);
            int score = input.nextInt();

            // Reads in student's name.
            System.out.printf("\nEnter student %d's name(e.g., David): ", i);
            String studentName = input.next();

            //
            if (score > highestScore)
            {
                highestScore = score;
                studentWithHighestScore = studentName;
            }

            else if (score > secondHighestScore && score < highestScore)
            {
                secondHighestScore = score;
                studentWithSecondHighestScore = studentName;
            }
        }
        // Displays the students with the first and second-highest score.
        System.out.printf("\nThe Students with the first and second highest scores are:\n\t%s\n\t%s", studentWithHighestScore,
                studentWithSecondHighestScore);
    }
}
