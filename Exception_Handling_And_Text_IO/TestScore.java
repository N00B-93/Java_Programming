package Exception_Handling_And_Text_IO;

import java.util.Scanner;

/*

 */

public class TestScore
{
    // An array of scores.
    private double[] scores;

    /**
     * Instantiates a new Test score Object.
     *
     * @param scores The scores
     */
    public TestScore(double[] scores)
    {
        this.scores = scores;
    }

    /**
     * This returns the TestScore Object's array of scores.
     *
     * @return An array of scores.
     */
    public double[] getScores()
    {
        return this.scores;
    }

    /**
     * This returns the average score of a TestScore Object.
     *
     * @return The average score.
     * @throws IllegalArgumentException The illegal access exception
     */
    public double getAverageScore() throws IllegalArgumentException
    {
        double totalScore = 0;

        for (int i = 0; i < this.scores.length; i++)
        {
            if (scores[i] < 0 || scores[i] > 100)
                throw new IllegalArgumentException("\nScore cannot be negative or greater than 100\nUse scores from 1 to 100 only.");
            totalScore += this.scores[i];
        }
        return totalScore / this.scores.length;
    }

    public static void main(String[] args)
    {
        // Creates a Scanner Object.
        Scanner keyBoard = new Scanner(System.in);

        // Creates an array of scores.
        double[] scores = new double[10];

        // Reads in 10 Scores from the user.
        for (int i = 0; i < 10; i++)
        {
            System.out.printf("\nEnter score[%d]: ", i + 1);
            scores[i] = keyBoard.nextDouble();
        }

        try
        {
            // Creates a TestScore Object.
            TestScore testScore = new TestScore(scores);

            // Displays the average of TestScores.
            System.out.printf("\nThe average score is: %.2f\n", testScore.getAverageScore());
        }
        catch (IllegalArgumentException ex)
        {
            System.out.println(ex.getMessage());
        }
    }

}
