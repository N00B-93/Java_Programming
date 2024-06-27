package Exception_Handling_And_Text_IO.Course;

/**
 * The type Course.
 */
public class Course
{
    // Attributes of a Course Object.
    protected String department;
    protected int courseNumber;
    protected double numberOfCredits;

    /**
     * Instantiates a new Course.
     *
     * @param department The department name.
     * @param courseNumber The course number.
     * @param numberOfCredits The number of credits.
     * @throws CourseException if the department does not consist of three letters, if the course
     * number does not consist of three digits between 100 and 499 inclusive, or if the
     * credits are less than 0.5 or more than 6
     */
    public Course(String department, int courseNumber, double numberOfCredits) throws CourseException
    {
        if (department.length() == 3 && (department.matches("[A-Z]+")))
            this.department = department;
        else
            throw new CourseException(department, courseNumber, numberOfCredits);
        if (courseNumber >= 100 && courseNumber <= 499)
            this.courseNumber = courseNumber;
        else
            throw new CourseException(department, courseNumber, numberOfCredits);
        if (numberOfCredits >= 0.5 && numberOfCredits <= 6)
            this.numberOfCredits = numberOfCredits;
        else
            throw new CourseException(department, courseNumber, numberOfCredits);
        System.out.printf("\n%s Course Created Successfully!\n", this.department + this.courseNumber);
    }
}
