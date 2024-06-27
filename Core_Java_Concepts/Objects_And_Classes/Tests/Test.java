package Objects_And_Classes.Tests;

class Test
{
    // Attributes of a Test Object.
    public String firstName, lastName;
    public double[] scores;
    public double averageScore;
    public char grade;

    /**
     * Instantiaties a new Test Object.
     * @param firstName The student's first name
     * @param lastName The student's last name.
     * @param scores An array containing the student scores.
     */
    public Test(String firstName, String lastName, double... scores)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.scores = scores;
    }

    /**
     * This calculates and returns the student's average score in the Test.
     * @return The student's average score in the Test.
     */
    public double getAverageScore()
    {
        double total = 00;

        for (double score: this.scores)
        {
            total += score;
        }

        this.averageScore = total / this.scores.length;

        return this.averageScore;
    }

    /**
     * This determines the student's grade based off the student's average score.
     * @return The student's grade.
     */
    public char getGrade()
    {
        if (this.getAverageScore() >= 90 && this.getAverageScore() <= 100)
            this.grade = 'A';
        else if (this.getAverageScore() >= 80 && this.getAverageScore() < 90)
            this.grade = 'B';
        else if (this.getAverageScore() >= 70 && this.getAverageScore() < 80)
            this.grade = 'C';
        else if (this.getAverageScore() >= 60 && this.getAverageScore() < 70)
            this.grade = 'D';
        else
            this.grade = 'F';
        return this.grade;
    }

    /**
     * This returns a String representation of a Test.
     * @return String representtation of a Test Object.
     */
    public String toString()
    {
        return "\n" + this.firstName + "\t\t" + this.lastName + "\t\t" + this.scores[0] + "\t" + this.scores[1] + "\t" + this.scores[2] + "\t" + this.scores[3] + "\t" + this.scores[4] + "\t" + this.getAverageScore() + "\t" + this.getGrade();
    }
}