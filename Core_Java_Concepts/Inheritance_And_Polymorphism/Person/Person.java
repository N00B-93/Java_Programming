package Inheritance_And_Polymorphism.Person;

public class Person
{
  // Attributes of a Person.
    protected String name;
    protected String address;
    protected String phoneNumber;
    protected String emailAddress;
    
    /**
     * Instantiates a new Person.
     *
     * @param name The Person's name.
     * @param address The Person's address.
     * @param phoneNumber The Person's phone number.
     * @param emailAddress The Person's email address.
     */
    public Person(String name, String address, String phoneNumber, String emailAddress)
    {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
    }
    
    /**
     * This returns a Person's name.
     *
     * @return A Person's name.
     */
    public String getName()
    {
        return this.name;
    }

    /**
     * This sets a Person's name to the specified value.
     *
     * @param name The Person's name.
     */
    public void setName(String name)
    {
        this.name = name;
    }

    /**
     * This returns a Person's address.
     *
     * @return A Person's address.
     */
    public String getAddress()
    {
        return this.address;
    }

    /**
     * This set's a Person's address to the specified value.
     *
     * @param address The Person's address.
     */
    public void setAddress(String address)
    {
        this.address = address;
    }

    /**
     * This returns a Person's phone number.
     *
     * @return A Person's phone Number.
     */
    public String getPhoneNumber()
    {
        return this.phoneNumber;
    }

    /**
     * This set's a Person's phone number to the specified value.
     *
     * @param phoneNumber The Person's phoneNumber.
     */
    public void setPhoneNumber(String phoneNumber)
    {
        this.phoneNumber = phoneNumber;
    }

    /**
     * This returns a Person's email address.
     *
     * @return A Person's email address.
     */
    public String getEmailAddress()
    {
        return this.emailAddress;
    }

    /**
     * This set's a Person's emailAddress to the specified value.
     *
     * @param emailAddress The Person's emailAddress.
     */
    public void setEmailAddress(String emailAddress)
    {
        this.emailAddress = emailAddress;
    }
    
    /**
     * This returns a String description of a Person.
     *
     * @return A String description of a Person.
     */
    @Override
    public String toString()
    {
        return "\nName: " + this.getName() + "\n" + "Address: " + this.getAddress() + "\n" + "Phone Number: " + this.getPhoneNumber()
          + "\n" + "Email: " + this.getEmailAddress();
    }
}

