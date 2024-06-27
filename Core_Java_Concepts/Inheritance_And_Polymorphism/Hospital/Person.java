package Inheritance_And_Polymorphism.Hospital;

/**
 * The Person type.
 */
public class Person
{
    protected String firstName;
    protected String lastName;

    // No-arg Constructor.
    public Person()
    {
        this.firstName = "";
        this.lastName = "";
    }

    /**
     * Instantiates a new Person Object.
     *
     * @param first The Person's first name.
     * @param last The Person's last name.
     */
    public Person(String first, String last)
    {
        this.setName(first, last);
    }

    /**
     * This returns a String description of a Person.
     *
     * @return String describing a Person.
     */
    public String toString()
    {
        return this.getFirstName() + " " + this.getLastName();
    }

    /**
     * This sets a Person's name to the given na,e provided.
     *
     * @param first The Person's first name.
     * @param last The Person's last name.
     */
    public void setName(String first, String last)
    {
        this.firstName = first;
        this.lastName = last;
    }

    /**
     * This returns the first name of a Person.
     *
     * @return The Person's first name.
     */
    public String getFirstName()
    {
        return this.firstName;
    }

    /**
     * This returns the Person's last name.
     *
     * @return The Person's last name.
     */
    public String getLastName()
    {
        return lastName;
    }
}
