package Core_Java_Concepts.Loops;

import java.util.Scanner;

/*
    This is a program that prompts the user to enter the number
    of students and each student’s name and score, and finally displays the name
    of the student with the highest score.
 */

public class HighestScore
{
    public static void main(String[] args)
    {
        // Creates a Scanner Object.
        Scanner input = new Scanner(System.in);

        // Prompts the user to enter the number of students.
        System.out.printf("\nEnter the number of Students: ");
        int numberOfStudents = input.nextInt();

        // Initializes the highestScoreName variable with an empty string and the highestScore variable
        // with 0 score and the studentName with an empty string.
        String highestScoreName = "", studentName = "";
        double highestScore = 0.0;

        for (int i = 1; i <= numberOfStudents; i++)
        {
            // Prompts the user to enter his/her name and score.
            System.out.printf("\nEnter Student Name(e.g David): ");
            studentName = input.next();

            System.out.printf("\nEnter Score: ");
            double score = input.nextDouble();

            if (score > highestScore)
            {
                // Updates the highestScore and highestScoreName if the current score is greater than the highestScore.
                highestScore = score;
                highestScoreName = studentName;
            }
        }
        // Displays the student with the highest score.
        System.out.printf("\nThe Student with the highest score is: %s\n", highestScoreName);
    }
}
