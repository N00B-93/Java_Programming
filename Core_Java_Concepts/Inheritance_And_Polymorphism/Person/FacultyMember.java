package Inheritance_And_Polymorphism.Person;

import java.util.Date;

public class FacultyMember extends Employee
{
    // Attributes of a FacultyMember.
    public String rank, officeHours;
    
    /**
     * Instantiates a new FacultyMember.
     *
     * @param name The FacultyMember's name.
     * @param address The FacultyMember's address.
     * @param phoneNumber The FacultyMember's phone number.
     * @param emailAddress The FacultyMember's email address.
     * @param rank The FacultyMember's rank.
     * @param officeHours The FacultyMember's office hours.
     */
    public FacultyMember(String name, String address, String phoneNumber, String emailAddress, String office, double salary,
                         Date dateHired, String rank, String officeHours)
    {
        super(name, address, phoneNumber, emailAddress, office, salary, dateHired);
        this.rank = rank;
        this.officeHours = officeHours;
    }
    
    /**
     * This returns the FacultyMember's rank.
     *
     * @return The FacultyMember's rank.
     */
    public String getRank()
    {
        return this.rank;
    }
    
    /**
     * This returns the FacultyMember's office hours.
     *
     * @return The FacultyMember's office hours.
     */
    public String getOfficeHours()
    {
        return this.officeHours;
    }
    
    /**
     * This returns a String description of a FacultyMember.
     *
     * @return The String description of a FacultyMember.
     */
    public String toString()
    {
        return super.toString() + "\nRank: " + this.getRank() + "\n" + "Office Hours: " + this.getOfficeHours();
    }
}

