package Abstract_Classes_And_Interfaces.ParkerUniversity;

public class UnderGraduateStudent extends Student
{
    /**
     * Instantiates a new UnderGraduateStudent Object with the given student name and student ID.
     *
     * @param studentName The student name
     * @param studentID The student ID.
     * @throws InvalidStudentIDException When the Student ID is not valid.
     */
    public UnderGraduateStudent(String studentName, int studentID) throws InvalidStudentIDException
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
        this.studentAnnualTuition = 4000.0;
    }

    /**
     * This returns the UnderStudent's annual tuition.
     *
     * @return The UnderStudent's annual tuition.
     */
    public double getTuition()
    {
        return this.studentAnnualTuition;
    }

    /**
     * This returns the UnderGraduateStudent's ID.
     *
     * @return The UnderGraduateStudent ID.
     */
    public int getStudentID()
    {
        return this.studentID;
    }
}
