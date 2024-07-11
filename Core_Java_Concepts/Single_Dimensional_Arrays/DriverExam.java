package Core_Java_Concepts.Single_Dimensional_Arrays;

import java.util.Scanner;

/*
    This is a program that prompts the user to enter the answers to the Drivers Examination MCQs and then
    displays the  number of questions answered correctly, number of questions answered wrongly and whether the
    user passed the exam or not.
 */

public class DriverExam
{
    // Array holding the correct answers.
    private char[] correctAnswers = {'B', 'D', 'A', 'A', 'C', 'A', 'B', 'A', 'C', 'D', 'B', 'C', 'D', 'A', 'D',
                            'C', 'C', 'B', 'D', 'A'};

    // Array holding the student's answers.
    private char[] answers;

    // Pass mark.
    public static final int PASS_MARK = 15;

    /**
     * Instantiates a new DriverExam Object with the given student's answers.
     *
     * @param answer The array of student's answers.
     */
    public DriverExam(char[] answer)
    {
        this.answers = answer;
    }

    /**
     * Gets the total number of correct answers.
     *
     * @return The number of correct answers.
     */
    public int totalCorrect()
    {
        int correct = 0;

        for (int i = 0; i < this.answers.length; i++)
        {
            if (this.answers[i] == this.correctAnswers[i])
                correct++;
        }
        return correct;
    }

    /**
     * This returns the total number of wrong answers.
     *
     * @return The number of wrong answers.
     */
    public int totalMissed()
    {
        return 20 - this.totalCorrect();
    }

    /**
     * This returns true if the number of correct answers is greater than 15, else false is returned.
     *
     * @return true if the number of correct answers is greater than 15, otherwise returns false.
     */
    public boolean passed()
    {
        return this.totalCorrect() >= PASS_MARK;
    }

    /**
     * This returns an array containing the number of the questions the student missed.
     *
     * @return An array containing the number of the questions the student missed.
     */
    public int[] questionsMissed()
    {
        int[] missedQuestions = new int[20 - totalCorrect()];

        for (int i = 0, j = 0; i < answers.length; i++)
        {
            if (!(this.correctAnswers[i] == this.answers[i]))
            {
                missedQuestions[j] = i + 1;
                j++;
            }
        }
        return missedQuestions;
    }

    public static void main(String[] args)
    {
        // Creates a Scanner Object.
        Scanner keyBoard = new Scanner(System.in);

        // Creates a char array to hold the student's exam options.
        char[] studentAnswers = new char[20];

        // Prompts the user to enter his/her Exam answers.
        System.out.printf("\nEnter your exam options(e.g., 'A' 'B') separated by space: ");
        for (int i = 0; i < studentAnswers.length; i++)
        {
            studentAnswers[i] = keyBoard.next().charAt(0);

            // Terminates the program if the user enters a non-alphabetic character, a non-uppercase character.
            if (!Character.isLetter(studentAnswers[i]) || !(Character.isUpperCase(studentAnswers[i])) || (studentAnswers[i] <
                    65 || studentAnswers[i] > 68))
            {
                System.out.println("\nUse uppercase alphabets from (A - D)!!!");
                System.exit(0);
            }
        }

        // Creates a DriverExam Object.
        DriverExam driverExam = new DriverExam(studentAnswers);

        // Displays the number of questions answered correctly, number of questions answered wrongly and whether the
        // student passed or failed.
        System.out.println("\n\t\tExam details:");
        System.out.printf("\nNumber of questions answered correctly: %d\n", driverExam.totalCorrect());
        System.out.printf("\nNumber of Questions answered wrongly: %d\n", driverExam.totalMissed());

        int[] questionsMissed = driverExam.questionsMissed();

        for (int j : questionsMissed)
            System.out.printf("\nQuestion %d\n", j);
        System.out.printf("\nStudent Passed? %b\n", driverExam.passed());
    }
}
