package Abstract_Classes_And_Interfaces.ParkerUniversity;

public class InvalidStudentIDException extends Exception
{
    // StudentID attribute.
    private int studentID;

    /**
     * Instantiates a new InvalidStudentIDException with the given invalid student ID.
     *
     * @param studentID The invalid student ID.
     */
    public InvalidStudentIDException(int studentID)
    {
        this.studentID = studentID;
    }

    /**
     * This returns an error message indicating that the student ID is invalid.
     *
     * @return An error message indicating invalid student ID.
     */
    @Override
    public String getMessage()
    {
        return "\nInvalid Student ID: " + this.studentID + "\nStudent ID must be an integer fromm 100 to 999";
    }
}
