package Abstract_Classes_And_Interfaces.ParkerUniversity;

public class GraduateStudent extends Student
{
    /**
     * Instantiates a new GraduateStudent Object with the given student name and student ID.
     *
     * @param studentName The student name
     * @param studentID The student ID.
     * @throws InvalidStudentIDException When the Student ID is not valid.
     */
    public GraduateStudent(String studentName, int studentID) throws InvalidStudentIDException
    {
        super (studentName, studentID);
        this.setTuition();
    }

    /**
     * Sets the Student's annual tuition to the given value.
     */
    @Override
    public void setTuition()
    {
        this.studentAnnualTuition = 6000.0;
    }

    /**
     * This returns the GraduateStudent's annual tuition.
     *
     * @return The GraduateStudent's annual tuition.
     */
    public double getTuition()
    {
        return this.studentAnnualTuition;
    }

    /**
     * This returns the GraduateStudent's ID.
     *
     * @return The GraduateStudent's ID.
     */
    public int getStudentID()
    {
        return this.studentID;
    }
}
