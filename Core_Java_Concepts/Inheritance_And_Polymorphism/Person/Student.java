package Inheritance_And_Polymorphism.Person;

public class Student extends Person
{
    // Attributes of a Student.
    protected ClassStatus status;
    
    /**
     * Instantiates a new Student.
     * @param name The Student's name.
     * @param address The Student's address.
     * @param phoneNumber The Student's phone number.
     * @param emailAddress The Student's email address.
     * @param status The Student's class status.
     */
    public Student(String name, String address, String phoneNumber, String emailAddress, ClassStatus status)
    {
        super(name, address, phoneNumber, emailAddress);
        this.status = status;
    }

   /**
    * This returns a Student's class status.
    *
    * @return A Student's class Status.
    */
    public ClassStatus getClassStatus()
    {
    return this.status;
    }

    /**
    * This sets a Student's class status to the specified value.
    *
    * @param status The Student's class status.
    */
    public void setClassStatus(ClassStatus status)
    {
        this.status = status;
    }

    /**
     * This returns a String describing a Student.
     *
     * @return A String describing a Student.
     */
    @Override
    public String toString()
    {
        return super.toString() + "\n" + "Class Status: " + this.getClassStatus();
    }
}

