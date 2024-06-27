package Inheritance_And_Polymorphism.Person;

import java.util.Date;

public class Staff extends Employee
{
    // Attribute of a Staff.
    protected String title;
    
    /**
     * Instantiates a new Staff .
     *
     * @param name The name of the Staff.
     * @param address The Staff's address.
     * @param phoneNumber The Staff's hone number.
     * @param emailAddress The Staff's email address.
     * @param title The Staff's title.
     */
    public Staff(String name, String address, String phoneNumber, String emailAddress, String office, String title,
                 double salary, Date dateHired)
    {
        super(name, address, phoneNumber, emailAddress, office, salary, dateHired);
        this.title = title;
    }
    
    /**
     * This returns the Staff's title.
     *
     * @return The Staff's title.
     */
    public String getTitle()
    {
        return this.title;
    }
    
    /**
     * This returns a String describing a Staff.
     *
     * @return String describing a Staff.
     */
    public String toString()
    {
        return super.toString() + "\nTitle: " + this.getTitle();
    }
}
