package Abstract_Classes_And_Interfaces.ParkerUniversity;

public class StudentAtLarge extends Student
{
    /**
     * Instantiates a new StudentAtLarge Object with the given student name and student ID.
     *
     * @param studentName The student name
     * @param studentID The student ID.
     * @throws InvalidStudentIDException When the Student ID is not valid.
     */
    public StudentAtLarge(String studentName, int studentID) throws InvalidStudentIDException
    {
        super (studentName, studentID);
        this.setTuition();
    }

    /**
     * Sets the Student's annual tuition to the given value.
     * @param tuition The Student's annual tuition.
     */
    @Override
    public void setTuition()
    {
        this.studentAnnualTuition = 2000.0;
    }

    /**
     * This returns the StudentAtLarge's annual tuition.
     *
     * @return The StudentAtLarge's annual tuition.
     */
    public double getTuition()
    {
        return this.studentAnnualTuition;
    }

    /**
     * This returns the StudentAtLarge's ID.
     *
     * @return The StudentAtLarge's ID
     */
    public int getStudentID()
    {
        return this.studentID;
    }
}
