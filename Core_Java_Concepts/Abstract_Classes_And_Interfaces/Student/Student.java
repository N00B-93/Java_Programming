package Abstract_Classes_And_Interfaces.Student;

/**
 * The type Student.
 */
public class Student implements Comparable<Student>
{
    // Attributes of a Student.
    private String lastName;
    private int studentID;

    /**
     * Instantiates a new Student.
     * @param lastName The Student's last name.
     * @param studentID The Student's ID number.
     */
    public Student(String lastName, int studentID)
    {
        this.lastName = lastName;
        this.studentID = studentID;
    }

    /**
     * This returns the Student's last name.
     *
     * @return
     */
    public String getLastName()
    {
        return lastName;
    }

    /**
     * Sets the Student's last name to the given value.
     *
     * @param lastName The Student's last name.
     */
    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    /**
     * This returns the Student's ID number.
     *
     * @return The Student's ID number.
     */
    public int getStudentID()
    {
        return studentID;
    }

    /**
     * Sets the Student's ID number to the given value.
     *
     * @param studentID The Student's ID number.
     */
    public void setStudentID(int studentID)
    {
        this.studentID = studentID;
    }

    /**
     * Checks whether two Student Objects are equal based off their Student ID number.
     *
     * @param another The Student object to be compared. with the current instance.
     *
     * @return 1 if the current instance's ID is greater than the other, 0 if the two IDs are equal and -1 if the
     * other ID is greater than the current instance.
     */
    @Override
    public int compareTo(Student another)
    {
        if (this.lastName.compareTo(another.lastName) > 1)
            return 1;
        else if (this.lastName.compareTo(another.lastName) == 1)
            return 0;
        return -1;
    }
}
