package Inheritance_And_Polymorphism.Person;

import java.util.Date;

public class Employee extends Person
{
    // Attributes of an Employee.
    protected String office;
    protected double salary;
    protected Date dateHired;
    
    /**
     * Instantiates a new Employee. 
     *
     * @param name The Employee's name.
     * @param address The Employee's address.
     * @param phoneNumber The Employee's phone number.
     * @param emailAddress The Employee's email address.
     * @param office The Employee's office.
     * @param salary The Employee's salary. 
     */
    public Employee(String name, String address, String phoneNumber, String emailAddress, String office, double salary,
                    Date dateHired)
    {
        super(name, address, phoneNumber, emailAddress);
        this.office = office;
        this.salary = salary;
        this.dateHired = dateHired;
    }
    
    /**
     * This returns the office of an Employee.
     *
     * @return The office of an Employee.
     */
    public String getOffice()
    {
        return office;
    }
    
    /**
     * This sets the office of an Employee to the specified value.
     *
     * @param office The Employee's office.
     */
    public void setOffice(String office)
    {
        this.office = office;
    }
    
    /**
     * This returns the salary of an Employee.
     *
     * @return The salary of an Employee.
     */
    public double getSalary()
    {
        return salary;
    }
    
    /**
     * This sets the salary of an Employee to the specified value.
     *
     * @param salary The Employee's office.
     */
    public void setSalary(double salary)
    {
        this.salary = salary;
    }
    
    /**
     * This returns the date an Employee was hired.
     *
     * @return The date an Employee was hired.
     */
    public Date getDateHired()
    {
        return dateHired;
    }
    
    /**
     * This sets the date hired of an Employee to the specified value.
     *
     * @param dateHired The date the Employee was hired.
     */
    public void setDateHired(Date dateHired)
    {
        this.dateHired = dateHired;
    }
    
    /**
     * This returns a String describing an Employee.
     *
     * @return A String describing an Employee.
     */
    @Override
    public String toString()
    {
        return super.toString() + "\nOffice: " + this.getOffice() + "\n" + "Salary: $" + this.getSalary() + "\n" + "Date Hired: " + this.getDateHired();
    }
}

