package Abstract_Classes_And_Interfaces.ParkerUniversity;

/**
 * The type Student.
 */
public abstract class Student
{
    // Attributes of a Student Object.
    protected String studentName;
    protected int studentID;
    protected double studentAnnualTuition;

    /**
     * Instantiates a new Student Object with the given name and ID.
     *
     * @param studentName The Student's name.
     * @param studentID   The Student's ID.
     * @throws InvalidStudentIDException When the Student's ID is invalid.
     */
    public Student(String studentName, int studentID) throws InvalidStudentIDException
    {
        this.studentName = studentName;

        if (studentID < 100 || studentID > 999)
            throw new InvalidStudentIDException(studentID);
        else
            this.studentID = studentID;
    }

    /**
     * This returns the Student's name.
     *
     * @return The Student's name.
     */
    public String getStudentName() {
        return this.studentName;
    }

    /**
     * This returns the Student's ID.
     *
     * @return The Student ID.
     */
    public int getStudentID()
    {
        return this.studentID;
    }

    /**
     * Sets the Student's name to the given value.
     *
     * @param studentName The Student's name.
     */
    public void setStudentName(String studentName)
    {
        this.studentName = studentName;
    }

    /**
     * Sets the Student's ID to the given value.
     *
     * @param studentID The Student's ID.
     */
    public void setStudentID(int studentID)
    {
        this.studentID = studentID;
    }

    /**
     * Sets Student's tuition to the given value.
     */
    public abstract void setTuition();

    /**
     * This returns the Student's annual tuition.
     *
     * @return The Student's annual tuition.
     */
    public double getTuition()
    {
        return this.studentAnnualTuition;
    }
}
