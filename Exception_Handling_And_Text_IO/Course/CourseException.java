package Exception_Handling_And_Text_IO.Course;

/**
 * The type Course exception.
 */
public class CourseException extends Exception
{
    // Attributes of a CourseException Object.
    protected String department;
    protected int courseNumber;
    protected double numberOfCredits;

    /**
     * Instantiates a new Course exception.
     *
     * @param department The department name.
     * @param courseNumber The course number.
     * @param numberOfCredits The number of credits.
     */
    public CourseException(String department, int courseNumber, double numberOfCredits)
    {
        this.department = department;
        this.courseNumber = courseNumber;
        this.numberOfCredits = numberOfCredits;
    }

    /**
     * Generates an appropriate error message depending on the department name, course number and number of credits.
     * @return Error message.
     */
    @Override
    public String getMessage()
    {
        if (this.department.length() != 3 && (!(this.department.matches("[A-Z]+"))))
            return "\nInvalid Department Name\nDepartment name should consist of three uppercase letters.";
        if (this.courseNumber < 100 || this.courseNumber > 499)
            return "\nInvalid Course Number\nCourse Number must be a three digit number >= 100 and <= 499";
        return "\nCredits must be >= 0.5 and <= 6.0";
    }

    /**
     * Checks if all the elements of a String are letters.
     *
     * @param string The String to be processed.
     * @return true if all the elements of a String are letters else, false.
     */
    /*public static boolean allLetters(String string)
    {
        for (int i = 0; i < string.length(); i++)
        {
            if (Character.isLetter(string.charAt(i)))
                continue;
            else
                return false;
        }
        return true;
    }*/
}
