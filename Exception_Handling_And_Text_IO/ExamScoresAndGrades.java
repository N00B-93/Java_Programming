package Exception_Handling_And_Text_IO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ExamScoresAndGrades
{
    public static void main(String[] args)
    {
        File namesAndScoresFile = new File("NamesAndScores.txt");
        File namesAndScoresAndGrades = new File("namesScoresAndGrades");

        try (Scanner console = new Scanner(namesAndScoresFile);
        PrintWriter pWriter = new PrintWriter(namesAndScoresAndGrades.getName()))
        {
            if (!namesAndScoresFile.exists())
            {
                System.out.println("\nFile Containing Names and scores not found!!!");
                System.exit(1);
            }


            while (console.hasNext())
            {
                String[] line = console.nextLine().split(" ");

                double exam1Score = Double.parseDouble(line[2]);
                double exam2Score = Double.parseDouble(line[3]);
                double exam3Score = Double.parseDouble(line[4]);

                double totalScore = 0.25 * exam1Score + 0.3 * exam2Score + 0.45 * exam3Score;

                char grade = getGrade(totalScore);

                pWriter.println(line[0] + " " + line[1] + " " + exam1Score + " " + exam2Score + " " + exam3Score +
                        " " + totalScore + " " + grade);
            }
        }
        catch (FileNotFoundException ex)
        {
            System.out.println(ex.getMessage());
        }
    }

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
